package com.test.demo

/*class FileWriteConcept {}*/
File newFile = new File("sample.txt")

newFile.write("Hello this is sample for file write operation")
newFile << "\nthis is line 2"
//newFile.text="\nthis is line 3"

newFile.withWriter { writer ->
	writer.writeLine("this is line 4")
}
newFile.append("this is line 5")

println newFile.text
println newFile.length()