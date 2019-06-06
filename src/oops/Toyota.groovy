package oops

class Toyota extends Cars {
	int topSpeed
	def topSpeed() {
		println "Top speed is $topSpeed " 
	}
	static void main(args) {
		Toyota car1 = new Toyota()
		car1.carName = "Toyota"
		car1.color = "White"
		car1.model = 2019
		
		car1.topSpeed = 120
		car1.startEngine()
		car1.stopEngine()
		car1.accelarate()
		car1.topSpeed()
	}
}
