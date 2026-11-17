package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.crxdokpmqz;
import androidx.appcompat.widget.lereixgezr;
import java.util.ArrayList;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class jyumaefscl extends androidx.appcompat.app.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Toolbar.nufgyqmvbu f2639dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f2640eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f2641gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final lereixgezr f2642iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private ArrayList f2643lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Runnable f2644nufgyqmvbu = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final AppCompatDelegateImpl.lqeggnwhkg f2645ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    boolean f2646wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Window.Callback f2647zoijcleaow;

    private class eablkybsjg implements AppCompatDelegateImpl.lqeggnwhkg {
        eablkybsjg() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.lqeggnwhkg
        public boolean iobyxmoadg(int i13) {
            if (i13 != 0) {
                return false;
            }
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            if (jyumaefsclVar.f2646wkgbmnqykc) {
                return false;
            }
            jyumaefsclVar.f2642iobyxmoadg.gxszxtbevo();
            jyumaefscl.this.f2646wkgbmnqykc = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.lqeggnwhkg
        public View onCreatePanelView(int i13) {
            if (i13 == 0) {
                return new View(jyumaefscl.this.f2642iobyxmoadg.getContext());
            }
            return null;
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jyumaefscl.this.iwizpuwonk();
        }
    }

    private final class ppxfxbqfkf implements androidx.appcompat.view.menu.btonecajqb.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f2651zdlpuopuiu;

        ppxfxbqfkf() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
            if (this.f2651zdlpuopuiu) {
                return;
            }
            this.f2651zdlpuopuiu = true;
            jyumaefscl.this.f2642iobyxmoadg.vdvldrhtss();
            jyumaefscl.this.f2647zoijcleaow.onPanelClosed(108, eablkybsjgVar);
            this.f2651zdlpuopuiu = false;
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            jyumaefscl.this.f2647zoijcleaow.onMenuOpened(108, eablkybsjgVar);
            return true;
        }
    }

    private final class wkgbmnqykc implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg {
        wkgbmnqykc() {
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            if (jyumaefscl.this.f2642iobyxmoadg.eablkybsjg()) {
                jyumaefscl.this.f2647zoijcleaow.onPanelClosed(108, eablkybsjgVar);
            } else if (jyumaefscl.this.f2647zoijcleaow.onPreparePanel(0, null, eablkybsjgVar)) {
                jyumaefscl.this.f2647zoijcleaow.onMenuOpened(108, eablkybsjgVar);
            }
        }
    }

    class zoijcleaow implements Toolbar.nufgyqmvbu {
        zoijcleaow() {
        }

        @Override // androidx.appcompat.widget.Toolbar.nufgyqmvbu
        public boolean onMenuItemClick(MenuItem menuItem) {
            return jyumaefscl.this.f2647zoijcleaow.onMenuItemSelected(0, menuItem);
        }
    }

    jyumaefscl(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f2639dxjokdxxww = zoijcleaowVar;
        u1.nufgyqmvbu.gxszxtbevo(toolbar);
        crxdokpmqz crxdokpmqzVar = new crxdokpmqz(toolbar, false);
        this.f2642iobyxmoadg = crxdokpmqzVar;
        this.f2647zoijcleaow = (Window.Callback) u1.nufgyqmvbu.gxszxtbevo(callback);
        crxdokpmqzVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(zoijcleaowVar);
        crxdokpmqzVar.setWindowTitle(charSequence);
        this.f2645ppxfxbqfkf = new eablkybsjg();
    }

    private Menu jyumaefscl() {
        if (!this.f2640eablkybsjg) {
            this.f2642iobyxmoadg.zdlpuopuiu(new ppxfxbqfkf(), new wkgbmnqykc());
            this.f2640eablkybsjg = true;
        }
        return this.f2642iobyxmoadg.btonecajqb();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    void agtfadlqog() {
        this.f2642iobyxmoadg.wflxmlrfwp().removeCallbacks(this.f2644nufgyqmvbu);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public int btonecajqb() {
        return this.f2642iobyxmoadg.jyumaefscl();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean draadjrbmk() {
        this.f2642iobyxmoadg.wflxmlrfwp().removeCallbacks(this.f2644nufgyqmvbu);
        jhduphickx.metgxyhuhe(this.f2642iobyxmoadg.wflxmlrfwp(), this.f2644nufgyqmvbu);
        return true;
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void dxjokdxxww(boolean z13) {
        if (z13 == this.f2641gxszxtbevo) {
            return;
        }
        this.f2641gxszxtbevo = z13;
        if (this.f2643lqeggnwhkg.size() <= 0) {
            return;
        }
        yggfygwlhe.iobyxmoadg(this.f2643lqeggnwhkg.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public Context gtknphoqwx() {
        return this.f2642iobyxmoadg.getContext();
    }

    void iwizpuwonk() {
        Menu menuJyumaefscl = jyumaefscl();
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = menuJyumaefscl instanceof androidx.appcompat.view.menu.eablkybsjg ? (androidx.appcompat.view.menu.eablkybsjg) menuJyumaefscl : null;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.jztzpxfvev();
        }
        try {
            menuJyumaefscl.clear();
            if (!this.f2647zoijcleaow.onCreatePanelMenu(0, menuJyumaefscl) || !this.f2647zoijcleaow.onPreparePanel(0, null, menuJyumaefscl)) {
                menuJyumaefscl.clear();
            }
        } finally {
            if (eablkybsjgVar != null) {
                eablkybsjgVar.okpsazkaxt();
            }
        }
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void kcexrzcfyt(boolean z13) {
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean lqeggnwhkg() {
        return this.f2642iobyxmoadg.zoijcleaow();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean nufgyqmvbu() {
        if (!this.f2642iobyxmoadg.nufgyqmvbu()) {
            return false;
        }
        this.f2642iobyxmoadg.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean ojitshcjhn(int i13, KeyEvent keyEvent) {
        Menu menuJyumaefscl = jyumaefscl();
        if (menuJyumaefscl == null) {
            return false;
        }
        menuJyumaefscl.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuJyumaefscl.performShortcut(i13, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void oxmwwwfdhm(boolean z13) {
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean rgvfuqvkyq(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            vdvldrhtss();
        }
        return true;
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean vdvldrhtss() {
        return this.f2642iobyxmoadg.ppxfxbqfkf();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void wflxmlrfwp(Configuration configuration) {
        super.wflxmlrfwp(configuration);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void zdlpuopuiu(CharSequence charSequence) {
        this.f2642iobyxmoadg.setWindowTitle(charSequence);
    }
}
