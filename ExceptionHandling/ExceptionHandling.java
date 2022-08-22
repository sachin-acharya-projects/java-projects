public class ExceptionHandling{
    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println("Accessing Third Element" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured\n" + e);
        }finally {
            a[0] = 10;
            System.out.println("Finally Block Executed");
            System.out.println("Value of a[0] is " + a[0]);
        }
    }
}