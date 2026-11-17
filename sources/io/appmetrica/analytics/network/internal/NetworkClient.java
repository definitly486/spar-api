package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f48778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f48779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f48780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f48781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f48782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48783f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f48784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f48785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f48786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f48787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f48788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f48789f;

        public NetworkClient build() {
            return new NetworkClient(this.f48784a, this.f48785b, this.f48786c, this.f48787d, this.f48788e, this.f48789f, 0);
        }

        public Builder withConnectTimeout(int i13) {
            this.f48784a = Integer.valueOf(i13);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z13) {
            this.f48788e = Boolean.valueOf(z13);
            return this;
        }

        public Builder withMaxResponseSize(int i13) {
            this.f48789f = Integer.valueOf(i13);
            return this;
        }

        public Builder withReadTimeout(int i13) {
            this.f48785b = Integer.valueOf(i13);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f48786c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z13) {
            this.f48787d = Boolean.valueOf(z13);
            return this;
        }
    }

    /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i13) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f48778a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f48782e;
    }

    public int getMaxResponseSize() {
        return this.f48783f;
    }

    public Integer getReadTimeout() {
        return this.f48779b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f48780c;
    }

    public Boolean getUseCaches() {
        return this.f48781d;
    }

    public Call newCall(Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f48778a + ", readTimeout=" + this.f48779b + ", sslSocketFactory=" + this.f48780c + ", useCaches=" + this.f48781d + ", instanceFollowRedirects=" + this.f48782e + ", maxResponseSize=" + this.f48783f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f48778a = num;
        this.f48779b = num2;
        this.f48780c = sSLSocketFactory;
        this.f48781d = bool;
        this.f48782e = bool2;
        this.f48783f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
