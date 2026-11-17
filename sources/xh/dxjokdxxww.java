package xh;

import bj.draadjrbmk;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import jh.yfnezrywwk;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.auzgnhcxok;
import zi.fiwbwshyhd;
import zi.igdgnonuha;
import zi.ikoacuggdj;
import zi.iozdgvuglv;
import zi.iwxlajgraz;
import zi.jpowsppfya;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.opjhrmiecq;
import zi.skhdrjzrfn;
import zi.ulzqkzuiru;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends igdgnonuha {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f122367eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final xh.iobyxmoadg f122368gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final xh.iobyxmoadg f122369lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f122370ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final auzgnhcxok f122371wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        fiwbwshyhd fiwbwshyhdVar = fiwbwshyhd.COMMON;
        f122368gxszxtbevo = zoijcleaow.zoijcleaow(fiwbwshyhdVar, false, true, null, 5, null).draadjrbmk(ppxfxbqfkf.FLEXIBLE_LOWER_BOUND);
        f122369lqeggnwhkg = zoijcleaow.zoijcleaow(fiwbwshyhdVar, false, true, null, 5, null).draadjrbmk(ppxfxbqfkf.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxjokdxxww(auzgnhcxok auzgnhcxokVar) {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        this.f122370ppxfxbqfkf = lqeggnwhkgVar;
        if (auzgnhcxokVar == null) {
            auzgnhcxokVar = new auzgnhcxok(lqeggnwhkgVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f122371wkgbmnqykc = auzgnhcxokVar;
    }

    private final vdvldrhtss btonecajqb(ikoacuggdj ikoacuggdjVar, jh.eablkybsjg eablkybsjgVar, xh.iobyxmoadg iobyxmoadgVar) {
        if (ikoacuggdjVar.grlcpdaxtj().getParameters().isEmpty()) {
            return cqumvgiudr.iobyxmoadg(ikoacuggdjVar, Boolean.FALSE);
        }
        if (gh.dxjokdxxww.ikoacuggdj(ikoacuggdjVar)) {
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) ikoacuggdjVar.fyldjkxazc().get(0);
            mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
            kegysxyocb type = iwxlajgrazVar.getType();
            zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            return cqumvgiudr.iobyxmoadg(ntlheqmsrt.gtknphoqwx(ikoacuggdjVar.ipoelvxyzq(), ikoacuggdjVar.grlcpdaxtj(), jyumaefscl.eablkybsjg(new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, draadjrbmk(type, iobyxmoadgVar))), ikoacuggdjVar.mhtqkkgtqm(), null, 16, null), Boolean.FALSE);
        }
        if (ulzqkzuiru.iobyxmoadg(ikoacuggdjVar)) {
            return cqumvgiudr.iobyxmoadg(draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16482okpsazkaxt, ikoacuggdjVar.grlcpdaxtj().toString()), Boolean.FALSE);
        }
        si.gtknphoqwx gtknphoqwxVarBfopjjpdmp = eablkybsjgVar.bfopjjpdmp(this);
        zdlpuopuiu.dxjokdxxww(gtknphoqwxVarBfopjjpdmp, "getMemberScope(...)");
        opjhrmiecq opjhrmiecqVarIpoelvxyzq = ikoacuggdjVar.ipoelvxyzq();
        zeieaojujs zeieaojujsVarBtonecajqb = eablkybsjgVar.btonecajqb();
        zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
        List<yfnezrywwk> parameters = eablkybsjgVar.btonecajqb().getParameters();
        zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(parameters, 10));
        for (yfnezrywwk yfnezrywwkVar : parameters) {
            lqeggnwhkg lqeggnwhkgVar = this.f122370ppxfxbqfkf;
            zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            arrayList.add(iozdgvuglv.zoijcleaow(lqeggnwhkgVar, yfnezrywwkVar, iobyxmoadgVar, this.f122371wkgbmnqykc, null, 8, null));
        }
        return cqumvgiudr.iobyxmoadg(ntlheqmsrt.agtfadlqog(opjhrmiecqVarIpoelvxyzq, zeieaojujsVarBtonecajqb, arrayList, ikoacuggdjVar.mhtqkkgtqm(), gtknphoqwxVarBfopjjpdmp, new nufgyqmvbu(eablkybsjgVar, this, ikoacuggdjVar, iobyxmoadgVar)), Boolean.TRUE);
    }

    private final kegysxyocb draadjrbmk(kegysxyocb kegysxyocbVar, xh.iobyxmoadg iobyxmoadgVar) {
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc instanceof yfnezrywwk) {
            return draadjrbmk(this.f122371wkgbmnqykc.eablkybsjg((yfnezrywwk) nufgyqmvbuVarWkgbmnqykc, iobyxmoadgVar.btonecajqb(true)), iobyxmoadgVar);
        }
        if (!(nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + nufgyqmvbuVarWkgbmnqykc).toString());
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc2 = jpowsppfya.wkgbmnqykc(kegysxyocbVar).grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc2 instanceof jh.eablkybsjg) {
            vdvldrhtss vdvldrhtssVarBtonecajqb = btonecajqb(jpowsppfya.ppxfxbqfkf(kegysxyocbVar), (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc, f122368gxszxtbevo);
            ikoacuggdj ikoacuggdjVar = (ikoacuggdj) vdvldrhtssVarBtonecajqb.iobyxmoadg();
            boolean zBooleanValue = ((Boolean) vdvldrhtssVarBtonecajqb.wkgbmnqykc()).booleanValue();
            vdvldrhtss vdvldrhtssVarBtonecajqb2 = btonecajqb(jpowsppfya.wkgbmnqykc(kegysxyocbVar), (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc2, f122369lqeggnwhkg);
            ikoacuggdj ikoacuggdjVar2 = (ikoacuggdj) vdvldrhtssVarBtonecajqb2.iobyxmoadg();
            return (zBooleanValue || ((Boolean) vdvldrhtssVarBtonecajqb2.wkgbmnqykc()).booleanValue()) ? new gtknphoqwx(ikoacuggdjVar, ikoacuggdjVar2) : ntlheqmsrt.eablkybsjg(ikoacuggdjVar, ikoacuggdjVar2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + nufgyqmvbuVarWkgbmnqykc2 + "\" while for lower it's \"" + nufgyqmvbuVarWkgbmnqykc + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj gtknphoqwx(jh.eablkybsjg eablkybsjgVar, dxjokdxxww dxjokdxxwwVar, ikoacuggdj ikoacuggdjVar, xh.iobyxmoadg iobyxmoadgVar, aj.lqeggnwhkg kotlinTypeRefiner) {
        jh.eablkybsjg eablkybsjgVarZoijcleaow;
        zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        ii.zoijcleaow zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(eablkybsjgVar);
        if (zoijcleaowVarAgtfadlqog == null || (eablkybsjgVarZoijcleaow = kotlinTypeRefiner.zoijcleaow(zoijcleaowVarAgtfadlqog)) == null || zdlpuopuiu.eablkybsjg(eablkybsjgVarZoijcleaow, eablkybsjgVar)) {
            return null;
        }
        return (ikoacuggdj) dxjokdxxwwVar.btonecajqb(ikoacuggdjVar, eablkybsjgVarZoijcleaow, iobyxmoadgVar).lqeggnwhkg();
    }

    static /* synthetic */ kegysxyocb wflxmlrfwp(dxjokdxxww dxjokdxxwwVar, kegysxyocb kegysxyocbVar, xh.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = new xh.iobyxmoadg(fiwbwshyhd.COMMON, null, false, false, null, null, 62, null);
        }
        return dxjokdxxwwVar.draadjrbmk(kegysxyocbVar, iobyxmoadgVar);
    }

    @Override // zi.igdgnonuha
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public skhdrjzrfn eablkybsjg(kegysxyocb key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return new skhdrjzrfn(wflxmlrfwp(this, key, null, 2, null));
    }

    @Override // zi.igdgnonuha
    public boolean gxszxtbevo() {
        return false;
    }

    public /* synthetic */ dxjokdxxww(auzgnhcxok auzgnhcxokVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : auzgnhcxokVar);
    }
}
