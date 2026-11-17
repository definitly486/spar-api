package cdpycssgdh;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    private static class iobyxmoadg {
        static Context iobyxmoadg(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String zoijcleaow(Context context) {
            return context.getAttributionTag();
        }
    }

    private static class zoijcleaow {
        static Context iobyxmoadg(Context context, int i13) {
            return context.createDeviceContext(i13);
        }

        static int zoijcleaow(Context context) {
            return context.getDeviceId();
        }
    }

    public static Context iobyxmoadg(Context context) {
        int iZoijcleaow;
        Context applicationContext = context.getApplicationContext();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34 && (iZoijcleaow = zoijcleaow.zoijcleaow(context)) != zoijcleaow.zoijcleaow(applicationContext)) {
            applicationContext = zoijcleaow.iobyxmoadg(applicationContext, iZoijcleaow);
        }
        if (i13 < 30) {
            return applicationContext;
        }
        String strZoijcleaow = iobyxmoadg.zoijcleaow(context);
        return !Objects.equals(strZoijcleaow, iobyxmoadg.zoijcleaow(applicationContext)) ? iobyxmoadg.iobyxmoadg(applicationContext, strZoijcleaow) : applicationContext;
    }

    public static Application zoijcleaow(Context context) {
        for (Context contextIobyxmoadg = iobyxmoadg(context); contextIobyxmoadg instanceof ContextWrapper; contextIobyxmoadg = ((ContextWrapper) contextIobyxmoadg).getBaseContext()) {
            if (contextIobyxmoadg instanceof Application) {
                return (Application) contextIobyxmoadg;
            }
        }
        return null;
    }
}
