package com.google.mlkit.common;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f25222zdlpuopuiu;

    public MlKitException(String str, int i13) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f25222zdlpuopuiu = i13;
    }

    public int iobyxmoadg() {
        return this.f25222zdlpuopuiu;
    }

    public MlKitException(String str, int i13, Throwable th2) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), th2);
        this.f25222zdlpuopuiu = i13;
    }
}
