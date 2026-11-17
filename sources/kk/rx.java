package kk;

import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class rx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58480iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SdkAuthRequestBody f58481zoijcleaow;

    public rx(String authorization, SdkAuthRequestBody sdkAuthRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkAuthRequestBody, "sdkAuthRequestBody");
        this.f58480iobyxmoadg = authorization;
        this.f58481zoijcleaow = sdkAuthRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58480iobyxmoadg, rxVar.f58480iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58481zoijcleaow, rxVar.f58481zoijcleaow);
    }

    public final int hashCode() {
        return this.f58481zoijcleaow.hashCode() + (this.f58480iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetSdkAuthUseCaseRequestParams(authorization=" + this.f58480iobyxmoadg + ", sdkAuthRequestBody=" + this.f58481zoijcleaow + ")";
    }
}
