package qd;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.gxszxtbevo;
import com.google.firebase.remoteconfig.internal.lqeggnwhkg;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private gxszxtbevo f78586iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Executor f78587ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Set f78588wkgbmnqykc = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private iobyxmoadg f78589zoijcleaow;

    public eablkybsjg(gxszxtbevo gxszxtbevoVar, iobyxmoadg iobyxmoadgVar, Executor executor) {
        this.f78586iobyxmoadg = gxszxtbevoVar;
        this.f78589zoijcleaow = iobyxmoadgVar;
        this.f78587ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(Task task, final sd.gxszxtbevo gxszxtbevoVar, lqeggnwhkg lqeggnwhkgVar) {
        try {
            lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) task.getResult();
            if (lqeggnwhkgVar2 != null) {
                final sd.eablkybsjg eablkybsjgVarZoijcleaow = this.f78589zoijcleaow.zoijcleaow(lqeggnwhkgVar2);
                this.f78587ppxfxbqfkf.execute(new Runnable() { // from class: qd.wkgbmnqykc
                    @Override // java.lang.Runnable
                    public final void run() {
                        gxszxtbevoVar.iobyxmoadg(eablkybsjgVarZoijcleaow);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e13) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e13);
        }
    }

    public void lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar) {
        try {
            final sd.eablkybsjg eablkybsjgVarZoijcleaow = this.f78589zoijcleaow.zoijcleaow(lqeggnwhkgVar);
            for (final sd.gxszxtbevo gxszxtbevoVar : this.f78588wkgbmnqykc) {
                this.f78587ppxfxbqfkf.execute(new Runnable() { // from class: qd.ppxfxbqfkf
                    @Override // java.lang.Runnable
                    public final void run() {
                        gxszxtbevoVar.iobyxmoadg(eablkybsjgVarZoijcleaow);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e13) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e13);
        }
    }

    public void nufgyqmvbu(final sd.gxszxtbevo gxszxtbevoVar) {
        this.f78588wkgbmnqykc.add(gxszxtbevoVar);
        final Task taskEablkybsjg = this.f78586iobyxmoadg.eablkybsjg();
        taskEablkybsjg.addOnSuccessListener(this.f78587ppxfxbqfkf, new OnSuccessListener() { // from class: qd.zoijcleaow
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f78596iobyxmoadg.gxszxtbevo(taskEablkybsjg, gxszxtbevoVar, (lqeggnwhkg) obj);
            }
        });
    }
}
