package kk;

import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class n9 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57746iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CreateOtpSdkRequestBody f57747zoijcleaow;

    public n9(String authorization, CreateOtpSdkRequestBody createOtpSdkRequest) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createOtpSdkRequest, "createOtpSdkRequest");
        this.f57746iobyxmoadg = authorization;
        this.f57747zoijcleaow = createOtpSdkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57746iobyxmoadg, n9Var.f57746iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57747zoijcleaow, n9Var.f57747zoijcleaow);
    }

    public final int hashCode() {
        return Long.hashCode(45000L) + ((this.f57747zoijcleaow.hashCode() + (this.f57746iobyxmoadg.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreateOtpSdkUseCaseParams(authorization=" + this.f57746iobyxmoadg + ", createOtpSdkRequest=" + this.f57747zoijcleaow + ", timerTime=45000)";
    }
}
