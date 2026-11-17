package ap1;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f14072iobyxmoadg;

    public dxjokdxxww(int i13) {
        this.f14072iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && this.f14072iobyxmoadg == ((dxjokdxxww) obj).f14072iobyxmoadg;
    }

    public int hashCode() {
        return Integer.hashCode(this.f14072iobyxmoadg);
    }

    public final int iobyxmoadg() {
        return this.f14072iobyxmoadg;
    }

    public String toString() {
        return "Model(currentItem=" + this.f14072iobyxmoadg + ")";
    }
}
