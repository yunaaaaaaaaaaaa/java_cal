public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");


        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

     



    }
}