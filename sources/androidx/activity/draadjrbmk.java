package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk extends Dialog implements androidx.lifecycle.vdvldrhtss, lereixgezr, q5.dxjokdxxww {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwizpuwonk f2289jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final q5.nufgyqmvbu f2290yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private androidx.lifecycle.kcexrzcfyt f2291zdlpuopuiu;

    public /* synthetic */ draadjrbmk(Context context, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? 0 : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(draadjrbmk this$0) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        super.onBackPressed();
    }

    private final androidx.lifecycle.kcexrzcfyt zoijcleaow() {
        androidx.lifecycle.kcexrzcfyt kcexrzcfytVar = this.f2291zdlpuopuiu;
        if (kcexrzcfytVar != null) {
            return kcexrzcfytVar;
        }
        androidx.lifecycle.kcexrzcfyt kcexrzcfytVar2 = new androidx.lifecycle.kcexrzcfyt(this);
        this.f2291zdlpuopuiu = kcexrzcfytVar2;
        return kcexrzcfytVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        ppxfxbqfkf();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public androidx.lifecycle.gtknphoqwx getLifecycle() {
        return zoijcleaow();
    }

    @Override // androidx.activity.lereixgezr
    public final iwizpuwonk getOnBackPressedDispatcher() {
        return this.f2289jyumaefscl;
    }

    @Override // q5.dxjokdxxww
    public q5.gxszxtbevo getSavedStateRegistry() {
        return this.f2290yggfygwlhe.zoijcleaow();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f2289jyumaefscl.draadjrbmk();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            iwizpuwonk iwizpuwonkVar = this.f2289jyumaefscl;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            iwizpuwonkVar.ojitshcjhn(onBackInvokedDispatcher);
        }
        this.f2290yggfygwlhe.wkgbmnqykc(bundle);
        zoijcleaow().dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f2290yggfygwlhe.eablkybsjg(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        zoijcleaow().dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        zoijcleaow().dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY);
        this.f2291zdlpuopuiu = null;
        super.onStop();
    }

    public void ppxfxbqfkf() {
        Window window = getWindow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView, "window!!.decorView");
        vipkmwdibw.zoijcleaow(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView2, "window!!.decorView");
        cdpycssgdh.zoijcleaow(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView3, "window!!.decorView");
        q5.wflxmlrfwp.zoijcleaow(decorView3, this);
    }

    @Override // android.app.Dialog
    public void setContentView(int i13) {
        ppxfxbqfkf();
        super.setContentView(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, int i13) {
        super(context, i13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f2290yggfygwlhe = q5.nufgyqmvbu.f77857ppxfxbqfkf.zoijcleaow(this);
        this.f2289jyumaefscl = new iwizpuwonk(new Runnable() { // from class: androidx.activity.gtknphoqwx
            @Override // java.lang.Runnable
            public final void run() {
                draadjrbmk.wkgbmnqykc(this.f2295zdlpuopuiu);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        ppxfxbqfkf();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        ppxfxbqfkf();
        super.setContentView(view, layoutParams);
    }
}
