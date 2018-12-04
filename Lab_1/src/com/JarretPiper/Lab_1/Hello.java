package com.JarretPiper.Lab_1;

//********************************************
//Hello.java
//
//Print a Hello, World message.
//********************************************
public class Hello
{
	// -----------------------------------
	// main method -- prints the greeting
	// -----------------------------------
	public static void main(String[] args)
	{
		System.out.println("Hello, World!");
	}
}

/*
 * Error: Could not find or load main class com.JarretPiper.Lab_1.Hello
 * Caused by: java.lang.ClassNotFoundException: com.JarretPiper.Lab_1.Hello
 */

/* There is no message because the string is still a valid string.
 * The output has changed to Helo, World!
 */

/* Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * String literal is not properly closed by a double-quote
 * at com.JarretPiper.Lab_1.Hello.main(Hello.java:15)
 */ 

/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
Hello cannot be resolved to a variable
Syntax error on token ",", delete this token
Syntax error, insert ")" to complete MethodInvocation
Syntax error, insert ";" to complete BlockStatements

at com.JarretPiper.Lab_1.Hello.main(Hello.java:15)
*/

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Syntax error, insert ";" to complete BlockStatements

at com.JarretPiper.Lab_1.Hello.main(Hello.java:15)
*/