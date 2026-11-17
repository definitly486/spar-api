package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class y9 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f59396ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f59397zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f59397zoijcleaow = description;
        this.f59396ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59397zoijcleaow, y9Var.f59397zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59396ppxfxbqfkf, y9Var.f59396ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f59396ppxfxbqfkf.hashCode() + (this.f59397zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpTimeoutError(description=" + this.f59397zoijcleaow + ", phone=" + this.f59396ppxfxbqfkf + ")";
    }
}
