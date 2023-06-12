package SOLID.s;

/**
 * SaveToDatabase
 */
public class SaveToDatabase {


    public String tableName;

    SaveToDatabase(String model) {
        this.tableName = validateModel(model);
    }

    public void save() throws Exception {
        // code to save the details to the database
    }

    public String validateModel(String model){
        // check if the model is valid
        // return database table name if valid
        return model;
    }
}