package cx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f26027iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f26028zoijcleaow;

    public dxjokdxxww(String id2, String pickupStatus) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        this.f26027iobyxmoadg = id2;
        this.f26028zoijcleaow = pickupStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f26027iobyxmoadg, dxjokdxxwwVar.f26027iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f26028zoijcleaow, dxjokdxxwwVar.f26028zoijcleaow);
    }

    public int hashCode() {
        return (this.f26027iobyxmoadg.hashCode() * 31) + this.f26028zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f26027iobyxmoadg;
    }

    public String toString() {
        return "OrderPickupStatusEntity(id=" + this.f26027iobyxmoadg + ", pickupStatus=" + this.f26028zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f26028zoijcleaow;
    }
}
