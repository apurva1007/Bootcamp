class Chair extends Furniture {
	int hands;
	int legs;

	Chair() {
		this.material = "Wood";
	}
	
	void display() {
		/*System.out.println(this.hands);
		System.out.println(this.legs);
		System.out.println(this.material);
		System.out.println(this.id);*/
		super.display();
	}
}
