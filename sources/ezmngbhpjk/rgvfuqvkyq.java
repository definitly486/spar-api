package ezmngbhpjk;

import gg.wwaezpbzkn;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object f32462ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f32461iobyxmoadg = new AtomicReference(vdvldrhtss.f32464iobyxmoadg);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f32463zoijcleaow = new Object();

    public final Object iobyxmoadg() {
        long jIobyxmoadg = yggfygwlhe.iobyxmoadg();
        return jIobyxmoadg == zdlpuopuiu.iobyxmoadg() ? this.f32462ppxfxbqfkf : ((kcexrzcfyt) this.f32461iobyxmoadg.get()).zoijcleaow(jIobyxmoadg);
    }

    public final void zoijcleaow(Object obj) {
        long jIobyxmoadg = yggfygwlhe.iobyxmoadg();
        if (jIobyxmoadg == zdlpuopuiu.iobyxmoadg()) {
            this.f32462ppxfxbqfkf = obj;
            return;
        }
        synchronized (this.f32463zoijcleaow) {
            kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) this.f32461iobyxmoadg.get();
            if (kcexrzcfytVar.wkgbmnqykc(jIobyxmoadg, obj)) {
                return;
            }
            this.f32461iobyxmoadg.set(kcexrzcfytVar.ppxfxbqfkf(jIobyxmoadg, obj));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }
}
