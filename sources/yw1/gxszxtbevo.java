package yw1;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f126816ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yw1.iobyxmoadg f126817wkgbmnqykc;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: yw1.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3241iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final boolean f126818iobyxmoadg;

            public C3241iobyxmoadg(boolean z13) {
                super(null);
                this.f126818iobyxmoadg = z13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3241iobyxmoadg) && this.f126818iobyxmoadg == ((C3241iobyxmoadg) obj).f126818iobyxmoadg;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f126818iobyxmoadg);
            }

            public final boolean iobyxmoadg() {
                return this.f126818iobyxmoadg;
            }

            public String toString() {
                return "IsChatOrderEnabledChanged(isEnabled=" + this.f126818iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f126819iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f126820zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String url, String str) {
                super(null);
                zdlpuopuiu.btonecajqb(url, "url");
                this.f126819iobyxmoadg = url;
                this.f126820zoijcleaow = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f126819iobyxmoadg, zoijcleaowVar.f126819iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126820zoijcleaow, zoijcleaowVar.f126820zoijcleaow);
            }

            public int hashCode() {
                int iHashCode = this.f126819iobyxmoadg.hashCode() * 31;
                String str = this.f126820zoijcleaow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String iobyxmoadg() {
                return this.f126820zoijcleaow;
            }

            public String toString() {
                return "Site(url=" + this.f126819iobyxmoadg + ", token=" + this.f126820zoijcleaow + ")";
            }

            public final String zoijcleaow() {
                return this.f126819iobyxmoadg;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(lqeggnwhkg storeFactory, yw1.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f126816ppxfxbqfkf = storeFactory;
        this.f126817wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f126816ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f126835iobyxmoadg), this.f126817wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, false, null, 7, null);
    }
}
