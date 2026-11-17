package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg.draadjrbmk f46770a;

    public Xd(C3436ce c3436ce) {
        this.f46770a = c3436ce;
    }

    public final Yd a(Context context, C3516fh c3516fh) {
        return new Yd(context, c3516fh, this.f46770a, new InterfaceC3539ge() { // from class: io.appmetrica.analytics.impl.vdvldrhtss
            @Override // io.appmetrica.analytics.impl.InterfaceC3539ge
            public final InterfaceC3391al a(B0 b13) {
                return Xd.a(b13);
            }
        }, EnumC3934wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Yd b(Context context, C3516fh c3516fh) {
        return new Yd(context, c3516fh, this.f46770a, new InterfaceC3539ge() { // from class: io.appmetrica.analytics.impl.oxmwwwfdhm
            @Override // io.appmetrica.analytics.impl.InterfaceC3539ge
            public final InterfaceC3391al a(B0 b13) {
                return Xd.b(b13);
            }
        }, EnumC3934wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC3391al a(B0 b13) {
        return new Vd(b13.f45487f.f45552d);
    }

    public static final InterfaceC3391al b(B0 b13) {
        return new W();
    }
}
