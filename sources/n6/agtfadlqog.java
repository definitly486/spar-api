package n6;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final nufgyqmvbu f69156eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f69157iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f69158ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f69159wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f69160zoijcleaow;

    public agtfadlqog(Context context, r6.zoijcleaow taskExecutor, nufgyqmvbu batteryChargingTracker, ppxfxbqfkf batteryNotLowTracker, nufgyqmvbu networkStateTracker, nufgyqmvbu storageNotLowTracker) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        zdlpuopuiu.btonecajqb(batteryChargingTracker, "batteryChargingTracker");
        zdlpuopuiu.btonecajqb(batteryNotLowTracker, "batteryNotLowTracker");
        zdlpuopuiu.btonecajqb(networkStateTracker, "networkStateTracker");
        zdlpuopuiu.btonecajqb(storageNotLowTracker, "storageNotLowTracker");
        this.f69157iobyxmoadg = context;
        this.f69160zoijcleaow = batteryChargingTracker;
        this.f69158ppxfxbqfkf = batteryNotLowTracker;
        this.f69159wkgbmnqykc = networkStateTracker;
        this.f69156eablkybsjg = storageNotLowTracker;
    }

    public final nufgyqmvbu eablkybsjg() {
        return this.f69156eablkybsjg;
    }

    public final nufgyqmvbu iobyxmoadg() {
        return this.f69160zoijcleaow;
    }

    public final Context ppxfxbqfkf() {
        return this.f69157iobyxmoadg;
    }

    public final nufgyqmvbu wkgbmnqykc() {
        return this.f69159wkgbmnqykc;
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f69158ppxfxbqfkf;
    }

    public /* synthetic */ agtfadlqog(Context context, r6.zoijcleaow zoijcleaowVar, nufgyqmvbu nufgyqmvbuVar, ppxfxbqfkf ppxfxbqfkfVar, nufgyqmvbu nufgyqmvbuVar2, nufgyqmvbu nufgyqmvbuVar3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        nufgyqmvbu iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar2;
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg;
        nufgyqmvbu draadjrbmkVar;
        if ((i13 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
            iobyxmoadgVar = new iobyxmoadg(applicationContext, zoijcleaowVar);
        } else {
            iobyxmoadgVar = nufgyqmvbuVar;
        }
        if ((i13 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            zdlpuopuiu.dxjokdxxww(applicationContext2, "context.applicationContext");
            ppxfxbqfkfVar2 = new ppxfxbqfkf(applicationContext2, zoijcleaowVar);
        } else {
            ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        }
        if ((i13 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            zdlpuopuiu.dxjokdxxww(applicationContext3, "context.applicationContext");
            nufgyqmvbuVarIobyxmoadg = gtknphoqwx.iobyxmoadg(applicationContext3, zoijcleaowVar);
        } else {
            nufgyqmvbuVarIobyxmoadg = nufgyqmvbuVar2;
        }
        if ((i13 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            zdlpuopuiu.dxjokdxxww(applicationContext4, "context.applicationContext");
            draadjrbmkVar = new draadjrbmk(applicationContext4, zoijcleaowVar);
        } else {
            draadjrbmkVar = nufgyqmvbuVar3;
        }
        this(context, zoijcleaowVar, iobyxmoadgVar, ppxfxbqfkfVar2, nufgyqmvbuVarIobyxmoadg, draadjrbmkVar);
    }
}
