package i7;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import gg.wwaezpbzkn;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe implements ComponentCallbacks2, d7.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f42081esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final AtomicBoolean f42082cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile boolean f42083iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final d7.wkgbmnqykc f42084jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final WeakReference f42085yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f42086zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public yggfygwlhe(v6.eablkybsjg eablkybsjgVar, Context context, boolean z13) {
        d7.wkgbmnqykc ppxfxbqfkfVar;
        this.f42086zdlpuopuiu = context;
        this.f42085yggfygwlhe = new WeakReference(eablkybsjgVar);
        if (z13) {
            eablkybsjgVar.lqeggnwhkg();
            ppxfxbqfkfVar = d7.eablkybsjg.iobyxmoadg(context, this, null);
        } else {
            ppxfxbqfkfVar = new d7.ppxfxbqfkf();
        }
        this.f42084jyumaefscl = ppxfxbqfkfVar;
        this.f42083iwizpuwonk = ppxfxbqfkfVar.iobyxmoadg();
        this.f42082cqumvgiudr = new AtomicBoolean(false);
    }

    @Override // d7.wkgbmnqykc.iobyxmoadg
    public void iobyxmoadg(boolean z13) {
        wwaezpbzkn wwaezpbzknVar;
        v6.eablkybsjg eablkybsjgVar = (v6.eablkybsjg) this.f42085yggfygwlhe.get();
        if (eablkybsjgVar != null) {
            eablkybsjgVar.lqeggnwhkg();
            this.f42083iwizpuwonk = z13;
            wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            wkgbmnqykc();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (((v6.eablkybsjg) this.f42085yggfygwlhe.get()) == null) {
            wkgbmnqykc();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        wwaezpbzkn wwaezpbzknVar;
        v6.eablkybsjg eablkybsjgVar = (v6.eablkybsjg) this.f42085yggfygwlhe.get();
        if (eablkybsjgVar != null) {
            eablkybsjgVar.lqeggnwhkg();
            eablkybsjgVar.gtknphoqwx(i13);
            wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            wkgbmnqykc();
        }
    }

    public final void ppxfxbqfkf() {
        this.f42086zdlpuopuiu.registerComponentCallbacks(this);
    }

    public final void wkgbmnqykc() {
        if (this.f42082cqumvgiudr.getAndSet(true)) {
            return;
        }
        this.f42086zdlpuopuiu.unregisterComponentCallbacks(this);
        this.f42084jyumaefscl.shutdown();
    }

    public final boolean zoijcleaow() {
        return this.f42083iwizpuwonk;
    }
}
