package modern.payments.ecomAndroid.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;", "", "authorization", "", "merchantLogin", "bankInvoiceId", "orderNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorization", "()Ljava/lang/String;", "getBankInvoiceId", "getMerchantLogin", "getOrderNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MerchantInitialData {
    private final String authorization;
    private final String bankInvoiceId;
    private final String merchantLogin;
    private final String orderNumber;

    public MerchantInitialData(String authorization, String merchantLogin, String bankInvoiceId, String orderNumber) {
        zdlpuopuiu.btonecajqb(authorization, "authorization");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        this.authorization = authorization;
        this.merchantLogin = merchantLogin;
        this.bankInvoiceId = bankInvoiceId;
        this.orderNumber = orderNumber;
    }

    public static /* synthetic */ MerchantInitialData copy$default(MerchantInitialData merchantInitialData, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = merchantInitialData.authorization;
        }
        if ((i13 & 2) != 0) {
            str2 = merchantInitialData.merchantLogin;
        }
        if ((i13 & 4) != 0) {
            str3 = merchantInitialData.bankInvoiceId;
        }
        if ((i13 & 8) != 0) {
            str4 = merchantInitialData.orderNumber;
        }
        return merchantInitialData.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final MerchantInitialData copy(String authorization, String merchantLogin, String bankInvoiceId, String orderNumber) {
        zdlpuopuiu.btonecajqb(authorization, "authorization");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        return new MerchantInitialData(authorization, merchantLogin, bankInvoiceId, orderNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantInitialData)) {
            return false;
        }
        MerchantInitialData merchantInitialData = (MerchantInitialData) other;
        return zdlpuopuiu.eablkybsjg(this.authorization, merchantInitialData.authorization) && zdlpuopuiu.eablkybsjg(this.merchantLogin, merchantInitialData.merchantLogin) && zdlpuopuiu.eablkybsjg(this.bankInvoiceId, merchantInitialData.bankInvoiceId) && zdlpuopuiu.eablkybsjg(this.orderNumber, merchantInitialData.orderNumber);
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        return (((((this.authorization.hashCode() * 31) + this.merchantLogin.hashCode()) * 31) + this.bankInvoiceId.hashCode()) * 31) + this.orderNumber.hashCode();
    }

    public String toString() {
        return "MerchantInitialData(authorization=" + this.authorization + ", merchantLogin=" + this.merchantLogin + ", bankInvoiceId=" + this.bankInvoiceId + ", orderNumber=" + this.orderNumber + ')';
    }
}
