package mj0;

import a8.lqeggnwhkg;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.partners.impl.screen.domain.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final mj0.iobyxmoadg f67331ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f67332zoijcleaow;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: mj0.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1390iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f67333iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1390iobyxmoadg(List partners) {
                super(null);
                zdlpuopuiu.btonecajqb(partners, "partners");
                this.f67333iobyxmoadg = partners;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1390iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67333iobyxmoadg, ((C1390iobyxmoadg) obj).f67333iobyxmoadg);
            }

            public int hashCode() {
                return this.f67333iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f67333iobyxmoadg;
            }

            public String toString() {
                return "Partners(partners=" + this.f67333iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(lqeggnwhkg storeFactory, mj0.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f67332zoijcleaow = storeFactory;
        this.f67331ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, 1, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f67332zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f67336iobyxmoadg), this.f67331ppxfxbqfkf, new zoijcleaow());
    }
}
