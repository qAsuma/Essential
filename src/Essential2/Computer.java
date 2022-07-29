package Essential2;

import java.util.Arrays;

public class Computer {
    private int num;

    public Computer(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer(i);
        }
        System.out.println(Arrays.toString(computers));
    }

    @Override
    public String toString() {
        return "Computer{" +
                "num=" + num +
                '}';
    }
}