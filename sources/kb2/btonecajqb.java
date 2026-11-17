package kb2;

import android.os.Handler;
import android.os.Looper;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.jyumaefscl;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f54404iobyxmoadg = new btonecajqb();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx f54406zoijcleaow = draadjrbmk.zoijcleaow(iobyxmoadg.f54407zdlpuopuiu);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gtknphoqwx f54405ppxfxbqfkf = draadjrbmk.zoijcleaow(zoijcleaow.f54408zdlpuopuiu);

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f54407zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f54408zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private btonecajqb() {
    }

    public final Handler iobyxmoadg() {
        return (Handler) f54405ppxfxbqfkf.getValue();
    }
}
