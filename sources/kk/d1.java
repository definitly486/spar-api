package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends jd {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56206zoijcleaow;

    public d1(vu description) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        this.f56206zoijcleaow = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56206zoijcleaow, ((d1) obj).f56206zoijcleaow);
    }

    public final int hashCode() {
        return this.f56206zoijcleaow.hashCode();
    }

    public final String toString() {
        return "ConfirmSystemOrInternalError(description=" + this.f56206zoijcleaow + ")";
    }
}
