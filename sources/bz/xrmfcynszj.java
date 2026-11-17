package bz;

import android.content.Context;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class xrmfcynszj extends metgxyhuhe implements e, t6.stevsuqkhv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17671eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17672gxszxtbevo;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ppxfxbqfkf(kc2.gxszxtbevo gxszxtbevoVar, Task task) {
            if (task.isSuccessful() && task.getResult() != null) {
                xrmfcynszj.this.btonecajqb(Integer.valueOf(((SafetyNetApi.VerifyAppsUserResponse) task.getResult()).isVerifyAppsEnabled() ? 1 : 0));
            }
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.iobyxmoadg(xrmfcynszj.this.iwizpuwonk());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc(kc2.gxszxtbevo gxszxtbevoVar, Exception exc) {
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.iobyxmoadg(xrmfcynszj.this.iwizpuwonk());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final kc2.gxszxtbevo gxszxtbevoVar = null;
            xrmfcynszj.this.btonecajqb(null);
            Task taskIsVerifyAppsEnabled = SafetyNet.getClient(xrmfcynszj.this.f17671eablkybsjg).isVerifyAppsEnabled();
            taskIsVerifyAppsEnabled.addOnFailureListener(new OnFailureListener(gxszxtbevoVar) { // from class: bz.okpsazkaxt
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f17544iobyxmoadg.wkgbmnqykc(null, exc);
                }
            });
            taskIsVerifyAppsEnabled.addOnCompleteListener(e.f17409iobyxmoadg, new OnCompleteListener(gxszxtbevoVar) { // from class: bz.jztzpxfvev
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f17492iobyxmoadg.ppxfxbqfkf(null, task);
                }
            });
        }
    }

    xrmfcynszj(Context context, t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.GooglePlayProtect);
        this.f17671eablkybsjg = context;
        this.f17672gxszxtbevo = zdlpuopuiuVar;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() throws jrbgnlbqoe {
        ojitshcjhn(null);
        Integer num = (Integer) ppxfxbqfkf();
        if (num != null) {
            return num;
        }
        throw new jrbgnlbqoe(t6.iwizpuwonk.iobyxmoadg(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }

    @Override // t6.stevsuqkhv
    public Set eablkybsjg() {
        return t6.jyumaefscl.iobyxmoadg(t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, -128, -93, 74, 38, 36, -101, 82, 58, 120, 8, 77, -90, -49, 89, -57, -46, -41, -91, -122, -85, -78, -26, -105, 29, 76, -47}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, -128, -93, 74, 38, 36, -101, 82, 58, 120, 8, 98, 71, 41, 21, -72, -35, 25, 10, 99, -2, 32, 13, 62, 123, 3, 125}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, -128, -93, 74, 38, 36, -101, 82, 58, 120, 8, -15, 79, -62, -4, 118, -83, -34, 2, -128, -88, 105, -69, -73, 125, -123, -22, 54, -48, -109, 1, 17, -44, -109, -28, 125, 124, -91, 88, 117, -90, 50, -34}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 25, -7, -45, 103, 38, 58, 59, 24, 11, -19, 60, 60, -100, 58, 0, 72, 43, -59, 50, -124, 32, 9, 25, 123, -113, -2, 33, 47, -51, -20, -117, 57}));
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17672gxszxtbevo;
    }
}
