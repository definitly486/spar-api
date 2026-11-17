package modern.payments.ecomAndroid.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.response.FinishPaymentResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/FinishPaymentResponseBodyDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "operationId", "", "errorCode", "errorMessage", "redirect", "info", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getInfo", "getOperationId", "getRedirect", "toModel", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinishPaymentResponseBodyDto implements DataDtoInterface<FinishPaymentResponseBody> {
    private final String errorCode;
    private final String errorMessage;
    private final String info;
    private final String operationId;
    private final String redirect;

    public FinishPaymentResponseBodyDto() {
        this(null, null, null, null, null, 31, null);
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

    public FinishPaymentResponseBodyDto(String str, String str2, String str3, String str4, String str5) {
        this.operationId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.redirect = str4;
        this.info = str5;
    }

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public FinishPaymentResponseBody toModel() {
        return new FinishPaymentResponseBody(this.operationId, this.errorCode, this.errorMessage, this.redirect, this.info);
    }

    public /* synthetic */ FinishPaymentResponseBodyDto(String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
