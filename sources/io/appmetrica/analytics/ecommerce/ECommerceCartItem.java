package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.io;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f45371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f45372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f45373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f45374d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j13) {
        this(eCommerceProduct, eCommercePrice, io.a(j13));
    }

    public ECommerceProduct getProduct() {
        return this.f45371a;
    }

    public BigDecimal getQuantity() {
        return this.f45372b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f45374d;
    }

    public ECommercePrice getRevenue() {
        return this.f45373c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f45374d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f45371a + ", quantity=" + this.f45372b + ", revenue=" + this.f45373c + ", referrer=" + this.f45374d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d13) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(io.a(d13)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f45371a = eCommerceProduct;
        this.f45372b = bigDecimal;
        this.f45373c = eCommercePrice;
    }
}
