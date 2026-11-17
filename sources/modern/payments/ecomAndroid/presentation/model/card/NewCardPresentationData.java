package modern.payments.ecomAndroid.presentation.model.card;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "", "cardNumber", "", "expiryMonth", "expiryYear", "cvc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCvc", "getExpiryMonth", "getExpiryYear", "paymentSystem", "Lmodern/payments/ecomAndroid/presentation/model/card/PaymentSystem;", "getPaymentSystem", "()Lmodern/payments/ecomAndroid/presentation/model/card/PaymentSystem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NewCardPresentationData {
    private final String cardNumber;
    private final String cvc;
    private final String expiryMonth;
    private final String expiryYear;

    public NewCardPresentationData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NewCardPresentationData copy$default(NewCardPresentationData newCardPresentationData, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = newCardPresentationData.cardNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = newCardPresentationData.expiryMonth;
        }
        if ((i13 & 4) != 0) {
            str3 = newCardPresentationData.expiryYear;
        }
        if ((i13 & 8) != 0) {
            str4 = newCardPresentationData.cvc;
        }
        return newCardPresentationData.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    public final NewCardPresentationData copy(String cardNumber, String expiryMonth, String expiryYear, String cvc) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(expiryMonth, "expiryMonth");
        zdlpuopuiu.btonecajqb(expiryYear, "expiryYear");
        zdlpuopuiu.btonecajqb(cvc, "cvc");
        return new NewCardPresentationData(cardNumber, expiryMonth, expiryYear, cvc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCardPresentationData)) {
            return false;
        }
        NewCardPresentationData newCardPresentationData = (NewCardPresentationData) other;
        return zdlpuopuiu.eablkybsjg(this.cardNumber, newCardPresentationData.cardNumber) && zdlpuopuiu.eablkybsjg(this.expiryMonth, newCardPresentationData.expiryMonth) && zdlpuopuiu.eablkybsjg(this.expiryYear, newCardPresentationData.expiryYear) && zdlpuopuiu.eablkybsjg(this.cvc, newCardPresentationData.cvc);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final PaymentSystem getPaymentSystem() {
        if (this.cardNumber.length() == 0) {
            return PaymentSystem.UNKNOWN;
        }
        if (kcexrzcfyt.stevsuqkhv(this.cardNumber, "2", false, 2, null)) {
            return PaymentSystem.MIR;
        }
        if (kcexrzcfyt.stevsuqkhv(this.cardNumber, "4", false, 2, null)) {
            return PaymentSystem.VISA;
        }
        if (kcexrzcfyt.stevsuqkhv(this.cardNumber, ThreeDSecureRepositoryImpl.DEF_MAX_TIMEOUT, false, 2, null)) {
            return PaymentSystem.MASTERCARD;
        }
        return kcexrzcfyt.stevsuqkhv(this.cardNumber, "6", false, 2, null) ? PaymentSystem.UNION_PAY : PaymentSystem.UNKNOWN;
    }

    public int hashCode() {
        return (((((this.cardNumber.hashCode() * 31) + this.expiryMonth.hashCode()) * 31) + this.expiryYear.hashCode()) * 31) + this.cvc.hashCode();
    }

    public String toString() {
        return "{\"expirationMonth\":\"" + this.expiryMonth + "\",\"pan\":\"" + this.cardNumber + "\",\"cvc\":\"" + this.cvc + "\",\"expirationYear\":\"20" + this.expiryYear + "\"}";
    }

    public NewCardPresentationData(String cardNumber, String expiryMonth, String expiryYear, String cvc) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(expiryMonth, "expiryMonth");
        zdlpuopuiu.btonecajqb(expiryYear, "expiryYear");
        zdlpuopuiu.btonecajqb(cvc, "cvc");
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvc = cvc;
    }

    public /* synthetic */ NewCardPresentationData(String str, String str2, String str3, String str4, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4);
    }
}
