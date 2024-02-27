package com.github.iyuninva.toys.data;

import java.util.ArrayList;

import com.github.iyuninva.view.ViewUser;

public class WinToysList {

    public static ArrayList<Toys> winToysList = new ArrayList<>();

    public static void addToList(Toys toys) {
        winToysList.add(toys);
    }

    public static Toys getToys(int i) {
        return winToysList.get(i);
    }

    public static void deleteToys(int i) {
        winToysList.remove(i);
    }

    public static void getList() {
        for (int i = 0; i < winToysList.size(); i++) {
            System.out.println("\nYour win toys: " + winToysList.get(i).getName());
        }
        ViewUser.startProject();
    }
}