package java8.referingvariablesinlamda;

public class VariableReference {
    String instanceVariable = "dd";
    public static void main(String[] args) {
        String portNumber = "3434";
        portNumber = "3434";

        String finalPortNumber = portNumber;
        Runnable runnable = () -> {
            System.out.println(finalPortNumber);
        };
    }

    private void instanceMethod() {
        this.instanceVariable = "dsa";
        Runnable runnable = () -> {
            System.out.println(instanceVariable);
        };
        this.instanceVariable = "dsa";
    }
}
