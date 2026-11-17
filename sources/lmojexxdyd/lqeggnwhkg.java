package lmojexxdyd;

import gg.wwaezpbzkn;
import lereixgezr.cllcsxoeiz;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements cllcsxoeiz.gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f63642eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz.gxszxtbevo f63643iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f63644ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private cllcsxoeiz.lqeggnwhkg f63645wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f63646zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(gxszxtbevoVar, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ lqeggnwhkg(cllcsxoeiz.gxszxtbevo gxszxtbevoVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVar);
    }

    private final void iobyxmoadg() {
        wwaezpbzkn wwaezpbzknVar;
        synchronized (this.f63646zoijcleaow) {
            try {
                if (this.f63644ppxfxbqfkf) {
                    cllcsxoeiz.gxszxtbevo gxszxtbevoVar = this.f63643iobyxmoadg;
                    if (gxszxtbevoVar != null) {
                        gxszxtbevoVar.clear();
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        wwaezpbzknVar = null;
                    }
                    if (wwaezpbzknVar == null) {
                        sopmlzcsov.ppxfxbqfkf("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    sopmlzcsov.draadjrbmk("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f63644ppxfxbqfkf = false;
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final lqeggnwhkg wkgbmnqykc(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        return f63642eablkybsjg.iobyxmoadg(gxszxtbevoVar);
    }

    private final void zoijcleaow() {
        synchronized (this.f63646zoijcleaow) {
            try {
                cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar = this.f63645wkgbmnqykc;
                if (lqeggnwhkgVar != null) {
                    lqeggnwhkgVar.iobyxmoadg();
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.cllcsxoeiz.gxszxtbevo
    public void clear() {
        iobyxmoadg();
    }

    public final void ppxfxbqfkf() {
        zoijcleaow();
        iobyxmoadg();
    }

    private lqeggnwhkg(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        this.f63643iobyxmoadg = gxszxtbevoVar;
        this.f63646zoijcleaow = new Object();
    }
}
