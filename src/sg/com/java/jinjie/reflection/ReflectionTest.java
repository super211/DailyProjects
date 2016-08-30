package sg.com.java.jinjie.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionTest {
	
	public static Class<?>[] getListInterfaces(){
		Class<List> listClass = java.util.List.class;
		return listClass.getInterfaces();
	}
	
	public static Constructor<?>[] getArrayListConstructors(){
		Class<ArrayList> listClass = java.util.ArrayList.class;
		return listClass.getConstructors();
	}
	
	public static Field[] getArrayListDeclaredFields(){
		Class<ArrayList> listClass = java.util.ArrayList.class;
		return listClass.getDeclaredFields();
	}
	
	public static Method[] getListDeclaredMethods(){
		Class<List> listClass = java.util.List.class;
		return listClass.getDeclaredMethods();
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ReflectionTest.getListInterfaces()));
		System.out.println(Arrays.toString(ReflectionTest.getArrayListConstructors()));
		System.out.println(Arrays.toString(ReflectionTest.getArrayListDeclaredFields()));
		System.out.println(Arrays.toString(ReflectionTest.getListDeclaredMethods()));
	}

}
