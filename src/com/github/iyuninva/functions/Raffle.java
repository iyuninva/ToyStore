package com.github.iyuninva.functions;

import com.github.iyuninva.io.FileToys;
import com.github.iyuninva.toys.data.ToysList;
import com.github.iyuninva.toys.data.WinToysList;
import com.github.iyuninva.view.ViewUser;

public class Raffle {

    public void startRaffle() {
        if (ToysList.listSize() > 0) {
            int numberWin = RandomDrop.randomWin();
            System.out.println("Your win Toys: " + ToysList.getToys(numberWin).getName() + "!!!");
            ToysList.toysList.get(numberWin).setCount(ToysList.toysList.get(numberWin).getCount() - 1);
            WinToysList.addToList(ToysList.getToys(numberWin));
            FileToys.fileWin(numberWin);
            if (ToysList.toysList.get(numberWin).getCount() == 0) {
                ToysList.deleteToys(numberWin);
            }
            ViewUser.startProject();
        } else {
            System.out.println("Игрушки закончились, вы все выйграли!");
        }
        ViewUser.startProject();

    }

}
