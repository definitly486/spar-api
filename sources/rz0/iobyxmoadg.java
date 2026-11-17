package rz0;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements qz0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f105074iobyxmoadg;

    public iobyxmoadg(double d13) {
        this.f105074iobyxmoadg = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && Double.compare(this.f105074iobyxmoadg, ((iobyxmoadg) obj).f105074iobyxmoadg) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f105074iobyxmoadg);
    }

    public Double iobyxmoadg() {
        return Double.valueOf(this.f105074iobyxmoadg);
    }

    public String toString() {
        return "DistanceMetre(value=" + this.f105074iobyxmoadg + ")";
    }
}
