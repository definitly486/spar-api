package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.domain.model.response.SdkAuthResponseBody;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0002H\u0016J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\t\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lspay/sdk/data/dto/response/SdkAuthResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SdkAuthResponseBody;", "sessionId", "", "userInfo", "Lspay/sdk/data/dto/response/UserInfoDto;", "merchantName", "logoUrl", "isOtpNeed", "", "(Ljava/lang/String;Lspay/sdk/data/dto/response/UserInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLogoUrl", "()Ljava/lang/String;", "getMerchantName", "getSessionId", "getUserInfo", "()Lspay/sdk/data/dto/response/UserInfoDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lspay/sdk/data/dto/response/UserInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lspay/sdk/data/dto/response/SdkAuthResponseBodyDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SdkAuthResponseBodyDto implements DataDtoInterface<SdkAuthResponseBody> {

    @ppxfxbqfkf("isOtpNeed")
    private final Boolean isOtpNeed;

    @ppxfxbqfkf("logoUrl")
    private final String logoUrl;

    @ppxfxbqfkf("merchantName")
    private final String merchantName;

    @ppxfxbqfkf("sessionId")
    private final String sessionId;

    @ppxfxbqfkf("userInfo")
    private final UserInfoDto userInfo;

    public SdkAuthResponseBodyDto(String str, UserInfoDto userInfoDto, String str2, String str3, Boolean bool) {
        this.sessionId = str;
        this.userInfo = userInfoDto;
        this.merchantName = str2;
        this.logoUrl = str3;
        this.isOtpNeed = bool;
    }

    public static /* synthetic */ SdkAuthResponseBodyDto copy$default(SdkAuthResponseBodyDto sdkAuthResponseBodyDto, String str, UserInfoDto userInfoDto, String str2, String str3, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sdkAuthResponseBodyDto.sessionId;
        }
        if ((i13 & 2) != 0) {
            userInfoDto = sdkAuthResponseBodyDto.userInfo;
        }
        UserInfoDto userInfoDto2 = userInfoDto;
        if ((i13 & 4) != 0) {
            str2 = sdkAuthResponseBodyDto.merchantName;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            str3 = sdkAuthResponseBodyDto.logoUrl;
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            bool = sdkAuthResponseBodyDto.isOtpNeed;
        }
        return sdkAuthResponseBodyDto.copy(str, userInfoDto2, str4, str5, bool);
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

    public final SdkAuthResponseBodyDto copy(String sessionId, UserInfoDto userInfo, String merchantName, String logoUrl, Boolean isOtpNeed) {
        return new SdkAuthResponseBodyDto(sessionId, userInfo, merchantName, logoUrl, isOtpNeed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAuthResponseBodyDto)) {
            return false;
        }
        SdkAuthResponseBodyDto sdkAuthResponseBodyDto = (SdkAuthResponseBodyDto) other;
        return zdlpuopuiu.eablkybsjg(this.sessionId, sdkAuthResponseBodyDto.sessionId) && zdlpuopuiu.eablkybsjg(this.userInfo, sdkAuthResponseBodyDto.userInfo) && zdlpuopuiu.eablkybsjg(this.merchantName, sdkAuthResponseBodyDto.merchantName) && zdlpuopuiu.eablkybsjg(this.logoUrl, sdkAuthResponseBodyDto.logoUrl) && zdlpuopuiu.eablkybsjg(this.isOtpNeed, sdkAuthResponseBodyDto.isOtpNeed);
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
        String str = this.sessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserInfoDto userInfoDto = this.userInfo;
        int iHashCode2 = (iHashCode + (userInfoDto == null ? 0 : userInfoDto.hashCode())) * 31;
        String str2 = this.merchantName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOtpNeed;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isOtpNeed() {
        return this.isOtpNeed;
    }

    public String toString() {
        return "SdkAuthResponseBodyDto(sessionId=" + this.sessionId + ", userInfo=" + this.userInfo + ", merchantName=" + this.merchantName + ", logoUrl=" + this.logoUrl + ", isOtpNeed=" + this.isOtpNeed + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public SdkAuthResponseBody toModel() {
        String str = this.sessionId;
        if (str == null) {
            throw new pd("sessionId");
        }
        UserInfoDto userInfoDto = this.userInfo;
        if (userInfoDto != null) {
            return new SdkAuthResponseBody(str, userInfoDto, this.merchantName, this.logoUrl, this.isOtpNeed);
        }
        throw new pd("userInfo");
    }
}
