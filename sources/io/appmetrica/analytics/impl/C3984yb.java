package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3984yb {
    public static final V9 a(C3984yb c3984yb, EnumC3483ea enumC3483ea, JSONObject jSONObject) {
        int i13;
        c3984yb.getClass();
        V9 v13 = new V9();
        switch (enumC3483ea) {
            case UNKNOWN:
                i13 = 0;
                break;
            case APPSFLYER:
                i13 = 1;
                break;
            case ADJUST:
                i13 = 2;
                break;
            case KOCHAVA:
                i13 = 3;
                break;
            case TENJIN:
                i13 = 4;
                break;
            case AIRBRIDGE:
                i13 = 5;
                break;
            case SINGULAR:
                i13 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        v13.f46665a = i13;
        v13.f46666b = jSONObject.toString().getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        return v13;
    }
}
