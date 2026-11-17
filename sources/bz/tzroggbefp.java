package bz;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class tzroggbefp extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17642eablkybsjg;

    tzroggbefp(Context context) {
        super(kc2.lqeggnwhkg.PhoneNumbers);
        this.f17642eablkybsjg = context;
    }

    private oc2.iobyxmoadg cdpycssgdh() {
        return new oc2.iobyxmoadg();
    }

    private oc2.iobyxmoadg yadqdtsiqt() throws q2 {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.f17642eablkybsjg.getSystemService("telephony_subscription_service");
        if (subscriptionManager == null) {
            return iobyxmoadgVar;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17642eablkybsjg, "android.permission.READ_PHONE_STATE")) {
            throw new q2(t6.ppxfxbqfkf.READ_PHONE_STATE);
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() >= 2) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                i13++;
                iobyxmoadgVar.put(String.valueOf(i13), it.next().getNumber());
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
