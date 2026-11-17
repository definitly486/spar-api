package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f24701yggfygwlhe;

    public FirebaseRemoteConfigFetchThrottledException(long j13) {
        this("Fetch was throttled.", j13);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j13) {
        super(str);
        this.f24701yggfygwlhe = j13;
    }
}
