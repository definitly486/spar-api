package pb2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
final class agtfadlqog implements btonecajqb, ob2.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f76313iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AtomicBoolean f76314ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicReference f76315wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f76316zoijcleaow;

    public agtfadlqog(tg.draadjrbmk onErrorCallback, tg.draadjrbmk onSuccessCallback) {
        zdlpuopuiu.btonecajqb(onErrorCallback, "onErrorCallback");
        zdlpuopuiu.btonecajqb(onSuccessCallback, "onSuccessCallback");
        this.f76313iobyxmoadg = onErrorCallback;
        this.f76316zoijcleaow = onSuccessCallback;
        this.f76314ppxfxbqfkf = new AtomicBoolean();
        this.f76315wkgbmnqykc = new AtomicReference(null);
    }

    @Override // ob2.gxszxtbevo
    public void iobyxmoadg() {
        ob2.gxszxtbevo gxszxtbevoVar;
        if (!this.f76314ppxfxbqfkf.compareAndSet(false, true) || (gxszxtbevoVar = (ob2.gxszxtbevo) this.f76315wkgbmnqykc.getAndSet(null)) == null) {
            return;
        }
        gxszxtbevoVar.iobyxmoadg();
    }

    @Override // pb2.btonecajqb
    public void onSuccess(Object obj) {
        if (this.f76314ppxfxbqfkf.compareAndSet(false, true)) {
            this.f76316zoijcleaow.invoke(obj);
        }
    }

    @Override // pb2.btonecajqb
    public void ppxfxbqfkf(Throwable e13) {
        zdlpuopuiu.btonecajqb(e13, "e");
        if (this.f76314ppxfxbqfkf.compareAndSet(false, true)) {
            this.f76313iobyxmoadg.invoke(e13);
        }
    }

    @Override // pb2.btonecajqb
    public void wkgbmnqykc(ob2.gxszxtbevo d13) {
        ob2.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(d13, "d");
        mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f76315wkgbmnqykc, null, d13);
        if (!zoijcleaow() || (gxszxtbevoVar = (ob2.gxszxtbevo) this.f76315wkgbmnqykc.getAndSet(null)) == null) {
            return;
        }
        gxszxtbevoVar.iobyxmoadg();
    }

    @Override // ob2.gxszxtbevo
    public boolean zoijcleaow() {
        return this.f76314ppxfxbqfkf.get();
    }
}
