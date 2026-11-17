package wc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;
import rc.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f119272iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f119273ppxfxbqfkf = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tc.zoijcleaow f119274zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f119271wkgbmnqykc = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Charset f119270eablkybsjg = Charset.forName("UTF-8");

    public ppxfxbqfkf(Context context, tc.zoijcleaow zoijcleaowVar) {
        this.f119272iobyxmoadg = context;
        this.f119274zoijcleaow = zoijcleaowVar;
    }

    private wkgbmnqykc agtfadlqog(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f119270eablkybsjg));
        gxszxtbevo.iobyxmoadg iobyxmoadgVarIobyxmoadg = gxszxtbevo.iobyxmoadg();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = wkgbmnqykc.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(ExternalMetricsManagerImpl.NAME)) {
                iobyxmoadgVarIobyxmoadg2.gxszxtbevo(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                iobyxmoadgVarIobyxmoadg2.ppxfxbqfkf(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                iobyxmoadgVarIobyxmoadg2.wkgbmnqykc(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        iobyxmoadgVarIobyxmoadg.wkgbmnqykc(wflxmlrfwp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                iobyxmoadgVarIobyxmoadg2.zoijcleaow(iobyxmoadgVarIobyxmoadg.iobyxmoadg());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return iobyxmoadgVarIobyxmoadg2.eablkybsjg(wkgbmnqykc.zoijcleaow.OK).iobyxmoadg();
    }

    private static void btonecajqb() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private HttpURLConnection draadjrbmk(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            httpURLConnection.addRequestProperty("Content-Type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
            httpURLConnection.addRequestProperty("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f119272iobyxmoadg.getPackageName());
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) this.f119274zoijcleaow.get();
            if (dxjokdxxwwVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(dxjokdxxwwVar.iobyxmoadg()));
                } catch (InterruptedException e13) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e13);
                } catch (ExecutionException e14) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e14);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", gxszxtbevo());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
        }
    }

    private static boolean dxjokdxxww(int i13) {
        return i13 >= 200 && i13 < 300;
    }

    private static void gtknphoqwx(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strOjitshcjhn = ojitshcjhn(httpURLConnection);
        if (TextUtils.isEmpty(strOjitshcjhn)) {
            return;
        }
        Log.w("Firebase-Installations", strOjitshcjhn);
        Log.w("Firebase-Installations", iobyxmoadg(str, str2, str3));
    }

    private String gxszxtbevo() {
        try {
            Context context = this.f119272iobyxmoadg;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f119272iobyxmoadg.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e13) {
            Log.e("ContentValues", "No such package: " + this.f119272iobyxmoadg.getPackageName(), e13);
            return null;
        }
    }

    private static String iobyxmoadg(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static void kcexrzcfyt(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private URL lqeggnwhkg(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e13) {
            throw new FirebaseInstallationsException(e13.getMessage(), FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
        }
    }

    private static byte[] nufgyqmvbu(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static String ojitshcjhn(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f119270eablkybsjg));
        try {
            try {
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb3.append(line);
                    sb3.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb3);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    private void oxmwwwfdhm(HttpURLConnection httpURLConnection) throws IOException {
        kcexrzcfyt(httpURLConnection, nufgyqmvbu(ppxfxbqfkf()));
    }

    private static JSONObject ppxfxbqfkf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e13) {
            throw new IllegalStateException(e13);
        }
    }

    private gxszxtbevo rgvfuqvkyq(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f119270eablkybsjg));
        gxszxtbevo.iobyxmoadg iobyxmoadgVarIobyxmoadg = gxszxtbevo.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                iobyxmoadgVarIobyxmoadg.wkgbmnqykc(wflxmlrfwp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return iobyxmoadgVarIobyxmoadg.zoijcleaow(gxszxtbevo.zoijcleaow.OK).iobyxmoadg();
    }

    private void vdvldrhtss(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        kcexrzcfyt(httpURLConnection, nufgyqmvbu(zoijcleaow(str, str2)));
    }

    static long wflxmlrfwp(String str) {
        Preconditions.checkArgument(f119271wkgbmnqykc.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static JSONObject zoijcleaow(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public gxszxtbevo eablkybsjg(String str, String str2, String str3, String str4) {
        gxszxtbevo gxszxtbevoVarRgvfuqvkyq;
        if (!this.f119273ppxfxbqfkf.zoijcleaow()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
        }
        URL urlLqeggnwhkg = lqeggnwhkg(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i13 = 0; i13 <= 1; i13++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionDraadjrbmk = draadjrbmk(urlLqeggnwhkg, str);
            try {
                try {
                    httpURLConnectionDraadjrbmk.setRequestMethod("POST");
                    httpURLConnectionDraadjrbmk.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionDraadjrbmk.setDoOutput(true);
                    oxmwwwfdhm(httpURLConnectionDraadjrbmk);
                    int responseCode = httpURLConnectionDraadjrbmk.getResponseCode();
                    this.f119273ppxfxbqfkf.gxszxtbevo(responseCode);
                    if (dxjokdxxww(responseCode)) {
                        gxszxtbevoVarRgvfuqvkyq = rgvfuqvkyq(httpURLConnectionDraadjrbmk);
                    } else {
                        gtknphoqwx(httpURLConnectionDraadjrbmk, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            gxszxtbevoVarRgvfuqvkyq = gxszxtbevo.iobyxmoadg().zoijcleaow(gxszxtbevo.zoijcleaow.AUTH_ERROR).iobyxmoadg();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.iobyxmoadg.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                btonecajqb();
                                gxszxtbevoVarRgvfuqvkyq = gxszxtbevo.iobyxmoadg().zoijcleaow(gxszxtbevo.zoijcleaow.BAD_CONFIG).iobyxmoadg();
                            }
                            httpURLConnectionDraadjrbmk.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionDraadjrbmk.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return gxszxtbevoVarRgvfuqvkyq;
                } catch (Throwable th2) {
                    httpURLConnectionDraadjrbmk.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
    }

    public wkgbmnqykc wkgbmnqykc(String str, String str2, String str3, String str4, String str5) {
        wkgbmnqykc wkgbmnqykcVarAgtfadlqog;
        if (!this.f119273ppxfxbqfkf.zoijcleaow()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
        }
        URL urlLqeggnwhkg = lqeggnwhkg(String.format("projects/%s/installations", str3));
        for (int i13 = 0; i13 <= 1; i13++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionDraadjrbmk = draadjrbmk(urlLqeggnwhkg, str);
            try {
                try {
                    httpURLConnectionDraadjrbmk.setRequestMethod("POST");
                    httpURLConnectionDraadjrbmk.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionDraadjrbmk.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    vdvldrhtss(httpURLConnectionDraadjrbmk, str2, str4);
                    int responseCode = httpURLConnectionDraadjrbmk.getResponseCode();
                    this.f119273ppxfxbqfkf.gxszxtbevo(responseCode);
                    if (dxjokdxxww(responseCode)) {
                        wkgbmnqykcVarAgtfadlqog = agtfadlqog(httpURLConnectionDraadjrbmk);
                    } else {
                        gtknphoqwx(httpURLConnectionDraadjrbmk, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.iobyxmoadg.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            btonecajqb();
                            wkgbmnqykcVarAgtfadlqog = wkgbmnqykc.iobyxmoadg().eablkybsjg(wkgbmnqykc.zoijcleaow.BAD_CONFIG).iobyxmoadg();
                        }
                        httpURLConnectionDraadjrbmk.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionDraadjrbmk.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return wkgbmnqykcVarAgtfadlqog;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionDraadjrbmk.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
    }
}
