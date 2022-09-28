public class GrassPokemon extends SuperPokemon{
    private String bladeCanonType;
    private int jumpHeight;

    public String getBladeCanonType() {
        return bladeCanonType;
    }

    public void setBladeCanonType(String bladeCanonType) {
        this.bladeCanonType = bladeCanonType;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public GrassPokemon(String type, String name, int level, int hp, String bladeCanonType, int jumpHeight) {
        super(type, name, level, hp);
        this.bladeCanonType = bladeCanonType;
        this.jumpHeight = jumpHeight;
    }

    public void leafStorm() {
        System.out.println("Activate leafStorm tornado!");
    }

    public void flowerPower() {
        System.out.println("Get energy from flower.. ");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Start grassRoll!!");
    }

    @Override
    public void reload() {
        System.out.println("The " + getType() + " is reloading fast..");
    }

}
