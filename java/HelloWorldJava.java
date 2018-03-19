import com.katla.javapkg.JavaClassDemo;

public class HelloWorldJava {

    public static void main(String[] args) {
        System.out.println("Hello World from Java!!!");
    }

    public void getSomething() {
        System.out.println( "This is a response from Java Class!!");
    }

    public void callJavaInPkg() {

        JavaClassDemo jcd = new JavaClassDemo();
        jcd.MthdJavaPkg();
    }
}
