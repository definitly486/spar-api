package p0;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75260iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75261zoijcleaow;

    public lqeggnwhkg(int i13, int i14) {
        this.f75260iobyxmoadg = i13;
        this.f75261zoijcleaow = i14;
        if (i13 >= 0 && i14 >= 0) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i14 + " respectively.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f75260iobyxmoadg == lqeggnwhkgVar.f75260iobyxmoadg && this.f75261zoijcleaow == lqeggnwhkgVar.f75261zoijcleaow;
    }

    public int hashCode() {
        return (this.f75260iobyxmoadg * 31) + this.f75261zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        int iBtonecajqb = wflxmlrfwpVar.btonecajqb();
        int i13 = this.f75261zoijcleaow;
        int iNufgyqmvbu = iBtonecajqb + i13;
        if (((iBtonecajqb ^ iNufgyqmvbu) & (i13 ^ iNufgyqmvbu)) < 0) {
            iNufgyqmvbu = wflxmlrfwpVar.nufgyqmvbu();
        }
        wflxmlrfwpVar.zoijcleaow(wflxmlrfwpVar.btonecajqb(), Math.min(iNufgyqmvbu, wflxmlrfwpVar.nufgyqmvbu()));
        int iGtknphoqwx = wflxmlrfwpVar.gtknphoqwx();
        int i14 = this.f75260iobyxmoadg;
        int i15 = iGtknphoqwx - i14;
        if (((iGtknphoqwx ^ i15) & (i14 ^ iGtknphoqwx)) < 0) {
            i15 = 0;
        }
        wflxmlrfwpVar.zoijcleaow(Math.max(0, i15), wflxmlrfwpVar.gtknphoqwx());
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f75260iobyxmoadg + ", lengthAfterCursor=" + this.f75261zoijcleaow + ')';
    }
}
