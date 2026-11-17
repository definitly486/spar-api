package tr0;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.zynmafqrjb;
import gg.dxjokdxxww;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements zynmafqrjb, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ draadjrbmk f111422zdlpuopuiu;

        iobyxmoadg(draadjrbmk function) {
            zdlpuopuiu.btonecajqb(function, "function");
            this.f111422zdlpuopuiu = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof zynmafqrjb) && (obj instanceof agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public final /* synthetic */ void iobyxmoadg(Object obj) {
            this.f111422zdlpuopuiu.invoke(obj);
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final dxjokdxxww zoijcleaow() {
            return this.f111422zdlpuopuiu;
        }
    }

    public static final ppxfxbqfkf iobyxmoadg(Fragment fragment, tg.iobyxmoadg viewFactory) {
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        zdlpuopuiu.btonecajqb(viewFactory, "viewFactory");
        return new ppxfxbqfkf(fragment, viewFactory);
    }
}
