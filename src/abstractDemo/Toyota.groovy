package abstractDemo

class Toyota extends Cars {
	int topSpeed
	@Override
	public Object topSpeed() {
		println "Top Speed is $topSpeed"
	}
	static void main(args) {
		Toyota car = new Toyota()
		car.carName = "Toyota Innova"
		car.color = "Black"
		car.model = 2019
		car.topSpeed = 120
		car.startEngine()
		car.topSpeed()
		
	}
}
