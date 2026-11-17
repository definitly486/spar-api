package spay.sdk.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "", "sessionId", "", "merchantLogin", "priorityCardOnly", "", "orderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getMerchantLogin", "()Ljava/lang/String;", "getOrderId", "getPriorityCardOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSessionId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ListOfCardsRequestBody {
    private final String merchantLogin;
    private final String orderId;
    private final Boolean priorityCardOnly;
    private final String sessionId;

    public ListOfCardsRequestBody(String sessionId, String str, Boolean bool, String orderId) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.sessionId = sessionId;
        this.merchantLogin = str;
        this.priorityCardOnly = bool;
        this.orderId = orderId;
    }

    public static /* synthetic */ ListOfCardsRequestBody copy$default(ListOfCardsRequestBody listOfCardsRequestBody, String str, String str2, Boolean bool, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = listOfCardsRequestBody.sessionId;
        }
        if ((i13 & 2) != 0) {
            str2 = listOfCardsRequestBody.merchantLogin;
        }
        if ((i13 & 4) != 0) {
            bool = listOfCardsRequestBody.priorityCardOnly;
        }
        if ((i13 & 8) != 0) {
            str3 = listOfCardsRequestBody.orderId;
        }
        return listOfCardsRequestBody.copy(str, str2, bool, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final ListOfCardsRequestBody copy(String sessionId, String merchantLogin, Boolean priorityCardOnly, String orderId) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new ListOfCardsRequestBody(sessionId, merchantLogin, priorityCardOnly, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfCardsRequestBody)) {
            return false;
        }
        ListOfCardsRequestBody listOfCardsRequestBody = (ListOfCardsRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, listOfCardsRequestBody.sessionId) && zdlpuopuiu.eablkybsjg(this.merchantLogin, listOfCardsRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.priorityCardOnly, listOfCardsRequestBody.priorityCardOnly) && zdlpuopuiu.eablkybsjg(this.orderId, listOfCardsRequestBody.orderId);
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = this.sessionId.hashCode() * 31;
        String str = this.merchantLogin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.priorityCardOnly;
        return this.orderId.hashCode() + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ListOfCardsRequestBody(sessionId=" + this.sessionId + ", merchantLogin=" + this.merchantLogin + ", priorityCardOnly=" + this.priorityCardOnly + ", orderId=" + this.orderId + ")";
    }

    public /* synthetic */ ListOfCardsRequestBody(String str, String str2, Boolean bool, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : bool, str3);
    }
}
