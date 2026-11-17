package modern.payments.ecomAndroid.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u00014BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001bR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u0010\u001d¨\u00065"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "", "Landroid/content/Context;", "context", "", "bankInvoiceId", "apiKey", "merchantLogin", "orderNumber", "appPackageName", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "preferredSPayMethod", "Lkotlin/Function1;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "Lgg/wwaezpbzkn;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/api/EcomSPayMethod;Ltg/draadjrbmk;)V", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "component8", "()Ltg/draadjrbmk;", "copy", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/api/EcomSPayMethod;Ltg/draadjrbmk;)Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Ljava/lang/String;", "getBankInvoiceId", "getApiKey", "getMerchantLogin", "getOrderNumber", "getAppPackageName", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "getPreferredSPayMethod", "Ltg/draadjrbmk;", "getCallback", "EcomSdkResult", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSdkMerchantOptionsConfig {
    private final String apiKey;
    private final String appPackageName;
    private final String bankInvoiceId;
    private final draadjrbmk callback;
    private final Context context;
    private final String merchantLogin;
    private final String orderNumber;
    private final EcomSPayMethod preferredSPayMethod;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "", "localSessionId", "", "(Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "setLocalSessionId", "Cancel", "Error", "Success", "Waiting", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Cancel;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Error;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Success;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Waiting;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EcomSdkResult {
        private String localSessionId;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Cancel;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "localSessionId", "", "(Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "setLocalSessionId", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Cancel extends EcomSdkResult {
            private String localSessionId;

            /* JADX WARN: Multi-variable type inference failed */
            public Cancel() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Cancel copy$default(Cancel cancel, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = cancel.localSessionId;
                }
                return cancel.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getLocalSessionId() {
                return this.localSessionId;
            }

            public final Cancel copy(String localSessionId) {
                return new Cancel(localSessionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancel) && zdlpuopuiu.eablkybsjg(this.localSessionId, ((Cancel) other).localSessionId);
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public String getLocalSessionId() {
                return this.localSessionId;
            }

            public int hashCode() {
                String str = this.localSessionId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public void setLocalSessionId(String str) {
                this.localSessionId = str;
            }

            public String toString() {
                return "Cancel(localSessionId=" + this.localSessionId + ')';
            }

            public Cancel(String str) {
                super(str, null);
                this.localSessionId = str;
            }

            public /* synthetic */ Cancel(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Error;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "httpCode", "", "errorCode", "description", "bankInvoiceId", "localSessionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankInvoiceId", "()Ljava/lang/String;", "getDescription", "getErrorCode", "getHttpCode", "getLocalSessionId", "setLocalSessionId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends EcomSdkResult {
            private final String bankInvoiceId;
            private final String description;
            private final String errorCode;
            private final String httpCode;
            private String localSessionId;

            public Error() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = error.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = error.errorCode;
                }
                String str6 = str2;
                if ((i13 & 4) != 0) {
                    str3 = error.description;
                }
                String str7 = str3;
                if ((i13 & 8) != 0) {
                    str4 = error.bankInvoiceId;
                }
                String str8 = str4;
                if ((i13 & 16) != 0) {
                    str5 = error.localSessionId;
                }
                return error.copy(str, str6, str7, str8, str5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHttpCode() {
                return this.httpCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getBankInvoiceId() {
                return this.bankInvoiceId;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getLocalSessionId() {
                return this.localSessionId;
            }

            public final Error copy(String httpCode, String errorCode, String description, String bankInvoiceId, String localSessionId) {
                return new Error(httpCode, errorCode, description, bankInvoiceId, localSessionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, error.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, error.errorCode) && zdlpuopuiu.eablkybsjg(this.description, error.description) && zdlpuopuiu.eablkybsjg(this.bankInvoiceId, error.bankInvoiceId) && zdlpuopuiu.eablkybsjg(this.localSessionId, error.localSessionId);
            }

            public final String getBankInvoiceId() {
                return this.bankInvoiceId;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final String getHttpCode() {
                return this.httpCode;
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public String getLocalSessionId() {
                return this.localSessionId;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.bankInvoiceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.localSessionId;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public void setLocalSessionId(String str) {
                this.localSessionId = str;
            }

            public String toString() {
                return "Error(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ", bankInvoiceId=" + this.bankInvoiceId + ", localSessionId=" + this.localSessionId + ')';
            }

            public /* synthetic */ Error(String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
            }

            public Error(String str, String str2, String str3, String str4, String str5) {
                super(str5, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
                this.bankInvoiceId = str4;
                this.localSessionId = str5;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Success;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "localSessionId", "", "(Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "setLocalSessionId", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends EcomSdkResult {
            private String localSessionId;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = success.localSessionId;
                }
                return success.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getLocalSessionId() {
                return this.localSessionId;
            }

            public final Success copy(String localSessionId) {
                return new Success(localSessionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && zdlpuopuiu.eablkybsjg(this.localSessionId, ((Success) other).localSessionId);
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public String getLocalSessionId() {
                return this.localSessionId;
            }

            public int hashCode() {
                String str = this.localSessionId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public void setLocalSessionId(String str) {
                this.localSessionId = str;
            }

            public String toString() {
                return "Success(localSessionId=" + this.localSessionId + ')';
            }

            public Success(String str) {
                super(str, null);
                this.localSessionId = str;
            }

            public /* synthetic */ Success(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult$Waiting;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "httpCode", "", "errorCode", "description", "bankInvoiceId", "localSessionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankInvoiceId", "()Ljava/lang/String;", "getDescription", "getErrorCode", "getHttpCode", "getLocalSessionId", "setLocalSessionId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Waiting extends EcomSdkResult {
            private final String bankInvoiceId;
            private final String description;
            private final String errorCode;
            private final String httpCode;
            private String localSessionId;

            public Waiting() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ Waiting copy$default(Waiting waiting, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = waiting.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = waiting.errorCode;
                }
                String str6 = str2;
                if ((i13 & 4) != 0) {
                    str3 = waiting.description;
                }
                String str7 = str3;
                if ((i13 & 8) != 0) {
                    str4 = waiting.bankInvoiceId;
                }
                String str8 = str4;
                if ((i13 & 16) != 0) {
                    str5 = waiting.localSessionId;
                }
                return waiting.copy(str, str6, str7, str8, str5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHttpCode() {
                return this.httpCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getBankInvoiceId() {
                return this.bankInvoiceId;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getLocalSessionId() {
                return this.localSessionId;
            }

            public final Waiting copy(String httpCode, String errorCode, String description, String bankInvoiceId, String localSessionId) {
                return new Waiting(httpCode, errorCode, description, bankInvoiceId, localSessionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Waiting)) {
                    return false;
                }
                Waiting waiting = (Waiting) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, waiting.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, waiting.errorCode) && zdlpuopuiu.eablkybsjg(this.description, waiting.description) && zdlpuopuiu.eablkybsjg(this.bankInvoiceId, waiting.bankInvoiceId) && zdlpuopuiu.eablkybsjg(this.localSessionId, waiting.localSessionId);
            }

            public final String getBankInvoiceId() {
                return this.bankInvoiceId;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final String getHttpCode() {
                return this.httpCode;
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public String getLocalSessionId() {
                return this.localSessionId;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.bankInvoiceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.localSessionId;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig.EcomSdkResult
            public void setLocalSessionId(String str) {
                this.localSessionId = str;
            }

            public String toString() {
                return "Waiting(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ", bankInvoiceId=" + this.bankInvoiceId + ", localSessionId=" + this.localSessionId + ')';
            }

            public /* synthetic */ Waiting(String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
            }

            public Waiting(String str, String str2, String str3, String str4, String str5) {
                super(str5, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
                this.bankInvoiceId = str4;
                this.localSessionId = str5;
            }
        }

        public /* synthetic */ EcomSdkResult(String str, gtknphoqwx gtknphoqwxVar) {
            this(str);
        }

        public String getLocalSessionId() {
            return this.localSessionId;
        }

        public void setLocalSessionId(String str) {
            this.localSessionId = str;
        }

        private EcomSdkResult(String str) {
            this.localSessionId = str;
        }

        public /* synthetic */ EcomSdkResult(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, null);
        }
    }

    public EcomSdkMerchantOptionsConfig(Context context, String bankInvoiceId, String apiKey, String merchantLogin, String orderNumber, String appPackageName, EcomSPayMethod ecomSPayMethod, draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackageName, "appPackageName");
        zdlpuopuiu.btonecajqb(callback, "callback");
        this.context = context;
        this.bankInvoiceId = bankInvoiceId;
        this.apiKey = apiKey;
        this.merchantLogin = merchantLogin;
        this.orderNumber = orderNumber;
        this.appPackageName = appPackageName;
        this.preferredSPayMethod = ecomSPayMethod;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBankInvoiceId() {
        return this.bankInvoiceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EcomSPayMethod getPreferredSPayMethod() {
        return this.preferredSPayMethod;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final draadjrbmk getCallback() {
        return this.callback;
    }

    public final EcomSdkMerchantOptionsConfig copy(Context context, String bankInvoiceId, String apiKey, String merchantLogin, String orderNumber, String appPackageName, EcomSPayMethod preferredSPayMethod, draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackageName, "appPackageName");
        zdlpuopuiu.btonecajqb(callback, "callback");
        return new EcomSdkMerchantOptionsConfig(context, bankInvoiceId, apiKey, merchantLogin, orderNumber, appPackageName, preferredSPayMethod, callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSdkMerchantOptionsConfig)) {
            return false;
        }
        EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig = (EcomSdkMerchantOptionsConfig) other;
        return zdlpuopuiu.eablkybsjg(this.context, ecomSdkMerchantOptionsConfig.context) && zdlpuopuiu.eablkybsjg(this.bankInvoiceId, ecomSdkMerchantOptionsConfig.bankInvoiceId) && zdlpuopuiu.eablkybsjg(this.apiKey, ecomSdkMerchantOptionsConfig.apiKey) && zdlpuopuiu.eablkybsjg(this.merchantLogin, ecomSdkMerchantOptionsConfig.merchantLogin) && zdlpuopuiu.eablkybsjg(this.orderNumber, ecomSdkMerchantOptionsConfig.orderNumber) && zdlpuopuiu.eablkybsjg(this.appPackageName, ecomSdkMerchantOptionsConfig.appPackageName) && zdlpuopuiu.eablkybsjg(this.preferredSPayMethod, ecomSdkMerchantOptionsConfig.preferredSPayMethod) && zdlpuopuiu.eablkybsjg(this.callback, ecomSdkMerchantOptionsConfig.callback);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppPackageName() {
        return this.appPackageName;
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

    public final EcomSPayMethod getPreferredSPayMethod() {
        return this.preferredSPayMethod;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.context.hashCode() * 31) + this.bankInvoiceId.hashCode()) * 31) + this.apiKey.hashCode()) * 31) + this.merchantLogin.hashCode()) * 31) + this.orderNumber.hashCode()) * 31) + this.appPackageName.hashCode()) * 31;
        EcomSPayMethod ecomSPayMethod = this.preferredSPayMethod;
        return ((iHashCode + (ecomSPayMethod == null ? 0 : ecomSPayMethod.hashCode())) * 31) + this.callback.hashCode();
    }

    public String toString() {
        return "EcomSdkMerchantOptionsConfig(context=" + this.context + ", bankInvoiceId=" + this.bankInvoiceId + ", apiKey=" + this.apiKey + ", merchantLogin=" + this.merchantLogin + ", orderNumber=" + this.orderNumber + ", appPackageName=" + this.appPackageName + ", preferredSPayMethod=" + this.preferredSPayMethod + ", callback=" + this.callback + ')';
    }

    public /* synthetic */ EcomSdkMerchantOptionsConfig(Context context, String str, String str2, String str3, String str4, String str5, EcomSPayMethod ecomSPayMethod, draadjrbmk draadjrbmkVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, str, str2, str3, str4, str5, (i13 & 64) != 0 ? null : ecomSPayMethod, draadjrbmkVar);
    }
}
