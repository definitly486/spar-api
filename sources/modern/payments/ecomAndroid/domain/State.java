package modern.payments.ecomAndroid.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.util.holder.StringHolder;
import modern.payments.ecomAndroid.util.holder.StringHolderKt;
import modern.payments.p003ecomandroid.R;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State;", "", "AddNewCard", "Error", "Loading", "PaymentMethodScreen", "PaymentResult", "SPaySdk", "SbpPay", "ThreeDSMethodWebView", "ThreeDSWebViewChallenge", "Lmodern/payments/ecomAndroid/domain/State$AddNewCard;", "Lmodern/payments/ecomAndroid/domain/State$Error;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "Lmodern/payments/ecomAndroid/domain/State$PaymentMethodScreen;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult;", "Lmodern/payments/ecomAndroid/domain/State$SPaySdk;", "Lmodern/payments/ecomAndroid/domain/State$SbpPay;", "Lmodern/payments/ecomAndroid/domain/State$ThreeDSMethodWebView;", "Lmodern/payments/ecomAndroid/domain/State$ThreeDSWebViewChallenge;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface State {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$AddNewCard;", "Lmodern/payments/ecomAndroid/domain/State;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddNewCard implements State {
        public static final AddNewCard INSTANCE = new AddNewCard();

        private AddNewCard() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddNewCard);
        }

        public int hashCode() {
            return -1351789143;
        }

        public String toString() {
            return "AddNewCard";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error;", "Lmodern/payments/ecomAndroid/domain/State;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "DefaultException", "NoInternet", "PayWithSPayFail", "ServerUnavailable", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/State$Error$NoInternet;", "Lmodern/payments/ecomAndroid/domain/State$Error$PayWithSPayFail;", "Lmodern/payments/ecomAndroid/domain/State$Error$ServerUnavailable;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements State {
        private final ErrorEntity error;
        private final boolean isCritical;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/State$Error;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "UncaughtException", "WhileDeactivateBinding", "WhilePayment", "WhileSessionId", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$UncaughtException;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhileDeactivateBinding;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhilePayment;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhileSessionId;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class DefaultException extends Error {
            private final ErrorEntity error;
            private final boolean isCritical;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$UncaughtException;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class UncaughtException extends DefaultException {
                private final ErrorEntity error;
                private final boolean isCritical;

                public /* synthetic */ UncaughtException(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                    this(errorEntity, (i13 & 2) != 0 ? true : z13);
                }

                public static /* synthetic */ UncaughtException copy$default(UncaughtException uncaughtException, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        errorEntity = uncaughtException.error;
                    }
                    if ((i13 & 2) != 0) {
                        z13 = uncaughtException.isCritical;
                    }
                    return uncaughtException.copy(errorEntity, z13);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final ErrorEntity getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getIsCritical() {
                    return this.isCritical;
                }

                public final UncaughtException copy(ErrorEntity error, boolean isCritical) {
                    zdlpuopuiu.btonecajqb(error, "error");
                    return new UncaughtException(error, isCritical);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UncaughtException)) {
                        return false;
                    }
                    UncaughtException uncaughtException = (UncaughtException) other;
                    return zdlpuopuiu.eablkybsjg(this.error, uncaughtException.error) && this.isCritical == uncaughtException.isCritical;
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                public ErrorEntity getError() {
                    return this.error;
                }

                public int hashCode() {
                    return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                /* JADX INFO: renamed from: isCritical */
                public boolean getIsCritical() {
                    return this.isCritical;
                }

                public String toString() {
                    return "UncaughtException(error=" + this.error + ", isCritical=" + this.isCritical + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UncaughtException(ErrorEntity error, boolean z13) {
                    super(error, false, 2, null);
                    zdlpuopuiu.btonecajqb(error, "error");
                    this.error = error;
                    this.isCritical = z13;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhileDeactivateBinding;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class WhileDeactivateBinding extends DefaultException {
                private final ErrorEntity error;
                private final boolean isCritical;

                public /* synthetic */ WhileDeactivateBinding(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                    this(errorEntity, (i13 & 2) != 0 ? true : z13);
                }

                public static /* synthetic */ WhileDeactivateBinding copy$default(WhileDeactivateBinding whileDeactivateBinding, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        errorEntity = whileDeactivateBinding.error;
                    }
                    if ((i13 & 2) != 0) {
                        z13 = whileDeactivateBinding.isCritical;
                    }
                    return whileDeactivateBinding.copy(errorEntity, z13);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final ErrorEntity getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getIsCritical() {
                    return this.isCritical;
                }

                public final WhileDeactivateBinding copy(ErrorEntity error, boolean isCritical) {
                    zdlpuopuiu.btonecajqb(error, "error");
                    return new WhileDeactivateBinding(error, isCritical);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof WhileDeactivateBinding)) {
                        return false;
                    }
                    WhileDeactivateBinding whileDeactivateBinding = (WhileDeactivateBinding) other;
                    return zdlpuopuiu.eablkybsjg(this.error, whileDeactivateBinding.error) && this.isCritical == whileDeactivateBinding.isCritical;
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                public ErrorEntity getError() {
                    return this.error;
                }

                public int hashCode() {
                    return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                /* JADX INFO: renamed from: isCritical */
                public boolean getIsCritical() {
                    return this.isCritical;
                }

                public String toString() {
                    return "WhileDeactivateBinding(error=" + this.error + ", isCritical=" + this.isCritical + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WhileDeactivateBinding(ErrorEntity error, boolean z13) {
                    super(error, false, 2, null);
                    zdlpuopuiu.btonecajqb(error, "error");
                    this.error = error;
                    this.isCritical = z13;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhilePayment;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class WhilePayment extends DefaultException {
                private final ErrorEntity error;
                private final boolean isCritical;

                public /* synthetic */ WhilePayment(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                    this(errorEntity, (i13 & 2) != 0 ? true : z13);
                }

                public static /* synthetic */ WhilePayment copy$default(WhilePayment whilePayment, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        errorEntity = whilePayment.error;
                    }
                    if ((i13 & 2) != 0) {
                        z13 = whilePayment.isCritical;
                    }
                    return whilePayment.copy(errorEntity, z13);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final ErrorEntity getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getIsCritical() {
                    return this.isCritical;
                }

                public final WhilePayment copy(ErrorEntity error, boolean isCritical) {
                    zdlpuopuiu.btonecajqb(error, "error");
                    return new WhilePayment(error, isCritical);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof WhilePayment)) {
                        return false;
                    }
                    WhilePayment whilePayment = (WhilePayment) other;
                    return zdlpuopuiu.eablkybsjg(this.error, whilePayment.error) && this.isCritical == whilePayment.isCritical;
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                public ErrorEntity getError() {
                    return this.error;
                }

                public int hashCode() {
                    return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                /* JADX INFO: renamed from: isCritical */
                public boolean getIsCritical() {
                    return this.isCritical;
                }

                public String toString() {
                    return "WhilePayment(error=" + this.error + ", isCritical=" + this.isCritical + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WhilePayment(ErrorEntity error, boolean z13) {
                    super(error, false, 2, null);
                    zdlpuopuiu.btonecajqb(error, "error");
                    this.error = error;
                    this.isCritical = z13;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException$WhileSessionId;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class WhileSessionId extends DefaultException {
                private final ErrorEntity error;
                private final boolean isCritical;

                public /* synthetic */ WhileSessionId(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                    this(errorEntity, (i13 & 2) != 0 ? true : z13);
                }

                public static /* synthetic */ WhileSessionId copy$default(WhileSessionId whileSessionId, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        errorEntity = whileSessionId.error;
                    }
                    if ((i13 & 2) != 0) {
                        z13 = whileSessionId.isCritical;
                    }
                    return whileSessionId.copy(errorEntity, z13);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final ErrorEntity getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getIsCritical() {
                    return this.isCritical;
                }

                public final WhileSessionId copy(ErrorEntity error, boolean isCritical) {
                    zdlpuopuiu.btonecajqb(error, "error");
                    return new WhileSessionId(error, isCritical);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof WhileSessionId)) {
                        return false;
                    }
                    WhileSessionId whileSessionId = (WhileSessionId) other;
                    return zdlpuopuiu.eablkybsjg(this.error, whileSessionId.error) && this.isCritical == whileSessionId.isCritical;
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                public ErrorEntity getError() {
                    return this.error;
                }

                public int hashCode() {
                    return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
                }

                @Override // modern.payments.ecomAndroid.domain.State.Error.DefaultException, modern.payments.ecomAndroid.domain.State.Error
                /* JADX INFO: renamed from: isCritical */
                public boolean getIsCritical() {
                    return this.isCritical;
                }

                public String toString() {
                    return "WhileSessionId(error=" + this.error + ", isCritical=" + this.isCritical + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WhileSessionId(ErrorEntity error, boolean z13) {
                    super(error, false, 2, null);
                    zdlpuopuiu.btonecajqb(error, "error");
                    this.error = error;
                    this.isCritical = z13;
                }
            }

            public /* synthetic */ DefaultException(ErrorEntity errorEntity, boolean z13, gtknphoqwx gtknphoqwxVar) {
                this(errorEntity, z13);
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            public ErrorEntity getError() {
                return this.error;
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            /* JADX INFO: renamed from: isCritical, reason: from getter */
            public boolean getIsCritical() {
                return this.isCritical;
            }

            public /* synthetic */ DefaultException(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                this(errorEntity, (i13 & 2) != 0 ? true : z13, null);
            }

            private DefaultException(ErrorEntity errorEntity, boolean z13) {
                super(errorEntity, false, 2, null);
                this.error = errorEntity;
                this.isCritical = z13;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\b\u0002\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u0010R-\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$NoInternet;", "Lmodern/payments/ecomAndroid/domain/State$Error;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "error", "", "isCritical", "Lkotlin/Function1;", "Llg/gxszxtbevo;", "Lgg/wwaezpbzkn;", "", "caller", "<init>", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;ZLtg/draadjrbmk;)V", "component1", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "component2", "()Z", "component3", "()Ltg/draadjrbmk;", "copy", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;ZLtg/draadjrbmk;)Lmodern/payments/ecomAndroid/domain/State$Error$NoInternet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "getError", "Z", "Ltg/draadjrbmk;", "getCaller", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoInternet extends Error {
            private final draadjrbmk caller;
            private final ErrorEntity error;
            private final boolean isCritical;

            public /* synthetic */ NoInternet(ErrorEntity errorEntity, boolean z13, draadjrbmk draadjrbmkVar, int i13, gtknphoqwx gtknphoqwxVar) {
                this(errorEntity, (i13 & 2) != 0 ? true : z13, draadjrbmkVar);
            }

            public static /* synthetic */ NoInternet copy$default(NoInternet noInternet, ErrorEntity errorEntity, boolean z13, draadjrbmk draadjrbmkVar, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    errorEntity = noInternet.error;
                }
                if ((i13 & 2) != 0) {
                    z13 = noInternet.isCritical;
                }
                if ((i13 & 4) != 0) {
                    draadjrbmkVar = noInternet.caller;
                }
                return noInternet.copy(errorEntity, z13, draadjrbmkVar);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ErrorEntity getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getIsCritical() {
                return this.isCritical;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final draadjrbmk getCaller() {
                return this.caller;
            }

            public final NoInternet copy(ErrorEntity error, boolean isCritical, draadjrbmk caller) {
                zdlpuopuiu.btonecajqb(error, "error");
                zdlpuopuiu.btonecajqb(caller, "caller");
                return new NoInternet(error, isCritical, caller);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoInternet)) {
                    return false;
                }
                NoInternet noInternet = (NoInternet) other;
                return zdlpuopuiu.eablkybsjg(this.error, noInternet.error) && this.isCritical == noInternet.isCritical && zdlpuopuiu.eablkybsjg(this.caller, noInternet.caller);
            }

            public final draadjrbmk getCaller() {
                return this.caller;
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            public ErrorEntity getError() {
                return this.error;
            }

            public int hashCode() {
                return (((this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical)) * 31) + this.caller.hashCode();
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            /* JADX INFO: renamed from: isCritical */
            public boolean getIsCritical() {
                return this.isCritical;
            }

            public String toString() {
                return "NoInternet(error=" + this.error + ", isCritical=" + this.isCritical + ", caller=" + this.caller + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoInternet(ErrorEntity error, boolean z13, draadjrbmk caller) {
                super(error, false, 2, null);
                zdlpuopuiu.btonecajqb(error, "error");
                zdlpuopuiu.btonecajqb(caller, "caller");
                this.error = error;
                this.isCritical = z13;
                this.caller = caller;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$PayWithSPayFail;", "Lmodern/payments/ecomAndroid/domain/State$Error;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PayWithSPayFail extends Error {
            private final ErrorEntity error;
            private final boolean isCritical;

            public /* synthetic */ PayWithSPayFail(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                this(errorEntity, (i13 & 2) != 0 ? true : z13);
            }

            public static /* synthetic */ PayWithSPayFail copy$default(PayWithSPayFail payWithSPayFail, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    errorEntity = payWithSPayFail.error;
                }
                if ((i13 & 2) != 0) {
                    z13 = payWithSPayFail.isCritical;
                }
                return payWithSPayFail.copy(errorEntity, z13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ErrorEntity getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getIsCritical() {
                return this.isCritical;
            }

            public final PayWithSPayFail copy(ErrorEntity error, boolean isCritical) {
                zdlpuopuiu.btonecajqb(error, "error");
                return new PayWithSPayFail(error, isCritical);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PayWithSPayFail)) {
                    return false;
                }
                PayWithSPayFail payWithSPayFail = (PayWithSPayFail) other;
                return zdlpuopuiu.eablkybsjg(this.error, payWithSPayFail.error) && this.isCritical == payWithSPayFail.isCritical;
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            public ErrorEntity getError() {
                return this.error;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            /* JADX INFO: renamed from: isCritical */
            public boolean getIsCritical() {
                return this.isCritical;
            }

            public String toString() {
                return "PayWithSPayFail(error=" + this.error + ", isCritical=" + this.isCritical + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayWithSPayFail(ErrorEntity error, boolean z13) {
                super(error, false, 2, null);
                zdlpuopuiu.btonecajqb(error, "error");
                this.error = error;
                this.isCritical = z13;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Error$ServerUnavailable;", "Lmodern/payments/ecomAndroid/domain/State$Error;", "error", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "isCritical", "", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Z)V", "getError", "()Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServerUnavailable extends Error {
            private final ErrorEntity error;
            private final boolean isCritical;

            public /* synthetic */ ServerUnavailable(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
                this(errorEntity, (i13 & 2) != 0 ? true : z13);
            }

            public static /* synthetic */ ServerUnavailable copy$default(ServerUnavailable serverUnavailable, ErrorEntity errorEntity, boolean z13, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    errorEntity = serverUnavailable.error;
                }
                if ((i13 & 2) != 0) {
                    z13 = serverUnavailable.isCritical;
                }
                return serverUnavailable.copy(errorEntity, z13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ErrorEntity getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getIsCritical() {
                return this.isCritical;
            }

            public final ServerUnavailable copy(ErrorEntity error, boolean isCritical) {
                zdlpuopuiu.btonecajqb(error, "error");
                return new ServerUnavailable(error, isCritical);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerUnavailable)) {
                    return false;
                }
                ServerUnavailable serverUnavailable = (ServerUnavailable) other;
                return zdlpuopuiu.eablkybsjg(this.error, serverUnavailable.error) && this.isCritical == serverUnavailable.isCritical;
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            public ErrorEntity getError() {
                return this.error;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Boolean.hashCode(this.isCritical);
            }

            @Override // modern.payments.ecomAndroid.domain.State.Error
            /* JADX INFO: renamed from: isCritical */
            public boolean getIsCritical() {
                return this.isCritical;
            }

            public String toString() {
                return "ServerUnavailable(error=" + this.error + ", isCritical=" + this.isCritical + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServerUnavailable(ErrorEntity error, boolean z13) {
                super(error, false, 2, null);
                zdlpuopuiu.btonecajqb(error, "error");
                this.error = error;
                this.isCritical = z13;
            }
        }

        public /* synthetic */ Error(ErrorEntity errorEntity, boolean z13, gtknphoqwx gtknphoqwxVar) {
            this(errorEntity, z13);
        }

        public ErrorEntity getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: isCritical, reason: from getter */
        public boolean getIsCritical() {
            return this.isCritical;
        }

        private Error(ErrorEntity errorEntity, boolean z13) {
            this.error = errorEntity;
            this.isCritical = z13;
        }

        public /* synthetic */ Error(ErrorEntity errorEntity, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this(errorEntity, (i13 & 2) != 0 ? true : z13, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading;", "Lmodern/payments/ecomAndroid/domain/State;", "DeactivateBinding", "Finish3dsMethod", "FinishPayment", "Initial", "JustASecond", "PaymentOrder", "PaymentToken", "UpdateSessionId", "Lmodern/payments/ecomAndroid/domain/State$Loading$DeactivateBinding;", "Lmodern/payments/ecomAndroid/domain/State$Loading$Finish3dsMethod;", "Lmodern/payments/ecomAndroid/domain/State$Loading$FinishPayment;", "Lmodern/payments/ecomAndroid/domain/State$Loading$Initial;", "Lmodern/payments/ecomAndroid/domain/State$Loading$JustASecond;", "Lmodern/payments/ecomAndroid/domain/State$Loading$PaymentOrder;", "Lmodern/payments/ecomAndroid/domain/State$Loading$PaymentToken;", "Lmodern/payments/ecomAndroid/domain/State$Loading$UpdateSessionId;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Loading extends State {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$DeactivateBinding;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeactivateBinding implements Loading {
            private final String bindingId;

            public DeactivateBinding(String bindingId) {
                zdlpuopuiu.btonecajqb(bindingId, "bindingId");
                this.bindingId = bindingId;
            }

            public static /* synthetic */ DeactivateBinding copy$default(DeactivateBinding deactivateBinding, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = deactivateBinding.bindingId;
                }
                return deactivateBinding.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getBindingId() {
                return this.bindingId;
            }

            public final DeactivateBinding copy(String bindingId) {
                zdlpuopuiu.btonecajqb(bindingId, "bindingId");
                return new DeactivateBinding(bindingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeactivateBinding) && zdlpuopuiu.eablkybsjg(this.bindingId, ((DeactivateBinding) other).bindingId);
            }

            public final String getBindingId() {
                return this.bindingId;
            }

            public int hashCode() {
                return this.bindingId.hashCode();
            }

            public String toString() {
                return "DeactivateBinding(bindingId=" + this.bindingId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$Finish3dsMethod;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "transactionId", "", "hasRedirect", "", "(Ljava/lang/String;Z)V", "getHasRedirect", "()Z", "getTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Finish3dsMethod implements Loading {
            private final boolean hasRedirect;
            private final String transactionId;

            public Finish3dsMethod(String str, boolean z13) {
                this.transactionId = str;
                this.hasRedirect = z13;
            }

            public static /* synthetic */ Finish3dsMethod copy$default(Finish3dsMethod finish3dsMethod, String str, boolean z13, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = finish3dsMethod.transactionId;
                }
                if ((i13 & 2) != 0) {
                    z13 = finish3dsMethod.hasRedirect;
                }
                return finish3dsMethod.copy(str, z13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTransactionId() {
                return this.transactionId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getHasRedirect() {
                return this.hasRedirect;
            }

            public final Finish3dsMethod copy(String transactionId, boolean hasRedirect) {
                return new Finish3dsMethod(transactionId, hasRedirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Finish3dsMethod)) {
                    return false;
                }
                Finish3dsMethod finish3dsMethod = (Finish3dsMethod) other;
                return zdlpuopuiu.eablkybsjg(this.transactionId, finish3dsMethod.transactionId) && this.hasRedirect == finish3dsMethod.hasRedirect;
            }

            public final boolean getHasRedirect() {
                return this.hasRedirect;
            }

            public final String getTransactionId() {
                return this.transactionId;
            }

            public int hashCode() {
                String str = this.transactionId;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.hasRedirect);
            }

            public String toString() {
                return "Finish3dsMethod(transactionId=" + this.transactionId + ", hasRedirect=" + this.hasRedirect + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$FinishPayment;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "cRes", "", "paRes", "(Ljava/lang/String;Ljava/lang/String;)V", "getCRes", "()Ljava/lang/String;", "getPaRes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FinishPayment implements Loading {
            private final String cRes;
            private final String paRes;

            public FinishPayment(String str, String str2) {
                this.cRes = str;
                this.paRes = str2;
            }

            public static /* synthetic */ FinishPayment copy$default(FinishPayment finishPayment, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = finishPayment.cRes;
                }
                if ((i13 & 2) != 0) {
                    str2 = finishPayment.paRes;
                }
                return finishPayment.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCRes() {
                return this.cRes;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPaRes() {
                return this.paRes;
            }

            public final FinishPayment copy(String cRes, String paRes) {
                return new FinishPayment(cRes, paRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishPayment)) {
                    return false;
                }
                FinishPayment finishPayment = (FinishPayment) other;
                return zdlpuopuiu.eablkybsjg(this.cRes, finishPayment.cRes) && zdlpuopuiu.eablkybsjg(this.paRes, finishPayment.paRes);
            }

            public final String getCRes() {
                return this.cRes;
            }

            public final String getPaRes() {
                return this.paRes;
            }

            public int hashCode() {
                String str = this.cRes;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.paRes;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "FinishPayment(cRes=" + this.cRes + ", paRes=" + this.paRes + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$Initial;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Initial implements Loading {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Initial);
            }

            public int hashCode() {
                return 178492408;
            }

            public String toString() {
                return "Initial";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$JustASecond;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "text", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "(Lmodern/payments/ecomAndroid/util/holder/StringHolder;)V", "getText", "()Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class JustASecond implements Loading {
            private final StringHolder text;

            /* JADX WARN: Multi-variable type inference failed */
            public JustASecond() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ JustASecond copy$default(JustASecond justASecond, StringHolder stringHolder, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    stringHolder = justASecond.text;
                }
                return justASecond.copy(stringHolder);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final StringHolder getText() {
                return this.text;
            }

            public final JustASecond copy(StringHolder text) {
                return new JustASecond(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof JustASecond) && zdlpuopuiu.eablkybsjg(this.text, ((JustASecond) other).text);
            }

            public final StringHolder getText() {
                return this.text;
            }

            public int hashCode() {
                StringHolder stringHolder = this.text;
                if (stringHolder == null) {
                    return 0;
                }
                return stringHolder.hashCode();
            }

            public String toString() {
                return "JustASecond(text=" + this.text + ')';
            }

            public JustASecond(StringHolder stringHolder) {
                this.text = stringHolder;
            }

            public /* synthetic */ JustASecond(StringHolder stringHolder, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? StringHolderKt.StringHolder(R.string.ecom_wait_a_second) : stringHolder);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$PaymentOrder;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "paymentTokenResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;)V", "getPaymentTokenResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentOrder implements Loading {
            private final PaymentTokenResponseBody paymentTokenResponseBody;

            public PaymentOrder(PaymentTokenResponseBody paymentTokenResponseBody) {
                zdlpuopuiu.btonecajqb(paymentTokenResponseBody, "paymentTokenResponseBody");
                this.paymentTokenResponseBody = paymentTokenResponseBody;
            }

            public static /* synthetic */ PaymentOrder copy$default(PaymentOrder paymentOrder, PaymentTokenResponseBody paymentTokenResponseBody, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    paymentTokenResponseBody = paymentOrder.paymentTokenResponseBody;
                }
                return paymentOrder.copy(paymentTokenResponseBody);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PaymentTokenResponseBody getPaymentTokenResponseBody() {
                return this.paymentTokenResponseBody;
            }

            public final PaymentOrder copy(PaymentTokenResponseBody paymentTokenResponseBody) {
                zdlpuopuiu.btonecajqb(paymentTokenResponseBody, "paymentTokenResponseBody");
                return new PaymentOrder(paymentTokenResponseBody);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentOrder) && zdlpuopuiu.eablkybsjg(this.paymentTokenResponseBody, ((PaymentOrder) other).paymentTokenResponseBody);
            }

            public final PaymentTokenResponseBody getPaymentTokenResponseBody() {
                return this.paymentTokenResponseBody;
            }

            public int hashCode() {
                return this.paymentTokenResponseBody.hashCode();
            }

            public String toString() {
                return "PaymentOrder(paymentTokenResponseBody=" + this.paymentTokenResponseBody + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$PaymentToken;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentToken implements Loading {
            private final String bindingId;

            public PaymentToken(String str) {
                this.bindingId = str;
            }

            public static /* synthetic */ PaymentToken copy$default(PaymentToken paymentToken, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = paymentToken.bindingId;
                }
                return paymentToken.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getBindingId() {
                return this.bindingId;
            }

            public final PaymentToken copy(String bindingId) {
                return new PaymentToken(bindingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentToken) && zdlpuopuiu.eablkybsjg(this.bindingId, ((PaymentToken) other).bindingId);
            }

            public final String getBindingId() {
                return this.bindingId;
            }

            public int hashCode() {
                String str = this.bindingId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "PaymentToken(bindingId=" + this.bindingId + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$Loading$UpdateSessionId;", "Lmodern/payments/ecomAndroid/domain/State$Loading;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateSessionId implements Loading {
            public static final UpdateSessionId INSTANCE = new UpdateSessionId();

            private UpdateSessionId() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UpdateSessionId);
            }

            public int hashCode() {
                return -1430699972;
            }

            public String toString() {
                return "UpdateSessionId";
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$PaymentMethodScreen;", "Lmodern/payments/ecomAndroid/domain/State;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentMethodScreen implements State {
        public static final PaymentMethodScreen INSTANCE = new PaymentMethodScreen();

        private PaymentMethodScreen() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PaymentMethodScreen);
        }

        public int hashCode() {
            return 86489689;
        }

        public String toString() {
            return "PaymentMethodScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$PaymentResult;", "Lmodern/payments/ecomAndroid/domain/State;", "()V", "Failure", "Success", "Waiting", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Failure;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Success;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Waiting;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PaymentResult implements State {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Failure;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult;", "paymentOrderResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;)V", "getPaymentOrderResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failure extends PaymentResult {
            private final PaymentOrderResponseBody paymentOrderResponseBody;

            /* JADX WARN: Multi-variable type inference failed */
            public Failure() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Failure copy$default(Failure failure, PaymentOrderResponseBody paymentOrderResponseBody, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    paymentOrderResponseBody = failure.paymentOrderResponseBody;
                }
                return failure.copy(paymentOrderResponseBody);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
                return this.paymentOrderResponseBody;
            }

            public final Failure copy(PaymentOrderResponseBody paymentOrderResponseBody) {
                return new Failure(paymentOrderResponseBody);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && zdlpuopuiu.eablkybsjg(this.paymentOrderResponseBody, ((Failure) other).paymentOrderResponseBody);
            }

            public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
                return this.paymentOrderResponseBody;
            }

            public int hashCode() {
                PaymentOrderResponseBody paymentOrderResponseBody = this.paymentOrderResponseBody;
                if (paymentOrderResponseBody == null) {
                    return 0;
                }
                return paymentOrderResponseBody.hashCode();
            }

            public String toString() {
                return "Failure(paymentOrderResponseBody=" + this.paymentOrderResponseBody + ')';
            }

            public /* synthetic */ Failure(PaymentOrderResponseBody paymentOrderResponseBody, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : paymentOrderResponseBody);
            }

            public Failure(PaymentOrderResponseBody paymentOrderResponseBody) {
                super(null);
                this.paymentOrderResponseBody = paymentOrderResponseBody;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Success;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult;", "paymentOrderResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;)V", "getPaymentOrderResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends PaymentResult {
            private final PaymentOrderResponseBody paymentOrderResponseBody;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Success copy$default(Success success, PaymentOrderResponseBody paymentOrderResponseBody, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    paymentOrderResponseBody = success.paymentOrderResponseBody;
                }
                return success.copy(paymentOrderResponseBody);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
                return this.paymentOrderResponseBody;
            }

            public final Success copy(PaymentOrderResponseBody paymentOrderResponseBody) {
                return new Success(paymentOrderResponseBody);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && zdlpuopuiu.eablkybsjg(this.paymentOrderResponseBody, ((Success) other).paymentOrderResponseBody);
            }

            public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
                return this.paymentOrderResponseBody;
            }

            public int hashCode() {
                PaymentOrderResponseBody paymentOrderResponseBody = this.paymentOrderResponseBody;
                if (paymentOrderResponseBody == null) {
                    return 0;
                }
                return paymentOrderResponseBody.hashCode();
            }

            public String toString() {
                return "Success(paymentOrderResponseBody=" + this.paymentOrderResponseBody + ')';
            }

            public Success(PaymentOrderResponseBody paymentOrderResponseBody) {
                super(null);
                this.paymentOrderResponseBody = paymentOrderResponseBody;
            }

            public /* synthetic */ Success(PaymentOrderResponseBody paymentOrderResponseBody, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : paymentOrderResponseBody);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$PaymentResult$Waiting;", "Lmodern/payments/ecomAndroid/domain/State$PaymentResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Waiting extends PaymentResult {
            public static final Waiting INSTANCE = new Waiting();

            private Waiting() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Waiting);
            }

            public int hashCode() {
                return 397674504;
            }

            public String toString() {
                return "Waiting";
            }
        }

        public /* synthetic */ PaymentResult(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private PaymentResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$SPaySdk;", "Lmodern/payments/ecomAndroid/domain/State;", "FinishPayment", "StartPayment", "Lmodern/payments/ecomAndroid/domain/State$SPaySdk$FinishPayment;", "Lmodern/payments/ecomAndroid/domain/State$SPaySdk$StartPayment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SPaySdk extends State {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$SPaySdk$FinishPayment;", "Lmodern/payments/ecomAndroid/domain/State$SPaySdk;", "sPayPaymentResult", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "(Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;)V", "getSPayPaymentResult", "()Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FinishPayment implements SPaySdk {
            private final SPayPaymentResult sPayPaymentResult;

            public FinishPayment(SPayPaymentResult sPayPaymentResult) {
                zdlpuopuiu.btonecajqb(sPayPaymentResult, "sPayPaymentResult");
                this.sPayPaymentResult = sPayPaymentResult;
            }

            public static /* synthetic */ FinishPayment copy$default(FinishPayment finishPayment, SPayPaymentResult sPayPaymentResult, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    sPayPaymentResult = finishPayment.sPayPaymentResult;
                }
                return finishPayment.copy(sPayPaymentResult);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SPayPaymentResult getSPayPaymentResult() {
                return this.sPayPaymentResult;
            }

            public final FinishPayment copy(SPayPaymentResult sPayPaymentResult) {
                zdlpuopuiu.btonecajqb(sPayPaymentResult, "sPayPaymentResult");
                return new FinishPayment(sPayPaymentResult);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishPayment) && zdlpuopuiu.eablkybsjg(this.sPayPaymentResult, ((FinishPayment) other).sPayPaymentResult);
            }

            public final SPayPaymentResult getSPayPaymentResult() {
                return this.sPayPaymentResult;
            }

            public int hashCode() {
                return this.sPayPaymentResult.hashCode();
            }

            public String toString() {
                return "FinishPayment(sPayPaymentResult=" + this.sPayPaymentResult + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$SPaySdk$StartPayment;", "Lmodern/payments/ecomAndroid/domain/State$SPaySdk;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartPayment implements SPaySdk {
            public static final StartPayment INSTANCE = new StartPayment();

            private StartPayment() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof StartPayment);
            }

            public int hashCode() {
                return 937062951;
            }

            public String toString() {
                return "StartPayment";
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$SbpPay;", "Lmodern/payments/ecomAndroid/domain/State;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbpPay implements State {
        public static final SbpPay INSTANCE = new SbpPay();

        private SbpPay() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpPay);
        }

        public int hashCode() {
            return -1509027167;
        }

        public String toString() {
            return "SbpPay";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$ThreeDSMethodWebView;", "Lmodern/payments/ecomAndroid/domain/State;", "paymentOrderResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;)V", "getPaymentOrderResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ThreeDSMethodWebView implements State {
        private final PaymentOrderResponseBody paymentOrderResponseBody;

        public ThreeDSMethodWebView(PaymentOrderResponseBody paymentOrderResponseBody) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            this.paymentOrderResponseBody = paymentOrderResponseBody;
        }

        public static /* synthetic */ ThreeDSMethodWebView copy$default(ThreeDSMethodWebView threeDSMethodWebView, PaymentOrderResponseBody paymentOrderResponseBody, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                paymentOrderResponseBody = threeDSMethodWebView.paymentOrderResponseBody;
            }
            return threeDSMethodWebView.copy(paymentOrderResponseBody);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        public final ThreeDSMethodWebView copy(PaymentOrderResponseBody paymentOrderResponseBody) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            return new ThreeDSMethodWebView(paymentOrderResponseBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreeDSMethodWebView) && zdlpuopuiu.eablkybsjg(this.paymentOrderResponseBody, ((ThreeDSMethodWebView) other).paymentOrderResponseBody);
        }

        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        public int hashCode() {
            return this.paymentOrderResponseBody.hashCode();
        }

        public String toString() {
            return "ThreeDSMethodWebView(paymentOrderResponseBody=" + this.paymentOrderResponseBody + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/domain/State$ThreeDSWebViewChallenge;", "Lmodern/payments/ecomAndroid/domain/State;", "paymentOrderResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;)V", "getPaymentOrderResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ThreeDSWebViewChallenge implements State {
        private final PaymentOrderResponseBody paymentOrderResponseBody;

        public ThreeDSWebViewChallenge(PaymentOrderResponseBody paymentOrderResponseBody) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            this.paymentOrderResponseBody = paymentOrderResponseBody;
        }

        public static /* synthetic */ ThreeDSWebViewChallenge copy$default(ThreeDSWebViewChallenge threeDSWebViewChallenge, PaymentOrderResponseBody paymentOrderResponseBody, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                paymentOrderResponseBody = threeDSWebViewChallenge.paymentOrderResponseBody;
            }
            return threeDSWebViewChallenge.copy(paymentOrderResponseBody);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        public final ThreeDSWebViewChallenge copy(PaymentOrderResponseBody paymentOrderResponseBody) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            return new ThreeDSWebViewChallenge(paymentOrderResponseBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreeDSWebViewChallenge) && zdlpuopuiu.eablkybsjg(this.paymentOrderResponseBody, ((ThreeDSWebViewChallenge) other).paymentOrderResponseBody);
        }

        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        public int hashCode() {
            return this.paymentOrderResponseBody.hashCode();
        }

        public String toString() {
            return "ThreeDSWebViewChallenge(paymentOrderResponseBody=" + this.paymentOrderResponseBody + ')';
        }
    }
}
