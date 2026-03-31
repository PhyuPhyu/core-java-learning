package ThisKeywordUsage;

public class thisKeywordUsage {
    int a = 2;

    public void getData() {
        int a = 3;

        int b = a + this.a;

        System.out.println(a);
        System.out.println(this.a);

        System.out.println(b);
    }

    public static void main(String[] args) {
        thisKeywordUsage tku = new thisKeywordUsage();
        tku.getData();
    }
}
