package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f46277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46278b;

    public Nf(ECommercePrice eCommercePrice) {
        this(new Y(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Y(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f46277a + ", internalComponents=" + this.f46278b + '}';
    }

    public Nf(Y y13, LinkedList linkedList) {
        this.f46277a = y13;
        this.f46278b = linkedList;
    }
}
