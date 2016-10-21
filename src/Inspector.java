/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshunda
 */

import java.util.*;
import java.lang.reflect.*;

public class Inspector {
    public Inspector() {        
    }
    
    public void inspect(Object obj, boolean recursive) {
        // Before refactoring: these are polymorphic objects, 
        // so an automatic "move method" could not be applied.
        Class underInspection = obj.getClass(); 
        Class superClass = underInspection.getSuperclass(); 
    }
    
    // The assignment will constitute sets of methods which correspond to the
    // requirements. For example, we are asked to get "the name of the declaring
    // class." Rather than throwing a bunch of conditionals into the "inspect()"
    // method, I will instead wrap around functions from the reflect library
    // into smaller methods, and then add them to the "inspect()" method.
    
    // Another approach to this problem is to take the following pieces:
        // * Name of the declaring class [getDeclaringClass()]
        // * Name of the immediate superclass [getSuperClass()]
        // And create conditions for them within "inspect()"
        // since they have direct method calls from the reflect library.
    
    // Get the names of the interfaces (note: PLURAL!) the class implements
    public void interfaceNames(Object obj, Class classObj) {
        Class[] inf = classObj.getInterfaces();
        if (inf.length > 0) { // interfaces were found
            for (Class inf1 : inf) {
                System.out.println("The name of the class's interfaces are: " + inf1.getName());
            }
        }
    }
    
    /**
     * Gets the method names, exceptions, parameter types, return types, and modifiers
     * of one class.
     * How do you test void methods with side effects?
     * @param obj
     * @param classObj 
     */
    public void methodData(Object obj, Class classObj) {
        // Get the methods
        Method[] methods = classObj.getDeclaredMethods();
        System.out.println("The methods of this class are: " + Arrays.toString(methods));
        if (methods.length >= 1 ) { // If methods exist for a class object
            for (Method method : methods) {
                System.out.println("The parameter type(s) of this method: " + Arrays.toString(method.getParameterTypes()));
                System.out.println("The exception type(s) of this method: " + Arrays.toString(method.getExceptionTypes()));
                System.out.println("The return type(s) of this method: " + method.getReturnType());
                System.out.println("The modifier(s) of this method: " + Modifier.toString(method.getModifiers()));
            }
        } else {
            System.out.println("Methods not found");
        }
    }
}

/**
 * create methods for each thing i am returning, and return a String type
 */
