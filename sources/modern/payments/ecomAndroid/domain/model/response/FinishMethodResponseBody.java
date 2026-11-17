package modern.payments.ecomAndroid.domain.model.response;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "", "operationId", "", "errorCode", "errorMessage", "status", "redirect", "info", "termUrl", "acsUrl", "cReq", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsUrl", "()Ljava/lang/String;", "getCReq", "getErrorCode", "getErrorMessage", "getInfo", "getOperationId", "getRedirect", "getStatus", "getTermUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinishMethodResponseBody {
    private final String acsUrl;
    private final String cReq;
    private final String errorCode;
    private final String errorMessage;
    private final String info;
    private final String operationId;
    private final String redirect;
    private final String status;
    private final String termUrl;

    public FinishMethodResponseBody() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInfo() {
        return this.info;
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
    public final String getCReq() {
        return this.cReq;
    }

    public final FinishMethodResponseBody copy(String operationId, String errorCode, String errorMessage, String status, String redirect, String info, String termUrl, String acsUrl, String cReq) {
        return new FinishMethodResponseBody(operationId, errorCode, errorMessage, status, redirect, info, termUrl, acsUrl, cReq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishMethodResponseBody)) {
            return false;
        }
        FinishMethodResponseBody finishMethodResponseBody = (FinishMethodResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.operationId, finishMethodResponseBody.operationId) && zdlpuopuiu.eablkybsjg(this.errorCode, finishMethodResponseBody.errorCode) && zdlpuopuiu.eablkybsjg(this.errorMessage, finishMethodResponseBody.errorMessage) && zdlpuopuiu.eablkybsjg(this.status, finishMethodResponseBody.status) && zdlpuopuiu.eablkybsjg(this.redirect, finishMethodResponseBody.redirect) && zdlpuopuiu.eablkybsjg(this.info, finishMethodResponseBody.info) && zdlpuopuiu.eablkybsjg(this.termUrl, finishMethodResponseBody.termUrl) && zdlpuopuiu.eablkybsjg(this.acsUrl, finishMethodResponseBody.acsUrl) && zdlpuopuiu.eablkybsjg(this.cReq, finishMethodResponseBody.cReq);
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final String getCReq() {
        return this.cReq;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public int hashCode() {
        String str = this.operationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redirect;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.info;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.termUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.acsUrl;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cReq;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "FinishMethodResponseBody(operationId=" + this.operationId + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", status=" + this.status + ", redirect=" + this.redirect + ", info=" + this.info + ", termUrl=" + this.termUrl + ", acsUrl=" + this.acsUrl + ", cReq=" + this.cReq + ')';
    }

    public FinishMethodResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.operationId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.status = str4;
        this.redirect = str5;
        this.info = str6;
        this.termUrl = str7;
        this.acsUrl = str8;
        this.cReq = str9;
    }

    public /* synthetic */ FinishMethodResponseBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str9 : null);
    }
}
