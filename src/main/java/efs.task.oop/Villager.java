package efs.task.oop;

public class Villager implements Fighter {
    private String name;
    private int age;
    private int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }


    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        if (this.health > 0)
            this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
