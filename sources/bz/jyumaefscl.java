package bz;

import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class jyumaefscl extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final long f17489lqeggnwhkg = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t6.zdlpuopuiu f17490eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17491gxszxtbevo;

    jyumaefscl(t6.zdlpuopuiu zdlpuopuiuVar, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.SimCard);
        this.f17490eablkybsjg = zdlpuopuiuVar;
        this.f17491gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        if (this.f17491gxszxtbevo == null) {
            throw new jhduphickx("Telephony not supported by the hardware.");
        }
        String str = (String) yggfygwlhe(f17489lqeggnwhkg);
        if (str != null) {
            return str;
        }
        String strValueOf = String.valueOf(t6.esjtqupxsv.ppxfxbqfkf(this.f17491gxszxtbevo));
        btonecajqb(strValueOf);
        return strValueOf;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17490eablkybsjg;
    }
}
