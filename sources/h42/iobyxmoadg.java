package h42;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.ppxfxbqfkf;
import gg.kcexrzcfyt;
import kotlin.coroutines.jvm.internal.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements g42.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f39411iobyxmoadg = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f39412zoijcleaow;

    /* JADX INFO: renamed from: h42.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0905iobyxmoadg implements OnCompleteListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f39413iobyxmoadg;

        C0905iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f39413iobyxmoadg = gxszxtbevoVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            zdlpuopuiu.btonecajqb(task, "task");
            if (!task.isSuccessful()) {
                this.f39413iobyxmoadg.resumeWith(kcexrzcfyt.wkgbmnqykc(null));
                return;
            }
            gxszxtbevo gxszxtbevoVar = this.f39413iobyxmoadg;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVar.resumeWith(kcexrzcfyt.wkgbmnqykc(task.getResult()));
        }
    }

    public iobyxmoadg() {
        ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = ppxfxbqfkf.rgvfuqvkyq();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarRgvfuqvkyq, "getInstance(...)");
        this.f39412zoijcleaow = ppxfxbqfkfVarRgvfuqvkyq;
    }

    @Override // g42.iobyxmoadg
    public boolean iobyxmoadg() {
        return this.f39411iobyxmoadg;
    }

    @Override // g42.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) throws Throwable {
        draadjrbmk draadjrbmkVar = new draadjrbmk(zoijcleaow.ppxfxbqfkf(gxszxtbevoVar));
        this.f39412zoijcleaow.getId().addOnCompleteListener(new C0905iobyxmoadg(draadjrbmkVar));
        Object objIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        if (objIobyxmoadg == zoijcleaow.gxszxtbevo()) {
            nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objIobyxmoadg;
    }
}
