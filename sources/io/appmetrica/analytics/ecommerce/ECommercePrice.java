package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f45378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f45379b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f45378a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f45378a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f45379b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f45379b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f45378a + ", internalComponents=" + this.f45379b + '}';
    }
}
