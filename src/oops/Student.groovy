package oops

class Student {
	
	String name
	int sub1Marks
	int sub2Marks
	def printTotal() {
		println "$name has total marks  = "+(sub1Marks+sub2Marks)
	}

	static void main(args) {
		Student std = new Student()
		std.name = "krishna"
		std.sub1Marks = 60
		std.sub2Marks = 80
		std.printTotal()
		
		println "===================="
		Student std1 = new Student()
		std1.name = "Rama"
		std1.sub1Marks = 66
		std1.sub2Marks = 86
		std1.printTotal()
		
		
	}
}
