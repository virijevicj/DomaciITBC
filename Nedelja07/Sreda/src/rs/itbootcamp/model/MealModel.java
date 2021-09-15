package rs.itbootcamp.model;

public class MealModel {
    private int mealId;
    private String mealName;
    private String mealDesc;
    private String mealDifficulty;

    public MealModel(int mealId, String mealName, String mealDesc, String mealDifficulty) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.mealDesc = mealDesc;
        this.mealDifficulty = mealDifficulty;
    }
    public MealModel(){};

    public int getMealId() {
        return mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public String getMealDifficulty() {
        return mealDifficulty;
    }
}
