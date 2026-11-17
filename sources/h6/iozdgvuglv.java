package h6;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class iozdgvuglv extends g6.jpowsppfya {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final String f39554btonecajqb = g6.yggfygwlhe.dxjokdxxww("WorkContinuationImpl");

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private g6.esjtqupxsv f39555dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f39556eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f39557gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus f39558iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f39559lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f39560nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final g6.dxjokdxxww f39561ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f39562wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39563zoijcleaow;

    public iozdgvuglv(dsvhmnatus dsvhmnatusVar, List list) {
        this(dsvhmnatusVar, null, g6.dxjokdxxww.KEEP, list, null);
    }

    public static Set agtfadlqog(iozdgvuglv iozdgvuglvVar) {
        HashSet hashSet = new HashSet();
        List listGxszxtbevo = iozdgvuglvVar.gxszxtbevo();
        if (listGxszxtbevo != null && !listGxszxtbevo.isEmpty()) {
            Iterator it = listGxszxtbevo.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((iozdgvuglv) it.next()).wkgbmnqykc());
            }
        }
        return hashSet;
    }

    private static boolean btonecajqb(iozdgvuglv iozdgvuglvVar, Set set) {
        set.addAll(iozdgvuglvVar.wkgbmnqykc());
        Set setAgtfadlqog = agtfadlqog(iozdgvuglvVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setAgtfadlqog.contains((String) it.next())) {
                return true;
            }
        }
        List listGxszxtbevo = iozdgvuglvVar.gxszxtbevo();
        if (listGxszxtbevo != null && !listGxszxtbevo.isEmpty()) {
            Iterator it2 = listGxszxtbevo.iterator();
            while (it2.hasNext()) {
                if (btonecajqb((iozdgvuglv) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(iozdgvuglvVar.wkgbmnqykc());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.wwaezpbzkn draadjrbmk() {
        q6.gxszxtbevo.zoijcleaow(this);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean dxjokdxxww() {
        return btonecajqb(this, new HashSet());
    }

    public String eablkybsjg() {
        return this.f39563zoijcleaow;
    }

    public boolean gtknphoqwx() {
        return this.f39560nufgyqmvbu;
    }

    public List gxszxtbevo() {
        return this.f39559lqeggnwhkg;
    }

    public List lqeggnwhkg() {
        return this.f39562wkgbmnqykc;
    }

    public dsvhmnatus nufgyqmvbu() {
        return this.f39558iobyxmoadg;
    }

    public g6.dxjokdxxww ppxfxbqfkf() {
        return this.f39561ppxfxbqfkf;
    }

    public void wflxmlrfwp() {
        this.f39560nufgyqmvbu = true;
    }

    public List wkgbmnqykc() {
        return this.f39556eablkybsjg;
    }

    public g6.esjtqupxsv zoijcleaow() {
        if (this.f39560nufgyqmvbu) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f39554btonecajqb, "Already enqueued work ids (" + TextUtils.join(", ", this.f39556eablkybsjg) + ")");
        } else {
            this.f39555dxjokdxxww = g6.istkbnxepw.ppxfxbqfkf(this.f39558iobyxmoadg.agtfadlqog().agtfadlqog(), "EnqueueRunnable_" + ppxfxbqfkf().name(), this.f39558iobyxmoadg.jyumaefscl().ppxfxbqfkf(), new tg.iobyxmoadg() { // from class: h6.yadqdtsiqt
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return this.f39661zdlpuopuiu.draadjrbmk();
                }
            });
        }
        return this.f39555dxjokdxxww;
    }

    public iozdgvuglv(dsvhmnatus dsvhmnatusVar, String str, g6.dxjokdxxww dxjokdxxwwVar, List list) {
        this(dsvhmnatusVar, str, dxjokdxxwwVar, list, null);
    }

    public iozdgvuglv(dsvhmnatus dsvhmnatusVar, String str, g6.dxjokdxxww dxjokdxxwwVar, List list, List list2) {
        this.f39558iobyxmoadg = dsvhmnatusVar;
        this.f39563zoijcleaow = str;
        this.f39561ppxfxbqfkf = dxjokdxxwwVar;
        this.f39562wkgbmnqykc = list;
        this.f39559lqeggnwhkg = list2;
        this.f39556eablkybsjg = new ArrayList(list.size());
        this.f39557gxszxtbevo = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f39557gxszxtbevo.addAll(((iozdgvuglv) it.next()).f39557gxszxtbevo);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (dxjokdxxwwVar == g6.dxjokdxxww.REPLACE && ((g6.dsvhmnatus) list.get(i13)).wkgbmnqykc().lqeggnwhkg() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strZoijcleaow = ((g6.dsvhmnatus) list.get(i13)).zoijcleaow();
            this.f39556eablkybsjg.add(strZoijcleaow);
            this.f39557gxszxtbevo.add(strZoijcleaow);
        }
    }
}
