package spay.sdk.domain.model.response;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006<"}, d2 = {"Lspay/sdk/domain/model/response/PaymentOrderResponseBody;", "", "operationId", "", "errorCode", "description", "info", "formUrl", "redirect", "termUrl", "acsUrl", "paReq", "cReq", "threeDSMethodUrl", "threeDSMethodNotificationUrl", "threeDSServerTransId", "threeDSMethodData", "acsRenderingType", "acsSignedContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsRenderingType", "()Ljava/lang/String;", "getAcsSignedContent", "getAcsUrl", "getCReq", "getDescription", "getErrorCode", "getFormUrl", "getInfo", "getOperationId", "getPaReq", "getRedirect", "getTermUrl", "getThreeDSMethodData", "getThreeDSMethodNotificationUrl", "getThreeDSMethodUrl", "getThreeDSServerTransId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentOrderResponseBody {
    private final String acsRenderingType;
    private final String acsSignedContent;
    private final String acsUrl;
    private final String cReq;
    private final String description;
    private final String errorCode;
    private final String formUrl;
    private final String info;
    private final String operationId;
    private final String paReq;
    private final String redirect;
    private final String termUrl;
    private final String threeDSMethodData;
    private final String threeDSMethodNotificationUrl;
    private final String threeDSMethodUrl;
    private final String threeDSServerTransId;

    public PaymentOrderResponseBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCReq() {
        return this.cReq;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getThreeDSMethodUrl() {
        return this.threeDSMethodUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getThreeDSServerTransId() {
        return this.threeDSServerTransId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getThreeDSMethodData() {
        return this.threeDSMethodData;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAcsRenderingType() {
        return this.acsRenderingType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFormUrl() {
        return this.formUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTermUrl() {
        return this.termUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAcsUrl() {
        return this.acsUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaReq() {
        return this.paReq;
    }

    public final PaymentOrderResponseBody copy(String operationId, String errorCode, String description, String info, String formUrl, String redirect, String termUrl, String acsUrl, String paReq, String cReq, String threeDSMethodUrl, String threeDSMethodNotificationUrl, String threeDSServerTransId, String threeDSMethodData, String acsRenderingType, String acsSignedContent) {
        return new PaymentOrderResponseBody(operationId, errorCode, description, info, formUrl, redirect, termUrl, acsUrl, paReq, cReq, threeDSMethodUrl, threeDSMethodNotificationUrl, threeDSServerTransId, threeDSMethodData, acsRenderingType, acsSignedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOrderResponseBody)) {
            return false;
        }
        PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.operationId, paymentOrderResponseBody.operationId) && zdlpuopuiu.eablkybsjg(this.errorCode, paymentOrderResponseBody.errorCode) && zdlpuopuiu.eablkybsjg(this.description, paymentOrderResponseBody.description) && zdlpuopuiu.eablkybsjg(this.info, paymentOrderResponseBody.info) && zdlpuopuiu.eablkybsjg(this.formUrl, paymentOrderResponseBody.formUrl) && zdlpuopuiu.eablkybsjg(this.redirect, paymentOrderResponseBody.redirect) && zdlpuopuiu.eablkybsjg(this.termUrl, paymentOrderResponseBody.termUrl) && zdlpuopuiu.eablkybsjg(this.acsUrl, paymentOrderResponseBody.acsUrl) && zdlpuopuiu.eablkybsjg(this.paReq, paymentOrderResponseBody.paReq) && zdlpuopuiu.eablkybsjg(this.cReq, paymentOrderResponseBody.cReq) && zdlpuopuiu.eablkybsjg(this.threeDSMethodUrl, paymentOrderResponseBody.threeDSMethodUrl) && zdlpuopuiu.eablkybsjg(this.threeDSMethodNotificationUrl, paymentOrderResponseBody.threeDSMethodNotificationUrl) && zdlpuopuiu.eablkybsjg(this.threeDSServerTransId, paymentOrderResponseBody.threeDSServerTransId) && zdlpuopuiu.eablkybsjg(this.threeDSMethodData, paymentOrderResponseBody.threeDSMethodData) && zdlpuopuiu.eablkybsjg(this.acsRenderingType, paymentOrderResponseBody.acsRenderingType) && zdlpuopuiu.eablkybsjg(this.acsSignedContent, paymentOrderResponseBody.acsSignedContent);
    }

    public final String getAcsRenderingType() {
        return this.acsRenderingType;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final String getCReq() {
        return this.cReq;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getFormUrl() {
        return this.formUrl;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getPaReq() {
        return this.paReq;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public final String getThreeDSMethodData() {
        return this.threeDSMethodData;
    }

    public final String getThreeDSMethodNotificationUrl() {
        return this.threeDSMethodNotificationUrl;
    }

    public final String getThreeDSMethodUrl() {
        return this.threeDSMethodUrl;
    }

    public final String getThreeDSServerTransId() {
        return this.threeDSServerTransId;
    }

    public int hashCode() {
        String str = this.operationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.info;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.formUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirect;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.termUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.acsUrl;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paReq;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cReq;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.threeDSMethodUrl;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.threeDSMethodNotificationUrl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.threeDSServerTransId;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.threeDSMethodData;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.acsRenderingType;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.acsSignedContent;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        return "PaymentOrderResponseBody(operationId=" + this.operationId + ", errorCode=" + this.errorCode + ", description=" + this.description + ", info=" + this.info + ", formUrl=" + this.formUrl + ", redirect=" + this.redirect + ", termUrl=" + this.termUrl + ", acsUrl=" + this.acsUrl + ", paReq=" + this.paReq + ", cReq=" + this.cReq + ", threeDSMethodUrl=" + this.threeDSMethodUrl + ", threeDSMethodNotificationUrl=" + this.threeDSMethodNotificationUrl + ", threeDSServerTransId=" + this.threeDSServerTransId + ", threeDSMethodData=" + this.threeDSMethodData + ", acsRenderingType=" + this.acsRenderingType + ", acsSignedContent=" + this.acsSignedContent + ")";
    }

    public PaymentOrderResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.operationId = str;
        this.errorCode = str2;
        this.description = str3;
        this.info = str4;
        this.formUrl = str5;
        this.redirect = str6;
        this.termUrl = str7;
        this.acsUrl = str8;
        this.paReq = str9;
        this.cReq = str10;
        this.threeDSMethodUrl = str11;
        this.threeDSMethodNotificationUrl = str12;
        this.threeDSServerTransId = str13;
        this.threeDSMethodData = str14;
        this.acsRenderingType = str15;
        this.acsSignedContent = str16;
    }

    public /* synthetic */ PaymentOrderResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11, (i13 & 2048) != 0 ? null : str12, (i13 & 4096) != 0 ? null : str13, (i13 & 8192) != 0 ? null : str14, (i13 & 16384) != 0 ? null : str15, (i13 & 32768) != 0 ? null : str16);
    }
}
