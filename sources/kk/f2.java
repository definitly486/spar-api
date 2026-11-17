package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends jd {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56485zoijcleaow;

    public f2(vu description) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        this.f56485zoijcleaow = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56485zoijcleaow, ((f2) obj).f56485zoijcleaow);
    }

    public final int hashCode() {
        return this.f56485zoijcleaow.hashCode();
    }

    public final String toString() {
        return "ConfirmValidationError(description=" + this.f56485zoijcleaow + ")";
    }
}
