package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class I1 implements InterfaceC3949x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f45962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3949x1 f45963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45964c;

    public I1(InterfaceC3949x1 interfaceC3949x1) {
        this(Ia.j().w().b(), interfaceC3949x1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent, int i13) {
        this.f45962a.execute(new A1(this, intent, i13));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void b(Intent intent) {
        this.f45962a.execute(new E1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void c(Intent intent) {
        this.f45962a.execute(new D1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f45962a.execute(new C3974y1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final synchronized void onCreate() {
        this.f45964c = true;
        this.f45962a.execute(new C3999z1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void onDestroy() {
        this.f45962a.removeAll();
        synchronized (this) {
            this.f45964c = false;
        }
        this.f45963b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void pauseUserSession(Bundle bundle) {
        this.f45962a.execute(new H1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void reportData(int i13, Bundle bundle) {
        this.f45962a.execute(new F1(this, i13, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void resumeUserSession(Bundle bundle) {
        this.f45962a.execute(new G1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent, int i13, int i14) {
        this.f45962a.execute(new B1(this, intent, i13, i14));
    }

    public I1(IHandlerExecutor iHandlerExecutor, InterfaceC3949x1 interfaceC3949x1) {
        this.f45964c = false;
        this.f45962a = iHandlerExecutor;
        this.f45963b = interfaceC3949x1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent) {
        this.f45962a.execute(new C1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(InterfaceC3924w1 interfaceC3924w1) {
        this.f45963b.a(interfaceC3924w1);
    }
}
