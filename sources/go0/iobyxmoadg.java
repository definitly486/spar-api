package go0;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f37994iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f37995ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f37996zoijcleaow;

    public iobyxmoadg(boolean z13, boolean z14, boolean z15) {
        this.f37994iobyxmoadg = z13;
        this.f37996zoijcleaow = z14;
        this.f37995ppxfxbqfkf = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f37994iobyxmoadg == iobyxmoadgVar.f37994iobyxmoadg && this.f37996zoijcleaow == iobyxmoadgVar.f37996zoijcleaow && this.f37995ppxfxbqfkf == iobyxmoadgVar.f37995ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f37994iobyxmoadg) * 31) + Boolean.hashCode(this.f37996zoijcleaow)) * 31) + Boolean.hashCode(this.f37995ppxfxbqfkf);
    }

    public final boolean iobyxmoadg() {
        return this.f37994iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f37995ppxfxbqfkf;
    }

    public String toString() {
        return "CartCombineState(isLoggedIn=" + this.f37994iobyxmoadg + ", isCartCompoundChanged=" + this.f37996zoijcleaow + ", isScreenVisible=" + this.f37995ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f37996zoijcleaow;
    }
}
