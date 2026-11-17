package h;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class ylkuphrtab implements auzgnhcxok {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final ppxfxbqfkf f38987gxszxtbevo = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static boolean f38988lqeggnwhkg = true;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ViewGroup f38990iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.compose.ui.graphics.layer.view.iobyxmoadg f38991ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f38992wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f38993zoijcleaow = new Object();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ComponentCallbacks2 f38989eablkybsjg = new iobyxmoadg();

    public static final class iobyxmoadg implements ComponentCallbacks2 {
        iobyxmoadg() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i13) {
            if (i13 >= 40) {
                ylkuphrtab.this.gxszxtbevo();
            }
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private ppxfxbqfkf() {
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f38995iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public static final long iobyxmoadg(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public static final class zoijcleaow implements View.OnAttachStateChangeListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ylkuphrtab.this.dxjokdxxww(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ylkuphrtab.this.btonecajqb(view.getContext());
            ylkuphrtab.this.gxszxtbevo();
        }
    }

    public ylkuphrtab(ViewGroup viewGroup) {
        this.f38990iobyxmoadg = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            dxjokdxxww(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(Context context) {
        if (this.f38992wkgbmnqykc) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f38989eablkybsjg);
            this.f38992wkgbmnqykc = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dxjokdxxww(Context context) {
        if (this.f38992wkgbmnqykc) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f38989eablkybsjg);
        this.f38992wkgbmnqykc = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gxszxtbevo() {
    }

    private final long lqeggnwhkg(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return wkgbmnqykc.iobyxmoadg(view);
        }
        return -1L;
    }

    private final androidx.compose.ui.graphics.layer.view.iobyxmoadg nufgyqmvbu(ViewGroup viewGroup) {
        androidx.compose.ui.graphics.layer.view.iobyxmoadg iobyxmoadgVar = this.f38991ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        androidx.compose.ui.graphics.layer.view.zoijcleaow zoijcleaowVar = new androidx.compose.ui.graphics.layer.view.zoijcleaow(viewGroup.getContext());
        viewGroup.addView(zoijcleaowVar);
        this.f38991ppxfxbqfkf = zoijcleaowVar;
        return zoijcleaowVar;
    }

    @Override // h.auzgnhcxok
    public void iobyxmoadg(k.ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f38993zoijcleaow) {
            ppxfxbqfkfVar.ylkuphrtab();
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // h.auzgnhcxok
    public k.ppxfxbqfkf zoijcleaow() {
        k.wkgbmnqykc yadqdtsiqtVar;
        k.ppxfxbqfkf ppxfxbqfkfVar;
        synchronized (this.f38993zoijcleaow) {
            try {
                long jLqeggnwhkg = lqeggnwhkg(this.f38990iobyxmoadg);
                if (Build.VERSION.SDK_INT >= 29) {
                    yadqdtsiqtVar = new k.cdpycssgdh(jLqeggnwhkg, null, null, 6, null);
                } else if (f38988lqeggnwhkg) {
                    try {
                        yadqdtsiqtVar = new k.gxszxtbevo(this.f38990iobyxmoadg, jLqeggnwhkg, null, null, 12, null);
                    } catch (Throwable unused) {
                        f38988lqeggnwhkg = false;
                        yadqdtsiqtVar = new k.yadqdtsiqt(nufgyqmvbu(this.f38990iobyxmoadg), jLqeggnwhkg, null, null, 12, null);
                    }
                } else {
                    yadqdtsiqtVar = new k.yadqdtsiqt(nufgyqmvbu(this.f38990iobyxmoadg), jLqeggnwhkg, null, null, 12, null);
                }
                ppxfxbqfkfVar = new k.ppxfxbqfkf(yadqdtsiqtVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ppxfxbqfkfVar;
    }
}
