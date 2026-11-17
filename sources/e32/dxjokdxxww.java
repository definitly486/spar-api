package e32;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f30403iobyxmoadg;

    public dxjokdxxww(int i13) {
        this.f30403iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && this.f30403iobyxmoadg == ((dxjokdxxww) obj).f30403iobyxmoadg;
    }

    public int hashCode() {
        return Integer.hashCode(this.f30403iobyxmoadg);
    }

    public final int iobyxmoadg() {
        return this.f30403iobyxmoadg;
    }

    public String toString() {
        return "Model(currentItem=" + this.f30403iobyxmoadg + ")";
    }
}
