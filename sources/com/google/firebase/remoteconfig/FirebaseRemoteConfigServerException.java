package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f24702yggfygwlhe;

    public FirebaseRemoteConfigServerException(int i13, String str) {
        super(str);
        this.f24702yggfygwlhe = i13;
    }

    public int iobyxmoadg() {
        return this.f24702yggfygwlhe;
    }

    public FirebaseRemoteConfigServerException(int i13, String str, Throwable th2) {
        super(str, th2);
        this.f24702yggfygwlhe = i13;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.iobyxmoadg iobyxmoadgVar) {
        super(str, iobyxmoadgVar);
        this.f24702yggfygwlhe = -1;
    }

    public FirebaseRemoteConfigServerException(int i13, String str, FirebaseRemoteConfigException.iobyxmoadg iobyxmoadgVar) {
        super(str, iobyxmoadgVar);
        this.f24702yggfygwlhe = i13;
    }
}
