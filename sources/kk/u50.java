package kk;

import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class u50 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConfirmBindingOtpRequestBody f58777iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f58778ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f58779zoijcleaow;

    public u50(ConfirmBindingOtpRequestBody request, String mobilePhone, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        this.f58777iobyxmoadg = request;
        this.f58779zoijcleaow = mobilePhone;
        this.f58778ppxfxbqfkf = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58777iobyxmoadg, u50Var.f58777iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58779zoijcleaow, u50Var.f58779zoijcleaow) && this.f58778ppxfxbqfkf == u50Var.f58778ppxfxbqfkf;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58778ppxfxbqfkf) + xg.iobyxmoadg(this.f58779zoijcleaow, this.f58777iobyxmoadg.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfirmBindingOtpCodeUseCaseRequestParams(request=" + this.f58777iobyxmoadg + ", mobilePhone=" + this.f58779zoijcleaow + ", timerTime=" + this.f58778ppxfxbqfkf + ")";
    }
}
