public class Main {
    public static void main (String[] args) {
        Candy[][] a = new Candy[4][3];
        a[0][1] = new Candy("lime");
        a[1][1] = new Candy("orange");
        a[2][2] = new Candy("cherry");
        a[3][1] = new Candy("lemon");
        a[3][2] = new Candy("grape");
        BoxOfCandy b = new BoxOfCandy(a);
        // System.out.println(b.moveCandyToFirstRow(0));
        // System.out.println(b.moveCandyToFirstRow(1));
        System.out.println(b.moveCandyToFirstRow(2));
    }
}
