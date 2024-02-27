package com.github.iyuninva;

import com.github.iyuninva.toys.AddNewToys;
import com.github.iyuninva.toys.data.Toys;
import com.github.iyuninva.toys.data.ToysList;
import com.github.iyuninva.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        
        AddNewToys addNewToys = new AddNewToys();
        // Для примера добавим изначально первую партию игрушек;
        Toys toys1 = new Toys(addNewToys.newId(), "Bear", 1, addNewToys.newRandomChance());
        ToysList.addToList(toys1);
        Toys toys2 = new Toys(addNewToys.newId(), "Mouse", 1, addNewToys.newRandomChance());
        ToysList.addToList(toys2);
        Toys toys3 = new Toys(addNewToys.newId(), "Mini Car", 2, addNewToys.newRandomChance());
        ToysList.addToList(toys3);

        ViewUser.logoProject();    
    }
}