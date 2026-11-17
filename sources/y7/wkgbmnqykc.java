package y7;

import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f124020iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f124021zoijcleaow;

    public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
        this.f124020iobyxmoadg = iobyxmoadgVar;
        this.f124021zoijcleaow = draadjrbmkVar;
    }

    @Override // y7.ppxfxbqfkf
    public void iobyxmoadg(Object obj) {
        draadjrbmk draadjrbmkVar = this.f124021zoijcleaow;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(obj);
        }
    }

    @Override // y7.ppxfxbqfkf
    public void onComplete() {
        tg.iobyxmoadg iobyxmoadgVar = this.f124020iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }
}
