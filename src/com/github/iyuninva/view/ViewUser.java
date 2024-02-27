package com.github.iyuninva.view;

import com.github.iyuninva.functions.Raffle;
import com.github.iyuninva.toys.AddNewToys;
import com.github.iyuninva.toys.data.ToysList;
import com.github.iyuninva.toys.data.WinToysList;

public class ViewUser {

    public static void logoProject() {
        System.out.println("--- Welcome ---");
        startProject();
    }

    public static void startProject() {
        infoProject();
        int number = Input.inputInt();
        switch (number) {
            case 1:
                AddNewToys addNewToysRandomChance = new AddNewToys();
                addNewToysRandomChance.newToysChanceRandom();
                break;
            case 2:
                AddNewToys addNewToys = new AddNewToys();
                addNewToys.newToys();
                break;
            case 3:
                Raffle raffle = new Raffle();
                raffle.startRaffle();
                break;
            case 4:
                ToysList.getList();
                break;
            case 5:
                WinToysList.getList();
                break;
            case 6:
                System.out.println("--- Programm in exit ---");
                break;
            default:
                startProject();
        }

    }

    public static void infoProject() {
        System.out.println("\n1. Add toys random chance\n2. Add toys your chance\n3. Raffle Toys\n4. List toys\n5. Win list toys\n6. Exit programm");
        System.out.print("Enter to commands: ");
    }

}
