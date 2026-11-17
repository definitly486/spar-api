package kk;

import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SdkAuthResponseBody f58613iobyxmoadg;

    public t4(SdkAuthResponseBody sdkAuthResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkAuthResponseBody, "sdkAuthResponseBody");
        this.f58613iobyxmoadg = sdkAuthResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58613iobyxmoadg, ((t4) obj).f58613iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58613iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleSdkAuthData(sdkAuthResponseBody=" + this.f58613iobyxmoadg + ")";
    }
}
