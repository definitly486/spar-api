package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f45376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f45377c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f45375a = str;
        this.f45376b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f45376b;
    }

    public String getIdentifier() {
        return this.f45375a;
    }

    public Map<String, String> getPayload() {
        return this.f45377c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f45377c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f45375a + "', cartItems=" + this.f45376b + ", payload=" + this.f45377c + '}';
    }
}
