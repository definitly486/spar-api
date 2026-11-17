package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38667iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38668zoijcleaow;

    public btonecajqb(String name, String phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f38667iobyxmoadg = name;
        this.f38668zoijcleaow = phone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f38667iobyxmoadg, btonecajqbVar.f38667iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38668zoijcleaow, btonecajqbVar.f38668zoijcleaow);
    }

    public int hashCode() {
        return (this.f38667iobyxmoadg.hashCode() * 31) + this.f38668zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f38667iobyxmoadg;
    }

    public String toString() {
        return "CartReceiverEntity(name=" + this.f38667iobyxmoadg + ", phone=" + this.f38668zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f38668zoijcleaow;
    }
}
