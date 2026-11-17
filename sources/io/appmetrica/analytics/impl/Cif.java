package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cif implements InterfaceC3687md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47443c;

    public Cif(Context context, String str, String str2) {
        this.f47441a = context;
        this.f47442b = str;
        this.f47443c = str2;
    }

    public final Cif a(Context context, String str, String str2) {
        return new Cif(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cif)) {
            return false;
        }
        Cif cif = (Cif) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f47441a, cif.f47441a) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f47442b, cif.f47442b) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f47443c, cif.f47443c);
    }

    public final int hashCode() {
        return this.f47443c.hashCode() + ((this.f47442b.hashCode() + (this.f47441a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f47441a + ", prefName=" + this.f47442b + ", prefValueName=" + this.f47443c + ')';
    }

    public static Cif a(Cif cif, Context context, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            context = cif.f47441a;
        }
        if ((i13 & 2) != 0) {
            str = cif.f47442b;
        }
        if ((i13 & 4) != 0) {
            str2 = cif.f47443c;
        }
        cif.getClass();
        return new Cif(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3687md
    public final String a() {
        String string = this.f47441a.getSharedPreferences(this.f47442b, 0).getString(this.f47443c, "");
        return string == null ? "" : string;
    }
}
