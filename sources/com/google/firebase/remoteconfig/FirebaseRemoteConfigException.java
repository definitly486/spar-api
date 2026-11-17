package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iobyxmoadg f24693zdlpuopuiu;

    public enum iobyxmoadg {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f24700zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f24700zdlpuopuiu = i13;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f24693zdlpuopuiu = iobyxmoadg.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.f24693zdlpuopuiu = iobyxmoadg.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, iobyxmoadg iobyxmoadgVar) {
        super(str);
        this.f24693zdlpuopuiu = iobyxmoadgVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, iobyxmoadg iobyxmoadgVar) {
        super(str, th2);
        this.f24693zdlpuopuiu = iobyxmoadgVar;
    }
}
