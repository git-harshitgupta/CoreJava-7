package Inter;

class Test1{
    @Override
    public String toString() {
        return "Hello";
    }

    public void display(int i){

        if(i>18){
            throw new ArithmeticException("Greater then 18");
        }
        else {
            System.out.println("ok");
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Test1 test = new Test1();
        try{
        test.display(19);}
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After throw");
    }
}
