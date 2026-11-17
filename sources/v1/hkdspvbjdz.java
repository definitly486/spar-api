package v1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Runnable f115126jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ViewTreeObserver f115127yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f115128zdlpuopuiu;

    private hkdspvbjdz(View view, Runnable runnable) {
        this.f115128zdlpuopuiu = view;
        this.f115127yggfygwlhe = view.getViewTreeObserver();
        this.f115126jyumaefscl = runnable;
    }

    public static hkdspvbjdz iobyxmoadg(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(hkdspvbjdzVar);
        view.addOnAttachStateChangeListener(hkdspvbjdzVar);
        return hkdspvbjdzVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        zoijcleaow();
        this.f115126jyumaefscl.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f115127yggfygwlhe = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        zoijcleaow();
    }

    public void zoijcleaow() {
        if (this.f115127yggfygwlhe.isAlive()) {
            this.f115127yggfygwlhe.removeOnPreDrawListener(this);
        } else {
            this.f115128zdlpuopuiu.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f115128zdlpuopuiu.removeOnAttachStateChangeListener(this);
    }
}
