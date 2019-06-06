package oops

class Car {
	String carName
	int carModel
	String carColor
	
	def carDetails() {
		println "You have $carName,$carModel,$carColor colored "
	}
	def startEngine() {
		println "Start the engine for $carName"
	}
	

	//static void main(args) {
		/*Car toyota = new Car()
		Car benz = new Car()
		Car bmw = new Car()
		
		toyota.carName = "Innova"
		toyota.carColor = "Brown"
		toyota.carModel = 2019
		println "============================"
		benz.carName = "Benz C Class"
		benz.carColor = "White"
		benz.carModel = 2019
		
		bmw.carName = "BMW X6"
		bmw.carColor = "Black"
		bmw.carModel = 2019
				
		println "============================"
		toyota.carDetails()
		toyota.startEngine()
		println "============================"
		bmw.startEngine()
		bmw.carDetails()
		println "============================"
		benz.startEngine()
		benz.carDetails()
		*/
	//}
}
