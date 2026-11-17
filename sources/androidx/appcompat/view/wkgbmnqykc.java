package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends ContextWrapper {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static Configuration f2953gxszxtbevo;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Resources f2954eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f2955iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private LayoutInflater f2956ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Configuration f2957wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Resources.Theme f2958zoijcleaow;

    public wkgbmnqykc(Context context, int i13) {
        super(context);
        this.f2955iobyxmoadg = i13;
    }

    private static boolean eablkybsjg(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f2953gxszxtbevo == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f2953gxszxtbevo = configuration2;
        }
        return configuration.equals(f2953gxszxtbevo);
    }

    private void wkgbmnqykc() {
        boolean z13 = this.f2958zoijcleaow == null;
        if (z13) {
            this.f2958zoijcleaow = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2958zoijcleaow.setTo(theme);
            }
        }
        gxszxtbevo(this.f2958zoijcleaow, this.f2955iobyxmoadg, z13);
    }

    private Resources zoijcleaow() {
        if (this.f2954eablkybsjg == null) {
            Configuration configuration = this.f2957wkgbmnqykc;
            if (configuration == null || eablkybsjg(configuration)) {
                this.f2954eablkybsjg = super.getResources();
            } else {
                this.f2954eablkybsjg = createConfigurationContext(this.f2957wkgbmnqykc).getResources();
            }
        }
        return this.f2954eablkybsjg;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return zoijcleaow();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2956ppxfxbqfkf == null) {
            this.f2956ppxfxbqfkf = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2956ppxfxbqfkf;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2958zoijcleaow;
        if (theme != null) {
            return theme;
        }
        if (this.f2955iobyxmoadg == 0) {
            this.f2955iobyxmoadg = lqeggnwhkg.dxjokdxxww.Theme_AppCompat_Light;
        }
        wkgbmnqykc();
        return this.f2958zoijcleaow;
    }

    protected void gxszxtbevo(Resources.Theme theme, int i13, boolean z13) {
        theme.applyStyle(i13, true);
    }

    public void iobyxmoadg(Configuration configuration) {
        if (this.f2954eablkybsjg != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2957wkgbmnqykc != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2957wkgbmnqykc = new Configuration(configuration);
    }

    public int ppxfxbqfkf() {
        return this.f2955iobyxmoadg;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i13) {
        if (this.f2955iobyxmoadg != i13) {
            this.f2955iobyxmoadg = i13;
            wkgbmnqykc();
        }
    }

    public wkgbmnqykc(Context context, Resources.Theme theme) {
        super(context);
        this.f2958zoijcleaow = theme;
    }
}
