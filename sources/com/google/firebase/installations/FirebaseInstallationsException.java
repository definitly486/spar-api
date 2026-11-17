package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iobyxmoadg f24263zdlpuopuiu;

    public enum iobyxmoadg {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(iobyxmoadg iobyxmoadgVar) {
        this.f24263zdlpuopuiu = iobyxmoadgVar;
    }

    public FirebaseInstallationsException(String str, iobyxmoadg iobyxmoadgVar) {
        super(str);
        this.f24263zdlpuopuiu = iobyxmoadgVar;
    }
}
