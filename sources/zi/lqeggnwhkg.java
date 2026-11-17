package zi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lqeggnwhkg f130055iobyxmoadg = new lqeggnwhkg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static boolean f130056zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f130057iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f130058zoijcleaow;

        static {
            int[] iArr = new int[dj.kcexrzcfyt.values().length];
            try {
                iArr[dj.kcexrzcfyt.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dj.kcexrzcfyt.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dj.kcexrzcfyt.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f130057iobyxmoadg = iArr;
            int[] iArr2 = new int[lrnfpwlwnk.zoijcleaow.values().length];
            try {
                iArr2[lrnfpwlwnk.zoijcleaow.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[lrnfpwlwnk.zoijcleaow.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lrnfpwlwnk.zoijcleaow.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f130058zoijcleaow = iArr2;
        }
    }

    private lqeggnwhkg() {
    }

    private final List btonecajqb(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.wflxmlrfwp wflxmlrfwpVar) {
        return pmvmpeiblj(lrnfpwlwnkVar, dxjokdxxww(lrnfpwlwnkVar, btonecajqbVar, wflxmlrfwpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn cqumvgiudr(Collection collection, lrnfpwlwnk lrnfpwlwnkVar, dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar, lrnfpwlwnk.iobyxmoadg runForkingPoint) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.iobyxmoadg(new gxszxtbevo(lrnfpwlwnkVar, ojitshcjhnVar, (dj.btonecajqb) it.next(), btonecajqbVar));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final List dxjokdxxww(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.wflxmlrfwp wflxmlrfwpVar) {
        lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVarJlmebxxoox;
        dj.btonecajqb btonecajqbVar2 = btonecajqbVar;
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        List listAgtfadlqog = ojitshcjhnVarBtonecajqb.agtfadlqog(btonecajqbVar2, wflxmlrfwpVar);
        if (listAgtfadlqog != null) {
            return listAgtfadlqog;
        }
        if (!ojitshcjhnVarBtonecajqb.wypolnanlu(wflxmlrfwpVar) && ojitshcjhnVarBtonecajqb.lxfrhoxuzk(btonecajqbVar2)) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        if (ojitshcjhnVarBtonecajqb.jpowsppfya(wflxmlrfwpVar)) {
            if (!ojitshcjhnVarBtonecajqb.auzgnhcxok(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2), wflxmlrfwpVar)) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            dj.btonecajqb btonecajqbVarKegysxyocb = ojitshcjhnVarBtonecajqb.kegysxyocb(btonecajqbVar2, dj.zoijcleaow.FOR_SUBTYPING);
            if (btonecajqbVarKegysxyocb != null) {
                btonecajqbVar2 = btonecajqbVarKegysxyocb;
            }
            return hg.jyumaefscl.eablkybsjg(btonecajqbVar2);
        }
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        lrnfpwlwnkVar.gtknphoqwx();
        ArrayDeque arrayDequeNufgyqmvbu = lrnfpwlwnkVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDequeNufgyqmvbu);
        Set setDxjokdxxww = lrnfpwlwnkVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(setDxjokdxxww);
        arrayDequeNufgyqmvbu.push(btonecajqbVar2);
        while (!arrayDequeNufgyqmvbu.isEmpty()) {
            if (setDxjokdxxww.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + btonecajqbVar2 + ". Supertypes = " + hg.jyumaefscl.iwxlajgraz(setDxjokdxxww, null, null, null, 0, null, null, 63, null)).toString());
            }
            dj.btonecajqb btonecajqbVar3 = (dj.btonecajqb) arrayDequeNufgyqmvbu.pop();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar3);
            if (setDxjokdxxww.add(btonecajqbVar3)) {
                dj.btonecajqb btonecajqbVarKegysxyocb2 = ojitshcjhnVarBtonecajqb.kegysxyocb(btonecajqbVar3, dj.zoijcleaow.FOR_SUBTYPING);
                if (btonecajqbVarKegysxyocb2 == null) {
                    btonecajqbVarKegysxyocb2 = btonecajqbVar3;
                }
                if (ojitshcjhnVarBtonecajqb.auzgnhcxok(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVarKegysxyocb2), wflxmlrfwpVar)) {
                    gtknphoqwxVar.add(btonecajqbVarKegysxyocb2);
                    ppxfxbqfkfVarJlmebxxoox = lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg;
                } else {
                    ppxfxbqfkfVarJlmebxxoox = ojitshcjhnVarBtonecajqb.tbqsvytpvh(btonecajqbVarKegysxyocb2) == 0 ? lrnfpwlwnk.ppxfxbqfkf.zoijcleaow.f130072iobyxmoadg : lrnfpwlwnkVar.btonecajqb().jlmebxxoox(btonecajqbVarKegysxyocb2);
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarJlmebxxoox, lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg)) {
                    ppxfxbqfkfVarJlmebxxoox = null;
                }
                if (ppxfxbqfkfVarJlmebxxoox != null) {
                    dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = lrnfpwlwnkVar.btonecajqb();
                    Iterator it = ojitshcjhnVarBtonecajqb2.yfnezrywwk(ojitshcjhnVarBtonecajqb2.iobyxmoadg(btonecajqbVar3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeNufgyqmvbu.add(ppxfxbqfkfVarJlmebxxoox.iobyxmoadg(lrnfpwlwnkVar, (dj.dxjokdxxww) it.next()));
                    }
                }
            }
        }
        lrnfpwlwnkVar.eablkybsjg();
        return gtknphoqwxVar;
    }

    private static final boolean eablkybsjg(dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar) {
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = ojitshcjhnVar.iobyxmoadg(btonecajqbVar);
        if (wflxmlrfwpVarIobyxmoadg instanceof dj.nufgyqmvbu) {
            Collection collectionYfnezrywwk = ojitshcjhnVar.yfnezrywwk(wflxmlrfwpVarIobyxmoadg);
            if (!(collectionYfnezrywwk instanceof Collection) || !collectionYfnezrywwk.isEmpty()) {
                Iterator it = collectionYfnezrywwk.iterator();
                while (it.hasNext()) {
                    dj.btonecajqb btonecajqbVarGxszxtbevo = ojitshcjhnVar.gxszxtbevo((dj.dxjokdxxww) it.next());
                    if (btonecajqbVarGxszxtbevo != null && ojitshcjhnVar.oipsdeybqn(btonecajqbVarGxszxtbevo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean esjtqupxsv(lrnfpwlwnk lrnfpwlwnkVar, dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        return f130055iobyxmoadg.kcexrzcfyt(lrnfpwlwnkVar, ojitshcjhnVar.yggfygwlhe(btonecajqbVar), btonecajqbVar2);
    }

    private final boolean gtknphoqwx(lrnfpwlwnk lrnfpwlwnkVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2, boolean z13) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn = lrnfpwlwnkVar.ojitshcjhn(lrnfpwlwnkVar.rgvfuqvkyq(dxjokdxxwwVar));
        dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn2 = lrnfpwlwnkVar.ojitshcjhn(lrnfpwlwnkVar.rgvfuqvkyq(dxjokdxxwwVar2));
        lqeggnwhkg lqeggnwhkgVar = f130055iobyxmoadg;
        Boolean boolNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu(lrnfpwlwnkVar, ojitshcjhnVarBtonecajqb.zdlpuopuiu(dxjokdxxwwVarOjitshcjhn), ojitshcjhnVarBtonecajqb.igdgnonuha(dxjokdxxwwVarOjitshcjhn2));
        if (boolNufgyqmvbu == null) {
            Boolean boolPpxfxbqfkf = lrnfpwlwnkVar.ppxfxbqfkf(dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVarOjitshcjhn2, z13);
            return boolPpxfxbqfkf != null ? boolPpxfxbqfkf.booleanValue() : lqeggnwhkgVar.iwizpuwonk(lrnfpwlwnkVar, ojitshcjhnVarBtonecajqb.zdlpuopuiu(dxjokdxxwwVarOjitshcjhn), ojitshcjhnVarBtonecajqb.igdgnonuha(dxjokdxxwwVarOjitshcjhn2));
        }
        boolean zBooleanValue = boolNufgyqmvbu.booleanValue();
        lrnfpwlwnkVar.ppxfxbqfkf(dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVarOjitshcjhn2, z13);
        return zBooleanValue;
    }

    private static final boolean gxszxtbevo(dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar) {
        return ojitshcjhnVar.oipsdeybqn(btonecajqbVar) || wkgbmnqykc(ojitshcjhnVar, btonecajqbVar);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    private final boolean iwizpuwonk(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        Collection<dj.btonecajqb> arrayList;
        dj.btonecajqb btonecajqbVarGxszxtbevo;
        dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn;
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if (f130056zoijcleaow) {
            if (!ojitshcjhnVarBtonecajqb.zoijcleaow(btonecajqbVar) && !ojitshcjhnVarBtonecajqb.esjtqupxsv(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar))) {
                lrnfpwlwnkVar.draadjrbmk(btonecajqbVar);
            }
            if (!ojitshcjhnVarBtonecajqb.zoijcleaow(btonecajqbVar2)) {
                lrnfpwlwnkVar.draadjrbmk(btonecajqbVar2);
            }
        }
        boolean z13 = false;
        if (!ppxfxbqfkf.f130113iobyxmoadg.wkgbmnqykc(lrnfpwlwnkVar, btonecajqbVar, btonecajqbVar2)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = f130055iobyxmoadg;
        Boolean boolPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf(lrnfpwlwnkVar, ojitshcjhnVarBtonecajqb.zdlpuopuiu(btonecajqbVar), ojitshcjhnVarBtonecajqb.igdgnonuha(btonecajqbVar2));
        if (boolPpxfxbqfkf != null) {
            boolean zBooleanValue = boolPpxfxbqfkf.booleanValue();
            lrnfpwlwnk.wkgbmnqykc(lrnfpwlwnkVar, btonecajqbVar, btonecajqbVar2, false, 4, null);
            return zBooleanValue;
        }
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2);
        boolean z14 = true;
        if ((ojitshcjhnVarBtonecajqb.auzgnhcxok(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar), wflxmlrfwpVarIobyxmoadg) && ojitshcjhnVarBtonecajqb.lereixgezr(wflxmlrfwpVarIobyxmoadg) == 0) || ojitshcjhnVarBtonecajqb.bfopjjpdmp(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2))) {
            return true;
        }
        List<dj.btonecajqb> listAgtfadlqog = lqeggnwhkgVar.agtfadlqog(lrnfpwlwnkVar, btonecajqbVar, wflxmlrfwpVarIobyxmoadg);
        int i13 = 10;
        if (listAgtfadlqog.size() > 1) {
            dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = lrnfpwlwnkVar.btonecajqb();
            dj.vdvldrhtss vdvldrhtssVar = ojitshcjhnVarBtonecajqb2 instanceof dj.vdvldrhtss ? (dj.vdvldrhtss) ojitshcjhnVarBtonecajqb2 : null;
            if (vdvldrhtssVar == null || !vdvldrhtssVar.wwaezpbzkn()) {
                arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listAgtfadlqog, 10));
                for (dj.btonecajqb btonecajqbVar3 : listAgtfadlqog) {
                    btonecajqbVarGxszxtbevo = ojitshcjhnVarBtonecajqb.gxszxtbevo(lrnfpwlwnkVar.ojitshcjhn(btonecajqbVar3));
                    if (btonecajqbVarGxszxtbevo == null) {
                        btonecajqbVar3 = btonecajqbVarGxszxtbevo;
                    }
                    arrayList.add(btonecajqbVar3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (dj.btonecajqb btonecajqbVar4 : listAgtfadlqog) {
                    dj.btonecajqb btonecajqbVarGxszxtbevo2 = ojitshcjhnVarBtonecajqb.gxszxtbevo(lrnfpwlwnkVar.ojitshcjhn(btonecajqbVar4));
                    if (btonecajqbVarGxszxtbevo2 != null) {
                        btonecajqbVar4 = btonecajqbVarGxszxtbevo2;
                    }
                    arrayList.add(btonecajqbVar4);
                }
            }
        } else {
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listAgtfadlqog, 10));
            while (r4.hasNext()) {
                btonecajqbVarGxszxtbevo = ojitshcjhnVarBtonecajqb.gxszxtbevo(lrnfpwlwnkVar.ojitshcjhn(btonecajqbVar3));
                if (btonecajqbVarGxszxtbevo == null) {
                    btonecajqbVar3 = btonecajqbVarGxszxtbevo;
                }
                arrayList.add(btonecajqbVar3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return f130055iobyxmoadg.rgvfuqvkyq(lrnfpwlwnkVar, btonecajqbVar);
        }
        if (size == 1) {
            return f130055iobyxmoadg.kcexrzcfyt(lrnfpwlwnkVar, ojitshcjhnVarBtonecajqb.yggfygwlhe((dj.btonecajqb) hg.jyumaefscl.bfopjjpdmp(arrayList)), btonecajqbVar2);
        }
        dj.iobyxmoadg iobyxmoadgVar = new dj.iobyxmoadg(ojitshcjhnVarBtonecajqb.lereixgezr(wflxmlrfwpVarIobyxmoadg));
        int iLereixgezr = ojitshcjhnVarBtonecajqb.lereixgezr(wflxmlrfwpVarIobyxmoadg);
        int i14 = 0;
        boolean z15 = false;
        while (i14 < iLereixgezr) {
            z15 = (z15 || ojitshcjhnVarBtonecajqb.ulzqkzuiru(ojitshcjhnVarBtonecajqb.uawqvzlxes(wflxmlrfwpVarIobyxmoadg, i14)) != dj.kcexrzcfyt.OUT) ? z14 : z13;
            if (!z15) {
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, i13));
                for (dj.btonecajqb btonecajqbVar5 : arrayList) {
                    dj.draadjrbmk draadjrbmkVarIwxlajgraz = ojitshcjhnVarBtonecajqb.iwxlajgraz(btonecajqbVar5, i14);
                    if (draadjrbmkVarIwxlajgraz != null) {
                        if (ojitshcjhnVarBtonecajqb.vipkmwdibw(draadjrbmkVarIwxlajgraz) != dj.kcexrzcfyt.INV) {
                            draadjrbmkVarIwxlajgraz = null;
                        }
                        if (draadjrbmkVarIwxlajgraz != null && (dxjokdxxwwVarOjitshcjhn = ojitshcjhnVarBtonecajqb.ojitshcjhn(draadjrbmkVarIwxlajgraz)) != null) {
                            arrayList2.add(dxjokdxxwwVarOjitshcjhn);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + btonecajqbVar5 + ", subType: " + btonecajqbVar + ", superType: " + btonecajqbVar2).toString());
                }
                iobyxmoadgVar.add(ojitshcjhnVarBtonecajqb.opjhrmiecq(ojitshcjhnVarBtonecajqb.cdpycssgdh(arrayList2)));
            }
            i14++;
            z13 = false;
            z14 = true;
            i13 = 10;
        }
        if (z15 || !f130055iobyxmoadg.kcexrzcfyt(lrnfpwlwnkVar, iobyxmoadgVar, btonecajqbVar2)) {
            return lrnfpwlwnkVar.vdvldrhtss(new eablkybsjg(arrayList, lrnfpwlwnkVar, ojitshcjhnVarBtonecajqb, btonecajqbVar2));
        }
        return true;
    }

    public static /* synthetic */ boolean jyumaefscl(lqeggnwhkg lqeggnwhkgVar, lrnfpwlwnk lrnfpwlwnkVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2, boolean z13, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return lqeggnwhkgVar.yggfygwlhe(lrnfpwlwnkVar, dxjokdxxwwVar, dxjokdxxwwVar2, z13);
    }

    private final boolean lereixgezr(dj.ojitshcjhn ojitshcjhnVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2, dj.wflxmlrfwp wflxmlrfwpVar) {
        dj.btonecajqb btonecajqbVarGxszxtbevo = ojitshcjhnVar.gxszxtbevo(dxjokdxxwwVar);
        if (btonecajqbVarGxszxtbevo instanceof dj.wkgbmnqykc) {
            dj.wkgbmnqykc wkgbmnqykcVar = (dj.wkgbmnqykc) btonecajqbVarGxszxtbevo;
            if (ojitshcjhnVar.oxmwwwfdhm(wkgbmnqykcVar) || !ojitshcjhnVar.jhduphickx(ojitshcjhnVar.gtknphoqwx(ojitshcjhnVar.ikoacuggdj(wkgbmnqykcVar))) || ojitshcjhnVar.iwizpuwonk(wkgbmnqykcVar) != dj.zoijcleaow.FOR_SUBTYPING) {
                return false;
            }
            ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVar2);
        }
        return false;
    }

    private static final boolean lqeggnwhkg(dj.ojitshcjhn ojitshcjhnVar, lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2, boolean z13) {
        Collection<dj.dxjokdxxww> collectionHkdspvbjdz = ojitshcjhnVar.hkdspvbjdz(btonecajqbVar);
        if ((collectionHkdspvbjdz instanceof Collection) && collectionHkdspvbjdz.isEmpty()) {
            return false;
        }
        for (dj.dxjokdxxww dxjokdxxwwVar : collectionHkdspvbjdz) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVar), ojitshcjhnVar.iobyxmoadg(btonecajqbVar2)) || (z13 && jyumaefscl(f130055iobyxmoadg, lrnfpwlwnkVar, btonecajqbVar2, dxjokdxxwwVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    private final Boolean nufgyqmvbu(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        dj.btonecajqb btonecajqbVarRlfsiqarku;
        dj.agtfadlqog agtfadlqogVarOjitshcjhn;
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        boolean z13 = false;
        if (ojitshcjhnVarBtonecajqb.zeieaojujs(btonecajqbVar) || ojitshcjhnVarBtonecajqb.zeieaojujs(btonecajqbVar2)) {
            if (lrnfpwlwnkVar.wflxmlrfwp()) {
                return Boolean.TRUE;
            }
            return (!ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar) || ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar2)) ? Boolean.valueOf(wkgbmnqykc.f130153iobyxmoadg.zoijcleaow(ojitshcjhnVarBtonecajqb, ojitshcjhnVarBtonecajqb.eablkybsjg(btonecajqbVar, false), ojitshcjhnVarBtonecajqb.eablkybsjg(btonecajqbVar2, false))) : Boolean.FALSE;
        }
        if (ojitshcjhnVarBtonecajqb.hszhottldk(btonecajqbVar) && ojitshcjhnVarBtonecajqb.hszhottldk(btonecajqbVar2)) {
            return Boolean.valueOf(f130055iobyxmoadg.oxmwwwfdhm(ojitshcjhnVarBtonecajqb, btonecajqbVar, btonecajqbVar2) || lrnfpwlwnkVar.agtfadlqog());
        }
        if (ojitshcjhnVarBtonecajqb.vdvldrhtss(btonecajqbVar) || ojitshcjhnVarBtonecajqb.vdvldrhtss(btonecajqbVar2)) {
            return Boolean.valueOf(lrnfpwlwnkVar.agtfadlqog());
        }
        dj.eablkybsjg eablkybsjgVarDxjokdxxww = ojitshcjhnVarBtonecajqb.dxjokdxxww(btonecajqbVar2);
        if (eablkybsjgVarDxjokdxxww == null || (btonecajqbVarRlfsiqarku = ojitshcjhnVarBtonecajqb.rlfsiqarku(eablkybsjgVarDxjokdxxww)) == null) {
            btonecajqbVarRlfsiqarku = btonecajqbVar2;
        }
        dj.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = ojitshcjhnVarBtonecajqb.wkgbmnqykc(btonecajqbVarRlfsiqarku);
        dj.dxjokdxxww dxjokdxxwwVarCqumvgiudr = wkgbmnqykcVarWkgbmnqykc != null ? ojitshcjhnVarBtonecajqb.cqumvgiudr(wkgbmnqykcVarWkgbmnqykc) : null;
        if (wkgbmnqykcVarWkgbmnqykc != null && dxjokdxxwwVarCqumvgiudr != null) {
            if (ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar2)) {
                dxjokdxxwwVarCqumvgiudr = ojitshcjhnVarBtonecajqb.hcddaimhww(dxjokdxxwwVarCqumvgiudr, true);
            } else if (ojitshcjhnVarBtonecajqb.sflfametgt(btonecajqbVar2)) {
                dxjokdxxwwVarCqumvgiudr = ojitshcjhnVarBtonecajqb.mbcevpiqjq(dxjokdxxwwVarCqumvgiudr);
            }
            dj.dxjokdxxww dxjokdxxwwVar = dxjokdxxwwVarCqumvgiudr;
            int i13 = iobyxmoadg.f130058zoijcleaow[lrnfpwlwnkVar.lqeggnwhkg(btonecajqbVar, wkgbmnqykcVarWkgbmnqykc).ordinal()];
            if (i13 == 1) {
                return Boolean.valueOf(jyumaefscl(f130055iobyxmoadg, lrnfpwlwnkVar, btonecajqbVar, dxjokdxxwwVar, false, 8, null));
            }
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (jyumaefscl(f130055iobyxmoadg, lrnfpwlwnkVar, btonecajqbVar, dxjokdxxwwVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2);
        if (ojitshcjhnVarBtonecajqb.esjtqupxsv(wflxmlrfwpVarIobyxmoadg)) {
            ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVar2);
            Collection collectionYfnezrywwk = ojitshcjhnVarBtonecajqb.yfnezrywwk(wflxmlrfwpVarIobyxmoadg);
            if ((collectionYfnezrywwk instanceof Collection) && collectionYfnezrywwk.isEmpty()) {
                z13 = true;
            } else {
                Iterator it = collectionYfnezrywwk.iterator();
                while (it.hasNext()) {
                    if (!jyumaefscl(f130055iobyxmoadg, lrnfpwlwnkVar, btonecajqbVar, (dj.dxjokdxxww) it.next(), false, 8, null)) {
                    }
                }
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg2 = ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar);
        if (btonecajqbVar instanceof dj.wkgbmnqykc) {
            agtfadlqogVarOjitshcjhn = f130055iobyxmoadg.ojitshcjhn(lrnfpwlwnkVar.btonecajqb(), btonecajqbVar2, btonecajqbVar);
            if (agtfadlqogVarOjitshcjhn != null && ojitshcjhnVarBtonecajqb.jztzpxfvev(agtfadlqogVarOjitshcjhn, ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar2))) {
                return Boolean.TRUE;
            }
        } else if (ojitshcjhnVarBtonecajqb.esjtqupxsv(wflxmlrfwpVarIobyxmoadg2)) {
            Collection collectionYfnezrywwk2 = ojitshcjhnVarBtonecajqb.yfnezrywwk(wflxmlrfwpVarIobyxmoadg2);
            if ((collectionYfnezrywwk2 instanceof Collection) && collectionYfnezrywwk2.isEmpty()) {
                agtfadlqogVarOjitshcjhn = f130055iobyxmoadg.ojitshcjhn(lrnfpwlwnkVar.btonecajqb(), btonecajqbVar2, btonecajqbVar);
                if (agtfadlqogVarOjitshcjhn != null) {
                    return Boolean.TRUE;
                }
            } else {
                Iterator it2 = collectionYfnezrywwk2.iterator();
                while (it2.hasNext()) {
                    if (!(((dj.dxjokdxxww) it2.next()) instanceof dj.wkgbmnqykc)) {
                    }
                }
                agtfadlqogVarOjitshcjhn = f130055iobyxmoadg.ojitshcjhn(lrnfpwlwnkVar.btonecajqb(), btonecajqbVar2, btonecajqbVar);
                if (agtfadlqogVarOjitshcjhn != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    private final dj.agtfadlqog ojitshcjhn(dj.ojitshcjhn ojitshcjhnVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2) {
        dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn;
        int iTbqsvytpvh = ojitshcjhnVar.tbqsvytpvh(dxjokdxxwwVar);
        int i13 = 0;
        while (true) {
            if (i13 >= iTbqsvytpvh) {
                return null;
            }
            dj.draadjrbmk draadjrbmkVarNuxfzjnpeb = ojitshcjhnVar.nuxfzjnpeb(dxjokdxxwwVar, i13);
            dj.draadjrbmk draadjrbmkVar = ojitshcjhnVar.jhduphickx(draadjrbmkVarNuxfzjnpeb) ? null : draadjrbmkVarNuxfzjnpeb;
            if (draadjrbmkVar != null && (dxjokdxxwwVarOjitshcjhn = ojitshcjhnVar.ojitshcjhn(draadjrbmkVar)) != null) {
                boolean z13 = ojitshcjhnVar.btonecajqb(ojitshcjhnVar.iyctptxqzt(ojitshcjhnVar.zdlpuopuiu(dxjokdxxwwVarOjitshcjhn))) && ojitshcjhnVar.btonecajqb(ojitshcjhnVar.iyctptxqzt(ojitshcjhnVar.zdlpuopuiu(dxjokdxxwwVar2)));
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVar2) || (z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVarOjitshcjhn), ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVar2)))) {
                    return ojitshcjhnVar.uawqvzlxes(ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVar), i13);
                }
                dj.agtfadlqog agtfadlqogVarOjitshcjhn = ojitshcjhn(ojitshcjhnVar, dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVar2);
                if (agtfadlqogVarOjitshcjhn != null) {
                    return agtfadlqogVarOjitshcjhn;
                }
            }
            i13++;
        }
    }

    private final boolean oxmwwwfdhm(dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        dj.btonecajqb btonecajqbVarRlfsiqarku;
        dj.btonecajqb btonecajqbVarRlfsiqarku2;
        dj.eablkybsjg eablkybsjgVarDxjokdxxww = ojitshcjhnVar.dxjokdxxww(btonecajqbVar);
        if (eablkybsjgVarDxjokdxxww == null || (btonecajqbVarRlfsiqarku = ojitshcjhnVar.rlfsiqarku(eablkybsjgVarDxjokdxxww)) == null) {
            btonecajqbVarRlfsiqarku = btonecajqbVar;
        }
        dj.eablkybsjg eablkybsjgVarDxjokdxxww2 = ojitshcjhnVar.dxjokdxxww(btonecajqbVar2);
        if (eablkybsjgVarDxjokdxxww2 == null || (btonecajqbVarRlfsiqarku2 = ojitshcjhnVar.rlfsiqarku(eablkybsjgVarDxjokdxxww2)) == null) {
            btonecajqbVarRlfsiqarku2 = btonecajqbVar2;
        }
        if (ojitshcjhnVar.iobyxmoadg(btonecajqbVarRlfsiqarku) != ojitshcjhnVar.iobyxmoadg(btonecajqbVarRlfsiqarku2)) {
            return false;
        }
        if (ojitshcjhnVar.sflfametgt(btonecajqbVar) || !ojitshcjhnVar.sflfametgt(btonecajqbVar2)) {
            return !ojitshcjhnVar.zfvoamnweg(btonecajqbVar) || ojitshcjhnVar.zfvoamnweg(btonecajqbVar2);
        }
        return false;
    }

    private final List pmvmpeiblj(lrnfpwlwnk lrnfpwlwnkVar, List list) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            dj.gtknphoqwx gtknphoqwxVarYggfygwlhe = ojitshcjhnVarBtonecajqb.yggfygwlhe((dj.btonecajqb) obj);
            int iDsvhmnatus = ojitshcjhnVarBtonecajqb.dsvhmnatus(gtknphoqwxVarYggfygwlhe);
            int i13 = 0;
            while (true) {
                if (i13 >= iDsvhmnatus) {
                    arrayList.add(obj);
                    break;
                }
                if (ojitshcjhnVarBtonecajqb.yadqdtsiqt(ojitshcjhnVarBtonecajqb.ojitshcjhn(ojitshcjhnVarBtonecajqb.skhdrjzrfn(gtknphoqwxVarYggfygwlhe, i13))) != null) {
                    break;
                }
                i13++;
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private final Boolean ppxfxbqfkf(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        if (!ojitshcjhnVarBtonecajqb.oipsdeybqn(btonecajqbVar) && !ojitshcjhnVarBtonecajqb.oipsdeybqn(btonecajqbVar2)) {
            return null;
        }
        if (gxszxtbevo(ojitshcjhnVarBtonecajqb, btonecajqbVar) && gxszxtbevo(ojitshcjhnVarBtonecajqb, btonecajqbVar2)) {
            return Boolean.TRUE;
        }
        if (ojitshcjhnVarBtonecajqb.oipsdeybqn(btonecajqbVar)) {
            if (lqeggnwhkg(ojitshcjhnVarBtonecajqb, lrnfpwlwnkVar, btonecajqbVar, btonecajqbVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (ojitshcjhnVarBtonecajqb.oipsdeybqn(btonecajqbVar2) && (eablkybsjg(ojitshcjhnVarBtonecajqb, btonecajqbVar) || lqeggnwhkg(ojitshcjhnVarBtonecajqb, lrnfpwlwnkVar, btonecajqbVar2, btonecajqbVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private final boolean rgvfuqvkyq(lrnfpwlwnk lrnfpwlwnkVar, dj.btonecajqb btonecajqbVar) {
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar);
        if (ojitshcjhnVarBtonecajqb.wypolnanlu(wflxmlrfwpVarIobyxmoadg)) {
            return ojitshcjhnVarBtonecajqb.istkbnxepw(wflxmlrfwpVarIobyxmoadg);
        }
        if (ojitshcjhnVarBtonecajqb.istkbnxepw(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVar))) {
            return true;
        }
        lrnfpwlwnkVar.gtknphoqwx();
        ArrayDeque arrayDequeNufgyqmvbu = lrnfpwlwnkVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDequeNufgyqmvbu);
        Set setDxjokdxxww = lrnfpwlwnkVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(setDxjokdxxww);
        arrayDequeNufgyqmvbu.push(btonecajqbVar);
        while (!arrayDequeNufgyqmvbu.isEmpty()) {
            if (setDxjokdxxww.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + btonecajqbVar + ". Supertypes = " + hg.jyumaefscl.iwxlajgraz(setDxjokdxxww, null, null, null, 0, null, null, 63, null)).toString());
            }
            dj.btonecajqb btonecajqbVar2 = (dj.btonecajqb) arrayDequeNufgyqmvbu.pop();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar2);
            if (setDxjokdxxww.add(btonecajqbVar2)) {
                lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhnVarBtonecajqb.lxfrhoxuzk(btonecajqbVar2) ? lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg : lrnfpwlwnk.ppxfxbqfkf.zoijcleaow.f130072iobyxmoadg;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg)) {
                    ppxfxbqfkfVar = null;
                }
                if (ppxfxbqfkfVar == null) {
                    continue;
                } else {
                    dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = lrnfpwlwnkVar.btonecajqb();
                    Iterator it = ojitshcjhnVarBtonecajqb2.yfnezrywwk(ojitshcjhnVarBtonecajqb2.iobyxmoadg(btonecajqbVar2)).iterator();
                    while (it.hasNext()) {
                        dj.btonecajqb btonecajqbVarIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(lrnfpwlwnkVar, (dj.dxjokdxxww) it.next());
                        if (ojitshcjhnVarBtonecajqb.istkbnxepw(ojitshcjhnVarBtonecajqb.iobyxmoadg(btonecajqbVarIobyxmoadg))) {
                            lrnfpwlwnkVar.eablkybsjg();
                            return true;
                        }
                        arrayDequeNufgyqmvbu.add(btonecajqbVarIobyxmoadg);
                    }
                }
            }
        }
        lrnfpwlwnkVar.eablkybsjg();
        return false;
    }

    private final boolean vdvldrhtss(dj.ojitshcjhn ojitshcjhnVar, dj.dxjokdxxww dxjokdxxwwVar) {
        return (!ojitshcjhnVar.weqkydbzbr(ojitshcjhnVar.crxdokpmqz(dxjokdxxwwVar)) || ojitshcjhnVar.metgxyhuhe(dxjokdxxwwVar) || ojitshcjhnVar.sflfametgt(dxjokdxxwwVar) || ojitshcjhnVar.wflxmlrfwp(dxjokdxxwwVar) || ojitshcjhnVar.ylkuphrtab(dxjokdxxwwVar)) ? false : true;
    }

    private static final boolean wkgbmnqykc(dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar) {
        if (!(btonecajqbVar instanceof dj.wkgbmnqykc)) {
            return false;
        }
        dj.draadjrbmk draadjrbmkVarGtknphoqwx = ojitshcjhnVar.gtknphoqwx(ojitshcjhnVar.ikoacuggdj((dj.wkgbmnqykc) btonecajqbVar));
        return !ojitshcjhnVar.jhduphickx(draadjrbmkVarGtknphoqwx) && ojitshcjhnVar.oipsdeybqn(ojitshcjhnVar.igdgnonuha(ojitshcjhnVar.ojitshcjhn(draadjrbmkVarGtknphoqwx)));
    }

    public final List agtfadlqog(lrnfpwlwnk state, dj.btonecajqb subType, dj.wflxmlrfwp superConstructor) {
        lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superConstructor, "superConstructor");
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = state.btonecajqb();
        if (ojitshcjhnVarBtonecajqb.lxfrhoxuzk(subType)) {
            return f130055iobyxmoadg.btonecajqb(state, subType, superConstructor);
        }
        if (!ojitshcjhnVarBtonecajqb.wypolnanlu(superConstructor) && !ojitshcjhnVarBtonecajqb.lrnfpwlwnk(superConstructor)) {
            return f130055iobyxmoadg.dxjokdxxww(state, subType, superConstructor);
        }
        jj.gtknphoqwx<dj.btonecajqb> gtknphoqwxVar = new jj.gtknphoqwx();
        state.gtknphoqwx();
        ArrayDeque arrayDequeNufgyqmvbu = state.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDequeNufgyqmvbu);
        Set setDxjokdxxww = state.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(setDxjokdxxww);
        arrayDequeNufgyqmvbu.push(subType);
        while (!arrayDequeNufgyqmvbu.isEmpty()) {
            if (setDxjokdxxww.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + hg.jyumaefscl.iwxlajgraz(setDxjokdxxww, null, null, null, 0, null, null, 63, null)).toString());
            }
            dj.btonecajqb btonecajqbVar = (dj.btonecajqb) arrayDequeNufgyqmvbu.pop();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar);
            if (setDxjokdxxww.add(btonecajqbVar)) {
                if (ojitshcjhnVarBtonecajqb.lxfrhoxuzk(btonecajqbVar)) {
                    gtknphoqwxVar.add(btonecajqbVar);
                    ppxfxbqfkfVar = lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg;
                } else {
                    ppxfxbqfkfVar = lrnfpwlwnk.ppxfxbqfkf.zoijcleaow.f130072iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, lrnfpwlwnk.ppxfxbqfkf.C3315ppxfxbqfkf.f130070iobyxmoadg)) {
                    ppxfxbqfkfVar = null;
                }
                if (ppxfxbqfkfVar != null) {
                    dj.ojitshcjhn ojitshcjhnVarBtonecajqb2 = state.btonecajqb();
                    Iterator it = ojitshcjhnVarBtonecajqb2.yfnezrywwk(ojitshcjhnVarBtonecajqb2.iobyxmoadg(btonecajqbVar)).iterator();
                    while (it.hasNext()) {
                        arrayDequeNufgyqmvbu.add(ppxfxbqfkfVar.iobyxmoadg(state, (dj.dxjokdxxww) it.next()));
                    }
                }
            }
        }
        state.eablkybsjg();
        ArrayList arrayList = new ArrayList();
        for (dj.btonecajqb btonecajqbVar2 : gtknphoqwxVar) {
            lqeggnwhkg lqeggnwhkgVar = f130055iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVar2);
            hg.jyumaefscl.istkbnxepw(arrayList, lqeggnwhkgVar.btonecajqb(state, btonecajqbVar2, superConstructor));
        }
        return arrayList;
    }

    public final dj.kcexrzcfyt draadjrbmk(dj.kcexrzcfyt declared, dj.kcexrzcfyt useSite) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(declared, "declared");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(useSite, "useSite");
        dj.kcexrzcfyt kcexrzcfytVar = dj.kcexrzcfyt.INV;
        if (declared == kcexrzcfytVar) {
            return useSite;
        }
        if (useSite == kcexrzcfytVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean kcexrzcfyt(lrnfpwlwnk lrnfpwlwnkVar, dj.gtknphoqwx capturedSubArguments, dj.btonecajqb superType) {
        boolean zWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lrnfpwlwnkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(capturedSubArguments, "capturedSubArguments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = lrnfpwlwnkVar.btonecajqb();
        dj.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = ojitshcjhnVarBtonecajqb.iobyxmoadg(superType);
        int iDsvhmnatus = ojitshcjhnVarBtonecajqb.dsvhmnatus(capturedSubArguments);
        int iLereixgezr = ojitshcjhnVarBtonecajqb.lereixgezr(wflxmlrfwpVarIobyxmoadg);
        if (iDsvhmnatus != iLereixgezr || iDsvhmnatus != ojitshcjhnVarBtonecajqb.tbqsvytpvh(superType)) {
            return false;
        }
        for (int i13 = 0; i13 < iLereixgezr; i13++) {
            dj.draadjrbmk draadjrbmkVarNuxfzjnpeb = ojitshcjhnVarBtonecajqb.nuxfzjnpeb(superType, i13);
            if (!ojitshcjhnVarBtonecajqb.jhduphickx(draadjrbmkVarNuxfzjnpeb)) {
                dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn = ojitshcjhnVarBtonecajqb.ojitshcjhn(draadjrbmkVarNuxfzjnpeb);
                dj.draadjrbmk draadjrbmkVarSkhdrjzrfn = ojitshcjhnVarBtonecajqb.skhdrjzrfn(capturedSubArguments, i13);
                ojitshcjhnVarBtonecajqb.vipkmwdibw(draadjrbmkVarSkhdrjzrfn);
                dj.kcexrzcfyt kcexrzcfytVar = dj.kcexrzcfyt.INV;
                dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn2 = ojitshcjhnVarBtonecajqb.ojitshcjhn(draadjrbmkVarSkhdrjzrfn);
                lqeggnwhkg lqeggnwhkgVar = f130055iobyxmoadg;
                dj.kcexrzcfyt kcexrzcfytVarDraadjrbmk = lqeggnwhkgVar.draadjrbmk(ojitshcjhnVarBtonecajqb.ulzqkzuiru(ojitshcjhnVarBtonecajqb.uawqvzlxes(wflxmlrfwpVarIobyxmoadg, i13)), ojitshcjhnVarBtonecajqb.vipkmwdibw(draadjrbmkVarNuxfzjnpeb));
                if (kcexrzcfytVarDraadjrbmk == null) {
                    return lrnfpwlwnkVar.wflxmlrfwp();
                }
                if (kcexrzcfytVarDraadjrbmk != kcexrzcfytVar || (!lqeggnwhkgVar.lereixgezr(ojitshcjhnVarBtonecajqb, dxjokdxxwwVarOjitshcjhn2, dxjokdxxwwVarOjitshcjhn, wflxmlrfwpVarIobyxmoadg) && !lqeggnwhkgVar.lereixgezr(ojitshcjhnVarBtonecajqb, dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVarOjitshcjhn2, wflxmlrfwpVarIobyxmoadg))) {
                    if (lrnfpwlwnkVar.f130064lqeggnwhkg > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + dxjokdxxwwVarOjitshcjhn2).toString());
                    }
                    lrnfpwlwnkVar.f130064lqeggnwhkg++;
                    int i14 = iobyxmoadg.f130057iobyxmoadg[kcexrzcfytVarDraadjrbmk.ordinal()];
                    if (i14 == 1) {
                        zWflxmlrfwp = lqeggnwhkgVar.wflxmlrfwp(lrnfpwlwnkVar, dxjokdxxwwVarOjitshcjhn2, dxjokdxxwwVarOjitshcjhn);
                    } else if (i14 == 2) {
                        zWflxmlrfwp = jyumaefscl(lqeggnwhkgVar, lrnfpwlwnkVar, dxjokdxxwwVarOjitshcjhn2, dxjokdxxwwVarOjitshcjhn, false, 8, null);
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zWflxmlrfwp = jyumaefscl(lqeggnwhkgVar, lrnfpwlwnkVar, dxjokdxxwwVarOjitshcjhn, dxjokdxxwwVarOjitshcjhn2, false, 8, null);
                    }
                    lrnfpwlwnkVar.f130064lqeggnwhkg--;
                    if (!zWflxmlrfwp) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean wflxmlrfwp(lrnfpwlwnk state, dj.dxjokdxxww a13, dj.dxjokdxxww b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(b13, "b");
        dj.ojitshcjhn ojitshcjhnVarBtonecajqb = state.btonecajqb();
        if (a13 == b13) {
            return true;
        }
        lqeggnwhkg lqeggnwhkgVar = f130055iobyxmoadg;
        if (lqeggnwhkgVar.vdvldrhtss(ojitshcjhnVarBtonecajqb, a13) && lqeggnwhkgVar.vdvldrhtss(ojitshcjhnVarBtonecajqb, b13)) {
            dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn = state.ojitshcjhn(state.rgvfuqvkyq(a13));
            dj.dxjokdxxww dxjokdxxwwVarOjitshcjhn2 = state.ojitshcjhn(state.rgvfuqvkyq(b13));
            dj.btonecajqb btonecajqbVarZdlpuopuiu = ojitshcjhnVarBtonecajqb.zdlpuopuiu(dxjokdxxwwVarOjitshcjhn);
            if (!ojitshcjhnVarBtonecajqb.auzgnhcxok(ojitshcjhnVarBtonecajqb.crxdokpmqz(dxjokdxxwwVarOjitshcjhn), ojitshcjhnVarBtonecajqb.crxdokpmqz(dxjokdxxwwVarOjitshcjhn2))) {
                return false;
            }
            if (ojitshcjhnVarBtonecajqb.tbqsvytpvh(btonecajqbVarZdlpuopuiu) == 0) {
                return ojitshcjhnVarBtonecajqb.ydmasvzmpa(dxjokdxxwwVarOjitshcjhn) || ojitshcjhnVarBtonecajqb.ydmasvzmpa(dxjokdxxwwVarOjitshcjhn2) || ojitshcjhnVarBtonecajqb.zfvoamnweg(btonecajqbVarZdlpuopuiu) == ojitshcjhnVarBtonecajqb.zfvoamnweg(ojitshcjhnVarBtonecajqb.zdlpuopuiu(dxjokdxxwwVarOjitshcjhn2));
            }
        }
        return jyumaefscl(lqeggnwhkgVar, state, a13, b13, false, 8, null) && jyumaefscl(lqeggnwhkgVar, state, b13, a13, false, 8, null);
    }

    public final boolean yggfygwlhe(lrnfpwlwnk state, dj.dxjokdxxww subType, dj.dxjokdxxww superType, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.gxszxtbevo(subType, superType)) {
            return gtknphoqwx(state, subType, superType, z13);
        }
        return false;
    }

    public final boolean zdlpuopuiu(lrnfpwlwnk state, dj.dxjokdxxww subType, dj.dxjokdxxww superType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return jyumaefscl(this, state, subType, superType, false, 8, null);
    }
}
