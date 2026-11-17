package cb1;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f19520iobyxmoadg;

    public btonecajqb(boolean z13) {
        this.f19520iobyxmoadg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btonecajqb) && this.f19520iobyxmoadg == ((btonecajqb) obj).f19520iobyxmoadg;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f19520iobyxmoadg);
    }

    public final boolean iobyxmoadg() {
        return this.f19520iobyxmoadg;
    }

    public String toString() {
        return "Model(isSubmit=" + this.f19520iobyxmoadg + ")";
    }
}
