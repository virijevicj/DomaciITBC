package pokemoni;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int health) {
        super(name, "Grass pokemon", health);
    }

    @Override
    public String attack() {
        return "Attack: Grass";
    }

    @Override
    public String defend() {
        return "Defend: Avoids";
    }

    @Override
    public String wins() {
        return "Wins: Water type";
    }

    @Override
    public String losesFrom() {
        return "Loses from: Fire type";
    }

    @Override
    public String logAll() {
        return "Pokemon: " + getName() + "\n" + attack() + "\n" + defend() + "\n" + wins() + "\n" + losesFrom();
    }

}
