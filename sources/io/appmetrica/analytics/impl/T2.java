package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class T2 implements po {
    @Override // io.appmetrica.analytics.impl.po
    public final no a(Object obj) {
        C3446co[] c3446coArr = ((C3523fo) obj).f47261a;
        return (c3446coArr == null || c3446coArr.length == 0) ? new no(this, false, "attributes list is empty") : new no(this, true, "");
    }
}
