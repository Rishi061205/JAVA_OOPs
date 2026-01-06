package src;

public class Main {
    public static void main(String args[]) {
        Member father = new Member();
        Family Doe = new Family();

        father.origin = "USA";
        father.name = "John";
        father.age = 40;
        father.hello();
        father.originIs();
        father.bye();

        Doe.hello();
        Doe.origin = "Canada";
        Doe.count();
        // Doe.bye();
    }
}
