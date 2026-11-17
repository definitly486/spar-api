package t6;

import android.content.Context;
import android.os.Build;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class jlmebxxoox implements tzroggbefp {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f109823zoijcleaow = jyumaefscl.iobyxmoadg(ppxfxbqfkf.READ_PHONE_STATE);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f109824iobyxmoadg;

    private static final class iobyxmoadg implements okpsazkaxt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f109825iobyxmoadg;

        private iobyxmoadg(int i13, int i14, String str, String str2) {
            this.f109825iobyxmoadg = i14;
        }

        static iobyxmoadg ppxfxbqfkf(SubscriptionInfo subscriptionInfo) {
            String strValueOf;
            String strValueOf2;
            if (Build.VERSION.SDK_INT >= 29) {
                strValueOf = subscriptionInfo.getMccString();
                strValueOf2 = subscriptionInfo.getMncString();
            } else {
                strValueOf = String.valueOf(subscriptionInfo.getMcc());
                strValueOf2 = String.valueOf(subscriptionInfo.getMnc());
            }
            return new iobyxmoadg(subscriptionInfo.getSimSlotIndex(), subscriptionInfo.getSubscriptionId(), strValueOf, strValueOf2);
        }

        static iobyxmoadg zoijcleaow(int i13, int i14) {
            return new iobyxmoadg(i13, i14, null, null);
        }

        @Override // t6.okpsazkaxt
        public int iobyxmoadg() {
            return this.f109825iobyxmoadg;
        }
    }

    jlmebxxoox(Context context) {
        this.f109824iobyxmoadg = context;
    }

    private static boolean eablkybsjg(Context context) {
        Iterator it = f109823zoijcleaow.iterator();
        while (it.hasNext()) {
            if (!skhdrjzrfn.iobyxmoadg(context, ((ppxfxbqfkf) it.next()).iobyxmoadg())) {
                return false;
            }
        }
        return true;
    }

    private SubscriptionManager ppxfxbqfkf() {
        return (SubscriptionManager) this.f109824iobyxmoadg.getSystemService("telephony_subscription_service");
    }

    private List wkgbmnqykc() {
        int[] subscriptionIds;
        ArrayList arrayList = new ArrayList();
        SubscriptionManager subscriptionManagerPpxfxbqfkf = ppxfxbqfkf();
        if (subscriptionManagerPpxfxbqfkf != null) {
            if (eablkybsjg(this.f109824iobyxmoadg)) {
                Iterator<SubscriptionInfo> it = subscriptionManagerPpxfxbqfkf.getActiveSubscriptionInfoList().iterator();
                while (it.hasNext()) {
                    arrayList.add(iobyxmoadg.ppxfxbqfkf(it.next()));
                }
            } else {
                int activeSubscriptionInfoCountMax = subscriptionManagerPpxfxbqfkf.getActiveSubscriptionInfoCountMax();
                int defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                int i13 = Build.VERSION.SDK_INT;
                int slotIndex = i13 >= 29 ? SubscriptionManager.getSlotIndex(defaultSubscriptionId) : 0;
                arrayList.add(iobyxmoadg.zoijcleaow(slotIndex, defaultSubscriptionId));
                if (i13 >= 29 && activeSubscriptionInfoCountMax > 1) {
                    for (int i14 = 0; i14 < activeSubscriptionInfoCountMax; i14++) {
                        if (i14 != slotIndex && (subscriptionIds = subscriptionManagerPpxfxbqfkf.getSubscriptionIds(i14)) != null) {
                            for (int i15 : subscriptionIds) {
                                if (i15 != defaultSubscriptionId) {
                                    arrayList.add(iobyxmoadg.zoijcleaow(i14, i15));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // t6.tzroggbefp
    public List iobyxmoadg() {
        ArrayList arrayList = new ArrayList(2);
        Iterator it = zoijcleaow().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((okpsazkaxt) it.next()).iobyxmoadg()));
        }
        return arrayList;
    }

    public List zoijcleaow() {
        ArrayList arrayList = new ArrayList(2);
        for (okpsazkaxt okpsazkaxtVar : wkgbmnqykc()) {
            ServiceState serviceStateZoijcleaow = g1.ppxfxbqfkf(this.f109824iobyxmoadg, okpsazkaxtVar.iobyxmoadg()).zoijcleaow();
            int state = serviceStateZoijcleaow != null ? serviceStateZoijcleaow.getState() : 3;
            if (state != 3 && state != 1) {
                arrayList.add(okpsazkaxtVar);
            }
        }
        return arrayList;
    }
}
