class Circle {
	void paint(float brushSize) {
		System.out.println("Painting using brush");
	}

	void paint(int numberOfFingers) {
		System.out.println("Painting using hand");
	}

}

class Draw {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.paint(0.01F);
		circle1.paint(10);
	}
}

