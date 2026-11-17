package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C3851t3;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.InterfaceC3751p2;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.po;

/* JADX INFO: loaded from: classes3.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6 f48891a;

    BooleanAttribute(String str, po poVar, InterfaceC3751p2 interfaceC3751p2) {
        this.f48891a = new O6(str, poVar, interfaceC3751p2);
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValue(boolean z13) {
        O6 o13 = this.f48891a;
        return new UserProfileUpdate<>(new C3851t3(o13.f46309c, z13, o13.f46307a, new N4(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueIfUndefined(boolean z13) {
        O6 o13 = this.f48891a;
        return new UserProfileUpdate<>(new C3851t3(o13.f46309c, z13, o13.f46307a, new Yk(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueReset() {
        O6 o13 = this.f48891a;
        return new UserProfileUpdate<>(new Oi(3, o13.f46309c, o13.f46307a, o13.f46308b));
    }
}
