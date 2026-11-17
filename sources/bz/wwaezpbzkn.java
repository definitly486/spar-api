package bz;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
class wwaezpbzkn extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17666eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17667gxszxtbevo;

    wwaezpbzkn(Context context, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.PhoneNumber);
        this.f17666eablkybsjg = context;
        this.f17667gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        if (this.f17667gxszxtbevo == null) {
            throw new u4("tel == null");
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17666eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg()) || !t6.skhdrjzrfn.iobyxmoadg(this.f17666eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_NUMBERS.iobyxmoadg())) {
            throw new u4("permission not granted");
        }
        String line1Number = this.f17667gxszxtbevo.getLine1Number();
        if (line1Number != null) {
            return line1Number;
        }
        throw new u4("phoneNumber == null");
    }
}
