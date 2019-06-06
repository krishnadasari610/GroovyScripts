package com.test.demo

/*class List {}
 * integer list [1,2,3,4]
 * String list ["groovy","automation","Scritping"]
 * list in side the list [1,2,3,4,["A","B"],5] -nested list
 * heterogeneous list [1,2,"A","B",2.2]
 * empty list []
*/

def fruits = ["Apple","Oranges","Grapes","Bananas"]

println fruits[1]
println fruits[3]
println fruits.get(3)

def list = [1,2,3,4,["A","B","C","D"],5]
println list[2]
println list[4][1]
println list.get(4).get(2)
println list[4..2]
println list.get(4).contains("B")
println list.size()
println list.add(30)
println list.add(33)
list<<44
list = list+[50,60]
println list
list.remove(6)
println list

