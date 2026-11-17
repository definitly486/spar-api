package p0;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75184iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75185zoijcleaow;

    public cllcsxoeiz(int i13, int i14) {
        this.f75184iobyxmoadg = i13;
        this.f75185zoijcleaow = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return this.f75184iobyxmoadg == cllcsxoeizVar.f75184iobyxmoadg && this.f75185zoijcleaow == cllcsxoeizVar.f75185zoijcleaow;
    }

    public int hashCode() {
        return (this.f75184iobyxmoadg * 31) + this.f75185zoijcleaow;
    }

    @Override // p0.dxjokdxxww
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar.draadjrbmk()) {
            wflxmlrfwpVar.iobyxmoadg();
        }
        int iAgtfadlqog = zg.gtknphoqwx.agtfadlqog(this.f75184iobyxmoadg, 0, wflxmlrfwpVar.nufgyqmvbu());
        int iAgtfadlqog2 = zg.gtknphoqwx.agtfadlqog(this.f75185zoijcleaow, 0, wflxmlrfwpVar.nufgyqmvbu());
        if (iAgtfadlqog != iAgtfadlqog2) {
            if (iAgtfadlqog < iAgtfadlqog2) {
                wflxmlrfwpVar.agtfadlqog(iAgtfadlqog, iAgtfadlqog2);
            } else {
                wflxmlrfwpVar.agtfadlqog(iAgtfadlqog2, iAgtfadlqog);
            }
        }
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f75184iobyxmoadg + ", end=" + this.f75185zoijcleaow + ')';
    }
}
