package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3837se {
    public static final V9 a(C3837se c3837se, EnumC3483ea enumC3483ea) {
        int i13;
        c3837se.getClass();
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
        return v13;
    }
}
