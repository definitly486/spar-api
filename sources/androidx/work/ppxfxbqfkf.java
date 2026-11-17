package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.common.util.concurrent.wkgbmnqykc;
import g6.btonecajqb;
import g6.stevsuqkhv;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.work.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0209iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final androidx.work.zoijcleaow f14015iobyxmoadg;

            public C0209iobyxmoadg() {
                this(androidx.work.zoijcleaow.f14017ppxfxbqfkf);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0209iobyxmoadg.class != obj.getClass()) {
                    return false;
                }
                return this.f14015iobyxmoadg.equals(((C0209iobyxmoadg) obj).f14015iobyxmoadg);
            }

            public int hashCode() {
                return (C0209iobyxmoadg.class.getName().hashCode() * 31) + this.f14015iobyxmoadg.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f14015iobyxmoadg + '}';
            }

            public androidx.work.zoijcleaow wkgbmnqykc() {
                return this.f14015iobyxmoadg;
            }

            public C0209iobyxmoadg(androidx.work.zoijcleaow zoijcleaowVar) {
                this.f14015iobyxmoadg = zoijcleaowVar;
            }
        }

        /* JADX INFO: renamed from: androidx.work.ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C0210ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final androidx.work.zoijcleaow f14016iobyxmoadg;

            public C0210ppxfxbqfkf() {
                this(androidx.work.zoijcleaow.f14017ppxfxbqfkf);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0210ppxfxbqfkf.class != obj.getClass()) {
                    return false;
                }
                return this.f14016iobyxmoadg.equals(((C0210ppxfxbqfkf) obj).f14016iobyxmoadg);
            }

            public int hashCode() {
                return (C0210ppxfxbqfkf.class.getName().hashCode() * 31) + this.f14016iobyxmoadg.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f14016iobyxmoadg + '}';
            }

            public androidx.work.zoijcleaow wkgbmnqykc() {
                return this.f14016iobyxmoadg;
            }

            public C0210ppxfxbqfkf(androidx.work.zoijcleaow zoijcleaowVar) {
                this.f14016iobyxmoadg = zoijcleaowVar;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && zoijcleaow.class == obj.getClass();
            }

            public int hashCode() {
                return zoijcleaow.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        iobyxmoadg() {
        }

        public static iobyxmoadg iobyxmoadg() {
            return new C0209iobyxmoadg();
        }

        public static iobyxmoadg ppxfxbqfkf() {
            return new C0210ppxfxbqfkf();
        }

        public static iobyxmoadg zoijcleaow() {
            return new zoijcleaow();
        }
    }

    public ppxfxbqfkf(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.iobyxmoadg();
    }

    public abstract wkgbmnqykc getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.ppxfxbqfkf();
    }

    public final zoijcleaow getInputData() {
        return this.mWorkerParams.wkgbmnqykc();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.eablkybsjg();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.lqeggnwhkg();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.nufgyqmvbu();
    }

    public r6.zoijcleaow getTaskExecutor() {
        return this.mWorkerParams.dxjokdxxww();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.btonecajqb();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.gtknphoqwx();
    }

    public stevsuqkhv getWorkerFactory() {
        return this.mWorkerParams.wflxmlrfwp();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final wkgbmnqykc setForegroundAsync(btonecajqb btonecajqbVar) {
        return this.mWorkerParams.zoijcleaow().iobyxmoadg(getApplicationContext(), getId(), btonecajqbVar);
    }

    public wkgbmnqykc setProgressAsync(zoijcleaow zoijcleaowVar) {
        return this.mWorkerParams.gxszxtbevo().iobyxmoadg(getApplicationContext(), getId(), zoijcleaowVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract wkgbmnqykc startWork();

    public final void stop(int i13) {
        if (this.mStopReason.compareAndSet(-256, i13)) {
            onStopped();
        }
    }
}
