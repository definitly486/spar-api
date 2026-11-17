package pb2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f76350zoijcleaow;

    public zoijcleaow(tg.draadjrbmk source) {
        zdlpuopuiu.btonecajqb(source, "source");
        this.f76350zoijcleaow = source;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(downstream);
        downstream.wkgbmnqykc(gxszxtbevoVar);
        try {
            this.f76350zoijcleaow.invoke(gxszxtbevoVar);
        } catch (Throwable th2) {
            gxszxtbevoVar.ppxfxbqfkf(th2);
        }
    }
}
