
import com.katla.javapkg.JavaClassDemo

object HelloWorldScala {
  def main(args: Array[String]) {
    println("Hello Scala !!")
    greet()
    callPackageJavaMethod()
  }

  def greet(){
    val calljava = new HelloWorldJava
    calljava.getSomething()
    calljava.callJavaInPkg()
    println()
  }

  def callPackageJavaMethod(){
    val callJavafromPkg = new JavaClassDemo
    println(callJavafromPkg.toString())
    callJavafromPkg.MthdJavaPkg()

  }
}
