package spay.sdk.domain.model.response.otp;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/domain/model/response/otp/CreateBindingOtpResponseBody;", "", "cardNumber", "", "mobilePhone", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getMobilePhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateBindingOtpResponseBody {
    private final String cardNumber;
    private final String mobilePhone;

    public CreateBindingOtpResponseBody(String cardNumber, String mobilePhone) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        this.cardNumber = cardNumber;
        this.mobilePhone = mobilePhone;
    }

    public static /* synthetic */ CreateBindingOtpResponseBody copy$default(CreateBindingOtpResponseBody createBindingOtpResponseBody, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createBindingOtpResponseBody.cardNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = createBindingOtpResponseBody.mobilePhone;
        }
        return createBindingOtpResponseBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final CreateBindingOtpResponseBody copy(String cardNumber, String mobilePhone) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        return new CreateBindingOtpResponseBody(cardNumber, mobilePhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBindingOtpResponseBody)) {
            return false;
        }
        CreateBindingOtpResponseBody createBindingOtpResponseBody = (CreateBindingOtpResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.cardNumber, createBindingOtpResponseBody.cardNumber) && zdlpuopuiu.eablkybsjg(this.mobilePhone, createBindingOtpResponseBody.mobilePhone);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public int hashCode() {
        return this.mobilePhone.hashCode() + (this.cardNumber.hashCode() * 31);
    }

    public String toString() {
        return "CreateBindingOtpResponseBody(cardNumber=" + this.cardNumber + ", mobilePhone=" + this.mobilePhone + ")";
    }
}
