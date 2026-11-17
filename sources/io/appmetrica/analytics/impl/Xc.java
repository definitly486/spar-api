package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class Xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wm f46765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wm f46766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4 f46767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f46768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46769e;

    public Xc(String str, PublicLogger publicLogger) {
        this(new H4(30), new Wm(50, str.concat("map key"), publicLogger), new Wm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Xc(H4 h13, Wm wm2, Wm wm3, String str, PublicLogger publicLogger) {
        this.f46767c = h13;
        this.f46765a = wm2;
        this.f46766b = wm3;
        this.f46769e = str;
        this.f46768d = publicLogger;
    }
}
