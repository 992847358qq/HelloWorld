package rpc.provider.app;

import rpc.provider.service.Calculator;
import rpc.provider.service.CalculatorImpl;
import rpc.reuqest.CalculateRpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 *
 * @author: wgl created on 2019/02/21
 */
public class ProviderApp {

    private Calculator calculator = new CalculatorImpl();

    public static void main(String[] args) throws IOException {
        new ProviderApp().run();
    }

    private void run() throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    // 将请求反序列化
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    Object object = objectInputStream.readObject();


                    // 调用服务
                    int result = 0;
                    if (object instanceof CalculateRpcRequest) {
                        CalculateRpcRequest calculateRpcRequest = (CalculateRpcRequest) object;
                        if ("add".equals(calculateRpcRequest.getMethod())) {
                            result = calculator.add(calculateRpcRequest.getA(), calculateRpcRequest.getB());
                            System.out.println(result+"*******");
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    }

                    // 返回结果
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeObject(new Integer(result));
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }

}
