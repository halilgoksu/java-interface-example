
//MongoDb Class must use all methods in IDatabase

public class MongoDbDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("MongoDb add");

    }

    @Override
    public void delete() {
        System.out.println("MongoDb delete");


    }

    @Override
    public void get() {
        System.out.println("MongoDb get");


    }

    @Override
    public void update() {
        System.out.println("MongoDb update");


    }
}
