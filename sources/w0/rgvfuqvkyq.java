package w0;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f118272eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final rgvfuqvkyq f118273gxszxtbevo = new rgvfuqvkyq(0, 0, 0, 0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f118274iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f118275ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f118276wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f118277zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final rgvfuqvkyq iobyxmoadg() {
            return rgvfuqvkyq.f118273gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    public rgvfuqvkyq(int i13, int i14, int i15, int i16) {
        this.f118274iobyxmoadg = i13;
        this.f118277zoijcleaow = i14;
        this.f118275ppxfxbqfkf = i15;
        this.f118276wkgbmnqykc = i16;
    }

    public static /* synthetic */ rgvfuqvkyq ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = rgvfuqvkyqVar.f118274iobyxmoadg;
        }
        if ((i17 & 2) != 0) {
            i14 = rgvfuqvkyqVar.f118277zoijcleaow;
        }
        if ((i17 & 4) != 0) {
            i15 = rgvfuqvkyqVar.f118275ppxfxbqfkf;
        }
        if ((i17 & 8) != 0) {
            i16 = rgvfuqvkyqVar.f118276wkgbmnqykc;
        }
        return rgvfuqvkyqVar.zoijcleaow(i13, i14, i15, i16);
    }

    public final long btonecajqb() {
        return agtfadlqog.wkgbmnqykc((((long) this.f118277zoijcleaow) & 4294967295L) | (((long) this.f118274iobyxmoadg) << 32));
    }

    public final boolean draadjrbmk() {
        return this.f118274iobyxmoadg >= this.f118275ppxfxbqfkf || this.f118277zoijcleaow >= this.f118276wkgbmnqykc;
    }

    public final int dxjokdxxww() {
        return this.f118277zoijcleaow;
    }

    public final int eablkybsjg() {
        return this.f118276wkgbmnqykc - this.f118277zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return this.f118274iobyxmoadg == rgvfuqvkyqVar.f118274iobyxmoadg && this.f118277zoijcleaow == rgvfuqvkyqVar.f118277zoijcleaow && this.f118275ppxfxbqfkf == rgvfuqvkyqVar.f118275ppxfxbqfkf && this.f118276wkgbmnqykc == rgvfuqvkyqVar.f118276wkgbmnqykc;
    }

    public final int gtknphoqwx() {
        return this.f118275ppxfxbqfkf - this.f118274iobyxmoadg;
    }

    public final int gxszxtbevo() {
        return this.f118274iobyxmoadg;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f118274iobyxmoadg) * 31) + Integer.hashCode(this.f118277zoijcleaow)) * 31) + Integer.hashCode(this.f118275ppxfxbqfkf)) * 31) + Integer.hashCode(this.f118276wkgbmnqykc);
    }

    public final int lqeggnwhkg() {
        return this.f118275ppxfxbqfkf;
    }

    public final long nufgyqmvbu() {
        return oxmwwwfdhm.ppxfxbqfkf((((long) eablkybsjg()) & 4294967295L) | (((long) gtknphoqwx()) << 32));
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f118274iobyxmoadg + ", " + this.f118277zoijcleaow + ", " + this.f118275ppxfxbqfkf + ", " + this.f118276wkgbmnqykc + ')';
    }

    public final rgvfuqvkyq wflxmlrfwp(int i13, int i14) {
        return new rgvfuqvkyq(this.f118274iobyxmoadg + i13, this.f118277zoijcleaow + i14, this.f118275ppxfxbqfkf + i13, this.f118276wkgbmnqykc + i14);
    }

    public final int wkgbmnqykc() {
        return this.f118276wkgbmnqykc;
    }

    public final rgvfuqvkyq zoijcleaow(int i13, int i14, int i15, int i16) {
        return new rgvfuqvkyq(i13, i14, i15, i16);
    }
}
