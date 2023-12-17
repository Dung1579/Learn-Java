public class abc {     
    public static void main(String[] args) {
        boolean a = false;
        a &= b();
        a = a && b();
    }

    private static boolean b() {
        System.out.println("b() was called");
        return true;
    }
}