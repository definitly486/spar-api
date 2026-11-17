package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements fyldjkxazc, grlcpdaxtj, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static long f5252istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f5253pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f5254zynmafqrjb = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f5256esjtqupxsv;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f5258jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private long f5259lereixgezr;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f5261zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final PriorityQueue f5260yggfygwlhe = new PriorityQueue(11, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.iobyxmoadg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zoijcleaow.lqeggnwhkg((mhtqkkgtqm) obj, (mhtqkkgtqm) obj2);
        }
    });

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Choreographer f5257iwizpuwonk = Choreographer.getInstance();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final C0090zoijcleaow f5255cqumvgiudr = new C0090zoijcleaow();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        public final void zoijcleaow(View view) {
            float refreshRate;
            if (zoijcleaow.f5252istkbnxepw == 0) {
                Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                zoijcleaow.f5252istkbnxepw = (long) (1000000000 / refreshRate);
            }
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0090zoijcleaow implements ageimvtcrz {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f5262iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f5263zoijcleaow;

        @Override // androidx.compose.foundation.lazy.layout.ageimvtcrz
        public long iobyxmoadg() {
            if (this.f5262iobyxmoadg) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.f5263zoijcleaow - System.nanoTime());
        }

        public final void ppxfxbqfkf(boolean z13) {
            this.f5262iobyxmoadg = z13;
        }

        public final void wkgbmnqykc(long j13) {
            this.f5263zoijcleaow = j13;
        }

        public final boolean zoijcleaow() {
            return this.f5262iobyxmoadg;
        }
    }

    public zoijcleaow(View view) {
        this.f5261zdlpuopuiu = view;
        f5253pmvmpeiblj.zoijcleaow(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final void dxjokdxxww() {
        if (this.f5258jyumaefscl) {
            return;
        }
        this.f5258jyumaefscl = true;
        this.f5261zdlpuopuiu.post(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lqeggnwhkg(mhtqkkgtqm mhtqkkgtqmVar, mhtqkkgtqm mhtqkkgtqmVar2) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(mhtqkkgtqmVar2.ppxfxbqfkf(), mhtqkkgtqmVar.ppxfxbqfkf());
    }

    private final boolean nufgyqmvbu() {
        long jIobyxmoadg = this.f5255cqumvgiudr.iobyxmoadg();
        y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:available_time_nanos", jIobyxmoadg);
        boolean z13 = true;
        if (jIobyxmoadg > 0) {
            Object objPeek = this.f5260yggfygwlhe.peek();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objPeek);
            if (!((mhtqkkgtqm) objPeek).wkgbmnqykc().wkgbmnqykc(this.f5255cqumvgiudr)) {
                this.f5260yggfygwlhe.poll();
                z13 = false;
            }
            this.f5255cqumvgiudr.ppxfxbqfkf(false);
        }
        return z13;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j13) {
        if (this.f5256esjtqupxsv) {
            this.f5259lereixgezr = j13;
            this.f5261zdlpuopuiu.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f5256esjtqupxsv = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f5256esjtqupxsv = false;
        this.f5261zdlpuopuiu.removeCallbacks(this);
        this.f5257iwizpuwonk.removeFrameCallback(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.grlcpdaxtj
    public void ppxfxbqfkf(fiwbwshyhd fiwbwshyhdVar) {
        this.f5260yggfygwlhe.add(new mhtqkkgtqm(mhtqkkgtqm.f5072ppxfxbqfkf.zoijcleaow(), fiwbwshyhdVar));
        dxjokdxxww();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5260yggfygwlhe.isEmpty() || !this.f5258jyumaefscl || !this.f5256esjtqupxsv || this.f5261zdlpuopuiu.getWindowVisibility() != 0) {
            this.f5258jyumaefscl = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f5261zdlpuopuiu.getDrawingTime());
        this.f5255cqumvgiudr.ppxfxbqfkf(System.nanoTime() > (((long) 2) * f5252istkbnxepw) + nanos);
        this.f5255cqumvgiudr.wkgbmnqykc(Math.max(this.f5259lereixgezr, nanos) + f5252istkbnxepw);
        boolean zNufgyqmvbu = false;
        while (!this.f5260yggfygwlhe.isEmpty() && !zNufgyqmvbu) {
            if (this.f5255cqumvgiudr.zoijcleaow()) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    zNufgyqmvbu = nufgyqmvbu();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                zNufgyqmvbu = nufgyqmvbu();
            }
        }
        if (zNufgyqmvbu) {
            this.f5257iwizpuwonk.postFrameCallback(this);
        } else {
            this.f5258jyumaefscl = false;
        }
        y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    @Override // androidx.compose.foundation.lazy.layout.grlcpdaxtj
    public void zoijcleaow(fiwbwshyhd fiwbwshyhdVar) {
        this.f5260yggfygwlhe.add(new mhtqkkgtqm(mhtqkkgtqm.f5072ppxfxbqfkf.iobyxmoadg(), fiwbwshyhdVar));
        dxjokdxxww();
    }
}
