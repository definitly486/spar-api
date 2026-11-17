package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f8364iobyxmoadg;

    private static class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static HandlerThread f8365eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static Handler f8366gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f8367iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        SparseIntArray[] f8370zoijcleaow = new SparseIntArray[9];

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ArrayList f8368ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f8369wkgbmnqykc = new WindowOnFrameMetricsAvailableListenerC0132iobyxmoadg();

        /* JADX INFO: renamed from: androidx.core.app.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0132iobyxmoadg implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0132iobyxmoadg() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i13) {
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                if ((iobyxmoadgVar.f8367iobyxmoadg & 1) != 0) {
                    iobyxmoadgVar.eablkybsjg(iobyxmoadgVar.f8370zoijcleaow[0], frameMetrics.getMetric(8));
                }
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                if ((iobyxmoadgVar2.f8367iobyxmoadg & 2) != 0) {
                    iobyxmoadgVar2.eablkybsjg(iobyxmoadgVar2.f8370zoijcleaow[1], frameMetrics.getMetric(1));
                }
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                if ((iobyxmoadgVar3.f8367iobyxmoadg & 4) != 0) {
                    iobyxmoadgVar3.eablkybsjg(iobyxmoadgVar3.f8370zoijcleaow[2], frameMetrics.getMetric(3));
                }
                iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
                if ((iobyxmoadgVar4.f8367iobyxmoadg & 8) != 0) {
                    iobyxmoadgVar4.eablkybsjg(iobyxmoadgVar4.f8370zoijcleaow[3], frameMetrics.getMetric(4));
                }
                iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
                if ((iobyxmoadgVar5.f8367iobyxmoadg & 16) != 0) {
                    iobyxmoadgVar5.eablkybsjg(iobyxmoadgVar5.f8370zoijcleaow[4], frameMetrics.getMetric(5));
                }
                iobyxmoadg iobyxmoadgVar6 = iobyxmoadg.this;
                if ((iobyxmoadgVar6.f8367iobyxmoadg & 64) != 0) {
                    iobyxmoadgVar6.eablkybsjg(iobyxmoadgVar6.f8370zoijcleaow[6], frameMetrics.getMetric(7));
                }
                iobyxmoadg iobyxmoadgVar7 = iobyxmoadg.this;
                if ((iobyxmoadgVar7.f8367iobyxmoadg & 32) != 0) {
                    iobyxmoadgVar7.eablkybsjg(iobyxmoadgVar7.f8370zoijcleaow[5], frameMetrics.getMetric(6));
                }
                iobyxmoadg iobyxmoadgVar8 = iobyxmoadg.this;
                if ((iobyxmoadgVar8.f8367iobyxmoadg & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    iobyxmoadgVar8.eablkybsjg(iobyxmoadgVar8.f8370zoijcleaow[7], frameMetrics.getMetric(0));
                }
                iobyxmoadg iobyxmoadgVar9 = iobyxmoadg.this;
                if ((iobyxmoadgVar9.f8367iobyxmoadg & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    iobyxmoadgVar9.eablkybsjg(iobyxmoadgVar9.f8370zoijcleaow[8], frameMetrics.getMetric(2));
                }
            }
        }

        iobyxmoadg(int i13) {
            this.f8367iobyxmoadg = i13;
        }

        void eablkybsjg(SparseIntArray sparseIntArray, long j13) {
            if (sparseIntArray != null) {
                int i13 = (int) ((500000 + j13) / 1000000);
                if (j13 >= 0) {
                    sparseIntArray.put(i13, sparseIntArray.get(i13) + 1);
                }
            }
        }

        @Override // androidx.core.app.nufgyqmvbu.zoijcleaow
        public void iobyxmoadg(Activity activity) {
            if (f8365eablkybsjg == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f8365eablkybsjg = handlerThread;
                handlerThread.start();
                f8366gxszxtbevo = new Handler(f8365eablkybsjg.getLooper());
            }
            for (int i13 = 0; i13 <= 8; i13++) {
                SparseIntArray[] sparseIntArrayArr = this.f8370zoijcleaow;
                if (sparseIntArrayArr[i13] == null && (this.f8367iobyxmoadg & (1 << i13)) != 0) {
                    sparseIntArrayArr[i13] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f8369wkgbmnqykc, f8366gxszxtbevo);
            this.f8368ppxfxbqfkf.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.nufgyqmvbu.zoijcleaow
        public SparseIntArray[] ppxfxbqfkf(Activity activity) {
            for (WeakReference weakReference : this.f8368ppxfxbqfkf) {
                if (weakReference.get() == activity) {
                    this.f8368ppxfxbqfkf.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f8369wkgbmnqykc);
            return this.f8370zoijcleaow;
        }

        @Override // androidx.core.app.nufgyqmvbu.zoijcleaow
        public SparseIntArray[] wkgbmnqykc() {
            SparseIntArray[] sparseIntArrayArr = this.f8370zoijcleaow;
            this.f8370zoijcleaow = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.nufgyqmvbu.zoijcleaow
        public SparseIntArray[] zoijcleaow() {
            return this.f8370zoijcleaow;
        }
    }

    private static class zoijcleaow {
        zoijcleaow() {
        }

        public abstract void iobyxmoadg(Activity activity);

        public abstract SparseIntArray[] ppxfxbqfkf(Activity activity);

        public abstract SparseIntArray[] wkgbmnqykc();

        public abstract SparseIntArray[] zoijcleaow();
    }

    public nufgyqmvbu() {
        this(1);
    }

    public void iobyxmoadg(Activity activity) {
        this.f8364iobyxmoadg.iobyxmoadg(activity);
    }

    public SparseIntArray[] ppxfxbqfkf(Activity activity) {
        return this.f8364iobyxmoadg.ppxfxbqfkf(activity);
    }

    public SparseIntArray[] wkgbmnqykc() {
        return this.f8364iobyxmoadg.wkgbmnqykc();
    }

    public SparseIntArray[] zoijcleaow() {
        return this.f8364iobyxmoadg.zoijcleaow();
    }

    public nufgyqmvbu(int i13) {
        this.f8364iobyxmoadg = new iobyxmoadg(i13);
    }
}
