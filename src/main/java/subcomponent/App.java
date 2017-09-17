package subcomponent;

public class App {
    public static void main(String[] args) {
        Controller controller = DaggerApplicationComponent.create().controller();
        System.out.println(controller.handleRequest("World!")); // prints Hello World!
    }
}
