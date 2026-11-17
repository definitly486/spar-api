package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3583i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f47429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3632k8 f47430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yn f47431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Jm f47432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3569hj f47433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3518fj f47434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U6 f47435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC3607j8 f47436i;

    public AbstractC3583i8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC3632k8 abstractC3632k8, Yn yn2, Jm jm2, InterfaceC3569hj interfaceC3569hj, InterfaceC3518fj interfaceC3518fj, U6 u13, InterfaceC3607j8 interfaceC3607j8) {
        this.f47428a = context;
        this.f47429b = protobufStateStorage;
        this.f47430c = abstractC3632k8;
        this.f47431d = yn2;
        this.f47432e = jm2;
        this.f47433f = interfaceC3569hj;
        this.f47434g = interfaceC3518fj;
        this.f47435h = u13;
        this.f47436i = interfaceC3607j8;
    }

    public final synchronized InterfaceC3607j8 a() {
        return this.f47436i;
    }

    public final synchronized boolean b(InterfaceC3682m8 interfaceC3682m8) {
        try {
            boolean z13 = false;
            if (interfaceC3682m8.a() == EnumC3657l8.f47647b) {
                return false;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(interfaceC3682m8, this.f47436i.b())) {
                return false;
            }
            List listA = (List) this.f47431d.invoke(this.f47436i.a(), interfaceC3682m8);
            boolean z14 = listA != null;
            if (listA == null) {
                listA = this.f47436i.a();
            }
            if (this.f47430c.a(interfaceC3682m8, this.f47436i.b())) {
                z13 = true;
            } else {
                interfaceC3682m8 = (InterfaceC3682m8) this.f47436i.b();
            }
            if (z13 || z14) {
                InterfaceC3607j8 interfaceC3607j8 = this.f47436i;
                InterfaceC3607j8 interfaceC3607j9 = (InterfaceC3607j8) this.f47432e.invoke(interfaceC3682m8, listA);
                this.f47436i = interfaceC3607j9;
                this.f47429b.save(interfaceC3607j9);
                AbstractC3842sj.a("Update distribution data: %s -> %s", interfaceC3607j8, this.f47436i);
            }
            return z13;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized InterfaceC3682m8 c() {
        try {
            if (!this.f47434g.a()) {
                InterfaceC3682m8 interfaceC3682m8 = (InterfaceC3682m8) this.f47433f.invoke();
                this.f47434g.b();
                if (interfaceC3682m8 != null) {
                    b(interfaceC3682m8);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC3682m8) this.f47436i.b();
    }

    public final InterfaceC3682m8 a(InterfaceC3682m8 interfaceC3682m8) {
        InterfaceC3682m8 interfaceC3682m8C;
        this.f47435h.a(this.f47428a);
        synchronized (this) {
            b(interfaceC3682m8);
            interfaceC3682m8C = c();
        }
        return interfaceC3682m8C;
    }

    public final InterfaceC3682m8 b() {
        this.f47435h.a(this.f47428a);
        return c();
    }
}
