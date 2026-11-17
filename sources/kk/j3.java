package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f57135iobyxmoadg;

    public j3(ErrorEntity sPayApiError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f57135iobyxmoadg = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57135iobyxmoadg, ((j3) obj).f57135iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57135iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowConfirmOtpCodeResultError(sPayApiError=" + this.f57135iobyxmoadg + ")";
    }
}
