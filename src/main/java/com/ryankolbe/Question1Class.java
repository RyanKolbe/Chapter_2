package com.ryankolbe;

import java.util.*;

public class Question1Class {

    public static void main(String[] args) {
        //Create member objects from Question1Model class to populate data structures.
        Question1Model member1 = new Question1Model("Orchestra", "Organist", 2);
        Question1Model member2 = new Question1Model("Minister", "Priest", 6);
        Question1Model member3 = new Question1Model("Member", "Religious Instruction Teacher", 2);
        Question1Model member4 = new Question1Model("Minister", "Deacon", 4);

        //Create List and populate with member objects
        List<Question1Model> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);
        memberList.add(member4);
        System.out.println("Printing List data structure.");
        System.out.println(memberList);
        System.out.println();

        System.out.println("Printing sorted List data structure.");
        Collections.sort(memberList);
        System.out.println(memberList);
        System.out.println();

        //Create Set and populate with objects from List data structure memberList
        Set<Question1Model> memberSet = new HashSet<>(memberList);
        System.out.println("Printing Set data structure.");
        System.out.print(memberSet);
        System.out.println();

        System.out.println();
        //Create Map and populate with objects from List data structure memberSet
        Map<String, Question1Model> memberMap = new HashMap<>();
        for (int x = 1; x < memberList.size(); x++) {
            memberMap.put(String.valueOf(x), memberList.get(x));
        }

        System.out.println("Printing Map data structure.");
        System.out.print(memberMap);
        System.out.println();

    }
}
