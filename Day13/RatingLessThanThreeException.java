/**
 * Created by ruplaga on 7/26/2017.
 */
public class RatingLessThanThreeException extends Exception {
    public RatingLessThanThreeException (){
    }

    public RatingLessThanThreeException (String message){
        super(message);
    }
}
