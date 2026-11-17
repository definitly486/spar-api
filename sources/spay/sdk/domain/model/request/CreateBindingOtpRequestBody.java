package spay.sdk.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lspay/sdk/domain/model/request/CreateBindingOtpRequestBody;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateBindingOtpRequestBody {
    private final String sessionId;

    public CreateBindingOtpRequestBody(String sessionId) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        this.sessionId = sessionId;
    }

    public static /* synthetic */ CreateBindingOtpRequestBody copy$default(CreateBindingOtpRequestBody createBindingOtpRequestBody, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createBindingOtpRequestBody.sessionId;
        }
        return createBindingOtpRequestBody.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final CreateBindingOtpRequestBody copy(String sessionId) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        return new CreateBindingOtpRequestBody(sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateBindingOtpRequestBody) && zdlpuopuiu.eablkybsjg(this.sessionId, ((CreateBindingOtpRequestBody) other).sessionId);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode();
    }

    public String toString() {
        return "CreateBindingOtpRequestBody(sessionId=" + this.sessionId + ")";
    }
}
