package md;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static String[] f66802iobyxmoadg;

    public static boolean iobyxmoadg(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        gd.iobyxmoadg.eablkybsjg().iobyxmoadg("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f66802iobyxmoadg == null) {
            f66802iobyxmoadg = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f66802iobyxmoadg) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
