package krqnebusok;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f60500iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f60501zoijcleaow;

    public rgvfuqvkyq(int i13, Integer num) {
        this.f60500iobyxmoadg = i13;
        this.f60501zoijcleaow = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return this.f60500iobyxmoadg == rgvfuqvkyqVar.f60500iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f60501zoijcleaow, rgvfuqvkyqVar.f60501zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f60500iobyxmoadg) * 31;
        Integer num = this.f60501zoijcleaow;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final int iobyxmoadg() {
        return this.f60500iobyxmoadg;
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f60500iobyxmoadg + ", dataOffset=" + this.f60501zoijcleaow + ')';
    }

    public final Integer zoijcleaow() {
        return this.f60501zoijcleaow;
    }
}
