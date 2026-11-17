package bz;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
class zynmafqrjb extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17696eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17697gxszxtbevo;

    zynmafqrjb(Context context, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.MCC);
        this.f17696eablkybsjg = context;
        this.f17697gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        TelephonyManager telephonyManager = this.f17697gxszxtbevo;
        if (telephonyManager == null) {
            throw new jhduphickx("mTelephonyManager == null");
        }
        if (telephonyManager.getSimState() == 1) {
            throw new jhduphickx("Sim card is not inserted");
        }
        String networkOperator = this.f17697gxszxtbevo.getNetworkOperator();
        if (networkOperator.equals("00000")) {
            return "000";
        }
        int i13 = 0;
        try {
            i13 = !networkOperator.isEmpty() ? Integer.parseInt(networkOperator.substring(0, 3)) : this.f17696eablkybsjg.getResources().getConfiguration().mcc;
        } catch (Exception unused) {
        }
        if (i13 != 0) {
            return String.valueOf(i13);
        }
        throw new jhduphickx("mcc == 0");
    }
}
