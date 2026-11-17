package bz;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes2.dex */
class i extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17434eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final WifiManager f17435gxszxtbevo;

    i(Context context, WifiManager wifiManager) {
        super(kc2.lqeggnwhkg.BSSID);
        this.f17434eablkybsjg = context;
        this.f17435gxszxtbevo = wifiManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17434eablkybsjg, "android.permission.ACCESS_WIFI_STATE")) {
            return "-1";
        }
        WifiManager wifiManager = this.f17435gxszxtbevo;
        if (wifiManager == null) {
            throw new jhduphickx("mWifiManager == null");
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            throw new jhduphickx("wifiInfo == null");
        }
        String bssid = connectionInfo.getBSSID();
        if (bssid != null) {
            return bssid;
        }
        throw new jhduphickx("bssid == null");
    }
}
