package k;

import androidx.collection.jhduphickx;
import h.lxfrhoxuzk;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f53194eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ppxfxbqfkf f53195iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.collection.wypolnanlu f53196ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.collection.wypolnanlu f53197wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f53198zoijcleaow;

    public final boolean dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f53194eablkybsjg) {
            lxfrhoxuzk.iobyxmoadg("Only add dependencies during a tracking");
        }
        androidx.collection.wypolnanlu wypolnanluVar = this.f53196ppxfxbqfkf;
        if (wypolnanluVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wypolnanluVar);
            wypolnanluVar.nufgyqmvbu(ppxfxbqfkfVar);
        } else if (this.f53195iobyxmoadg != null) {
            androidx.collection.wypolnanlu wypolnanluVarZoijcleaow = jhduphickx.zoijcleaow();
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f53195iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar2);
            wypolnanluVarZoijcleaow.nufgyqmvbu(ppxfxbqfkfVar2);
            wypolnanluVarZoijcleaow.nufgyqmvbu(ppxfxbqfkfVar);
            this.f53196ppxfxbqfkf = wypolnanluVarZoijcleaow;
            this.f53195iobyxmoadg = null;
        } else {
            this.f53195iobyxmoadg = ppxfxbqfkfVar;
        }
        androidx.collection.wypolnanlu wypolnanluVar2 = this.f53197wkgbmnqykc;
        if (wypolnanluVar2 != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wypolnanluVar2);
            return !wypolnanluVar2.esjtqupxsv(ppxfxbqfkfVar);
        }
        if (this.f53198zoijcleaow != ppxfxbqfkfVar) {
            return true;
        }
        this.f53198zoijcleaow = null;
        return false;
    }
}
