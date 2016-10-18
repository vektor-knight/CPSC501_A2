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
}
