package v1;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f115252iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private InterfaceC2871zoijcleaow f115253ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private iobyxmoadg f115254zoijcleaow;

    public interface iobyxmoadg {
    }

    /* JADX INFO: renamed from: v1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC2871zoijcleaow {
        void onActionProviderVisibilityChanged(boolean z13);
    }

    public zoijcleaow(Context context) {
        this.f115252iobyxmoadg = context;
    }

    public abstract void dxjokdxxww(InterfaceC2871zoijcleaow interfaceC2871zoijcleaow);

    public abstract void eablkybsjg(SubMenu subMenu);

    public abstract boolean gxszxtbevo();

    public abstract boolean iobyxmoadg();

    public void lqeggnwhkg() {
        this.f115253ppxfxbqfkf = null;
        this.f115254zoijcleaow = null;
    }

    public void nufgyqmvbu(iobyxmoadg iobyxmoadgVar) {
        this.f115254zoijcleaow = iobyxmoadgVar;
    }

    public abstract View ppxfxbqfkf(MenuItem menuItem);

    public abstract boolean wkgbmnqykc();

    public abstract boolean zoijcleaow();
}
