package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class o4 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f57887iobyxmoadg;

    public o4(ErrorEntity errorResponse) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorResponse, "errorResponse");
        this.f57887iobyxmoadg = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57887iobyxmoadg, ((o4) obj).f57887iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57887iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowCreateOtpSdkResultError(errorResponse=" + this.f57887iobyxmoadg + ")";
    }
}
