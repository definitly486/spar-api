package modern.payments.ecomAndroid.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "", "sessionId", "", "merchantLogin", "orderId", "bindingId", "encryptedCardData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getEncryptedCardData", "getMerchantLogin", "getOrderId", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FraudMonInfo", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentTokenRequestBody {
    private final String bindingId;
    private final String encryptedCardData;
    private final String merchantLogin;
    private final String orderId;
    private final String sessionId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody$FraudMonInfo;", "", "resolution", "", "(Ljava/lang/String;)V", "getResolution", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FraudMonInfo {
        public static final String CONFIRMED_FRAUD = "CONFIRMED_FRAUD";
        public static final String CONFIRMED_GENUINE = "CONFIRMED_GENUINE";
        public static final String UNKNOWN = "UNKNOWN";
        private final String resolution;

        public FraudMonInfo(String resolution) {
            zdlpuopuiu.btonecajqb(resolution, "resolution");
            this.resolution = resolution;
        }

        public static /* synthetic */ FraudMonInfo copy$default(FraudMonInfo fraudMonInfo, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = fraudMonInfo.resolution;
            }
            return fraudMonInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResolution() {
            return this.resolution;
        }

        public final FraudMonInfo copy(String resolution) {
            zdlpuopuiu.btonecajqb(resolution, "resolution");
            return new FraudMonInfo(resolution);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FraudMonInfo) && zdlpuopuiu.eablkybsjg(this.resolution, ((FraudMonInfo) other).resolution);
        }

        public final String getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return this.resolution.hashCode();
        }

        public String toString() {
            return "FraudMonInfo(resolution=" + this.resolution + ')';
        }
    }

    public PaymentTokenRequestBody(String sessionId, String str, String orderId, String str2, String str3) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.sessionId = sessionId;
        this.merchantLogin = str;
        this.orderId = orderId;
        this.bindingId = str2;
        this.encryptedCardData = str3;
    }

    public static /* synthetic */ PaymentTokenRequestBody copy$default(PaymentTokenRequestBody paymentTokenRequestBody, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentTokenRequestBody.sessionId;
        }
        if ((i13 & 2) != 0) {
            str2 = paymentTokenRequestBody.merchantLogin;
        }
        String str6 = str2;
        if ((i13 & 4) != 0) {
            str3 = paymentTokenRequestBody.orderId;
        }
        String str7 = str3;
        if ((i13 & 8) != 0) {
            str4 = paymentTokenRequestBody.bindingId;
        }
        String str8 = str4;
        if ((i13 & 16) != 0) {
            str5 = paymentTokenRequestBody.encryptedCardData;
        }
        return paymentTokenRequestBody.copy(str, str6, str7, str8, str5);
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
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEncryptedCardData() {
        return this.encryptedCardData;
    }

    public final PaymentTokenRequestBody copy(String sessionId, String merchantLogin, String orderId, String bindingId, String encryptedCardData) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new PaymentTokenRequestBody(sessionId, merchantLogin, orderId, bindingId, encryptedCardData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentTokenRequestBody)) {
            return false;
        }
        PaymentTokenRequestBody paymentTokenRequestBody = (PaymentTokenRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, paymentTokenRequestBody.sessionId) && zdlpuopuiu.eablkybsjg(this.merchantLogin, paymentTokenRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.orderId, paymentTokenRequestBody.orderId) && zdlpuopuiu.eablkybsjg(this.bindingId, paymentTokenRequestBody.bindingId) && zdlpuopuiu.eablkybsjg(this.encryptedCardData, paymentTokenRequestBody.encryptedCardData);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getEncryptedCardData() {
        return this.encryptedCardData;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = this.sessionId.hashCode() * 31;
        String str = this.merchantLogin;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.orderId.hashCode()) * 31;
        String str2 = this.bindingId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedCardData;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PaymentTokenRequestBody(sessionId=" + this.sessionId + ", merchantLogin=" + this.merchantLogin + ", orderId=" + this.orderId + ", bindingId=" + this.bindingId + ", encryptedCardData=" + this.encryptedCardData + ')';
    }

    public /* synthetic */ PaymentTokenRequestBody(String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
