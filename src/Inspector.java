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
     * 
     * @param m
     * @return 
     */
    public String getParamTypes(Method m) {
        Class[] params = m.getParameterTypes();
        String result = null;
        if (params.length == 0) return null;
        else {
            for (Class param : params) {
                result += param.getSimpleName() + " ";
            }
        }
        return result;
    }
    
    /**
     * 
     * @param m
     * @return 
     */
    public String getExceptions(Method m) {
        Class[] excepts = m.getExceptionTypes();
        String result = null;
        if (excepts.length == 0) return null;
        else {
            for (Class except : excepts) {
                result += except.getSimpleName() + " ";
            }
            return result;
        }
    }
    
    /**
     * 
     * @param m
     * @return 
     */
    public Class<?> getReturnTypes(Method m) {
        return m.getReturnType();
    }
    
    public String getModifiers(Method m) {
        return Modifier.toString(m.getModifiers());
    }
}

/**
 * create methods for each thing i am returning, and return a String type
 */
