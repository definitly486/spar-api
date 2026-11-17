package modern.payments.ecomAndroid.domain.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "paymentMode", "Lgg/wwaezpbzkn;", "setPaymentMode", "(Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;)V", "", "isNewCardPaymentMode", "()Z", "isBindingCardPaymentMode", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "new", "setSessionIdResponse", "(Lmodern/payments/ecomAndroid/data/api/ContentResponse;)V", "", "setLocalSessionId", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getPaymentMode", "()Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "Lsj/wypolnanlu;", "getSessionIdResponse", "()Lsj/wypolnanlu;", "sessionIdResponse", "getLocalSessionId", "localSessionId", "PaymentMode", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AppDataRepository {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "", "()V", "BindingCardPaymentMode", "NewCardPaymentMode", "SPayPaymentMode", "SbpPaymentMode", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$BindingCardPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$NewCardPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$SPayPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$SbpPaymentMode;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PaymentMode {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$BindingCardPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BindingCardPaymentMode extends PaymentMode {
            public static final BindingCardPaymentMode INSTANCE = new BindingCardPaymentMode();

            private BindingCardPaymentMode() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BindingCardPaymentMode);
            }

            public int hashCode() {
                return 1307167899;
            }

            public String toString() {
                return "BindingCardPaymentMode";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$NewCardPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NewCardPaymentMode extends PaymentMode {
            public static final NewCardPaymentMode INSTANCE = new NewCardPaymentMode();

            private NewCardPaymentMode() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NewCardPaymentMode);
            }

            public int hashCode() {
                return -1135996000;
            }

            public String toString() {
                return "NewCardPaymentMode";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$SPayPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SPayPaymentMode extends PaymentMode {
            public static final SPayPaymentMode INSTANCE = new SPayPaymentMode();

            private SPayPaymentMode() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SPayPaymentMode);
            }

            public int hashCode() {
                return 1666102765;
            }

            public String toString() {
                return "SPayPaymentMode";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode$SbpPaymentMode;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SbpPaymentMode extends PaymentMode {
            public static final SbpPaymentMode INSTANCE = new SbpPaymentMode();

            private SbpPaymentMode() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SbpPaymentMode);
            }

            public int hashCode() {
                return 1038672719;
            }

            public String toString() {
                return "SbpPaymentMode";
            }
        }

        public /* synthetic */ PaymentMode(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private PaymentMode() {
        }
    }

    wypolnanlu getLocalSessionId();

    PaymentMode getPaymentMode();

    String getSessionId();

    wypolnanlu getSessionIdResponse();

    boolean isBindingCardPaymentMode();

    boolean isNewCardPaymentMode();

    void setLocalSessionId(String str);

    void setPaymentMode(PaymentMode paymentMode);

    void setSessionIdResponse(ContentResponse<SessionIdResponseBody> contentResponse);
}
