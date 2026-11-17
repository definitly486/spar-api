package kk;

import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final CreateBindingOtpRequestBody f56094iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f56095zoijcleaow;

    public c5(CreateBindingOtpRequestBody request, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        this.f56094iobyxmoadg = request;
        this.f56095zoijcleaow = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56094iobyxmoadg, c5Var.f56094iobyxmoadg) && this.f56095zoijcleaow == c5Var.f56095zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (Long.hashCode(45000L) + (this.f56094iobyxmoadg.hashCode() * 31)) * 31;
        boolean z13 = this.f56095zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode + r13;
    }

    public final String toString() {
        return "CreateBindingOtpUseCaseParams(request=" + this.f56094iobyxmoadg + ", timerTime=45000, fromOtpView=" + this.f56095zoijcleaow + ")";
    }
}
