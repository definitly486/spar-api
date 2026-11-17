package bz;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class e0 extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17410eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17411gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Set f17412lqeggnwhkg;

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        String iobyxmoadg();
    }

    e0(Set set, Context context) {
        super(kc2.lqeggnwhkg.PhoneInfo);
        this.f17411gxszxtbevo = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        this.f17412lqeggnwhkg = set;
        this.f17410eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String iozdgvuglv() {
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.f17410eablkybsjg).getActiveSubscriptionInfoList();
        return !activeSubscriptionInfoList.isEmpty() ? activeSubscriptionInfoList.get(0).getIccId() : this.f17411gxszxtbevo.getSimSerialNumber();
    }

    private String ylkuphrtab(iobyxmoadg iobyxmoadgVar) {
        String strIobyxmoadg;
        try {
            strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        } catch (Throwable unused) {
            strIobyxmoadg = "-1";
        }
        return (strIobyxmoadg == null || strIobyxmoadg.isEmpty()) ? "-1" : strIobyxmoadg;
    }

    public String lmojexxdyd() {
        return this.f17411gxszxtbevo.getPhoneCount() == 2 ? this.f17411gxszxtbevo.getImei(0) : this.f17411gxszxtbevo.getImei();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wwaezpbzkn, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        if (this.f17412lqeggnwhkg.contains(kc2.lqeggnwhkg.IMEI)) {
            iobyxmoadgVar.put("IMEI", ylkuphrtab(new iobyxmoadg() { // from class: bz.b0
                @Override // bz.e0.iobyxmoadg
                public final String iobyxmoadg() {
                    return this.f17386iobyxmoadg.lmojexxdyd();
                }
            }));
        }
        if (this.f17412lqeggnwhkg.contains(kc2.lqeggnwhkg.IMSI)) {
            iobyxmoadgVar.put("IMSI", ylkuphrtab(new iobyxmoadg() { // from class: bz.c0
                @Override // bz.e0.iobyxmoadg
                public final String iobyxmoadg() {
                    return this.f17388iobyxmoadg.yadqdtsiqt();
                }
            }));
        }
        if (this.f17412lqeggnwhkg.contains(kc2.lqeggnwhkg.SIM)) {
            iobyxmoadgVar.put("SIM", ylkuphrtab(new iobyxmoadg() { // from class: bz.d0
                @Override // bz.e0.iobyxmoadg
                public final String iobyxmoadg() {
                    return this.f17403iobyxmoadg.iozdgvuglv();
                }
            }));
        }
        return iobyxmoadgVar;
    }

    public String yadqdtsiqt() {
        return this.f17411gxszxtbevo.getSubscriberId();
    }
}
