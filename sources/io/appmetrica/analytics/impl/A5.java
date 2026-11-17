package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class A5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f45437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45438b;

    public A5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f45437a = iExecutionPolicyArr;
        this.f45438b = "Composite of {" + hg.agtfadlqog.wizcaqwiak(iExecutionPolicyArr, ", ", null, null, 0, null, C4003z5.f48550a, 30, null) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x001b A[RETURN] */
    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy[] iExecutionPolicyArr = this.f45437a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        for (IExecutionPolicy iExecutionPolicy : iExecutionPolicyArr) {
            if (!iExecutionPolicy.canBeExecuted()) {
                if (iExecutionPolicy != null) {
                    return false;
                }
                return true;
            }
        }
        iExecutionPolicy = null;
        if (iExecutionPolicy != null) {
            return false;
        }
        return true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f45438b;
    }
}
