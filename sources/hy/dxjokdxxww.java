package hy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41282iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f41283zoijcleaow;

    public dxjokdxxww(String id2, String pickupStatus) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        this.f41282iobyxmoadg = id2;
        this.f41283zoijcleaow = pickupStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f41282iobyxmoadg, dxjokdxxwwVar.f41282iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41283zoijcleaow, dxjokdxxwwVar.f41283zoijcleaow);
    }

    public int hashCode() {
        return (this.f41282iobyxmoadg.hashCode() * 31) + this.f41283zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f41282iobyxmoadg;
    }

    public String toString() {
        return "OrderPickupStatusEntity(id=" + this.f41282iobyxmoadg + ", pickupStatus=" + this.f41283zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f41283zoijcleaow;
    }
}
