package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f57387ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f57388zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f57388zoijcleaow = description;
        this.f57387ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57388zoijcleaow, l4Var.f57388zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57387ppxfxbqfkf, l4Var.f57387ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f57387ppxfxbqfkf.hashCode() + (this.f57388zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpAttemptsExhausted(description=" + this.f57388zoijcleaow + ", phone=" + this.f57387ppxfxbqfkf + ")";
    }
}
