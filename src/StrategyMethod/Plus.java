package StrategyMethod;

/**
 * Created by Jeremy on 2017/7/22.
 */
public class Plus extends AbstractcCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int arrayInt[] = spilt(exp,"\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
