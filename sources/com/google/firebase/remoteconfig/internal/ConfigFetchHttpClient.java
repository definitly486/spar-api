package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Pattern f24703nufgyqmvbu = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f24704eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f24705gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24706iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f24707lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24708ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f24709wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24710zoijcleaow;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j13, long j14) {
        this.f24706iobyxmoadg = context;
        this.f24710zoijcleaow = str;
        this.f24708ppxfxbqfkf = str2;
        this.f24709wkgbmnqykc = gxszxtbevo(str);
        this.f24704eablkybsjg = str3;
        this.f24705gxszxtbevo = j13;
        this.f24707lqeggnwhkg = j14;
    }

    private void btonecajqb(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f24708ppxfxbqfkf);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f24706iobyxmoadg.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", dxjokdxxww());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        httpURLConnection.setRequestProperty("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
    }

    private void draadjrbmk(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private String dxjokdxxww() {
        try {
            Context context = this.f24706iobyxmoadg;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f24706iobyxmoadg.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e13) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f24706iobyxmoadg.getPackageName(), e13);
            return null;
        }
    }

    private static lqeggnwhkg eablkybsjg(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            lqeggnwhkg.zoijcleaow zoijcleaowVarWkgbmnqykc = lqeggnwhkg.draadjrbmk().wkgbmnqykc(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                zoijcleaowVarWkgbmnqykc = zoijcleaowVarWkgbmnqykc.zoijcleaow(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                zoijcleaowVarWkgbmnqykc = zoijcleaowVarWkgbmnqykc.ppxfxbqfkf(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                zoijcleaowVarWkgbmnqykc = zoijcleaowVarWkgbmnqykc.eablkybsjg(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                zoijcleaowVarWkgbmnqykc.lqeggnwhkg(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                zoijcleaowVarWkgbmnqykc = zoijcleaowVarWkgbmnqykc.gxszxtbevo(jSONArray2);
            }
            return zoijcleaowVarWkgbmnqykc.iobyxmoadg();
        } catch (JSONException e13) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e13);
        }
    }

    private void gtknphoqwx(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private static String gxszxtbevo(String str) {
        Matcher matcher = f24703nufgyqmvbu.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private boolean iobyxmoadg(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private JSONObject lqeggnwhkg(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            int i13 = bufferedReader.read();
            if (i13 == -1) {
                return new JSONObject(sb3.toString());
            }
            sb3.append((char) i13);
        }
    }

    private String nufgyqmvbu(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private JSONObject ppxfxbqfkf(String str, String str2, Map map, Long l13) throws FirebaseRemoteConfigClientException {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f24710zoijcleaow);
        Locale locale = this.f24706iobyxmoadg.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i13 = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i13));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f24706iobyxmoadg.getPackageManager().getPackageInfo(this.f24706iobyxmoadg.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(h1.iobyxmoadg.iobyxmoadg(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.f24706iobyxmoadg.getPackageName());
        map2.put("sdkVersion", "22.0.1");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l13 != null) {
            map2.put("firstOpenTime", zoijcleaow(l13.longValue()));
        }
        return new JSONObject(map2);
    }

    private void wflxmlrfwp(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f24705gxszxtbevo));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f24707lqeggnwhkg));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        btonecajqb(httpURLConnection, str2);
        gtknphoqwx(httpURLConnection, map);
    }

    private String zoijcleaow(long j13) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j13));
    }

    @Keep
    wflxmlrfwp.iobyxmoadg fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l13, Date date) throws FirebaseRemoteConfigException {
        wflxmlrfwp(httpURLConnection, str3, str2, map2);
        try {
            try {
                draadjrbmk(httpURLConnection, ppxfxbqfkf(str, str2, map, l13).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectLqeggnwhkg = lqeggnwhkg(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg(jSONObjectLqeggnwhkg, date);
                return !iobyxmoadg(jSONObjectLqeggnwhkg) ? wflxmlrfwp.iobyxmoadg.iobyxmoadg(date, lqeggnwhkgVarEablkybsjg) : wflxmlrfwp.iobyxmoadg.zoijcleaow(lqeggnwhkgVarEablkybsjg, headerField);
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        } catch (IOException | JSONException e13) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e13);
        }
    }

    HttpURLConnection wkgbmnqykc() {
        try {
            return (HttpURLConnection) new URL(nufgyqmvbu(this.f24709wkgbmnqykc, this.f24704eablkybsjg)).openConnection();
        } catch (IOException e13) {
            throw new FirebaseRemoteConfigException(e13.getMessage());
        }
    }
}
