package efs.task.oop;

public class Monsters {


    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            if (getHealth() > 0) {
                this.setHealth(this.getHealth() - damage);
                setMonstersHealth(getMonstersHealth() - damage);
            }
        }
    };

    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            if (this.getHealth() > 0) {
                this.setHealth(this.getHealth() - damage);
                setMonstersHealth(getMonstersHealth() - (damage + 5));
            }
        }
    };
    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static Monster getAliveMonster() {
        if (andariel.getHealth() > 0)
            return andariel;
        else if (blacksmith.getHealth() > 0)
            return blacksmith;
        else
            return null;
    }

    private static int getMonstersHealth() {
        return monstersHealth;
    }

    private static void setMonstersHealth(int monstersHealth) {
        Monsters.monstersHealth = monstersHealth;
    }


}
