package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f74137yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f74138zdlpuopuiu;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f74138zdlpuopuiu + ", URL=" + this.f74137yggfygwlhe;
    }
}
