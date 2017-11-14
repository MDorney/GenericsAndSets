/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author L117student
 */
public class Lab4 {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 1);
        Dog dog2 = new Dog("Champ", 1);
        Dog dog3 = new Dog("Buster", 2);
        Dog dog4 = new Dog("Lassie", 3);

        Set<Dog> dogsSet = new HashSet<>();

        dogsSet.add(dog1);
        dogsSet.add(dog2);
        dogsSet.add(dog3);
        dogsSet.add(dog4);
        
        System.out.println("Size of set: " + dogsSet.size());
        
        List<Dog> dogsList = new ArrayList<>(dogsSet);
        
        for (Dog d : dogsList) {
            System.out.println(d);
        }
    }



    
}
