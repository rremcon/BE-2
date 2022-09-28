public class FirePokemon extends SuperPokemon {
    private String fireTailType;
    private double fireSpitLength;

    public String getFireTailType() {
        return fireTailType;
    }

    public void setFireTailType(String fireTailType) {
        this.fireTailType = fireTailType;
    }

    public double getFireSpitLength() {
        return fireSpitLength;
    }

    public void setFireSpitLength(double fireSpitLength) {
        this.fireSpitLength = fireSpitLength;
    }

    public FirePokemon(String type, String name, int level, int hp, String fireTailType, double fireSpitLength) {
        super(type, name, level, hp);
        this.fireTailType = fireTailType;
        this.fireSpitLength = fireSpitLength;
    }

    public void flameThrower() {
        System.out.println("Use flameThrower now!");
    }

    public void pyroBall() {
        System.out.println("Throw pyroBall high!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Start fireBlast!!");
    }

    @Override
    public void reload() {
        System.out.println("The " + getType() + " is reloading slow..");
    }

}
