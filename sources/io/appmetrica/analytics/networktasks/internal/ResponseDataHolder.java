package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f48859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f48860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f48861d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f48861d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f48858a;
    }

    public byte[] getResponseData() {
        return this.f48859b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f48860c;
    }

    public boolean isValidResponse() {
        return this.f48861d.isResponseValid(this.f48858a);
    }

    public void setResponseCode(int i13) {
        this.f48858a = i13;
    }

    public void setResponseData(byte[] bArr) {
        this.f48859b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f48860c = map;
    }
}
