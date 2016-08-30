package sg.com.java.flextrade.codereview.copy;

public class Order

{

	private double dPrice;

	private int iSize;

	private String sSymbol;

	public double getPrice() {
		return dPrice;
	}

	public void setPrice(double price) {
		dPrice = price;
	}

	public int getSize() {
		return iSize;
	}

	public void setSize(int size) {
		iSize = size;
	}

	public String getSymbol() {
		return sSymbol;

	}

	public void setSymbol(String symbol) {
		sSymbol = symbol;
	}

	public int toNumber(String Input) {
		
		boolean canBeConverted = false;
		int n = 0;
		try
		{
			n = Integer.parseInt(Input);
			canBeConverted = true;
		}

		catch (Exception ex)
		{

		}

		if (canBeConverted == true) {
			return n;
		} else {
			return 0;
		}
	}
}
