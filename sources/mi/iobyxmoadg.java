package mi;

import aj.lqeggnwhkg;
import bj.draadjrbmk;
import bj.nufgyqmvbu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.opjhrmiecq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ikoacuggdj implements dj.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final opjhrmiecq f67238cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f67239iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f67240jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iwxlajgraz f67241yggfygwlhe;

    public /* synthetic */ iobyxmoadg(iwxlajgraz iwxlajgrazVar, zoijcleaow zoijcleaowVar, boolean z13, opjhrmiecq opjhrmiecqVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(iwxlajgrazVar, (i13 & 2) != 0 ? new ppxfxbqfkf(iwxlajgrazVar) : zoijcleaowVar, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? opjhrmiecq.f130109yggfygwlhe.btonecajqb() : opjhrmiecqVar);
    }

    @Override // zi.ikoacuggdj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg fmlbqenlif(boolean z13) {
        return z13 == mhtqkkgtqm() ? this : new iobyxmoadg(this.f67241yggfygwlhe, grlcpdaxtj(), z13, ipoelvxyzq());
    }

    @Override // zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        return draadjrbmk.iobyxmoadg(nufgyqmvbu.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ixidwrxhsl(lqeggnwhkg kotlinTypeRefiner) {
        zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        iwxlajgraz iwxlajgrazVarIobyxmoadg = this.f67241yggfygwlhe.iobyxmoadg(kotlinTypeRefiner);
        zdlpuopuiu.dxjokdxxww(iwxlajgrazVarIobyxmoadg, "refine(...)");
        return new iobyxmoadg(iwxlajgrazVarIobyxmoadg, grlcpdaxtj(), mhtqkkgtqm(), ipoelvxyzq());
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new iobyxmoadg(this.f67241yggfygwlhe, grlcpdaxtj(), mhtqkkgtqm(), newAttributes);
    }

    @Override // zi.kegysxyocb
    public List fyldjkxazc() {
        return jyumaefscl.wflxmlrfwp();
    }

    @Override // zi.kegysxyocb
    public opjhrmiecq ipoelvxyzq() {
        return this.f67238cqumvgiudr;
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: krqnebusok, reason: merged with bridge method [inline-methods] */
    public zoijcleaow grlcpdaxtj() {
        return this.f67240jyumaefscl;
    }

    @Override // zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return this.f67239iwizpuwonk;
    }

    @Override // zi.ikoacuggdj
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Captured(");
        sb3.append(this.f67241yggfygwlhe);
        sb3.append(')');
        sb3.append(mhtqkkgtqm() ? "?" : "");
        return sb3.toString();
    }

    public iobyxmoadg(iwxlajgraz typeProjection, zoijcleaow constructor, boolean z13, opjhrmiecq attributes) {
        zdlpuopuiu.btonecajqb(typeProjection, "typeProjection");
        zdlpuopuiu.btonecajqb(constructor, "constructor");
        zdlpuopuiu.btonecajqb(attributes, "attributes");
        this.f67241yggfygwlhe = typeProjection;
        this.f67240jyumaefscl = constructor;
        this.f67239iwizpuwonk = z13;
        this.f67238cqumvgiudr = attributes;
    }
}
