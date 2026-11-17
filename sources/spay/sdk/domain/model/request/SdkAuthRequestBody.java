package spay.sdk.domain.model.request;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001'Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, d2 = {"Lspay/sdk/domain/model/request/SdkAuthRequestBody;", "", "redirectUri", "", "authCode", "sessionId", "state", "deviceInfo", "orderId", "merchantLogin", "resourceName", "authMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getAuthMethod", "getDeviceInfo", "getMerchantLogin", "getOrderId", "getRedirectUri", "getResourceName", "getSessionId", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "AuthMethod", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SdkAuthRequestBody {
    private final String authCode;
    private final String authMethod;
    private final String deviceInfo;
    private final String merchantLogin;
    private final String orderId;
    private final String redirectUri;
    private final String resourceName;
    private final String sessionId;
    private final String state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lspay/sdk/domain/model/request/SdkAuthRequestBody$AuthMethod;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PHONE", "SBOL", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AuthMethod {
        PHONE("phone"),
        SBOL("sbol");

        private final String value;

        AuthMethod(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public SdkAuthRequestBody(String str, String str2, String sessionId, String str3, String deviceInfo, String orderId, String str4, String resourceName, String str5) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(resourceName, "resourceName");
        this.redirectUri = str;
        this.authCode = str2;
        this.sessionId = sessionId;
        this.state = str3;
        this.deviceInfo = deviceInfo;
        this.orderId = orderId;
        this.merchantLogin = str4;
        this.resourceName = resourceName;
        this.authMethod = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getResourceName() {
        return this.resourceName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAuthMethod() {
        return this.authMethod;
    }

    public final SdkAuthRequestBody copy(String redirectUri, String authCode, String sessionId, String state, String deviceInfo, String orderId, String merchantLogin, String resourceName, String authMethod) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(deviceInfo, "deviceInfo");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(resourceName, "resourceName");
        return new SdkAuthRequestBody(redirectUri, authCode, sessionId, state, deviceInfo, orderId, merchantLogin, resourceName, authMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAuthRequestBody)) {
            return false;
        }
        SdkAuthRequestBody sdkAuthRequestBody = (SdkAuthRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.redirectUri, sdkAuthRequestBody.redirectUri) && zdlpuopuiu.eablkybsjg(this.authCode, sdkAuthRequestBody.authCode) && zdlpuopuiu.eablkybsjg(this.sessionId, sdkAuthRequestBody.sessionId) && zdlpuopuiu.eablkybsjg(this.state, sdkAuthRequestBody.state) && zdlpuopuiu.eablkybsjg(this.deviceInfo, sdkAuthRequestBody.deviceInfo) && zdlpuopuiu.eablkybsjg(this.orderId, sdkAuthRequestBody.orderId) && zdlpuopuiu.eablkybsjg(this.merchantLogin, sdkAuthRequestBody.merchantLogin) && zdlpuopuiu.eablkybsjg(this.resourceName, sdkAuthRequestBody.resourceName) && zdlpuopuiu.eablkybsjg(this.authMethod, sdkAuthRequestBody.authMethod);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthMethod() {
        return this.authMethod;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
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

    public final String getResourceName() {
        return this.resourceName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.redirectUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authCode;
        int iIobyxmoadg = xg.iobyxmoadg(this.sessionId, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.state;
        int iIobyxmoadg2 = xg.iobyxmoadg(this.orderId, xg.iobyxmoadg(this.deviceInfo, (iIobyxmoadg + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.merchantLogin;
        int iIobyxmoadg3 = xg.iobyxmoadg(this.resourceName, (iIobyxmoadg2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.authMethod;
        return iIobyxmoadg3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SdkAuthRequestBody(redirectUri=" + this.redirectUri + ", authCode=" + this.authCode + ", sessionId=" + this.sessionId + ", state=" + this.state + ", deviceInfo=" + this.deviceInfo + ", orderId=" + this.orderId + ", merchantLogin=" + this.merchantLogin + ", resourceName=" + this.resourceName + ", authMethod=" + this.authMethod + ")";
    }

    public /* synthetic */ SdkAuthRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, str3, (i13 & 8) != 0 ? null : str4, str5, str6, (i13 & 64) != 0 ? null : str7, str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9);
    }
}
