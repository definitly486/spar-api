package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class Ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f45726d;

    public Ee(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f45723a + "', identifier='" + this.f45724b + "', cartItems=" + this.f45725c + ", payload=" + this.f45726d + '}';
    }

    public Ee(String str, String str2, ArrayList arrayList, Map map) {
        this.f45723a = str;
        this.f45724b = str2;
        this.f45725c = arrayList;
        this.f45726d = map;
    }
}
