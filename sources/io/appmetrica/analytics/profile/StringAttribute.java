package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.In;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.InterfaceC3751p2;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.po;

/* JADX INFO: loaded from: classes3.dex */
public class StringAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final In f48897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O6 f48898b;

    StringAttribute(String str, Wm wm2, po poVar, InterfaceC3751p2 interfaceC3751p2) {
        this.f48898b = new O6(str, poVar, interfaceC3751p2);
        this.f48897a = wm2;
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValue(String str) {
        O6 o13 = this.f48898b;
        return new UserProfileUpdate<>(new Xm(o13.f46309c, str, this.f48897a, o13.f46307a, new N4(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueIfUndefined(String str) {
        O6 o13 = this.f48898b;
        return new UserProfileUpdate<>(new Xm(o13.f46309c, str, this.f48897a, o13.f46307a, new Yk(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueReset() {
        O6 o13 = this.f48898b;
        return new UserProfileUpdate<>(new Oi(0, o13.f46309c, o13.f46307a, o13.f46308b));
    }
}
