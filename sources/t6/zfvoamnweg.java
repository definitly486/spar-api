package t6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zfvoamnweg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PackageManager f109915iobyxmoadg;

    public zfvoamnweg(Context context) {
        this.f109915iobyxmoadg = context.getPackageManager();
    }

    private static List iobyxmoadg(PackageManager packageManager, String str) {
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(new Intent(str), PackageManager.ResolveInfoFlags.of(128L)) : packageManager.queryIntentServices(new Intent(str), UserVerificationMethods.USER_VERIFY_PATTERN);
        if (listQueryIntentServices != null) {
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    arrayList.add(serviceInfo.packageName);
                }
            }
        }
        return arrayList;
    }

    public Set zoijcleaow() {
        return new HashSet(iobyxmoadg(this.f109915iobyxmoadg, "android.net.VpnService"));
    }
}
