public class ElectricPokemon extends SuperPokemon {
    private String lightningBulbColor;
    private int glowingEarsLevel;

    public String getLightningBulbColor() {
        return lightningBulbColor;
    }

    public void setLightningBulbColor(String lightningBulbColor) {
        this.lightningBulbColor = lightningBulbColor;
    }

    public int getGlowingEarsLevel() {
        return glowingEarsLevel;
    }

    public void setGlowingEarsLevel(int glowingEarsLevel) {
        this.glowingEarsLevel = glowingEarsLevel;
    }

    public ElectricPokemon(String type, String name, int level, int hp, String lightningBulbColor, int glowingEarsLevel) {
        super(type, name, level, hp);
        this.lightningBulbColor = lightningBulbColor;
        this.glowingEarsLevel = glowingEarsLevel;
    }

    public void solarBeam() {
        System.out.println("Get solarBeam!");
    }

    public void electroBall() {
        System.out.println("Throw electroBall!");
    }

    public void thunderPunch() {
        System.out.println("Give extra thunderPunch!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Start thunder!!");
    }

    @Override
    public void reload() {
        System.out.println("The " + getType() + " is reloading fast..");
    }

}
