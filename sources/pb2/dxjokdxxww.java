package pb2;

import gg.kcexrzcfyt;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f76317zoijcleaow;

    public dxjokdxxww(tg.iobyxmoadg source) {
        zdlpuopuiu.btonecajqb(source, "source");
        this.f76317zoijcleaow = source;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        ob2.nufgyqmvbu nufgyqmvbuVar = new ob2.nufgyqmvbu();
        downstream.wkgbmnqykc(nufgyqmvbuVar);
        if (nufgyqmvbuVar.zoijcleaow()) {
            return;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(this.f76317zoijcleaow.invoke());
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc) && !nufgyqmvbuVar.zoijcleaow()) {
            downstream.onSuccess(objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null || nufgyqmvbuVar.zoijcleaow()) {
            return;
        }
        downstream.ppxfxbqfkf(thDxjokdxxww);
    }
}
