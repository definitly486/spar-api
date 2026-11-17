package wypolnanlu;

import androidx.camera.core.impl.cdpycssgdh;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.kcexrzcfyt;
import androidx.camera.core.impl.oxmwwwfdhm;
import androidx.camera.core.impl.vdvldrhtss;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class dxjokdxxww implements istkbnxepw.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f120751iobyxmoadg;

    dxjokdxxww() {
        this(oxmwwwfdhm.jhduphickx());
    }

    public dxjokdxxww eablkybsjg(Class cls) {
        iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63631lmojexxdyd, cls);
        if (iobyxmoadg().lqeggnwhkg(lmojexxdyd.btonecajqb.f63630iozdgvuglv, null) == null) {
            gxszxtbevo(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public dxjokdxxww gxszxtbevo(String str) {
        iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63630iozdgvuglv, str);
        return this;
    }

    @Override // lereixgezr.cqumvgiudr
    public vdvldrhtss iobyxmoadg() {
        return this.f120751iobyxmoadg;
    }

    public dxjokdxxww ppxfxbqfkf(cdpycssgdh.zoijcleaow zoijcleaowVar) {
        iobyxmoadg().vdvldrhtss(istkbnxepw.f3802zynmafqrjb, zoijcleaowVar);
        return this;
    }

    @Override // androidx.camera.core.impl.istkbnxepw.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public btonecajqb wkgbmnqykc() {
        return new btonecajqb(kcexrzcfyt.ribwqtqdhb(this.f120751iobyxmoadg));
    }

    dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f120751iobyxmoadg = oxmwwwfdhmVar;
        Class cls = (Class) oxmwwwfdhmVar.lqeggnwhkg(lmojexxdyd.btonecajqb.f63631lmojexxdyd, null);
        if (cls == null || cls.equals(nufgyqmvbu.class)) {
            ppxfxbqfkf(cdpycssgdh.zoijcleaow.STREAM_SHARING);
            eablkybsjg(nufgyqmvbu.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
