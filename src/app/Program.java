package app;

import vector.Vector;

public class Program {
public void run(){

    //first vector
    Vector v1= new Vector();
    v1.addCoordinate(2.0);
    v1.addCoordinate(9.0);
    v1.addCoordinate(12.0);
    v1.addCoordinate(18.0);
    v1.addCoordinate(24.0);


    //iterate using for each
    for(double v: v1){
        System.out.println(v);
    }
    System.out.println("----------");

    //second vector
    Vector v2= new Vector();
    v2.addCoordinate(4.0);
    v2.addCoordinate(2.0);
    v2.addCoordinate(6.0);
    v2.addCoordinate(10.0);

    //iterate using for each
    for(double v: v2){
        System.out.println(v);
    }

    //comparing with equals()
    boolean flag= v1.equals(v2);
    System.out.println("Are v1 and v2 equal? " + flag);

    //clone
    Vector v3 =v2.clone();
    System.out.println(v3);

    //add two vectors
    try {
        Vector v4 = v3.add(v1);
        System.out.println("Sum: " + v4);
    } catch (IllegalArgumentException e) {
        System.out.println("Cannot add vectors: " + e.getMessage());
    }

}
}
