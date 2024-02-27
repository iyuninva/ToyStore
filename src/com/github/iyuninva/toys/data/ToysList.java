package com.github.iyuninva.toys.data;

import java.util.ArrayList;

import com.github.iyuninva.view.ViewUser;

public class ToysList {

    public static ArrayList<Toys> toysList = new ArrayList<>();

    public static void addToList(Toys toys) {
        toysList.add(toys);
    }

    public static int listSize() {
        return toysList.size();
    }

    public static Toys getToys(int i) {
        return toysList.get(i);
    }

    public static void deleteToys(int i) {
        toysList.remove(i);
    }

    public static void getList() {
        for (int i = 0; i < toysList.size(); i++) {
            System.out.println(toysList.get(i).toString());
        }
        ViewUser.startProject();

    }

}
