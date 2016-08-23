package java.com.coffeeshop.utility;

/**
 * Created by Emanuel on 8/19/2016.
 */
public class InsufficientCaffeineException extends RuntimeException {
    //custom runtime exception for handling regular exceptions, will create an interceptor to manage these later
    public InsufficientCaffeineException(Exception e) {
        super(e);
    }
}
