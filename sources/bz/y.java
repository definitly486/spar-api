package bz;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class y extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final long f17674lqeggnwhkg = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t6.zfvoamnweg f17675eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17676gxszxtbevo;

    y(t6.zfvoamnweg zfvoamnwegVar, t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.VpnApps);
        this.f17675eablkybsjg = zfvoamnwegVar;
        this.f17676gxszxtbevo = zdlpuopuiuVar;
    }

    private String yadqdtsiqt(Set set) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            sb3.append(',');
        }
        if (sb3.length() > 0) {
            sb3.setLength(sb3.length() - 1);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        String str = (String) yggfygwlhe(f17674lqeggnwhkg);
        if (str != null) {
            return str;
        }
        String strYadqdtsiqt = yadqdtsiqt(this.f17675eablkybsjg.zoijcleaow());
        btonecajqb(strYadqdtsiqt);
        return strYadqdtsiqt;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17676gxszxtbevo;
    }
}
