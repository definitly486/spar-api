package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    static class iobyxmoadg {
        static LocaleList iobyxmoadg(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static q1.nufgyqmvbu iobyxmoadg(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return q1.nufgyqmvbu.zoijcleaow(eablkybsjg.zoijcleaow(context));
        }
        Object objZoijcleaow = zoijcleaow(context);
        return objZoijcleaow != null ? q1.nufgyqmvbu.dxjokdxxww(iobyxmoadg.iobyxmoadg(objZoijcleaow)) : q1.nufgyqmvbu.wkgbmnqykc();
    }

    private static Object zoijcleaow(Context context) {
        return context.getSystemService(CommonUrlParts.LOCALE);
    }
}
