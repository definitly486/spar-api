package v1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f115118iobyxmoadg;

    private static class eablkybsjg extends wkgbmnqykc {
        eablkybsjg(Window window, g gVar, wypolnanlu wypolnanluVar) {
            super(window, gVar, wypolnanluVar);
        }

        eablkybsjg(WindowInsetsController windowInsetsController, g gVar, wypolnanlu wypolnanluVar) {
            super(windowInsetsController, gVar, wypolnanluVar);
        }
    }

    private static class gxszxtbevo extends eablkybsjg {
        gxszxtbevo(Window window, g gVar, wypolnanlu wypolnanluVar) {
            super(window, gVar, wypolnanluVar);
        }

        @Override // v1.g.wkgbmnqykc, v1.g.lqeggnwhkg
        public boolean zoijcleaow() {
            return (this.f115125zoijcleaow.getSystemBarsAppearance() & 8) != 0;
        }

        gxszxtbevo(WindowInsetsController windowInsetsController, g gVar, wypolnanlu wypolnanluVar) {
            super(windowInsetsController, gVar, wypolnanluVar);
        }
    }

    private static class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected final Window f115119iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wypolnanlu f115120zoijcleaow;

        iobyxmoadg(Window window, wypolnanlu wypolnanluVar) {
            this.f115119iobyxmoadg = window;
            this.f115120zoijcleaow = wypolnanluVar;
        }

        private void dxjokdxxww(int i13) {
            if (i13 == 1) {
                btonecajqb(4);
                gtknphoqwx(UserVerificationMethods.USER_VERIFY_ALL);
            } else if (i13 == 2) {
                btonecajqb(2);
            } else {
                if (i13 != 8) {
                    return;
                }
                this.f115120zoijcleaow.zoijcleaow();
            }
        }

        private void gxszxtbevo(int i13) {
            if (i13 == 1) {
                lqeggnwhkg(4);
            } else if (i13 == 2) {
                lqeggnwhkg(2);
            } else {
                if (i13 != 8) {
                    return;
                }
                this.f115120zoijcleaow.iobyxmoadg();
            }
        }

        protected void btonecajqb(int i13) {
            View decorView = this.f115119iobyxmoadg.getDecorView();
            decorView.setSystemUiVisibility((~i13) & decorView.getSystemUiVisibility());
        }

        @Override // v1.g.lqeggnwhkg
        void eablkybsjg(int i13) {
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) != 0) {
                    dxjokdxxww(i14);
                }
            }
        }

        protected void gtknphoqwx(int i13) {
            this.f115119iobyxmoadg.clearFlags(i13);
        }

        @Override // v1.g.lqeggnwhkg
        void iobyxmoadg(int i13) {
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i13 & i14) != 0) {
                    gxszxtbevo(i14);
                }
            }
        }

        protected void lqeggnwhkg(int i13) {
            View decorView = this.f115119iobyxmoadg.getDecorView();
            decorView.setSystemUiVisibility(i13 | decorView.getSystemUiVisibility());
        }

        protected void nufgyqmvbu(int i13) {
            this.f115119iobyxmoadg.addFlags(i13);
        }
    }

    private static class lqeggnwhkg {
        lqeggnwhkg() {
        }

        abstract void eablkybsjg(int i13);

        abstract void iobyxmoadg(int i13);

        public abstract void ppxfxbqfkf(boolean z13);

        public abstract void wkgbmnqykc(boolean z13);

        public abstract boolean zoijcleaow();
    }

    private static class ppxfxbqfkf extends zoijcleaow {
        ppxfxbqfkf(Window window, wypolnanlu wypolnanluVar) {
            super(window, wypolnanluVar);
        }

        @Override // v1.g.lqeggnwhkg
        public void ppxfxbqfkf(boolean z13) {
            if (!z13) {
                btonecajqb(16);
                return;
            }
            gtknphoqwx(134217728);
            nufgyqmvbu(Integer.MIN_VALUE);
            lqeggnwhkg(16);
        }
    }

    private static class zoijcleaow extends iobyxmoadg {
        zoijcleaow(Window window, wypolnanlu wypolnanluVar) {
            super(window, wypolnanluVar);
        }

        @Override // v1.g.lqeggnwhkg
        public void wkgbmnqykc(boolean z13) {
            if (!z13) {
                btonecajqb(8192);
                return;
            }
            gtknphoqwx(67108864);
            nufgyqmvbu(Integer.MIN_VALUE);
            lqeggnwhkg(8192);
        }

        @Override // v1.g.lqeggnwhkg
        public boolean zoijcleaow() {
            return (this.f115119iobyxmoadg.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
    }

    private g(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f115118iobyxmoadg = new gxszxtbevo(windowInsetsController, this, new wypolnanlu(windowInsetsController));
        } else {
            this.f115118iobyxmoadg = new wkgbmnqykc(windowInsetsController, this, new wypolnanlu(windowInsetsController));
        }
    }

    public static g gxszxtbevo(WindowInsetsController windowInsetsController) {
        return new g(windowInsetsController);
    }

    public void eablkybsjg(int i13) {
        this.f115118iobyxmoadg.eablkybsjg(i13);
    }

    public void iobyxmoadg(int i13) {
        this.f115118iobyxmoadg.iobyxmoadg(i13);
    }

    public void ppxfxbqfkf(boolean z13) {
        this.f115118iobyxmoadg.ppxfxbqfkf(z13);
    }

    public void wkgbmnqykc(boolean z13) {
        this.f115118iobyxmoadg.wkgbmnqykc(z13);
    }

    public boolean zoijcleaow() {
        return this.f115118iobyxmoadg.zoijcleaow();
    }

    private static class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        protected Window f115121eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final g f115122iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final wypolnanlu f115123ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final androidx.collection.jztzpxfvev f115124wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final WindowInsetsController f115125zoijcleaow;

        wkgbmnqykc(Window window, g gVar, wypolnanlu wypolnanluVar) {
            this(window.getInsetsController(), gVar, wypolnanluVar);
            this.f115121eablkybsjg = window;
        }

        @Override // v1.g.lqeggnwhkg
        void eablkybsjg(int i13) {
            if ((i13 & 8) != 0) {
                this.f115123ppxfxbqfkf.zoijcleaow();
            }
            this.f115125zoijcleaow.show(i13 & (-9));
        }

        protected void gxszxtbevo(int i13) {
            View decorView = this.f115121eablkybsjg.getDecorView();
            decorView.setSystemUiVisibility(i13 | decorView.getSystemUiVisibility());
        }

        @Override // v1.g.lqeggnwhkg
        void iobyxmoadg(int i13) {
            if ((i13 & 8) != 0) {
                this.f115123ppxfxbqfkf.iobyxmoadg();
            }
            this.f115125zoijcleaow.hide(i13 & (-9));
        }

        protected void lqeggnwhkg(int i13) {
            View decorView = this.f115121eablkybsjg.getDecorView();
            decorView.setSystemUiVisibility((~i13) & decorView.getSystemUiVisibility());
        }

        @Override // v1.g.lqeggnwhkg
        public void ppxfxbqfkf(boolean z13) {
            if (z13) {
                if (this.f115121eablkybsjg != null) {
                    gxszxtbevo(16);
                }
                this.f115125zoijcleaow.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f115121eablkybsjg != null) {
                    lqeggnwhkg(16);
                }
                this.f115125zoijcleaow.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // v1.g.lqeggnwhkg
        public void wkgbmnqykc(boolean z13) {
            if (z13) {
                if (this.f115121eablkybsjg != null) {
                    gxszxtbevo(8192);
                }
                this.f115125zoijcleaow.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f115121eablkybsjg != null) {
                    lqeggnwhkg(8192);
                }
                this.f115125zoijcleaow.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // v1.g.lqeggnwhkg
        public boolean zoijcleaow() {
            this.f115125zoijcleaow.setSystemBarsAppearance(0, 0);
            return (this.f115125zoijcleaow.getSystemBarsAppearance() & 8) != 0;
        }

        wkgbmnqykc(WindowInsetsController windowInsetsController, g gVar, wypolnanlu wypolnanluVar) {
            this.f115124wkgbmnqykc = new androidx.collection.jztzpxfvev();
            this.f115125zoijcleaow = windowInsetsController;
            this.f115122iobyxmoadg = gVar;
            this.f115123ppxfxbqfkf = wypolnanluVar;
        }
    }

    public g(Window window, View view) {
        wypolnanlu wypolnanluVar = new wypolnanlu(view);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            this.f115118iobyxmoadg = new gxszxtbevo(window, this, wypolnanluVar);
        } else if (i13 >= 30) {
            this.f115118iobyxmoadg = new wkgbmnqykc(window, this, wypolnanluVar);
        } else {
            this.f115118iobyxmoadg = new ppxfxbqfkf(window, wypolnanluVar);
        }
    }
}
