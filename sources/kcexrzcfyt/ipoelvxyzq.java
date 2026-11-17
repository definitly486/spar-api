package kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
final class ipoelvxyzq extends ntlheqmsrt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final ipoelvxyzq f54708ppxfxbqfkf = new ipoelvxyzq(new iwizpuwonk.btonecajqb());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk.btonecajqb f54709zoijcleaow;

    private ipoelvxyzq(iwizpuwonk.btonecajqb btonecajqbVar) {
        this.f54709zoijcleaow = btonecajqbVar;
    }

    @Override // kcexrzcfyt.ntlheqmsrt, androidx.camera.core.impl.dxjokdxxww.zoijcleaow
    public void iobyxmoadg(androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        super.iobyxmoadg(istkbnxepwVar, iobyxmoadgVar);
        if (!(istkbnxepwVar instanceof androidx.camera.core.impl.agtfadlqog)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.agtfadlqog agtfadlqogVar = (androidx.camera.core.impl.agtfadlqog) istkbnxepwVar;
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        if (agtfadlqogVar.okpsazkaxt()) {
            this.f54709zoijcleaow.iobyxmoadg(agtfadlqogVar.crxdokpmqz(), c1637iobyxmoadg);
        }
        iobyxmoadgVar.eablkybsjg(c1637iobyxmoadg.zoijcleaow());
    }
}
