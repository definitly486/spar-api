package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3991yi implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f48536a;

    public C3991yi(Map<String, ?> map) {
        this.f48536a = map;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(String str) {
        return this.f48536a.containsKey(str) ? new no(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new no(this, true, "");
    }
}
