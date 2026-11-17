package modern.payments.ecomAndroid.presentation.viewModel;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "", "CopyLogToClipboard", "HandleSPaySdkResult", "SendCallback", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$CopyLogToClipboard;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$HandleSPaySdkResult;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$SendCallback;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomBottomSheetDialogEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$CopyLogToClipboard;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "clipboardManager", "Landroid/content/ClipboardManager;", "(Landroid/content/ClipboardManager;)V", "getClipboardManager", "()Landroid/content/ClipboardManager;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CopyLogToClipboard implements EcomBottomSheetDialogEvent {
        private final ClipboardManager clipboardManager;

        public CopyLogToClipboard(ClipboardManager clipboardManager) {
            this.clipboardManager = clipboardManager;
        }

        public static /* synthetic */ CopyLogToClipboard copy$default(CopyLogToClipboard copyLogToClipboard, ClipboardManager clipboardManager, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                clipboardManager = copyLogToClipboard.clipboardManager;
            }
            return copyLogToClipboard.copy(clipboardManager);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ClipboardManager getClipboardManager() {
            return this.clipboardManager;
        }

        public final CopyLogToClipboard copy(ClipboardManager clipboardManager) {
            return new CopyLogToClipboard(clipboardManager);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CopyLogToClipboard) && zdlpuopuiu.eablkybsjg(this.clipboardManager, ((CopyLogToClipboard) other).clipboardManager);
        }

        public final ClipboardManager getClipboardManager() {
            return this.clipboardManager;
        }

        public int hashCode() {
            ClipboardManager clipboardManager = this.clipboardManager;
            if (clipboardManager == null) {
                return 0;
            }
            return clipboardManager.hashCode();
        }

        public String toString() {
            return "CopyLogToClipboard(clipboardManager=" + this.clipboardManager + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$HandleSPaySdkResult;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "result", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "(Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;)V", "getResult", "()Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSPaySdkResult implements EcomBottomSheetDialogEvent {
        private final SPayPaymentResult result;

        public HandleSPaySdkResult(SPayPaymentResult result) {
            zdlpuopuiu.btonecajqb(result, "result");
            this.result = result;
        }

        public static /* synthetic */ HandleSPaySdkResult copy$default(HandleSPaySdkResult handleSPaySdkResult, SPayPaymentResult sPayPaymentResult, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                sPayPaymentResult = handleSPaySdkResult.result;
            }
            return handleSPaySdkResult.copy(sPayPaymentResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SPayPaymentResult getResult() {
            return this.result;
        }

        public final HandleSPaySdkResult copy(SPayPaymentResult result) {
            zdlpuopuiu.btonecajqb(result, "result");
            return new HandleSPaySdkResult(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleSPaySdkResult) && zdlpuopuiu.eablkybsjg(this.result, ((HandleSPaySdkResult) other).result);
        }

        public final SPayPaymentResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "HandleSPaySdkResult(result=" + this.result + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent$SendCallback;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetDialogEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendCallback implements EcomBottomSheetDialogEvent {
        public static final SendCallback INSTANCE = new SendCallback();

        private SendCallback() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SendCallback);
        }

        public int hashCode() {
            return -1000001808;
        }

        public String toString() {
            return "SendCallback";
        }
    }
}
