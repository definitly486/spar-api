package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3937we {
    public static final V9 a(C3937we c3937we, EnumC3483ea enumC3483ea, Object obj) {
        int i13;
        c3937we.getClass();
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
        C3962xe.f48427b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        v13.f46666b = jSONObject.toString().getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        return v13;
    }
}
