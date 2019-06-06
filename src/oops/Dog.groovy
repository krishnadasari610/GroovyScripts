package oops

class Dog extends Animal {
	String dogName
	def plays() {
		println "$dogName like to play"
	}
	def eats() {
		println "$dogName likes to eats"
	}
}
