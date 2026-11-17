package io.appmetrica.analytics.billinginterface.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final Period introductoryPricePeriod;
    public final String priceCurrency;
    public final long priceMicros;
    public final String purchaseOriginalJson;
    public final long purchaseTime;
    public final String purchaseToken;
    public final int quantity;
    public final String signature;
    public final String sku;
    public final Period subscriptionPeriod;
    public final ProductType type;

    public ProductInfo(ProductType productType, String str, int i13, long j13, String str2, long j14, Period period, int i14, Period period2, String str3, String str4, long j15, boolean z13, String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i13;
        this.priceMicros = j13;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j14;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i14;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j15;
        this.autoRenewing = z13;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.sku.hashCode() + (this.type.hashCode() * 31)) * 31) + this.quantity) * 31;
        long j13 = this.priceMicros;
        int iHashCode2 = (this.priceCurrency.hashCode() + ((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31)) * 31;
        long j14 = this.introductoryPriceMicros;
        int i13 = (iHashCode2 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int iHashCode3 = (((i13 + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int iHashCode4 = (this.purchaseToken.hashCode() + ((this.signature.hashCode() + ((iHashCode3 + (period2 != null ? period2.hashCode() : 0)) * 31)) * 31)) * 31;
        long j15 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((iHashCode4 + ((int) ((j15 >>> 32) ^ j15))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    public String toString() {
        return "ProductInfo{type=" + this.type + ", sku='" + this.sku + "', quantity=" + this.quantity + ", priceMicros=" + this.priceMicros + ", priceCurrency='" + this.priceCurrency + "', introductoryPriceMicros=" + this.introductoryPriceMicros + ", introductoryPricePeriod=" + this.introductoryPricePeriod + ", introductoryPriceCycles=" + this.introductoryPriceCycles + ", subscriptionPeriod=" + this.subscriptionPeriod + ", signature='" + this.signature + "', purchaseToken='" + this.purchaseToken + "', purchaseTime=" + this.purchaseTime + ", autoRenewing=" + this.autoRenewing + ", purchaseOriginalJson='" + this.purchaseOriginalJson + "'}";
    }
}
