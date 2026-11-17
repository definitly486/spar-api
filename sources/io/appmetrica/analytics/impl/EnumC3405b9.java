package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3405b9 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46959a;

    EnumC3405b9(int i13) {
        this.f46959a = i13;
    }

    public static EnumC3405b9 a(Integer num) {
        if (num != null) {
            for (EnumC3405b9 enumC3405b9 : values()) {
                if (enumC3405b9.f46959a == num.intValue()) {
                    return enumC3405b9;
                }
            }
        }
        return NONE;
    }
}
