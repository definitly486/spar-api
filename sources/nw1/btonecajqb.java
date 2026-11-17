package nw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71270iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f71271ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71272zoijcleaow;

    public btonecajqb(String phone, String hash, String sms) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(hash, "hash");
        zdlpuopuiu.btonecajqb(sms, "sms");
        this.f71270iobyxmoadg = phone;
        this.f71272zoijcleaow = hash;
        this.f71271ppxfxbqfkf = sms;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f71270iobyxmoadg, btonecajqbVar.f71270iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71272zoijcleaow, btonecajqbVar.f71272zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71271ppxfxbqfkf, btonecajqbVar.f71271ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f71270iobyxmoadg.hashCode() * 31) + this.f71272zoijcleaow.hashCode()) * 31) + this.f71271ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f71272zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f71271ppxfxbqfkf;
    }

    public String toString() {
        return "UserVerifyData(phone=" + this.f71270iobyxmoadg + ", hash=" + this.f71272zoijcleaow + ", sms=" + this.f71271ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f71270iobyxmoadg;
    }
}
