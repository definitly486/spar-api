package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C3788qe;
import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Bn f45137g = new Bn(new C3788qe("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f45138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Currency f45139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Integer f45140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f45142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Receipt f45143f;

        /* synthetic */ Builder(long j13, Currency currency, int i13) {
            this(j13, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f45142e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f45141d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f45140c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f45143f = receipt;
            return this;
        }

        private Builder(long j13, Currency currency) {
            f45137g.a(currency);
            this.f45138a = j13;
            this.f45139b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f45144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f45145b;

            /* synthetic */ Builder(int i13) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f45144a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f45145b = str;
                return this;
            }

            private Builder() {
            }
        }

        /* synthetic */ Receipt(Builder builder, int i13) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f45144a;
            this.signature = builder.f45145b;
        }
    }

    /* synthetic */ Revenue(Builder builder, int i13) {
        this(builder);
    }

    public static Builder newBuilder(long j13, Currency currency) {
        return new Builder(j13, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f45138a;
        this.currency = builder.f45139b;
        this.quantity = builder.f45140c;
        this.productID = builder.f45141d;
        this.payload = builder.f45142e;
        this.receipt = builder.f45143f;
    }
}
