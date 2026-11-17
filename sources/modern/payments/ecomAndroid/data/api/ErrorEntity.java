package modern.payments.ecomAndroid.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB+\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "EcomSdkError", "EcomServiceApiError", "HttpError", "OrderServiceApiError", "SPayError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ErrorEntity {
    private final String description;
    private final String errorCode;
    private final String httpCode;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "NoPaymentMethodsAvailable", "Unknown", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError$NoPaymentMethodsAvailable;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError$Unknown;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EcomSdkError extends ErrorEntity {
        private final String description;
        private final String errorCode;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError$NoPaymentMethodsAvailable;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoPaymentMethodsAvailable extends EcomSdkError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public NoPaymentMethodsAvailable() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NoPaymentMethodsAvailable copy$default(NoPaymentMethodsAvailable noPaymentMethodsAvailable, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = noPaymentMethodsAvailable.description;
                }
                return noPaymentMethodsAvailable.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final NoPaymentMethodsAvailable copy(String description) {
                return new NoPaymentMethodsAvailable(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoPaymentMethodsAvailable) && zdlpuopuiu.eablkybsjg(this.description, ((NoPaymentMethodsAvailable) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomSdkError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NoPaymentMethodsAvailable(description=" + this.description + ')';
            }

            public /* synthetic */ NoPaymentMethodsAvailable(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NoPaymentMethodsAvailable(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError$Unknown;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomSdkError;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends EcomSdkError {
            private final String description;
            private final String errorCode;

            /* JADX WARN: Multi-variable type inference failed */
            public Unknown() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.errorCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = unknown.description;
                }
                return unknown.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Unknown copy(String errorCode, String description) {
                return new Unknown(errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return zdlpuopuiu.eablkybsjg(this.errorCode, unknown.errorCode) && zdlpuopuiu.eablkybsjg(this.description, unknown.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomSdkError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomSdkError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                String str = this.errorCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Unknown(errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ Unknown(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public Unknown(String str, String str2) {
                super(str, str2, null);
                this.errorCode = str;
                this.description = str2;
            }
        }

        public /* synthetic */ EcomSdkError(String str, String str2, gtknphoqwx gtknphoqwxVar) {
            this(str, str2);
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getDescription() {
            return this.description;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getErrorCode() {
            return this.errorCode;
        }

        public /* synthetic */ EcomSdkError(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, null);
        }

        private EcomSdkError(String str, String str2) {
            super(null, str, str2, 1, null);
            this.errorCode = str;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u001b\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "SuccessfulError", "Unknown", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError$SuccessfulError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError$Unknown;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EcomServiceApiError extends ErrorEntity {
        private final String description;
        private final String errorCode;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError$SuccessfulError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SuccessfulError extends EcomServiceApiError {
            private final String description;
            private final String errorCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessfulError(String errorCode, String description) {
                super(errorCode, description, null);
                zdlpuopuiu.btonecajqb(errorCode, "errorCode");
                zdlpuopuiu.btonecajqb(description, "description");
                this.errorCode = errorCode;
                this.description = description;
            }

            public static /* synthetic */ SuccessfulError copy$default(SuccessfulError successfulError, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = successfulError.errorCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = successfulError.description;
                }
                return successfulError.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final SuccessfulError copy(String errorCode, String description) {
                zdlpuopuiu.btonecajqb(errorCode, "errorCode");
                zdlpuopuiu.btonecajqb(description, "description");
                return new SuccessfulError(errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessfulError)) {
                    return false;
                }
                SuccessfulError successfulError = (SuccessfulError) other;
                return zdlpuopuiu.eablkybsjg(this.errorCode, successfulError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, successfulError.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                return (this.errorCode.hashCode() * 31) + this.description.hashCode();
            }

            public String toString() {
                return "SuccessfulError(errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError$Unknown;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$EcomServiceApiError;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends EcomServiceApiError {
            private final String description;
            private final String errorCode;

            /* JADX WARN: Multi-variable type inference failed */
            public Unknown() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.errorCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = unknown.description;
                }
                return unknown.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Unknown copy(String errorCode, String description) {
                return new Unknown(errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return zdlpuopuiu.eablkybsjg(this.errorCode, unknown.errorCode) && zdlpuopuiu.eablkybsjg(this.description, unknown.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.EcomServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                String str = this.errorCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Unknown(errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ Unknown(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public Unknown(String str, String str2) {
                super(str, str2, null);
                this.errorCode = str;
                this.description = str2;
            }
        }

        public /* synthetic */ EcomServiceApiError(String str, String str2, gtknphoqwx gtknphoqwxVar) {
            this(str, str2);
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getDescription() {
            return this.description;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getErrorCode() {
            return this.errorCode;
        }

        private EcomServiceApiError(String str, String str2) {
            super(null, str, str2, 1, null);
            this.errorCode = str;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B+\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "BadRequest", "NoInternet", "ServiceUnavailable", "Timeout", "Unknown", "UnknownApiResult", "WebError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$BadRequest;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$NoInternet;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$ServiceUnavailable;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$Timeout;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$Unknown;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$UnknownApiResult;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$WebError;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class HttpError extends ErrorEntity {
        private final String description;
        private final String errorCode;
        private final String httpCode;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$BadRequest;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "httpCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHttpCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BadRequest extends HttpError {
            private final String description;
            private final String httpCode;

            /* JADX WARN: Multi-variable type inference failed */
            public BadRequest() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ BadRequest copy$default(BadRequest badRequest, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = badRequest.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = badRequest.description;
                }
                return badRequest.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHttpCode() {
                return this.httpCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final BadRequest copy(String httpCode, String description) {
                return new BadRequest(httpCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BadRequest)) {
                    return false;
                }
                BadRequest badRequest = (BadRequest) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, badRequest.httpCode) && zdlpuopuiu.eablkybsjg(this.description, badRequest.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "BadRequest(httpCode=" + this.httpCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ BadRequest(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public BadRequest(String str, String str2) {
                super(str, null, str2, 2, null);
                this.httpCode = str;
                this.description = str2;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$NoInternet;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoInternet extends HttpError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public NoInternet() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NoInternet copy$default(NoInternet noInternet, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = noInternet.description;
                }
                return noInternet.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final NoInternet copy(String description) {
                return new NoInternet(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoInternet) && zdlpuopuiu.eablkybsjg(this.description, ((NoInternet) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NoInternet(description=" + this.description + ')';
            }

            public /* synthetic */ NoInternet(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public NoInternet(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$ServiceUnavailable;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServiceUnavailable extends HttpError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public ServiceUnavailable() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ ServiceUnavailable copy$default(ServiceUnavailable serviceUnavailable, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = serviceUnavailable.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = serviceUnavailable.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = serviceUnavailable.description;
                }
                return serviceUnavailable.copy(str, str2, str3);
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

            public final ServiceUnavailable copy(String httpCode, String errorCode, String description) {
                return new ServiceUnavailable(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServiceUnavailable)) {
                    return false;
                }
                ServiceUnavailable serviceUnavailable = (ServiceUnavailable) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, serviceUnavailable.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, serviceUnavailable.errorCode) && zdlpuopuiu.eablkybsjg(this.description, serviceUnavailable.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "ServiceUnavailable(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ ServiceUnavailable(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public ServiceUnavailable(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$Timeout;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Timeout extends HttpError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public Timeout() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Timeout copy$default(Timeout timeout, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = timeout.description;
                }
                return timeout.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Timeout copy(String description) {
                return new Timeout(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Timeout) && zdlpuopuiu.eablkybsjg(this.description, ((Timeout) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Timeout(description=" + this.description + ')';
            }

            public /* synthetic */ Timeout(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public Timeout(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$Unknown;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends HttpError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public Unknown() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = unknown.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = unknown.description;
                }
                return unknown.copy(str, str2, str3);
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

            public final Unknown copy(String httpCode, String errorCode, String description) {
                return new Unknown(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, unknown.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, unknown.errorCode) && zdlpuopuiu.eablkybsjg(this.description, unknown.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Unknown(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ Unknown(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public Unknown(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$UnknownApiResult;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "httpCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHttpCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UnknownApiResult extends HttpError {
            private final String description;
            private final String httpCode;

            /* JADX WARN: Multi-variable type inference failed */
            public UnknownApiResult() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ UnknownApiResult copy$default(UnknownApiResult unknownApiResult, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknownApiResult.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = unknownApiResult.description;
                }
                return unknownApiResult.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHttpCode() {
                return this.httpCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final UnknownApiResult copy(String httpCode, String description) {
                return new UnknownApiResult(httpCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnknownApiResult)) {
                    return false;
                }
                UnknownApiResult unknownApiResult = (UnknownApiResult) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, unknownApiResult.httpCode) && zdlpuopuiu.eablkybsjg(this.description, unknownApiResult.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "UnknownApiResult(httpCode=" + this.httpCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ UnknownApiResult(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public UnknownApiResult(String str, String str2) {
                super(str, null, str2, 2, null);
                this.httpCode = str;
                this.description = str2;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError$WebError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$HttpError;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WebError extends HttpError {
            private final String description;
            private final String errorCode;

            /* JADX WARN: Multi-variable type inference failed */
            public WebError() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ WebError copy$default(WebError webError, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = webError.errorCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = webError.description;
                }
                return webError.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final WebError copy(String errorCode, String description) {
                return new WebError(errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebError)) {
                    return false;
                }
                WebError webError = (WebError) other;
                return zdlpuopuiu.eablkybsjg(this.errorCode, webError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, webError.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.HttpError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                String str = this.errorCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "WebError(errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ WebError(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public WebError(String str, String str2) {
                super(null, str, str2, 1, null);
                this.errorCode = str;
                this.description = str2;
            }
        }

        public /* synthetic */ HttpError(String str, String str2, String str3, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3);
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getDescription() {
            return this.description;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getHttpCode() {
            return this.httpCode;
        }

        public /* synthetic */ HttpError(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, null);
        }

        private HttpError(String str, String str2, String str3) {
            super(str, str2, str3, null);
            this.httpCode = str;
            this.errorCode = str2;
            this.description = str3;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B+\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "AccessDenied", "OperationParamIncorrect", "OrderInProgress", "OrderLocked", "OrderNotFound", "OrderStatusIncorrect", "PaymentAttemptsExceeded", "PaymentTokenExpired", "PaymentUnsuccessfulDescription", "SystemError", "ValidationException", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$AccessDenied;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OperationParamIncorrect;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderInProgress;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderLocked;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderNotFound;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderStatusIncorrect;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentAttemptsExceeded;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentTokenExpired;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentUnsuccessfulDescription;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$SystemError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$ValidationException;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OrderServiceApiError extends ErrorEntity {
        private final String description;
        private final String errorCode;
        private final String httpCode;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$AccessDenied;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AccessDenied extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public AccessDenied() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ AccessDenied copy$default(AccessDenied accessDenied, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = accessDenied.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = accessDenied.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = accessDenied.description;
                }
                return accessDenied.copy(str, str2, str3);
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

            public final AccessDenied copy(String httpCode, String errorCode, String description) {
                return new AccessDenied(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccessDenied)) {
                    return false;
                }
                AccessDenied accessDenied = (AccessDenied) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, accessDenied.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, accessDenied.errorCode) && zdlpuopuiu.eablkybsjg(this.description, accessDenied.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "AccessDenied(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ AccessDenied(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public AccessDenied(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OperationParamIncorrect;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OperationParamIncorrect extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public OperationParamIncorrect() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ OperationParamIncorrect copy$default(OperationParamIncorrect operationParamIncorrect, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = operationParamIncorrect.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = operationParamIncorrect.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = operationParamIncorrect.description;
                }
                return operationParamIncorrect.copy(str, str2, str3);
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

            public final OperationParamIncorrect copy(String httpCode, String errorCode, String description) {
                return new OperationParamIncorrect(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OperationParamIncorrect)) {
                    return false;
                }
                OperationParamIncorrect operationParamIncorrect = (OperationParamIncorrect) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, operationParamIncorrect.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, operationParamIncorrect.errorCode) && zdlpuopuiu.eablkybsjg(this.description, operationParamIncorrect.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OperationParamIncorrect(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ OperationParamIncorrect(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public OperationParamIncorrect(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderInProgress;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OrderInProgress extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public OrderInProgress() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ OrderInProgress copy$default(OrderInProgress orderInProgress, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = orderInProgress.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = orderInProgress.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = orderInProgress.description;
                }
                return orderInProgress.copy(str, str2, str3);
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

            public final OrderInProgress copy(String httpCode, String errorCode, String description) {
                return new OrderInProgress(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderInProgress)) {
                    return false;
                }
                OrderInProgress orderInProgress = (OrderInProgress) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, orderInProgress.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, orderInProgress.errorCode) && zdlpuopuiu.eablkybsjg(this.description, orderInProgress.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OrderInProgress(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ OrderInProgress(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public OrderInProgress(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderLocked;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OrderLocked extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public OrderLocked() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ OrderLocked copy$default(OrderLocked orderLocked, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = orderLocked.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = orderLocked.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = orderLocked.description;
                }
                return orderLocked.copy(str, str2, str3);
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

            public final OrderLocked copy(String httpCode, String errorCode, String description) {
                return new OrderLocked(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderLocked)) {
                    return false;
                }
                OrderLocked orderLocked = (OrderLocked) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, orderLocked.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, orderLocked.errorCode) && zdlpuopuiu.eablkybsjg(this.description, orderLocked.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OrderLocked(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ OrderLocked(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public OrderLocked(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderNotFound;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OrderNotFound extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public OrderNotFound() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ OrderNotFound copy$default(OrderNotFound orderNotFound, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = orderNotFound.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = orderNotFound.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = orderNotFound.description;
                }
                return orderNotFound.copy(str, str2, str3);
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

            public final OrderNotFound copy(String httpCode, String errorCode, String description) {
                return new OrderNotFound(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderNotFound)) {
                    return false;
                }
                OrderNotFound orderNotFound = (OrderNotFound) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, orderNotFound.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, orderNotFound.errorCode) && zdlpuopuiu.eablkybsjg(this.description, orderNotFound.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OrderNotFound(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ OrderNotFound(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public OrderNotFound(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$OrderStatusIncorrect;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OrderStatusIncorrect extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public OrderStatusIncorrect() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ OrderStatusIncorrect copy$default(OrderStatusIncorrect orderStatusIncorrect, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = orderStatusIncorrect.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = orderStatusIncorrect.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = orderStatusIncorrect.description;
                }
                return orderStatusIncorrect.copy(str, str2, str3);
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

            public final OrderStatusIncorrect copy(String httpCode, String errorCode, String description) {
                return new OrderStatusIncorrect(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderStatusIncorrect)) {
                    return false;
                }
                OrderStatusIncorrect orderStatusIncorrect = (OrderStatusIncorrect) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, orderStatusIncorrect.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, orderStatusIncorrect.errorCode) && zdlpuopuiu.eablkybsjg(this.description, orderStatusIncorrect.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OrderStatusIncorrect(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ OrderStatusIncorrect(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public OrderStatusIncorrect(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentAttemptsExceeded;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentAttemptsExceeded extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public PaymentAttemptsExceeded() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ PaymentAttemptsExceeded copy$default(PaymentAttemptsExceeded paymentAttemptsExceeded, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = paymentAttemptsExceeded.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = paymentAttemptsExceeded.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = paymentAttemptsExceeded.description;
                }
                return paymentAttemptsExceeded.copy(str, str2, str3);
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

            public final PaymentAttemptsExceeded copy(String httpCode, String errorCode, String description) {
                return new PaymentAttemptsExceeded(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentAttemptsExceeded)) {
                    return false;
                }
                PaymentAttemptsExceeded paymentAttemptsExceeded = (PaymentAttemptsExceeded) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, paymentAttemptsExceeded.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, paymentAttemptsExceeded.errorCode) && zdlpuopuiu.eablkybsjg(this.description, paymentAttemptsExceeded.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "PaymentAttemptsExceeded(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ PaymentAttemptsExceeded(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public PaymentAttemptsExceeded(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentTokenExpired;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentTokenExpired extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public PaymentTokenExpired() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ PaymentTokenExpired copy$default(PaymentTokenExpired paymentTokenExpired, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = paymentTokenExpired.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = paymentTokenExpired.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = paymentTokenExpired.description;
                }
                return paymentTokenExpired.copy(str, str2, str3);
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

            public final PaymentTokenExpired copy(String httpCode, String errorCode, String description) {
                return new PaymentTokenExpired(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentTokenExpired)) {
                    return false;
                }
                PaymentTokenExpired paymentTokenExpired = (PaymentTokenExpired) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, paymentTokenExpired.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, paymentTokenExpired.errorCode) && zdlpuopuiu.eablkybsjg(this.description, paymentTokenExpired.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "PaymentTokenExpired(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ PaymentTokenExpired(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public PaymentTokenExpired(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$PaymentUnsuccessfulDescription;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentUnsuccessfulDescription extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public PaymentUnsuccessfulDescription() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ PaymentUnsuccessfulDescription copy$default(PaymentUnsuccessfulDescription paymentUnsuccessfulDescription, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = paymentUnsuccessfulDescription.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = paymentUnsuccessfulDescription.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = paymentUnsuccessfulDescription.description;
                }
                return paymentUnsuccessfulDescription.copy(str, str2, str3);
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

            public final PaymentUnsuccessfulDescription copy(String httpCode, String errorCode, String description) {
                return new PaymentUnsuccessfulDescription(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentUnsuccessfulDescription)) {
                    return false;
                }
                PaymentUnsuccessfulDescription paymentUnsuccessfulDescription = (PaymentUnsuccessfulDescription) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, paymentUnsuccessfulDescription.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, paymentUnsuccessfulDescription.errorCode) && zdlpuopuiu.eablkybsjg(this.description, paymentUnsuccessfulDescription.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "PaymentUnsuccessfulDescription(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ PaymentUnsuccessfulDescription(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public PaymentUnsuccessfulDescription(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$SystemError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SystemError extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public SystemError() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ SystemError copy$default(SystemError systemError, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = systemError.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = systemError.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = systemError.description;
                }
                return systemError.copy(str, str2, str3);
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

            public final SystemError copy(String httpCode, String errorCode, String description) {
                return new SystemError(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SystemError)) {
                    return false;
                }
                SystemError systemError = (SystemError) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, systemError.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, systemError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, systemError.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "SystemError(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ SystemError(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public SystemError(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError$ValidationException;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$OrderServiceApiError;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ValidationException extends OrderServiceApiError {
            private final String description;
            private final String errorCode;
            private final String httpCode;

            public ValidationException() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ ValidationException copy$default(ValidationException validationException, String str, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = validationException.httpCode;
                }
                if ((i13 & 2) != 0) {
                    str2 = validationException.errorCode;
                }
                if ((i13 & 4) != 0) {
                    str3 = validationException.description;
                }
                return validationException.copy(str, str2, str3);
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

            public final ValidationException copy(String httpCode, String errorCode, String description) {
                return new ValidationException(httpCode, errorCode, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidationException)) {
                    return false;
                }
                ValidationException validationException = (ValidationException) other;
                return zdlpuopuiu.eablkybsjg(this.httpCode, validationException.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, validationException.errorCode) && zdlpuopuiu.eablkybsjg(this.description, validationException.description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getErrorCode() {
                return this.errorCode;
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.OrderServiceApiError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getHttpCode() {
                return this.httpCode;
            }

            public int hashCode() {
                String str = this.httpCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorCode;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "ValidationException(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
            }

            public /* synthetic */ ValidationException(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
            }

            public ValidationException(String str, String str2, String str3) {
                super(null, null, null, 7, null);
                this.httpCode = str;
                this.errorCode = str2;
                this.description = str3;
            }
        }

        public /* synthetic */ OrderServiceApiError(String str, String str2, String str3, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3);
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getDescription() {
            return this.description;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getHttpCode() {
            return this.httpCode;
        }

        public /* synthetic */ OrderServiceApiError(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, null);
        }

        private OrderServiceApiError(String str, String str2, String str3) {
            super(null, null, null, 7, null);
            this.httpCode = str;
            this.errorCode = str2;
            this.description = str3;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB+\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getHttpCode", "ConfigIsEmpty", "NoInternet", "RequiredDataNotSent", "Timeout", "Unknown", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$ConfigIsEmpty;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$NoInternet;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$RequiredDataNotSent;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$Timeout;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$Unknown;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SPayError extends ErrorEntity {
        private final String description;
        private final String errorCode;
        private final String httpCode;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$ConfigIsEmpty;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConfigIsEmpty extends SPayError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public ConfigIsEmpty() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ConfigIsEmpty copy$default(ConfigIsEmpty configIsEmpty, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = configIsEmpty.description;
                }
                return configIsEmpty.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final ConfigIsEmpty copy(String description) {
                return new ConfigIsEmpty(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfigIsEmpty) && zdlpuopuiu.eablkybsjg(this.description, ((ConfigIsEmpty) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.SPayError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ConfigIsEmpty(description=" + this.description + ')';
            }

            public /* synthetic */ ConfigIsEmpty(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public ConfigIsEmpty(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$NoInternet;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoInternet extends SPayError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public NoInternet() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NoInternet copy$default(NoInternet noInternet, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = noInternet.description;
                }
                return noInternet.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final NoInternet copy(String description) {
                return new NoInternet(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoInternet) && zdlpuopuiu.eablkybsjg(this.description, ((NoInternet) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.SPayError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NoInternet(description=" + this.description + ')';
            }

            public /* synthetic */ NoInternet(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public NoInternet(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$RequiredDataNotSent;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RequiredDataNotSent extends SPayError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public RequiredDataNotSent() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ RequiredDataNotSent copy$default(RequiredDataNotSent requiredDataNotSent, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = requiredDataNotSent.description;
                }
                return requiredDataNotSent.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final RequiredDataNotSent copy(String description) {
                return new RequiredDataNotSent(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequiredDataNotSent) && zdlpuopuiu.eablkybsjg(this.description, ((RequiredDataNotSent) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.SPayError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "RequiredDataNotSent(description=" + this.description + ')';
            }

            public /* synthetic */ RequiredDataNotSent(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public RequiredDataNotSent(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$Timeout;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Timeout extends SPayError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public Timeout() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Timeout copy$default(Timeout timeout, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = timeout.description;
                }
                return timeout.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Timeout copy(String description) {
                return new Timeout(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Timeout) && zdlpuopuiu.eablkybsjg(this.description, ((Timeout) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.SPayError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Timeout(description=" + this.description + ')';
            }

            public /* synthetic */ Timeout(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public Timeout(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError$Unknown;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity$SPayError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends SPayError {
            private final String description;

            /* JADX WARN: Multi-variable type inference failed */
            public Unknown() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.description;
                }
                return unknown.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Unknown copy(String description) {
                return new Unknown(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && zdlpuopuiu.eablkybsjg(this.description, ((Unknown) other).description);
            }

            @Override // modern.payments.ecomAndroid.data.api.ErrorEntity.SPayError, modern.payments.ecomAndroid.data.api.ErrorEntity
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Unknown(description=" + this.description + ')';
            }

            public /* synthetic */ Unknown(String str, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str);
            }

            public Unknown(String str) {
                super(null, null, str, 3, null);
                this.description = str;
            }
        }

        public /* synthetic */ SPayError(String str, String str2, String str3, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3);
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getDescription() {
            return this.description;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // modern.payments.ecomAndroid.data.api.ErrorEntity
        public String getHttpCode() {
            return this.httpCode;
        }

        public /* synthetic */ SPayError(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, null);
        }

        private SPayError(String str, String str2, String str3) {
            super(null, null, null, 7, null);
            this.httpCode = str;
            this.errorCode = str2;
            this.description = str3;
        }
    }

    public /* synthetic */ ErrorEntity(String str, String str2, String str3, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3);
    }

    public String getDescription() {
        return this.description;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getHttpCode() {
        return this.httpCode;
    }

    private ErrorEntity(String str, String str2, String str3) {
        this.httpCode = str;
        this.errorCode = str2;
        this.description = str3;
    }

    public /* synthetic */ ErrorEntity(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, null);
    }
}
