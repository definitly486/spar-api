package bh;

import ah.eablkybsjg;
import ah.ojitshcjhn;
import ah.oxmwwwfdhm;
import ah.vdvldrhtss;
import dh.c;
import dh.crxdokpmqz;
import dh.eslsurpljm;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import jh.nufgyqmvbu;
import jh.yfnezrywwk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.opjhrmiecq;
import zi.skhdrjzrfn;
import zi.uwvvkdfqfp;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: bh.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0288iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f16200iobyxmoadg;

        static {
            int[] iArr = new int[oxmwwwfdhm.values().length];
            try {
                iArr[oxmwwwfdhm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oxmwwwfdhm.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oxmwwwfdhm.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16200iobyxmoadg = iArr;
        }
    }

    private static final ikoacuggdj iobyxmoadg(opjhrmiecq opjhrmiecqVar, zeieaojujs zeieaojujsVar, List list, boolean z13) {
        iwxlajgraz uwvvkdfqfpVar;
        List parameters = zeieaojujsVar.getParameters();
        zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            eslsurpljm eslsurpljmVar = (eslsurpljm) vdvldrhtssVar.ppxfxbqfkf();
            kegysxyocb kegysxyocbVarOxmwwwfdhm = eslsurpljmVar != null ? eslsurpljmVar.oxmwwwfdhm() : null;
            oxmwwwfdhm oxmwwwfdhmVarWkgbmnqykc = vdvldrhtssVar.wkgbmnqykc();
            int i15 = oxmwwwfdhmVarWkgbmnqykc == null ? -1 : C0288iobyxmoadg.f16200iobyxmoadg[oxmwwwfdhmVarWkgbmnqykc.ordinal()];
            if (i15 == -1) {
                Object obj2 = parameters.get(i13);
                zdlpuopuiu.dxjokdxxww(obj2, "get(...)");
                uwvvkdfqfpVar = new uwvvkdfqfp((yfnezrywwk) obj2);
            } else if (i15 == 1) {
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT;
                zdlpuopuiu.lqeggnwhkg(kegysxyocbVarOxmwwwfdhm);
                uwvvkdfqfpVar = new skhdrjzrfn(mhtqkkgtqmVar, kegysxyocbVarOxmwwwfdhm);
            } else if (i15 == 2) {
                mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.IN_VARIANCE;
                zdlpuopuiu.lqeggnwhkg(kegysxyocbVarOxmwwwfdhm);
                uwvvkdfqfpVar = new skhdrjzrfn(mhtqkkgtqmVar2, kegysxyocbVarOxmwwwfdhm);
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.OUT_VARIANCE;
                zdlpuopuiu.lqeggnwhkg(kegysxyocbVarOxmwwwfdhm);
                uwvvkdfqfpVar = new skhdrjzrfn(mhtqkkgtqmVar3, kegysxyocbVarOxmwwwfdhm);
            }
            arrayList.add(uwvvkdfqfpVar);
            i13 = i14;
        }
        return ntlheqmsrt.gtknphoqwx(opjhrmiecqVar, zeieaojujsVar, arrayList, z13, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ojitshcjhn zoijcleaow(eablkybsjg eablkybsjgVar, List arguments, boolean z13, List annotations) {
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        zdlpuopuiu.btonecajqb(arguments, "arguments");
        zdlpuopuiu.btonecajqb(annotations, "annotations");
        tg.iobyxmoadg iobyxmoadgVar = null;
        Object[] objArr = 0;
        crxdokpmqz crxdokpmqzVar = eablkybsjgVar instanceof crxdokpmqz ? (crxdokpmqz) eablkybsjgVar : null;
        if (crxdokpmqzVar == null || (nufgyqmvbuVarIobyxmoadg = crxdokpmqzVar.iobyxmoadg()) == null) {
            throw new c("Cannot create type for an unsupported classifier: " + eablkybsjgVar + " (" + eablkybsjgVar.getClass() + ')');
        }
        zeieaojujs zeieaojujsVarBtonecajqb = nufgyqmvbuVarIobyxmoadg.btonecajqb();
        zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
        List parameters = zeieaojujsVarBtonecajqb.getParameters();
        zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new eslsurpljm(iobyxmoadg(annotations.isEmpty() ? opjhrmiecq.f130109yggfygwlhe.btonecajqb() : opjhrmiecq.f130109yggfygwlhe.btonecajqb(), zeieaojujsVarBtonecajqb, arguments, z13), iobyxmoadgVar, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
