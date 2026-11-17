package spay.sdk.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/domain/model/request/BindingSessionIdRequestBody;", "", "orderId", "", "bindingId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getOrderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BindingSessionIdRequestBody {
    private final String bindingId;
    private final String orderId;

    public BindingSessionIdRequestBody(String orderId, String bindingId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        this.orderId = orderId;
        this.bindingId = bindingId;
    }

    public static /* synthetic */ BindingSessionIdRequestBody copy$default(BindingSessionIdRequestBody bindingSessionIdRequestBody, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bindingSessionIdRequestBody.orderId;
        }
        if ((i13 & 2) != 0) {
            str2 = bindingSessionIdRequestBody.bindingId;
        }
        return bindingSessionIdRequestBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    public final BindingSessionIdRequestBody copy(String orderId, String bindingId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        return new BindingSessionIdRequestBody(orderId, bindingId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingSessionIdRequestBody)) {
            return false;
        }
        BindingSessionIdRequestBody bindingSessionIdRequestBody = (BindingSessionIdRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.orderId, bindingSessionIdRequestBody.orderId) && zdlpuopuiu.eablkybsjg(this.bindingId, bindingSessionIdRequestBody.bindingId);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        return this.bindingId.hashCode() + (this.orderId.hashCode() * 31);
    }

    public String toString() {
        return "BindingSessionIdRequestBody(orderId=" + this.orderId + ", bindingId=" + this.bindingId + ")";
    }
}
