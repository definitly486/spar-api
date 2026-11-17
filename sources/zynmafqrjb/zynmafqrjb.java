package zynmafqrjb;

import android.util.Size;
import android.view.Surface;
import istkbnxepw.opjhrmiecq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class zynmafqrjb implements istkbnxepw.cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.cllcsxoeiz f131696iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private hkdspvbjdz f131697zoijcleaow;

    zynmafqrjb(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
        this.f131696iobyxmoadg = cllcsxoeizVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(istkbnxepw.cllcsxoeiz.iobyxmoadg iobyxmoadgVar, istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
        iobyxmoadgVar.iobyxmoadg(this);
    }

    private androidx.camera.core.agtfadlqog gtknphoqwx(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar == null) {
            return null;
        }
        return new androidx.camera.core.oxmwwwfdhm(agtfadlqogVar, new Size(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight()), new lmojexxdyd.zoijcleaow(new wypolnanlu.wflxmlrfwp(opjhrmiecq.zoijcleaow(), agtfadlqogVar.K().getTimestamp())));
    }

    void btonecajqb() {
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void close() {
        this.f131696iobyxmoadg.close();
    }

    void dxjokdxxww(hkdspvbjdz hkdspvbjdzVar) {
        u1.nufgyqmvbu.dxjokdxxww(true, "Pending request should be null");
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void eablkybsjg() {
        this.f131696iobyxmoadg.eablkybsjg();
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getHeight() {
        return this.f131696iobyxmoadg.getHeight();
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getWidth() {
        return this.f131696iobyxmoadg.getWidth();
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int gxszxtbevo() {
        return this.f131696iobyxmoadg.gxszxtbevo();
    }

    @Override // istkbnxepw.cllcsxoeiz
    public Surface iobyxmoadg() {
        return this.f131696iobyxmoadg.iobyxmoadg();
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void lqeggnwhkg(final istkbnxepw.cllcsxoeiz.iobyxmoadg iobyxmoadgVar, Executor executor) {
        this.f131696iobyxmoadg.lqeggnwhkg(new istkbnxepw.cllcsxoeiz.iobyxmoadg() { // from class: zynmafqrjb.pmvmpeiblj
            @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
            public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
                this.f131663iobyxmoadg.draadjrbmk(iobyxmoadgVar, cllcsxoeizVar);
            }
        }, executor);
    }

    @Override // istkbnxepw.cllcsxoeiz
    public androidx.camera.core.agtfadlqog nufgyqmvbu() {
        return gtknphoqwx(this.f131696iobyxmoadg.nufgyqmvbu());
    }

    @Override // istkbnxepw.cllcsxoeiz
    public androidx.camera.core.agtfadlqog ppxfxbqfkf() {
        return gtknphoqwx(this.f131696iobyxmoadg.ppxfxbqfkf());
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int wkgbmnqykc() {
        return this.f131696iobyxmoadg.wkgbmnqykc();
    }
}
