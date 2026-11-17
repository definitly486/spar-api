package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class eb extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56397ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56398zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(vu description, String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f56398zoijcleaow = description;
        this.f56397ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56398zoijcleaow, ebVar.f56398zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56397ppxfxbqfkf, ebVar.f56397ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f56397ppxfxbqfkf.hashCode() + (this.f56398zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpValidationError(description=" + this.f56398zoijcleaow + ", phone=" + this.f56397ppxfxbqfkf + ")";
    }
}
