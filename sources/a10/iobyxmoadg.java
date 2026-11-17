package a10;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements z00.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f271iobyxmoadg;

    public iobyxmoadg(double d13) {
        this.f271iobyxmoadg = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && Double.compare(this.f271iobyxmoadg, ((iobyxmoadg) obj).f271iobyxmoadg) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f271iobyxmoadg);
    }

    public Double iobyxmoadg() {
        return Double.valueOf(this.f271iobyxmoadg);
    }

    public String toString() {
        return "DistanceMetre(value=" + this.f271iobyxmoadg + ")";
    }
}
