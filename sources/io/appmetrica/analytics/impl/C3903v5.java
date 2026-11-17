package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3903v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48224a;

    public C3903v5(String str) {
        this.f48224a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f48224a);
    }
}
