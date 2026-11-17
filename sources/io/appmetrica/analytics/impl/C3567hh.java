package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3567hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3391al f47397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ib f47398c = new Ib();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K4 f47399d = new K4(new Zl(), new J4(), null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f47400e;

    public C3567hh(Context context, final InterfaceC4004z6 interfaceC4004z6, final EnumC3934wb enumC3934wb, InterfaceC3391al interfaceC3391al) {
        this.f47396a = context;
        this.f47397b = interfaceC3391al;
        this.f47400e = new Consumer() { // from class: io.appmetrica.analytics.impl.iozdgvuglv
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C3567hh.a(enumC3934wb, interfaceC4004z6, this, (Eb) obj);
            }
        };
    }

    public static final void a(EnumC3934wb enumC3934wb, InterfaceC4004z6 interfaceC4004z6, C3567hh c3567hh, Eb eb3) {
        String str = eb3.f45718h;
        C3653l4 c3653l4 = new C3653l4(str, eb3.f45715e, eb3.f45716f, eb3.f45717g, eb3.f45719i);
        String str2 = eb3.f45712b;
        byte[] bArr = eb3.f45711a;
        int i13 = eb3.f45713c;
        HashMap map = eb3.f45714d;
        String str3 = eb3.f45720j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = R9.f46441a;
        C3579i4 c3579i4 = new C3579i4(bArr, str2, enumC3934wb.f48324a, orCreatePublicLogger);
        c3579i4.f47418q = map;
        c3579i4.f47637g = i13;
        c3579i4.f47633c = str3;
        ((C3516fh) interfaceC4004z6).a(c3653l4, c3579i4, c3567hh.f47399d);
    }
}
