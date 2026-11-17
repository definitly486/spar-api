package kk;

import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SessionIdResponseBody f58952iobyxmoadg;

    public v5(SessionIdResponseBody sessionIdResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionIdResponseBody, "sessionIdResponseBody");
        this.f58952iobyxmoadg = sessionIdResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58952iobyxmoadg, ((v5) obj).f58952iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58952iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleSessionIdData(sessionIdResponseBody=" + this.f58952iobyxmoadg + ")";
    }
}
