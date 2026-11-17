package cl;

import bl.esjtqupxsv;
import hg.jyumaefscl;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final bl.gxszxtbevo f19963eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final bl.gxszxtbevo f19964iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final bl.gxszxtbevo f19965ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final bl.gxszxtbevo f19966wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final bl.gxszxtbevo f19967zoijcleaow;

    static {
        bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar = bl.gxszxtbevo.f16674iwizpuwonk;
        f19964iobyxmoadg = iobyxmoadgVar.wkgbmnqykc(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
        f19967zoijcleaow = iobyxmoadgVar.wkgbmnqykc("\\");
        f19965ppxfxbqfkf = iobyxmoadgVar.wkgbmnqykc("/\\");
        f19966wkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(".");
        f19963eablkybsjg = iobyxmoadgVar.wkgbmnqykc("..");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean agtfadlqog(esjtqupxsv esjtqupxsvVar) {
        return esjtqupxsvVar.zoijcleaow().btonecajqb(f19963eablkybsjg) && (esjtqupxsvVar.zoijcleaow().hcddaimhww() == 2 || esjtqupxsvVar.zoijcleaow().yadqdtsiqt(esjtqupxsvVar.zoijcleaow().hcddaimhww() + (-3), f19964iobyxmoadg, 0, 1) || esjtqupxsvVar.zoijcleaow().yadqdtsiqt(esjtqupxsvVar.zoijcleaow().hcddaimhww() + (-3), f19967zoijcleaow, 0, 1));
    }

    public static final esjtqupxsv btonecajqb(esjtqupxsv esjtqupxsvVar, esjtqupxsv child, boolean z13) {
        zdlpuopuiu.btonecajqb(esjtqupxsvVar, "<this>");
        zdlpuopuiu.btonecajqb(child, "child");
        if (child.eablkybsjg() || child.agtfadlqog() != null) {
            return child;
        }
        bl.gxszxtbevo gxszxtbevoVarWflxmlrfwp = wflxmlrfwp(esjtqupxsvVar);
        if (gxszxtbevoVarWflxmlrfwp == null && (gxszxtbevoVarWflxmlrfwp = wflxmlrfwp(child)) == null) {
            gxszxtbevoVarWflxmlrfwp = kcexrzcfyt(esjtqupxsv.f16669jyumaefscl);
        }
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        ppxfxbqfkfVar.t(esjtqupxsvVar.zoijcleaow());
        if (ppxfxbqfkfVar.dsvhmnatus() > 0) {
            ppxfxbqfkfVar.t(gxszxtbevoVarWflxmlrfwp);
        }
        ppxfxbqfkfVar.t(child.zoijcleaow());
        return vdvldrhtss(ppxfxbqfkfVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int draadjrbmk(esjtqupxsv esjtqupxsvVar) {
        int iCdpycssgdh = bl.gxszxtbevo.cdpycssgdh(esjtqupxsvVar.zoijcleaow(), f19964iobyxmoadg, 0, 2, null);
        return iCdpycssgdh != -1 ? iCdpycssgdh : bl.gxszxtbevo.cdpycssgdh(esjtqupxsvVar.zoijcleaow(), f19967zoijcleaow, 0, 2, null);
    }

    public static final esjtqupxsv gtknphoqwx(String str, boolean z13) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return vdvldrhtss(new bl.ppxfxbqfkf().metgxyhuhe(str), z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bl.gxszxtbevo kcexrzcfyt(String str) {
        if (zdlpuopuiu.eablkybsjg(str, CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
            return f19964iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(str, "\\")) {
            return f19967zoijcleaow;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ojitshcjhn(esjtqupxsv esjtqupxsvVar) {
        if (esjtqupxsvVar.zoijcleaow().hcddaimhww() == 0) {
            return -1;
        }
        if (esjtqupxsvVar.zoijcleaow().draadjrbmk(0) == 47) {
            return 1;
        }
        if (esjtqupxsvVar.zoijcleaow().draadjrbmk(0) == 92) {
            if (esjtqupxsvVar.zoijcleaow().hcddaimhww() <= 2 || esjtqupxsvVar.zoijcleaow().draadjrbmk(1) != 92) {
                return 1;
            }
            int iZdlpuopuiu = esjtqupxsvVar.zoijcleaow().zdlpuopuiu(f19967zoijcleaow, 2);
            return iZdlpuopuiu == -1 ? esjtqupxsvVar.zoijcleaow().hcddaimhww() : iZdlpuopuiu;
        }
        if (esjtqupxsvVar.zoijcleaow().hcddaimhww() > 2 && esjtqupxsvVar.zoijcleaow().draadjrbmk(1) == 58 && esjtqupxsvVar.zoijcleaow().draadjrbmk(2) == 92) {
            char cDraadjrbmk = (char) esjtqupxsvVar.zoijcleaow().draadjrbmk(0);
            if ('a' <= cDraadjrbmk && cDraadjrbmk < '{') {
                return 3;
            }
            if ('A' <= cDraadjrbmk && cDraadjrbmk < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final bl.gxszxtbevo oxmwwwfdhm(byte b13) {
        if (b13 == 47) {
            return f19964iobyxmoadg;
        }
        if (b13 == 92) {
            return f19967zoijcleaow;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b13));
    }

    private static final boolean rgvfuqvkyq(bl.ppxfxbqfkf ppxfxbqfkfVar, bl.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVar, f19967zoijcleaow) || ppxfxbqfkfVar.dsvhmnatus() < 2 || ppxfxbqfkfVar.agtfadlqog(1L) != 58) {
            return false;
        }
        char cAgtfadlqog = (char) ppxfxbqfkfVar.agtfadlqog(0L);
        return ('a' <= cAgtfadlqog && cAgtfadlqog < '{') || ('A' <= cAgtfadlqog && cAgtfadlqog < '[');
    }

    public static final esjtqupxsv vdvldrhtss(bl.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) throws EOFException {
        bl.gxszxtbevo gxszxtbevoVar;
        bl.gxszxtbevo gxszxtbevoVarD;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        bl.ppxfxbqfkf ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
        bl.gxszxtbevo gxszxtbevoVarOxmwwwfdhm = null;
        int i13 = 0;
        while (true) {
            if (!ppxfxbqfkfVar.tzroggbefp(0L, f19964iobyxmoadg)) {
                gxszxtbevoVar = f19967zoijcleaow;
                if (!ppxfxbqfkfVar.tzroggbefp(0L, gxszxtbevoVar)) {
                    break;
                }
            }
            byte b13 = ppxfxbqfkfVar.readByte();
            if (gxszxtbevoVarOxmwwwfdhm == null) {
                gxszxtbevoVarOxmwwwfdhm = oxmwwwfdhm(b13);
            }
            i13++;
        }
        boolean z14 = i13 >= 2 && zdlpuopuiu.eablkybsjg(gxszxtbevoVarOxmwwwfdhm, gxszxtbevoVar);
        if (z14) {
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarOxmwwwfdhm);
            ppxfxbqfkfVar2.t(gxszxtbevoVarOxmwwwfdhm);
            ppxfxbqfkfVar2.t(gxszxtbevoVarOxmwwwfdhm);
        } else if (i13 > 0) {
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVarOxmwwwfdhm);
            ppxfxbqfkfVar2.t(gxszxtbevoVarOxmwwwfdhm);
        } else {
            long jQ = ppxfxbqfkfVar.Q(f19965ppxfxbqfkf);
            if (gxszxtbevoVarOxmwwwfdhm == null) {
                gxszxtbevoVarOxmwwwfdhm = jQ == -1 ? kcexrzcfyt(esjtqupxsv.f16669jyumaefscl) : oxmwwwfdhm(ppxfxbqfkfVar.agtfadlqog(jQ));
            }
            if (rgvfuqvkyq(ppxfxbqfkfVar, gxszxtbevoVarOxmwwwfdhm)) {
                if (jQ == 2) {
                    ppxfxbqfkfVar2.zeieaojujs(ppxfxbqfkfVar, 3L);
                } else {
                    ppxfxbqfkfVar2.zeieaojujs(ppxfxbqfkfVar, 2L);
                }
            }
        }
        boolean z15 = ppxfxbqfkfVar2.dsvhmnatus() > 0;
        ArrayList arrayList = new ArrayList();
        while (!ppxfxbqfkfVar.n()) {
            long jQ2 = ppxfxbqfkfVar.Q(f19965ppxfxbqfkf);
            if (jQ2 == -1) {
                gxszxtbevoVarD = ppxfxbqfkfVar.cqumvgiudr();
            } else {
                gxszxtbevoVarD = ppxfxbqfkfVar.d(jQ2);
                ppxfxbqfkfVar.readByte();
            }
            bl.gxszxtbevo gxszxtbevoVar2 = f19963eablkybsjg;
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarD, gxszxtbevoVar2)) {
                if (!z15 || !arrayList.isEmpty()) {
                    if (!z13 || (!z15 && (arrayList.isEmpty() || zdlpuopuiu.eablkybsjg(jyumaefscl.skhdrjzrfn(arrayList), gxszxtbevoVar2)))) {
                        arrayList.add(gxszxtbevoVarD);
                    } else if (!z14 || arrayList.size() != 1) {
                        jyumaefscl.cllcsxoeiz(arrayList);
                    }
                }
            } else if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVarD, f19966wkgbmnqykc) && !zdlpuopuiu.eablkybsjg(gxszxtbevoVarD, bl.gxszxtbevo.f16673cqumvgiudr)) {
                arrayList.add(gxszxtbevoVarD);
            }
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 > 0) {
                ppxfxbqfkfVar2.t(gxszxtbevoVarOxmwwwfdhm);
            }
            ppxfxbqfkfVar2.t((bl.gxszxtbevo) arrayList.get(i14));
        }
        if (ppxfxbqfkfVar2.dsvhmnatus() == 0) {
            ppxfxbqfkfVar2.t(f19966wkgbmnqykc);
        }
        return new esjtqupxsv(ppxfxbqfkfVar2.cqumvgiudr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bl.gxszxtbevo wflxmlrfwp(esjtqupxsv esjtqupxsvVar) {
        bl.gxszxtbevo gxszxtbevoVarZoijcleaow = esjtqupxsvVar.zoijcleaow();
        bl.gxszxtbevo gxszxtbevoVar = f19964iobyxmoadg;
        if (bl.gxszxtbevo.cqumvgiudr(gxszxtbevoVarZoijcleaow, gxszxtbevoVar, 0, 2, null) != -1) {
            return gxszxtbevoVar;
        }
        bl.gxszxtbevo gxszxtbevoVarZoijcleaow2 = esjtqupxsvVar.zoijcleaow();
        bl.gxszxtbevo gxszxtbevoVar2 = f19967zoijcleaow;
        if (bl.gxszxtbevo.cqumvgiudr(gxszxtbevoVarZoijcleaow2, gxszxtbevoVar2, 0, 2, null) != -1) {
            return gxszxtbevoVar2;
        }
        return null;
    }
}
