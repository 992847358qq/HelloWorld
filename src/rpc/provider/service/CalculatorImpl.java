package rpc.provider.service;

/**
 * <p>
 *
 * @author: wgl created on 2019/02/21
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
