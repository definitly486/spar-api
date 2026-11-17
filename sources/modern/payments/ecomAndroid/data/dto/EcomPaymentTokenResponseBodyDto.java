package modern.payments.ecomAndroid.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.util.exception.NullRequiredFieldException;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomPaymentTokenResponseBodyDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "paymentToken", "", "initiateBankInvoiceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getInitiateBankInvoiceId", "()Ljava/lang/String;", "getPaymentToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomPaymentTokenResponseBodyDto implements DataDtoInterface<PaymentTokenResponseBody> {

    @ppxfxbqfkf("initiateBankInvoiceId")
    private final String initiateBankInvoiceId;

    @ppxfxbqfkf("paymentToken")
    private final String paymentToken;

    public EcomPaymentTokenResponseBodyDto(String str, String str2) {
        this.paymentToken = str;
        this.initiateBankInvoiceId = str2;
    }

    public static /* synthetic */ EcomPaymentTokenResponseBodyDto copy$default(EcomPaymentTokenResponseBodyDto ecomPaymentTokenResponseBodyDto, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ecomPaymentTokenResponseBodyDto.paymentToken;
        }
        if ((i13 & 2) != 0) {
            str2 = ecomPaymentTokenResponseBodyDto.initiateBankInvoiceId;
        }
        return ecomPaymentTokenResponseBodyDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiateBankInvoiceId() {
        return this.initiateBankInvoiceId;
    }

    public final EcomPaymentTokenResponseBodyDto copy(String paymentToken, String initiateBankInvoiceId) {
        return new EcomPaymentTokenResponseBodyDto(paymentToken, initiateBankInvoiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomPaymentTokenResponseBodyDto)) {
            return false;
        }
        EcomPaymentTokenResponseBodyDto ecomPaymentTokenResponseBodyDto = (EcomPaymentTokenResponseBodyDto) other;
        return zdlpuopuiu.eablkybsjg(this.paymentToken, ecomPaymentTokenResponseBodyDto.paymentToken) && zdlpuopuiu.eablkybsjg(this.initiateBankInvoiceId, ecomPaymentTokenResponseBodyDto.initiateBankInvoiceId);
    }

    public final String getInitiateBankInvoiceId() {
        return this.initiateBankInvoiceId;
    }

    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public int hashCode() {
        String str = this.paymentToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initiateBankInvoiceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EcomPaymentTokenResponseBodyDto(paymentToken=" + this.paymentToken + ", initiateBankInvoiceId=" + this.initiateBankInvoiceId + ')';
    }

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public PaymentTokenResponseBody toModel() {
        String str = this.paymentToken;
        if (str != null) {
            return new PaymentTokenResponseBody(str, this.initiateBankInvoiceId);
        }
        throw new NullRequiredFieldException("paymentToken");
    }

    public /* synthetic */ EcomPaymentTokenResponseBodyDto(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }
}
