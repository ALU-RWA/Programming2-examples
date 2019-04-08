package w6;

public class WithConstructorChild extends WithConstructor {
    String basicString;

    public WithConstructorChild(int i, boolean b, String s){
        //behind the scenes, everything in WithConstructor() happens first

        super(i, b);
        basicString = s;
    }

    public String toString(){
        return super.toString() + " " + basicString;
    }

    public static void main(String[] args) {
        WithConstructorChild test = new WithConstructorChild(10, false, "Hi");
        System.out.println("After the constructor");

//        System.out.println(test.basicString);
//        System.out.println(test.basicInt);
//        System.out.println(test.basicBool);
        System.out.println(test);
    }
}
