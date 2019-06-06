package com.test.demo

/*class Methods {}*/
/*def printHello() {
 println "Hello"
 }
 printHello()*/
//method 1
/*def sum(int aa=10,int bb=30) {
 println "sum of ${aa} and ${bb} is = "+ (aa+bb)
 }
 sum()
 //method 2
 def sum1(int a,int b) {
 println "sum of ${a} and ${b} is = "+ (a+b)
 }
 sum(10,20)*/

def sum(int a,int b) {
	def c = a-b
	return c
}
def result = sum(20,10)
println "Result is ${result}"