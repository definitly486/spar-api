package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3664lf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47657c = "lf";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3433cb f47658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47659b;

    public AbstractC3664lf(InterfaceC3433cb interfaceC3433cb, String str) {
        this.f47658a = interfaceC3433cb;
        this.f47659b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T a(String str, float f13) {
        synchronized (this) {
            this.f47658a.a(str, f13);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T b(String str, String str2) {
        synchronized (this) {
            this.f47658a.a(str, str2);
        }
        return this;
    }

    public final C3689mf c(String str) {
        return new C3689mf(str, this.f47659b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T d(String str) {
        synchronized (this) {
            this.f47658a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f47658a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f47658a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T b(String str, long j13) {
        synchronized (this) {
            this.f47658a.a(str, j13);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T b(String str, int i13) {
        synchronized (this) {
            this.f47658a.a(i13, str);
        }
        return this;
    }

    public final <T extends AbstractC3664lf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j13) {
        return this.f47658a.getLong(str, j13);
    }

    public final int a(String str, int i13) {
        return this.f47658a.getInt(str, i13);
    }

    public final String a(String str, String str2) {
        return this.f47658a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3664lf> T b(String str, boolean z13) {
        synchronized (this) {
            this.f47658a.a(str, z13);
        }
        return this;
    }

    public final boolean a(String str, boolean z13) {
        return this.f47658a.getBoolean(str, z13);
    }

    public final void b() {
        synchronized (this) {
            this.f47658a.b();
        }
    }

    public final boolean b(String str) {
        return this.f47658a.a(str);
    }
}
