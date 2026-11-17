package modern.payments.ecomAndroid.presentation.viewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent;", "", "()V", "ToPaymentMethodsEvent", "TryAgainEvent", "Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent$ToPaymentMethodsEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent$TryAgainEvent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class NoInternetEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent$ToPaymentMethodsEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToPaymentMethodsEvent extends NoInternetEvent {
        public static final ToPaymentMethodsEvent INSTANCE = new ToPaymentMethodsEvent();

        private ToPaymentMethodsEvent() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ToPaymentMethodsEvent);
        }

        public int hashCode() {
            return 452906412;
        }

        public String toString() {
            return "ToPaymentMethodsEvent";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent$TryAgainEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TryAgainEvent extends NoInternetEvent {
        public static final TryAgainEvent INSTANCE = new TryAgainEvent();

        private TryAgainEvent() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TryAgainEvent);
        }

        public int hashCode() {
            return 1627378990;
        }

        public String toString() {
            return "TryAgainEvent";
        }
    }

    public /* synthetic */ NoInternetEvent(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private NoInternetEvent() {
    }
}
