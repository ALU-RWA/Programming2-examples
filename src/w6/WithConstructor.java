package w6;

public class WithConstructor {
    int basicInt;
    boolean basicBool;

    public WithConstructor(int i, boolean b){
        basicInt = i;
        basicBool = b;
    }

    public WithConstructor(boolean b){
        basicBool = b;
        basicInt = 1;
    }

    public String toString(){
        return "int " + basicInt + " boolean " + basicBool;
    }

    public static void main(String[] args) {
//        WithConstructor testDefault = new WithConstructor();
        WithConstructor testConstructor = new WithConstructor(7, true);

        System.out.println(testConstructor);
//        System.out.println(testConstructor.basicBool);
    }
}
