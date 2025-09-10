public class AccessModifiers {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // default

    static int staticVar = 5;

    public void show() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.show();
    }
}
