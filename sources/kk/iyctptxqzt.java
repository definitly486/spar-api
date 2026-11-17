package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class iyctptxqzt extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f57113ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f57114zoijcleaow;

    public iyctptxqzt(vu description, String phone) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f57114zoijcleaow = description;
        this.f57113ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyctptxqzt)) {
            return false;
        }
        iyctptxqzt iyctptxqztVar = (iyctptxqzt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57114zoijcleaow, iyctptxqztVar.f57114zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57113ppxfxbqfkf, iyctptxqztVar.f57113ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f57113ppxfxbqfkf.hashCode() + (this.f57114zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmAttemptsExhausted(description=" + this.f57114zoijcleaow + ", phone=" + this.f57113ppxfxbqfkf + ")";
    }
}
