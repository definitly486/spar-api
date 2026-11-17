package modern.payments.ecomAndroid.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.State;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "", "()V", "Canceled", "Error", "Processing", "Success", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Canceled;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Error;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Processing;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Success;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SPayPaymentResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Canceled;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled extends SPayPaymentResult {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        public int hashCode() {
            return -809232412;
        }

        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Error;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "error", "Lmodern/payments/ecomAndroid/domain/State$Error;", "(Lmodern/payments/ecomAndroid/domain/State$Error;)V", "getError", "()Lmodern/payments/ecomAndroid/domain/State$Error;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends SPayPaymentResult {
        private final State.Error error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(State.Error error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.error = error;
        }

        public final State.Error getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Processing;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Processing extends SPayPaymentResult {
        public static final Processing INSTANCE = new Processing();

        private Processing() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Processing);
        }

        public int hashCode() {
            return -1750197346;
        }

        public String toString() {
            return "Processing";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult$Success;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends SPayPaymentResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return 327456600;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ SPayPaymentResult(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private SPayPaymentResult() {
    }
}
