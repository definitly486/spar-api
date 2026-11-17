package modern.payments.ecomAndroid.presentation.fragment.paymentMode.model;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "bindingId", "", "maskedPan", "logoUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getLogoUrl", "getMaskedPan", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PayModeBindingCardItem implements PayModeItem {
    private final String bindingId;
    private final String logoUrl;
    private final String maskedPan;

    public PayModeBindingCardItem(String bindingId, String maskedPan, String logoUrl) {
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(maskedPan, "maskedPan");
        zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
        this.bindingId = bindingId;
        this.maskedPan = maskedPan;
        this.logoUrl = logoUrl;
    }

    public static /* synthetic */ PayModeBindingCardItem copy$default(PayModeBindingCardItem payModeBindingCardItem, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = payModeBindingCardItem.bindingId;
        }
        if ((i13 & 2) != 0) {
            str2 = payModeBindingCardItem.maskedPan;
        }
        if ((i13 & 4) != 0) {
            str3 = payModeBindingCardItem.logoUrl;
        }
        return payModeBindingCardItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final PayModeBindingCardItem copy(String bindingId, String maskedPan, String logoUrl) {
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(maskedPan, "maskedPan");
        zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
        return new PayModeBindingCardItem(bindingId, maskedPan, logoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayModeBindingCardItem)) {
            return false;
        }
        PayModeBindingCardItem payModeBindingCardItem = (PayModeBindingCardItem) other;
        return zdlpuopuiu.eablkybsjg(this.bindingId, payModeBindingCardItem.bindingId) && zdlpuopuiu.eablkybsjg(this.maskedPan, payModeBindingCardItem.maskedPan) && zdlpuopuiu.eablkybsjg(this.logoUrl, payModeBindingCardItem.logoUrl);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMaskedPan() {
        return this.maskedPan;
    }

    public int hashCode() {
        return (((this.bindingId.hashCode() * 31) + this.maskedPan.hashCode()) * 31) + this.logoUrl.hashCode();
    }

    public String toString() {
        return "PayModeBindingCardItem(bindingId=" + this.bindingId + ", maskedPan=" + this.maskedPan + ", logoUrl=" + this.logoUrl + ')';
    }
}
