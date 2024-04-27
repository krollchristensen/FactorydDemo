public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();

        Enemy myEnemy = factory.createEnemy("orc");
        myEnemy.attack();
        myEnemy.defend();

        Enemy anotherEnemy = factory.createEnemy("troll");
        anotherEnemy.attack();
        anotherEnemy.defend();
    }
}