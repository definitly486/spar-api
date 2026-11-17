package modern.payments.ecomAndroid.domain.model.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.EcomBindingInfo;
import modern.payments.ecomAndroid.domain.model.OrderInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "", "ecomPublicKey", "", "sessionId", "orderInfo", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo;", "bindings", "", "Lmodern/payments/ecomAndroid/domain/model/EcomBindingInfo;", "sbpPayload", "(Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/domain/model/OrderInfo;Ljava/util/List;Ljava/lang/String;)V", "getBindings", "()Ljava/util/List;", "getEcomPublicKey", "()Ljava/lang/String;", "getOrderInfo", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo;", "getSbpPayload", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionIdResponseBody {
    private final List<EcomBindingInfo> bindings;
    private final String ecomPublicKey;
    private final OrderInfo orderInfo;
    private final String sbpPayload;
    private final String sessionId;

    public SessionIdResponseBody(String ecomPublicKey, String sessionId, OrderInfo orderInfo, List<EcomBindingInfo> list, String str) {
        zdlpuopuiu.btonecajqb(ecomPublicKey, "ecomPublicKey");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        this.ecomPublicKey = ecomPublicKey;
        this.sessionId = sessionId;
        this.orderInfo = orderInfo;
        this.bindings = list;
        this.sbpPayload = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionIdResponseBody copy$default(SessionIdResponseBody sessionIdResponseBody, String str, String str2, OrderInfo orderInfo, List list, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sessionIdResponseBody.ecomPublicKey;
        }
        if ((i13 & 2) != 0) {
            str2 = sessionIdResponseBody.sessionId;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            orderInfo = sessionIdResponseBody.orderInfo;
        }
        OrderInfo orderInfo2 = orderInfo;
        if ((i13 & 8) != 0) {
            list = sessionIdResponseBody.bindings;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            str3 = sessionIdResponseBody.sbpPayload;
        }
        return sessionIdResponseBody.copy(str, str4, orderInfo2, list2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEcomPublicKey() {
        return this.ecomPublicKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public final List<EcomBindingInfo> component4() {
        return this.bindings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSbpPayload() {
        return this.sbpPayload;
    }

    public final SessionIdResponseBody copy(String ecomPublicKey, String sessionId, OrderInfo orderInfo, List<EcomBindingInfo> bindings, String sbpPayload) {
        zdlpuopuiu.btonecajqb(ecomPublicKey, "ecomPublicKey");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        return new SessionIdResponseBody(ecomPublicKey, sessionId, orderInfo, bindings, sbpPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdResponseBody)) {
            return false;
        }
        SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.ecomPublicKey, sessionIdResponseBody.ecomPublicKey) && zdlpuopuiu.eablkybsjg(this.sessionId, sessionIdResponseBody.sessionId) && zdlpuopuiu.eablkybsjg(this.orderInfo, sessionIdResponseBody.orderInfo) && zdlpuopuiu.eablkybsjg(this.bindings, sessionIdResponseBody.bindings) && zdlpuopuiu.eablkybsjg(this.sbpPayload, sessionIdResponseBody.sbpPayload);
    }

    public final List<EcomBindingInfo> getBindings() {
        return this.bindings;
    }

    public final String getEcomPublicKey() {
        return this.ecomPublicKey;
    }

    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public final String getSbpPayload() {
        return this.sbpPayload;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = ((this.ecomPublicKey.hashCode() * 31) + this.sessionId.hashCode()) * 31;
        OrderInfo orderInfo = this.orderInfo;
        int iHashCode2 = (iHashCode + (orderInfo == null ? 0 : orderInfo.hashCode())) * 31;
        List<EcomBindingInfo> list = this.bindings;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.sbpPayload;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SessionIdResponseBody(ecomPublicKey=" + this.ecomPublicKey + ", sessionId=" + this.sessionId + ", orderInfo=" + this.orderInfo + ", bindings=" + this.bindings + ", sbpPayload=" + this.sbpPayload + ')';
    }

    public /* synthetic */ SessionIdResponseBody(String str, String str2, OrderInfo orderInfo, List list, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : orderInfo, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : str3);
    }
}
