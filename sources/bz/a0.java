package bz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17375eablkybsjg;

    a0(Context context) {
        super(kc2.lqeggnwhkg.VpnConnection);
        this.f17375eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public Boolean lereixgezr() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f17375eablkybsjg.getSystemService("connectivity");
        boolean z13 = false;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasTransport(4)) {
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }
}
