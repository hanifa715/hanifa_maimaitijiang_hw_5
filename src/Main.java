public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setDefence("Medic");
        System.out.println("Boss Health: " + boss.getBossHealth() + " Boss Damage: " + boss.getBossDamage()
                + " Boss Defence: " + boss.getDefence());


        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Heroes Health: " + hero.getHealth() + " Heroes Damage: " + hero.getDamage()
            + " Heroes Super Power: " + hero.getSuperPower());
        }
        }
        public static Hero[] createHeroes(){
            Hero medic = new Hero(200,20,"rescue");
            Hero magical = new Hero(300,30,"chaos magic");
            Hero physical = new Hero(400,40);
            Hero[] heroes = {medic, magical, physical};
            return heroes;

        }

    }