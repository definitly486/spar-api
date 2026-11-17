package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3978y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48500a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48501b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f48502c;

    public C3978y5(Context context) {
        this.f48502c = context.getApplicationContext();
    }

    public final InterfaceC3407bb a(C3654l5 c3654l5, K4 k13, InterfaceC3558h8 interfaceC3558h8, HashMap map) {
        InterfaceC3407bb interfaceC3407bb = (InterfaceC3407bb) map.get(c3654l5.toString());
        if (interfaceC3407bb != null) {
            interfaceC3407bb.a(k13);
            return interfaceC3407bb;
        }
        InterfaceC3407bb interfaceC3407bbA = interfaceC3558h8.a(this.f48502c, c3654l5, k13);
        map.put(c3654l5.toString(), interfaceC3407bbA);
        return interfaceC3407bbA;
    }
}
