package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends vdvldrhtss.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f62354iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Throwable f62355zoijcleaow;

    ppxfxbqfkf(int i13, Throwable th2) {
        this.f62354iobyxmoadg = i13;
        this.f62355zoijcleaow = th2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss.iobyxmoadg)) {
            return false;
        }
        vdvldrhtss.iobyxmoadg iobyxmoadgVar = (vdvldrhtss.iobyxmoadg) obj;
        if (this.f62354iobyxmoadg == iobyxmoadgVar.wkgbmnqykc()) {
            Throwable th2 = this.f62355zoijcleaow;
            if (th2 == null) {
                if (iobyxmoadgVar.ppxfxbqfkf() == null) {
                    return true;
                }
            } else if (th2.equals(iobyxmoadgVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i13 = (this.f62354iobyxmoadg ^ 1000003) * 1000003;
        Throwable th2 = this.f62355zoijcleaow;
        return i13 ^ (th2 == null ? 0 : th2.hashCode());
    }

    @Override // lereixgezr.vdvldrhtss.iobyxmoadg
    public Throwable ppxfxbqfkf() {
        return this.f62355zoijcleaow;
    }

    public String toString() {
        return "StateError{code=" + this.f62354iobyxmoadg + ", cause=" + this.f62355zoijcleaow + "}";
    }

    @Override // lereixgezr.vdvldrhtss.iobyxmoadg
    public int wkgbmnqykc() {
        return this.f62354iobyxmoadg;
    }
}
