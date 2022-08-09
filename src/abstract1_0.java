public class abstract1_0 {
    public static void main(String[] args) {
        var c=new Circle();
        c.info();

    }
    interface Shape{
        abstract public void info();
    }
    static class Circle implements Shape{
        @Override
        public void info() {
            System.out.println("Circle");
        }
    }
}
