package hy;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f41300iobyxmoadg;

    public iobyxmoadg(int i13) {
        this.f41300iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && this.f41300iobyxmoadg == ((iobyxmoadg) obj).f41300iobyxmoadg;
    }

    public int hashCode() {
        return Integer.hashCode(this.f41300iobyxmoadg);
    }

    public final int iobyxmoadg() {
        return this.f41300iobyxmoadg;
    }

    public String toString() {
        return "OrderEditBonusesEntity(applied=" + this.f41300iobyxmoadg + ")";
    }
}
