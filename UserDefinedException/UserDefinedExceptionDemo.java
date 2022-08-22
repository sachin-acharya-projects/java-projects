// UserDefinedException

class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("Exception raised by user");
        }catch (UserDefinedException e) {
            System.out.println("Exception Occured\n" + e.getMessage());
        }
    }
}