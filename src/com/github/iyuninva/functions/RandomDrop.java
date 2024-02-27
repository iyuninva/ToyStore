package com.github.iyuninva.functions;

import java.util.Random;

import com.github.iyuninva.toys.data.ToysList;

public class RandomDrop {

    public static int randomDrop() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }

    public static int randomWin() {
        Random random = new Random();
        int randomWinNumber = random.nextInt(ToysList.listSize());
        return randomWinNumber;
    }

}
