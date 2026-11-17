package mi;

import aj.agtfadlqog;
import aj.lqeggnwhkg;
import gh.dxjokdxxww;
import hg.jyumaefscl;
import java.util.Collection;
import java.util.List;
import jh.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f67242iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private agtfadlqog f67243zoijcleaow;

    public ppxfxbqfkf(iwxlajgraz projection) {
        zdlpuopuiu.btonecajqb(projection, "projection");
        this.f67242iobyxmoadg = projection;
        ppxfxbqfkf().ppxfxbqfkf();
        mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT;
    }

    public final void dxjokdxxww(agtfadlqog agtfadlqogVar) {
        this.f67243zoijcleaow = agtfadlqogVar;
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return false;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        return jyumaefscl.wflxmlrfwp();
    }

    public Void gxszxtbevo() {
        return null;
    }

    public final agtfadlqog lqeggnwhkg() {
        return this.f67243zoijcleaow;
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf iobyxmoadg(lqeggnwhkg kotlinTypeRefiner) {
        zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        iwxlajgraz iwxlajgrazVarIobyxmoadg = ppxfxbqfkf().iobyxmoadg(kotlinTypeRefiner);
        zdlpuopuiu.dxjokdxxww(iwxlajgrazVarIobyxmoadg, "refine(...)");
        return new ppxfxbqfkf(iwxlajgrazVarIobyxmoadg);
    }

    @Override // mi.zoijcleaow
    public iwxlajgraz ppxfxbqfkf() {
        return this.f67242iobyxmoadg;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + ppxfxbqfkf() + ')';
    }

    @Override // zi.zeieaojujs
    public dxjokdxxww wflxmlrfwp() {
        dxjokdxxww dxjokdxxwwVarWflxmlrfwp = ppxfxbqfkf().getType().grlcpdaxtj().wflxmlrfwp();
        zdlpuopuiu.dxjokdxxww(dxjokdxxwwVarWflxmlrfwp, "getBuiltIns(...)");
        return dxjokdxxwwVarWflxmlrfwp;
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: wkgbmnqykc */
    public /* bridge */ /* synthetic */ nufgyqmvbu ylkuphrtab() {
        return (nufgyqmvbu) gxszxtbevo();
    }

    @Override // zi.zeieaojujs
    public Collection zoijcleaow() {
        kegysxyocb type = ppxfxbqfkf().ppxfxbqfkf() == mhtqkkgtqm.OUT_VARIANCE ? ppxfxbqfkf().getType() : wflxmlrfwp().ylkuphrtab();
        zdlpuopuiu.lqeggnwhkg(type);
        return jyumaefscl.eablkybsjg(type);
    }
}
