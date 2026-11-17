package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f48800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f48801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f48802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f48803f;

    public Response(Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public int getCode() {
        return this.f48799b;
    }

    public byte[] getErrorData() {
        return this.f48801d;
    }

    public Throwable getException() {
        return this.f48803f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f48802e;
    }

    public byte[] getResponseData() {
        return this.f48800c;
    }

    public boolean isCompleted() {
        return this.f48798a;
    }

    public String toString() {
        return "Response{completed=" + this.f48798a + ", code=" + this.f48799b + ", responseDataLength=" + this.f48800c.length + ", errorDataLength=" + this.f48801d.length + ", headers=" + this.f48802e + ", exception=" + this.f48803f + '}';
    }

    public Response(boolean z13, int i13, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th2) {
        this.f48798a = z13;
        this.f48799b = i13;
        this.f48800c = bArr;
        this.f48801d = bArr2;
        this.f48802e = map == null ? Collections.emptyMap() : e.a(map);
        this.f48803f = th2;
    }
}
