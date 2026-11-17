package fc;

import bc.gxszxtbevo;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import xb.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f33405iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f33406ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f33407zoijcleaow;

    public iobyxmoadg(String str, Map map) {
        this.f33405iobyxmoadg = str;
        this.f33407zoijcleaow = map;
    }

    private String eablkybsjg(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            int i13 = bufferedReader.read(cArr);
            if (i13 == -1) {
                return sb3.toString();
            }
            sb3.append(cArr, 0, i13);
        }
    }

    private String iobyxmoadg(Map map) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb3.append((String) entry.getKey());
        sb3.append("=");
        sb3.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb3.append("&");
            sb3.append((String) entry2.getKey());
            sb3.append("=");
            sb3.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        return sb3.toString();
    }

    private String zoijcleaow(String str, Map map) {
        String strIobyxmoadg = iobyxmoadg(map);
        if (strIobyxmoadg.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strIobyxmoadg;
        }
        if (!str.endsWith("&")) {
            strIobyxmoadg = "&" + strIobyxmoadg;
        }
        return str + strIobyxmoadg;
    }

    public ppxfxbqfkf ppxfxbqfkf() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        gxszxtbevo.wkgbmnqykc();
        InputStream inputStream = null;
        String strEablkybsjg = null;
        inputStream = null;
        try {
            String strZoijcleaow = zoijcleaow(this.f33405iobyxmoadg, this.f33407zoijcleaow);
            lqeggnwhkg.gxszxtbevo().dxjokdxxww("GET Request URL: " + strZoijcleaow);
            httpsURLConnection = (HttpsURLConnection) new URL(strZoijcleaow).openConnection();
            try {
                httpsURLConnection.setReadTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                httpsURLConnection.setConnectTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f33406ppxfxbqfkf.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strEablkybsjg = eablkybsjg(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new ppxfxbqfkf(responseCode, strEablkybsjg);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public iobyxmoadg wkgbmnqykc(String str, String str2) {
        this.f33406ppxfxbqfkf.put(str, str2);
        return this;
    }
}
