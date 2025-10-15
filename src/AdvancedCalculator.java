
public class AdvancedCalculator extends Calculator {
    // 계산기 v2.0 곱하기 기능 개발 완료
    //https://github.com/yunaaaaaaaaaaaa/java_cal/issues/2
    @Override
    public int multiply()
    {
        result = num1 * num2;
        return result;
    }
    // 계산기 v2.0 나누기 기능 개발 완료
    //https://github.com/yunaaaaaaaaaaaa/java_cal/issues/3
    @Override
    public int divide()
    {
        result = num1 / num2;
        return result;
    }
}
