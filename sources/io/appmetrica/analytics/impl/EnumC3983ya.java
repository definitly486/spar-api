package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3983ya {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48521a;

    EnumC3983ya(int i13) {
        this.f48521a = i13;
    }

    public static EnumC3983ya a(Integer num) {
        if (num != null) {
            for (EnumC3983ya enumC3983ya : values()) {
                if (enumC3983ya.f48521a == num.intValue()) {
                    return enumC3983ya;
                }
            }
        }
        return UNKNOWN;
    }
}
