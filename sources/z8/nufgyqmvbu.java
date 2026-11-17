package z8;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.yggfygwlhe;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class nufgyqmvbu implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Set f129272iobyxmoadg = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    volatile boolean f129273zoijcleaow;

    class iobyxmoadg implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f129275zdlpuopuiu;

        /* JADX INFO: renamed from: z8.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class RunnableC3284iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f129277zdlpuopuiu;

            RunnableC3284iobyxmoadg(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f129277zdlpuopuiu = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                yggfygwlhe.zoijcleaow().nufgyqmvbu();
                nufgyqmvbu.this.f129273zoijcleaow = true;
                nufgyqmvbu.zoijcleaow(iobyxmoadg.this.f129275zdlpuopuiu, this.f129277zdlpuopuiu);
                nufgyqmvbu.this.f129272iobyxmoadg.clear();
            }
        }

        iobyxmoadg(View view) {
            this.f129275zdlpuopuiu = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            g9.draadjrbmk.yggfygwlhe(new RunnableC3284iobyxmoadg(this));
        }
    }

    nufgyqmvbu() {
    }

    static void zoijcleaow(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // z8.dxjokdxxww
    public void iobyxmoadg(Activity activity) {
        if (!this.f129273zoijcleaow && this.f129272iobyxmoadg.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new iobyxmoadg(decorView));
        }
    }
}
