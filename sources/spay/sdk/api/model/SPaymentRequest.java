package spay.sdk.api.model;

import android.content.Context;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b-\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u0014R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001b¨\u00061"}, d2 = {"Lspay/sdk/api/model/SPaymentRequest;", "", "Landroid/content/Context;", "context", "", "apiKey", "bankInvoiceId", "orderNumber", "merchantLogin", "appPackage", "phoneNumber", "Lkotlin/Function1;", "Lspay/sdk/api/PaymentResult;", "Lgg/wwaezpbzkn;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg/draadjrbmk;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ltg/draadjrbmk;", "copy", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg/draadjrbmk;)Lspay/sdk/api/model/SPaymentRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Ljava/lang/String;", "getApiKey", "getBankInvoiceId", "getOrderNumber", "getMerchantLogin", "getAppPackage", "getPhoneNumber", "Ltg/draadjrbmk;", "getCallback", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPaymentRequest {
    private final String apiKey;
    private final String appPackage;
    private final String bankInvoiceId;
    private final draadjrbmk callback;
    private final Context context;
    private final String merchantLogin;
    private final String orderNumber;
    private final String phoneNumber;

    public SPaymentRequest(Context context, String apiKey, String bankInvoiceId, String orderNumber, String merchantLogin, String appPackage, String phoneNumber, draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        this.context = context;
        this.apiKey = apiKey;
        this.bankInvoiceId = bankInvoiceId;
        this.orderNumber = orderNumber;
        this.merchantLogin = merchantLogin;
        this.appPackage = appPackage;
        this.phoneNumber = phoneNumber;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final draadjrbmk getCallback() {
        return this.callback;
    }

    public final SPaymentRequest copy(Context context, String apiKey, String bankInvoiceId, String orderNumber, String merchantLogin, String appPackage, String phoneNumber, draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        return new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, phoneNumber, callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaymentRequest)) {
            return false;
        }
        SPaymentRequest sPaymentRequest = (SPaymentRequest) other;
        return zdlpuopuiu.eablkybsjg(this.context, sPaymentRequest.context) && zdlpuopuiu.eablkybsjg(this.apiKey, sPaymentRequest.apiKey) && zdlpuopuiu.eablkybsjg(this.bankInvoiceId, sPaymentRequest.bankInvoiceId) && zdlpuopuiu.eablkybsjg(this.orderNumber, sPaymentRequest.orderNumber) && zdlpuopuiu.eablkybsjg(this.merchantLogin, sPaymentRequest.merchantLogin) && zdlpuopuiu.eablkybsjg(this.appPackage, sPaymentRequest.appPackage) && zdlpuopuiu.eablkybsjg(this.phoneNumber, sPaymentRequest.phoneNumber) && zdlpuopuiu.eablkybsjg(this.callback, sPaymentRequest.callback);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    public final draadjrbmk getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return this.callback.hashCode() + xg.iobyxmoadg(this.phoneNumber, xg.iobyxmoadg(this.appPackage, xg.iobyxmoadg(this.merchantLogin, xg.iobyxmoadg(this.orderNumber, xg.iobyxmoadg(this.bankInvoiceId, xg.iobyxmoadg(this.apiKey, this.context.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "SPaymentRequest(context=" + this.context + ", apiKey=" + this.apiKey + ", bankInvoiceId=" + this.bankInvoiceId + ", orderNumber=" + this.orderNumber + ", merchantLogin=" + this.merchantLogin + ", appPackage=" + this.appPackage + ", phoneNumber=" + this.phoneNumber + ", callback=" + this.callback + ")";
    }

    public /* synthetic */ SPaymentRequest(Context context, String str, String str2, String str3, String str4, String str5, String str6, draadjrbmk draadjrbmkVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, str, str2, str3, str4, str5, (i13 & 64) != 0 ? "" : str6, draadjrbmkVar);
    }
}
