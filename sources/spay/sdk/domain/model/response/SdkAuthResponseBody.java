package spay.sdk.domain.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.data.dto.response.UserInfoDto;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000bJF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\b\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/response/SdkAuthResponseBody;", "", "sessionId", "", "userInfo", "Lspay/sdk/data/dto/response/UserInfoDto;", "merchantName", "logoUrl", "isOtpNeed", "", "(Ljava/lang/String;Lspay/sdk/data/dto/response/UserInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLogoUrl", "()Ljava/lang/String;", "getMerchantName", "getSessionId", "getUserInfo", "()Lspay/sdk/data/dto/response/UserInfoDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lspay/sdk/data/dto/response/UserInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lspay/sdk/domain/model/response/SdkAuthResponseBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SdkAuthResponseBody {
    private final Boolean isOtpNeed;
    private final String logoUrl;
    private final String merchantName;
    private final String sessionId;
    private final UserInfoDto userInfo;

    public SdkAuthResponseBody(String sessionId, UserInfoDto userInfo, String str, String str2, Boolean bool) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(userInfo, "userInfo");
        this.sessionId = sessionId;
        this.userInfo = userInfo;
        this.merchantName = str;
        this.logoUrl = str2;
        this.isOtpNeed = bool;
    }

    public static /* synthetic */ SdkAuthResponseBody copy$default(SdkAuthResponseBody sdkAuthResponseBody, String str, UserInfoDto userInfoDto, String str2, String str3, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sdkAuthResponseBody.sessionId;
        }
        if ((i13 & 2) != 0) {
            userInfoDto = sdkAuthResponseBody.userInfo;
        }
        UserInfoDto userInfoDto2 = userInfoDto;
        if ((i13 & 4) != 0) {
            str2 = sdkAuthResponseBody.merchantName;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            str3 = sdkAuthResponseBody.logoUrl;
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            bool = sdkAuthResponseBody.isOtpNeed;
        }
        return sdkAuthResponseBody.copy(str, userInfoDto2, str4, str5, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfoDto getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsOtpNeed() {
        return this.isOtpNeed;
    }

    public final SdkAuthResponseBody copy(String sessionId, UserInfoDto userInfo, String merchantName, String logoUrl, Boolean isOtpNeed) {
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(userInfo, "userInfo");
        return new SdkAuthResponseBody(sessionId, userInfo, merchantName, logoUrl, isOtpNeed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAuthResponseBody)) {
            return false;
        }
        SdkAuthResponseBody sdkAuthResponseBody = (SdkAuthResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, sdkAuthResponseBody.sessionId) && zdlpuopuiu.eablkybsjg(this.userInfo, sdkAuthResponseBody.userInfo) && zdlpuopuiu.eablkybsjg(this.merchantName, sdkAuthResponseBody.merchantName) && zdlpuopuiu.eablkybsjg(this.logoUrl, sdkAuthResponseBody.logoUrl) && zdlpuopuiu.eablkybsjg(this.isOtpNeed, sdkAuthResponseBody.isOtpNeed);
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final UserInfoDto getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = (this.userInfo.hashCode() + (this.sessionId.hashCode() * 31)) * 31;
        String str = this.merchantName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOtpNeed;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isOtpNeed() {
        return this.isOtpNeed;
    }

    public String toString() {
        return "SdkAuthResponseBody(sessionId=" + this.sessionId + ", userInfo=" + this.userInfo + ", merchantName=" + this.merchantName + ", logoUrl=" + this.logoUrl + ", isOtpNeed=" + this.isOtpNeed + ")";
    }
}
