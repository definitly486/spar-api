package zi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class metgxyhuhe {
    public static final ikoacuggdj btonecajqb(ikoacuggdj ikoacuggdjVar, ikoacuggdj abbreviatedType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ikoacuggdjVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(abbreviatedType, "abbreviatedType");
        return ulzqkzuiru.iobyxmoadg(ikoacuggdjVar) ? ikoacuggdjVar : new iobyxmoadg(ikoacuggdjVar, abbreviatedType);
    }

    public static /* synthetic */ ikoacuggdj dxjokdxxww(ikoacuggdj ikoacuggdjVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return nufgyqmvbu(ikoacuggdjVar, z13);
    }

    public static final grlcpdaxtj eablkybsjg(grlcpdaxtj grlcpdaxtjVar, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(grlcpdaxtjVar, "<this>");
        esjtqupxsv esjtqupxsvVarPpxfxbqfkf = esjtqupxsv.iobyxmoadg.ppxfxbqfkf(esjtqupxsv.f130025iwizpuwonk, grlcpdaxtjVar, z13, false, 4, null);
        if (esjtqupxsvVarPpxfxbqfkf != null) {
            return esjtqupxsvVarPpxfxbqfkf;
        }
        ikoacuggdj ikoacuggdjVarLqeggnwhkg = lqeggnwhkg(grlcpdaxtjVar);
        return ikoacuggdjVarLqeggnwhkg != null ? ikoacuggdjVarLqeggnwhkg : grlcpdaxtjVar.fmlbqenlif(false);
    }

    public static final aj.dxjokdxxww gtknphoqwx(aj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return new aj.dxjokdxxww(dxjokdxxwwVar.krqnebusok(), dxjokdxxwwVar.grlcpdaxtj(), dxjokdxxwwVar.b(), dxjokdxxwwVar.ipoelvxyzq(), dxjokdxxwwVar.mhtqkkgtqm(), true);
    }

    public static /* synthetic */ grlcpdaxtj gxszxtbevo(grlcpdaxtj grlcpdaxtjVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return eablkybsjg(grlcpdaxtjVar, z13);
    }

    public static final iobyxmoadg iobyxmoadg(kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        if (grlcpdaxtjVarJrbgnlbqoe instanceof iobyxmoadg) {
            return (iobyxmoadg) grlcpdaxtjVarJrbgnlbqoe;
        }
        return null;
    }

    private static final ikoacuggdj lqeggnwhkg(kegysxyocb kegysxyocbVar) {
        stevsuqkhv stevsuqkhvVarWkgbmnqykc;
        zeieaojujs zeieaojujsVarGrlcpdaxtj = kegysxyocbVar.grlcpdaxtj();
        stevsuqkhv stevsuqkhvVar = zeieaojujsVarGrlcpdaxtj instanceof stevsuqkhv ? (stevsuqkhv) zeieaojujsVarGrlcpdaxtj : null;
        if (stevsuqkhvVar == null || (stevsuqkhvVarWkgbmnqykc = wkgbmnqykc(stevsuqkhvVar)) == null) {
            return null;
        }
        return stevsuqkhvVarWkgbmnqykc.btonecajqb();
    }

    public static final ikoacuggdj nufgyqmvbu(ikoacuggdj ikoacuggdjVar, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ikoacuggdjVar, "<this>");
        esjtqupxsv esjtqupxsvVarPpxfxbqfkf = esjtqupxsv.iobyxmoadg.ppxfxbqfkf(esjtqupxsv.f130025iwizpuwonk, ikoacuggdjVar, z13, false, 4, null);
        if (esjtqupxsvVarPpxfxbqfkf != null) {
            return esjtqupxsvVarPpxfxbqfkf;
        }
        ikoacuggdj ikoacuggdjVarLqeggnwhkg = lqeggnwhkg(ikoacuggdjVar);
        return ikoacuggdjVarLqeggnwhkg == null ? ikoacuggdjVar.fmlbqenlif(false) : ikoacuggdjVarLqeggnwhkg;
    }

    public static final boolean ppxfxbqfkf(kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return kegysxyocbVar.jrbgnlbqoe() instanceof esjtqupxsv;
    }

    private static final stevsuqkhv wkgbmnqykc(stevsuqkhv stevsuqkhvVar) {
        kegysxyocb kegysxyocbVar;
        Collection collectionZoijcleaow = stevsuqkhvVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionZoijcleaow, 10));
        Iterator it = collectionZoijcleaow.iterator();
        boolean z13 = false;
        while (true) {
            kegysxyocbVar = null;
            if (!it.hasNext()) {
                break;
            }
            kegysxyocb kegysxyocbVarGxszxtbevo = (kegysxyocb) it.next();
            if (ageimvtcrz.draadjrbmk(kegysxyocbVarGxszxtbevo)) {
                kegysxyocbVarGxszxtbevo = gxszxtbevo(kegysxyocbVarGxszxtbevo.jrbgnlbqoe(), false, 1, null);
                z13 = true;
            }
            arrayList.add(kegysxyocbVarGxszxtbevo);
        }
        if (!z13) {
            return null;
        }
        kegysxyocb kegysxyocbVarDraadjrbmk = stevsuqkhvVar.draadjrbmk();
        if (kegysxyocbVarDraadjrbmk != null) {
            if (ageimvtcrz.draadjrbmk(kegysxyocbVarDraadjrbmk)) {
                kegysxyocbVarDraadjrbmk = gxszxtbevo(kegysxyocbVarDraadjrbmk.jrbgnlbqoe(), false, 1, null);
            }
            kegysxyocbVar = kegysxyocbVarDraadjrbmk;
        }
        return new stevsuqkhv(arrayList).kcexrzcfyt(kegysxyocbVar);
    }

    public static final ikoacuggdj zoijcleaow(kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(kegysxyocbVar);
        if (iobyxmoadgVarIobyxmoadg != null) {
            return iobyxmoadgVarIobyxmoadg.c();
        }
        return null;
    }
}
