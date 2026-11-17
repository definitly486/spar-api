package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f4957zoijcleaow = ipoelvxyzq.ppxfxbqfkf.f49166iwizpuwonk;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f4958iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new iobyxmoadg[16], 0);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f4959iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f4960zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f4959iobyxmoadg = i13;
            this.f4960zoijcleaow = i14;
            if (!(i13 >= 0)) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("negative start index");
            }
            if (i14 >= i13) {
                return;
            }
            rlfsiqarku.eablkybsjg.iobyxmoadg("end index greater than start");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f4959iobyxmoadg == iobyxmoadgVar.f4959iobyxmoadg && this.f4960zoijcleaow == iobyxmoadgVar.f4960zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f4959iobyxmoadg) * 31) + Integer.hashCode(this.f4960zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f4960zoijcleaow;
        }

        public String toString() {
            return "Interval(start=" + this.f4959iobyxmoadg + ", end=" + this.f4960zoijcleaow + ')';
        }

        public final int zoijcleaow() {
            return this.f4959iobyxmoadg;
        }
    }

    public final void eablkybsjg(iobyxmoadg iobyxmoadgVar) {
        this.f4958iobyxmoadg.rgvfuqvkyq(iobyxmoadgVar);
    }

    public final iobyxmoadg iobyxmoadg(int i13, int i14) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(i13, i14);
        this.f4958iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        return iobyxmoadgVar;
    }

    public final int ppxfxbqfkf() {
        int iZoijcleaow = ((iobyxmoadg) this.f4958iobyxmoadg.gtknphoqwx()).zoijcleaow();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f4958iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objArr[i13];
            if (iobyxmoadgVar.zoijcleaow() < iZoijcleaow) {
                iZoijcleaow = iobyxmoadgVar.zoijcleaow();
            }
        }
        if (!(iZoijcleaow >= 0)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("negative minIndex");
        }
        return iZoijcleaow;
    }

    public final boolean wkgbmnqykc() {
        return this.f4958iobyxmoadg.draadjrbmk() != 0;
    }

    public final int zoijcleaow() {
        int iIobyxmoadg = ((iobyxmoadg) this.f4958iobyxmoadg.gtknphoqwx()).iobyxmoadg();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f4958iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objArr[i13];
            if (iobyxmoadgVar.iobyxmoadg() > iIobyxmoadg) {
                iIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            }
        }
        return iIobyxmoadg;
    }
}
