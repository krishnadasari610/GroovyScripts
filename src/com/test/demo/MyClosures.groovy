package com.test.demo

/*class MyClosures {}*/
def str = "Hello"
def myName = "Krishna"
def myClosure = { name -> println "$str $name"}

myClosure.call(myName)

def myMethod(clos) {
	clos.call("Groovy")
}

myMethod(myClosure)

def myClosure1 = { a,b,c,d ->
	return (a+b+c+d)
}
def res = myClosure1(20,30,10,40)
println "Result is ${res}"

def myList = ["apple", "grapes", "apple", "oranges"]
println myList.each { it }


def map = [
	'subject' : 'Groovy',
	'topic' : 'closures'
]

println map.each { it }
def myList1 = [1,2,3,4,5,6]
println myList1.find { item -> item == 8}
println myList1.findAll { item -> item > 3 }
println myList1.any{item -> item > 3}
println myList1.every { item -> item > 3 }
println myList1.collect { item -> item*2 }
