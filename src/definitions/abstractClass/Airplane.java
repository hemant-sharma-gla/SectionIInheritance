/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 3:15 PM
 *  File Name : Airplane.java
 * */
package definitions.abstractClass;

public abstract class Airplane {
    // 1. Simple methods, with their bodies

    public void display() {
        System.out.println("Airplane class.");
    }

    // 2. Abstract method, without their bodies

    public abstract void fly();
}

class Jet extends Airplane {
    @Override
    public void fly() {
        System.out.println("Jet is flying...");
    }
    // Since the Airplane class is an abstract class,
    // it is necessary of every child class of the Airplane class to
    // implement (override) all the abstract methods in the Airplane class.
}
