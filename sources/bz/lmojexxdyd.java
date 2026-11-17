package bz;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
class lmojexxdyd extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17515eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17516gxszxtbevo;

    lmojexxdyd(Context context, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.MNC);
        this.f17515eablkybsjg = context;
        this.f17516gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        TelephonyManager telephonyManager = this.f17516gxszxtbevo;
        if (telephonyManager == null) {
            throw new jhduphickx("mTelephonyManager == null");
        }
        if (telephonyManager.getSimState() == 1) {
            throw new jhduphickx("Sim card is not inserted");
        }
        String networkOperator = this.f17516gxszxtbevo.getNetworkOperator();
        if (networkOperator.equals("00000")) {
            return "00";
        }
        try {
            return String.valueOf((networkOperator.isEmpty() || networkOperator.length() <= 3) ? this.f17515eablkybsjg.getResources().getConfiguration().mnc : Integer.parseInt(networkOperator.substring(3)));
        } catch (Exception e13) {
            throw new jhduphickx(e13.getMessage());
        }
    }
}
