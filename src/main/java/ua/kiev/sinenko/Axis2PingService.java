package ua.kiev.sinenko;

public class Axis2PingService {
    public String ping(String text) {
        if (text == null) {
            return "Service is up and available";
        }
        return "Service is up and available, message: " + text;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
