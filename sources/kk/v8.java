package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class v8 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f58973ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f58974zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f58974zoijcleaow = description;
        this.f58973ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58974zoijcleaow, v8Var.f58974zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58973ppxfxbqfkf, v8Var.f58973ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f58973ppxfxbqfkf.hashCode() + (this.f58974zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpSystemOrInternalError(description=" + this.f58974zoijcleaow + ", phone=" + this.f58973ppxfxbqfkf + ")";
    }
}
