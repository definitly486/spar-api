package spay.sdk.domain.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0012\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity;", "", "()V", "AccessDenied", "ApiError", "BadRequest", "CanceledByUser", "DoubleOtpCall", "NoBnplResponse", "NoInternet", "NotEnoughMoneyForBnplFirstPayment", "NotEnoughMoneyForPayment", "NotFound", "PayBnplPartsFail", "RequiredBodyEmpty", "RequiredFieldEmpty", "ServiceUnavailable", "TimeOut", "Unauthorized", "Unknown", "UnknownApiResult", "Lspay/sdk/domain/model/response/ErrorEntity$AccessDenied;", "Lspay/sdk/domain/model/response/ErrorEntity$ApiError;", "Lspay/sdk/domain/model/response/ErrorEntity$BadRequest;", "Lspay/sdk/domain/model/response/ErrorEntity$CanceledByUser;", "Lspay/sdk/domain/model/response/ErrorEntity$DoubleOtpCall;", "Lspay/sdk/domain/model/response/ErrorEntity$NoBnplResponse;", "Lspay/sdk/domain/model/response/ErrorEntity$NoInternet;", "Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForBnplFirstPayment;", "Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForPayment;", "Lspay/sdk/domain/model/response/ErrorEntity$NotFound;", "Lspay/sdk/domain/model/response/ErrorEntity$PayBnplPartsFail;", "Lspay/sdk/domain/model/response/ErrorEntity$RequiredBodyEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity$RequiredFieldEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity$ServiceUnavailable;", "Lspay/sdk/domain/model/response/ErrorEntity$TimeOut;", "Lspay/sdk/domain/model/response/ErrorEntity$Unauthorized;", "Lspay/sdk/domain/model/response/ErrorEntity$Unknown;", "Lspay/sdk/domain/model/response/ErrorEntity$UnknownApiResult;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ErrorEntity {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$AccessDenied;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AccessDenied extends ErrorEntity {
        public static final AccessDenied INSTANCE = new AccessDenied();

        private AccessDenied() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$ApiError;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ApiError extends ErrorEntity {
        private final String description;
        private final String errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiError(String errorCode, String description) {
            super(null);
            zdlpuopuiu.btonecajqb(errorCode, "errorCode");
            zdlpuopuiu.btonecajqb(description, "description");
            this.errorCode = errorCode;
            this.description = description;
        }

        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = apiError.errorCode;
            }
            if ((i13 & 2) != 0) {
                str2 = apiError.description;
            }
            return apiError.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final ApiError copy(String errorCode, String description) {
            zdlpuopuiu.btonecajqb(errorCode, "errorCode");
            zdlpuopuiu.btonecajqb(description, "description");
            return new ApiError(errorCode, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiError)) {
                return false;
            }
            ApiError apiError = (ApiError) other;
            return zdlpuopuiu.eablkybsjg(this.errorCode, apiError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, apiError.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.errorCode.hashCode() * 31);
        }

        public String toString() {
            return "ApiError(errorCode=" + this.errorCode + ", description=" + this.description + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$BadRequest;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "fraudMonCheckResult", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getFraudMonCheckResult", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BadRequest extends ErrorEntity {
        private final String description;
        private final String errorCode;
        private final FraudMonCheckResult fraudMonCheckResult;

        public BadRequest() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ BadRequest copy$default(BadRequest badRequest, String str, String str2, FraudMonCheckResult fraudMonCheckResult, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = badRequest.errorCode;
            }
            if ((i13 & 2) != 0) {
                str2 = badRequest.description;
            }
            if ((i13 & 4) != 0) {
                fraudMonCheckResult = badRequest.fraudMonCheckResult;
            }
            return badRequest.copy(str, str2, fraudMonCheckResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final FraudMonCheckResult getFraudMonCheckResult() {
            return this.fraudMonCheckResult;
        }

        public final BadRequest copy(String errorCode, String description, FraudMonCheckResult fraudMonCheckResult) {
            return new BadRequest(errorCode, description, fraudMonCheckResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadRequest)) {
                return false;
            }
            BadRequest badRequest = (BadRequest) other;
            return zdlpuopuiu.eablkybsjg(this.errorCode, badRequest.errorCode) && zdlpuopuiu.eablkybsjg(this.description, badRequest.description) && zdlpuopuiu.eablkybsjg(this.fraudMonCheckResult, badRequest.fraudMonCheckResult);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final FraudMonCheckResult getFraudMonCheckResult() {
            return this.fraudMonCheckResult;
        }

        public int hashCode() {
            String str = this.errorCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
            return iHashCode2 + (fraudMonCheckResult != null ? fraudMonCheckResult.hashCode() : 0);
        }

        public String toString() {
            return "BadRequest(errorCode=" + this.errorCode + ", description=" + this.description + ", fraudMonCheckResult=" + this.fraudMonCheckResult + ")";
        }

        public /* synthetic */ BadRequest(String str, String str2, FraudMonCheckResult fraudMonCheckResult, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : fraudMonCheckResult);
        }

        public BadRequest(String str, String str2, FraudMonCheckResult fraudMonCheckResult) {
            super(null);
            this.errorCode = str;
            this.description = str2;
            this.fraudMonCheckResult = fraudMonCheckResult;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$CanceledByUser;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByUser extends ErrorEntity {
        public static final CanceledByUser INSTANCE = new CanceledByUser();

        private CanceledByUser() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$DoubleOtpCall;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DoubleOtpCall extends ErrorEntity {
        public static final DoubleOtpCall INSTANCE = new DoubleOtpCall();

        private DoubleOtpCall() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NoBnplResponse;", "Lspay/sdk/domain/model/response/ErrorEntity;", "errorCode", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NoBnplResponse extends ErrorEntity {
        private final String description;
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public NoBnplResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoBnplResponse copy$default(NoBnplResponse noBnplResponse, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = noBnplResponse.errorCode;
            }
            if ((i13 & 2) != 0) {
                str2 = noBnplResponse.description;
            }
            return noBnplResponse.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final NoBnplResponse copy(String errorCode, String description) {
            return new NoBnplResponse(errorCode, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBnplResponse)) {
                return false;
            }
            NoBnplResponse noBnplResponse = (NoBnplResponse) other;
            return zdlpuopuiu.eablkybsjg(this.errorCode, noBnplResponse.errorCode) && zdlpuopuiu.eablkybsjg(this.description, noBnplResponse.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            String str = this.errorCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "NoBnplResponse(errorCode=" + this.errorCode + ", description=" + this.description + ")";
        }

        public /* synthetic */ NoBnplResponse(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }

        public NoBnplResponse(String str, String str2) {
            super(null);
            this.errorCode = str;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NoInternet;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoInternet extends ErrorEntity {
        public static final NoInternet INSTANCE = new NoInternet();

        private NoInternet() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForBnplFirstPayment;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotEnoughMoneyForBnplFirstPayment extends ErrorEntity {
        public static final NotEnoughMoneyForBnplFirstPayment INSTANCE = new NotEnoughMoneyForBnplFirstPayment();

        private NotEnoughMoneyForBnplFirstPayment() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotEnoughMoneyForPayment;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotEnoughMoneyForPayment extends ErrorEntity {
        public static final NotEnoughMoneyForPayment INSTANCE = new NotEnoughMoneyForPayment();

        private NotEnoughMoneyForPayment() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$NotFound;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends ErrorEntity {
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$PayBnplPartsFail;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayBnplPartsFail extends ErrorEntity {
        public static final PayBnplPartsFail INSTANCE = new PayBnplPartsFail();

        private PayBnplPartsFail() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$RequiredBodyEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity;", "endPoint", "", "(Ljava/lang/String;)V", "getEndPoint", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredBodyEmpty extends ErrorEntity {
        private final String endPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredBodyEmpty(String endPoint) {
            super(null);
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.endPoint = endPoint;
        }

        public static /* synthetic */ RequiredBodyEmpty copy$default(RequiredBodyEmpty requiredBodyEmpty, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = requiredBodyEmpty.endPoint;
            }
            return requiredBodyEmpty.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEndPoint() {
            return this.endPoint;
        }

        public final RequiredBodyEmpty copy(String endPoint) {
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            return new RequiredBodyEmpty(endPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredBodyEmpty) && zdlpuopuiu.eablkybsjg(this.endPoint, ((RequiredBodyEmpty) other).endPoint);
        }

        public final String getEndPoint() {
            return this.endPoint;
        }

        public int hashCode() {
            return this.endPoint.hashCode();
        }

        public String toString() {
            return "RequiredBodyEmpty(endPoint=" + this.endPoint + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$RequiredFieldEmpty;", "Lspay/sdk/domain/model/response/ErrorEntity;", "field", "", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredFieldEmpty extends ErrorEntity {
        private final String field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldEmpty(String field) {
            super(null);
            zdlpuopuiu.btonecajqb(field, "field");
            this.field = field;
        }

        public static /* synthetic */ RequiredFieldEmpty copy$default(RequiredFieldEmpty requiredFieldEmpty, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = requiredFieldEmpty.field;
            }
            return requiredFieldEmpty.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getField() {
            return this.field;
        }

        public final RequiredFieldEmpty copy(String field) {
            zdlpuopuiu.btonecajqb(field, "field");
            return new RequiredFieldEmpty(field);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredFieldEmpty) && zdlpuopuiu.eablkybsjg(this.field, ((RequiredFieldEmpty) other).field);
        }

        public final String getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        public String toString() {
            return "RequiredFieldEmpty(field=" + this.field + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$ServiceUnavailable;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceUnavailable extends ErrorEntity {
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$TimeOut;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeOut extends ErrorEntity {
        public static final TimeOut INSTANCE = new TimeOut();

        private TimeOut() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$Unauthorized;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unauthorized extends ErrorEntity {
        public static final Unauthorized INSTANCE = new Unauthorized();

        private Unauthorized() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$Unknown;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends ErrorEntity {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/response/ErrorEntity$UnknownApiResult;", "Lspay/sdk/domain/model/response/ErrorEntity;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownApiResult extends ErrorEntity {
        public static final UnknownApiResult INSTANCE = new UnknownApiResult();

        private UnknownApiResult() {
            super(null);
        }
    }

    public /* synthetic */ ErrorEntity(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ErrorEntity() {
    }
}
