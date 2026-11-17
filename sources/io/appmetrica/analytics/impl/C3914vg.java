package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3914vg implements InterfaceC3610jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f48241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f48242b;

    public C3914vg(Context context, ICommonExecutor iCommonExecutor) {
        this.f48241a = iCommonExecutor;
        this.f48242b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(Fg fg2, Throwable th2) {
        fg2.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3610jb
    public final void a(Fg fg2) throws Throwable {
        this.f48242b.startConnection(new C3889ug(this, fg2));
    }

    public final void a(final Fg fg2, final Throwable th2) {
        this.f48241a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.crxdokpmqz
            @Override // java.lang.Runnable
            public final void run() {
                C3914vg.b(fg2, th2);
            }
        });
    }
}
