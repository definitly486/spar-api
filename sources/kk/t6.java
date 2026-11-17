package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f58622iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final j6 f58623zoijcleaow;

    public t6(ErrorEntity sPayApiError, j6 j6Var) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f58622iobyxmoadg = sPayApiError;
        this.f58623zoijcleaow = j6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58622iobyxmoadg, t6Var.f58622iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58623zoijcleaow, t6Var.f58623zoijcleaow);
    }

    public final int hashCode() {
        return this.f58623zoijcleaow.hashCode() + (this.f58622iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "ShowPayBonusesError(sPayApiError=" + this.f58622iobyxmoadg + ", caller=" + this.f58623zoijcleaow + ")";
    }
}
