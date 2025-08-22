package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vector implements Cloneable ,Iterable<Double>{


    //list storing cords
    private List<Double> cords= new ArrayList<>();


    // default constructor (empty vector)
    public Vector() {}

    // constructor to create vector with n dimensions initialized to 0
    public Vector(int n) {
        for (int i = 0; i < n; i++) {
            cords.add(0.0);
        }
    }


    public void addCoordinate(Double n){
        cords.add(n);
    }


    //getting whole list of cords
    public List<Double> getCords() {
        return cords;
    }



    // get coordinate at index i
    public double getInstance(int i) {
        return cords.get(i);
    }

    //set cords at i
    public void setInstance(int i , double val){
        cords.set(i,val);
    }

    //get length of cords
    public int length(){
        return cords.size();
    }

    public Vector add(Vector other){
        if(this.length()==(other.length())){
            Vector vecSum= new Vector(this.length());
            for (int i = 0; i < this.length(); i++) {
                double sum = this.getInstance(i) + other.getInstance(i);
                vecSum.setInstance(i,sum);
            }
            return vecSum;
        }
        throw new IllegalArgumentException("Vectors must have same dimension"); //just to inform user exception
    }


    @Override
    public boolean equals(Object obj) {
        // 1. If both are the same object in memory
        if (this == obj) {
            return true;
        }

        // 2. If obj is not a Vector → return false
        if (!(obj instanceof Vector)) {
            return false;
        }

        // 3. Now safely cast obj to Vector and compare cords
        Vector other = (Vector) obj;
        return this.cords.equals(other.cords);
    }

    @Override
    public String toString() {
        return cords.toString();
    }

    @Override
    public Vector clone(){
        Vector copy= new Vector(this.cords.size());
        for (int i = 0; i < this.cords.size(); i++) {
            copy.setInstance(i, this.getInstance(i));
        }
        return copy;
    }

    @Override
    public Iterator<Double> iterator() {
        return cords.iterator(); //it will iterate automatically just we have to give the name
    }
}

