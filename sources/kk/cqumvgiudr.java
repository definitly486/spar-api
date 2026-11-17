package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f56180iobyxmoadg;

    public cqumvgiudr(ErrorEntity errorResponse) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorResponse, "errorResponse");
        this.f56180iobyxmoadg = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56180iobyxmoadg, ((cqumvgiudr) obj).f56180iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56180iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleCreateOtpSdkError(errorResponse=" + this.f56180iobyxmoadg + ")";
    }
}
