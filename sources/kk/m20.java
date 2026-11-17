package kk;

import spay.sdk.domain.model.request.SessionIdRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class m20 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57579iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SessionIdRequestBody f57580zoijcleaow;

    public m20(String authorization, SessionIdRequestBody sessionIdRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionIdRequestBody, "sessionIdRequestBody");
        this.f57579iobyxmoadg = authorization;
        this.f57580zoijcleaow = sessionIdRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57579iobyxmoadg, m20Var.f57579iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57580zoijcleaow, m20Var.f57580zoijcleaow);
    }

    public final int hashCode() {
        return this.f57580zoijcleaow.hashCode() + (this.f57579iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetSessionIdUseCaseRequestParams(authorization=" + this.f57579iobyxmoadg + ", sessionIdRequestBody=" + this.f57580zoijcleaow + ")";
    }
}
