package md;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Runnable f66820iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Runnable f66821jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AtomicReference f66822yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Handler f66823zdlpuopuiu = new Handler(Looper.getMainLooper());

    private nufgyqmvbu(View view, Runnable runnable, Runnable runnable2) {
        this.f66822yggfygwlhe = new AtomicReference(view);
        this.f66821jyumaefscl = runnable;
        this.f66820iwizpuwonk = runnable2;
    }

    public static void iobyxmoadg(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new nufgyqmvbu(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f66822yggfygwlhe.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f66823zdlpuopuiu.post(this.f66821jyumaefscl);
        this.f66823zdlpuopuiu.postAtFrontOfQueue(this.f66820iwizpuwonk);
        return true;
    }
}
