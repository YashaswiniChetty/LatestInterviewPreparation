package QuestionsExplanantions;

//From the given input array find subsets with 3 elements which constitutes binary serach tree
//input [10, 9,15,20,23,16,7,10,30]
//output [9,15,20],[15,20,23],[7,10,30]
// subset of 3 consecutive ele
  abstract class Test {
      Test() {
          System.out.println("Abstartc class constructor");
      }
      Test(int x){
          System.out.println("Abstartc class constructor parameterised");
      }
      abstract void test();
}

class TestImple extends Test {
    TestImple() {
        super(3); // if we have default constructor in both parent and sub class no need to worry
        // if we have parameter constrcutor in parent then we need to call super
        System.out.println("TestImple class constructor");

    }
    @Override
    public void test(){
        System.out.println("Test method overridden");
    }
}

public class AbstaractProgram {
    public static void main(String[] args) {
        TestImple impl = new TestImple();
        impl.test();
    }
}

