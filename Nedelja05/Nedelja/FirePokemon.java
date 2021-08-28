package pokemoni;

public class FirePokemon extends Pokemon{
    public FirePokemon(String name,int health) {
        super(name,"Fire pokemon", health);
    }

    @Override
    public String attack() {
        return "Attack: Fire";
    }

    @Override
    public String defend() {
        return "Defend: Physically";
    }

    @Override
    public String wins() {
        return "Wins: Grass type";
    }

    @Override
    public String losesFrom() {
        return "Loses from: Watter type";
    }

    @Override
    public String logAll() {
        return "Pokemon: " + getName() + "\n"  + attack() + "\n" + defend() + "\n" + wins() + "\n" + losesFrom();
    }

}
