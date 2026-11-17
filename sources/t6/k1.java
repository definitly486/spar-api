package t6;

import android.content.Context;
import bz.u4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class k1 implements kc2.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final metgxyhuhe f109828eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f109830iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h0 f109832ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final hcddaimhww f109833wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pc2.iobyxmoadg f109834zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final Map f109831lqeggnwhkg = eablkybsjg();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f109829gxszxtbevo = nufgyqmvbu();

    public k1(Context context, pc2.iobyxmoadg iobyxmoadgVar, h0 h0Var, hcddaimhww hcddaimhwwVar, metgxyhuhe metgxyhuheVar) {
        this.f109830iobyxmoadg = context;
        this.f109834zoijcleaow = iobyxmoadgVar;
        this.f109832ppxfxbqfkf = h0Var;
        this.f109833wkgbmnqykc = hcddaimhwwVar;
        this.f109828eablkybsjg = metgxyhuheVar;
    }

    private Map eablkybsjg() {
        TreeMap treeMap = new TreeMap(new kc2.lqeggnwhkg.iobyxmoadg());
        for (kc2.lqeggnwhkg lqeggnwhkgVar : this.f109834zoijcleaow.nufgyqmvbu()) {
            if (lqeggnwhkgVar.lqeggnwhkg() == null) {
                Set setNufgyqmvbu = this.f109834zoijcleaow.nufgyqmvbu();
                Context context = this.f109830iobyxmoadg;
                pc2.iobyxmoadg iobyxmoadgVar = this.f109834zoijcleaow;
                treeMap.put(lqeggnwhkgVar, bz.rhgxfdycjh.iobyxmoadg(setNufgyqmvbu, lqeggnwhkgVar, context, iobyxmoadgVar, this.f109832ppxfxbqfkf, this.f109833wkgbmnqykc, iobyxmoadgVar.lqeggnwhkg(), this.f109834zoijcleaow.wflxmlrfwp()));
            }
        }
        return treeMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List nufgyqmvbu() {
        ArrayList arrayList = new ArrayList();
        for (bz.metgxyhuhe metgxyhuheVar : this.f109831lqeggnwhkg.values()) {
            if (metgxyhuheVar instanceof bz.e) {
                if (metgxyhuheVar instanceof stevsuqkhv) {
                    try {
                        metgxyhuheVar.pmvmpeiblj();
                    } catch (u4 unused) {
                    }
                }
                arrayList.add((bz.e) metgxyhuheVar);
            }
        }
        return arrayList;
    }

    protected void finalize() throws Throwable {
        try {
            zoijcleaow();
        } finally {
            super.finalize();
        }
    }

    public kc2.lqeggnwhkg[] gxszxtbevo() {
        return (kc2.lqeggnwhkg[]) this.f109831lqeggnwhkg.keySet().toArray(new kc2.lqeggnwhkg[0]);
    }

    @Override // kc2.zoijcleaow
    public void iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        Iterator it = this.f109829gxszxtbevo.iterator();
        while (it.hasNext()) {
            ((bz.e) it.next()).ojitshcjhn(gxszxtbevoVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object lqeggnwhkg(kc2.lqeggnwhkg... r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.k1.lqeggnwhkg(kc2.lqeggnwhkg[]):java.lang.Object");
    }

    @Override // kc2.zoijcleaow
    public Object ppxfxbqfkf() {
        return lqeggnwhkg(gxszxtbevo());
    }

    public void wkgbmnqykc() {
        for (Object obj : this.f109831lqeggnwhkg.values()) {
            if (obj instanceof gxszxtbevo) {
                ((gxszxtbevo) obj).oxmwwwfdhm();
            }
        }
    }

    @Override // kc2.zoijcleaow
    public void zoijcleaow() {
        for (Object obj : this.f109831lqeggnwhkg.values()) {
            if (obj instanceof gxszxtbevo) {
                ((gxszxtbevo) obj).gxszxtbevo();
            }
        }
    }
}
