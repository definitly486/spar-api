package io.appmetrica.analytics.network.impl;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.zdlpuopuiu;
import rg.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClient f48775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f48776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f48777c;

    public c(NetworkClient networkClient, Request request, d dVar) {
        this.f48775a = networkClient;
        this.f48776b = request;
        this.f48777c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f48776b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f48775a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f48775a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f48775a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f48775a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f48776b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f48775a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    public final Response execute() {
        Map<String, List<String>> headerFields;
        Throwable th2;
        int responseCode;
        boolean z13;
        Throwable th3;
        byte[] bArr;
        byte[] bArrA;
        int i13;
        try {
            d dVar = this.f48777c;
            String url = this.f48776b.getUrl();
            dVar.getClass();
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            HttpsURLConnection httpsURLConnection = uRLConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f48776b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrA2 = new byte[0];
            byte[] bArr2 = new byte[0];
            try {
                a(httpsURLConnection);
                if (zdlpuopuiu.eablkybsjg(this.f48776b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f48776b.getBody());
                            outputStream.flush();
                            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                            zoijcleaow.iobyxmoadg(outputStream, null);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                zoijcleaow.iobyxmoadg(outputStream, th4);
                                throw th5;
                            }
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
                try {
                    headerFields = httpsURLConnection.getHeaderFields();
                    try {
                        bArrA2 = e.a(this.f48775a.getMaxResponseSize(), new a(httpsURLConnection));
                        th3 = null;
                        bArr = bArrA2;
                        bArrA = e.a(this.f48775a.getMaxResponseSize(), new b(httpsURLConnection));
                        i13 = responseCode;
                        z13 = true;
                    } catch (Throwable th6) {
                        th2 = th6;
                        z13 = false;
                        th3 = th2;
                        bArr = bArrA2;
                        bArrA = bArr2;
                        i13 = responseCode;
                    }
                } catch (Throwable th7) {
                    headerFields = null;
                    th2 = th7;
                }
            } catch (Throwable th8) {
                headerFields = null;
                th2 = th8;
                responseCode = 0;
            }
            Map<String, List<String>> map = headerFields;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z13, i13, bArr, bArrA, map, th3);
        } catch (Throwable th9) {
            return new Response(th9);
        }
    }

    public c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new d());
    }
}
