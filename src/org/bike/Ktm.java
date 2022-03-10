package org.bike;

public class Ktm implements Bike {
public void speed() {
System.out.println("Speed is 143KM");
}
public void cost() {
System.out.println("Price is 3.5L");
}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.speed();
	k.cost();
}
}

