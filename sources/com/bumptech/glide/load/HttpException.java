package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f20768zdlpuopuiu;

    public HttpException(int i13) {
        this("Http request failed", i13);
    }

    public HttpException(String str, int i13) {
        this(str, i13, null);
    }

    public HttpException(String str, int i13, Throwable th2) {
        super(str + ", status code: " + i13, th2);
        this.f20768zdlpuopuiu = i13;
    }
}
