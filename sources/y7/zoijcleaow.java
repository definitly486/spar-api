package y7;

import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg implements y7.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private volatile boolean f124022iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f124023zoijcleaow;

        iobyxmoadg(draadjrbmk draadjrbmkVar) {
            this.f124023zoijcleaow = draadjrbmkVar;
        }

        @Override // y7.iobyxmoadg
        public void iobyxmoadg() {
            zoijcleaow(true);
            this.f124023zoijcleaow.invoke(this);
        }

        public void zoijcleaow(boolean z13) {
            this.f124022iobyxmoadg = z13;
        }
    }

    public static final y7.iobyxmoadg iobyxmoadg(draadjrbmk onDispose) {
        zdlpuopuiu.btonecajqb(onDispose, "onDispose");
        return new iobyxmoadg(onDispose);
    }
}
