public class Hero {
    private int heroesHealth;
    private int damage;
    private String superPower;

    public int getHealth() {
        return heroesHealth;
    }

    public int getDamage() {
        return damage;
    }
    public String getSuperPower() {
        return superPower;
    }
    public Hero(int theHealth, int theDamage, String theSuperPower) {
        this.heroesHealth = theHealth;
        this.damage = theDamage;
        this.superPower = theSuperPower;
    }
    public Hero(int theHealth, int theDamage) {
        this.heroesHealth = theHealth;
        this.damage = theDamage;
    }




}
