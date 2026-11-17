package fj;

import gg.vdvldrhtss;
import gh.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.yfnezrywwk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pi.eablkybsjg;
import zi.ageimvtcrz;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.ipoelvxyzq;
import zi.iwxlajgraz;
import zi.jpowsppfya;
import zi.kegysxyocb;
import zi.lxfrhoxuzk;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.nuxfzjnpeb;
import zi.skhdrjzrfn;
import zi.wizcaqwiak;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34024iobyxmoadg;

        static {
            int[] iArr = new int[mhtqkkgtqm.values().length];
            try {
                iArr[mhtqkkgtqm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mhtqkkgtqm.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mhtqkkgtqm.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34024iobyxmoadg = iArr;
        }
    }

    public static final class zoijcleaow extends nuxfzjnpeb {
        zoijcleaow() {
        }

        @Override // zi.nuxfzjnpeb
        public iwxlajgraz gtknphoqwx(zeieaojujs key) {
            zdlpuopuiu.btonecajqb(key, "key");
            mi.zoijcleaow zoijcleaowVar = key instanceof mi.zoijcleaow ? (mi.zoijcleaow) key : null;
            if (zoijcleaowVar == null) {
                return null;
            }
            return zoijcleaowVar.ppxfxbqfkf().zoijcleaow() ? new skhdrjzrfn(mhtqkkgtqm.OUT_VARIANCE, zoijcleaowVar.ppxfxbqfkf().getType()) : zoijcleaowVar.ppxfxbqfkf();
        }
    }

    private static final iwxlajgraz btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.wkgbmnqykc();
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow())) {
            mhtqkkgtqm mhtqkkgtqmVarDraadjrbmk = wkgbmnqykcVar.ppxfxbqfkf().draadjrbmk();
            mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.IN_VARIANCE;
            if (mhtqkkgtqmVarDraadjrbmk != mhtqkkgtqmVar) {
                if ((!dxjokdxxww.zfvoamnweg(wkgbmnqykcVar.iobyxmoadg()) || wkgbmnqykcVar.ppxfxbqfkf().draadjrbmk() == mhtqkkgtqmVar) && dxjokdxxww.bfopjjpdmp(wkgbmnqykcVar.zoijcleaow())) {
                    return new skhdrjzrfn(gtknphoqwx(wkgbmnqykcVar, mhtqkkgtqmVar), wkgbmnqykcVar.iobyxmoadg());
                }
                return new skhdrjzrfn(gtknphoqwx(wkgbmnqykcVar, mhtqkkgtqm.OUT_VARIANCE), wkgbmnqykcVar.zoijcleaow());
            }
        }
        return new skhdrjzrfn(wkgbmnqykcVar.iobyxmoadg());
    }

    private static final wkgbmnqykc dxjokdxxww(iwxlajgraz iwxlajgrazVar, yfnezrywwk yfnezrywwkVar) {
        int i13 = iobyxmoadg.f34024iobyxmoadg[wizcaqwiak.ppxfxbqfkf(yfnezrywwkVar.draadjrbmk(), iwxlajgrazVar).ordinal()];
        if (i13 == 1) {
            kegysxyocb type = iwxlajgrazVar.getType();
            zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            kegysxyocb type2 = iwxlajgrazVar.getType();
            zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
            return new wkgbmnqykc(yfnezrywwkVar, type, type2);
        }
        if (i13 == 2) {
            kegysxyocb type3 = iwxlajgrazVar.getType();
            zdlpuopuiu.dxjokdxxww(type3, "getType(...)");
            ikoacuggdj ikoacuggdjVarYlkuphrtab = eablkybsjg.wflxmlrfwp(yfnezrywwkVar).ylkuphrtab();
            zdlpuopuiu.dxjokdxxww(ikoacuggdjVarYlkuphrtab, "getNullableAnyType(...)");
            return new wkgbmnqykc(yfnezrywwkVar, type3, ikoacuggdjVarYlkuphrtab);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ikoacuggdj ikoacuggdjVarWwaezpbzkn = eablkybsjg.wflxmlrfwp(yfnezrywwkVar).wwaezpbzkn();
        zdlpuopuiu.dxjokdxxww(ikoacuggdjVarWwaezpbzkn, "getNothingType(...)");
        kegysxyocb type4 = iwxlajgrazVar.getType();
        zdlpuopuiu.dxjokdxxww(type4, "getType(...)");
        return new wkgbmnqykc(yfnezrywwkVar, ikoacuggdjVarWwaezpbzkn, type4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean eablkybsjg(grlcpdaxtj grlcpdaxtjVar) {
        zdlpuopuiu.lqeggnwhkg(grlcpdaxtjVar);
        return Boolean.valueOf(mi.eablkybsjg.gxszxtbevo(grlcpdaxtjVar));
    }

    private static final mhtqkkgtqm gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, mhtqkkgtqm mhtqkkgtqmVar) {
        return mhtqkkgtqmVar == wkgbmnqykcVar.ppxfxbqfkf().draadjrbmk() ? mhtqkkgtqm.INVARIANT : mhtqkkgtqmVar;
    }

    private static final fj.iobyxmoadg gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
        fj.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(wkgbmnqykcVar.iobyxmoadg());
        kegysxyocb kegysxyocbVar = (kegysxyocb) iobyxmoadgVarZoijcleaow.iobyxmoadg();
        kegysxyocb kegysxyocbVar2 = (kegysxyocb) iobyxmoadgVarZoijcleaow.zoijcleaow();
        fj.iobyxmoadg iobyxmoadgVarZoijcleaow2 = zoijcleaow(wkgbmnqykcVar.zoijcleaow());
        return new fj.iobyxmoadg(new wkgbmnqykc(wkgbmnqykcVar.ppxfxbqfkf(), kegysxyocbVar2, (kegysxyocb) iobyxmoadgVarZoijcleaow2.iobyxmoadg()), new wkgbmnqykc(wkgbmnqykcVar.ppxfxbqfkf(), kegysxyocbVar, (kegysxyocb) iobyxmoadgVarZoijcleaow2.zoijcleaow()));
    }

    private static final kegysxyocb lqeggnwhkg(kegysxyocb kegysxyocbVar, List list) {
        kegysxyocbVar.fyldjkxazc().size();
        list.size();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(btonecajqb((wkgbmnqykc) it.next()));
        }
        return lxfrhoxuzk.eablkybsjg(kegysxyocbVar, arrayList, null, null, 6, null);
    }

    private static final iwxlajgraz nufgyqmvbu(iwxlajgraz iwxlajgrazVar) {
        wizcaqwiak wizcaqwiakVarLqeggnwhkg = wizcaqwiak.lqeggnwhkg(new zoijcleaow());
        zdlpuopuiu.dxjokdxxww(wizcaqwiakVarLqeggnwhkg, "create(...)");
        return wizcaqwiakVarLqeggnwhkg.zdlpuopuiu(iwxlajgrazVar);
    }

    private static final kegysxyocb ppxfxbqfkf(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2) {
        kegysxyocb kegysxyocbVarVdvldrhtss = ageimvtcrz.vdvldrhtss(kegysxyocbVar, kegysxyocbVar2.mhtqkkgtqm());
        zdlpuopuiu.dxjokdxxww(kegysxyocbVarVdvldrhtss, "makeNullableIfNeeded(...)");
        return kegysxyocbVarVdvldrhtss;
    }

    public static final iwxlajgraz wkgbmnqykc(iwxlajgraz iwxlajgrazVar, boolean z13) {
        if (iwxlajgrazVar == null) {
            return null;
        }
        if (iwxlajgrazVar.zoijcleaow()) {
            return iwxlajgrazVar;
        }
        kegysxyocb type = iwxlajgrazVar.getType();
        zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        if (!ageimvtcrz.ppxfxbqfkf(type, fj.zoijcleaow.f34028zdlpuopuiu)) {
            return iwxlajgrazVar;
        }
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
        zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "getProjectionKind(...)");
        if (mhtqkkgtqmVarPpxfxbqfkf == mhtqkkgtqm.OUT_VARIANCE) {
            return new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, (kegysxyocb) zoijcleaow(type).wkgbmnqykc());
        }
        return z13 ? new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, (kegysxyocb) zoijcleaow(type).ppxfxbqfkf()) : nufgyqmvbu(iwxlajgrazVar);
    }

    public static final fj.iobyxmoadg zoijcleaow(kegysxyocb type) {
        Object objLqeggnwhkg;
        zdlpuopuiu.btonecajqb(type, "type");
        if (jpowsppfya.zoijcleaow(type)) {
            fj.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(jpowsppfya.ppxfxbqfkf(type));
            fj.iobyxmoadg iobyxmoadgVarZoijcleaow2 = zoijcleaow(jpowsppfya.wkgbmnqykc(type));
            return new fj.iobyxmoadg(ipoelvxyzq.zoijcleaow(ntlheqmsrt.eablkybsjg(jpowsppfya.ppxfxbqfkf((kegysxyocb) iobyxmoadgVarZoijcleaow.ppxfxbqfkf()), jpowsppfya.wkgbmnqykc((kegysxyocb) iobyxmoadgVarZoijcleaow2.ppxfxbqfkf())), type), ipoelvxyzq.zoijcleaow(ntlheqmsrt.eablkybsjg(jpowsppfya.ppxfxbqfkf((kegysxyocb) iobyxmoadgVarZoijcleaow.wkgbmnqykc()), jpowsppfya.wkgbmnqykc((kegysxyocb) iobyxmoadgVarZoijcleaow2.wkgbmnqykc())), type));
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = type.grlcpdaxtj();
        if (mi.eablkybsjg.gxszxtbevo(type)) {
            zdlpuopuiu.nufgyqmvbu(zeieaojujsVarGrlcpdaxtj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            iwxlajgraz iwxlajgrazVarPpxfxbqfkf = ((mi.zoijcleaow) zeieaojujsVarGrlcpdaxtj).ppxfxbqfkf();
            kegysxyocb type2 = iwxlajgrazVarPpxfxbqfkf.getType();
            zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
            kegysxyocb kegysxyocbVarPpxfxbqfkf = ppxfxbqfkf(type2, type);
            int i13 = iobyxmoadg.f34024iobyxmoadg[iwxlajgrazVarPpxfxbqfkf.ppxfxbqfkf().ordinal()];
            if (i13 == 2) {
                return new fj.iobyxmoadg(kegysxyocbVarPpxfxbqfkf, ej.wkgbmnqykc.agtfadlqog(type).ylkuphrtab());
            }
            if (i13 == 3) {
                ikoacuggdj ikoacuggdjVarWwaezpbzkn = ej.wkgbmnqykc.agtfadlqog(type).wwaezpbzkn();
                zdlpuopuiu.dxjokdxxww(ikoacuggdjVarWwaezpbzkn, "getNothingType(...)");
                return new fj.iobyxmoadg(ppxfxbqfkf(ikoacuggdjVarWwaezpbzkn, type), kegysxyocbVarPpxfxbqfkf);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + iwxlajgrazVarPpxfxbqfkf);
        }
        if (type.fyldjkxazc().isEmpty() || type.fyldjkxazc().size() != zeieaojujsVarGrlcpdaxtj.getParameters().size()) {
            return new fj.iobyxmoadg(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listFyldjkxazc = type.fyldjkxazc();
        List parameters = zeieaojujsVarGrlcpdaxtj.getParameters();
        zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        for (vdvldrhtss vdvldrhtssVar : jyumaefscl.w(listFyldjkxazc, parameters)) {
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) vdvldrhtssVar.iobyxmoadg();
            yfnezrywwk yfnezrywwkVar = (yfnezrywwk) vdvldrhtssVar.wkgbmnqykc();
            zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            wkgbmnqykc wkgbmnqykcVarDxjokdxxww = dxjokdxxww(iwxlajgrazVar, yfnezrywwkVar);
            if (iwxlajgrazVar.zoijcleaow()) {
                arrayList.add(wkgbmnqykcVarDxjokdxxww);
                arrayList2.add(wkgbmnqykcVarDxjokdxxww);
            } else {
                fj.iobyxmoadg iobyxmoadgVarGxszxtbevo = gxszxtbevo(wkgbmnqykcVarDxjokdxxww);
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVarGxszxtbevo.iobyxmoadg();
                wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) iobyxmoadgVarGxszxtbevo.zoijcleaow();
                arrayList.add(wkgbmnqykcVar);
                arrayList2.add(wkgbmnqykcVar2);
            }
        }
        boolean z13 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((wkgbmnqykc) it.next()).wkgbmnqykc()) {
                    z13 = true;
                    break;
                }
            }
        }
        if (z13) {
            objLqeggnwhkg = ej.wkgbmnqykc.agtfadlqog(type).wwaezpbzkn();
            zdlpuopuiu.dxjokdxxww(objLqeggnwhkg, "getNothingType(...)");
        } else {
            objLqeggnwhkg = lqeggnwhkg(type, arrayList);
        }
        return new fj.iobyxmoadg(objLqeggnwhkg, lqeggnwhkg(type, arrayList2));
    }
}
