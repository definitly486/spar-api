package io.appmetrica.analytics.impl;

import java.util.Collection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3713ne implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47756a;

    public C3713ne(String str) {
        this.f47756a = str;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(Collection<Object> collection) {
        if (!io.a((Collection) collection)) {
            return new no(this, true, "");
        }
        return new no(this, false, this.f47756a + " is null or empty.");
    }
}
