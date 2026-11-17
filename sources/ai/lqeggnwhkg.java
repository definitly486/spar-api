package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import zi.ageimvtcrz;
import zi.grlcpdaxtj;
import zi.ipoelvxyzq;
import zi.iwxlajgraz;
import zi.iyctptxqzt;
import zi.mhtqkkgtqm;
import zi.opjhrmiecq;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vh.eablkybsjg f1966iobyxmoadg;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zi.kegysxyocb f1967iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f1968zoijcleaow;

        public iobyxmoadg(zi.kegysxyocb kegysxyocbVar, int i13) {
            this.f1967iobyxmoadg = kegysxyocbVar;
            this.f1968zoijcleaow = i13;
        }

        public final int iobyxmoadg() {
            return this.f1968zoijcleaow;
        }

        public final zi.kegysxyocb zoijcleaow() {
            return this.f1967iobyxmoadg;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zi.ikoacuggdj f1969iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f1970ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f1971zoijcleaow;

        public zoijcleaow(zi.ikoacuggdj ikoacuggdjVar, int i13, boolean z13) {
            this.f1969iobyxmoadg = ikoacuggdjVar;
            this.f1971zoijcleaow = i13;
            this.f1970ppxfxbqfkf = z13;
        }

        public final boolean iobyxmoadg() {
            return this.f1970ppxfxbqfkf;
        }

        public final zi.ikoacuggdj ppxfxbqfkf() {
            return this.f1969iobyxmoadg;
        }

        public final int zoijcleaow() {
            return this.f1971zoijcleaow;
        }
    }

    public lqeggnwhkg(vh.eablkybsjg javaResolverSettings) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaResolverSettings, "javaResolverSettings");
        this.f1966iobyxmoadg = javaResolverSettings;
    }

    private final zi.ikoacuggdj eablkybsjg(zi.ikoacuggdj ikoacuggdjVar) {
        return this.f1966iobyxmoadg.iobyxmoadg() ? zi.metgxyhuhe.nufgyqmvbu(ikoacuggdjVar, true) : new btonecajqb(ikoacuggdjVar);
    }

    static /* synthetic */ zoijcleaow ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, zi.ikoacuggdj ikoacuggdjVar, tg.draadjrbmk draadjrbmkVar, int i13, metgxyhuhe metgxyhuheVar, boolean z13, boolean z14, int i14, Object obj) {
        return lqeggnwhkgVar.zoijcleaow(ikoacuggdjVar, draadjrbmkVar, i13, metgxyhuheVar, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    private final iobyxmoadg wkgbmnqykc(grlcpdaxtj grlcpdaxtjVar, tg.draadjrbmk draadjrbmkVar, int i13, boolean z13) {
        zi.kegysxyocb kegysxyocbVarPpxfxbqfkf;
        zi.kegysxyocb kegysxyocbVarWkgbmnqykc = null;
        if (zi.ulzqkzuiru.iobyxmoadg(grlcpdaxtjVar)) {
            return new iobyxmoadg(null, 1);
        }
        if (!(grlcpdaxtjVar instanceof zi.ylkuphrtab)) {
            if (!(grlcpdaxtjVar instanceof zi.ikoacuggdj)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf(this, (zi.ikoacuggdj) grlcpdaxtjVar, draadjrbmkVar, i13, metgxyhuhe.INFLEXIBLE, false, z13, 8, null);
            return new iobyxmoadg(zoijcleaowVarPpxfxbqfkf.iobyxmoadg() ? ipoelvxyzq.wkgbmnqykc(grlcpdaxtjVar, zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf()) : zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf(), zoijcleaowVarPpxfxbqfkf.zoijcleaow());
        }
        boolean z14 = grlcpdaxtjVar instanceof zi.jhduphickx;
        zi.ylkuphrtab ylkuphrtabVar = (zi.ylkuphrtab) grlcpdaxtjVar;
        zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(ylkuphrtabVar.eslsurpljm(), draadjrbmkVar, i13, metgxyhuhe.FLEXIBLE_LOWER, z14, z13);
        zoijcleaow zoijcleaowVarZoijcleaow2 = zoijcleaow(ylkuphrtabVar.krqnebusok(), draadjrbmkVar, i13, metgxyhuhe.FLEXIBLE_UPPER, z14, z13);
        zoijcleaowVarZoijcleaow.zoijcleaow();
        zoijcleaowVarZoijcleaow2.zoijcleaow();
        if (zoijcleaowVarZoijcleaow.ppxfxbqfkf() != null || zoijcleaowVarZoijcleaow2.ppxfxbqfkf() != null) {
            if (zoijcleaowVarZoijcleaow.iobyxmoadg() || zoijcleaowVarZoijcleaow2.iobyxmoadg()) {
                zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf = zoijcleaowVarZoijcleaow2.ppxfxbqfkf();
                if (ikoacuggdjVarPpxfxbqfkf == null) {
                    kegysxyocbVarPpxfxbqfkf = zoijcleaowVarZoijcleaow.ppxfxbqfkf();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVarPpxfxbqfkf);
                } else {
                    zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf2 = zoijcleaowVarZoijcleaow.ppxfxbqfkf();
                    if (ikoacuggdjVarPpxfxbqfkf2 == null) {
                        ikoacuggdjVarPpxfxbqfkf2 = ikoacuggdjVarPpxfxbqfkf;
                    }
                    kegysxyocbVarPpxfxbqfkf = zi.ntlheqmsrt.eablkybsjg(ikoacuggdjVarPpxfxbqfkf2, ikoacuggdjVarPpxfxbqfkf);
                    if (kegysxyocbVarPpxfxbqfkf == null) {
                        kegysxyocbVarPpxfxbqfkf = zoijcleaowVarZoijcleaow.ppxfxbqfkf();
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVarPpxfxbqfkf);
                    }
                }
                kegysxyocbVarWkgbmnqykc = ipoelvxyzq.wkgbmnqykc(grlcpdaxtjVar, kegysxyocbVarPpxfxbqfkf);
            } else if (z14) {
                zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf3 = zoijcleaowVarZoijcleaow.ppxfxbqfkf();
                if (ikoacuggdjVarPpxfxbqfkf3 == null) {
                    ikoacuggdjVarPpxfxbqfkf3 = ylkuphrtabVar.eslsurpljm();
                }
                zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf4 = zoijcleaowVarZoijcleaow2.ppxfxbqfkf();
                if (ikoacuggdjVarPpxfxbqfkf4 == null) {
                    ikoacuggdjVarPpxfxbqfkf4 = ylkuphrtabVar.krqnebusok();
                }
                kegysxyocbVarWkgbmnqykc = new xh.gtknphoqwx(ikoacuggdjVarPpxfxbqfkf3, ikoacuggdjVarPpxfxbqfkf4);
            } else {
                zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf5 = zoijcleaowVarZoijcleaow.ppxfxbqfkf();
                if (ikoacuggdjVarPpxfxbqfkf5 == null) {
                    ikoacuggdjVarPpxfxbqfkf5 = ylkuphrtabVar.eslsurpljm();
                }
                zi.ikoacuggdj ikoacuggdjVarPpxfxbqfkf6 = zoijcleaowVarZoijcleaow2.ppxfxbqfkf();
                if (ikoacuggdjVarPpxfxbqfkf6 == null) {
                    ikoacuggdjVarPpxfxbqfkf6 = ylkuphrtabVar.krqnebusok();
                }
                kegysxyocbVarWkgbmnqykc = zi.ntlheqmsrt.eablkybsjg(ikoacuggdjVarPpxfxbqfkf5, ikoacuggdjVarPpxfxbqfkf6);
            }
        }
        return new iobyxmoadg(kegysxyocbVarWkgbmnqykc, zoijcleaowVarZoijcleaow.zoijcleaow());
    }

    private final zoijcleaow zoijcleaow(zi.ikoacuggdj ikoacuggdjVar, tg.draadjrbmk draadjrbmkVar, int i13, metgxyhuhe metgxyhuheVar, boolean z13, boolean z14) {
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab;
        zeieaojujs zeieaojujsVarGrlcpdaxtj;
        boolean z15;
        iobyxmoadg iobyxmoadgVar;
        iwxlajgraz iwxlajgrazVarKcexrzcfyt;
        tg.draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
        boolean zIobyxmoadg = rlfsiqarku.iobyxmoadg(metgxyhuheVar);
        boolean z16 = (z14 && z13) ? false : true;
        zi.kegysxyocb kegysxyocbVar = null;
        if ((zIobyxmoadg || !ikoacuggdjVar.fyldjkxazc().isEmpty()) && (nufgyqmvbuVarYlkuphrtab = ikoacuggdjVar.grlcpdaxtj().ylkuphrtab()) != null) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) draadjrbmkVar2.invoke(Integer.valueOf(i13));
            jh.nufgyqmvbu nufgyqmvbuVarGxszxtbevo = uwvvkdfqfp.gxszxtbevo(nufgyqmvbuVarYlkuphrtab, nufgyqmvbuVar, metgxyhuheVar);
            Boolean boolNufgyqmvbu = uwvvkdfqfp.nufgyqmvbu(nufgyqmvbuVar, metgxyhuheVar);
            if (nufgyqmvbuVarGxszxtbevo == null || (zeieaojujsVarGrlcpdaxtj = nufgyqmvbuVarGxszxtbevo.btonecajqb()) == null) {
                zeieaojujsVarGrlcpdaxtj = ikoacuggdjVar.grlcpdaxtj();
            }
            zeieaojujs zeieaojujsVar = zeieaojujsVarGrlcpdaxtj;
            int iIobyxmoadg = i13 + 1;
            List listFyldjkxazc = ikoacuggdjVar.fyldjkxazc();
            List parameters = zeieaojujsVar.getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
            Iterator it = listFyldjkxazc.iterator();
            Iterator it2 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(hg.jyumaefscl.cqumvgiudr(listFyldjkxazc, 10), hg.jyumaefscl.cqumvgiudr(parameters, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                jh.yfnezrywwk yfnezrywwkVar = (jh.yfnezrywwk) it2.next();
                iwxlajgraz iwxlajgrazVar = (iwxlajgraz) next;
                if (z16) {
                    z15 = z16;
                    if (!iwxlajgrazVar.zoijcleaow()) {
                        iobyxmoadgVar = wkgbmnqykc(iwxlajgrazVar.getType().jrbgnlbqoe(), draadjrbmkVar2, iIobyxmoadg, z14);
                    } else if (((nufgyqmvbu) draadjrbmkVar2.invoke(Integer.valueOf(iIobyxmoadg))).gxszxtbevo() == gtknphoqwx.FORCE_FLEXIBILITY) {
                        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = iwxlajgrazVar.getType().jrbgnlbqoe();
                        iobyxmoadgVar = new iobyxmoadg(zi.ntlheqmsrt.eablkybsjg(zi.jpowsppfya.ppxfxbqfkf(grlcpdaxtjVarJrbgnlbqoe).fmlbqenlif(false), zi.jpowsppfya.wkgbmnqykc(grlcpdaxtjVarJrbgnlbqoe).fmlbqenlif(true)), 1);
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(null, 1);
                    }
                } else {
                    z15 = z16;
                    iobyxmoadgVar = new iobyxmoadg(kegysxyocbVar, 0);
                }
                iIobyxmoadg += iobyxmoadgVar.iobyxmoadg();
                if (iobyxmoadgVar.zoijcleaow() != null) {
                    zi.kegysxyocb kegysxyocbVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                    mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "getProjectionKind(...)");
                    iwxlajgrazVarKcexrzcfyt = ej.wkgbmnqykc.gtknphoqwx(kegysxyocbVarZoijcleaow, mhtqkkgtqmVarPpxfxbqfkf, yfnezrywwkVar);
                } else if (nufgyqmvbuVarGxszxtbevo == null || iwxlajgrazVar.zoijcleaow()) {
                    iwxlajgrazVarKcexrzcfyt = nufgyqmvbuVarGxszxtbevo != null ? ageimvtcrz.kcexrzcfyt(yfnezrywwkVar) : null;
                } else {
                    zi.kegysxyocb type = iwxlajgrazVar.getType();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                    mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf2 = iwxlajgrazVar.ppxfxbqfkf();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf2, "getProjectionKind(...)");
                    iwxlajgrazVarKcexrzcfyt = ej.wkgbmnqykc.gtknphoqwx(type, mhtqkkgtqmVarPpxfxbqfkf2, yfnezrywwkVar);
                }
                arrayList.add(iwxlajgrazVarKcexrzcfyt);
                draadjrbmkVar2 = draadjrbmkVar;
                z16 = z15;
                kegysxyocbVar = null;
            }
            int i14 = iIobyxmoadg - i13;
            if (nufgyqmvbuVarGxszxtbevo == null && boolNufgyqmvbu == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((iwxlajgraz) it3.next()) == null);
                }
                return new zoijcleaow(null, i14, false);
            }
            kh.nufgyqmvbu annotations = ikoacuggdjVar.getAnnotations();
            gxszxtbevo gxszxtbevoVar = uwvvkdfqfp.f2003zoijcleaow;
            if (nufgyqmvbuVarGxszxtbevo == null) {
                gxszxtbevoVar = null;
            }
            boolean z17 = false;
            opjhrmiecq opjhrmiecqVarZoijcleaow = iyctptxqzt.zoijcleaow(uwvvkdfqfp.eablkybsjg(hg.jyumaefscl.oxmwwwfdhm(annotations, gxszxtbevoVar, boolNufgyqmvbu != null ? uwvvkdfqfp.lqeggnwhkg() : null)));
            List listFyldjkxazc2 = ikoacuggdjVar.fyldjkxazc();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listFyldjkxazc2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(hg.jyumaefscl.cqumvgiudr(arrayList, 10), hg.jyumaefscl.cqumvgiudr(listFyldjkxazc2, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) it5.next();
                iwxlajgraz iwxlajgrazVar3 = (iwxlajgraz) next2;
                if (iwxlajgrazVar3 != null) {
                    iwxlajgrazVar2 = iwxlajgrazVar3;
                }
                arrayList2.add(iwxlajgrazVar2);
            }
            zi.ikoacuggdj ikoacuggdjVarGtknphoqwx = zi.ntlheqmsrt.gtknphoqwx(opjhrmiecqVarZoijcleaow, zeieaojujsVar, arrayList2, boolNufgyqmvbu != null ? boolNufgyqmvbu.booleanValue() : ikoacuggdjVar.mhtqkkgtqm(), null, 16, null);
            if (nufgyqmvbuVar.wkgbmnqykc()) {
                ikoacuggdjVarGtknphoqwx = eablkybsjg(ikoacuggdjVarGtknphoqwx);
            }
            if (boolNufgyqmvbu != null && nufgyqmvbuVar.lqeggnwhkg()) {
                z17 = true;
            }
            return new zoijcleaow(ikoacuggdjVarGtknphoqwx, i14, z17);
        }
        return new zoijcleaow(null, 1, false);
    }

    public final zi.kegysxyocb iobyxmoadg(zi.kegysxyocb kegysxyocbVar, tg.draadjrbmk qualifiers, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifiers, "qualifiers");
        return wkgbmnqykc(kegysxyocbVar.jrbgnlbqoe(), qualifiers, 0, z13).zoijcleaow();
    }
}
