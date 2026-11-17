package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final uc.eablkybsjg f24827btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final Context f24828draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24829dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    gxszxtbevo f24831gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f24833iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ScheduledExecutorService f24834lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wflxmlrfwp f24835nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f24837ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final rgvfuqvkyq f24838rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final String f24839wflxmlrfwp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    static final int[] f24825vdvldrhtss = {2, 4, 8, 16, 32, 64, UserVerificationMethods.USER_VERIFY_PATTERN, UserVerificationMethods.USER_VERIFY_HANDPRINT};

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final Pattern f24824oxmwwwfdhm = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f24832gxszxtbevo = 8;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f24841zoijcleaow = false;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Random f24826agtfadlqog = new Random();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Clock f24836ojitshcjhn = DefaultClock.getInstance();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f24840wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f24830eablkybsjg = false;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zdlpuopuiu.this.eablkybsjg();
        }
    }

    class zoijcleaow implements pd.ppxfxbqfkf {
        zoijcleaow() {
        }

        @Override // pd.ppxfxbqfkf
        public void iobyxmoadg(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            zdlpuopuiu.this.btonecajqb();
            zdlpuopuiu.this.yggfygwlhe(firebaseRemoteConfigException);
        }

        @Override // pd.ppxfxbqfkf
        public void zoijcleaow(pd.zoijcleaow zoijcleaowVar) {
        }
    }

    public zdlpuopuiu(com.google.firebase.gxszxtbevo gxszxtbevoVar, uc.eablkybsjg eablkybsjgVar, wflxmlrfwp wflxmlrfwpVar, gxszxtbevo gxszxtbevoVar2, Context context, String str, Set set, rgvfuqvkyq rgvfuqvkyqVar, ScheduledExecutorService scheduledExecutorService) {
        this.f24833iobyxmoadg = set;
        this.f24834lqeggnwhkg = scheduledExecutorService;
        this.f24837ppxfxbqfkf = Math.max(8 - rgvfuqvkyqVar.nufgyqmvbu().zoijcleaow(), 1);
        this.f24829dxjokdxxww = gxszxtbevoVar;
        this.f24835nufgyqmvbu = wflxmlrfwpVar;
        this.f24827btonecajqb = eablkybsjgVar;
        this.f24831gtknphoqwx = gxszxtbevoVar2;
        this.f24828draadjrbmk = context;
        this.f24839wflxmlrfwp = str;
        this.f24838rgvfuqvkyq = rgvfuqvkyqVar;
    }

    private String agtfadlqog(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", gtknphoqwx(this.f24829dxjokdxxww.agtfadlqog().ppxfxbqfkf()), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void btonecajqb() {
        this.f24840wkgbmnqykc = true;
    }

    private void cdpycssgdh(Date date) {
        int iZoijcleaow = this.f24838rgvfuqvkyq.nufgyqmvbu().zoijcleaow() + 1;
        this.f24838rgvfuqvkyq.ojitshcjhn(iZoijcleaow, new Date(date.getTime() + wflxmlrfwp(iZoijcleaow)));
    }

    private void cqumvgiudr(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f24829dxjokdxxww.agtfadlqog().zoijcleaow());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f24828draadjrbmk.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", draadjrbmk());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        httpURLConnection.setRequestProperty("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
    }

    private String draadjrbmk() {
        try {
            Context context = this.f24828draadjrbmk;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f24828draadjrbmk.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f24828draadjrbmk.getPackageName());
            return null;
        }
    }

    private JSONObject dxjokdxxww(String str) {
        HashMap map = new HashMap();
        map.put("project", gtknphoqwx(this.f24829dxjokdxxww.agtfadlqog().ppxfxbqfkf()));
        map.put("namespace", this.f24839wflxmlrfwp);
        map.put("lastKnownVersionNumber", Long.toString(this.f24835nufgyqmvbu.oxmwwwfdhm()));
        map.put("appId", this.f24829dxjokdxxww.agtfadlqog().ppxfxbqfkf());
        map.put("sdkVersion", "22.0.1");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    private synchronized void esjtqupxsv(boolean z13) {
        this.f24841zoijcleaow = z13;
    }

    private static String gtknphoqwx(String str) {
        Matcher matcher = f24824oxmwwwfdhm.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private synchronized boolean gxszxtbevo() {
        return (this.f24833iobyxmoadg.isEmpty() || this.f24841zoijcleaow || this.f24840wkgbmnqykc || this.f24830eablkybsjg) ? false : true;
    }

    private synchronized void jyumaefscl() {
        this.f24837ppxfxbqfkf = 8;
    }

    private synchronized void kcexrzcfyt(long j13) {
        try {
            if (gxszxtbevo()) {
                int i13 = this.f24837ppxfxbqfkf;
                if (i13 > 0) {
                    this.f24837ppxfxbqfkf = i13 - 1;
                    this.f24834lqeggnwhkg.schedule(new iobyxmoadg(), j13, TimeUnit.MILLISECONDS);
                } else if (!this.f24830eablkybsjg) {
                    yggfygwlhe(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private URL ojitshcjhn() {
        try {
            return new URL(agtfadlqog(this.f24839wflxmlrfwp));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task oxmwwwfdhm(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ojitshcjhn().openConnection();
            pmvmpeiblj(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.gxszxtbevo) task.getResult()).zoijcleaow());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e13) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e13));
        }
    }

    private boolean rgvfuqvkyq(int i13) {
        return i13 == 408 || i13 == 429 || i13 == 502 || i13 == 503 || i13 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.remoteconfig.internal.zdlpuopuiu] */
    public /* synthetic */ Task vdvldrhtss(Task task, Task task2) throws Throwable {
        Integer num;
        Throwable th2;
        Integer numValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z13 = true;
        try {
            try {
                if (!task.isSuccessful()) {
                    throw new IOException(task.getException());
                }
                esjtqupxsv(true);
                task = (HttpURLConnection) task.getResult();
                try {
                    int responseCode = task.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            jyumaefscl();
                            this.f24838rgvfuqvkyq.btonecajqb();
                            zynmafqrjb(task).dxjokdxxww();
                        } catch (IOException e13) {
                            e = e13;
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            lqeggnwhkg(task);
                            esjtqupxsv(false);
                            if (numValueOf != null && !rgvfuqvkyq(numValueOf.intValue())) {
                                z13 = false;
                            }
                            if (z13) {
                                cdpycssgdh(new Date(this.f24836ojitshcjhn.currentTimeMillis()));
                            }
                            if (z13 || numValueOf.intValue() == 200) {
                                iwizpuwonk();
                            } else {
                                String strZdlpuopuiu = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strZdlpuopuiu = zdlpuopuiu(task.getErrorStream());
                                }
                                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strZdlpuopuiu, FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_STREAM_ERROR);
                            }
                            return Tasks.forResult(null);
                        }
                    }
                    lqeggnwhkg(task);
                    esjtqupxsv(false);
                    boolean zRgvfuqvkyq = rgvfuqvkyq(responseCode);
                    if (zRgvfuqvkyq) {
                        cdpycssgdh(new Date(this.f24836ojitshcjhn.currentTimeMillis()));
                    }
                    if (zRgvfuqvkyq || responseCode == 200) {
                        iwizpuwonk();
                    } else {
                        String strZdlpuopuiu2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strZdlpuopuiu2 = zdlpuopuiu(task.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strZdlpuopuiu2, FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_STREAM_ERROR);
                        yggfygwlhe(firebaseRemoteConfigServerException);
                    }
                } catch (IOException e14) {
                    e = e14;
                    numValueOf = null;
                } catch (Throwable th3) {
                    num = null;
                    th2 = th3;
                    lqeggnwhkg(task);
                    esjtqupxsv(false);
                    if (num != null && !rgvfuqvkyq(num.intValue())) {
                        z13 = false;
                    }
                    if (z13) {
                        cdpycssgdh(new Date(this.f24836ojitshcjhn.currentTimeMillis()));
                    }
                    if (z13 || num.intValue() == 200) {
                        iwizpuwonk();
                    } else {
                        String strZdlpuopuiu3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                        if (num.intValue() == 403) {
                            strZdlpuopuiu3 = zdlpuopuiu(task.getErrorStream());
                        }
                        yggfygwlhe(new FirebaseRemoteConfigServerException(num.intValue(), strZdlpuopuiu3, FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_STREAM_ERROR));
                    }
                    throw th2;
                }
                return Tasks.forResult(null);
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (IOException e15) {
            e = e15;
            task = 0;
            numValueOf = null;
        } catch (Throwable th5) {
            num = null;
            th2 = th5;
            task = 0;
        }
    }

    private long wflxmlrfwp(int i13) {
        int[] iArr = f24825vdvldrhtss;
        int length = iArr.length;
        if (i13 >= length) {
            i13 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i13 - 1]);
        return (millis / 2) + ((long) this.f24826agtfadlqog.nextInt((int) millis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void yggfygwlhe(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f24833iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((pd.ppxfxbqfkf) it.next()).iobyxmoadg(firebaseRemoteConfigException);
        }
    }

    private String zdlpuopuiu(InputStream inputStream) {
        StringBuilder sb3 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb3.append(line);
            }
        } catch (IOException unused) {
            if (sb3.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb3.toString();
    }

    public void eablkybsjg() {
        if (gxszxtbevo()) {
            if (new Date(this.f24836ojitshcjhn.currentTimeMillis()).before(this.f24838rgvfuqvkyq.nufgyqmvbu().iobyxmoadg())) {
                iwizpuwonk();
            } else {
                final Task taskNufgyqmvbu = nufgyqmvbu();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskNufgyqmvbu}).continueWith(this.f24834lqeggnwhkg, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.oxmwwwfdhm
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return this.f24775iobyxmoadg.vdvldrhtss(taskNufgyqmvbu, task);
                    }
                });
            }
        }
    }

    public void istkbnxepw() {
        kcexrzcfyt(0L);
    }

    public synchronized void iwizpuwonk() {
        kcexrzcfyt(Math.max(0L, this.f24838rgvfuqvkyq.nufgyqmvbu().iobyxmoadg().getTime() - new Date(this.f24836ojitshcjhn.currentTimeMillis()).getTime()));
    }

    void lereixgezr(boolean z13) {
        this.f24830eablkybsjg = z13;
    }

    public void lqeggnwhkg(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public Task nufgyqmvbu() {
        final Task taskIobyxmoadg = this.f24827btonecajqb.iobyxmoadg(false);
        final Task id2 = this.f24827btonecajqb.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskIobyxmoadg, id2}).continueWithTask(this.f24834lqeggnwhkg, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.kcexrzcfyt
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f24748iobyxmoadg.oxmwwwfdhm(taskIobyxmoadg, id2, task);
            }
        });
    }

    public void pmvmpeiblj(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        cqumvgiudr(httpURLConnection, str2);
        byte[] bytes = dxjokdxxww(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.zoijcleaow zynmafqrjb(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.zoijcleaow(httpURLConnection, this.f24835nufgyqmvbu, this.f24831gtknphoqwx, this.f24833iobyxmoadg, new zoijcleaow(), this.f24834lqeggnwhkg);
    }
}
