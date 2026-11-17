package bz;

import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes2.dex */
class m0 extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final WifiManager f17530eablkybsjg;

    m0(WifiManager wifiManager) {
        super(kc2.lqeggnwhkg.SignalStrength);
        this.f17530eablkybsjg = wifiManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        WifiManager wifiManager = this.f17530eablkybsjg;
        if (wifiManager != null) {
            return String.valueOf(wifiManager.getConnectionInfo().getRssi());
        }
        throw new jhduphickx("mWifiManager == null");
    }
}
