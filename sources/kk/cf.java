package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class cf extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f56149iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ErrorEntity f56150zoijcleaow;

    public cf(String subtitle, ErrorEntity error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        this.f56149iobyxmoadg = subtitle;
        this.f56150zoijcleaow = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56149iobyxmoadg, cfVar.f56149iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56150zoijcleaow, cfVar.f56150zoijcleaow);
    }

    public final int hashCode() {
        return this.f56150zoijcleaow.hashCode() + (this.f56149iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "PayBindingError(subtitle=" + this.f56149iobyxmoadg + ", error=" + this.f56150zoijcleaow + ")";
    }
}
