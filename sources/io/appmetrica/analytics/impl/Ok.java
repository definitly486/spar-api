package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jk f46346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nk f46347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f46348d;

    public Ok(Context context, C3654l5 c3654l5) {
        c3654l5.a();
        this.f46345a = "session_extras";
        this.f46346b = new Jk();
        this.f46347c = new Nk();
        this.f46348d = C3880u7.a(context).a(c3654l5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f46348d.get(this.f46345a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f46346b.toModel(this.f46347c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Jk jk2 = this.f46346b;
        this.f46347c.getClass();
        return jk2.toModel(new Lk());
    }
}
