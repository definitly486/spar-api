package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Rd implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3516fh f46453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0 f46454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3384ae f46455c;

    public Rd(C3516fh c3516fh, C0 c13, C3384ae c3384ae) {
        this.f46453a = c3516fh;
        this.f46454b = c13;
        this.f46455c = c3384ae;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        C3516fh c3516fh = this.f46453a;
        C0 c13 = this.f46454b;
        String str2 = c13.f45549a;
        String str3 = c13.f45550b;
        Integer numValueOf = Integer.valueOf(c13.f45552d);
        C0 c14 = this.f46454b;
        C3653l4 c3653l4 = new C3653l4(str2, str3, numValueOf, c14.f45553e, c14.f45551c);
        C3384ae c3384ae = this.f46455c;
        EnumC3934wb enumC3934wb = c3384ae.f46918b;
        B0 b13 = c3384ae.f46917a;
        String str4 = b13.f45484c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(b13.f45487f.f45549a);
        Set set = R9.f46441a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        C3579i4 c3579i4 = new C3579i4("", "", enumC3934wb.f48324a, orCreatePublicLogger);
        if (str != null) {
            c3579i4.f(str);
        }
        c3579i4.f47643m = bundle;
        c3579i4.f47633c = c3384ae.f46917a.f45487f.f45554f;
        c3516fh.a(c3653l4, c3579i4, new K4(new Zl(), new J4(), null));
    }
}
