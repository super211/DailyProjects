/*
The main difference between checked and unchecked exception is that the checked exceptions are checked at compile-time 
while unchecked exceptions are checked at runtime.
 
Here are the few other Checked Exceptions ¨C

SQLException
IOException
DataAccessException
ClassNotFoundException
InvocationTargetException
 */

package sg.com.java.jinjie.exception;

import java.io.*;

class CheckedExceptionTest {
	public static void main(String args[]) {
		FileInputStream fis = null;
		/*
		 * This constructor FileInputStream(File filename) throws
		 * FileNotFoundException which is a checked exception
		 */
		fis = new FileInputStream("B:/myfile.txt");
		int k;

		/*
		 * Method read() of FileInputStream class also throws a checked
		 * exception: IOException
		 */
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}

		/*
		 * The method close() closes the file input stream It throws IOException
		 */
		fis.close();
	}
}