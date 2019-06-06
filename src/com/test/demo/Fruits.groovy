package com.test.demo

class Fruits {

	private String fruiteName
	private String fruiteColor
	def setFruiteName(String name) {
		fruiteName = name
	}
	def setFruiteColor(String color) {
		fruiteColor = color
	}
	def getFruiteName() {
		println "Name of the Fruite is $fruiteName"
	}
	def getFruiteColor() {
		println "color of the fruite is $fruiteColor"
	}
	static void main(args) {
		Fruits fruites = new Fruits()
		fruites.setFruiteName("apple")
		fruites.setFruiteColor("red")
		fruites.getFruiteName()
		fruites.getFruiteColor()
	}
}
