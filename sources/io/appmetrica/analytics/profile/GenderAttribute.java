package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C3856t8;
import io.appmetrica.analytics.impl.C3881u8;
import io.appmetrica.analytics.impl.C3994yl;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;

/* JADX INFO: loaded from: classes3.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6 f48893a = new O6("appmetrica_gender", new C3881u8(), new C3994yl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48895a;

        Gender(String str) {
            this.f48895a = str;
        }

        public String getStringValue() {
            return this.f48895a;
        }
    }

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValue(Gender gender) {
        String str = this.f48893a.f46309c;
        String stringValue = gender.getStringValue();
        C3856t8 c3856t8 = new C3856t8();
        O6 o13 = this.f48893a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c3856t8, o13.f46307a, new N4(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueIfUndefined(Gender gender) {
        String str = this.f48893a.f46309c;
        String stringValue = gender.getStringValue();
        C3856t8 c3856t8 = new C3856t8();
        O6 o13 = this.f48893a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c3856t8, o13.f46307a, new Yk(o13.f46308b)));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueReset() {
        O6 o13 = this.f48893a;
        return new UserProfileUpdate<>(new Oi(0, o13.f46309c, o13.f46307a, o13.f46308b));
    }
}
