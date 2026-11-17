package bz;

import java.io.Serializable;
import t6.h1;

/* JADX INFO: loaded from: classes2.dex */
class z extends metgxyhuhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final String f17689gxszxtbevo = t6.iwizpuwonk.iobyxmoadg(new byte[]{68, 18, 52, -29, 93, 52, -45, 90, -48, -92, 93, -80, 110, -8, -46, -3});

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final String f17690lqeggnwhkg = t6.iwizpuwonk.iobyxmoadg(new byte[]{116, -106, 82, 93, 116, -28, -6, -89, -65, -48, -31, -99, -9, 25, -72, 77});

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final h1 f17691eablkybsjg;

    z(h1 h1Var) {
        super(kc2.lqeggnwhkg.ShareScreenInfo);
        this.f17691eablkybsjg = h1Var;
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg zynmafqrjb() {
        return lereixgezr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        if (this.f17691eablkybsjg.iobyxmoadg()) {
            for (int i13 = 0; i13 < this.f17691eablkybsjg.zoijcleaow().size(); i13++) {
                oc2.iobyxmoadg iobyxmoadgVar2 = new oc2.iobyxmoadg();
                if (i13 >= 6) {
                    int size = this.f17691eablkybsjg.zoijcleaow().size() - 1;
                    iobyxmoadgVar2.put(f17689gxszxtbevo, (Serializable) ((u1.ppxfxbqfkf) this.f17691eablkybsjg.zoijcleaow().get(size)).f112467iobyxmoadg);
                    iobyxmoadgVar2.put(f17690lqeggnwhkg, (Serializable) ((u1.ppxfxbqfkf) this.f17691eablkybsjg.zoijcleaow().get(size)).f112468zoijcleaow);
                    iobyxmoadgVar.put(String.valueOf(i13), iobyxmoadgVar2);
                    return iobyxmoadgVar;
                }
                iobyxmoadgVar2.put(f17689gxszxtbevo, (Serializable) ((u1.ppxfxbqfkf) this.f17691eablkybsjg.zoijcleaow().get(i13)).f112467iobyxmoadg);
                iobyxmoadgVar2.put(f17690lqeggnwhkg, (Serializable) ((u1.ppxfxbqfkf) this.f17691eablkybsjg.zoijcleaow().get(i13)).f112468zoijcleaow);
                iobyxmoadgVar.put(String.valueOf(i13), iobyxmoadgVar2);
            }
        }
        return iobyxmoadgVar;
    }
}
