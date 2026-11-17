package zi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ydmasvzmpa {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f130157ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ydmasvzmpa f130158wkgbmnqykc = new ydmasvzmpa(zfvoamnweg.iobyxmoadg.f130169iobyxmoadg, false);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zfvoamnweg f130159iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f130160zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zoijcleaow(int i13, jh.uwvvkdfqfp uwvvkdfqfpVar) {
            if (i13 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + uwvvkdfqfpVar.getName());
        }

        private iobyxmoadg() {
        }
    }

    public ydmasvzmpa(zfvoamnweg reportStrategy, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reportStrategy, "reportStrategy");
        this.f130159iobyxmoadg = reportStrategy;
        this.f130160zoijcleaow = z13;
    }

    private final ikoacuggdj btonecajqb(sflfametgt sflfametgtVar, opjhrmiecq opjhrmiecqVar, boolean z13, int i13, boolean z14) {
        iwxlajgraz iwxlajgrazVarGtknphoqwx = gtknphoqwx(new skhdrjzrfn(mhtqkkgtqm.INVARIANT, sflfametgtVar.zoijcleaow().opjhrmiecq()), sflfametgtVar, null, i13);
        kegysxyocb type = iwxlajgrazVarGtknphoqwx.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        ikoacuggdj ikoacuggdjVarIobyxmoadg = lxfrhoxuzk.iobyxmoadg(type);
        if (ulzqkzuiru.iobyxmoadg(ikoacuggdjVarIobyxmoadg)) {
            return ikoacuggdjVarIobyxmoadg;
        }
        iwxlajgrazVarGtknphoqwx.ppxfxbqfkf();
        iobyxmoadg(ikoacuggdjVarIobyxmoadg.getAnnotations(), zdlpuopuiu.iobyxmoadg(opjhrmiecqVar));
        ikoacuggdj ikoacuggdjVarOxmwwwfdhm = ageimvtcrz.oxmwwwfdhm(ppxfxbqfkf(ikoacuggdjVarIobyxmoadg, opjhrmiecqVar), z13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOxmwwwfdhm, "let(...)");
        return z14 ? metgxyhuhe.btonecajqb(ikoacuggdjVarOxmwwwfdhm, gxszxtbevo(sflfametgtVar, opjhrmiecqVar, z13)) : ikoacuggdjVarOxmwwwfdhm;
    }

    private final ikoacuggdj draadjrbmk(ikoacuggdj ikoacuggdjVar, sflfametgt sflfametgtVar, int i13) {
        zeieaojujs zeieaojujsVarGrlcpdaxtj = ikoacuggdjVar.grlcpdaxtj();
        List listFyldjkxazc = ikoacuggdjVar.fyldjkxazc();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listFyldjkxazc, 10));
        int i14 = 0;
        for (Object obj : listFyldjkxazc) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) obj;
            iwxlajgraz iwxlajgrazVarGtknphoqwx = gtknphoqwx(iwxlajgrazVar, sflfametgtVar, (jh.yfnezrywwk) zeieaojujsVarGrlcpdaxtj.getParameters().get(i14), i13 + 1);
            if (!iwxlajgrazVarGtknphoqwx.zoijcleaow()) {
                iwxlajgrazVarGtknphoqwx = new skhdrjzrfn(iwxlajgrazVarGtknphoqwx.ppxfxbqfkf(), ageimvtcrz.vdvldrhtss(iwxlajgrazVarGtknphoqwx.getType(), iwxlajgrazVar.getType().mhtqkkgtqm()));
            }
            arrayList.add(iwxlajgrazVarGtknphoqwx);
            i14 = i15;
        }
        return lxfrhoxuzk.gxszxtbevo(ikoacuggdjVar, arrayList, null, 2, null);
    }

    private final iwxlajgraz dxjokdxxww(iwxlajgraz iwxlajgrazVar, sflfametgt sflfametgtVar, int i13) {
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = iwxlajgrazVar.getType().jrbgnlbqoe();
        if (yadqdtsiqt.iobyxmoadg(grlcpdaxtjVarJrbgnlbqoe)) {
            return iwxlajgrazVar;
        }
        ikoacuggdj ikoacuggdjVarIobyxmoadg = lxfrhoxuzk.iobyxmoadg(grlcpdaxtjVarJrbgnlbqoe);
        if (ulzqkzuiru.iobyxmoadg(ikoacuggdjVarIobyxmoadg) || !ej.wkgbmnqykc.yadqdtsiqt(ikoacuggdjVarIobyxmoadg)) {
            return iwxlajgrazVar;
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = ikoacuggdjVarIobyxmoadg.grlcpdaxtj();
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = zeieaojujsVarGrlcpdaxtj.ylkuphrtab();
        zeieaojujsVarGrlcpdaxtj.getParameters().size();
        ikoacuggdjVarIobyxmoadg.fyldjkxazc().size();
        if (nufgyqmvbuVarYlkuphrtab instanceof jh.yfnezrywwk) {
            return iwxlajgrazVar;
        }
        if (!(nufgyqmvbuVarYlkuphrtab instanceof jh.uwvvkdfqfp)) {
            ikoacuggdj ikoacuggdjVarDraadjrbmk = draadjrbmk(ikoacuggdjVarIobyxmoadg, sflfametgtVar, i13);
            zoijcleaow(ikoacuggdjVarIobyxmoadg, ikoacuggdjVarDraadjrbmk);
            return new skhdrjzrfn(iwxlajgrazVar.ppxfxbqfkf(), ikoacuggdjVarDraadjrbmk);
        }
        jh.uwvvkdfqfp uwvvkdfqfpVar = (jh.uwvvkdfqfp) nufgyqmvbuVarYlkuphrtab;
        if (sflfametgtVar.wkgbmnqykc(uwvvkdfqfpVar)) {
            this.f130159iobyxmoadg.ppxfxbqfkf(uwvvkdfqfpVar);
            return new skhdrjzrfn(mhtqkkgtqm.INVARIANT, bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16466jpowsppfya, uwvvkdfqfpVar.getName().toString()));
        }
        List listFyldjkxazc = ikoacuggdjVarIobyxmoadg.fyldjkxazc();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listFyldjkxazc, 10));
        int i14 = 0;
        for (Object obj : listFyldjkxazc) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(gtknphoqwx((iwxlajgraz) obj, sflfametgtVar, (jh.yfnezrywwk) zeieaojujsVarGrlcpdaxtj.getParameters().get(i14), i13 + 1));
            i14 = i15;
        }
        ikoacuggdj ikoacuggdjVarBtonecajqb = btonecajqb(sflfametgt.f130123eablkybsjg.iobyxmoadg(sflfametgtVar, uwvvkdfqfpVar, arrayList), ikoacuggdjVarIobyxmoadg.ipoelvxyzq(), ikoacuggdjVarIobyxmoadg.mhtqkkgtqm(), i13 + 1, false);
        ikoacuggdj ikoacuggdjVarDraadjrbmk2 = draadjrbmk(ikoacuggdjVarIobyxmoadg, sflfametgtVar, i13);
        if (!yadqdtsiqt.iobyxmoadg(ikoacuggdjVarBtonecajqb)) {
            ikoacuggdjVarBtonecajqb = metgxyhuhe.btonecajqb(ikoacuggdjVarBtonecajqb, ikoacuggdjVarDraadjrbmk2);
        }
        return new skhdrjzrfn(iwxlajgrazVar.ppxfxbqfkf(), ikoacuggdjVarBtonecajqb);
    }

    private final ikoacuggdj eablkybsjg(ikoacuggdj ikoacuggdjVar, kegysxyocb kegysxyocbVar) {
        return ppxfxbqfkf(wkgbmnqykc(ikoacuggdjVar, kegysxyocbVar), kegysxyocbVar.ipoelvxyzq());
    }

    private final iwxlajgraz gtknphoqwx(iwxlajgraz iwxlajgrazVar, sflfametgt sflfametgtVar, jh.yfnezrywwk yfnezrywwkVar, int i13) {
        mhtqkkgtqm mhtqkkgtqmVarDraadjrbmk;
        mhtqkkgtqm mhtqkkgtqmVar;
        mhtqkkgtqm mhtqkkgtqmVar2;
        f130157ppxfxbqfkf.zoijcleaow(i13, sflfametgtVar.zoijcleaow());
        if (iwxlajgrazVar.zoijcleaow()) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            iwxlajgraz iwxlajgrazVarKcexrzcfyt = ageimvtcrz.kcexrzcfyt(yfnezrywwkVar);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iwxlajgrazVarKcexrzcfyt, "makeStarProjection(...)");
            return iwxlajgrazVarKcexrzcfyt;
        }
        kegysxyocb type = iwxlajgrazVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        iwxlajgraz iwxlajgrazVarPpxfxbqfkf = sflfametgtVar.ppxfxbqfkf(type.grlcpdaxtj());
        if (iwxlajgrazVarPpxfxbqfkf == null) {
            return dxjokdxxww(iwxlajgrazVar, sflfametgtVar, i13);
        }
        if (iwxlajgrazVarPpxfxbqfkf.zoijcleaow()) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            iwxlajgraz iwxlajgrazVarKcexrzcfyt2 = ageimvtcrz.kcexrzcfyt(yfnezrywwkVar);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iwxlajgrazVarKcexrzcfyt2, "makeStarProjection(...)");
            return iwxlajgrazVarKcexrzcfyt2;
        }
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = iwxlajgrazVarPpxfxbqfkf.getType().jrbgnlbqoe();
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVarPpxfxbqfkf.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "getProjectionKind(...)");
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf2 = iwxlajgrazVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf2, "getProjectionKind(...)");
        if (mhtqkkgtqmVarPpxfxbqfkf2 != mhtqkkgtqmVarPpxfxbqfkf && mhtqkkgtqmVarPpxfxbqfkf2 != (mhtqkkgtqmVar2 = mhtqkkgtqm.INVARIANT)) {
            if (mhtqkkgtqmVarPpxfxbqfkf == mhtqkkgtqmVar2) {
                mhtqkkgtqmVarPpxfxbqfkf = mhtqkkgtqmVarPpxfxbqfkf2;
            } else {
                this.f130159iobyxmoadg.iobyxmoadg(sflfametgtVar.zoijcleaow(), yfnezrywwkVar, grlcpdaxtjVarJrbgnlbqoe);
            }
        }
        if (yfnezrywwkVar == null || (mhtqkkgtqmVarDraadjrbmk = yfnezrywwkVar.draadjrbmk()) == null) {
            mhtqkkgtqmVarDraadjrbmk = mhtqkkgtqm.INVARIANT;
        }
        if (mhtqkkgtqmVarDraadjrbmk != mhtqkkgtqmVarPpxfxbqfkf && mhtqkkgtqmVarDraadjrbmk != (mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT)) {
            if (mhtqkkgtqmVarPpxfxbqfkf == mhtqkkgtqmVar) {
                mhtqkkgtqmVarPpxfxbqfkf = mhtqkkgtqmVar;
            } else {
                this.f130159iobyxmoadg.iobyxmoadg(sflfametgtVar.zoijcleaow(), yfnezrywwkVar, grlcpdaxtjVarJrbgnlbqoe);
            }
        }
        iobyxmoadg(type.getAnnotations(), grlcpdaxtjVarJrbgnlbqoe.getAnnotations());
        return new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, eablkybsjg(lxfrhoxuzk.iobyxmoadg(grlcpdaxtjVarJrbgnlbqoe), type));
    }

    private final ikoacuggdj gxszxtbevo(sflfametgt sflfametgtVar, opjhrmiecq opjhrmiecqVar, boolean z13) {
        zeieaojujs zeieaojujsVarBtonecajqb = sflfametgtVar.zoijcleaow().btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
        return ntlheqmsrt.wflxmlrfwp(opjhrmiecqVar, zeieaojujsVarBtonecajqb, sflfametgtVar.iobyxmoadg(), z13, si.gtknphoqwx.zoijcleaow.f106714zoijcleaow);
    }

    private final void iobyxmoadg(kh.nufgyqmvbu nufgyqmvbuVar, kh.nufgyqmvbu nufgyqmvbuVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = nufgyqmvbuVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((kh.ppxfxbqfkf) it.next()).gxszxtbevo());
        }
        Iterator it2 = nufgyqmvbuVar2.iterator();
        while (it2.hasNext()) {
            kh.ppxfxbqfkf ppxfxbqfkfVar = (kh.ppxfxbqfkf) it2.next();
            if (hashSet.contains(ppxfxbqfkfVar.gxszxtbevo())) {
                this.f130159iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar);
            }
        }
    }

    private final opjhrmiecq lqeggnwhkg(kegysxyocb kegysxyocbVar, opjhrmiecq opjhrmiecqVar) {
        return ulzqkzuiru.iobyxmoadg(kegysxyocbVar) ? kegysxyocbVar.ipoelvxyzq() : opjhrmiecqVar.gxszxtbevo(kegysxyocbVar.ipoelvxyzq());
    }

    private final ikoacuggdj ppxfxbqfkf(ikoacuggdj ikoacuggdjVar, opjhrmiecq opjhrmiecqVar) {
        return ulzqkzuiru.iobyxmoadg(ikoacuggdjVar) ? ikoacuggdjVar : lxfrhoxuzk.gxszxtbevo(ikoacuggdjVar, null, lqeggnwhkg(ikoacuggdjVar, opjhrmiecqVar), 1, null);
    }

    private final ikoacuggdj wkgbmnqykc(ikoacuggdj ikoacuggdjVar, kegysxyocb kegysxyocbVar) {
        ikoacuggdj ikoacuggdjVarOxmwwwfdhm = ageimvtcrz.oxmwwwfdhm(ikoacuggdjVar, kegysxyocbVar.mhtqkkgtqm());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOxmwwwfdhm, "makeNullableIfNeeded(...)");
        return ikoacuggdjVarOxmwwwfdhm;
    }

    private final void zoijcleaow(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2) {
        wizcaqwiak wizcaqwiakVarGxszxtbevo = wizcaqwiak.gxszxtbevo(kegysxyocbVar2);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wizcaqwiakVarGxszxtbevo, "create(...)");
        int i13 = 0;
        for (Object obj : kegysxyocbVar2.fyldjkxazc()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) obj;
            if (!iwxlajgrazVar.zoijcleaow()) {
                kegysxyocb type = iwxlajgrazVar.getType();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                if (!ej.wkgbmnqykc.lqeggnwhkg(type)) {
                    iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) kegysxyocbVar.fyldjkxazc().get(i13);
                    jh.yfnezrywwk yfnezrywwkVar = (jh.yfnezrywwk) kegysxyocbVar.grlcpdaxtj().getParameters().get(i13);
                    if (this.f130160zoijcleaow) {
                        zfvoamnweg zfvoamnwegVar = this.f130159iobyxmoadg;
                        kegysxyocb type2 = iwxlajgrazVar2.getType();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
                        kegysxyocb type3 = iwxlajgrazVar.getType();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type3, "getType(...)");
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
                        zfvoamnwegVar.zoijcleaow(wizcaqwiakVarGxszxtbevo, type2, type3, yfnezrywwkVar);
                    }
                }
            }
            i13 = i14;
        }
    }

    public final ikoacuggdj nufgyqmvbu(sflfametgt typeAliasExpansion, opjhrmiecq attributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAliasExpansion, "typeAliasExpansion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attributes, "attributes");
        return btonecajqb(typeAliasExpansion, attributes, false, 0, true);
    }
}
