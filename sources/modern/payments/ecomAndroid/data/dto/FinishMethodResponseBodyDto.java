package modern.payments.ecomAndroid.data.dto;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.response.FinishMethodResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0019"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/FinishMethodResponseBodyDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "operationId", "", "errorCode", "errorMessage", "status", "redirect", "info", "termUrl", "acsUrl", "cReq", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsUrl", "()Ljava/lang/String;", "getCReq", "getErrorCode", "getErrorMessage", "getInfo", "getOperationId", "getRedirect", "getStatus", "getTermUrl", "toModel", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinishMethodResponseBodyDto implements DataDtoInterface<FinishMethodResponseBody> {
    private final String acsUrl;
    private final String cReq;
    private final String errorCode;
    private final String errorMessage;
    private final String info;
    private final String operationId;
    private final String redirect;
    private final String status;
    private final String termUrl;

    public FinishMethodResponseBodyDto(String operationId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        zdlpuopuiu.btonecajqb(operationId, "operationId");
        this.operationId = operationId;
        this.errorCode = str;
        this.errorMessage = str2;
        this.status = str3;
        this.redirect = str4;
        this.info = str5;
        this.termUrl = str6;
        this.acsUrl = str7;
        this.cReq = str8;
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

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public FinishMethodResponseBody toModel() {
        return new FinishMethodResponseBody(this.operationId, this.errorCode, this.errorMessage, this.status, this.redirect, this.info, this.termUrl, this.acsUrl, this.cReq);
    }

    public /* synthetic */ FinishMethodResponseBodyDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str9 : null);
    }
}
