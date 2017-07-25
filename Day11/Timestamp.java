import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Timestamp {
	Day day();
	Month month();
	Year year();
}
