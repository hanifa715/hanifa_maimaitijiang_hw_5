import java.awt.*;

public class Boss {
    private   int bossHealth;
    private int bossDamage;
    private String defence;

    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }
    public String getDefence() {
        return defence;
    }
    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }
    public void setDefence(String defence) {
        this.defence = defence;
    }
}
