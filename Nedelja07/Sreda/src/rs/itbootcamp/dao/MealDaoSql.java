package rs.itbootcamp.dao;

import rs.itbootcamp.databaseConnection.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MealDaoSql implements MealDao{
    private static final Connection c = DatabaseConnection.getConnection();

    @Override
    public void insert(MealModel mm) {
        try {
            PreparedStatement st = c.prepareStatement("INSERT INTO meal VALUES(?, ?, ?, ?)");
            st.setInt(1, mm.getMealId());
            st.setString(2, mm.getMealName());
            st.setString(3, mm.getMealDesc());
            st.setString(4, mm.getMealDifficulty());
            st.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = c.prepareStatement("DELETE FROM meal WHERE meal_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(MealModel mm) {
        try {
            PreparedStatement st = c.prepareStatement("UPDATE meal SET  meal_name = ? , meal_desc = ? , meal_difficulty = ? WHERE meal_id = ?" );
            st.setString(1, mm.getMealName());
            st.setString(2, mm.getMealDesc());
            st.setString(3, mm.getMealDifficulty());
            st.setInt(4, mm.getMealId());
            st.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public MealModel getMeal(int id) {
        MealModel returnMeal = null;
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal WHERE meal_id = " + id);
            while(rs.next()){
                returnMeal = new MealModel(rs.getInt("meal_id"), rs.getString("meal_name"), rs.getString("meal_desc"),rs.getString("meal_difficulty") );
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return returnMeal;
    }

    @Override
    public List<MealModel> getAllMeals() {
        List<MealModel>  allMeal = new ArrayList<>();
        Statement st = null;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal");
            while (rs.next()){
                allMeal.add(new MealModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return allMeal;
    }

    @Override
    public List<String> getFoodMealNames(int meal_id) { //listu imena hrane za taj meal_id
        List<String> returnList = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT food_name\n" +
                    "FROM food f\n" +
                    "INNER JOIN mealfood mf ON f.food_id = mf.food_id\n" +
                    "INNER JOIN meal m ON mf.meal_id = m.meal_id\n" +
                    "WHERE m.meal_id = " + meal_id + ";");
            while (rs.next()){
                returnList.add(rs.getString(1));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return returnList;
    }

    @Override
    public List<FoodModel> getFoodMeal(int meal_id) { //svu hranu za taj meal_id
        List<FoodModel> returnList = new ArrayList<>();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT f.food_id, f.food_name, f.food_kcal, f.food_proteins, f.food_carbs, f.food_fat\n" +
                    "FROM food f\n" +
                    "INNER JOIN mealfood mf ON f.food_id = mf.food_id\n" +
                    "INNER JOIN meal m ON mf.meal_id = m.meal_id\n" +
                    "WHERE m.meal_id = " + meal_id + ";");
            while (rs.next()){
                returnList.add(new FoodModel (rs.getInt(1),rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return returnList;
    }

}
