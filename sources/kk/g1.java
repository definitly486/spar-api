package kk;

import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SdkAuthResponseBody f56607iobyxmoadg;

    public g1(SdkAuthResponseBody sdkAuthResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkAuthResponseBody, "sdkAuthResponseBody");
        this.f56607iobyxmoadg = sdkAuthResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56607iobyxmoadg, ((g1) obj).f56607iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56607iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "SdkAuthResult(sdkAuthResponseBody=" + this.f56607iobyxmoadg + ")";
    }
}
