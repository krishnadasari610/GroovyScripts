package com.test.demo

/*class FilesConcept {}
 * reading files*/
String filePath = "data1.txt"
File myFile = new File(filePath)
//reading entire content as String
/*println myFile.text
//collect lines into list
def list = myFile.collect { it }
println "list : $list"
//store file content in an Array
def array = myFile as String[]
println "array : $array"
//read file into a list of String
def lines = myFile.readLines()
println "Lines : $lines"
//read file line by line
myFile.each { line ->
	println "Line : $line"
}
def lineNumRange = 1..4
def lineList = [] 

//read file line by line with line number
myFile.eachLine { line, lineNo ->
	if(lineNumRange.contains(lineNo)) {
		lineList.add(line)
	}
	//println "$lineNo : $line"
}
println "Line List : $lineList"
//how to read with reader
def line
myFile.withReader { reader ->
	while((line =reader.readLine()) !=null) {
		println "line : $line"
	}
}*/
//reading with new reader

def outputFile = "data.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()
//when working with binary files ,read content as bytes
byte[] contents = myFile.bytes
println "Contents : $contents"

//size in bytes
println myFile.length()
//check if it is a file or directory
println myFile.isFile()
println myFile.isDirectory()
println "================================="
 //get the list of files from a dir
new File("C:/Users/gd/Desktop/bills").eachFile { file ->
	println "Absolute path :"+ file.getAbsolutePath()
}
//recursively display all files in a directory and its subdirectroy
println "================================="
new File("C:/Users/gd/Desktop/scripts for VDL").eachFileRecurse { 
	file -> println "Absolute path :"+ file.getAbsolutePath()
}
println "================================="
//copy file data to another file
def newFile = new File("data3.txt")
newFile << myFile.text

newFile.delete()
