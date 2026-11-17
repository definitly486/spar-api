package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f48792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f48793d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f48795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f48796c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f48797d = new HashMap();

        public Builder(String str) {
            this.f48794a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f48797d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f48794a, this.f48795b, this.f48796c, this.f48797d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f48796c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f48795b = str;
            return this;
        }
    }

    /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i13) {
        this(str, str2, bArr, map);
    }

    public byte[] getBody() {
        return this.f48792c;
    }

    public Map<String, String> getHeaders() {
        return this.f48793d;
    }

    public String getMethod() {
        return this.f48791b;
    }

    public String getUrl() {
        return this.f48790a;
    }

    public String toString() {
        return "Request{url=" + this.f48790a + ", method='" + this.f48791b + "', bodyLength=" + this.f48792c.length + ", headers=" + this.f48793d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f48790a = str;
        this.f48791b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f48792c = bArr;
        this.f48793d = e.a(map);
    }
}
