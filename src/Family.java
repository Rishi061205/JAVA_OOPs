package src;

public class Family {
    private int memCount;
    String origin;

    public void hello() {
        System.out.println("Family says hi!");
    }

    public void count() {
        System.out.println("Family has " + this.memCount + "members. ");
    }
}

class Member extends Family {
    String name;
    int age;

    public void originIs() {
        System.out.println("Member's origin is " + this.origin);
    }

    public void bye() {
        System.out.println("Member says bye!");
    }

}
