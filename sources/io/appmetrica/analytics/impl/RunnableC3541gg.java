package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3541gg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f47333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f47334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f47335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f47336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3883ua f47337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3391al f47338f;

    public RunnableC3541gg(File file, Function function, Consumer consumer, Consumer consumer2, C3883ua c3883ua, InterfaceC3391al interfaceC3391al) {
        this.f47333a = file;
        this.f47334b = function;
        this.f47335c = consumer;
        this.f47336d = consumer2;
        this.f47337e = c3883ua;
        this.f47338f = interfaceC3391al;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47333a.exists()) {
            S9 s9B = this.f47337e.b(this.f47333a.getName());
            Consumer consumer = this.f47335c;
            try {
                s9B.f46504a.lock();
                s9B.f46505b.a();
                if (!this.f47333a.exists()) {
                    consumer.consume(this.f47333a);
                    s9B.c();
                    C3883ua c3883ua = this.f47337e;
                    String name = this.f47333a.getName();
                    synchronized (c3883ua) {
                        c3883ua.f48197b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f47334b.apply(this.f47333a);
                if (objApply != null) {
                    if (this.f47338f.a(objApply)) {
                        this.f47336d.consume(objApply);
                    } else {
                        consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.yadqdtsiqt
                            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                            public final void consume(Object obj) {
                                RunnableC3541gg.a((File) obj);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
            consumer.consume(this.f47333a);
            s9B.c();
            this.f47337e.a(this.f47333a.getName());
        }
    }
}
