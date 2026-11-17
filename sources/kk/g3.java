package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56624ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56625zoijcleaow;

    public g3(vu description, String phone) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f56625zoijcleaow = description;
        this.f56624ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56625zoijcleaow, g3Var.f56625zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56624ppxfxbqfkf, g3Var.f56624ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f56624ppxfxbqfkf.hashCode() + (this.f56625zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmWrongCode(description=" + this.f56625zoijcleaow + ", phone=" + this.f56624ppxfxbqfkf + ")";
    }
}
