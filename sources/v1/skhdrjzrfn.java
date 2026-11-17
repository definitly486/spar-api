package v1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class skhdrjzrfn {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final skhdrjzrfn f115192zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f115193iobyxmoadg;

    private static class btonecajqb extends dxjokdxxww {

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        static final skhdrjzrfn f115194vdvldrhtss = skhdrjzrfn.esjtqupxsv(WindowInsets.CONSUMED);

        btonecajqb(skhdrjzrfn skhdrjzrfnVar, WindowInsets windowInsets) {
            super(skhdrjzrfnVar, windowInsets);
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        public j1.wkgbmnqykc lqeggnwhkg(int i13) {
            return j1.wkgbmnqykc.wkgbmnqykc(this.f115210ppxfxbqfkf.getInsets(wflxmlrfwp.iobyxmoadg(i13)));
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        public j1.wkgbmnqykc nufgyqmvbu(int i13) {
            return j1.wkgbmnqykc.wkgbmnqykc(this.f115210ppxfxbqfkf.getInsetsIgnoringVisibility(wflxmlrfwp.iobyxmoadg(i13)));
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        public boolean vdvldrhtss(int i13) {
            return this.f115210ppxfxbqfkf.isVisible(wflxmlrfwp.iobyxmoadg(i13));
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        final void wkgbmnqykc(View view) {
        }

        btonecajqb(skhdrjzrfn skhdrjzrfnVar, btonecajqb btonecajqbVar) {
            super(skhdrjzrfnVar, btonecajqbVar);
        }
    }

    public static final class draadjrbmk {
        public static int btonecajqb() {
            return 16;
        }

        public static int dxjokdxxww() {
            return 7;
        }

        static int eablkybsjg(int i13) {
            if (i13 == 1) {
                return 0;
            }
            if (i13 == 2) {
                return 1;
            }
            if (i13 == 4) {
                return 2;
            }
            if (i13 == 8) {
                return 3;
            }
            if (i13 == 16) {
                return 4;
            }
            if (i13 == 32) {
                return 5;
            }
            if (i13 == 64) {
                return 6;
            }
            if (i13 == 128) {
                return 7;
            }
            if (i13 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i13);
        }

        public static int gtknphoqwx() {
            return 64;
        }

        public static int gxszxtbevo() {
            return 32;
        }

        static int iobyxmoadg() {
            return -1;
        }

        public static int lqeggnwhkg() {
            return 2;
        }

        public static int nufgyqmvbu() {
            return 1;
        }

        public static int ppxfxbqfkf() {
            return UserVerificationMethods.USER_VERIFY_PATTERN;
        }

        public static int wkgbmnqykc() {
            return 8;
        }

        public static int zoijcleaow() {
            return 4;
        }
    }

    private static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final skhdrjzrfn f115198iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        j1.wkgbmnqykc[] f115199zoijcleaow;

        eablkybsjg() {
            this(new skhdrjzrfn((skhdrjzrfn) null));
        }

        abstract void eablkybsjg(j1.wkgbmnqykc wkgbmnqykcVar);

        void gxszxtbevo(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        protected final void iobyxmoadg() {
            j1.wkgbmnqykc[] wkgbmnqykcVarArr = this.f115199zoijcleaow;
            if (wkgbmnqykcVarArr != null) {
                j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = wkgbmnqykcVarArr[draadjrbmk.eablkybsjg(1)];
                j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = this.f115199zoijcleaow[draadjrbmk.eablkybsjg(2)];
                if (wkgbmnqykcVarGxszxtbevo2 == null) {
                    wkgbmnqykcVarGxszxtbevo2 = this.f115198iobyxmoadg.gxszxtbevo(2);
                }
                if (wkgbmnqykcVarGxszxtbevo == null) {
                    wkgbmnqykcVarGxszxtbevo = this.f115198iobyxmoadg.gxszxtbevo(1);
                }
                lqeggnwhkg(j1.wkgbmnqykc.iobyxmoadg(wkgbmnqykcVarGxszxtbevo, wkgbmnqykcVarGxszxtbevo2));
                j1.wkgbmnqykc wkgbmnqykcVar = this.f115199zoijcleaow[draadjrbmk.eablkybsjg(16)];
                if (wkgbmnqykcVar != null) {
                    gxszxtbevo(wkgbmnqykcVar);
                }
                j1.wkgbmnqykc wkgbmnqykcVar2 = this.f115199zoijcleaow[draadjrbmk.eablkybsjg(32)];
                if (wkgbmnqykcVar2 != null) {
                    wkgbmnqykc(wkgbmnqykcVar2);
                }
                j1.wkgbmnqykc wkgbmnqykcVar3 = this.f115199zoijcleaow[draadjrbmk.eablkybsjg(64)];
                if (wkgbmnqykcVar3 != null) {
                    nufgyqmvbu(wkgbmnqykcVar3);
                }
            }
        }

        abstract void lqeggnwhkg(j1.wkgbmnqykc wkgbmnqykcVar);

        void nufgyqmvbu(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        void ppxfxbqfkf(int i13, j1.wkgbmnqykc wkgbmnqykcVar) {
            if (this.f115199zoijcleaow == null) {
                this.f115199zoijcleaow = new j1.wkgbmnqykc[9];
            }
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) != 0) {
                    this.f115199zoijcleaow[draadjrbmk.eablkybsjg(i14)] = wkgbmnqykcVar;
                }
            }
        }

        void wkgbmnqykc(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        abstract skhdrjzrfn zoijcleaow();

        eablkybsjg(skhdrjzrfn skhdrjzrfnVar) {
            this.f115198iobyxmoadg = skhdrjzrfnVar;
        }
    }

    private static class gtknphoqwx {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final skhdrjzrfn f115200zoijcleaow = new iobyxmoadg().iobyxmoadg().iobyxmoadg().zoijcleaow().ppxfxbqfkf();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final skhdrjzrfn f115201iobyxmoadg;

        gtknphoqwx(skhdrjzrfn skhdrjzrfnVar) {
            this.f115201iobyxmoadg = skhdrjzrfnVar;
        }

        skhdrjzrfn agtfadlqog(int i13, int i14, int i15, int i16) {
            return f115200zoijcleaow;
        }

        j1.wkgbmnqykc btonecajqb() {
            return j1.wkgbmnqykc.f50504eablkybsjg;
        }

        j1.wkgbmnqykc draadjrbmk() {
            return j1.wkgbmnqykc.f50504eablkybsjg;
        }

        j1.wkgbmnqykc dxjokdxxww() {
            return draadjrbmk();
        }

        void eablkybsjg(skhdrjzrfn skhdrjzrfnVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return rgvfuqvkyq() == gtknphoqwxVar.rgvfuqvkyq() && ojitshcjhn() == gtknphoqwxVar.ojitshcjhn() && u1.zoijcleaow.iobyxmoadg(draadjrbmk(), gtknphoqwxVar.draadjrbmk()) && u1.zoijcleaow.iobyxmoadg(btonecajqb(), gtknphoqwxVar.btonecajqb()) && u1.zoijcleaow.iobyxmoadg(gxszxtbevo(), gtknphoqwxVar.gxszxtbevo());
        }

        j1.wkgbmnqykc gtknphoqwx() {
            return draadjrbmk();
        }

        oxmwwwfdhm gxszxtbevo() {
            return null;
        }

        public int hashCode() {
            return u1.zoijcleaow.zoijcleaow(Boolean.valueOf(rgvfuqvkyq()), Boolean.valueOf(ojitshcjhn()), draadjrbmk(), btonecajqb(), gxszxtbevo());
        }

        skhdrjzrfn iobyxmoadg() {
            return this.f115201iobyxmoadg;
        }

        void kcexrzcfyt(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        j1.wkgbmnqykc lqeggnwhkg(int i13) {
            return j1.wkgbmnqykc.f50504eablkybsjg;
        }

        j1.wkgbmnqykc nufgyqmvbu(int i13) {
            if ((i13 & 8) == 0) {
                return j1.wkgbmnqykc.f50504eablkybsjg;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        boolean ojitshcjhn() {
            return false;
        }

        public void oxmwwwfdhm(j1.wkgbmnqykc[] wkgbmnqykcVarArr) {
        }

        skhdrjzrfn ppxfxbqfkf() {
            return this.f115201iobyxmoadg;
        }

        boolean rgvfuqvkyq() {
            return false;
        }

        boolean vdvldrhtss(int i13) {
            return true;
        }

        j1.wkgbmnqykc wflxmlrfwp() {
            return draadjrbmk();
        }

        void wkgbmnqykc(View view) {
        }

        public void yggfygwlhe(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        void zdlpuopuiu(skhdrjzrfn skhdrjzrfnVar) {
        }

        skhdrjzrfn zoijcleaow() {
            return this.f115201iobyxmoadg;
        }
    }

    private static class nufgyqmvbu extends lqeggnwhkg {
        nufgyqmvbu(skhdrjzrfn skhdrjzrfnVar, WindowInsets windowInsets) {
            super(skhdrjzrfnVar, windowInsets);
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return Objects.equals(this.f115210ppxfxbqfkf, nufgyqmvbuVar.f115210ppxfxbqfkf) && Objects.equals(this.f115209lqeggnwhkg, nufgyqmvbuVar.f115209lqeggnwhkg);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        oxmwwwfdhm gxszxtbevo() {
            return oxmwwwfdhm.lqeggnwhkg(this.f115210ppxfxbqfkf.getDisplayCutout());
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public int hashCode() {
            return this.f115210ppxfxbqfkf.hashCode();
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        skhdrjzrfn iobyxmoadg() {
            return skhdrjzrfn.esjtqupxsv(this.f115210ppxfxbqfkf.consumeDisplayCutout());
        }

        nufgyqmvbu(skhdrjzrfn skhdrjzrfnVar, nufgyqmvbu nufgyqmvbuVar) {
            super(skhdrjzrfnVar, nufgyqmvbuVar);
        }
    }

    private static final class wflxmlrfwp {
        static int iobyxmoadg(int i13) {
            int iStatusBars;
            int i14 = 0;
            for (int i15 = 1; i15 <= 256; i15 <<= 1) {
                if ((i13 & i15) != 0) {
                    if (i15 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i15 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i15 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i15 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i15 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i15 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i15 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i15 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i14 |= iStatusBars;
                }
            }
            return i14;
        }
    }

    private static class wkgbmnqykc extends ppxfxbqfkf {
        wkgbmnqykc() {
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void ppxfxbqfkf(int i13, j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setInsets(wflxmlrfwp.iobyxmoadg(i13), wkgbmnqykcVar.eablkybsjg());
        }

        wkgbmnqykc(skhdrjzrfn skhdrjzrfnVar) {
            super(skhdrjzrfnVar);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f115192zoijcleaow = btonecajqb.f115194vdvldrhtss;
        } else {
            f115192zoijcleaow = gtknphoqwx.f115200zoijcleaow;
        }
    }

    private skhdrjzrfn(WindowInsets windowInsets) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            this.f115193iobyxmoadg = new btonecajqb(this, windowInsets);
            return;
        }
        if (i13 >= 29) {
            this.f115193iobyxmoadg = new dxjokdxxww(this, windowInsets);
        } else if (i13 >= 28) {
            this.f115193iobyxmoadg = new nufgyqmvbu(this, windowInsets);
        } else {
            this.f115193iobyxmoadg = new lqeggnwhkg(this, windowInsets);
        }
    }

    public static skhdrjzrfn esjtqupxsv(WindowInsets windowInsets) {
        return lereixgezr(windowInsets, null);
    }

    public static skhdrjzrfn lereixgezr(WindowInsets windowInsets, View view) {
        skhdrjzrfn skhdrjzrfnVar = new skhdrjzrfn((WindowInsets) u1.nufgyqmvbu.gxszxtbevo(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            skhdrjzrfnVar.jyumaefscl(jhduphickx.lmojexxdyd(view));
            skhdrjzrfnVar.wkgbmnqykc(view.getRootView());
        }
        return skhdrjzrfnVar;
    }

    static j1.wkgbmnqykc rgvfuqvkyq(j1.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, int i16) {
        int iMax = Math.max(0, wkgbmnqykcVar.f50505iobyxmoadg - i13);
        int iMax2 = Math.max(0, wkgbmnqykcVar.f50508zoijcleaow - i14);
        int iMax3 = Math.max(0, wkgbmnqykcVar.f50506ppxfxbqfkf - i15);
        int iMax4 = Math.max(0, wkgbmnqykcVar.f50507wkgbmnqykc - i16);
        return (iMax == i13 && iMax2 == i14 && iMax3 == i15 && iMax4 == i16) ? wkgbmnqykcVar : j1.wkgbmnqykc.zoijcleaow(iMax, iMax2, iMax3, iMax4);
    }

    public boolean agtfadlqog() {
        j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(draadjrbmk.iobyxmoadg());
        j1.wkgbmnqykc wkgbmnqykcVar = j1.wkgbmnqykc.f50504eablkybsjg;
        return (wkgbmnqykcVarGxszxtbevo.equals(wkgbmnqykcVar) && lqeggnwhkg(draadjrbmk.iobyxmoadg() ^ draadjrbmk.wkgbmnqykc()).equals(wkgbmnqykcVar) && eablkybsjg() == null) ? false : true;
    }

    public int btonecajqb() {
        return this.f115193iobyxmoadg.draadjrbmk().f50507wkgbmnqykc;
    }

    public WindowInsets cqumvgiudr() {
        gtknphoqwx gtknphoqwxVar = this.f115193iobyxmoadg;
        if (gtknphoqwxVar instanceof gxszxtbevo) {
            return ((gxszxtbevo) gtknphoqwxVar).f115210ppxfxbqfkf;
        }
        return null;
    }

    public int draadjrbmk() {
        return this.f115193iobyxmoadg.draadjrbmk().f50506ppxfxbqfkf;
    }

    public j1.wkgbmnqykc dxjokdxxww() {
        return this.f115193iobyxmoadg.gtknphoqwx();
    }

    public oxmwwwfdhm eablkybsjg() {
        return this.f115193iobyxmoadg.gxszxtbevo();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof skhdrjzrfn) {
            return u1.zoijcleaow.iobyxmoadg(this.f115193iobyxmoadg, ((skhdrjzrfn) obj).f115193iobyxmoadg);
        }
        return false;
    }

    public int gtknphoqwx() {
        return this.f115193iobyxmoadg.draadjrbmk().f50505iobyxmoadg;
    }

    public j1.wkgbmnqykc gxszxtbevo(int i13) {
        return this.f115193iobyxmoadg.lqeggnwhkg(i13);
    }

    public int hashCode() {
        gtknphoqwx gtknphoqwxVar = this.f115193iobyxmoadg;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.hashCode();
    }

    public skhdrjzrfn iobyxmoadg() {
        return this.f115193iobyxmoadg.iobyxmoadg();
    }

    void iwizpuwonk(j1.wkgbmnqykc wkgbmnqykcVar) {
        this.f115193iobyxmoadg.yggfygwlhe(wkgbmnqykcVar);
    }

    void jyumaefscl(skhdrjzrfn skhdrjzrfnVar) {
        this.f115193iobyxmoadg.zdlpuopuiu(skhdrjzrfnVar);
    }

    public skhdrjzrfn kcexrzcfyt(int i13, int i14, int i15, int i16) {
        return new iobyxmoadg(this).wkgbmnqykc(j1.wkgbmnqykc.zoijcleaow(i13, i14, i15, i16)).iobyxmoadg();
    }

    public j1.wkgbmnqykc lqeggnwhkg(int i13) {
        return this.f115193iobyxmoadg.nufgyqmvbu(i13);
    }

    public j1.wkgbmnqykc nufgyqmvbu() {
        return this.f115193iobyxmoadg.btonecajqb();
    }

    public skhdrjzrfn ojitshcjhn(int i13, int i14, int i15, int i16) {
        return this.f115193iobyxmoadg.agtfadlqog(i13, i14, i15, i16);
    }

    public boolean oxmwwwfdhm(int i13) {
        return this.f115193iobyxmoadg.vdvldrhtss(i13);
    }

    public skhdrjzrfn ppxfxbqfkf() {
        return this.f115193iobyxmoadg.ppxfxbqfkf();
    }

    public boolean vdvldrhtss() {
        return this.f115193iobyxmoadg.ojitshcjhn();
    }

    public int wflxmlrfwp() {
        return this.f115193iobyxmoadg.draadjrbmk().f50508zoijcleaow;
    }

    void wkgbmnqykc(View view) {
        this.f115193iobyxmoadg.wkgbmnqykc(view);
    }

    void yggfygwlhe(j1.wkgbmnqykc wkgbmnqykcVar) {
        this.f115193iobyxmoadg.kcexrzcfyt(wkgbmnqykcVar);
    }

    void zdlpuopuiu(j1.wkgbmnqykc[] wkgbmnqykcVarArr) {
        this.f115193iobyxmoadg.oxmwwwfdhm(wkgbmnqykcVarArr);
    }

    public skhdrjzrfn zoijcleaow() {
        return this.f115193iobyxmoadg.zoijcleaow();
    }

    private static class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private j1.wkgbmnqykc f115213wflxmlrfwp;

        lqeggnwhkg(skhdrjzrfn skhdrjzrfnVar, WindowInsets windowInsets) {
            super(skhdrjzrfnVar, windowInsets);
            this.f115213wflxmlrfwp = null;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        final j1.wkgbmnqykc btonecajqb() {
            if (this.f115213wflxmlrfwp == null) {
                this.f115213wflxmlrfwp = j1.wkgbmnqykc.zoijcleaow(this.f115210ppxfxbqfkf.getStableInsetLeft(), this.f115210ppxfxbqfkf.getStableInsetTop(), this.f115210ppxfxbqfkf.getStableInsetRight(), this.f115210ppxfxbqfkf.getStableInsetBottom());
            }
            return this.f115213wflxmlrfwp;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        boolean ojitshcjhn() {
            return this.f115210ppxfxbqfkf.isConsumed();
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        skhdrjzrfn ppxfxbqfkf() {
            return skhdrjzrfn.esjtqupxsv(this.f115210ppxfxbqfkf.consumeSystemWindowInsets());
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public void yggfygwlhe(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115213wflxmlrfwp = wkgbmnqykcVar;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        skhdrjzrfn zoijcleaow() {
            return skhdrjzrfn.esjtqupxsv(this.f115210ppxfxbqfkf.consumeStableInsets());
        }

        lqeggnwhkg(skhdrjzrfn skhdrjzrfnVar, lqeggnwhkg lqeggnwhkgVar) {
            super(skhdrjzrfnVar, lqeggnwhkgVar);
            this.f115213wflxmlrfwp = null;
            this.f115213wflxmlrfwp = lqeggnwhkgVar.f115213wflxmlrfwp;
        }
    }

    private static class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final WindowInsets.Builder f115214ppxfxbqfkf;

        ppxfxbqfkf() {
            this.f115214ppxfxbqfkf = s1.lqeggnwhkg.iobyxmoadg();
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void eablkybsjg(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setStableInsets(wkgbmnqykcVar.eablkybsjg());
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void gxszxtbevo(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setSystemGestureInsets(wkgbmnqykcVar.eablkybsjg());
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void lqeggnwhkg(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setSystemWindowInsets(wkgbmnqykcVar.eablkybsjg());
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void nufgyqmvbu(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setTappableElementInsets(wkgbmnqykcVar.eablkybsjg());
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void wkgbmnqykc(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115214ppxfxbqfkf.setMandatorySystemGestureInsets(wkgbmnqykcVar.eablkybsjg());
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        skhdrjzrfn zoijcleaow() {
            iobyxmoadg();
            skhdrjzrfn skhdrjzrfnVarEsjtqupxsv = skhdrjzrfn.esjtqupxsv(this.f115214ppxfxbqfkf.build());
            skhdrjzrfnVarEsjtqupxsv.zdlpuopuiu(this.f115199zoijcleaow);
            return skhdrjzrfnVarEsjtqupxsv;
        }

        ppxfxbqfkf(skhdrjzrfn skhdrjzrfnVar) {
            WindowInsets.Builder builderIobyxmoadg;
            super(skhdrjzrfnVar);
            WindowInsets windowInsetsCqumvgiudr = skhdrjzrfnVar.cqumvgiudr();
            if (windowInsetsCqumvgiudr != null) {
                builderIobyxmoadg = ageimvtcrz.iobyxmoadg(windowInsetsCqumvgiudr);
            } else {
                builderIobyxmoadg = s1.lqeggnwhkg.iobyxmoadg();
            }
            this.f115214ppxfxbqfkf = builderIobyxmoadg;
        }
    }

    private static class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static Field f115215eablkybsjg = null;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static boolean f115216gxszxtbevo = false;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static Constructor f115217lqeggnwhkg = null;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static boolean f115218nufgyqmvbu = false;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private WindowInsets f115219ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private j1.wkgbmnqykc f115220wkgbmnqykc;

        zoijcleaow() {
            this.f115219ppxfxbqfkf = dxjokdxxww();
        }

        private static WindowInsets dxjokdxxww() {
            if (!f115216gxszxtbevo) {
                try {
                    f115215eablkybsjg = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e13);
                }
                f115216gxszxtbevo = true;
            }
            Field field = f115215eablkybsjg;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e14) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e14);
                }
            }
            if (!f115218nufgyqmvbu) {
                try {
                    f115217lqeggnwhkg = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e15) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e15);
                }
                f115218nufgyqmvbu = true;
            }
            Constructor constructor = f115217lqeggnwhkg;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e16) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e16);
                }
            }
            return null;
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void eablkybsjg(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115220wkgbmnqykc = wkgbmnqykcVar;
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        void lqeggnwhkg(j1.wkgbmnqykc wkgbmnqykcVar) {
            WindowInsets windowInsets = this.f115219ppxfxbqfkf;
            if (windowInsets != null) {
                this.f115219ppxfxbqfkf = windowInsets.replaceSystemWindowInsets(wkgbmnqykcVar.f50505iobyxmoadg, wkgbmnqykcVar.f50508zoijcleaow, wkgbmnqykcVar.f50506ppxfxbqfkf, wkgbmnqykcVar.f50507wkgbmnqykc);
            }
        }

        @Override // v1.skhdrjzrfn.eablkybsjg
        skhdrjzrfn zoijcleaow() {
            iobyxmoadg();
            skhdrjzrfn skhdrjzrfnVarEsjtqupxsv = skhdrjzrfn.esjtqupxsv(this.f115219ppxfxbqfkf);
            skhdrjzrfnVarEsjtqupxsv.zdlpuopuiu(this.f115199zoijcleaow);
            skhdrjzrfnVarEsjtqupxsv.iwizpuwonk(this.f115220wkgbmnqykc);
            return skhdrjzrfnVarEsjtqupxsv;
        }

        zoijcleaow(skhdrjzrfn skhdrjzrfnVar) {
            super(skhdrjzrfnVar);
            this.f115219ppxfxbqfkf = skhdrjzrfnVar.cqumvgiudr();
        }
    }

    private static class gxszxtbevo extends gtknphoqwx {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private static Class f115202btonecajqb = null;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private static Field f115203draadjrbmk = null;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private static Method f115204dxjokdxxww = null;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private static Field f115205gtknphoqwx = null;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static boolean f115206nufgyqmvbu = false;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private j1.wkgbmnqykc f115207eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private skhdrjzrfn f115208gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        j1.wkgbmnqykc f115209lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final WindowInsets f115210ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private j1.wkgbmnqykc[] f115211wkgbmnqykc;

        gxszxtbevo(skhdrjzrfn skhdrjzrfnVar, WindowInsets windowInsets) {
            super(skhdrjzrfnVar);
            this.f115207eablkybsjg = null;
            this.f115210ppxfxbqfkf = windowInsets;
        }

        private j1.wkgbmnqykc cqumvgiudr() {
            skhdrjzrfn skhdrjzrfnVar = this.f115208gxszxtbevo;
            return skhdrjzrfnVar != null ? skhdrjzrfnVar.nufgyqmvbu() : j1.wkgbmnqykc.f50504eablkybsjg;
        }

        private j1.wkgbmnqykc esjtqupxsv(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f115206nufgyqmvbu) {
                pmvmpeiblj();
            }
            Method method = f115204dxjokdxxww;
            if (method != null && f115202btonecajqb != null && f115205gtknphoqwx != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f115205gtknphoqwx.get(f115203draadjrbmk.get(objInvoke));
                    if (rect != null) {
                        return j1.wkgbmnqykc.ppxfxbqfkf(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e13) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e13.getMessage(), e13);
                }
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        private j1.wkgbmnqykc jyumaefscl(int i13, boolean z13) {
            j1.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = j1.wkgbmnqykc.f50504eablkybsjg;
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) != 0) {
                    wkgbmnqykcVarIobyxmoadg = j1.wkgbmnqykc.iobyxmoadg(wkgbmnqykcVarIobyxmoadg, iwizpuwonk(i14, z13));
                }
            }
            return wkgbmnqykcVarIobyxmoadg;
        }

        @SuppressLint({"PrivateApi"})
        private static void pmvmpeiblj() {
            try {
                f115204dxjokdxxww = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f115202btonecajqb = cls;
                f115205gtknphoqwx = cls.getDeclaredField("mVisibleInsets");
                f115203draadjrbmk = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f115205gtknphoqwx.setAccessible(true);
                f115203draadjrbmk.setAccessible(true);
            } catch (ReflectiveOperationException e13) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e13.getMessage(), e13);
            }
            f115206nufgyqmvbu = true;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        skhdrjzrfn agtfadlqog(int i13, int i14, int i15, int i16) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(skhdrjzrfn.esjtqupxsv(this.f115210ppxfxbqfkf));
            iobyxmoadgVar.wkgbmnqykc(skhdrjzrfn.rgvfuqvkyq(draadjrbmk(), i13, i14, i15, i16));
            iobyxmoadgVar.ppxfxbqfkf(skhdrjzrfn.rgvfuqvkyq(btonecajqb(), i13, i14, i15, i16));
            return iobyxmoadgVar.iobyxmoadg();
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        final j1.wkgbmnqykc draadjrbmk() {
            if (this.f115207eablkybsjg == null) {
                this.f115207eablkybsjg = j1.wkgbmnqykc.zoijcleaow(this.f115210ppxfxbqfkf.getSystemWindowInsetLeft(), this.f115210ppxfxbqfkf.getSystemWindowInsetTop(), this.f115210ppxfxbqfkf.getSystemWindowInsetRight(), this.f115210ppxfxbqfkf.getSystemWindowInsetBottom());
            }
            return this.f115207eablkybsjg;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        void eablkybsjg(skhdrjzrfn skhdrjzrfnVar) {
            skhdrjzrfnVar.jyumaefscl(this.f115208gxszxtbevo);
            skhdrjzrfnVar.yggfygwlhe(this.f115209lqeggnwhkg);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f115209lqeggnwhkg, ((gxszxtbevo) obj).f115209lqeggnwhkg);
            }
            return false;
        }

        protected j1.wkgbmnqykc iwizpuwonk(int i13, boolean z13) {
            j1.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu;
            int i14;
            if (i13 == 1) {
                return z13 ? j1.wkgbmnqykc.zoijcleaow(0, Math.max(cqumvgiudr().f50508zoijcleaow, draadjrbmk().f50508zoijcleaow), 0, 0) : j1.wkgbmnqykc.zoijcleaow(0, draadjrbmk().f50508zoijcleaow, 0, 0);
            }
            if (i13 == 2) {
                if (z13) {
                    j1.wkgbmnqykc wkgbmnqykcVarCqumvgiudr = cqumvgiudr();
                    j1.wkgbmnqykc wkgbmnqykcVarBtonecajqb = btonecajqb();
                    return j1.wkgbmnqykc.zoijcleaow(Math.max(wkgbmnqykcVarCqumvgiudr.f50505iobyxmoadg, wkgbmnqykcVarBtonecajqb.f50505iobyxmoadg), 0, Math.max(wkgbmnqykcVarCqumvgiudr.f50506ppxfxbqfkf, wkgbmnqykcVarBtonecajqb.f50506ppxfxbqfkf), Math.max(wkgbmnqykcVarCqumvgiudr.f50507wkgbmnqykc, wkgbmnqykcVarBtonecajqb.f50507wkgbmnqykc));
                }
                j1.wkgbmnqykc wkgbmnqykcVarDraadjrbmk = draadjrbmk();
                skhdrjzrfn skhdrjzrfnVar = this.f115208gxszxtbevo;
                wkgbmnqykcVarNufgyqmvbu = skhdrjzrfnVar != null ? skhdrjzrfnVar.nufgyqmvbu() : null;
                int iMin = wkgbmnqykcVarDraadjrbmk.f50507wkgbmnqykc;
                if (wkgbmnqykcVarNufgyqmvbu != null) {
                    iMin = Math.min(iMin, wkgbmnqykcVarNufgyqmvbu.f50507wkgbmnqykc);
                }
                return j1.wkgbmnqykc.zoijcleaow(wkgbmnqykcVarDraadjrbmk.f50505iobyxmoadg, 0, wkgbmnqykcVarDraadjrbmk.f50506ppxfxbqfkf, iMin);
            }
            if (i13 != 8) {
                if (i13 == 16) {
                    return gtknphoqwx();
                }
                if (i13 == 32) {
                    return dxjokdxxww();
                }
                if (i13 == 64) {
                    return wflxmlrfwp();
                }
                if (i13 != 128) {
                    return j1.wkgbmnqykc.f50504eablkybsjg;
                }
                skhdrjzrfn skhdrjzrfnVar2 = this.f115208gxszxtbevo;
                oxmwwwfdhm oxmwwwfdhmVarEablkybsjg = skhdrjzrfnVar2 != null ? skhdrjzrfnVar2.eablkybsjg() : gxszxtbevo();
                return oxmwwwfdhmVarEablkybsjg != null ? j1.wkgbmnqykc.zoijcleaow(oxmwwwfdhmVarEablkybsjg.ppxfxbqfkf(), oxmwwwfdhmVarEablkybsjg.eablkybsjg(), oxmwwwfdhmVarEablkybsjg.wkgbmnqykc(), oxmwwwfdhmVarEablkybsjg.zoijcleaow()) : j1.wkgbmnqykc.f50504eablkybsjg;
            }
            j1.wkgbmnqykc[] wkgbmnqykcVarArr = this.f115211wkgbmnqykc;
            wkgbmnqykcVarNufgyqmvbu = wkgbmnqykcVarArr != null ? wkgbmnqykcVarArr[draadjrbmk.eablkybsjg(8)] : null;
            if (wkgbmnqykcVarNufgyqmvbu != null) {
                return wkgbmnqykcVarNufgyqmvbu;
            }
            j1.wkgbmnqykc wkgbmnqykcVarDraadjrbmk2 = draadjrbmk();
            j1.wkgbmnqykc wkgbmnqykcVarCqumvgiudr2 = cqumvgiudr();
            int i15 = wkgbmnqykcVarDraadjrbmk2.f50507wkgbmnqykc;
            if (i15 > wkgbmnqykcVarCqumvgiudr2.f50507wkgbmnqykc) {
                return j1.wkgbmnqykc.zoijcleaow(0, 0, 0, i15);
            }
            j1.wkgbmnqykc wkgbmnqykcVar = this.f115209lqeggnwhkg;
            return (wkgbmnqykcVar == null || wkgbmnqykcVar.equals(j1.wkgbmnqykc.f50504eablkybsjg) || (i14 = this.f115209lqeggnwhkg.f50507wkgbmnqykc) <= wkgbmnqykcVarCqumvgiudr2.f50507wkgbmnqykc) ? j1.wkgbmnqykc.f50504eablkybsjg : j1.wkgbmnqykc.zoijcleaow(0, 0, 0, i14);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        void kcexrzcfyt(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115209lqeggnwhkg = wkgbmnqykcVar;
        }

        protected boolean lereixgezr(int i13) {
            if (i13 != 1 && i13 != 2) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 8 && i13 != 128) {
                    return true;
                }
            }
            return !iwizpuwonk(i13, false).equals(j1.wkgbmnqykc.f50504eablkybsjg);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public j1.wkgbmnqykc lqeggnwhkg(int i13) {
            return jyumaefscl(i13, false);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public j1.wkgbmnqykc nufgyqmvbu(int i13) {
            return jyumaefscl(i13, true);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        public void oxmwwwfdhm(j1.wkgbmnqykc[] wkgbmnqykcVarArr) {
            this.f115211wkgbmnqykc = wkgbmnqykcVarArr;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        boolean rgvfuqvkyq() {
            return this.f115210ppxfxbqfkf.isRound();
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        @SuppressLint({"WrongConstant"})
        boolean vdvldrhtss(int i13) {
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) != 0 && !lereixgezr(i14)) {
                    return false;
                }
            }
            return true;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        void wkgbmnqykc(View view) {
            j1.wkgbmnqykc wkgbmnqykcVarEsjtqupxsv = esjtqupxsv(view);
            if (wkgbmnqykcVarEsjtqupxsv == null) {
                wkgbmnqykcVarEsjtqupxsv = j1.wkgbmnqykc.f50504eablkybsjg;
            }
            kcexrzcfyt(wkgbmnqykcVarEsjtqupxsv);
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        void zdlpuopuiu(skhdrjzrfn skhdrjzrfnVar) {
            this.f115208gxszxtbevo = skhdrjzrfnVar;
        }

        gxszxtbevo(skhdrjzrfn skhdrjzrfnVar, gxszxtbevo gxszxtbevoVar) {
            this(skhdrjzrfnVar, new WindowInsets(gxszxtbevoVar.f115210ppxfxbqfkf));
        }
    }

    private static class dxjokdxxww extends nufgyqmvbu {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private j1.wkgbmnqykc f115195agtfadlqog;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private j1.wkgbmnqykc f115196ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private j1.wkgbmnqykc f115197rgvfuqvkyq;

        dxjokdxxww(skhdrjzrfn skhdrjzrfnVar, WindowInsets windowInsets) {
            super(skhdrjzrfnVar, windowInsets);
            this.f115195agtfadlqog = null;
            this.f115196ojitshcjhn = null;
            this.f115197rgvfuqvkyq = null;
        }

        @Override // v1.skhdrjzrfn.gxszxtbevo, v1.skhdrjzrfn.gtknphoqwx
        skhdrjzrfn agtfadlqog(int i13, int i14, int i15, int i16) {
            return skhdrjzrfn.esjtqupxsv(this.f115210ppxfxbqfkf.inset(i13, i14, i15, i16));
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        j1.wkgbmnqykc dxjokdxxww() {
            if (this.f115196ojitshcjhn == null) {
                this.f115196ojitshcjhn = j1.wkgbmnqykc.wkgbmnqykc(this.f115210ppxfxbqfkf.getMandatorySystemGestureInsets());
            }
            return this.f115196ojitshcjhn;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        j1.wkgbmnqykc gtknphoqwx() {
            if (this.f115195agtfadlqog == null) {
                this.f115195agtfadlqog = j1.wkgbmnqykc.wkgbmnqykc(this.f115210ppxfxbqfkf.getSystemGestureInsets());
            }
            return this.f115195agtfadlqog;
        }

        @Override // v1.skhdrjzrfn.gtknphoqwx
        j1.wkgbmnqykc wflxmlrfwp() {
            if (this.f115197rgvfuqvkyq == null) {
                this.f115197rgvfuqvkyq = j1.wkgbmnqykc.wkgbmnqykc(this.f115210ppxfxbqfkf.getTappableElementInsets());
            }
            return this.f115197rgvfuqvkyq;
        }

        @Override // v1.skhdrjzrfn.lqeggnwhkg, v1.skhdrjzrfn.gtknphoqwx
        public void yggfygwlhe(j1.wkgbmnqykc wkgbmnqykcVar) {
        }

        dxjokdxxww(skhdrjzrfn skhdrjzrfnVar, dxjokdxxww dxjokdxxwwVar) {
            super(skhdrjzrfnVar, dxjokdxxwwVar);
            this.f115195agtfadlqog = null;
            this.f115196ojitshcjhn = null;
            this.f115197rgvfuqvkyq = null;
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eablkybsjg f115212iobyxmoadg;

        public iobyxmoadg() {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                this.f115212iobyxmoadg = new wkgbmnqykc();
            } else if (i13 >= 29) {
                this.f115212iobyxmoadg = new ppxfxbqfkf();
            } else {
                this.f115212iobyxmoadg = new zoijcleaow();
            }
        }

        public skhdrjzrfn iobyxmoadg() {
            return this.f115212iobyxmoadg.zoijcleaow();
        }

        public iobyxmoadg ppxfxbqfkf(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115212iobyxmoadg.eablkybsjg(wkgbmnqykcVar);
            return this;
        }

        public iobyxmoadg wkgbmnqykc(j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115212iobyxmoadg.lqeggnwhkg(wkgbmnqykcVar);
            return this;
        }

        public iobyxmoadg zoijcleaow(int i13, j1.wkgbmnqykc wkgbmnqykcVar) {
            this.f115212iobyxmoadg.ppxfxbqfkf(i13, wkgbmnqykcVar);
            return this;
        }

        public iobyxmoadg(skhdrjzrfn skhdrjzrfnVar) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                this.f115212iobyxmoadg = new wkgbmnqykc(skhdrjzrfnVar);
            } else if (i13 >= 29) {
                this.f115212iobyxmoadg = new ppxfxbqfkf(skhdrjzrfnVar);
            } else {
                this.f115212iobyxmoadg = new zoijcleaow(skhdrjzrfnVar);
            }
        }
    }

    public skhdrjzrfn(skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            gtknphoqwx gtknphoqwxVar = skhdrjzrfnVar.f115193iobyxmoadg;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30 && (gtknphoqwxVar instanceof btonecajqb)) {
                this.f115193iobyxmoadg = new btonecajqb(this, (btonecajqb) gtknphoqwxVar);
            } else if (i13 >= 29 && (gtknphoqwxVar instanceof dxjokdxxww)) {
                this.f115193iobyxmoadg = new dxjokdxxww(this, (dxjokdxxww) gtknphoqwxVar);
            } else if (i13 >= 28 && (gtknphoqwxVar instanceof nufgyqmvbu)) {
                this.f115193iobyxmoadg = new nufgyqmvbu(this, (nufgyqmvbu) gtknphoqwxVar);
            } else if (gtknphoqwxVar instanceof lqeggnwhkg) {
                this.f115193iobyxmoadg = new lqeggnwhkg(this, (lqeggnwhkg) gtknphoqwxVar);
            } else if (gtknphoqwxVar instanceof gxszxtbevo) {
                this.f115193iobyxmoadg = new gxszxtbevo(this, (gxszxtbevo) gtknphoqwxVar);
            } else {
                this.f115193iobyxmoadg = new gtknphoqwx(this);
            }
            gtknphoqwxVar.eablkybsjg(this);
            return;
        }
        this.f115193iobyxmoadg = new gtknphoqwx(this);
    }
}
