package sflfametgt;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements s.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jztzpxfvev.jlmebxxoox f106238yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ikoacuggdj f106239zdlpuopuiu;

    public iobyxmoadg(ikoacuggdj ikoacuggdjVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        this.f106239zdlpuopuiu = ikoacuggdjVar;
        this.f106238yggfygwlhe = jlmebxxooxVar;
    }

    private final float zoijcleaow(long j13) {
        return Float.intBitsToFloat((int) (this.f106238yggfygwlhe == jztzpxfvev.jlmebxxoox.Horizontal ? j13 >> 32 : j13 & 4294967295L));
    }

    @Override // s.iobyxmoadg
    public long E(long j13, int i13) {
        if (!s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow()) || Math.abs(this.f106239zdlpuopuiu.esjtqupxsv()) <= 1.0E-6d) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        float fEsjtqupxsv = this.f106239zdlpuopuiu.esjtqupxsv() * this.f106239zdlpuopuiu.hcddaimhww();
        float fLqeggnwhkg = ((this.f106239zdlpuopuiu.yadqdtsiqt().lqeggnwhkg() + this.f106239zdlpuopuiu.yadqdtsiqt().dxjokdxxww()) * (-Math.signum(this.f106239zdlpuopuiu.esjtqupxsv()))) + fEsjtqupxsv;
        if (this.f106239zdlpuopuiu.esjtqupxsv() > 0.0f) {
            fLqeggnwhkg = fEsjtqupxsv;
            fEsjtqupxsv = fLqeggnwhkg;
        }
        jztzpxfvev.jlmebxxoox jlmebxxooxVar = this.f106238yggfygwlhe;
        jztzpxfvev.jlmebxxoox jlmebxxooxVar2 = jztzpxfvev.jlmebxxoox.Horizontal;
        float fIntBitsToFloat = -this.f106239zdlpuopuiu.gxszxtbevo(-zg.gtknphoqwx.wflxmlrfwp(Float.intBitsToFloat((int) (jlmebxxooxVar == jlmebxxooxVar2 ? j13 >> 32 : j13 & 4294967295L)), fEsjtqupxsv, fLqeggnwhkg));
        float fIntBitsToFloat2 = this.f106238yggfygwlhe == jlmebxxooxVar2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j13 >> 32));
        if (this.f106238yggfygwlhe != jztzpxfvev.jlmebxxoox.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        return g.eablkybsjg.gxszxtbevo(j13, fIntBitsToFloat2, fIntBitsToFloat);
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        if (!s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.iobyxmoadg()) || zoijcleaow(j14) == 0.0f) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long iobyxmoadg(long j13, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        return jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical ? w0.esjtqupxsv.eablkybsjg(j13, 0.0f, 0.0f, 2, null) : w0.esjtqupxsv.eablkybsjg(j13, 0.0f, 0.0f, 1, null);
    }

    @Override // s.iobyxmoadg
    public Object wypolnanlu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        return w0.esjtqupxsv.zoijcleaow(iobyxmoadg(j14, this.f106238yggfygwlhe));
    }
}
