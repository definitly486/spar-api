package spay.sdk.domain.model.request;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0088\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\bHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u00064"}, d2 = {"Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "", "userName", "", "sessionId", "merchantLogin", "deviceInfo", "paymentId", "", "priorityCardOnly", "", "orderId", "isBnplEnabled", "fraudMonInfo", "Lspay/sdk/domain/model/FraudMonInfo;", "paymentInBonuses", "sumBonuses", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;Ljava/lang/Boolean;Ljava/lang/Object;)V", "getDeviceInfo", "()Ljava/lang/String;", "getFraudMonInfo", "()Lspay/sdk/domain/model/FraudMonInfo;", "()Z", "getMerchantLogin", "getOrderId", "getPaymentId", "()I", "getPaymentInBonuses", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPriorityCardOnly", "getSessionId", "getSumBonuses", "()Ljava/lang/Object;", "getUserName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;ZLspay/sdk/domain/model/FraudMonInfo;Ljava/lang/Boolean;Ljava/lang/Object;)Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "equals", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PayOnlineRequestBody {
    private final String deviceInfo;
    private final FraudMonInfo fraudMonInfo;
    private final boolean isBnplEnabled;
    private final String merchantLogin;
    private final String orderId;
    private final int paymentId;
    private final Boolean paymentInBonuses;
    private final Boolean priorityCardOnly;
    private final String sessionId;
    private final Object sumBonuses;
    private final String userName;

    public PayOnlineRequestBody(String str, String sessionId, String str2, String deviceInfo, int i13, Boolean bool, String orderId, boolean z13, FraudMonInfo fraudMonInfo, Boolean bool2, Object obj) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.userName = str;
        this.sessionId = sessionId;
        this.merchantLogin = str2;
        this.deviceInfo = deviceInfo;
        this.paymentId = i13;
        this.priorityCardOnly = bool;
        this.orderId = orderId;
        this.isBnplEnabled = z13;
        this.fraudMonInfo = fraudMonInfo;
        this.paymentInBonuses = bool2;
        this.sumBonuses = obj;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getPaymentInBonuses() {
        return this.paymentInBonuses;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getSumBonuses() {
        return this.sumBonuses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FraudMonInfo getFraudMonInfo() {
        return this.fraudMonInfo;
    }

    public final PayOnlineRequestBody copy(String userName, String sessionId, String merchantLogin, String deviceInfo, int paymentId, Boolean priorityCardOnly, String orderId, boolean isBnplEnabled, FraudMonInfo fraudMonInfo, Boolean paymentInBonuses, Object sumBonuses) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new PayOnlineRequestBody(userName, sessionId, merchantLogin, deviceInfo, paymentId, priorityCardOnly, orderId, isBnplEnabled, fraudMonInfo, paymentInBonuses, sumBonuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayOnlineRequestBody)) {
            return false;
        }
        PayOnlineRequestBody payOnlineRequestBody = (PayOnlineRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.userName, payOnlineRequestBody.userName) && zdlpuopuiu.eablkybsjg(this.sessionId, payOnlineRequestBody.sessionId) && zdlpuopuiu.eablkybsjg(this.merchantLogin, payOnlineRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.deviceInfo, payOnlineRequestBody.deviceInfo) && this.paymentId == payOnlineRequestBody.paymentId && zdlpuopuiu.eablkybsjg(this.priorityCardOnly, payOnlineRequestBody.priorityCardOnly) && zdlpuopuiu.eablkybsjg(this.orderId, payOnlineRequestBody.orderId) && this.isBnplEnabled == payOnlineRequestBody.isBnplEnabled && zdlpuopuiu.eablkybsjg(this.fraudMonInfo, payOnlineRequestBody.fraudMonInfo) && zdlpuopuiu.eablkybsjg(this.paymentInBonuses, payOnlineRequestBody.paymentInBonuses) && zdlpuopuiu.eablkybsjg(this.sumBonuses, payOnlineRequestBody.sumBonuses);
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

    public final Boolean getPaymentInBonuses() {
        return this.paymentInBonuses;
    }

    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Object getSumBonuses() {
        return this.sumBonuses;
    }

    public final String getUserName() {
        return this.userName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    public int hashCode() {
        String str = this.userName;
        int iIobyxmoadg = xg.iobyxmoadg(this.sessionId, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.merchantLogin;
        int iHashCode = (Integer.hashCode(this.paymentId) + xg.iobyxmoadg(this.deviceInfo, (iIobyxmoadg + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        Boolean bool = this.priorityCardOnly;
        int iIobyxmoadg2 = xg.iobyxmoadg(this.orderId, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        boolean z13 = this.isBnplEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iIobyxmoadg2 + r13) * 31;
        FraudMonInfo fraudMonInfo = this.fraudMonInfo;
        int iHashCode2 = (i13 + (fraudMonInfo == null ? 0 : fraudMonInfo.hashCode())) * 31;
        Boolean bool2 = this.paymentInBonuses;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Object obj = this.sumBonuses;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    public String toString() {
        return "PayOnlineRequestBody(userName=" + this.userName + ", sessionId=" + this.sessionId + ", merchantLogin=" + this.merchantLogin + ", deviceInfo=" + this.deviceInfo + ", paymentId=" + this.paymentId + ", priorityCardOnly=" + this.priorityCardOnly + ", orderId=" + this.orderId + ", isBnplEnabled=" + this.isBnplEnabled + ", fraudMonInfo=" + this.fraudMonInfo + ", paymentInBonuses=" + this.paymentInBonuses + ", sumBonuses=" + this.sumBonuses + ")";
    }

    public /* synthetic */ PayOnlineRequestBody(String str, String str2, String str3, String str4, int i13, Boolean bool, String str5, boolean z13, FraudMonInfo fraudMonInfo, Boolean bool2, Object obj, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? null : str, str2, (i14 & 4) != 0 ? null : str3, str4, i13, (i14 & 32) != 0 ? null : bool, str5, z13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : fraudMonInfo, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool2, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : obj);
    }
}
