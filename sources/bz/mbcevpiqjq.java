package bz;

import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes2.dex */
class mbcevpiqjq extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final WifiManager f17531eablkybsjg;

    mbcevpiqjq(WifiManager wifiManager) {
        super(kc2.lqeggnwhkg.SSID);
        this.f17531eablkybsjg = wifiManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        WifiManager wifiManager = this.f17531eablkybsjg;
        if (wifiManager == null) {
            throw new jhduphickx("mWifiManager == null");
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            throw new jhduphickx("wifiInfo == null");
        }
        if (connectionInfo.getSupplicantState() != SupplicantState.COMPLETED) {
            throw new jhduphickx("wifiInfo.getSupplicantState() != SupplicantState.COMPLETED");
        }
        String ssid = connectionInfo.getSSID();
        if (ssid != null) {
            ssid = ssid.replace("\"", "");
        }
        if (ssid == null || ssid.equals("<unknown ssid>")) {
            throw new jhduphickx("ssid == null || ssid.equals(UNKNOWN_SSID)");
        }
        return ssid;
    }
}
