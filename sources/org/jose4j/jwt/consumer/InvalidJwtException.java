package org.jose4j.jwt.consumer;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidJwtException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private List f74136zdlpuopuiu;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.getMessage());
        if (!this.f74136zdlpuopuiu.isEmpty()) {
            sb3.append(" Additional details: ");
            sb3.append(this.f74136zdlpuopuiu);
        }
        return sb3.toString();
    }
}
