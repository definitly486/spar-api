package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class G {
    public static /* synthetic */ String a(int i13) {
        if (i13 == 1) {
            return "ALLOWED";
        }
        if (i13 == 2) {
            return "FORBIDDEN_BY_CLIENT_CONFIG";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "UNKNOWN";
        }
        return "FORBIDDEN_BY_REMOTE_CONFIG";
    }
}
