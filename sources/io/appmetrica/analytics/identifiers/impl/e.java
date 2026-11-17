package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f45412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f45413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45414c = new Object();

    public e(Intent intent, String str) {
        this.f45412a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    public final void a(Context context) {
        synchronized (this.f45414c) {
            this.f45413b = null;
            this.f45414c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f45414c) {
            this.f45413b = null;
            this.f45414c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f45414c) {
            this.f45414c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f45414c) {
            this.f45413b = iBinder;
            this.f45414c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f45414c) {
            this.f45413b = null;
            this.f45414c.notifyAll();
        }
    }
}
