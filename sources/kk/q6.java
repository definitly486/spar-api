package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f58156ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f58157zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f58157zoijcleaow = description;
        this.f58156ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58157zoijcleaow, q6Var.f58157zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58156ppxfxbqfkf, q6Var.f58156ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f58156ppxfxbqfkf.hashCode() + (this.f58157zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpOrderNotFoundError(description=" + this.f58157zoijcleaow + ", phone=" + this.f58156ppxfxbqfkf + ")";
    }
}
