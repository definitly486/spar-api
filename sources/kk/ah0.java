package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class ah0 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f55821iobyxmoadg;

    public ah0(ErrorEntity errorResponse) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorResponse, "errorResponse");
        this.f55821iobyxmoadg = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55821iobyxmoadg, ((ah0) obj).f55821iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55821iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleConfirmOtpError(errorResponse=" + this.f55821iobyxmoadg + ")";
    }
}
