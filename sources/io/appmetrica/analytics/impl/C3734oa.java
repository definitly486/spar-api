package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3734oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tl f47825a = new Tl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3784qa f47826b = new C3784qa();

    public final synchronized void a(C3784qa c3784qa) {
        this.f47826b = c3784qa;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f47826b.f47915a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C3784qa c3784qa = this.f47826b;
                    IdentifierStatus identifierStatus = c3784qa.f47916b;
                    String str2 = c3784qa.f47917c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f47825a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
