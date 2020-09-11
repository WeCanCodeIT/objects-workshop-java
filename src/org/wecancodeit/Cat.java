package org.wecancodeit;

public class Cat {
    private String name;

    private String furColor;

    private int age;

    private int lives;

    public Cat(String name, String furColor, int age, int lives) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.lives = lives;
    }

    public void greeting(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I have " + furColor + " fur.");
        System.out.println("I am "+ age + " years old.");
        System.out.println("I have " + lives + " left to give.");
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public int getLives() {
        return lives;
    }
}
