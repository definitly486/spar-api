package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uf f45833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f45834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nf f45835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Kg f45836d;

    public G3(ECommerceCartItem eCommerceCartItem) {
        this(new Uf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Nf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Kg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f45833a + ", quantity=" + this.f45834b + ", revenue=" + this.f45835c + ", referrer=" + this.f45836d + '}';
    }

    public G3(Uf uf2, BigDecimal bigDecimal, Nf nf2, Kg kg2) {
        this.f45833a = uf2;
        this.f45834b = bigDecimal;
        this.f45835c = nf2;
        this.f45836d = kg2;
    }
}
