package modern.payments.ecomAndroid.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/EcomBindingInfo;", "", "bindingId", "", "maskedPan", "expiryDate", "issuerName", "cardLogoUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getCardLogoUrl", "getExpiryDate", "getIssuerName", "getMaskedPan", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomBindingInfo {
    private final String bindingId;
    private final String cardLogoUrl;
    private final String expiryDate;
    private final String issuerName;
    private final String maskedPan;

    public EcomBindingInfo(String bindingId, String maskedPan, String expiryDate, String issuerName, String cardLogoUrl) {
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(maskedPan, "maskedPan");
        zdlpuopuiu.btonecajqb(expiryDate, "expiryDate");
        zdlpuopuiu.btonecajqb(issuerName, "issuerName");
        zdlpuopuiu.btonecajqb(cardLogoUrl, "cardLogoUrl");
        this.bindingId = bindingId;
        this.maskedPan = maskedPan;
        this.expiryDate = expiryDate;
        this.issuerName = issuerName;
        this.cardLogoUrl = cardLogoUrl;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getCardLogoUrl() {
        return this.cardLogoUrl;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getMaskedPan() {
        return this.maskedPan;
    }
}
