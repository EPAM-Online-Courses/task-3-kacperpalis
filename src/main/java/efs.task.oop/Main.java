package efs.task.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //zad1
        List<Villager> villagers = new ArrayList<>();
        villagers.add(new Villager("Kashya", 30));
        villagers.add(new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER));
        villagers.add(new Villager("Gheed", 50));
        villagers.add(new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY));
        villagers.add(new Villager("Warriv", 35));
        villagers.add(new Villager("Flawia", 25));
        villagers.forEach(Villager::sayHello);

        Object objectDecardCain = villagers.get(3);
        Object objectAkara = villagers.get(1);
        int position = 0;
        while (Monsters.monstersHealth > 0) {
            Monster monster = Monsters.getAliveMonster();
            if (monster == null)
                break;
            Villager villager = villagers.get(position);
            villager.attack(monster);
            monster.attack(villager);
            if (Monsters.monstersHealth <= 0)
                break;

            if (position == villagers.size() - 1)
                position = 0;
            else position++;
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
            System.out.println("Aktualnie walczacy osadnik to " + villager.getName());

        }
        System.out.println("Obozowisko ocalone!");
        Villager deckardCain = (ExtraordinaryVillager) objectDecardCain;
        Villager akara = (ExtraordinaryVillager) objectAkara;
        deckardCain.sayHello();
        akara.sayHello();
    }
}
