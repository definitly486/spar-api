package modern.payments.ecomAndroid.domain.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "", "operationId", "", "errorCode", "errorMessage", "redirect", "info", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getInfo", "getOperationId", "getRedirect", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinishPaymentResponseBody {
    private final String errorCode;
    private final String errorMessage;
    private final String info;
    private final String operationId;
    private final String redirect;

    public FinishPaymentResponseBody() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FinishPaymentResponseBody copy$default(FinishPaymentResponseBody finishPaymentResponseBody, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finishPaymentResponseBody.operationId;
        }
        if ((i13 & 2) != 0) {
            str2 = finishPaymentResponseBody.errorCode;
        }
        String str6 = str2;
        if ((i13 & 4) != 0) {
            str3 = finishPaymentResponseBody.errorMessage;
        }
        String str7 = str3;
        if ((i13 & 8) != 0) {
            str4 = finishPaymentResponseBody.redirect;
        }
        String str8 = str4;
        if ((i13 & 16) != 0) {
            str5 = finishPaymentResponseBody.info;
        }
        return finishPaymentResponseBody.copy(str, str6, str7, str8, str5);
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
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final FinishPaymentResponseBody copy(String operationId, String errorCode, String errorMessage, String redirect, String info) {
        return new FinishPaymentResponseBody(operationId, errorCode, errorMessage, redirect, info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishPaymentResponseBody)) {
            return false;
        }
        FinishPaymentResponseBody finishPaymentResponseBody = (FinishPaymentResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.operationId, finishPaymentResponseBody.operationId) && zdlpuopuiu.eablkybsjg(this.errorCode, finishPaymentResponseBody.errorCode) && zdlpuopuiu.eablkybsjg(this.errorMessage, finishPaymentResponseBody.errorMessage) && zdlpuopuiu.eablkybsjg(this.redirect, finishPaymentResponseBody.redirect) && zdlpuopuiu.eablkybsjg(this.info, finishPaymentResponseBody.info);
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

    public int hashCode() {
        String str = this.operationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redirect;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.info;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "FinishPaymentResponseBody(operationId=" + this.operationId + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", redirect=" + this.redirect + ", info=" + this.info + ')';
    }

    public FinishPaymentResponseBody(String str, String str2, String str3, String str4, String str5) {
        this.operationId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.redirect = str4;
        this.info = str5;
    }

    public /* synthetic */ FinishPaymentResponseBody(String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
