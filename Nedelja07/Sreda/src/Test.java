import rs.itbootcamp.dao.MealDaoSql;
import rs.itbootcamp.model.MealModel;

public class Test {
    public static void main(String[] args) {
       MealDaoSql mealDaoSql = new MealDaoSql();
//        MealModel mealModel = new MealModel(1, "przenice", "dorucak", "1");
//        mealDaoSql.insert(mealModel); //dodate przenice u tabelu
//
//        MealModel mealModel1 = new MealModel(2, "jaja na oko", "dorucak","1");
//        mealDaoSql.insert(mealModel1);//dodato u tabelu; potrebno zakomentarisati mealModel jer postoji vec u tabeli
       // mealDaoSql.delete(2);//brisemo jaja na oko iz tabele
        //mealDaoSql.update(new MealModel(1, "przenice", "dorucak", "2")); //promenjen id na 2


    }
}
