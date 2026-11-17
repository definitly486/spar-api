package d7;

import android.content.Context;
import android.net.ConnectivityManager;
import i7.kcexrzcfyt;
import i7.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    public static final wkgbmnqykc iobyxmoadg(Context context, wkgbmnqykc.iobyxmoadg iobyxmoadgVar, kcexrzcfyt kcexrzcfytVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.iobyxmoadg.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !i7.wkgbmnqykc.eablkybsjg(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (kcexrzcfytVar != null && kcexrzcfytVar.zoijcleaow() <= 5) {
                kcexrzcfytVar.iobyxmoadg("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new ppxfxbqfkf();
        }
        try {
            return new gxszxtbevo(connectivityManager, iobyxmoadgVar);
        } catch (Exception e13) {
            if (kcexrzcfytVar != null) {
                nufgyqmvbu.iobyxmoadg(kcexrzcfytVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e13));
            }
            return new ppxfxbqfkf();
        }
    }
}
