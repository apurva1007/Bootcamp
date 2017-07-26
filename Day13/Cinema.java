/**
 * Created by ruplaga on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(11, "Raj", 0, 7);
        try {
            MovieService.buy(user, 3000.89);
            MovieService.watch(user);
        } catch(PriceInvalidException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThanTenException e) {
            System.out.println(e.getMessage());
        } catch (PriceLessThanTwoThousand e) {
            System.out.println(e.getMessage());
        } catch (RatingLessThanThreeException e) {
            System.out.println(e.getMessage());
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThanTwentyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
