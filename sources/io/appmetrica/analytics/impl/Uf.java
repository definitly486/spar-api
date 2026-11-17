package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f46619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Nf f46620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nf f46621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f46622g;

    public Uf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Nf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Nf(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f46616a + "', name='" + this.f46617b + "', categoriesPath=" + this.f46618c + ", payload=" + this.f46619d + ", actualPrice=" + this.f46620e + ", originalPrice=" + this.f46621f + ", promocodes=" + this.f46622g + '}';
    }

    public Uf(String str, String str2, List list, Map map, Nf nf2, Nf nf3, List list2) {
        this.f46616a = str;
        this.f46617b = str2;
        this.f46618c = list;
        this.f46619d = map;
        this.f46620e = nf2;
        this.f46621f = nf3;
        this.f46622g = list2;
    }
}
