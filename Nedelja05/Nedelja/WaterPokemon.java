package pokemoni;

public class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, int health) {
        super(name, "Water pokemon", health);
    }

    @Override
    public String attack() {
        return "Attack: Water";
    }

    @Override
    public String defend() {
        return "Defend: Water";
    }

    @Override
    public String wins() {
        return "Wins: Fire type";
    }

    @Override
    public String losesFrom() {
        return "Loses from: Grass type";
    }

    @Override
    public String logAll() {
        return "Pokemon: " + getName() + "\n" + attack() + "\n" + defend() + "\n" + wins() + "\n" + losesFrom();
    }
}
