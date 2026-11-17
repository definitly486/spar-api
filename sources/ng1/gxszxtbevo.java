package ng1;

import a8.lqeggnwhkg;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.partners.impl.screen.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f70052ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ng1.iobyxmoadg f70053wkgbmnqykc;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ng1.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1508iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f70054iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1508iobyxmoadg(List partners) {
                super(null);
                zdlpuopuiu.btonecajqb(partners, "partners");
                this.f70054iobyxmoadg = partners;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1508iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70054iobyxmoadg, ((C1508iobyxmoadg) obj).f70054iobyxmoadg);
            }

            public int hashCode() {
                return this.f70054iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f70054iobyxmoadg;
            }

            public String toString() {
                return "Partners(partners=" + this.f70054iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(lqeggnwhkg storeFactory, ng1.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f70052ppxfxbqfkf = storeFactory;
        this.f70053wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f70052ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f70057iobyxmoadg), this.f70053wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, 1, null);
    }
}
