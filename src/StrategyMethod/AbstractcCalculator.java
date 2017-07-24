package StrategyMethod;

/**
 * Created by Jeremy on 2017/7/22.
 */
public abstract class AbstractcCalculator {

    public int[] spilt(String exp,String opt){

        String arrry[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(arrry[0]);
        arrayInt[1] = Integer.parseInt(arrry[1]);
        return arrayInt;
    }

}
