package spay.sdk.domain.model;

import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lspay/sdk/domain/model/MerchantData;", "", "authorization", "", "merchantLogin", "orderId", "bindingId", "orderNumber", "appPackage", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", "getAuthorization", "getBindingId", "getMerchantLogin", "getOrderId", "getOrderNumber", "getPhoneNumber", "setPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MerchantData {
    private String appPackage;
    private final String authorization;
    private final String bindingId;
    private final String merchantLogin;
    private final String orderId;
    private final String orderNumber;
    private String phoneNumber;

    public MerchantData(String authorization, String merchantLogin, String orderId, String str, String orderNumber, String appPackage, String phoneNumber) {
        zdlpuopuiu.btonecajqb(authorization, "authorization");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        this.authorization = authorization;
        this.merchantLogin = merchantLogin;
        this.orderId = orderId;
        this.bindingId = str;
        this.orderNumber = orderNumber;
        this.appPackage = appPackage;
        this.phoneNumber = phoneNumber;
    }

    public static /* synthetic */ MerchantData copy$default(MerchantData merchantData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = merchantData.authorization;
        }
        if ((i13 & 2) != 0) {
            str2 = merchantData.merchantLogin;
        }
        String str8 = str2;
        if ((i13 & 4) != 0) {
            str3 = merchantData.orderId;
        }
        String str9 = str3;
        if ((i13 & 8) != 0) {
            str4 = merchantData.bindingId;
        }
        String str10 = str4;
        if ((i13 & 16) != 0) {
            str5 = merchantData.orderNumber;
        }
        String str11 = str5;
        if ((i13 & 32) != 0) {
            str6 = merchantData.appPackage;
        }
        String str12 = str6;
        if ((i13 & 64) != 0) {
            str7 = merchantData.phoneNumber;
        }
        return merchantData.copy(str, str8, str9, str10, str11, str12, str7);
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
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final MerchantData copy(String authorization, String merchantLogin, String orderId, String bindingId, String orderNumber, String appPackage, String phoneNumber) {
        zdlpuopuiu.btonecajqb(authorization, "authorization");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        return new MerchantData(authorization, merchantLogin, orderId, bindingId, orderNumber, appPackage, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantData)) {
            return false;
        }
        MerchantData merchantData = (MerchantData) other;
        return zdlpuopuiu.eablkybsjg(this.authorization, merchantData.authorization) && zdlpuopuiu.eablkybsjg(this.merchantLogin, merchantData.merchantLogin) && zdlpuopuiu.eablkybsjg(this.orderId, merchantData.orderId) && zdlpuopuiu.eablkybsjg(this.bindingId, merchantData.bindingId) && zdlpuopuiu.eablkybsjg(this.orderNumber, merchantData.orderNumber) && zdlpuopuiu.eablkybsjg(this.appPackage, merchantData.appPackage) && zdlpuopuiu.eablkybsjg(this.phoneNumber, merchantData.phoneNumber);
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.orderId, xg.iobyxmoadg(this.merchantLogin, this.authorization.hashCode() * 31, 31), 31);
        String str = this.bindingId;
        return this.phoneNumber.hashCode() + xg.iobyxmoadg(this.appPackage, xg.iobyxmoadg(this.orderNumber, (iIobyxmoadg + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final void setAppPackage(String str) {
        zdlpuopuiu.btonecajqb(str, "<set-?>");
        this.appPackage = str;
    }

    public final void setPhoneNumber(String str) {
        zdlpuopuiu.btonecajqb(str, "<set-?>");
        this.phoneNumber = str;
    }

    public String toString() {
        return "MerchantData(authorization=" + this.authorization + ", merchantLogin=" + this.merchantLogin + ", orderId=" + this.orderId + ", bindingId=" + this.bindingId + ", orderNumber=" + this.orderNumber + ", appPackage=" + this.appPackage + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public /* synthetic */ MerchantData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, str5, str6, (i13 & 64) != 0 ? "" : str7);
    }
}
