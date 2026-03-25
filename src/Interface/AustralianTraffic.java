package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {
    public static void main(String[] args) {
        CentralTraffic a = new AustralianTraffic();

        a.greenGo();
        a.redStop();
        a.flashYellow();

        AustralianTraffic at = new AustralianTraffic();
        at.walkOnSymbol();

        ContinentTraffic ct = new AustralianTraffic();
        ct.trainSymbol();
    }

    @Override
    public void greenGo() {
        // TODO Auto-generated method stub
        System.out.println("Go");

    }

    @Override
    public void redStop() {
        // TODO Auto-generated method stub
        System.out.println("Stop");
    }

    @Override
    public void flashYellow() {
        // TODO Auto-generated method stub
        System.out.println("Wait");
    }

    public void walkOnSymbol() {
        System.out.println("walk");
    }

    @Override
    public void trainSymbol() {
        // TODO Auto-generated method stub
        System.out.println("train");
    }
}
