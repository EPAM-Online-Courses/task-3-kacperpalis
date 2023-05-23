package efs.task.oop;

public class ExtraordinaryVillager extends Villager{
    public enum Skill{
        IDENTIFY  ("I will identify items for you at no charge.")
        ,SHELTER("I can offer you poor shelter.");

        public final String label;

        Skill(String label){
            this.label = label;
        }
    }


    Skill skill;
    public ExtraordinaryVillager(String name, int age,Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    @Override
    public void takeHit(int damage) {
        if(getHealth()>0)
            setHealth(0);
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + this.getName() + " and I'm " + this.getAge() + " years old. " + skill.label);
    }
}
