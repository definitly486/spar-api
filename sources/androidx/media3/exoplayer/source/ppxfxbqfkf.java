package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import v2.cdpycssgdh;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf extends androidx.media3.exoplayer.source.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private b3.wflxmlrfwp f11271btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Handler f11272dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final HashMap f11273nufgyqmvbu = new HashMap();

    private final class iobyxmoadg implements kcexrzcfyt, androidx.media3.exoplayer.drm.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg f11275jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private kcexrzcfyt.iobyxmoadg f11276yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f11277zdlpuopuiu;

        public iobyxmoadg(Object obj) {
            this.f11276yggfygwlhe = ppxfxbqfkf.this.zdlpuopuiu(null);
            this.f11275jyumaefscl = ppxfxbqfkf.this.oxmwwwfdhm(null);
            this.f11277zdlpuopuiu = obj;
        }

        private m3.btonecajqb wkgbmnqykc(m3.btonecajqb btonecajqbVar, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            long jCdpycssgdh = ppxfxbqfkf.this.cdpycssgdh(this.f11277zdlpuopuiu, btonecajqbVar.f65014gxszxtbevo, zoijcleaowVar);
            long jCdpycssgdh2 = ppxfxbqfkf.this.cdpycssgdh(this.f11277zdlpuopuiu, btonecajqbVar.f65016lqeggnwhkg, zoijcleaowVar);
            return (jCdpycssgdh == btonecajqbVar.f65014gxszxtbevo && jCdpycssgdh2 == btonecajqbVar.f65016lqeggnwhkg) ? btonecajqbVar : new m3.btonecajqb(btonecajqbVar.f65015iobyxmoadg, btonecajqbVar.f65019zoijcleaow, btonecajqbVar.f65017ppxfxbqfkf, btonecajqbVar.f65018wkgbmnqykc, btonecajqbVar.f65013eablkybsjg, jCdpycssgdh, jCdpycssgdh2);
        }

        private boolean zoijcleaow(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            oxmwwwfdhm.zoijcleaow zoijcleaowVarIstkbnxepw;
            if (zoijcleaowVar != null) {
                zoijcleaowVarIstkbnxepw = ppxfxbqfkf.this.istkbnxepw(this.f11277zdlpuopuiu, zoijcleaowVar);
                if (zoijcleaowVarIstkbnxepw == null) {
                    return false;
                }
            } else {
                zoijcleaowVarIstkbnxepw = null;
            }
            int iYadqdtsiqt = ppxfxbqfkf.this.yadqdtsiqt(this.f11277zdlpuopuiu, i13);
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = this.f11276yggfygwlhe;
            if (iobyxmoadgVar.f11242iobyxmoadg != iYadqdtsiqt || !Objects.equals(iobyxmoadgVar.f11244zoijcleaow, zoijcleaowVarIstkbnxepw)) {
                this.f11276yggfygwlhe = ppxfxbqfkf.this.kcexrzcfyt(iYadqdtsiqt, zoijcleaowVarIstkbnxepw);
            }
            androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 = this.f11275jyumaefscl;
            if (iobyxmoadgVar2.f10468iobyxmoadg == iYadqdtsiqt && Objects.equals(iobyxmoadgVar2.f10470zoijcleaow, zoijcleaowVarIstkbnxepw)) {
                return true;
            }
            this.f11275jyumaefscl = ppxfxbqfkf.this.vdvldrhtss(iYadqdtsiqt, zoijcleaowVarIstkbnxepw);
            return true;
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void crxdokpmqz(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, Exception exc) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.draadjrbmk(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void dsvhmnatus(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i14) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11276yggfygwlhe.cqumvgiudr(dxjokdxxwwVar, wkgbmnqykc(btonecajqbVar, zoijcleaowVar), i14);
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void hkdspvbjdz(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.btonecajqb btonecajqbVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11276yggfygwlhe.btonecajqb(wkgbmnqykc(btonecajqbVar, zoijcleaowVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void ikoacuggdj(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11276yggfygwlhe.zdlpuopuiu(dxjokdxxwwVar, wkgbmnqykc(btonecajqbVar, zoijcleaowVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void jztzpxfvev(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.btonecajqb();
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void mbcevpiqjq(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, int i14) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.gtknphoqwx(i14);
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void pkzmftpjix(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.nufgyqmvbu();
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void ribwqtqdhb(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11276yggfygwlhe.oxmwwwfdhm(dxjokdxxwwVar, wkgbmnqykc(btonecajqbVar, zoijcleaowVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void sflfametgt(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.wflxmlrfwp();
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void sopmlzcsov(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11275jyumaefscl.dxjokdxxww();
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void stevsuqkhv(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13) {
            if (zoijcleaow(i13, zoijcleaowVar)) {
                this.f11276yggfygwlhe.jyumaefscl(dxjokdxxwwVar, wkgbmnqykc(btonecajqbVar, zoijcleaowVar), iOException, z13);
            }
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final oxmwwwfdhm f11278iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final iobyxmoadg f11279ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final oxmwwwfdhm.ppxfxbqfkf f11280zoijcleaow;

        public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar, oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar) {
            this.f11278iobyxmoadg = oxmwwwfdhmVar;
            this.f11280zoijcleaow = ppxfxbqfkfVar;
            this.f11279ppxfxbqfkf = iobyxmoadgVar;
        }
    }

    protected ppxfxbqfkf() {
    }

    protected long cdpycssgdh(Object obj, long j13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void esjtqupxsv(b3.wflxmlrfwp wflxmlrfwpVar) {
        this.f11271btonecajqb = wflxmlrfwpVar;
        this.f11272dxjokdxxww = stevsuqkhv.lereixgezr();
    }

    protected abstract oxmwwwfdhm.zoijcleaow istkbnxepw(Object obj, oxmwwwfdhm.zoijcleaow zoijcleaowVar);

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void jyumaefscl() {
        for (zoijcleaow zoijcleaowVar : this.f11273nufgyqmvbu.values()) {
            zoijcleaowVar.f11278iobyxmoadg.dxjokdxxww(zoijcleaowVar.f11280zoijcleaow);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: lmojexxdyd, reason: merged with bridge method [inline-methods] */
    public abstract void iozdgvuglv(Object obj, oxmwwwfdhm oxmwwwfdhmVar, v2.cdpycssgdh cdpycssgdhVar);

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void pmvmpeiblj() {
        for (zoijcleaow zoijcleaowVar : this.f11273nufgyqmvbu.values()) {
            zoijcleaowVar.f11278iobyxmoadg.gtknphoqwx(zoijcleaowVar.f11280zoijcleaow);
            zoijcleaowVar.f11278iobyxmoadg.zoijcleaow(zoijcleaowVar.f11279ppxfxbqfkf);
            zoijcleaowVar.f11278iobyxmoadg.gxszxtbevo(zoijcleaowVar.f11279ppxfxbqfkf);
        }
        this.f11273nufgyqmvbu.clear();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void wflxmlrfwp() {
        Iterator it = this.f11273nufgyqmvbu.values().iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).f11278iobyxmoadg.wflxmlrfwp();
        }
    }

    protected final void wwaezpbzkn(final Object obj, oxmwwwfdhm oxmwwwfdhmVar) {
        y2.iobyxmoadg.iobyxmoadg(!this.f11273nufgyqmvbu.containsKey(obj));
        oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar = new oxmwwwfdhm.ppxfxbqfkf() { // from class: m3.ppxfxbqfkf
            @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf
            public final void iobyxmoadg(androidx.media3.exoplayer.source.oxmwwwfdhm oxmwwwfdhmVar2, cdpycssgdh cdpycssgdhVar) {
                this.f65047iobyxmoadg.iozdgvuglv(obj, oxmwwwfdhmVar2, cdpycssgdhVar);
            }
        };
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(obj);
        this.f11273nufgyqmvbu.put(obj, new zoijcleaow(oxmwwwfdhmVar, ppxfxbqfkfVar, iobyxmoadgVar));
        oxmwwwfdhmVar.iobyxmoadg((Handler) y2.iobyxmoadg.eablkybsjg(this.f11272dxjokdxxww), iobyxmoadgVar);
        oxmwwwfdhmVar.eablkybsjg((Handler) y2.iobyxmoadg.eablkybsjg(this.f11272dxjokdxxww), iobyxmoadgVar);
        oxmwwwfdhmVar.nufgyqmvbu(ppxfxbqfkfVar, this.f11271btonecajqb, iwizpuwonk());
        if (cqumvgiudr()) {
            return;
        }
        oxmwwwfdhmVar.draadjrbmk(ppxfxbqfkfVar);
    }

    protected int yadqdtsiqt(Object obj, int i13) {
        return i13;
    }

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void yggfygwlhe() {
        for (zoijcleaow zoijcleaowVar : this.f11273nufgyqmvbu.values()) {
            zoijcleaowVar.f11278iobyxmoadg.draadjrbmk(zoijcleaowVar.f11280zoijcleaow);
        }
    }
}
