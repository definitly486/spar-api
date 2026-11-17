package cx0;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f26045iobyxmoadg;

    public iobyxmoadg(int i13) {
        this.f26045iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && this.f26045iobyxmoadg == ((iobyxmoadg) obj).f26045iobyxmoadg;
    }

    public int hashCode() {
        return Integer.hashCode(this.f26045iobyxmoadg);
    }

    public final int iobyxmoadg() {
        return this.f26045iobyxmoadg;
    }

    public String toString() {
        return "OrderEditBonusesEntity(applied=" + this.f26045iobyxmoadg + ")";
    }
}
