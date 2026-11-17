package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.gxszxtbevo;
import com.google.firebase.remoteconfig.internal.lqeggnwhkg;
import com.google.firebase.remoteconfig.internal.ojitshcjhn;
import com.google.firebase.remoteconfig.internal.rgvfuqvkyq;
import com.google.firebase.remoteconfig.internal.vdvldrhtss;
import com.google.firebase.remoteconfig.internal.wflxmlrfwp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pd.btonecajqb;
import pd.gtknphoqwx;
import pd.wkgbmnqykc;
import uc.eablkybsjg;
import vb.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final byte[] f24854agtfadlqog = new byte[0];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final rgvfuqvkyq f24855btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final vdvldrhtss f24856draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ojitshcjhn f24857dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gxszxtbevo f24858eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final eablkybsjg f24859gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gxszxtbevo f24860gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24861iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gxszxtbevo f24862lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wflxmlrfwp f24863nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final qb.zoijcleaow f24864ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final qd.eablkybsjg f24865wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Executor f24866wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24867zoijcleaow;

    iobyxmoadg(Context context, com.google.firebase.gxszxtbevo gxszxtbevoVar, eablkybsjg eablkybsjgVar, qb.zoijcleaow zoijcleaowVar, Executor executor, gxszxtbevo gxszxtbevoVar2, gxszxtbevo gxszxtbevoVar3, gxszxtbevo gxszxtbevoVar4, wflxmlrfwp wflxmlrfwpVar, ojitshcjhn ojitshcjhnVar, rgvfuqvkyq rgvfuqvkyqVar, vdvldrhtss vdvldrhtssVar, qd.eablkybsjg eablkybsjgVar2) {
        this.f24861iobyxmoadg = context;
        this.f24867zoijcleaow = gxszxtbevoVar;
        this.f24859gtknphoqwx = eablkybsjgVar;
        this.f24864ppxfxbqfkf = zoijcleaowVar;
        this.f24866wkgbmnqykc = executor;
        this.f24858eablkybsjg = gxszxtbevoVar2;
        this.f24860gxszxtbevo = gxszxtbevoVar3;
        this.f24862lqeggnwhkg = gxszxtbevoVar4;
        this.f24863nufgyqmvbu = wflxmlrfwpVar;
        this.f24857dxjokdxxww = ojitshcjhnVar;
        this.f24855btonecajqb = rgvfuqvkyqVar;
        this.f24856draadjrbmk = vdvldrhtssVar;
        this.f24865wflxmlrfwp = eablkybsjgVar2;
    }

    public static iobyxmoadg draadjrbmk() {
        return wflxmlrfwp(com.google.firebase.gxszxtbevo.draadjrbmk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task kcexrzcfyt(Void r13) {
        return gxszxtbevo();
    }

    static List lereixgezr(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i13);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task oxmwwwfdhm(wflxmlrfwp.iobyxmoadg iobyxmoadgVar) {
        return Tasks.forResult(null);
    }

    private static boolean rgvfuqvkyq(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2) {
        return lqeggnwhkgVar2 == null || !lqeggnwhkgVar.nufgyqmvbu().equals(lqeggnwhkgVar2.nufgyqmvbu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task vdvldrhtss(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) task.getResult();
        return (!task2.isSuccessful() || rgvfuqvkyq(lqeggnwhkgVar, (lqeggnwhkg) task2.getResult())) ? this.f24860gxszxtbevo.gtknphoqwx(lqeggnwhkgVar).continueWith(this.f24866wkgbmnqykc, new Continuation() { // from class: pd.nufgyqmvbu
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f76412iobyxmoadg.yggfygwlhe(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    public static iobyxmoadg wflxmlrfwp(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        return ((ppxfxbqfkf) gxszxtbevoVar.btonecajqb(ppxfxbqfkf.class)).lqeggnwhkg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yggfygwlhe(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f24858eablkybsjg.wkgbmnqykc();
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) task.getResult();
        if (lqeggnwhkgVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        pmvmpeiblj(lqeggnwhkgVar.eablkybsjg());
        this.f24865wflxmlrfwp.lqeggnwhkg(lqeggnwhkgVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void zdlpuopuiu(gtknphoqwx gtknphoqwxVar) {
        this.f24855btonecajqb.draadjrbmk(gtknphoqwxVar);
        return null;
    }

    qd.eablkybsjg agtfadlqog() {
        return this.f24865wflxmlrfwp;
    }

    public Map btonecajqb() {
        return this.f24857dxjokdxxww.wkgbmnqykc();
    }

    void cqumvgiudr(boolean z13) {
        this.f24856draadjrbmk.eablkybsjg(z13);
    }

    public Task dxjokdxxww() {
        return nufgyqmvbu().onSuccessTask(this.f24866wkgbmnqykc, new SuccessContinuation() { // from class: pd.eablkybsjg
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f76403iobyxmoadg.kcexrzcfyt((Void) obj);
            }
        });
    }

    void esjtqupxsv() {
        this.f24860gxszxtbevo.eablkybsjg();
        this.f24862lqeggnwhkg.eablkybsjg();
        this.f24858eablkybsjg.eablkybsjg();
    }

    public btonecajqb gtknphoqwx() {
        return this.f24855btonecajqb.ppxfxbqfkf();
    }

    public Task gxszxtbevo() {
        final Task taskEablkybsjg = this.f24858eablkybsjg.eablkybsjg();
        final Task taskEablkybsjg2 = this.f24860gxszxtbevo.eablkybsjg();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskEablkybsjg, taskEablkybsjg2}).continueWithTask(this.f24866wkgbmnqykc, new Continuation() { // from class: pd.gxszxtbevo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f76408iobyxmoadg.vdvldrhtss(taskEablkybsjg, taskEablkybsjg2, task);
            }
        });
    }

    public Task iwizpuwonk(final gtknphoqwx gtknphoqwxVar) {
        return Tasks.call(this.f24866wkgbmnqykc, new Callable() { // from class: pd.dxjokdxxww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f76401iobyxmoadg.zdlpuopuiu(gtknphoqwxVar);
            }
        });
    }

    public void jyumaefscl(Runnable runnable) {
        this.f24866wkgbmnqykc.execute(runnable);
    }

    public wkgbmnqykc lqeggnwhkg(pd.ppxfxbqfkf ppxfxbqfkfVar) {
        return this.f24856draadjrbmk.zoijcleaow(ppxfxbqfkfVar);
    }

    public Task nufgyqmvbu() {
        return this.f24863nufgyqmvbu.dxjokdxxww().onSuccessTask(dxjokdxxww.iobyxmoadg(), new SuccessContinuation() { // from class: pd.lqeggnwhkg
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return com.google.firebase.remoteconfig.iobyxmoadg.oxmwwwfdhm((com.google.firebase.remoteconfig.internal.wflxmlrfwp.iobyxmoadg) obj);
            }
        });
    }

    public String ojitshcjhn(String str) {
        return this.f24857dxjokdxxww.lqeggnwhkg(str);
    }

    void pmvmpeiblj(JSONArray jSONArray) {
        if (this.f24864ppxfxbqfkf == null) {
            return;
        }
        try {
            this.f24864ppxfxbqfkf.wflxmlrfwp(lereixgezr(jSONArray));
        } catch (AbtException e13) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e13);
        } catch (JSONException e14) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e14);
        }
    }
}
