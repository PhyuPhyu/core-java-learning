package Abstraction;

public class ChildEmirate extends ParentAircraft {
    public static void main(String[] args) {
        ChildEmirate ce = new ChildEmirate();

        ce.engine();
        ce.safetyGuidelines();
        ce.bodyColor();
    }

    @Override
    public void bodyColor() {
        // TODO Auto-generated method stub
        System.out.println("Red color on the body");
    }
}
