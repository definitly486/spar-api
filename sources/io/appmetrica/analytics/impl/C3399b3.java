package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3399b3 implements InterfaceC3843sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f46951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3428c6 f46953d;

    public C3399b3(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f46950a.add(consumer);
        return this.f46951b;
    }

    public final void b() {
        this.f46951b = null;
        C3428c6 c3428c6 = this.f46953d;
        Context context = this.f46952c;
        synchronized (c3428c6) {
            if (c3428c6.f47011b) {
                try {
                    context.unregisterReceiver(c3428c6.f47010a);
                    c3428c6.f47011b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f46951b = intentA;
        Iterator it = this.f46950a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final synchronized void onDestroy() {
        this.f46951b = null;
        b();
        Iterator it = this.f46950a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C3399b3(Context context, ICommonExecutor iCommonExecutor, int i13) {
        this.f46950a = new ArrayList();
        this.f46951b = null;
        this.f46952c = context;
        this.f46953d = AbstractC3402b6.a(new F2(new C3373a3(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C3428c6 c3428c6 = this.f46953d;
        Context context = this.f46952c;
        synchronized (c3428c6) {
            try {
                intentRegisterReceiver = context.registerReceiver(c3428c6.f47010a, intentFilter);
                try {
                    c3428c6.f47011b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
