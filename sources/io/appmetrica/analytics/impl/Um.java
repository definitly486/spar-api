package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class Um extends Z2 {
    public Um(int i13, String str) {
        this(i13, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f46840a;
    }

    public Um(int i13, String str, PublicLogger publicLogger) {
        super(i13, str, publicLogger);
    }

    public final String a() {
        return this.f46841b;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i13 = this.f46840a;
            if (length <= i13) {
                return str;
            }
            String str2 = new String(bytes, 0, i13, "UTF-8");
            try {
                this.f46842c.warning("\"%s\" %s exceeded limit of %d bytes", this.f46841b, str, Integer.valueOf(this.f46840a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
