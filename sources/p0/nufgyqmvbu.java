package p0;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75264iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75265zoijcleaow;

    public nufgyqmvbu(int i13, int i14) {
        this.f75264iobyxmoadg = i13;
        this.f75265zoijcleaow = i14;
        if (i13 >= 0 && i14 >= 0) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i14 + " respectively.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f75264iobyxmoadg == nufgyqmvbuVar.f75264iobyxmoadg && this.f75265zoijcleaow == nufgyqmvbuVar.f75265zoijcleaow;
    }

    public int hashCode() {
        return (this.f75264iobyxmoadg * 31) + this.f75265zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        int i13 = this.f75264iobyxmoadg;
        int iGtknphoqwx = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iGtknphoqwx + 1;
            if (wflxmlrfwpVar.gtknphoqwx() <= i15) {
                iGtknphoqwx = wflxmlrfwpVar.gtknphoqwx();
                break;
            }
            iGtknphoqwx = btonecajqb.zoijcleaow(wflxmlrfwpVar.ppxfxbqfkf((wflxmlrfwpVar.gtknphoqwx() - i15) + (-1)), wflxmlrfwpVar.ppxfxbqfkf(wflxmlrfwpVar.gtknphoqwx() - i15)) ? iGtknphoqwx + 2 : i15;
        }
        int i16 = this.f75265zoijcleaow;
        int iNufgyqmvbu = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = iNufgyqmvbu + 1;
            if (wflxmlrfwpVar.btonecajqb() + i18 >= wflxmlrfwpVar.nufgyqmvbu()) {
                iNufgyqmvbu = wflxmlrfwpVar.nufgyqmvbu() - wflxmlrfwpVar.btonecajqb();
                break;
            }
            iNufgyqmvbu = btonecajqb.zoijcleaow(wflxmlrfwpVar.ppxfxbqfkf((wflxmlrfwpVar.btonecajqb() + i18) + (-1)), wflxmlrfwpVar.ppxfxbqfkf(wflxmlrfwpVar.btonecajqb() + i18)) ? iNufgyqmvbu + 2 : i18;
        }
        wflxmlrfwpVar.zoijcleaow(wflxmlrfwpVar.btonecajqb(), wflxmlrfwpVar.btonecajqb() + iNufgyqmvbu);
        wflxmlrfwpVar.zoijcleaow(wflxmlrfwpVar.gtknphoqwx() - iGtknphoqwx, wflxmlrfwpVar.gtknphoqwx());
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f75264iobyxmoadg + ", lengthAfterCursor=" + this.f75265zoijcleaow + ')';
    }
}
