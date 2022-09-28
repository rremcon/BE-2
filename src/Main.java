public class Main {
    public static void main(String[] args) {
        System.out.println("Running..");

        FirePokemon firePokemon = new FirePokemon("fire-type", "Charmander", 7, 140, "big", 2.5);
        WaterPokemon waterPokemon = new WaterPokemon("water-type", "Blastoise", 9, 120, 4, 3.8);
        ElectricPokemon electricPokemon = new ElectricPokemon("electric-type", "Raichu", 8, 110, "orange", 7);
        GrassPokemon grassPokemon = new GrassPokemon("grass-type", "Bulbasaur", 8, 90, "strong", 2);


        firePokemon.attack();
        System.out.println("Spit " + firePokemon.getFireSpitLength() + " meters of fire!");
        System.out.println("Use " + firePokemon.getFireTailType() + " tail!");
        firePokemon.flameThrower();
        firePokemon.pyroBall();
        firePokemon.reload();

        System.out.println("----------------------------------------------------");

        System.out.println(waterPokemon.getName() + " dive " + waterPokemon.getDivingDepth() + " meters deep.");
        System.out.println("Save waterShootingPower of " + waterPokemon.getWaterShootingPower() + " psi.");
        waterPokemon.attack();
        waterPokemon.reload();
        waterPokemon.surf();
        waterPokemon.hydroPump();
        waterPokemon.hydroCanon();

        System.out.println("----------------------------------------------------");

        electricPokemon.reload();
        System.out.println("The " + electricPokemon.getType() + " is upgraded to level " + electricPokemon.getLevel() + ".");
        System.out.println(electricPokemon.getName() + " with lightningBulbColor " + electricPokemon.getLightningBulbColor() + " and glowingEarsLevel " + electricPokemon.getGlowingEarsLevel() + " has " + electricPokemon.getHp() + " Hp now.");
        electricPokemon.attack();
        electricPokemon.thunderPunch();
        electricPokemon.solarBeam();
        electricPokemon.electroBall();

        System.out.println("----------------------------------------------------");

        grassPokemon.attack();
        grassPokemon.leafStorm();
        System.out.println("Jump " + grassPokemon.getJumpHeight() + " meters high and use bladeCanonType " + grassPokemon.getBladeCanonType() + "!");
        grassPokemon.flowerPower();
        System.out.println("This " + grassPokemon.getType() + " from level " + grassPokemon.getLevel() + " has " + grassPokemon.getHp() + " Hp now.");

        System.out.println("----------------------------------------------------");


    }
}
