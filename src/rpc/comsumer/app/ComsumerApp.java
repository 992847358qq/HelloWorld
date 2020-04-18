package rpc.comsumer.app;

import rpc.comsumer.service.CalculatorRemoteImpl;
import rpc.provider.service.Calculator;

/**
 * <p>
 *
 * @author: wgl created on 2019/02/21
 */
public class ComsumerApp {

    public static void main(String[] args) {
        Calculator calculator = (Calculator) new CalculatorRemoteImpl();
        int result = calculator.add(1, 2);
    }
}
