package org.example;
import  java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> players = new ArrayList<>();

        players.add(0, "Bryant");
        players.add("Wade");
        players.add("Pavan");
        players.add("Reddy");
        players.add("Kohli");
        players.add("Kumar");
        players.set(0,"Raja");
        players.remove(1);
        System.out.println(players.size());
        ArrayList <String> slicedArray=new ArrayList<>(players.subList(2,players.size()));
        System.out.println(slicedArray);
        System.out.println(players);
    }
}