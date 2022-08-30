public class Main {
    public static void main(String[] args) {

        DatabaseManeger manager =new DatabaseManeger();

        manager.AddDatabase(new PostgresqlDatabase());

        manager.AddDatabase(new MongoDbDatabase());

        manager.DeleteDatabase(new OracleDatabase());



    }
}
