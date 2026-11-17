package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gc extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56690ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56691zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f56691zoijcleaow = description;
        this.f56690ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56691zoijcleaow, gcVar.f56691zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56690ppxfxbqfkf, gcVar.f56690ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f56690ppxfxbqfkf.hashCode() + (this.f56691zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpWrongBundleState(description=" + this.f56691zoijcleaow + ", phone=" + this.f56690ppxfxbqfkf + ")";
    }
}
