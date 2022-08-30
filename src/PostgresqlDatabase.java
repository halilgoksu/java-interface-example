
//Postgresql Class must use all methods in IDatabase

public class PostgresqlDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("Postgresql add");

    }

    @Override
    public void delete() {
        System.out.println("Postgresql delete");


    }

    @Override
    public void get() {
        System.out.println("Postgresql get");


    }

    @Override
    public void update() {
        System.out.println("Postgresql update");


    }
}
