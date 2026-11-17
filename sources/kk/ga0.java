package kk;

import spay.sdk.domain.model.request.ConfirmOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ga0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f56682iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56683ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f56684wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConfirmOtpRequestBody f56685zoijcleaow;

    public ga0(String authorization, ConfirmOtpRequestBody confirmOtpRequest, String mobilePhone, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmOtpRequest, "confirmOtpRequest");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        this.f56682iobyxmoadg = authorization;
        this.f56685zoijcleaow = confirmOtpRequest;
        this.f56683ppxfxbqfkf = mobilePhone;
        this.f56684wkgbmnqykc = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0Var = (ga0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56682iobyxmoadg, ga0Var.f56682iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56685zoijcleaow, ga0Var.f56685zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56683ppxfxbqfkf, ga0Var.f56683ppxfxbqfkf) && this.f56684wkgbmnqykc == ga0Var.f56684wkgbmnqykc;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56684wkgbmnqykc) + xg.iobyxmoadg(this.f56683ppxfxbqfkf, (this.f56685zoijcleaow.hashCode() + (this.f56682iobyxmoadg.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ConfirmOtpCodeUseCaseRequestParams(authorization=" + this.f56682iobyxmoadg + ", confirmOtpRequest=" + this.f56685zoijcleaow + ", mobilePhone=" + this.f56683ppxfxbqfkf + ", timerTime=" + this.f56684wkgbmnqykc + ")";
    }
}
