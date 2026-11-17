package modern.payments.ecomAndroid.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "", "bindingId", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeactivateBindingRequestBody {
    private final String bindingId;
    private final String sessionId;

    public DeactivateBindingRequestBody(String bindingId, String sessionId) {
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        this.bindingId = bindingId;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ DeactivateBindingRequestBody copy$default(DeactivateBindingRequestBody deactivateBindingRequestBody, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = deactivateBindingRequestBody.bindingId;
        }
        if ((i13 & 2) != 0) {
            str2 = deactivateBindingRequestBody.sessionId;
        }
        return deactivateBindingRequestBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final DeactivateBindingRequestBody copy(String bindingId, String sessionId) {
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        return new DeactivateBindingRequestBody(bindingId, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeactivateBindingRequestBody)) {
            return false;
        }
        DeactivateBindingRequestBody deactivateBindingRequestBody = (DeactivateBindingRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.bindingId, deactivateBindingRequestBody.bindingId) && zdlpuopuiu.eablkybsjg(this.sessionId, deactivateBindingRequestBody.sessionId);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.bindingId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "DeactivateBindingRequestBody(bindingId=" + this.bindingId + ", sessionId=" + this.sessionId + ')';
    }
}
