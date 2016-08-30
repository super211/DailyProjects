package sg.com.java.interv.eye7_crossbridge;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Eric
 */

public class CrossBridge {

	/**
	 * @param personSpeeds
	 *            每个人过桥所需时间的一个列表
	 */
	public void crossBridge(List<Integer> personSpeeds) {
		if (null == personSpeeds || 0 == personSpeeds.size()) {
			throw new IllegalArgumentException("至少有一个人需要过桥，请保证参数至少有一个元素。");
		} else if (!isSpeedParameterLeagal(personSpeeds)) {
			throw new IllegalArgumentException("请纠正过桥时间，每个人的过桥时间不能小于等于零。");
		} else if (1 == personSpeeds.size()) {
			// 只有一个人过桥,那么直接输出过桥过桥时间
			System.out.printf("%d -> Go \n", personSpeeds.get(0));
			System.out.printf("最少过桥耗时 %s 秒！\n", personSpeeds.get(0));
		} else if (2 == personSpeeds.size()) {
			// 只有两个人过桥,那么直接输出过桥过桥时间
			System.out.printf("%d %d -> Go \n", personSpeeds.get(0),
					personSpeeds.get(1));
			System.out.printf("最少过桥耗时 %d 秒！\n", personSpeeds.get(0)
					+ personSpeeds.get(0));
		} else {
			// 处理多个人过桥的场景

			// 为了获取过桥时间的最大最小值，首先对personSpeeds排序
			Collections.sort(personSpeeds);

			doBridgeCross(personSpeeds);
		}

	}

	private void doBridgeCross(List<Integer> personSpeeds) {
		List<Integer> source = new ArrayList<Integer>();
		source.addAll(personSpeeds);
		List<Integer> destination = new ArrayList<Integer>();
		int totalCrossBridgeTime = 0;
		boolean secondFastestOnDest = false;

		while (!source.isEmpty()) {
			int srcFastest = source.get(0);
			int srcSecondFastest = source.get(1);

			if (2 == source.size()) {
				totalCrossBridgeTime += populateBridgeCrossingTime(source,
						destination, srcFastest, srcSecondFastest, false);
			} else {
				// 处理多余两个人过桥的情况

				if (secondFastestOnDest) {
					// 计算出最慢的两个
					int srcSlowest = source.get(source.size() - 1);
					int srcSecondSlowest = source.get(source.size() - 2);
					if (destination.get(0) * 2 < srcFastest + srcSecondSlowest) {
						secondFastestOnDest = false;
						totalCrossBridgeTime += populateBridgeCrossingTime(
								source, destination, srcSecondSlowest,
								srcSlowest, true);
					} else {
						totalCrossBridgeTime += populateBridgeCrossingTime(
								source, destination, srcFastest, srcSlowest,
								true);
					}
				} else {
					// 最快的两个人过去
					secondFastestOnDest = true;
					totalCrossBridgeTime += populateBridgeCrossingTime(source,
							destination, srcFastest, srcSecondFastest, true);
				}

			}
		}

		// 输出花费的时间
		System.out.printf("最少过桥耗时 %d 秒！\n", totalCrossBridgeTime);
	}

	/**
	 * 计算过桥的时间，如果需要拿灯回来，则需要将回来的时间也算上。
	 */
	private int populateBridgeCrossingTime(List<Integer> source,
			List<Integer> destination, int fastOne, int slowOne,
			boolean needReturnLight) {
		int sp1 = source.remove(source.indexOf(fastOne));
		int sp2 = source.remove(source.indexOf(slowOne));
		destination.add(sp1);
		destination.add(sp2);
		System.out.printf("%d %d --> Go \n", sp1, sp2);
		// 耗时多的那个
		int elapsedTime = sp2;

		if (needReturnLight) {
			Collections.sort(destination);
			// 拿灯返回
			sp1 = destination.remove(0);
			source.add(sp1);
			Collections.sort(source);
			elapsedTime += sp1;
			// sb.append(sp1).append("\n");
			System.out.printf("%d <-- Back \n", sp1);
		}

		return elapsedTime;
	}

	/**
	 * 保证每个人过桥的时间都大于0
	 */

	private boolean isSpeedParameterLeagal(List<Integer> personSpeeds) {
		/*
		 * 每个人的过桥时间都必须大于0
		 */
		for (int i : personSpeeds) {
			if (i <= 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		CrossBridge cb = new CrossBridge();
		System.out
				.println("Example 1 -> \n四人夜间过桥，他们只有一个手电筒一次只能两个人过桥，过桥时必须有手电筒，四人过桥时间为1分2分6分10分\n");
		List<Integer> personSpeeds1 = Arrays.asList(1, 2, 6, 10);
		cb.crossBridge(personSpeeds1);
		System.out
				.println("\nExample 2 -> \n小明过桥要一秒，小明的弟弟要三秒，小明的爸爸要六秒，小明的妈妈要八秒，小明的爷爷要十二秒。\n每次此桥最多可过两人，而过桥的速度，依过桥最慢者而定，可是灯在点燃后， 三十秒就会熄灭。\n 那么，请问小明一家，如何在三十秒内过桥？");
		List<Integer> personSpeeds2 = Arrays.asList(1, 3, 6, 8, 12);
		cb.crossBridge(personSpeeds2);
	}
}