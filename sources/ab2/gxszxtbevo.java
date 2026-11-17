package ab2;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.webview_screen.impl.chatorder.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ab2.iobyxmoadg f1298ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f1299zoijcleaow;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ab2.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0025iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final boolean f1300iobyxmoadg;

            public C0025iobyxmoadg(boolean z13) {
                super(null);
                this.f1300iobyxmoadg = z13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0025iobyxmoadg) && this.f1300iobyxmoadg == ((C0025iobyxmoadg) obj).f1300iobyxmoadg;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f1300iobyxmoadg);
            }

            public final boolean iobyxmoadg() {
                return this.f1300iobyxmoadg;
            }

            public String toString() {
                return "IsChatOrderEnabledChanged(isEnabled=" + this.f1300iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f1301iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String url) {
                super(null);
                zdlpuopuiu.btonecajqb(url, "url");
                this.f1301iobyxmoadg = url;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1301iobyxmoadg, ((zoijcleaow) obj).f1301iobyxmoadg);
            }

            public int hashCode() {
                return this.f1301iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f1301iobyxmoadg;
            }

            public String toString() {
                return "Site(url=" + this.f1301iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(lqeggnwhkg storeFactory, ab2.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f1299zoijcleaow = storeFactory;
        this.f1298ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, false, 3, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f1299zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f1310iobyxmoadg), this.f1298ppxfxbqfkf, new zoijcleaow());
    }
}
