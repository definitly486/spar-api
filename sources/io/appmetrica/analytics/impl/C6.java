package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class C6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f45560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3567hh f45561b;

    public C6(Context context, InterfaceC4004z6 interfaceC4004z6, EnumC3934wb enumC3934wb, InterfaceC3391al interfaceC3391al, Executor executor, String str) {
        this.f45560a = executor;
        this.f45561b = new C3567hh(context, interfaceC4004z6, enumC3934wb, interfaceC3391al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f45560a;
        C3567hh c3567hh = this.f45561b;
        Ib ib3 = c3567hh.f47398c;
        Consumer consumer = c3567hh.f47400e;
        Context context = c3567hh.f47396a;
        if (C3883ua.f48195c == null) {
            synchronized (kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(C3883ua.class)) {
                try {
                    if (C3883ua.f48195c == null) {
                        C3883ua.f48195c = new C3883ua(context);
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C3883ua c3883ua = C3883ua.f48195c;
        if (c3883ua == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("INSTANCE");
            c3883ua = null;
        }
        executor.execute(new RunnableC3541gg(file, ib3, ib3, consumer, c3883ua, c3567hh.f47397b));
    }
}
