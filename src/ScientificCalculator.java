public class ScientificCalculator extends AdvancedCalculator {

    @Override
    public int mod() {
        result = 0;

        result = num1 % num2;
        return result;
    }
}
