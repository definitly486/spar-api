package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class Wm extends Z2 {
    public Wm(int i13, String str) {
        this(i13, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f46840a;
    }

    public Wm(int i13, String str, PublicLogger publicLogger) {
        super(i13, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.In
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i13 = this.f46840a;
            if (length > i13) {
                String strSubstring = str.substring(0, i13);
                this.f46842c.warning("\"%s\" %s size exceeded limit of %d characters", this.f46841b, str, Integer.valueOf(this.f46840a));
                return strSubstring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f46841b;
    }
}
