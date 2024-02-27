package com.github.iyuninva.toys;

import com.github.iyuninva.functions.RandomDrop;
import com.github.iyuninva.toys.data.Toys;
import com.github.iyuninva.toys.data.ToysList;
import com.github.iyuninva.view.Input;
import com.github.iyuninva.view.ViewUser;

public class AddNewToys {
    Toys toys;

    public void newToysChanceRandom() {
        toys = new Toys(newId(), newName(), newCount(), newRandomChance());
        ToysList.addToList(toys);
        ViewUser.startProject();
    }

    public void newToys() {
        toys = new Toys(newId(), newName(), newCount(), newChance());
        ToysList.addToList(toys);
        ViewUser.startProject();
    }

    public int newId() {
        int id = ToysList.listSize();
        return id + 1;
    }

    public String newName() {
        System.out.print("Введите название новой игрушки: ");
        String name = Input.inputText();
        return name;
    }

    public int newCount() {
        System.out.print("Введите колличество игрушек: ");
        int count = Input.inputInt();
        return count;
    }

    public int newRandomChance() {
        int chance = RandomDrop.randomDrop();
        return chance;
    }

    public int newChance() {
        System.out.print("Введите шанс выпадения игрушки: ");
        int chance = Input.inputInt();;
        return chance;
    }



}
