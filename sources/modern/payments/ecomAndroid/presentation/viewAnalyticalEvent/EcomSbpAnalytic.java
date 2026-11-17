package modern.payments.ecomAndroid.presentation.viewAnalyticalEvent;

import kotlin.Metadata;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic;", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "OnSbpViewReady", "OnSbpViewShow", "OnTouchBankApp", "OnTouchSearchView", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnSbpViewReady;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnSbpViewShow;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnTouchBankApp;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnTouchSearchView;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomSbpAnalytic extends MerchantAnalyticalEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnSbpViewReady;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSbpViewReady implements EcomSbpAnalytic {
        public static final OnSbpViewReady INSTANCE = new OnSbpViewReady();

        private OnSbpViewReady() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnSbpViewReady);
        }

        public int hashCode() {
            return -1163341328;
        }

        public String toString() {
            return "OnSbpViewReady";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnSbpViewShow;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSbpViewShow implements EcomSbpAnalytic {
        public static final OnSbpViewShow INSTANCE = new OnSbpViewShow();

        private OnSbpViewShow() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnSbpViewShow);
        }

        public int hashCode() {
            return 516695312;
        }

        public String toString() {
            return "OnSbpViewShow";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnTouchBankApp;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTouchBankApp implements EcomSbpAnalytic {
        public static final OnTouchBankApp INSTANCE = new OnTouchBankApp();

        private OnTouchBankApp() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnTouchBankApp);
        }

        public int hashCode() {
            return -678996743;
        }

        public String toString() {
            return "OnTouchBankApp";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic$OnTouchSearchView;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomSbpAnalytic;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTouchSearchView implements EcomSbpAnalytic {
        public static final OnTouchSearchView INSTANCE = new OnTouchSearchView();

        private OnTouchSearchView() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnTouchSearchView);
        }

        public int hashCode() {
            return 1024573753;
        }

        public String toString() {
            return "OnTouchSearchView";
        }
    }
}
