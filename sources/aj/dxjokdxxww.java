package aj;

import java.util.List;
import jh.yfnezrywwk;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.opjhrmiecq;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends ikoacuggdj implements dj.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final opjhrmiecq f2049cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f2050esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final grlcpdaxtj f2051iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final agtfadlqog f2052jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f2053lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final dj.zoijcleaow f2054yggfygwlhe;

    public /* synthetic */ dxjokdxxww(dj.zoijcleaow zoijcleaowVar, agtfadlqog agtfadlqogVar, grlcpdaxtj grlcpdaxtjVar, opjhrmiecq opjhrmiecqVar, boolean z13, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, agtfadlqogVar, grlcpdaxtjVar, (i13 & 8) != 0 ? opjhrmiecq.f130109yggfygwlhe.btonecajqb() : opjhrmiecqVar, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? false : z14);
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public agtfadlqog grlcpdaxtj() {
        return this.f2052jyumaefscl;
    }

    @Override // zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        return bj.draadjrbmk.iobyxmoadg(bj.nufgyqmvbu.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final grlcpdaxtj b() {
        return this.f2051iwizpuwonk;
    }

    public final boolean c() {
        return this.f2053lereixgezr;
    }

    @Override // zi.ikoacuggdj
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww fmlbqenlif(boolean z13) {
        return new dxjokdxxww(this.f2054yggfygwlhe, grlcpdaxtj(), this.f2051iwizpuwonk, ipoelvxyzq(), z13, false, 32, null);
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww ixidwrxhsl(lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        dj.zoijcleaow zoijcleaowVar = this.f2054yggfygwlhe;
        agtfadlqog agtfadlqogVarIobyxmoadg = grlcpdaxtj().iobyxmoadg(kotlinTypeRefiner);
        grlcpdaxtj grlcpdaxtjVar = this.f2051iwizpuwonk;
        return new dxjokdxxww(zoijcleaowVar, agtfadlqogVarIobyxmoadg, grlcpdaxtjVar != null ? kotlinTypeRefiner.iobyxmoadg(grlcpdaxtjVar).jrbgnlbqoe() : null, ipoelvxyzq(), mhtqkkgtqm(), false, 32, null);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new dxjokdxxww(this.f2054yggfygwlhe, grlcpdaxtj(), this.f2051iwizpuwonk, newAttributes, mhtqkkgtqm(), this.f2053lereixgezr);
    }

    @Override // zi.kegysxyocb
    public List fyldjkxazc() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zi.kegysxyocb
    public opjhrmiecq ipoelvxyzq() {
        return this.f2049cqumvgiudr;
    }

    public final dj.zoijcleaow krqnebusok() {
        return this.f2054yggfygwlhe;
    }

    @Override // zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return this.f2050esjtqupxsv;
    }

    public dxjokdxxww(dj.zoijcleaow captureStatus, agtfadlqog constructor, grlcpdaxtj grlcpdaxtjVar, opjhrmiecq attributes, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(captureStatus, "captureStatus");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(attributes, "attributes");
        this.f2054yggfygwlhe = captureStatus;
        this.f2052jyumaefscl = constructor;
        this.f2051iwizpuwonk = grlcpdaxtjVar;
        this.f2049cqumvgiudr = attributes;
        this.f2050esjtqupxsv = z13;
        this.f2053lereixgezr = z14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(dj.zoijcleaow captureStatus, grlcpdaxtj grlcpdaxtjVar, iwxlajgraz projection, yfnezrywwk typeParameter) {
        this(captureStatus, new agtfadlqog(projection, null, null, typeParameter, 6, null), grlcpdaxtjVar, null, false, false, 56, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(captureStatus, "captureStatus");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(projection, "projection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
    }
}
