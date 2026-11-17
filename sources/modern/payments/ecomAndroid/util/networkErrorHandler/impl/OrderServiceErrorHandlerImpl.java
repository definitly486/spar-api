package modern.payments.ecomAndroid.util.networkErrorHandler.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/networkErrorHandler/impl/OrderServiceErrorHandlerImpl;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "()V", "getError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "error", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OrderServiceErrorHandlerImpl implements NetworkErrorHandler<EcomApiError> {

    @Deprecated
    public static final int ACCESS_DENIED = 201;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int OPERATION_PARAMETER_INCORRECT = 203;

    @Deprecated
    public static final int ORDER_IN_PROGRESS = 210;

    @Deprecated
    public static final int ORDER_LOCKED = 207;

    @Deprecated
    public static final int ORDER_NOT_FOUND = 204;

    @Deprecated
    public static final int ORDER_STATUS_INCORRECT = 208;

    @Deprecated
    public static final int PAYMENT_ATTEMPTS_EXCEEDED = 205;

    @Deprecated
    public static final int PAYMENT_TOKEN_EXPIRED = 206;

    @Deprecated
    public static final int PAYMENT_UNSUCCESSFUL_DESCRIPTION = 209;

    @Deprecated
    public static final int SYSTEM_ERROR = 211;

    @Deprecated
    public static final int VALIDATION_EXCEPTION = 202;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/util/networkErrorHandler/impl/OrderServiceErrorHandlerImpl$Companion;", "", "()V", "ACCESS_DENIED", "", "OPERATION_PARAMETER_INCORRECT", "ORDER_IN_PROGRESS", "ORDER_LOCKED", "ORDER_NOT_FOUND", "ORDER_STATUS_INCORRECT", "PAYMENT_ATTEMPTS_EXCEEDED", "PAYMENT_TOKEN_EXPIRED", "PAYMENT_UNSUCCESSFUL_DESCRIPTION", "SYSTEM_ERROR", "VALIDATION_EXCEPTION", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:90:0x01af  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 int, still in use, count: 1, list:
      (r1v1 int) from 0x0049: SWITCH (r1v1 int)
     case 49617: goto B:25:0x0071
     case 49618: goto B:18:0x004e
     default: goto B:90:0x01af A[RegionRef:SW:16]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler
    public ErrorEntity getError(EcomApiError error) {
        ErrorEntity successfulError;
        String info;
        String description;
        zdlpuopuiu.btonecajqb(error, "error");
        if (error.getErrorCode().length() == 0 && ((description = error.getDescription()) == null || description.length() == 0)) {
            String httpCode = error.getHttpCode();
            String errorCode = error.getErrorCode();
            String info2 = error.getInfo();
            if (info2 == null) {
                info2 = error.getDescription();
            }
            successfulError = new ErrorEntity.HttpError.Unknown(httpCode, errorCode, info2);
        } else if (error.getErrorCode().length() > 0) {
            String errorCode2 = error.getErrorCode();
            switch (errorCode2) {
                case "201":
                    String httpCode2 = error.getHttpCode();
                    String errorCode3 = error.getErrorCode();
                    String info3 = error.getInfo();
                    if (info3 == null) {
                        info3 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.AccessDenied(httpCode2, errorCode3, info3);
                    break;
                case "202":
                    String httpCode3 = error.getHttpCode();
                    String errorCode4 = error.getErrorCode();
                    String info4 = error.getInfo();
                    if (info4 == null) {
                        info4 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.ValidationException(httpCode3, errorCode4, info4);
                    break;
                case "203":
                    String httpCode4 = error.getHttpCode();
                    String errorCode5 = error.getErrorCode();
                    String info5 = error.getInfo();
                    if (info5 == null) {
                        info5 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.OperationParamIncorrect(httpCode4, errorCode5, info5);
                    break;
                case "204":
                    String httpCode5 = error.getHttpCode();
                    String errorCode6 = error.getErrorCode();
                    String info6 = error.getInfo();
                    if (info6 == null) {
                        info6 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.OrderNotFound(httpCode5, errorCode6, info6);
                    break;
                case "205":
                    String httpCode6 = error.getHttpCode();
                    String errorCode7 = error.getErrorCode();
                    String info7 = error.getInfo();
                    if (info7 == null) {
                        info7 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.PaymentAttemptsExceeded(httpCode6, errorCode7, info7);
                    break;
                case "206":
                    String httpCode7 = error.getHttpCode();
                    String errorCode8 = error.getErrorCode();
                    String info8 = error.getInfo();
                    if (info8 == null) {
                        info8 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.PaymentTokenExpired(httpCode7, errorCode8, info8);
                    break;
                case "207":
                    String httpCode8 = error.getHttpCode();
                    String errorCode9 = error.getErrorCode();
                    String info9 = error.getInfo();
                    if (info9 == null) {
                        info9 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.OrderLocked(httpCode8, errorCode9, info9);
                    break;
                case "208":
                    String httpCode9 = error.getHttpCode();
                    String errorCode10 = error.getErrorCode();
                    String info10 = error.getInfo();
                    if (info10 == null) {
                        info10 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.OrderStatusIncorrect(httpCode9, errorCode10, info10);
                    break;
                case "209":
                    String httpCode10 = error.getHttpCode();
                    String errorCode11 = error.getErrorCode();
                    String info11 = error.getInfo();
                    if (info11 == null) {
                        info11 = error.getDescription();
                    }
                    successfulError = new ErrorEntity.OrderServiceApiError.PaymentUnsuccessfulDescription(httpCode10, errorCode11, info11);
                    break;
                default:
                    switch (errorCode2) {
                        case 49617:
                            if (!errorCode2.equals("210")) {
                                String httpCode11 = error.getHttpCode();
                                String errorCode12 = error.getErrorCode();
                                info = error.getInfo();
                                if (info == null) {
                                    info = error.getDescription();
                                }
                                successfulError = new ErrorEntity.HttpError.Unknown(httpCode11, errorCode12, info);
                            } else {
                                String httpCode12 = error.getHttpCode();
                                String errorCode13 = error.getErrorCode();
                                String info12 = error.getInfo();
                                if (info12 == null) {
                                    info12 = error.getDescription();
                                }
                                successfulError = new ErrorEntity.OrderServiceApiError.OrderInProgress(httpCode12, errorCode13, info12);
                            }
                            break;
                        case 49618:
                            if (!errorCode2.equals("211")) {
                                String httpCode13 = error.getHttpCode();
                                String errorCode14 = error.getErrorCode();
                                info = error.getInfo();
                                if (info == null) {
                                    info = error.getDescription();
                                }
                                successfulError = new ErrorEntity.HttpError.Unknown(httpCode13, errorCode14, info);
                            } else {
                                String httpCode14 = error.getHttpCode();
                                String errorCode15 = error.getErrorCode();
                                String info13 = error.getInfo();
                                if (info13 == null) {
                                    info13 = error.getDescription();
                                }
                                successfulError = new ErrorEntity.OrderServiceApiError.SystemError(httpCode14, errorCode15, info13);
                            }
                            break;
                        default:
                            String httpCode15 = error.getHttpCode();
                            String errorCode16 = error.getErrorCode();
                            info = error.getInfo();
                            if (info == null) {
                                info = error.getDescription();
                            }
                            successfulError = new ErrorEntity.HttpError.Unknown(httpCode15, errorCode16, info);
                            break;
                    }
            }
        } else {
            String errorCode17 = error.getErrorCode();
            String description2 = error.getDescription();
            if (description2 == null) {
                description2 = "No Error Description";
            }
            successfulError = new ErrorEntity.EcomServiceApiError.SuccessfulError(errorCode17, description2);
        }
        return successfulError;
    }
}
