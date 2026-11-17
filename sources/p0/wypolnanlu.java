package p0;

/* JADX INFO: loaded from: classes.dex */
public final class wypolnanlu implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75322iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75323zoijcleaow;

    public wypolnanlu(int i13, int i14) {
        this.f75322iobyxmoadg = i13;
        this.f75323zoijcleaow = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wypolnanlu)) {
            return false;
        }
        wypolnanlu wypolnanluVar = (wypolnanlu) obj;
        return this.f75322iobyxmoadg == wypolnanluVar.f75322iobyxmoadg && this.f75323zoijcleaow == wypolnanluVar.f75323zoijcleaow;
    }

    public int hashCode() {
        return (this.f75322iobyxmoadg * 31) + this.f75323zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        int iAgtfadlqog = zg.gtknphoqwx.agtfadlqog(this.f75322iobyxmoadg, 0, wflxmlrfwpVar.nufgyqmvbu());
        int iAgtfadlqog2 = zg.gtknphoqwx.agtfadlqog(this.f75323zoijcleaow, 0, wflxmlrfwpVar.nufgyqmvbu());
        if (iAgtfadlqog < iAgtfadlqog2) {
            wflxmlrfwpVar.rgvfuqvkyq(iAgtfadlqog, iAgtfadlqog2);
        } else {
            wflxmlrfwpVar.rgvfuqvkyq(iAgtfadlqog2, iAgtfadlqog);
        }
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f75322iobyxmoadg + ", end=" + this.f75323zoijcleaow + ')';
    }
}
