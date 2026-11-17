package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm extends Service {

    private static class iobyxmoadg {
        static int iobyxmoadg() {
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    public static ServiceInfo iobyxmoadg(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) oxmwwwfdhm.class), iobyxmoadg.iobyxmoadg() | UserVerificationMethods.USER_VERIFY_PATTERN);
    }
}
