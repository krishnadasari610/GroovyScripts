package com.test.demo

/*class Ranges {}
 * creates a list of sequential values
 * defined first and last value of the sequence
 * 1..10
 * 'a'..'z'
 * 10..1
 * 2 types -> inclusive and exclusive*/
def range = 1..10

println range
println range.size()
println range.getFrom()
println range.getTo()
assert range.from ==1
assert range.to ==10
println range.get(4)
println range[3]
println range.contains(7)
println range.isReverse()
println range.empty
def rag = range.subList(4, 8)
println rag.getFrom()
println rag.getTo()
//iteration on range
for (i in range) {
	println i
	}
	(1..10).each { i ->
		println "value = $i"
	}
println "========================"
println range instanceof java.util.List