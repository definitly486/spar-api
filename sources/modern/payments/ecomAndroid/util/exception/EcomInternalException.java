package modern.payments.ecomAndroid.util.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "", "EcomMerchantOptionsConfigIsNull", "EcomSdkConfigIsNull", "EcomSdkConfigRepositoryIsNull", "EcomSdkExternalMetricsManagerIsNull", "EcomSdkInitConfigIncorrectBankInvoiceId", "EcomSdkRemoteConfigIsNull", "EcomSdkSetupConfigIsNull", "EcomSdkStageIsNull", "EcomTokenRequestBindingIdIsNullException", "EcomTokenRequestCardDataIsNullException", "SharedPreferencesIllegalType", "SharedPreferencesNotInitialized", "ViewBindingNotCreatedYet", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomMerchantOptionsConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkConfigRepositoryIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkExternalMetricsManagerIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkInitConfigIncorrectBankInvoiceId;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkRemoteConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkSetupConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkStageIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomTokenRequestBindingIdIsNullException;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomTokenRequestCardDataIsNullException;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$SharedPreferencesIllegalType;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$SharedPreferencesNotInitialized;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$ViewBindingNotCreatedYet;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomInternalException {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomMerchantOptionsConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomMerchantOptionsConfigIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomMerchantOptionsConfigIsNull INSTANCE = new EcomMerchantOptionsConfigIsNull();

        private EcomMerchantOptionsConfigIsNull() {
            super("Merchant Options is null");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomMerchantOptionsConfigIsNull);
        }

        public int hashCode() {
            return -832125001;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomMerchantOptionsConfigIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkConfigIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkConfigIsNull INSTANCE = new EcomSdkConfigIsNull();

        private EcomSdkConfigIsNull() {
            super("Config is null");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkConfigIsNull);
        }

        public int hashCode() {
            return -942051525;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkConfigIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkConfigRepositoryIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkConfigRepositoryIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkConfigRepositoryIsNull INSTANCE = new EcomSdkConfigRepositoryIsNull();

        private EcomSdkConfigRepositoryIsNull() {
            super("ConfigRepository is not initialized");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkConfigRepositoryIsNull);
        }

        public int hashCode() {
            return -1416111451;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkConfigRepositoryIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkExternalMetricsManagerIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkExternalMetricsManagerIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkExternalMetricsManagerIsNull INSTANCE = new EcomSdkExternalMetricsManagerIsNull();

        private EcomSdkExternalMetricsManagerIsNull() {
            super("ExternalMetricsManager is not initialized");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkExternalMetricsManagerIsNull);
        }

        public int hashCode() {
            return -1329760306;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkExternalMetricsManagerIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkInitConfigIncorrectBankInvoiceId;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkInitConfigIncorrectBankInvoiceId extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkInitConfigIncorrectBankInvoiceId INSTANCE = new EcomSdkInitConfigIncorrectBankInvoiceId();

        private EcomSdkInitConfigIncorrectBankInvoiceId() {
            super("Incorrect bank invoice id");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkInitConfigIncorrectBankInvoiceId);
        }

        public int hashCode() {
            return -1562208959;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkInitConfigIncorrectBankInvoiceId";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkRemoteConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkRemoteConfigIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkRemoteConfigIsNull INSTANCE = new EcomSdkRemoteConfigIsNull();

        private EcomSdkRemoteConfigIsNull() {
            super("Remote config is null");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkRemoteConfigIsNull);
        }

        public int hashCode() {
            return -591283039;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkRemoteConfigIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkSetupConfigIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkSetupConfigIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkSetupConfigIsNull INSTANCE = new EcomSdkSetupConfigIsNull();

        private EcomSdkSetupConfigIsNull() {
            super("Setup config is null");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkSetupConfigIsNull);
        }

        public int hashCode() {
            return 665514056;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkSetupConfigIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomSdkStageIsNull;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomSdkStageIsNull extends IllegalArgumentException implements EcomInternalException {
        public static final EcomSdkStageIsNull INSTANCE = new EcomSdkStageIsNull();

        private EcomSdkStageIsNull() {
            super("Ecom stage is null");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomSdkStageIsNull);
        }

        public int hashCode() {
            return -998428185;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomSdkStageIsNull";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomTokenRequestBindingIdIsNullException;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomTokenRequestBindingIdIsNullException extends IllegalArgumentException implements EcomInternalException {
        public static final EcomTokenRequestBindingIdIsNullException INSTANCE = new EcomTokenRequestBindingIdIsNullException();

        private EcomTokenRequestBindingIdIsNullException() {
            super("Binding ID cannot be null for binding card payment mode");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomTokenRequestBindingIdIsNullException);
        }

        public int hashCode() {
            return 1417796070;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomTokenRequestBindingIdIsNullException";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$EcomTokenRequestCardDataIsNullException;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomTokenRequestCardDataIsNullException extends IllegalArgumentException implements EcomInternalException {
        public static final EcomTokenRequestCardDataIsNullException INSTANCE = new EcomTokenRequestCardDataIsNullException();

        private EcomTokenRequestCardDataIsNullException() {
            super("Encrypted card data cannot be null for new card payment mode");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EcomTokenRequestCardDataIsNullException);
        }

        public int hashCode() {
            return 1161070396;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "EcomTokenRequestCardDataIsNullException";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$SharedPreferencesIllegalType;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SharedPreferencesIllegalType extends IllegalArgumentException implements EcomInternalException {
        public static final SharedPreferencesIllegalType INSTANCE = new SharedPreferencesIllegalType();

        private SharedPreferencesIllegalType() {
            super("There is no such type to store it in EncryptedSharedPreferences");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$SharedPreferencesNotInitialized;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SharedPreferencesNotInitialized extends IllegalStateException implements EcomInternalException {
        public static final SharedPreferencesNotInitialized INSTANCE = new SharedPreferencesNotInitialized();

        private SharedPreferencesNotInitialized() {
            super("EncryptedSharedPreferences is not initialized");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/EcomInternalException$ViewBindingNotCreatedYet;", "Lmodern/payments/ecomAndroid/util/exception/EcomInternalException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewBindingNotCreatedYet extends IllegalStateException implements EcomInternalException {
        public static final ViewBindingNotCreatedYet INSTANCE = new ViewBindingNotCreatedYet();

        private ViewBindingNotCreatedYet() {
            super("Trying to access viewBinding outside of lifecycle");
        }
    }
}
