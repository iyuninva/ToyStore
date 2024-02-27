package com.github.iyuninva.toys.data;

public class Toys {

    private int id;
    private String name;
    private int count;
    private int chance;

    public Toys(int id, String name, int count, int chance) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.chance = chance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return String.format("\nid: %s \nName: '%s' \nCount: %s pcs \nChance: %s %%", id, name, count, chance);
    }

}
