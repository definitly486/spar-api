package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f46790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46791b;

    public Y(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f46790a + ", unit='" + this.f46791b + "'}";
    }

    public Y(BigDecimal bigDecimal, String str) {
        this.f46790a = bigDecimal;
        this.f46791b = str;
    }
}
