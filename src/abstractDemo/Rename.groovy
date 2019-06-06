package abstractDemo

def dirName = "C:\\Users\\gd\\Desktop\\sample_volume_files_100"

new File(dirName).eachFile() { file ->
	def newName = file.getName()[5..-1]
	File renamedFile = new File(dirName + "/" + newName)
	file.renameTo(renamedFile)

	println file.getName() + " -> " + renamedFile.getName()
}