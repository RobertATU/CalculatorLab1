package ie.atu.lab1_calculator;

public class Calculator {
    private int ans;
    private int int1;
    private int int2;

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public Calculator(int num1, int num2, String op) {
        this.int1 = num2;
        this.int2 = num1;
        switch (op) {

            case "add":
                this.ans = num1 + num2;
                break;
            case "subtract":
                this.ans = num1 - num2;
                break;
            case "multiply":
                this.ans = num1 * num2;
                break;
            case "divide":
                this.ans = num1 / num2;
                break;
        }

    }

    @Override
    public String toString() {
        return "Calculator{" +
                "ans=" + ans +
                ", int1=" + int1 +
                ", int2=" + int2 +
                '}';
    }
}