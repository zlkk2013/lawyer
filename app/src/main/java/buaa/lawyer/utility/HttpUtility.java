package buaa.lawyer.utility;

import com.loopj.android.http.AsyncHttpClient;
import android.os.Build;
import android.util.Log;

/**
 * Created by gzc on 14-10-28.
 */
public class HttpUtility {
    private static AsyncHttpClient client = new AsyncHttpClient();

    static {
        setUserAgent(client);
    }

    public static void setUserAgent(AsyncHttpClient c) {
        /*
        Log.v("OS Version", System.getProperty("os.version"));
        Log.v("MODEL", Build.MODEL);
        Log.v("SERIAL", Build.SERIAL);
        */
        c.setUserAgent("jlt/" + Config.VERSION + "/" + System.getProperty("os.version") + "/" + Build.MODEL + "/" + Build.SERIAL);
    }

    public static AsyncHttpClient getClient() {
        return client;
    }

    public static AsyncHttpClient createClient() {
        AsyncHttpClient c = new AsyncHttpClient();
        setUserAgent(c);
        return c;
    }

}
