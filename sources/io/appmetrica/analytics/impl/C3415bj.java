package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3415bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f46976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Um f46977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3445cn f46978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3445cn f46979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f46980e;

    public C3415bj(Revenue revenue, PublicLogger publicLogger) {
        this.f46980e = publicLogger;
        this.f46976a = revenue;
        this.f46977b = new Um(30720, "revenue payload", publicLogger);
        this.f46978c = new C3445cn(new Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f46979d = new C3445cn(new Wm(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
