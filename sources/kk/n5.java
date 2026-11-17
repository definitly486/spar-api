package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f57732ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f57733zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f57733zoijcleaow = description;
        this.f57732ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57733zoijcleaow, n5Var.f57733zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57732ppxfxbqfkf, n5Var.f57732ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f57732ppxfxbqfkf.hashCode() + (this.f57733zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpBundleNotFoundError(description=" + this.f57733zoijcleaow + ", phone=" + this.f57732ppxfxbqfkf + ")";
    }
}
