package org.example.ConstructorInjection;

public class Addition {
    public int a;
    public int b;


    public Addition(){

    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Addition = "+(a+b)+"";
    }
}
