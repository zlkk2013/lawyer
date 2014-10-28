package buaa.lawyer.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.os.Build;
/**
 * Created by gzc on 14-10-26.
 */
public class Utility {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isNotBlank(String txt){
        return txt!=null && txt.trim().length()>0 ? true: false;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }


}
