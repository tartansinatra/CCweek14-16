public class HelloWorld {

  // public static String name;

  public static void main(String[] args) {
    // System.out.println("Hello World!");
    // if (args.length > 0) {
    // System.out.println("Hello "+args[0]);
    // }

    // name = "Marc!";
    // System.out.println("Hello " +name);

    MyHelloWorld world = new MyHelloWorld();
    MyHelloWorld marcsWorld = new MyHelloWorld("Marc");
    System.out.println(world.name);
    System.out.println(marcsWorld.name);

  }
}