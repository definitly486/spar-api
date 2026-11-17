package z8;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements ppxfxbqfkf {
    @Override // z8.ppxfxbqfkf
    public zoijcleaow iobyxmoadg(Context context, zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        boolean z13 = androidx.core.content.iobyxmoadg.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z13 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z13 ? new wkgbmnqykc(context, iobyxmoadgVar) : new agtfadlqog();
    }
}
