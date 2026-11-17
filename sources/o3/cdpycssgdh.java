package o3;

import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.wizcaqwiak;
import v2.lmojexxdyd;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private iobyxmoadg f71839iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private p3.wkgbmnqykc f71840zoijcleaow;

    public interface iobyxmoadg {
        void iobyxmoadg(wizcaqwiak wizcaqwiakVar);

        void zoijcleaow();
    }

    public void btonecajqb() {
        this.f71839iobyxmoadg = null;
        this.f71840zoijcleaow = null;
    }

    public abstract void draadjrbmk(v2.ppxfxbqfkf ppxfxbqfkfVar);

    public abstract void dxjokdxxww(Object obj);

    public void eablkybsjg(iobyxmoadg iobyxmoadgVar, p3.wkgbmnqykc wkgbmnqykcVar) {
        this.f71839iobyxmoadg = iobyxmoadgVar;
        this.f71840zoijcleaow = wkgbmnqykcVar;
    }

    public abstract yadqdtsiqt gtknphoqwx(hszhottldk[] hszhottldkVarArr, m3.iwizpuwonk iwizpuwonkVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar);

    protected final void gxszxtbevo() {
        iobyxmoadg iobyxmoadgVar = this.f71839iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow();
        }
    }

    protected final void lqeggnwhkg(wizcaqwiak wizcaqwiakVar) {
        iobyxmoadg iobyxmoadgVar = this.f71839iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(wizcaqwiakVar);
        }
    }

    public abstract boolean nufgyqmvbu();

    public abstract lmojexxdyd ppxfxbqfkf();

    public abstract void wflxmlrfwp(lmojexxdyd lmojexxdydVar);

    public abstract hszhottldk.iobyxmoadg wkgbmnqykc();

    protected final p3.wkgbmnqykc zoijcleaow() {
        return (p3.wkgbmnqykc) y2.iobyxmoadg.dxjokdxxww(this.f71840zoijcleaow);
    }
}
