package bz;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class x extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17670eablkybsjg;

    x(Context context) {
        super(kc2.lqeggnwhkg.PhoneESimInfo);
        this.f17670eablkybsjg = context;
    }

    private oc2.iobyxmoadg cdpycssgdh() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        TelephonyManager telephonyManager = (TelephonyManager) this.f17670eablkybsjg.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            iobyxmoadgVar.put("sim1", Boolean.FALSE);
        }
        return iobyxmoadgVar;
    }

    private oc2.iobyxmoadg yadqdtsiqt() throws q2 {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.f17670eablkybsjg.getSystemService("telephony_subscription_service");
        if (subscriptionManager == null) {
            return iobyxmoadgVar;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17670eablkybsjg, "android.permission.READ_PHONE_STATE")) {
            throw new q2(t6.ppxfxbqfkf.READ_PHONE_STATE);
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() != 0) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                i13++;
                iobyxmoadgVar.put(String.format("sim%d", Integer.valueOf(i13)), Boolean.valueOf(it.next().isEmbedded()));
            }
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: iozdgvuglv, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        return Build.VERSION.SDK_INT < 28 ? cdpycssgdh() : yadqdtsiqt();
    }
}
