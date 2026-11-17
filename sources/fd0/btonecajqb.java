package fd0;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f33426iobyxmoadg;

    public btonecajqb(boolean z13) {
        this.f33426iobyxmoadg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btonecajqb) && this.f33426iobyxmoadg == ((btonecajqb) obj).f33426iobyxmoadg;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f33426iobyxmoadg);
    }

    public final boolean iobyxmoadg() {
        return this.f33426iobyxmoadg;
    }

    public String toString() {
        return "Model(isSubmit=" + this.f33426iobyxmoadg + ")";
    }
}
