import robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot anonymous = new Robot();
        Robot one = new Robot("1234", "RX23");
        Robot two = new Robot("1234", "RX23", 30);

        System.out.println(anonymous);
        System.out.println(one);
        System.out.println(two);
    }
}