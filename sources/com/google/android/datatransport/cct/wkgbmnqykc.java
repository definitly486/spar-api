package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.encoders.EncodingException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import p9.agtfadlqog;
import p9.cqumvgiudr;
import p9.iwizpuwonk;
import p9.jyumaefscl;
import p9.kcexrzcfyt;
import p9.ojitshcjhn;
import p9.oxmwwwfdhm;
import p9.rgvfuqvkyq;
import p9.vdvldrhtss;
import p9.yggfygwlhe;
import p9.zdlpuopuiu;
import q9.dxjokdxxww;
import q9.nufgyqmvbu;
import r9.gxszxtbevo;
import r9.lqeggnwhkg;
import r9.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc implements wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final aa.iobyxmoadg f21809eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final aa.iobyxmoadg f21810gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mc.iobyxmoadg f21811iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f21812lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f21813ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final URL f21814wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConnectivityManager f21815zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final URL f21816iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final String f21817ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final agtfadlqog f21818zoijcleaow;

        iobyxmoadg(URL url, agtfadlqog agtfadlqogVar, String str) {
            this.f21816iobyxmoadg = url;
            this.f21818zoijcleaow = agtfadlqogVar;
            this.f21817ppxfxbqfkf = str;
        }

        iobyxmoadg iobyxmoadg(URL url) {
            return new iobyxmoadg(url, this.f21818zoijcleaow, this.f21817ppxfxbqfkf);
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f21819iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final long f21820ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final URL f21821zoijcleaow;

        zoijcleaow(int i13, URL url, long j13) {
            this.f21819iobyxmoadg = i13;
            this.f21821zoijcleaow = url;
            this.f21820ppxfxbqfkf = j13;
        }
    }

    wkgbmnqykc(Context context, aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2, int i13) {
        this.f21811iobyxmoadg = agtfadlqog.zoijcleaow();
        this.f21813ppxfxbqfkf = context;
        this.f21815zoijcleaow = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21814wkgbmnqykc = ojitshcjhn(com.google.android.datatransport.cct.iobyxmoadg.f21805ppxfxbqfkf);
        this.f21809eablkybsjg = iobyxmoadgVar2;
        this.f21810gxszxtbevo = iobyxmoadgVar;
        this.f21812lqeggnwhkg = i13;
    }

    private static InputStream agtfadlqog(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private agtfadlqog btonecajqb(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.iobyxmoadg iobyxmoadgVarDraadjrbmk;
        HashMap map = new HashMap();
        for (dxjokdxxww dxjokdxxwwVar : gxszxtbevoVar.zoijcleaow()) {
            String strAgtfadlqog = dxjokdxxwwVar.agtfadlqog();
            if (map.containsKey(strAgtfadlqog)) {
                ((List) map.get(strAgtfadlqog)).add(dxjokdxxwwVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dxjokdxxwwVar);
                map.put(strAgtfadlqog, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) ((List) entry.getValue()).get(0);
            yggfygwlhe.iobyxmoadg iobyxmoadgVarZoijcleaow = yggfygwlhe.iobyxmoadg().gxszxtbevo(cqumvgiudr.DEFAULT).lqeggnwhkg(this.f21810gxszxtbevo.wflxmlrfwp()).nufgyqmvbu(this.f21809eablkybsjg.wflxmlrfwp()).zoijcleaow(ojitshcjhn.iobyxmoadg().ppxfxbqfkf(ojitshcjhn.zoijcleaow.ANDROID_FIREBASE).zoijcleaow(p9.iobyxmoadg.iobyxmoadg().wflxmlrfwp(Integer.valueOf(dxjokdxxwwVar2.dxjokdxxww("sdk-version"))).btonecajqb(dxjokdxxwwVar2.zoijcleaow(CommonUrlParts.MODEL)).gxszxtbevo(dxjokdxxwwVar2.zoijcleaow("hardware")).wkgbmnqykc(dxjokdxxwwVar2.zoijcleaow("device")).draadjrbmk(dxjokdxxwwVar2.zoijcleaow("product")).gtknphoqwx(dxjokdxxwwVar2.zoijcleaow("os-uild")).nufgyqmvbu(dxjokdxxwwVar2.zoijcleaow(CommonUrlParts.MANUFACTURER)).eablkybsjg(dxjokdxxwwVar2.zoijcleaow("fingerprint")).ppxfxbqfkf(dxjokdxxwwVar2.zoijcleaow("country")).lqeggnwhkg(dxjokdxxwwVar2.zoijcleaow(CommonUrlParts.LOCALE)).dxjokdxxww(dxjokdxxwwVar2.zoijcleaow("mcc_mnc")).zoijcleaow(dxjokdxxwwVar2.zoijcleaow("application_build")).iobyxmoadg()).iobyxmoadg());
            try {
                iobyxmoadgVarZoijcleaow.dxjokdxxww(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                iobyxmoadgVarZoijcleaow.btonecajqb((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (dxjokdxxww dxjokdxxwwVar3 : (List) entry.getValue()) {
                nufgyqmvbu nufgyqmvbuVarEablkybsjg = dxjokdxxwwVar3.eablkybsjg();
                o9.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = nufgyqmvbuVarEablkybsjg.zoijcleaow();
                if (ppxfxbqfkfVarZoijcleaow.equals(o9.ppxfxbqfkf.zoijcleaow("proto"))) {
                    iobyxmoadgVarDraadjrbmk = zdlpuopuiu.draadjrbmk(nufgyqmvbuVarEablkybsjg.iobyxmoadg());
                } else if (ppxfxbqfkfVarZoijcleaow.equals(o9.ppxfxbqfkf.zoijcleaow("json"))) {
                    iobyxmoadgVarDraadjrbmk = zdlpuopuiu.gtknphoqwx(new String(nufgyqmvbuVarEablkybsjg.iobyxmoadg(), Charset.forName("UTF-8")));
                } else {
                    u9.iobyxmoadg.gxszxtbevo("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", ppxfxbqfkfVarZoijcleaow);
                }
                iobyxmoadgVarDraadjrbmk.wkgbmnqykc(dxjokdxxwwVar3.gxszxtbevo()).eablkybsjg(dxjokdxxwwVar3.ojitshcjhn()).btonecajqb(dxjokdxxwwVar3.btonecajqb("tz-offset")).lqeggnwhkg(iwizpuwonk.iobyxmoadg().ppxfxbqfkf(iwizpuwonk.ppxfxbqfkf.iobyxmoadg(dxjokdxxwwVar3.dxjokdxxww("net-type"))).zoijcleaow(iwizpuwonk.zoijcleaow.iobyxmoadg(dxjokdxxwwVar3.dxjokdxxww("mobile-subtype"))).iobyxmoadg());
                if (dxjokdxxwwVar3.wkgbmnqykc() != null) {
                    iobyxmoadgVarDraadjrbmk.ppxfxbqfkf(dxjokdxxwwVar3.wkgbmnqykc());
                }
                if (dxjokdxxwwVar3.draadjrbmk() != null) {
                    iobyxmoadgVarDraadjrbmk.zoijcleaow(rgvfuqvkyq.iobyxmoadg().zoijcleaow(kcexrzcfyt.iobyxmoadg().zoijcleaow(oxmwwwfdhm.iobyxmoadg().zoijcleaow(dxjokdxxwwVar3.draadjrbmk()).iobyxmoadg()).iobyxmoadg()).ppxfxbqfkf(rgvfuqvkyq.zoijcleaow.EVENT_OVERRIDE).iobyxmoadg());
                }
                if (dxjokdxxwwVar3.lqeggnwhkg() != null || dxjokdxxwwVar3.nufgyqmvbu() != null) {
                    vdvldrhtss.iobyxmoadg iobyxmoadgVarIobyxmoadg = vdvldrhtss.iobyxmoadg();
                    if (dxjokdxxwwVar3.lqeggnwhkg() != null) {
                        iobyxmoadgVarIobyxmoadg.zoijcleaow(dxjokdxxwwVar3.lqeggnwhkg());
                    }
                    if (dxjokdxxwwVar3.nufgyqmvbu() != null) {
                        iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(dxjokdxxwwVar3.nufgyqmvbu());
                    }
                    iobyxmoadgVarDraadjrbmk.gxszxtbevo(iobyxmoadgVarIobyxmoadg.iobyxmoadg());
                }
                arrayList3.add(iobyxmoadgVarDraadjrbmk.iobyxmoadg());
            }
            iobyxmoadgVarZoijcleaow.ppxfxbqfkf(arrayList3);
            arrayList2.add(iobyxmoadgVarZoijcleaow.iobyxmoadg());
        }
        return agtfadlqog.iobyxmoadg(arrayList2);
    }

    static long draadjrbmk() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static int dxjokdxxww(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e13) {
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Unable to find version code for package", e13);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zoijcleaow eablkybsjg(iobyxmoadg iobyxmoadgVar) throws IOException {
        u9.iobyxmoadg.eablkybsjg("CctTransportBackend", "Making request to: %s", iobyxmoadgVar.f21816iobyxmoadg);
        HttpURLConnection httpURLConnection = (HttpURLConnection) iobyxmoadgVar.f21816iobyxmoadg.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f21812lqeggnwhkg);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = iobyxmoadgVar.f21817ppxfxbqfkf;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f21811iobyxmoadg.iobyxmoadg(iobyxmoadgVar.f21818zoijcleaow, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    u9.iobyxmoadg.eablkybsjg("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    u9.iobyxmoadg.iobyxmoadg("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    u9.iobyxmoadg.iobyxmoadg("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new zoijcleaow(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new zoijcleaow(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamAgtfadlqog = agtfadlqog(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            zoijcleaow zoijcleaowVar = new zoijcleaow(responseCode, null, jyumaefscl.zoijcleaow(new BufferedReader(new InputStreamReader(inputStreamAgtfadlqog))).ppxfxbqfkf());
                            if (inputStreamAgtfadlqog != null) {
                                inputStreamAgtfadlqog.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return zoijcleaowVar;
                        } catch (Throwable th2) {
                            if (inputStreamAgtfadlqog != null) {
                                try {
                                    inputStreamAgtfadlqog.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (EncodingException e13) {
            e = e13;
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zoijcleaow(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, null, 0L);
        } catch (ConnectException e14) {
            e = e14;
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zoijcleaow(500, null, 0L);
        } catch (UnknownHostException e15) {
            e = e15;
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zoijcleaow(500, null, 0L);
        } catch (IOException e16) {
            e = e16;
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zoijcleaow(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, null, 0L);
        }
    }

    private static TelephonyManager gtknphoqwx(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String gxszxtbevo(Context context) {
        String simOperator = gtknphoqwx(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int lqeggnwhkg(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return iwizpuwonk.zoijcleaow.UNKNOWN_MOBILE_SUBTYPE.wkgbmnqykc();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return iwizpuwonk.zoijcleaow.COMBINED.wkgbmnqykc();
        }
        if (iwizpuwonk.zoijcleaow.iobyxmoadg(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int nufgyqmvbu(NetworkInfo networkInfo) {
        return networkInfo == null ? iwizpuwonk.ppxfxbqfkf.NONE.wkgbmnqykc() : networkInfo.getType();
    }

    private static URL ojitshcjhn(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e13) {
            throw new IllegalArgumentException("Invalid url: " + str, e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iobyxmoadg wflxmlrfwp(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
        URL url = zoijcleaowVar.f21821zoijcleaow;
        if (url == null) {
            return null;
        }
        u9.iobyxmoadg.iobyxmoadg("CctTransportBackend", "Following redirect to: %s", url);
        return iobyxmoadgVar.iobyxmoadg(zoijcleaowVar.f21821zoijcleaow);
    }

    @Override // r9.wflxmlrfwp
    public dxjokdxxww iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        NetworkInfo activeNetworkInfo = this.f21815zoijcleaow.getActiveNetworkInfo();
        return dxjokdxxwwVar.rgvfuqvkyq().iobyxmoadg("sdk-version", Build.VERSION.SDK_INT).ppxfxbqfkf(CommonUrlParts.MODEL, Build.MODEL).ppxfxbqfkf("hardware", Build.HARDWARE).ppxfxbqfkf("device", Build.DEVICE).ppxfxbqfkf("product", Build.PRODUCT).ppxfxbqfkf("os-uild", Build.ID).ppxfxbqfkf(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER).ppxfxbqfkf("fingerprint", Build.FINGERPRINT).zoijcleaow("tz-offset", draadjrbmk()).iobyxmoadg("net-type", nufgyqmvbu(activeNetworkInfo)).iobyxmoadg("mobile-subtype", lqeggnwhkg(activeNetworkInfo)).ppxfxbqfkf("country", Locale.getDefault().getCountry()).ppxfxbqfkf(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage()).ppxfxbqfkf("mcc_mnc", gxszxtbevo(this.f21813ppxfxbqfkf)).ppxfxbqfkf("application_build", Integer.toString(dxjokdxxww(this.f21813ppxfxbqfkf))).wkgbmnqykc();
    }

    @Override // r9.wflxmlrfwp
    public lqeggnwhkg zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        agtfadlqog agtfadlqogVarBtonecajqb = btonecajqb(gxszxtbevoVar);
        URL urlOjitshcjhn = this.f21814wkgbmnqykc;
        String strWkgbmnqykc = null;
        if (gxszxtbevoVar.ppxfxbqfkf() != null) {
            try {
                com.google.android.datatransport.cct.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = com.google.android.datatransport.cct.iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar.ppxfxbqfkf());
                strWkgbmnqykc = iobyxmoadgVarPpxfxbqfkf.wkgbmnqykc() != null ? iobyxmoadgVarPpxfxbqfkf.wkgbmnqykc() : null;
                if (iobyxmoadgVarPpxfxbqfkf.eablkybsjg() != null) {
                    urlOjitshcjhn = ojitshcjhn(iobyxmoadgVarPpxfxbqfkf.eablkybsjg());
                }
            } catch (IllegalArgumentException unused) {
                return lqeggnwhkg.iobyxmoadg();
            }
        }
        try {
            zoijcleaow zoijcleaowVar = (zoijcleaow) v9.zoijcleaow.iobyxmoadg(5, new iobyxmoadg(urlOjitshcjhn, agtfadlqogVarBtonecajqb, strWkgbmnqykc), new v9.iobyxmoadg() { // from class: com.google.android.datatransport.cct.zoijcleaow
                @Override // v9.iobyxmoadg
                public final Object apply(Object obj) {
                    return this.f21822iobyxmoadg.eablkybsjg((wkgbmnqykc.iobyxmoadg) obj);
                }
            }, new v9.ppxfxbqfkf() { // from class: com.google.android.datatransport.cct.ppxfxbqfkf
                @Override // v9.ppxfxbqfkf
                public final Object iobyxmoadg(Object obj, Object obj2) {
                    return wkgbmnqykc.wflxmlrfwp((wkgbmnqykc.iobyxmoadg) obj, (wkgbmnqykc.zoijcleaow) obj2);
                }
            });
            int i13 = zoijcleaowVar.f21819iobyxmoadg;
            if (i13 == 200) {
                return lqeggnwhkg.eablkybsjg(zoijcleaowVar.f21820ppxfxbqfkf);
            }
            if (i13 < 500 && i13 != 404) {
                return i13 == 400 ? lqeggnwhkg.wkgbmnqykc() : lqeggnwhkg.iobyxmoadg();
            }
            return lqeggnwhkg.gxszxtbevo();
        } catch (IOException e13) {
            u9.iobyxmoadg.ppxfxbqfkf("CctTransportBackend", "Could not make request to the backend", e13);
            return lqeggnwhkg.gxszxtbevo();
        }
    }

    wkgbmnqykc(Context context, aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2) {
        this(context, iobyxmoadgVar, iobyxmoadgVar2, 130000);
    }
}
