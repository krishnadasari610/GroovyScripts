package com.test.demo

/*class ExceptionHandling {}*/
try {
	int i=1/0
}catch(ArithmeticException aExp) {
	println "catch block for Arithmetic Exceptions"
}catch(Exception exp) {
	println "I am inside the Exception block"
	println exp.getCause()
	println exp.getMessage()
	//println exp.printStackTrace()
}finally {
	println "I am inside the finally block"
}
println "Another set of methods"