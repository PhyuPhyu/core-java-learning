package Inheritance;

public class ChildClass extends ParentClass {

    public void engine() {
        System.out.println("new engine");
    }

    public void color() {
        System.out.println(color);
    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();

        cc.color();
        cc.engine();
        cc.audiosystem();
        cc.breaks();
        cc.gear();
    }

}
