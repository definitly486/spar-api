package nb2;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsException;

/* JADX INFO: loaded from: classes6.dex */
public final class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final cdpycssgdh f69608iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final hkdspvbjdz f69609ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final gg.gtknphoqwx f69610wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vdvldrhtss f69611zoijcleaow;

    public ribwqtqdhb(cdpycssgdh endpointProvider, vdvldrhtss remoteMetricsEventDtoSerializer, iwizpuwonk.zoijcleaow logger) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(endpointProvider, "endpointProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteMetricsEventDtoSerializer, "remoteMetricsEventDtoSerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logger, "logger");
        this.f69608iobyxmoadg = endpointProvider;
        this.f69611zoijcleaow = remoteMetricsEventDtoSerializer;
        this.f69609ppxfxbqfkf = logger;
        this.f69610wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new ulzqkzuiru(this));
    }

    public static final boolean wkgbmnqykc(URL this_createHostnameVerifier, String str, SSLSession sSLSession) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this_createHostnameVerifier, "$this_createHostnameVerifier");
        return str.equals(this_createHostnameVerifier.getHost());
    }

    public static HostnameVerifier zoijcleaow(final URL url) {
        return new HostnameVerifier() { // from class: nb2.jlmebxxoox
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return ribwqtqdhb.wkgbmnqykc(url, str, sSLSession);
            }
        };
    }

    public final void eablkybsjg(ArrayList values) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        HttpsURLConnection httpsURLConnection = null;
        try {
            String strIobyxmoadg = iobyxmoadg(values);
            HttpsURLConnection httpsURLConnectionPpxfxbqfkf = ppxfxbqfkf();
            OutputStream outputStream = httpsURLConnectionPpxfxbqfkf.getOutputStream();
            try {
                byte[] bytes = strIobyxmoadg.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(outputStream, null);
                try {
                    this.f69609ppxfxbqfkf.iobyxmoadg(new sopmlzcsov(httpsURLConnectionPpxfxbqfkf.getURL(), httpsURLConnectionPpxfxbqfkf.getResponseCode(), strIobyxmoadg));
                    httpsURLConnectionPpxfxbqfkf.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    httpsURLConnection = httpsURLConnectionPpxfxbqfkf;
                    try {
                        this.f69609ppxfxbqfkf.iobyxmoadg(new crxdokpmqz(th));
                        throw new MetricsException.NetworkError("Http request was failed", th);
                    } catch (Throwable th3) {
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    rg.zoijcleaow.iobyxmoadg(outputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final String iobyxmoadg(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rgvfuqvkyq remoteMetricsEventDto = (rgvfuqvkyq) it.next();
            this.f69611zoijcleaow.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteMetricsEventDto, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", remoteMetricsEventDto.f69603eablkybsjg.zoijcleaow());
            jSONObject2.put("user_id", remoteMetricsEventDto.f69605ppxfxbqfkf);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", remoteMetricsEventDto.f69604iobyxmoadg);
            String str = remoteMetricsEventDto.f69606wkgbmnqykc;
            if (str == null) {
                str = null;
            }
            jSONObject3.put("appVersion", str);
            jSONObject3.put("userIdSdk", remoteMetricsEventDto.f69605ppxfxbqfkf);
            jSONObject3.put("time", String.valueOf(remoteMetricsEventDto.f69603eablkybsjg.ppxfxbqfkf()));
            for (Map.Entry entry : remoteMetricsEventDto.f69603eablkybsjg.iobyxmoadg().entrySet()) {
                jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String string = jSONObject2.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "jsonObject.toString()");
            jSONArray.put(new JSONObject(string));
        }
        jSONObject.put("events", jSONArray);
        String string2 = jSONObject.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "jsonObject.toString()");
        return string2;
    }

    public final HttpsURLConnection ppxfxbqfkf() throws ProtocolException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) this.f69610wkgbmnqykc.getValue()).openConnection());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        URL backendUrl = (URL) this.f69610wkgbmnqykc.getValue();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(backendUrl, "backendUrl");
        httpsURLConnection.setHostnameVerifier(zoijcleaow(backendUrl));
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
