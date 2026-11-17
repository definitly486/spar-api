package s1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f105174zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final C2558ppxfxbqfkf f105175iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(Activity activity) {
            zdlpuopuiu.btonecajqb(activity, "<this>");
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(activity, null);
            ppxfxbqfkfVar.zoijcleaow();
            return ppxfxbqfkfVar;
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: s1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static class C2558ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Drawable f105176eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f105177gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Activity f105178iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private wkgbmnqykc f105179lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f105180ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Integer f105181wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f105182zoijcleaow;

        public C2558ppxfxbqfkf(Activity activity) {
            zdlpuopuiu.btonecajqb(activity, "activity");
            this.f105178iobyxmoadg = activity;
            this.f105179lqeggnwhkg = new wkgbmnqykc() { // from class: s1.wkgbmnqykc
            };
        }

        public final Activity iobyxmoadg() {
            return this.f105178iobyxmoadg;
        }

        protected final void ppxfxbqfkf(Resources.Theme currentTheme, TypedValue typedValue) {
            zdlpuopuiu.btonecajqb(currentTheme, "currentTheme");
            zdlpuopuiu.btonecajqb(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(s1.iobyxmoadg.postSplashScreenTheme, typedValue, true)) {
                int i13 = typedValue.resourceId;
                this.f105182zoijcleaow = i13;
                if (i13 != 0) {
                    this.f105178iobyxmoadg.setTheme(i13);
                }
            }
        }

        public void zoijcleaow() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f105178iobyxmoadg.getTheme();
            if (currentTheme.resolveAttribute(s1.iobyxmoadg.windowSplashScreenBackground, typedValue, true)) {
                this.f105180ppxfxbqfkf = Integer.valueOf(typedValue.resourceId);
                this.f105181wkgbmnqykc = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(s1.iobyxmoadg.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f105176eablkybsjg = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(s1.iobyxmoadg.splashScreenIconSize, typedValue, true)) {
                this.f105177gxszxtbevo = typedValue.resourceId == s1.zoijcleaow.splashscreen_icon_size_with_background;
            }
            zdlpuopuiu.dxjokdxxww(currentTheme, "currentTheme");
            ppxfxbqfkf(currentTheme, typedValue);
        }
    }

    public interface wkgbmnqykc {
    }

    private static final class zoijcleaow extends C2558ppxfxbqfkf {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f105183dxjokdxxww;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f105184nufgyqmvbu;

        public static final class iobyxmoadg implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ Activity f105185yggfygwlhe;

            iobyxmoadg(Activity activity) {
                this.f105185yggfygwlhe = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (nufgyqmvbu.iobyxmoadg(view2)) {
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    zoijcleaowVar.eablkybsjg(zoijcleaowVar.wkgbmnqykc(dxjokdxxww.iobyxmoadg(view2)));
                    ((ViewGroup) this.f105185yggfygwlhe.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Activity activity) {
            super(activity);
            zdlpuopuiu.btonecajqb(activity, "activity");
            this.f105184nufgyqmvbu = true;
            this.f105183dxjokdxxww = new iobyxmoadg(activity);
        }

        public final void eablkybsjg(boolean z13) {
            this.f105184nufgyqmvbu = z13;
        }

        public final boolean wkgbmnqykc(SplashScreenView child) {
            zdlpuopuiu.btonecajqb(child, "child");
            WindowInsets windowInsetsBuild = lqeggnwhkg.iobyxmoadg().build();
            zdlpuopuiu.dxjokdxxww(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        @Override // s1.ppxfxbqfkf.C2558ppxfxbqfkf
        public void zoijcleaow() {
            Resources.Theme theme = iobyxmoadg().getTheme();
            zdlpuopuiu.dxjokdxxww(theme, "activity.theme");
            ppxfxbqfkf(theme, new TypedValue());
            ((ViewGroup) iobyxmoadg().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f105183dxjokdxxww);
        }
    }

    public /* synthetic */ ppxfxbqfkf(Activity activity, gtknphoqwx gtknphoqwxVar) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zoijcleaow() {
        this.f105175iobyxmoadg.zoijcleaow();
    }

    private ppxfxbqfkf(Activity activity) {
        this.f105175iobyxmoadg = Build.VERSION.SDK_INT >= 31 ? new zoijcleaow(activity) : new C2558ppxfxbqfkf(activity);
    }
}
