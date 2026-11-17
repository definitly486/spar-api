package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3459db extends Ya, InterfaceC3435cd {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    /* synthetic */ void a(Location location);

    void a(AnrListener anrListener);

    void a(ExternalAttribution externalAttribution);

    void a(Do r13);

    void a(EnumC3673m enumC3673m);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ void a(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    /* synthetic */ void a(String str, String str2);

    void a(String str, boolean z13);

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    /* synthetic */ void a(boolean z13);

    void b(Activity activity);

    void b(String str);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ void b(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    /* synthetic */ void b(boolean z13);

    @Override // io.appmetrica.analytics.impl.Ya
    /* synthetic */ boolean b();

    void c();

    List<String> f();
}
