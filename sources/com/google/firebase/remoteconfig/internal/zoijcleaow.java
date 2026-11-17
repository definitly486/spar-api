package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pd.ppxfxbqfkf f24844eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ScheduledExecutorService f24845gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f24846iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Random f24847lqeggnwhkg = new Random();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f24848ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f24849wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HttpURLConnection f24850zoijcleaow;

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f24852yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f24853zdlpuopuiu;

        iobyxmoadg(int i13, long j13) {
            this.f24853zdlpuopuiu = i13;
            this.f24852yggfygwlhe = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            zoijcleaow.this.wkgbmnqykc(this.f24853zdlpuopuiu, this.f24852yggfygwlhe);
        }
    }

    public zoijcleaow(HttpURLConnection httpURLConnection, wflxmlrfwp wflxmlrfwpVar, gxszxtbevo gxszxtbevoVar, Set set, pd.ppxfxbqfkf ppxfxbqfkfVar, ScheduledExecutorService scheduledExecutorService) {
        this.f24850zoijcleaow = httpURLConnection;
        this.f24848ppxfxbqfkf = wflxmlrfwpVar;
        this.f24849wkgbmnqykc = gxszxtbevoVar;
        this.f24846iobyxmoadg = set;
        this.f24844eablkybsjg = ppxfxbqfkfVar;
        this.f24845gxszxtbevo = scheduledExecutorService;
    }

    private String btonecajqb(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private static Boolean eablkybsjg(wflxmlrfwp.iobyxmoadg iobyxmoadgVar, long j13) {
        if (iobyxmoadgVar.wkgbmnqykc() != null) {
            return Boolean.valueOf(iobyxmoadgVar.wkgbmnqykc().gtknphoqwx() >= j13);
        }
        return Boolean.valueOf(iobyxmoadgVar.gxszxtbevo() == 1);
    }

    private synchronized void gtknphoqwx(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f24846iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((pd.ppxfxbqfkf) it.next()).iobyxmoadg(firebaseRemoteConfigException);
        }
    }

    private void gxszxtbevo(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strBtonecajqb = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strBtonecajqb = strBtonecajqb + line;
                if (line.contains("}")) {
                    strBtonecajqb = btonecajqb(strBtonecajqb);
                    if (strBtonecajqb.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strBtonecajqb);
                if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                    this.f24844eablkybsjg.iobyxmoadg(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (lqeggnwhkg()) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long jOxmwwwfdhm = this.f24848ppxfxbqfkf.oxmwwwfdhm();
                        long j13 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j13 > jOxmwwwfdhm) {
                            zoijcleaow(3, j13);
                        }
                    }
                }
            } catch (JSONException e13) {
                gtknphoqwx(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e13.getCause(), FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e13);
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    private synchronized boolean lqeggnwhkg() {
        return this.f24846iobyxmoadg.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task nufgyqmvbu(Task task, Task task2, long j13, int i13, Task task3) throws JSONException {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        wflxmlrfwp.iobyxmoadg iobyxmoadgVar = (wflxmlrfwp.iobyxmoadg) task.getResult();
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = (lqeggnwhkg) task2.getResult();
        if (!eablkybsjg(iobyxmoadgVar, j13).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            zoijcleaow(i13, j13);
            return Tasks.forResult(null);
        }
        if (iobyxmoadgVar.wkgbmnqykc() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (lqeggnwhkgVarIobyxmoadg == null) {
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.draadjrbmk().iobyxmoadg();
        }
        Set setGxszxtbevo = lqeggnwhkgVarIobyxmoadg.gxszxtbevo(iobyxmoadgVar.wkgbmnqykc());
        if (setGxszxtbevo.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        ppxfxbqfkf(pd.zoijcleaow.iobyxmoadg(setGxszxtbevo));
        return Tasks.forResult(null);
    }

    private synchronized void ppxfxbqfkf(pd.zoijcleaow zoijcleaowVar) {
        Iterator it = this.f24846iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((pd.ppxfxbqfkf) it.next()).zoijcleaow(zoijcleaowVar);
        }
    }

    private void zoijcleaow(int i13, long j13) {
        if (i13 == 0) {
            gtknphoqwx(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.iobyxmoadg.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f24845gxszxtbevo.schedule(new iobyxmoadg(i13, j13), this.f24847lqeggnwhkg.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void dxjokdxxww() {
        HttpURLConnection httpURLConnection = this.f24850zoijcleaow;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                gxszxtbevo(inputStream);
                inputStream.close();
            } catch (IOException e13) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e13);
            }
        } finally {
            this.f24850zoijcleaow.disconnect();
        }
    }

    public synchronized Task wkgbmnqykc(int i13, final long j13) {
        final int i14;
        final Task taskAgtfadlqog;
        final Task taskEablkybsjg;
        i14 = i13 - 1;
        taskAgtfadlqog = this.f24848ppxfxbqfkf.agtfadlqog(wflxmlrfwp.zoijcleaow.REALTIME, 3 - i14);
        taskEablkybsjg = this.f24849wkgbmnqykc.eablkybsjg();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskAgtfadlqog, taskEablkybsjg}).continueWithTask(this.f24845gxszxtbevo, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.iobyxmoadg
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f24736iobyxmoadg.nufgyqmvbu(taskAgtfadlqog, taskEablkybsjg, j13, i14, task);
            }
        });
    }
}
