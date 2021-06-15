
class Test {
    public Test(){


    }

    public int add(int a,int b) {
        return a + b;
    }

    public static void mian(String[] argv) {
        Test t = new Test();
        t.add(1,1);
    }
}