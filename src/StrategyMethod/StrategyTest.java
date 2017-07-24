package StrategyMethod;

/**
 * Created by Jeremy on 2017/7/22.
 */
public class StrategyTest {

    public static void main(String []args){
        ICalculator iCalculator = new Plus();
        System.out.println(iCalculator.calculator("7+1"));
    }

}
