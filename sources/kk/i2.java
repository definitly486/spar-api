package kk;

import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SessionIdResponseBody f56980iobyxmoadg;

    public i2(SessionIdResponseBody sessionIdResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionIdResponseBody, "sessionIdResponseBody");
        this.f56980iobyxmoadg = sessionIdResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56980iobyxmoadg, ((i2) obj).f56980iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56980iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "SessionIdResult(sessionIdResponseBody=" + this.f56980iobyxmoadg + ")";
    }
}
