package spay.sdk.domain.model.request;

import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lspay/sdk/domain/model/request/PaymentTokenRequestBody;", "", "sessionId", "", "deviceInfo", "paymentId", "", "merchantLogin", "orderId", "isBnplEnabled", "", "fraudMonInfo", "Lspay/sdk/domain/model/FraudMonInfo;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;)V", "getDeviceInfo", "()Ljava/lang/String;", "getFraudMonInfo", "()Lspay/sdk/domain/model/FraudMonInfo;", "()Z", "getMerchantLogin", "getOrderId", "getPaymentId", "()I", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentTokenRequestBody {
    private final String deviceInfo;
    private final FraudMonInfo fraudMonInfo;
    private final boolean isBnplEnabled;
    private final String merchantLogin;
    private final String orderId;
    private final int paymentId;
    private final String sessionId;

    public PaymentTokenRequestBody(String sessionId, String deviceInfo, int i13, String str, String orderId, boolean z13, FraudMonInfo fraudMonInfo) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.sessionId = sessionId;
        this.deviceInfo = deviceInfo;
        this.paymentId = i13;
        this.merchantLogin = str;
        this.orderId = orderId;
        this.isBnplEnabled = z13;
        this.fraudMonInfo = fraudMonInfo;
    }

    public static /* synthetic */ PaymentTokenRequestBody copy$default(PaymentTokenRequestBody paymentTokenRequestBody, String str, String str2, int i13, String str3, String str4, boolean z13, FraudMonInfo fraudMonInfo, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = paymentTokenRequestBody.sessionId;
        }
        if ((i14 & 2) != 0) {
            str2 = paymentTokenRequestBody.deviceInfo;
        }
        String str5 = str2;
        if ((i14 & 4) != 0) {
            i13 = paymentTokenRequestBody.paymentId;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            str3 = paymentTokenRequestBody.merchantLogin;
        }
        String str6 = str3;
        if ((i14 & 16) != 0) {
            str4 = paymentTokenRequestBody.orderId;
        }
        String str7 = str4;
        if ((i14 & 32) != 0) {
            z13 = paymentTokenRequestBody.isBnplEnabled;
        }
        boolean z14 = z13;
        if ((i14 & 64) != 0) {
            fraudMonInfo = paymentTokenRequestBody.fraudMonInfo;
        }
        return paymentTokenRequestBody.copy(str, str5, i15, str6, str7, z14, fraudMonInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    public final PaymentTokenRequestBody copy(String sessionId, String deviceInfo, int paymentId, String merchantLogin, String orderId, boolean isBnplEnabled, FraudMonInfo fraudMonInfo) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new PaymentTokenRequestBody(sessionId, deviceInfo, paymentId, merchantLogin, orderId, isBnplEnabled, fraudMonInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentTokenRequestBody)) {
            return false;
        }
        PaymentTokenRequestBody paymentTokenRequestBody = (PaymentTokenRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, paymentTokenRequestBody.sessionId) && zdlpuopuiu.eablkybsjg(this.deviceInfo, paymentTokenRequestBody.deviceInfo) && this.paymentId == paymentTokenRequestBody.paymentId && zdlpuopuiu.eablkybsjg(this.merchantLogin, paymentTokenRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.orderId, paymentTokenRequestBody.orderId) && this.isBnplEnabled == paymentTokenRequestBody.isBnplEnabled && zdlpuopuiu.eablkybsjg(this.fraudMonInfo, paymentTokenRequestBody.fraudMonInfo);
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPaymentId() {
        return this.paymentId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.paymentId) + xg.iobyxmoadg(this.deviceInfo, this.sessionId.hashCode() * 31, 31)) * 31;
        String str = this.merchantLogin;
        int iIobyxmoadg = xg.iobyxmoadg(this.orderId, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z13 = this.isBnplEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iIobyxmoadg + r13) * 31;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        return i13 + (fraudMonInfo != null ? fraudMonInfo.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    public String toString() {
        return "PaymentTokenRequestBody(sessionId=" + this.sessionId + ", deviceInfo=" + this.deviceInfo + ", paymentId=" + this.paymentId + ", merchantLogin=" + this.merchantLogin + ", orderId=" + this.orderId + ", isBnplEnabled=" + this.isBnplEnabled + ", fraudMonInfo=" + this.fraudMonInfo + ")";
    }

    public /* synthetic */ PaymentTokenRequestBody(String str, String str2, int i13, String str3, String str4, boolean z13, FraudMonInfo fraudMonInfo, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, (i14 & 8) != 0 ? null : str3, str4, (i14 & 32) != 0 ? false : z13, (i14 & 64) != 0 ? null : fraudMonInfo);
    }
}
