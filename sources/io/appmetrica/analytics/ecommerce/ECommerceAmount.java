package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.io;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f45369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45370b;

    public ECommerceAmount(long j13, String str) {
        this(io.a(j13), str);
    }

    public BigDecimal getAmount() {
        return this.f45369a;
    }

    public String getUnit() {
        return this.f45370b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f45369a + ", unit='" + this.f45370b + "'}";
    }

    public ECommerceAmount(double d13, String str) {
        this(new BigDecimal(io.a(d13)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f45369a = bigDecimal;
        this.f45370b = str;
    }
}
