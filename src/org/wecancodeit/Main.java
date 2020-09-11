package org.wecancodeit;

public class Main {


    static Cat annoyingCat = new Cat("Annoying", "Blue", 4, 9);

    public static void main(String[] args) {

        annoyingCatGreeting();

        Cat playfulCat = new Cat("Playful", "Black/White", 1, 6);
        playfulCat.greeting();

        Cat sleepyCat = new Cat("Sleepy", "Grey", 14, 9);
        sleepyCat.greeting();
    }

    public static void annoyingCatGreeting() {
        annoyingCat.greeting();
    }

}
