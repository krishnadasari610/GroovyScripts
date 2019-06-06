package com.test.demo

//for

/*for(int i=0;i<=5;i++) {
 println "Value of ${i}"
 }
 println "++++++++++++++++++++"
 for(def i=0;i<=5;i++) {
 println "Value of ${i}"
 }
 println "====================="
 //for in
 for(j in 1..5) {
 println "Value of ${j}"
 }
 */
//keywords in groovy upto and times
/*1.upto(4) { println "$it"  }
 println "====================="
 5.times {  println "$it"  }
 println "====================="
 1.step(20,3) {println "$it"   }*/
println "====================="
for (int i in [0, 1, 2, 3, 4, 5, 6, 7]) {
	println "Value is ${i}"
}
println "====================="
//iterate over the map
def map = ["name":"Groovy","subject":"Automation","Author":"Raghava"]
for(e in map) {

	println "key value pair is ${e}"
	/*print e.key+":"
	println e.value*/
}
println "====================="
int k=1;
while(k<5) {
	println "value of k is ${k}"
	k++;
	
}
