package io.github.james1freedictionary.project.java.CarRepairShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Grouping {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            
            people.add("_ Person " + i);
        }
        System.out.println("===Here the result of Random(20)group===");
        Collections.shuffle(people);
        
        Random rand = new Random();
        int minGroupSize = 4;
        int maxGroupSize = 5;
        
        int startIndex = 0;
        while (startIndex < people.size()) {
            int groupSize = rand.nextInt((maxGroupSize - minGroupSize) + 1) + minGroupSize;
            if (startIndex + groupSize > people.size()) {
                groupSize = people.size() - startIndex;
            }
        
            System.out.println("+GROUP MEMBER " + (startIndex / minGroupSize + 1) + ":");
            for (int j = startIndex; j < startIndex + groupSize; j++) {
                System.out.println(people.get(j));
            }
            System.out.println();
            startIndex += groupSize;
        }
    }
}