package spay.sdk.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/request/StatusReportRequestBody;", "", "sessionId", "", "status", "", "(Ljava/lang/String;I)V", "getSessionId", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StatusReportRequestBody {
    private final String sessionId;
    private final int status;

    public StatusReportRequestBody(String sessionId, int i13) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.status = i13;
    }

    public static /* synthetic */ StatusReportRequestBody copy$default(StatusReportRequestBody statusReportRequestBody, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = statusReportRequestBody.sessionId;
        }
        if ((i14 & 2) != 0) {
            i13 = statusReportRequestBody.status;
        }
        return statusReportRequestBody.copy(str, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final StatusReportRequestBody copy(String sessionId, int status) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        return new StatusReportRequestBody(sessionId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusReportRequestBody)) {
            return false;
        }
        StatusReportRequestBody statusReportRequestBody = (StatusReportRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, statusReportRequestBody.sessionId) && this.status == statusReportRequestBody.status;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "StatusReportRequestBody(sessionId=" + this.sessionId + ", status=" + this.status + ")";
    }
}
