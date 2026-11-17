package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45522a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45523b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45524c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f45522a;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE)) {
            return this.f45523b;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            return this.f45524c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Boolean a(int i13) {
        if (i13 == this.f45523b) {
            return Boolean.FALSE;
        }
        if (i13 == this.f45524c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
