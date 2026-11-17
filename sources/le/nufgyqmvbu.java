package le;

import android.graphics.Point;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends ne.eablkybsjg implements ie.iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final ie.zoijcleaow f62170iozdgvuglv = new ie.zoijcleaow.iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final /* synthetic */ int f62171lmojexxdyd = 0;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f62172cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final zzxk f62173istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f62174pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f62175yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final ie.zoijcleaow f62176zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nufgyqmvbu(ie.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, Executor executor, zzwp zzwpVar, ge.dxjokdxxww dxjokdxxwwVar) {
        super(draadjrbmkVar, executor);
        zoijcleaowVar.zoijcleaow();
        this.f62176zynmafqrjb = zoijcleaowVar;
        boolean zGxszxtbevo = zoijcleaow.gxszxtbevo();
        this.f62174pmvmpeiblj = zGxszxtbevo;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zoijcleaow.ppxfxbqfkf(zoijcleaowVar));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zGxszxtbevo ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.f62173istkbnxepw = null;
    }

    private final Task draadjrbmk(Task task, final int i13, final int i14) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: le.gxszxtbevo
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f62163iobyxmoadg.btonecajqb(i13, i14, (List) obj);
            }
        });
    }

    final /* synthetic */ Task btonecajqb(int i13, int i14, List list) {
        if (this.f62173istkbnxepw == null) {
            return Tasks.forResult(list);
        }
        this.f62172cdpycssgdh++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            je.iobyxmoadg iobyxmoadgVar = (je.iobyxmoadg) it.next();
            if (iobyxmoadgVar.zoijcleaow() == -1) {
                arrayList2.add(iobyxmoadgVar);
            } else {
                arrayList.add(iobyxmoadgVar);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                Point[] pointArrIobyxmoadg = ((je.iobyxmoadg) arrayList2.get(i15)).iobyxmoadg();
                if (pointArrIobyxmoadg != null) {
                    this.f62173istkbnxepw.zzi(this.f62172cdpycssgdh, zzxn.zzg(Arrays.asList(pointArrIobyxmoadg), i13, i14, 0.0f));
                }
            }
        } else {
            this.f62175yadqdtsiqt = true;
        }
        if (true != this.f62176zynmafqrjb.wkgbmnqykc()) {
            list = arrayList;
        }
        return Tasks.forResult(list);
    }

    @Override // ne.eablkybsjg, java.io.Closeable, java.lang.AutoCloseable, ie.iobyxmoadg
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.f62173istkbnxepw;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.f62175yadqdtsiqt);
                this.f62173istkbnxepw.zzj();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ie.iobyxmoadg
    public final Task eablkybsjg(me.iobyxmoadg iobyxmoadgVar) {
        return draadjrbmk(super.iobyxmoadg(iobyxmoadgVar), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo());
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f62174pmvmpeiblj ? ge.wflxmlrfwp.f36947iobyxmoadg : new Feature[]{ge.wflxmlrfwp.f36964zoijcleaow};
    }
}
