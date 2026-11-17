package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class qe0 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f58184iobyxmoadg;

    public qe0(ErrorEntity errorResponse) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorResponse, "errorResponse");
        this.f58184iobyxmoadg = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58184iobyxmoadg, ((qe0) obj).f58184iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58184iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleBindingOtpError(errorResponse=" + this.f58184iobyxmoadg + ")";
    }
}
