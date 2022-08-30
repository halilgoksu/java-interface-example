
//OracleDatabase Class must use all methods in IDatabase

public class OracleDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("OracleDatabase add");

    }

    @Override
    public void delete() {
        System.out.println("OracleDatabase delete");


    }

    @Override
    public void get() {
        System.out.println("OracleDatabase get");


    }

    @Override
    public void update() {
        System.out.println("OracleDatabase update");


    }
}
