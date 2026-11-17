package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class t7 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f58625ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f58626zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(String phone, String str) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f58626zoijcleaow = phone;
        this.f58625ppxfxbqfkf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58626zoijcleaow, t7Var.f58626zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58625ppxfxbqfkf, t7Var.f58625ppxfxbqfkf);
    }

    public final int hashCode() {
        int iHashCode = this.f58626zoijcleaow.hashCode() * 31;
        String str = this.f58625ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreateOtpSuccess(phone=" + this.f58626zoijcleaow + ", cardNumber=" + this.f58625ppxfxbqfkf + ")";
    }
}
