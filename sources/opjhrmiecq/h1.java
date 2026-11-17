package opjhrmiecq;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class h1 implements x.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f73577iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f73578zoijcleaow;

    public h1(tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        this.f73577iobyxmoadg = iobyxmoadgVar;
        this.f73578zoijcleaow = iobyxmoadgVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(List list, List list2, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) list.get(i13);
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.lmojexxdyd(iobyxmoadgVar, (androidx.compose.ui.layout.kcexrzcfyt) vdvldrhtssVar.iobyxmoadg(), ((w0.agtfadlqog) vdvldrhtssVar.wkgbmnqykc()).rgvfuqvkyq(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                gg.vdvldrhtss vdvldrhtssVar2 = (gg.vdvldrhtss) list2.get(i14);
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = (androidx.compose.ui.layout.kcexrzcfyt) vdvldrhtssVar2.iobyxmoadg();
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) vdvldrhtssVar2.wkgbmnqykc();
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.lmojexxdyd(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar2 != null ? ((w0.agtfadlqog) iobyxmoadgVar2.invoke()).rgvfuqvkyq() : w0.agtfadlqog.f118237zoijcleaow.zoijcleaow(), 0.0f, 2, null);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (!(((x.pmvmpeiblj) obj).lqeggnwhkg() instanceof l1)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.f73578zoijcleaow.invoke();
        final ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                g.lqeggnwhkg lqeggnwhkgVar = (g.lqeggnwhkg) list2.get(i14);
                gg.vdvldrhtss vdvldrhtssVar = lqeggnwhkgVar != null ? new gg.vdvldrhtss(((x.pmvmpeiblj) arrayList.get(i14)).sflfametgt(w0.ppxfxbqfkf.zoijcleaow(0, (int) Math.floor(lqeggnwhkgVar.dxjokdxxww() - lqeggnwhkgVar.nufgyqmvbu()), 0, (int) Math.floor(lqeggnwhkgVar.eablkybsjg() - lqeggnwhkgVar.gtknphoqwx()), 5, null)), w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) Math.round(lqeggnwhkgVar.nufgyqmvbu())) << 32) | (((long) Math.round(lqeggnwhkgVar.gtknphoqwx())) & 4294967295L)))) : null;
                if (vdvldrhtssVar != null) {
                    arrayList3.add(vdvldrhtssVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            Object obj2 = list.get(i15);
            if (((x.pmvmpeiblj) obj2).lqeggnwhkg() instanceof l1) {
                arrayList4.add(obj2);
            }
        }
        final List listIstkbnxepw = pmvmpeiblj.istkbnxepw(arrayList4, this.f73577iobyxmoadg);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.draadjrbmk(j13), w0.zoijcleaow.gtknphoqwx(j13), null, new tg.draadjrbmk() { // from class: opjhrmiecq.g1
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj3) {
                return h1.wkgbmnqykc(arrayList2, listIstkbnxepw, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj3);
            }
        }, 4, null);
    }
}
