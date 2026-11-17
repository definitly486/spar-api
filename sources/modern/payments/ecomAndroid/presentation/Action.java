package modern.payments.ecomAndroid.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.model.response.FinishMethodResponseBody;
import modern.payments.ecomAndroid.domain.model.response.FinishPaymentResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action;", "", "Handle3dsMethodRedirect", "Handle3dsMethodResult", "HandleAddNewCard", "HandleBackToPaymentMode", "HandleCloseAction", "HandleDeactivateBinding", "HandleException", "HandleFinishChallenge", "HandleInit", "HandlePaymentOrder", "HandlePaymentResult", "HandlePaymentToken", "HandleSPaySdkResult", "HandleSbpPay", "HandleSessionId", "HandleStartPayment", "HandleSuccessBindingDeactivation", "Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodRedirect;", "Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodResult;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleAddNewCard;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleBackToPaymentMode;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleCloseAction;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleDeactivateBinding;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleException;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleFinishChallenge;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleInit;", "Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentOrder;", "Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentResult;", "Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentToken;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleSPaySdkResult;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleSbpPay;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleSessionId;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleSuccessBindingDeactivation;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Action {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodRedirect;", "Lmodern/payments/ecomAndroid/presentation/Action;", "hasRedirect", "", "transactionId", "", "(ZLjava/lang/String;)V", "getHasRedirect", "()Z", "getTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Handle3dsMethodRedirect implements Action {
        private final boolean hasRedirect;
        private final String transactionId;

        public Handle3dsMethodRedirect(boolean z13, String transactionId) {
            zdlpuopuiu.btonecajqb(transactionId, "transactionId");
            this.hasRedirect = z13;
            this.transactionId = transactionId;
        }

        public static /* synthetic */ Handle3dsMethodRedirect copy$default(Handle3dsMethodRedirect handle3dsMethodRedirect, boolean z13, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = handle3dsMethodRedirect.hasRedirect;
            }
            if ((i13 & 2) != 0) {
                str = handle3dsMethodRedirect.transactionId;
            }
            return handle3dsMethodRedirect.copy(z13, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasRedirect() {
            return this.hasRedirect;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        public final Handle3dsMethodRedirect copy(boolean hasRedirect, String transactionId) {
            zdlpuopuiu.btonecajqb(transactionId, "transactionId");
            return new Handle3dsMethodRedirect(hasRedirect, transactionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Handle3dsMethodRedirect)) {
                return false;
            }
            Handle3dsMethodRedirect handle3dsMethodRedirect = (Handle3dsMethodRedirect) other;
            return this.hasRedirect == handle3dsMethodRedirect.hasRedirect && zdlpuopuiu.eablkybsjg(this.transactionId, handle3dsMethodRedirect.transactionId);
        }

        public final boolean getHasRedirect() {
            return this.hasRedirect;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasRedirect) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "Handle3dsMethodRedirect(hasRedirect=" + this.hasRedirect + ", transactionId=" + this.transactionId + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$Handle3dsMethodResult;", "Lmodern/payments/ecomAndroid/presentation/Action;", "finish3dsMethodResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;)V", "getFinish3dsMethodResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/FinishMethodResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Handle3dsMethodResult implements Action {
        private final FinishMethodResponseBody finish3dsMethodResponseBody;

        public Handle3dsMethodResult(FinishMethodResponseBody finish3dsMethodResponseBody) {
            zdlpuopuiu.btonecajqb(finish3dsMethodResponseBody, "finish3dsMethodResponseBody");
            this.finish3dsMethodResponseBody = finish3dsMethodResponseBody;
        }

        public static /* synthetic */ Handle3dsMethodResult copy$default(Handle3dsMethodResult handle3dsMethodResult, FinishMethodResponseBody finishMethodResponseBody, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                finishMethodResponseBody = handle3dsMethodResult.finish3dsMethodResponseBody;
            }
            return handle3dsMethodResult.copy(finishMethodResponseBody);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FinishMethodResponseBody getFinish3dsMethodResponseBody() {
            return this.finish3dsMethodResponseBody;
        }

        public final Handle3dsMethodResult copy(FinishMethodResponseBody finish3dsMethodResponseBody) {
            zdlpuopuiu.btonecajqb(finish3dsMethodResponseBody, "finish3dsMethodResponseBody");
            return new Handle3dsMethodResult(finish3dsMethodResponseBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Handle3dsMethodResult) && zdlpuopuiu.eablkybsjg(this.finish3dsMethodResponseBody, ((Handle3dsMethodResult) other).finish3dsMethodResponseBody);
        }

        public final FinishMethodResponseBody getFinish3dsMethodResponseBody() {
            return this.finish3dsMethodResponseBody;
        }

        public int hashCode() {
            return this.finish3dsMethodResponseBody.hashCode();
        }

        public String toString() {
            return "Handle3dsMethodResult(finish3dsMethodResponseBody=" + this.finish3dsMethodResponseBody + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleAddNewCard;", "Lmodern/payments/ecomAndroid/presentation/Action;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleAddNewCard implements Action {
        public static final HandleAddNewCard INSTANCE = new HandleAddNewCard();

        private HandleAddNewCard() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HandleAddNewCard);
        }

        public int hashCode() {
            return 502776552;
        }

        public String toString() {
            return "HandleAddNewCard";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleBackToPaymentMode;", "Lmodern/payments/ecomAndroid/presentation/Action;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBackToPaymentMode implements Action {
        public static final HandleBackToPaymentMode INSTANCE = new HandleBackToPaymentMode();

        private HandleBackToPaymentMode() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HandleBackToPaymentMode);
        }

        public int hashCode() {
            return 262879630;
        }

        public String toString() {
            return "HandleBackToPaymentMode";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleCloseAction;", "Lmodern/payments/ecomAndroid/presentation/Action;", "Lpj/cllcsxoeiz;", "scope", "<init>", "(Lpj/cllcsxoeiz;)V", "component1", "()Lpj/cllcsxoeiz;", "copy", "(Lpj/cllcsxoeiz;)Lmodern/payments/ecomAndroid/presentation/Action$HandleCloseAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpj/cllcsxoeiz;", "getScope", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleCloseAction implements Action {
        private final cllcsxoeiz scope;

        public HandleCloseAction(cllcsxoeiz scope) {
            zdlpuopuiu.btonecajqb(scope, "scope");
            this.scope = scope;
        }

        public static /* synthetic */ HandleCloseAction copy$default(HandleCloseAction handleCloseAction, cllcsxoeiz cllcsxoeizVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                cllcsxoeizVar = handleCloseAction.scope;
            }
            return handleCloseAction.copy(cllcsxoeizVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final cllcsxoeiz getScope() {
            return this.scope;
        }

        public final HandleCloseAction copy(cllcsxoeiz scope) {
            zdlpuopuiu.btonecajqb(scope, "scope");
            return new HandleCloseAction(scope);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleCloseAction) && zdlpuopuiu.eablkybsjg(this.scope, ((HandleCloseAction) other).scope);
        }

        public final cllcsxoeiz getScope() {
            return this.scope;
        }

        public int hashCode() {
            return this.scope.hashCode();
        }

        public String toString() {
            return "HandleCloseAction(scope=" + this.scope + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleDeactivateBinding;", "Lmodern/payments/ecomAndroid/presentation/Action;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeactivateBinding implements Action {
        private final String bindingId;

        public HandleDeactivateBinding(String bindingId) {
            zdlpuopuiu.btonecajqb(bindingId, "bindingId");
            this.bindingId = bindingId;
        }

        public static /* synthetic */ HandleDeactivateBinding copy$default(HandleDeactivateBinding handleDeactivateBinding, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = handleDeactivateBinding.bindingId;
            }
            return handleDeactivateBinding.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        public final HandleDeactivateBinding copy(String bindingId) {
            zdlpuopuiu.btonecajqb(bindingId, "bindingId");
            return new HandleDeactivateBinding(bindingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleDeactivateBinding) && zdlpuopuiu.eablkybsjg(this.bindingId, ((HandleDeactivateBinding) other).bindingId);
        }

        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            return this.bindingId.hashCode();
        }

        public String toString() {
            return "HandleDeactivateBinding(bindingId=" + this.bindingId + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleException;", "Lmodern/payments/ecomAndroid/presentation/Action;", "exception", "Lmodern/payments/ecomAndroid/domain/State$Error;", "(Lmodern/payments/ecomAndroid/domain/State$Error;)V", "getException", "()Lmodern/payments/ecomAndroid/domain/State$Error;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleException implements Action {
        private final State.Error exception;

        public HandleException(State.Error exception) {
            zdlpuopuiu.btonecajqb(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ HandleException copy$default(HandleException handleException, State.Error error, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                error = handleException.exception;
            }
            return handleException.copy(error);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final State.Error getException() {
            return this.exception;
        }

        public final HandleException copy(State.Error exception) {
            zdlpuopuiu.btonecajqb(exception, "exception");
            return new HandleException(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleException) && zdlpuopuiu.eablkybsjg(this.exception, ((HandleException) other).exception);
        }

        public final State.Error getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "HandleException(exception=" + this.exception + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleFinishChallenge;", "Lmodern/payments/ecomAndroid/presentation/Action;", "cRes", "", "paRes", "(Ljava/lang/String;Ljava/lang/String;)V", "getCRes", "()Ljava/lang/String;", "getPaRes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleFinishChallenge implements Action {
        private final String cRes;
        private final String paRes;

        public HandleFinishChallenge(String str, String str2) {
            this.cRes = str;
            this.paRes = str2;
        }

        public static /* synthetic */ HandleFinishChallenge copy$default(HandleFinishChallenge handleFinishChallenge, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = handleFinishChallenge.cRes;
            }
            if ((i13 & 2) != 0) {
                str2 = handleFinishChallenge.paRes;
            }
            return handleFinishChallenge.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCRes() {
            return this.cRes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaRes() {
            return this.paRes;
        }

        public final HandleFinishChallenge copy(String cRes, String paRes) {
            return new HandleFinishChallenge(cRes, paRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandleFinishChallenge)) {
                return false;
            }
            HandleFinishChallenge handleFinishChallenge = (HandleFinishChallenge) other;
            return zdlpuopuiu.eablkybsjg(this.cRes, handleFinishChallenge.cRes) && zdlpuopuiu.eablkybsjg(this.paRes, handleFinishChallenge.paRes);
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
            return "HandleFinishChallenge(cRes=" + this.cRes + ", paRes=" + this.paRes + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleInit;", "Lmodern/payments/ecomAndroid/presentation/Action;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleInit implements Action {
        public static final HandleInit INSTANCE = new HandleInit();

        private HandleInit() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HandleInit);
        }

        public int hashCode() {
            return 414397897;
        }

        public String toString() {
            return "HandleInit";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentOrder;", "Lmodern/payments/ecomAndroid/presentation/Action;", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "paymentOrderResponseBody", "Lpj/cllcsxoeiz;", "coroutineScope", "<init>", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;Lpj/cllcsxoeiz;)V", "component1", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "component2", "()Lpj/cllcsxoeiz;", "copy", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;Lpj/cllcsxoeiz;)Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentOrder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "getPaymentOrderResponseBody", "Lpj/cllcsxoeiz;", "getCoroutineScope", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandlePaymentOrder implements Action {
        private final cllcsxoeiz coroutineScope;
        private final PaymentOrderResponseBody paymentOrderResponseBody;

        public HandlePaymentOrder(PaymentOrderResponseBody paymentOrderResponseBody, cllcsxoeiz cllcsxoeizVar) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            this.paymentOrderResponseBody = paymentOrderResponseBody;
            this.coroutineScope = cllcsxoeizVar;
        }

        public static /* synthetic */ HandlePaymentOrder copy$default(HandlePaymentOrder handlePaymentOrder, PaymentOrderResponseBody paymentOrderResponseBody, cllcsxoeiz cllcsxoeizVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                paymentOrderResponseBody = handlePaymentOrder.paymentOrderResponseBody;
            }
            if ((i13 & 2) != 0) {
                cllcsxoeizVar = handlePaymentOrder.coroutineScope;
            }
            return handlePaymentOrder.copy(paymentOrderResponseBody, cllcsxoeizVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final cllcsxoeiz getCoroutineScope() {
            return this.coroutineScope;
        }

        public final HandlePaymentOrder copy(PaymentOrderResponseBody paymentOrderResponseBody, cllcsxoeiz coroutineScope) {
            zdlpuopuiu.btonecajqb(paymentOrderResponseBody, "paymentOrderResponseBody");
            return new HandlePaymentOrder(paymentOrderResponseBody, coroutineScope);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandlePaymentOrder)) {
                return false;
            }
            HandlePaymentOrder handlePaymentOrder = (HandlePaymentOrder) other;
            return zdlpuopuiu.eablkybsjg(this.paymentOrderResponseBody, handlePaymentOrder.paymentOrderResponseBody) && zdlpuopuiu.eablkybsjg(this.coroutineScope, handlePaymentOrder.coroutineScope);
        }

        public final cllcsxoeiz getCoroutineScope() {
            return this.coroutineScope;
        }

        public final PaymentOrderResponseBody getPaymentOrderResponseBody() {
            return this.paymentOrderResponseBody;
        }

        public int hashCode() {
            int iHashCode = this.paymentOrderResponseBody.hashCode() * 31;
            cllcsxoeiz cllcsxoeizVar = this.coroutineScope;
            return iHashCode + (cllcsxoeizVar == null ? 0 : cllcsxoeizVar.hashCode());
        }

        public String toString() {
            return "HandlePaymentOrder(paymentOrderResponseBody=" + this.paymentOrderResponseBody + ", coroutineScope=" + this.coroutineScope + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentResult;", "Lmodern/payments/ecomAndroid/presentation/Action;", "finishPaymentResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "processing", "", "(Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;Z)V", "getFinishPaymentResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/FinishPaymentResponseBody;", "getProcessing", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandlePaymentResult implements Action {
        private final FinishPaymentResponseBody finishPaymentResponseBody;
        private final boolean processing;

        /* JADX WARN: Multi-variable type inference failed */
        public HandlePaymentResult() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ HandlePaymentResult copy$default(HandlePaymentResult handlePaymentResult, FinishPaymentResponseBody finishPaymentResponseBody, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                finishPaymentResponseBody = handlePaymentResult.finishPaymentResponseBody;
            }
            if ((i13 & 2) != 0) {
                z13 = handlePaymentResult.processing;
            }
            return handlePaymentResult.copy(finishPaymentResponseBody, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FinishPaymentResponseBody getFinishPaymentResponseBody() {
            return this.finishPaymentResponseBody;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getProcessing() {
            return this.processing;
        }

        public final HandlePaymentResult copy(FinishPaymentResponseBody finishPaymentResponseBody, boolean processing) {
            return new HandlePaymentResult(finishPaymentResponseBody, processing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandlePaymentResult)) {
                return false;
            }
            HandlePaymentResult handlePaymentResult = (HandlePaymentResult) other;
            return zdlpuopuiu.eablkybsjg(this.finishPaymentResponseBody, handlePaymentResult.finishPaymentResponseBody) && this.processing == handlePaymentResult.processing;
        }

        public final FinishPaymentResponseBody getFinishPaymentResponseBody() {
            return this.finishPaymentResponseBody;
        }

        public final boolean getProcessing() {
            return this.processing;
        }

        public int hashCode() {
            FinishPaymentResponseBody finishPaymentResponseBody = this.finishPaymentResponseBody;
            return ((finishPaymentResponseBody == null ? 0 : finishPaymentResponseBody.hashCode()) * 31) + Boolean.hashCode(this.processing);
        }

        public String toString() {
            return "HandlePaymentResult(finishPaymentResponseBody=" + this.finishPaymentResponseBody + ", processing=" + this.processing + ')';
        }

        public HandlePaymentResult(FinishPaymentResponseBody finishPaymentResponseBody, boolean z13) {
            this.finishPaymentResponseBody = finishPaymentResponseBody;
            this.processing = z13;
        }

        public /* synthetic */ HandlePaymentResult(FinishPaymentResponseBody finishPaymentResponseBody, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : finishPaymentResponseBody, (i13 & 2) != 0 ? false : z13);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandlePaymentToken;", "Lmodern/payments/ecomAndroid/presentation/Action;", "paymentTokenResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;)V", "getPaymentTokenResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandlePaymentToken implements Action {
        private final PaymentTokenResponseBody paymentTokenResponseBody;

        public HandlePaymentToken(PaymentTokenResponseBody paymentTokenResponseBody) {
            zdlpuopuiu.btonecajqb(paymentTokenResponseBody, "paymentTokenResponseBody");
            this.paymentTokenResponseBody = paymentTokenResponseBody;
        }

        public static /* synthetic */ HandlePaymentToken copy$default(HandlePaymentToken handlePaymentToken, PaymentTokenResponseBody paymentTokenResponseBody, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                paymentTokenResponseBody = handlePaymentToken.paymentTokenResponseBody;
            }
            return handlePaymentToken.copy(paymentTokenResponseBody);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaymentTokenResponseBody getPaymentTokenResponseBody() {
            return this.paymentTokenResponseBody;
        }

        public final HandlePaymentToken copy(PaymentTokenResponseBody paymentTokenResponseBody) {
            zdlpuopuiu.btonecajqb(paymentTokenResponseBody, "paymentTokenResponseBody");
            return new HandlePaymentToken(paymentTokenResponseBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandlePaymentToken) && zdlpuopuiu.eablkybsjg(this.paymentTokenResponseBody, ((HandlePaymentToken) other).paymentTokenResponseBody);
        }

        public final PaymentTokenResponseBody getPaymentTokenResponseBody() {
            return this.paymentTokenResponseBody;
        }

        public int hashCode() {
            return this.paymentTokenResponseBody.hashCode();
        }

        public String toString() {
            return "HandlePaymentToken(paymentTokenResponseBody=" + this.paymentTokenResponseBody + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleSPaySdkResult;", "Lmodern/payments/ecomAndroid/presentation/Action;", "sPayPaymentResult", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "(Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;)V", "getSPayPaymentResult", "()Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSPaySdkResult implements Action {
        private final SPayPaymentResult sPayPaymentResult;

        public HandleSPaySdkResult(SPayPaymentResult sPayPaymentResult) {
            zdlpuopuiu.btonecajqb(sPayPaymentResult, "sPayPaymentResult");
            this.sPayPaymentResult = sPayPaymentResult;
        }

        public static /* synthetic */ HandleSPaySdkResult copy$default(HandleSPaySdkResult handleSPaySdkResult, SPayPaymentResult sPayPaymentResult, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                sPayPaymentResult = handleSPaySdkResult.sPayPaymentResult;
            }
            return handleSPaySdkResult.copy(sPayPaymentResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SPayPaymentResult getSPayPaymentResult() {
            return this.sPayPaymentResult;
        }

        public final HandleSPaySdkResult copy(SPayPaymentResult sPayPaymentResult) {
            zdlpuopuiu.btonecajqb(sPayPaymentResult, "sPayPaymentResult");
            return new HandleSPaySdkResult(sPayPaymentResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleSPaySdkResult) && zdlpuopuiu.eablkybsjg(this.sPayPaymentResult, ((HandleSPaySdkResult) other).sPayPaymentResult);
        }

        public final SPayPaymentResult getSPayPaymentResult() {
            return this.sPayPaymentResult;
        }

        public int hashCode() {
            return this.sPayPaymentResult.hashCode();
        }

        public String toString() {
            return "HandleSPaySdkResult(sPayPaymentResult=" + this.sPayPaymentResult + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleSbpPay;", "Lmodern/payments/ecomAndroid/presentation/Action;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSbpPay implements Action {
        public static final HandleSbpPay INSTANCE = new HandleSbpPay();

        private HandleSbpPay() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HandleSbpPay);
        }

        public int hashCode() {
            return -920193184;
        }

        public String toString() {
            return "HandleSbpPay";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleSessionId;", "Lmodern/payments/ecomAndroid/presentation/Action;", "sessionIdResponseBody", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "(Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;)V", "getSessionIdResponseBody", "()Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSessionId implements Action {
        private final SessionIdResponseBody sessionIdResponseBody;

        public HandleSessionId(SessionIdResponseBody sessionIdResponseBody) {
            zdlpuopuiu.btonecajqb(sessionIdResponseBody, "sessionIdResponseBody");
            this.sessionIdResponseBody = sessionIdResponseBody;
        }

        public static /* synthetic */ HandleSessionId copy$default(HandleSessionId handleSessionId, SessionIdResponseBody sessionIdResponseBody, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                sessionIdResponseBody = handleSessionId.sessionIdResponseBody;
            }
            return handleSessionId.copy(sessionIdResponseBody);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SessionIdResponseBody getSessionIdResponseBody() {
            return this.sessionIdResponseBody;
        }

        public final HandleSessionId copy(SessionIdResponseBody sessionIdResponseBody) {
            zdlpuopuiu.btonecajqb(sessionIdResponseBody, "sessionIdResponseBody");
            return new HandleSessionId(sessionIdResponseBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleSessionId) && zdlpuopuiu.eablkybsjg(this.sessionIdResponseBody, ((HandleSessionId) other).sessionIdResponseBody);
        }

        public final SessionIdResponseBody getSessionIdResponseBody() {
            return this.sessionIdResponseBody;
        }

        public int hashCode() {
            return this.sessionIdResponseBody.hashCode();
        }

        public String toString() {
            return "HandleSessionId(sessionIdResponseBody=" + this.sessionIdResponseBody + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "Lmodern/payments/ecomAndroid/presentation/Action;", "BindingCard", "NewCard", "SPay", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$BindingCard;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$NewCard;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$SPay;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HandleStartPayment extends Action {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$BindingCard;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "", "bindingId", "Lpj/cllcsxoeiz;", "scope", "<init>", "(Ljava/lang/String;Lpj/cllcsxoeiz;)V", "component1", "()Ljava/lang/String;", "component2", "()Lpj/cllcsxoeiz;", "copy", "(Ljava/lang/String;Lpj/cllcsxoeiz;)Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$BindingCard;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBindingId", "Lpj/cllcsxoeiz;", "getScope", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BindingCard implements HandleStartPayment {
            private final String bindingId;
            private final cllcsxoeiz scope;

            public BindingCard(String bindingId, cllcsxoeiz scope) {
                zdlpuopuiu.btonecajqb(bindingId, "bindingId");
                zdlpuopuiu.btonecajqb(scope, "scope");
                this.bindingId = bindingId;
                this.scope = scope;
            }

            public static /* synthetic */ BindingCard copy$default(BindingCard bindingCard, String str, cllcsxoeiz cllcsxoeizVar, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = bindingCard.bindingId;
                }
                if ((i13 & 2) != 0) {
                    cllcsxoeizVar = bindingCard.scope;
                }
                return bindingCard.copy(str, cllcsxoeizVar);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getBindingId() {
                return this.bindingId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final cllcsxoeiz getScope() {
                return this.scope;
            }

            public final BindingCard copy(String bindingId, cllcsxoeiz scope) {
                zdlpuopuiu.btonecajqb(bindingId, "bindingId");
                zdlpuopuiu.btonecajqb(scope, "scope");
                return new BindingCard(bindingId, scope);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BindingCard)) {
                    return false;
                }
                BindingCard bindingCard = (BindingCard) other;
                return zdlpuopuiu.eablkybsjg(this.bindingId, bindingCard.bindingId) && zdlpuopuiu.eablkybsjg(this.scope, bindingCard.scope);
            }

            public final String getBindingId() {
                return this.bindingId;
            }

            public final cllcsxoeiz getScope() {
                return this.scope;
            }

            public int hashCode() {
                return (this.bindingId.hashCode() * 31) + this.scope.hashCode();
            }

            public String toString() {
                return "BindingCard(bindingId=" + this.bindingId + ", scope=" + this.scope + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$NewCard;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "Lpj/cllcsxoeiz;", "scope", "<init>", "(Lpj/cllcsxoeiz;)V", "component1", "()Lpj/cllcsxoeiz;", "copy", "(Lpj/cllcsxoeiz;)Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$NewCard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpj/cllcsxoeiz;", "getScope", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NewCard implements HandleStartPayment {
            private final cllcsxoeiz scope;

            public NewCard(cllcsxoeiz scope) {
                zdlpuopuiu.btonecajqb(scope, "scope");
                this.scope = scope;
            }

            public static /* synthetic */ NewCard copy$default(NewCard newCard, cllcsxoeiz cllcsxoeizVar, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    cllcsxoeizVar = newCard.scope;
                }
                return newCard.copy(cllcsxoeizVar);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final cllcsxoeiz getScope() {
                return this.scope;
            }

            public final NewCard copy(cllcsxoeiz scope) {
                zdlpuopuiu.btonecajqb(scope, "scope");
                return new NewCard(scope);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NewCard) && zdlpuopuiu.eablkybsjg(this.scope, ((NewCard) other).scope);
            }

            public final cllcsxoeiz getScope() {
                return this.scope;
            }

            public int hashCode() {
                return this.scope.hashCode();
            }

            public String toString() {
                return "NewCard(scope=" + this.scope + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment$SPay;", "Lmodern/payments/ecomAndroid/presentation/Action$HandleStartPayment;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SPay implements HandleStartPayment {
            public static final SPay INSTANCE = new SPay();

            private SPay() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SPay);
            }

            public int hashCode() {
                return -28391514;
            }

            public String toString() {
                return "SPay";
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/Action$HandleSuccessBindingDeactivation;", "Lmodern/payments/ecomAndroid/presentation/Action;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSuccessBindingDeactivation implements Action {
        public static final HandleSuccessBindingDeactivation INSTANCE = new HandleSuccessBindingDeactivation();

        private HandleSuccessBindingDeactivation() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HandleSuccessBindingDeactivation);
        }

        public int hashCode() {
            return -140992910;
        }

        public String toString() {
            return "HandleSuccessBindingDeactivation";
        }
    }
}
