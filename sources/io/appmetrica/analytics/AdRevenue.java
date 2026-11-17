package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.io;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f45059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Currency f45060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdType f45061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f45062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f45063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f45064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f45065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f45066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f45067i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f45068j;

        /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i13) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f45059a, this.f45060b, this.f45061c, this.f45062d, this.f45063e, this.f45064f, this.f45065g, this.f45066h, this.f45067i, this.f45068j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f45062d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f45065g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f45066h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f45061c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f45063e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f45064f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f45068j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f45067i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f45059a = bigDecimal;
            this.f45060b = currency;
        }
    }

    /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i13) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j13, Currency currency) {
        return new Builder(io.a(j13), currency, 0);
    }

    public static Builder newBuilder(double d13, Currency currency) {
        return new Builder(new BigDecimal(io.a(d13)), currency, 0);
    }
}
