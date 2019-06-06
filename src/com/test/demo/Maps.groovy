package com.test.demo

/*class Maps {}
 * [key : value]
 * ['book':'Groovy script']
 * [:] - empty map*/

def employee = [
	 'name':'krishna',
	 'id':120,
	 'age':34
	 ]

println employee
println employee.name
println employee.id
println employee['name']
println employee.get('age')
println employee.getAt('id')
println employee.size()
//add employees to map
employee.put('mailId','krishna@gmail.com')
println employee
println employee.containsKey('age')
println employee.containsValue('krishna')
println employee.getClass()
println "===================="
//clone map
def emp = employee.clone()
println emp
println "===================="
employee.each { key,value ->
	println "$key : $value"
}
println "===================="
employee.eachWithIndex { key,value, i ->
	println "$i | $key : $value"
}
println "===================="
employee.eachWithIndex { entry,i->
	println "$i| $entry.key : $entry.value"
}
println "===================="
def map = ['a':1,'b':2]
def entries = map.entrySet()
entries.each{entry ->
	assert entry.key in ['a','b']
	assert entry.value in [1,2]
}

employee.clear()
println employee
