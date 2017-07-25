package InterpreterMethod;

/**
 * Created by Jeremy on 2017/7/25.
 */
public class Minus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
