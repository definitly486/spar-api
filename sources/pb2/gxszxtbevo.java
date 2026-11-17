package pb2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements eablkybsjg, ob2.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f76324iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AtomicReference f76325ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicBoolean f76326zoijcleaow;

    public gxszxtbevo(btonecajqb downstream) {
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        this.f76324iobyxmoadg = downstream;
        this.f76326zoijcleaow = new AtomicBoolean();
        this.f76325ppxfxbqfkf = new AtomicReference(null);
    }

    @Override // ob2.gxszxtbevo
    public void iobyxmoadg() {
        tg.iobyxmoadg iobyxmoadgVar;
        if (!this.f76326zoijcleaow.compareAndSet(false, true) || (iobyxmoadgVar = (tg.iobyxmoadg) this.f76325ppxfxbqfkf.get()) == null) {
            return;
        }
        iobyxmoadgVar.invoke();
    }

    @Override // pb2.eablkybsjg
    public void ppxfxbqfkf(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        if (this.f76326zoijcleaow.compareAndSet(false, true)) {
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) this.f76325ppxfxbqfkf.get();
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            this.f76324iobyxmoadg.ppxfxbqfkf(error);
        }
    }

    @Override // pb2.eablkybsjg
    public void wkgbmnqykc(Object obj) {
        if (this.f76326zoijcleaow.compareAndSet(false, true)) {
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) this.f76325ppxfxbqfkf.get();
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            this.f76324iobyxmoadg.onSuccess(obj);
        }
    }

    @Override // ob2.gxszxtbevo
    public boolean zoijcleaow() {
        return this.f76326zoijcleaow.get();
    }
}
