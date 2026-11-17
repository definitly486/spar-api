package kk;

import spay.sdk.domain.model.request.PayOnlineRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r9 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58287iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PayOnlineRequestBody f58288zoijcleaow;

    public r9(String authorization, PayOnlineRequestBody payOnlineRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payOnlineRequestBody, "payOnlineRequestBody");
        this.f58287iobyxmoadg = authorization;
        this.f58288zoijcleaow = payOnlineRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58287iobyxmoadg, r9Var.f58287iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58288zoijcleaow, r9Var.f58288zoijcleaow);
    }

    public final int hashCode() {
        return this.f58288zoijcleaow.hashCode() + (this.f58287iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetPayOnlineUseCaseRequestParams(authorization=" + this.f58287iobyxmoadg + ", payOnlineRequestBody=" + this.f58288zoijcleaow + ")";
    }
}
