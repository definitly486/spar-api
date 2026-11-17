package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C3856t8;
import io.appmetrica.analytics.impl.C3881u8;
import io.appmetrica.analytics.impl.C3994yl;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.W2;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6 f48890a = new O6("appmetrica_birth_date", new C3881u8(), new C3994yl());

    BirthDateAttribute() {
    }

    final UserProfileUpdate a(Calendar calendar, String str, W2 w13) {
        return new UserProfileUpdate(new Xm(this.f48890a.f46309c, new SimpleDateFormat(str).format(calendar.getTime()), new C3856t8(), new C3881u8(), w13));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withAge(int i13) {
        int i14 = Calendar.getInstance(Locale.US).get(1) - i13;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i14);
        return a(gregorianCalendar, "yyyy", new N4(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withAgeIfUndefined(int i13) {
        int i14 = Calendar.getInstance(Locale.US).get(1) - i13;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i14);
        return a(gregorianCalendar, "yyyy", new Yk(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new N4(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Yk(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(0, this.f48890a.f46309c, new C3881u8(), new C3994yl()));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDate(int i13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        return a(gregorianCalendar, "yyyy", new N4(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDateIfUndefined(int i13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        return a(gregorianCalendar, "yyyy", new Yk(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDate(int i13, int i14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        gregorianCalendar.set(2, i14 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new N4(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDateIfUndefined(int i13, int i14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        gregorianCalendar.set(2, i14 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Yk(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDate(int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        gregorianCalendar.set(2, i14 - 1);
        gregorianCalendar.set(5, i15);
        return a(gregorianCalendar, "yyyy-MM-dd", new N4(this.f48890a.f46308b));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withBirthDateIfUndefined(int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        gregorianCalendar.set(2, i14 - 1);
        gregorianCalendar.set(5, i15);
        return a(gregorianCalendar, "yyyy-MM-dd", new Yk(this.f48890a.f46308b));
    }
}
