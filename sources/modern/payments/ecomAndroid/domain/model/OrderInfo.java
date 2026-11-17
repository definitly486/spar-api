package modern.payments.ecomAndroid.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/OrderInfo;", "", "orderAmount", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "merchantInfo", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;", "(Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;)V", "getMerchantInfo", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;", "getOrderAmount", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MerchantInfo", "OrderAmount", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderInfo {
    private final MerchantInfo merchantInfo;
    private final OrderAmount orderAmount;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;", "", "merchantName", "", "merchantLogoUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getMerchantLogoUrl", "()Ljava/lang/String;", "getMerchantName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MerchantInfo {
        private final String merchantLogoUrl;
        private final String merchantName;

        /* JADX WARN: Multi-variable type inference failed */
        public MerchantInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            if ((i13 & 2) != 0) {
                str2 = merchantInfo.merchantLogoUrl;
            }
            return merchantInfo.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final MerchantInfo copy(String merchantName, String merchantLogoUrl) {
            return new MerchantInfo(merchantName, merchantLogoUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) other;
            return zdlpuopuiu.eablkybsjg(this.merchantName, merchantInfo.merchantName) && zdlpuopuiu.eablkybsjg(this.merchantLogoUrl, merchantInfo.merchantLogoUrl);
        }

        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantLogoUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.merchantName + ", merchantLogoUrl=" + this.merchantLogoUrl + ')';
        }

        public MerchantInfo(String str, String str2) {
            this.merchantName = str;
            this.merchantLogoUrl = str2;
        }

        public /* synthetic */ MerchantInfo(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "", "amount", "", "currency", "", "(ILjava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderAmount {
        private final int amount;
        private final String currency;

        public OrderAmount(int i13, String currency) {
            zdlpuopuiu.btonecajqb(currency, "currency");
            this.amount = i13;
            this.currency = currency;
        }

        public static /* synthetic */ OrderAmount copy$default(OrderAmount orderAmount, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = orderAmount.amount;
            }
            if ((i14 & 2) != 0) {
                str = orderAmount.currency;
            }
            return orderAmount.copy(i13, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final OrderAmount copy(int amount, String currency) {
            zdlpuopuiu.btonecajqb(currency, "currency");
            return new OrderAmount(amount, currency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderAmount)) {
                return false;
            }
            OrderAmount orderAmount = (OrderAmount) other;
            return this.amount == orderAmount.amount && zdlpuopuiu.eablkybsjg(this.currency, orderAmount.currency);
        }

        public final int getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return (Integer.hashCode(this.amount) * 31) + this.currency.hashCode();
        }

        public String toString() {
            return "OrderAmount(amount=" + this.amount + ", currency=" + this.currency + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, OrderAmount orderAmount, MerchantInfo merchantInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            orderAmount = orderInfo.orderAmount;
        }
        if ((i13 & 2) != 0) {
            merchantInfo = orderInfo.merchantInfo;
        }
        return orderInfo.copy(orderAmount, merchantInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderAmount getOrderAmount() {
        return this.orderAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final OrderInfo copy(OrderAmount orderAmount, MerchantInfo merchantInfo) {
        return new OrderInfo(orderAmount, merchantInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) other;
        return zdlpuopuiu.eablkybsjg(this.orderAmount, orderInfo.orderAmount) && zdlpuopuiu.eablkybsjg(this.merchantInfo, orderInfo.merchantInfo);
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final OrderAmount getOrderAmount() {
        return this.orderAmount;
    }

    public int hashCode() {
        OrderAmount orderAmount = this.orderAmount;
        int iHashCode = (orderAmount == null ? 0 : orderAmount.hashCode()) * 31;
        MerchantInfo merchantInfo = this.merchantInfo;
        return iHashCode + (merchantInfo != null ? merchantInfo.hashCode() : 0);
    }

    public String toString() {
        return "OrderInfo(orderAmount=" + this.orderAmount + ", merchantInfo=" + this.merchantInfo + ')';
    }

    public OrderInfo(OrderAmount orderAmount, MerchantInfo merchantInfo) {
        this.orderAmount = orderAmount;
        this.merchantInfo = merchantInfo;
    }

    public /* synthetic */ OrderInfo(OrderAmount orderAmount, MerchantInfo merchantInfo, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : orderAmount, (i13 & 2) != 0 ? null : merchantInfo);
    }
}
