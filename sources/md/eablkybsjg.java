package md;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Runnable f66807jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AtomicReference f66808yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Handler f66809zdlpuopuiu = new Handler(Looper.getMainLooper());

    private eablkybsjg(View view, Runnable runnable) {
        this.f66808yggfygwlhe = new AtomicReference(view);
        this.f66807jyumaefscl = runnable;
    }

    public static void ppxfxbqfkf(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new eablkybsjg(view, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zoijcleaow(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f66808yggfygwlhe.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: md.wkgbmnqykc
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f66834zdlpuopuiu.zoijcleaow(view);
            }
        });
        this.f66809zdlpuopuiu.postAtFrontOfQueue(this.f66807jyumaefscl);
    }
}
