/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshunda
 */
public class Main {
    public static void main(String[] args) {
        Inspector testInspector = new Inspector();
        Object obj = new ClassA();
        Class<?> testClass = obj.getClass();
        
        testInspector.methodNames(obj, testClass);
        
    }
}
