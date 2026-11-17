package ru.myspar.proloyalty.notification.impl.presentation;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f98503iobyxmoadg;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2354iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2354iobyxmoadg f98504iobyxmoadg = new C2354iobyxmoadg();

            private C2354iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2354iobyxmoadg);
            }

            public int hashCode() {
                return 1351502874;
            }

            public String toString() {
                return "NonAuth";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Map f98505iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(Map tabs) {
                super(null);
                zdlpuopuiu.btonecajqb(tabs, "tabs");
                this.f98505iobyxmoadg = tabs;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f98505iobyxmoadg, ((zoijcleaow) obj).f98505iobyxmoadg);
            }

            public int hashCode() {
                return this.f98505iobyxmoadg.hashCode();
            }

            public final Map iobyxmoadg() {
                return this.f98505iobyxmoadg;
            }

            public String toString() {
                return "Notifications(tabs=" + this.f98505iobyxmoadg + ")";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98506iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f98507zoijcleaow;

        public zoijcleaow(boolean z13, List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            this.f98506iobyxmoadg = z13;
            this.f98507zoijcleaow = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f98506iobyxmoadg == zoijcleaowVar.f98506iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f98507zoijcleaow, zoijcleaowVar.f98507zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f98506iobyxmoadg) * 31) + this.f98507zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f98507zoijcleaow;
        }

        public String toString() {
            return "TabContent(isRefreshing=" + this.f98506iobyxmoadg + ", items=" + this.f98507zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f98506iobyxmoadg;
        }
    }

    public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f98503iobyxmoadg = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f98503iobyxmoadg, ((ppxfxbqfkf) obj).f98503iobyxmoadg);
    }

    public int hashCode() {
        iobyxmoadg iobyxmoadgVar = this.f98503iobyxmoadg;
        if (iobyxmoadgVar == null) {
            return 0;
        }
        return iobyxmoadgVar.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f98503iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f98503iobyxmoadg + ")";
    }
}
