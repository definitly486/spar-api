package bz;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class istkbnxepw extends metgxyhuhe implements t6.lxfrhoxuzk, t6.czzsidtyhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17475eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17476gxszxtbevo;

    istkbnxepw(Context context, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.SIM_ID);
        this.f17475eablkybsjg = context;
        this.f17476gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        TelephonyManager telephonyManager = this.f17476gxszxtbevo;
        if (telephonyManager == null) {
            throw new u4("tel == null");
        }
        String subscriberId = telephonyManager.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        throw new u4("subscriberId == null");
    }

    @Override // t6.czzsidtyhn
    public int esjtqupxsv() {
        return 28;
    }

    @Override // t6.lxfrhoxuzk
    public Set gtknphoqwx() {
        return t6.jyumaefscl.iobyxmoadg(t6.ppxfxbqfkf.READ_PHONE_STATE);
    }

    @Override // t6.lxfrhoxuzk
    public Context iobyxmoadg() {
        return this.f17475eablkybsjg;
    }
}
