
import static java.awt.PageAttributes.MediaType.A;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshunda
 */

// Adapted from http://stackoverflow.com/questions/13597269/testing-how-to-create-mock-object
// to create a mock object for reflective unit testing purposes.
public class MyClass {

    private static class A {

        public A() {
        }
    }
    
    public interface AFactory {
        public A create(int x, int y);
}
    private final AFactory aFactory;

    public MyClass(AFactory aFactory) {
        this.aFactory = aFactory;
    }

    public void doSomething() {
        A a = aFactory.create(100, 101);
        // do something with the A ...
    }
}
