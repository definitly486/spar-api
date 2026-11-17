package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f17234iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f17235zoijcleaow;

    public btonecajqb(String name, String phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f17234iobyxmoadg = name;
        this.f17235zoijcleaow = phone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f17234iobyxmoadg, btonecajqbVar.f17234iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17235zoijcleaow, btonecajqbVar.f17235zoijcleaow);
    }

    public int hashCode() {
        return (this.f17234iobyxmoadg.hashCode() * 31) + this.f17235zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f17234iobyxmoadg;
    }

    public String toString() {
        return "CartReceiverEntity(name=" + this.f17234iobyxmoadg + ", phone=" + this.f17235zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f17235zoijcleaow;
    }
}
