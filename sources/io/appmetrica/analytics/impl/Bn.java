package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public class Bn implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final po f45546a;

    public Bn(po poVar) {
        this.f45546a = poVar;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(Object obj) {
        no noVarA = this.f45546a.a(obj);
        if (noVarA.f47784a) {
            return noVarA;
        }
        throw new ValidationException(noVarA.f47785b);
    }

    public final po a() {
        return this.f45546a;
    }
}
