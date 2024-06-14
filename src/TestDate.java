import java.text.SimpleDateFormat;
import java.util.Date;
public class TestDate {

    public static void main(String[] args) {

        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/y");
        System.out.println(dateForm.format(thisDate));
    }

}

