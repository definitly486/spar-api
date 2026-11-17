package modern.payments.ecomAndroid.presentation.viewAnalyticalEvent;

import kotlin.Metadata;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomChallengeAnalytic;", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "On3DsViewShow", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomChallengeAnalytic$On3DsViewShow;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomChallengeAnalytic extends MerchantAnalyticalEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomChallengeAnalytic$On3DsViewShow;", "Lmodern/payments/ecomAndroid/presentation/viewAnalyticalEvent/EcomChallengeAnalytic;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class On3DsViewShow implements EcomChallengeAnalytic {
        public static final On3DsViewShow INSTANCE = new On3DsViewShow();

        private On3DsViewShow() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof On3DsViewShow);
        }

        public int hashCode() {
            return 179159603;
        }

        public String toString() {
            return "On3DsViewShow";
        }
    }
}
