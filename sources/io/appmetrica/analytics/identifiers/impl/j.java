package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f45420a;

    public j(f fVar) {
        this.f45420a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        f fVar;
        try {
            try {
                try {
                    try {
                        m mVar = (m) ((o) this.f45420a.a(context));
                        cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                        fVar = this.f45420a;
                    } catch (g e13) {
                        String message = e13.getMessage();
                        if (message == null) {
                            message = "unknown exception during binding huawei services";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                        fVar = this.f45420a;
                    }
                } catch (Throwable th2) {
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "exception while fetching hoaid: " + th2.getMessage());
                    fVar = this.f45420a;
                }
                fVar.b(context);
            } catch (Throwable th3) {
                try {
                    this.f45420a.b(context);
                } catch (Throwable unused) {
                }
                throw th3;
            }
        } catch (Throwable unused2) {
        }
        return cVar;
    }

    public j() {
        this(new f(k.f45421a, i.f45419a, "huawei"));
    }
}
