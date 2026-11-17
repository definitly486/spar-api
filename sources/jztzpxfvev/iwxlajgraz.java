package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public final class iwxlajgraz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jlmebxxoox f52723iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f52724zoijcleaow;

    public /* synthetic */ iwxlajgraz(jlmebxxoox jlmebxxooxVar, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jlmebxxooxVar, j13);
    }

    private final long zoijcleaow(float f13) {
        if (this.f52723iobyxmoadg == null) {
            long j13 = this.f52724zoijcleaow;
            return g.eablkybsjg.rgvfuqvkyq(this.f52724zoijcleaow, g.eablkybsjg.oxmwwwfdhm(g.eablkybsjg.nufgyqmvbu(j13, g.eablkybsjg.gtknphoqwx(j13)), f13));
        }
        float fWkgbmnqykc = wkgbmnqykc(this.f52724zoijcleaow) - (Math.signum(wkgbmnqykc(this.f52724zoijcleaow)) * f13);
        float fPpxfxbqfkf = ppxfxbqfkf(this.f52724zoijcleaow);
        if (this.f52723iobyxmoadg == jlmebxxoox.Horizontal) {
            return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fWkgbmnqykc)) << 32) | (((long) Float.floatToRawIntBits(fPpxfxbqfkf)) & 4294967295L));
        }
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fPpxfxbqfkf)) << 32) | (((long) Float.floatToRawIntBits(fWkgbmnqykc)) & 4294967295L));
    }

    public final void eablkybsjg() {
        this.f52724zoijcleaow = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    public final long iobyxmoadg(t.pmvmpeiblj pmvmpeibljVar, float f13) {
        long jVdvldrhtss = g.eablkybsjg.vdvldrhtss(this.f52724zoijcleaow, g.eablkybsjg.rgvfuqvkyq(pmvmpeibljVar.nufgyqmvbu(), pmvmpeibljVar.gtknphoqwx()));
        this.f52724zoijcleaow = jVdvldrhtss;
        return (this.f52723iobyxmoadg == null ? g.eablkybsjg.gtknphoqwx(jVdvldrhtss) : Math.abs(wkgbmnqykc(jVdvldrhtss))) >= f13 ? zoijcleaow(f13) : g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
    }

    public final float ppxfxbqfkf(long j13) {
        return Float.intBitsToFloat((int) (this.f52723iobyxmoadg == jlmebxxoox.Horizontal ? j13 & 4294967295L : j13 >> 32));
    }

    public final float wkgbmnqykc(long j13) {
        return Float.intBitsToFloat((int) (this.f52723iobyxmoadg == jlmebxxoox.Horizontal ? j13 >> 32 : j13 & 4294967295L));
    }

    private iwxlajgraz(jlmebxxoox jlmebxxooxVar, long j13) {
        this.f52723iobyxmoadg = jlmebxxooxVar;
        this.f52724zoijcleaow = j13;
    }
}
