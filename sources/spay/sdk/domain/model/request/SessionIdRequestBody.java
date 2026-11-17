package spay.sdk.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lspay/sdk/domain/model/request/SessionIdRequestBody;", "", "redirectUri", "", "merchantLogin", "orderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantLogin", "()Ljava/lang/String;", "getOrderId", "getRedirectUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SessionIdRequestBody {
    private final String merchantLogin;
    private final String orderId;
    private final String redirectUri;

    public SessionIdRequestBody(String redirectUri, String str, String orderId) {
        zdlpuopuiu.btonecajqb(redirectUri, "redirectUri");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.redirectUri = redirectUri;
        this.merchantLogin = str;
        this.orderId = orderId;
    }

    public static /* synthetic */ SessionIdRequestBody copy$default(SessionIdRequestBody sessionIdRequestBody, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sessionIdRequestBody.redirectUri;
        }
        if ((i13 & 2) != 0) {
            str2 = sessionIdRequestBody.merchantLogin;
        }
        if ((i13 & 4) != 0) {
            str3 = sessionIdRequestBody.orderId;
        }
        return sessionIdRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final SessionIdRequestBody copy(String redirectUri, String merchantLogin, String orderId) {
        zdlpuopuiu.btonecajqb(redirectUri, "redirectUri");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new SessionIdRequestBody(redirectUri, merchantLogin, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdRequestBody)) {
            return false;
        }
        SessionIdRequestBody sessionIdRequestBody = (SessionIdRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.redirectUri, sessionIdRequestBody.redirectUri) && zdlpuopuiu.eablkybsjg(this.merchantLogin, sessionIdRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.orderId, sessionIdRequestBody.orderId);
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public int hashCode() {
        int iHashCode = this.redirectUri.hashCode() * 31;
        String str = this.merchantLogin;
        return this.orderId.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "SessionIdRequestBody(redirectUri=" + this.redirectUri + ", merchantLogin=" + this.merchantLogin + ", orderId=" + this.orderId + ")";
    }

    public /* synthetic */ SessionIdRequestBody(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, str3);
    }
}
