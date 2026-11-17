package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends jd {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f55886zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String phone) {
        super(phone);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f55886zoijcleaow = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55886zoijcleaow, ((b0) obj).f55886zoijcleaow);
    }

    public final int hashCode() {
        return this.f55886zoijcleaow.hashCode();
    }

    public final String toString() {
        return "ConfirmSuccess(phone=" + this.f55886zoijcleaow + ")";
    }
}
