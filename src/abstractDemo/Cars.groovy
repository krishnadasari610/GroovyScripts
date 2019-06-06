package abstractDemo

abstract class Cars {
	String carName
	String color
	int model
	
	def startEngine() {
		println "Start the engine of $carName"
	}
	abstract def topSpeed();
		

}
