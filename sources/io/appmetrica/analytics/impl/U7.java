package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3459db f46601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46602b = "";

    public U7(InterfaceC3459db interfaceC3459db) {
        this.f46601a = interfaceC3459db;
    }

    public final void a(String str, boolean z13) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f46602b, str)) {
                return;
            }
            this.f46602b = str;
            this.f46601a.a(str, z13);
        }
    }
}
