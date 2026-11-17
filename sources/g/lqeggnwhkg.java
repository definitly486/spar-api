package g;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f35592eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final lqeggnwhkg f35593gxszxtbevo = new lqeggnwhkg(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f35594iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f35595ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f35596wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f35597zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg() {
            return lqeggnwhkg.f35593gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    public lqeggnwhkg(float f13, float f14, float f15, float f16) {
        this.f35594iobyxmoadg = f13;
        this.f35597zoijcleaow = f14;
        this.f35595ppxfxbqfkf = f15;
        this.f35596wkgbmnqykc = f16;
    }

    public static /* synthetic */ lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, float f13, float f14, float f15, float f16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = lqeggnwhkgVar.f35594iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            f14 = lqeggnwhkgVar.f35597zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            f15 = lqeggnwhkgVar.f35595ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            f16 = lqeggnwhkgVar.f35596wkgbmnqykc;
        }
        return lqeggnwhkgVar.ppxfxbqfkf(f13, f14, f15, f16);
    }

    public final lqeggnwhkg agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        return new lqeggnwhkg(Math.max(this.f35594iobyxmoadg, lqeggnwhkgVar.f35594iobyxmoadg), Math.max(this.f35597zoijcleaow, lqeggnwhkgVar.f35597zoijcleaow), Math.min(this.f35595ppxfxbqfkf, lqeggnwhkgVar.f35595ppxfxbqfkf), Math.min(this.f35596wkgbmnqykc, lqeggnwhkgVar.f35596wkgbmnqykc));
    }

    public final long btonecajqb() {
        float fDxjokdxxww = dxjokdxxww() - nufgyqmvbu();
        return gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(eablkybsjg() - gtknphoqwx())) & 4294967295L) | (Float.floatToRawIntBits(fDxjokdxxww) << 32));
    }

    public final long draadjrbmk() {
        float f13 = this.f35594iobyxmoadg;
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(this.f35597zoijcleaow)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
    }

    public final float dxjokdxxww() {
        return this.f35595ppxfxbqfkf;
    }

    public final float eablkybsjg() {
        return this.f35596wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Float.compare(this.f35594iobyxmoadg, lqeggnwhkgVar.f35594iobyxmoadg) == 0 && Float.compare(this.f35597zoijcleaow, lqeggnwhkgVar.f35597zoijcleaow) == 0 && Float.compare(this.f35595ppxfxbqfkf, lqeggnwhkgVar.f35595ppxfxbqfkf) == 0 && Float.compare(this.f35596wkgbmnqykc, lqeggnwhkgVar.f35596wkgbmnqykc) == 0;
    }

    public final float gtknphoqwx() {
        return this.f35597zoijcleaow;
    }

    public final long gxszxtbevo() {
        float f13 = this.f35595ppxfxbqfkf;
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(this.f35596wkgbmnqykc)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f35594iobyxmoadg) * 31) + Float.hashCode(this.f35597zoijcleaow)) * 31) + Float.hashCode(this.f35595ppxfxbqfkf)) * 31) + Float.hashCode(this.f35596wkgbmnqykc);
    }

    public final long lqeggnwhkg() {
        float fDxjokdxxww = this.f35594iobyxmoadg + ((dxjokdxxww() - nufgyqmvbu()) / 2.0f);
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(this.f35597zoijcleaow + ((eablkybsjg() - gtknphoqwx()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fDxjokdxxww) << 32));
    }

    public final float nufgyqmvbu() {
        return this.f35594iobyxmoadg;
    }

    public final boolean ojitshcjhn() {
        return (this.f35594iobyxmoadg >= this.f35595ppxfxbqfkf) | (this.f35597zoijcleaow >= this.f35596wkgbmnqykc);
    }

    public final lqeggnwhkg oxmwwwfdhm(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return new lqeggnwhkg(this.f35594iobyxmoadg + Float.intBitsToFloat(i13), this.f35597zoijcleaow + Float.intBitsToFloat(i14), this.f35595ppxfxbqfkf + Float.intBitsToFloat(i13), this.f35596wkgbmnqykc + Float.intBitsToFloat(i14));
    }

    public final lqeggnwhkg ppxfxbqfkf(float f13, float f14, float f15, float f16) {
        return new lqeggnwhkg(f13, f14, f15, f16);
    }

    public final boolean rgvfuqvkyq(lqeggnwhkg lqeggnwhkgVar) {
        return (this.f35594iobyxmoadg < lqeggnwhkgVar.f35595ppxfxbqfkf) & (lqeggnwhkgVar.f35594iobyxmoadg < this.f35595ppxfxbqfkf) & (this.f35597zoijcleaow < lqeggnwhkgVar.f35596wkgbmnqykc) & (lqeggnwhkgVar.f35597zoijcleaow < this.f35596wkgbmnqykc);
    }

    public String toString() {
        return "Rect.fromLTRB(" + zoijcleaow.iobyxmoadg(this.f35594iobyxmoadg, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35597zoijcleaow, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35595ppxfxbqfkf, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35596wkgbmnqykc, 1) + ')';
    }

    public final lqeggnwhkg vdvldrhtss(float f13, float f14) {
        return new lqeggnwhkg(this.f35594iobyxmoadg + f13, this.f35597zoijcleaow + f14, this.f35595ppxfxbqfkf + f13, this.f35596wkgbmnqykc + f14);
    }

    public final lqeggnwhkg wflxmlrfwp(float f13, float f14, float f15, float f16) {
        return new lqeggnwhkg(Math.max(this.f35594iobyxmoadg, f13), Math.max(this.f35597zoijcleaow, f14), Math.min(this.f35595ppxfxbqfkf, f15), Math.min(this.f35596wkgbmnqykc, f16));
    }

    public final boolean zoijcleaow(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (fIntBitsToFloat >= this.f35594iobyxmoadg) & (fIntBitsToFloat < this.f35595ppxfxbqfkf) & (fIntBitsToFloat2 >= this.f35597zoijcleaow) & (fIntBitsToFloat2 < this.f35596wkgbmnqykc);
    }
}
