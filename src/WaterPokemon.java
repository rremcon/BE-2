public class WaterPokemon extends SuperPokemon {
    private int divingDepth;
    private double waterShootingPower;

    public int getDivingDepth() {
        return divingDepth;
    }

    public void setDivingDepth(int divingDepth) {
        this.divingDepth = divingDepth;
    }

    public double getWaterShootingPower() {
        return waterShootingPower;
    }

    public void setWaterShootingPower(double waterShootingPower) {
        this.waterShootingPower = waterShootingPower;
    }

    public WaterPokemon(String type, String name, int level, int hp, int divingDepth, double waterShootingPower) {
        super(type, name, level, hp);
        this.divingDepth = divingDepth;
        this.waterShootingPower = waterShootingPower;
    }

    public void surf() {
        System.out.println("Run to surfboard!");
    }

    public void hydroPump() {
        System.out.println("Reload faster with hydroPump..");
    }

    public void hydroCanon() {
        System.out.println("hydroCanon ready!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Start waterShooting!!");
    }

    @Override
    public void reload() {
        System.out.println("The " + getType() + " is reloading slow..");
    }

}
