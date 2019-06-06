package com.test.demo

/*class Variables {

	static void main(args) {
		def name  = "krishna"
		println name
	}
}*/

def name = "krishna"
println name
println 'Name is ' + name
println "Name is ${name}"
println "Name is $name"

def (a,b,c)=[10,20,30]
println a
println b
println c
//assign the data type
def (String aa,int bb,Double cc,float dd) = [70,40,60,50]
println aa
println bb
println cc
println dd

//remove the value 
def (String ab,int bc,Double cd) = [70,40,60,70]
println ab
println bc
println cd

/*String name1 = "Rama"
println name1

pen = "pencil"
println pen*/