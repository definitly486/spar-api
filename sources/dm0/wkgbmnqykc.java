package dm0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29163iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1050090938;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29164iobyxmoadg;

        public ppxfxbqfkf(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f29164iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29164iobyxmoadg, ((ppxfxbqfkf) obj).f29164iobyxmoadg);
        }

        public int hashCode() {
            return this.f29164iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29164iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shopId=" + this.f29164iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f29165iobyxmoadg;

        public zoijcleaow(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f29165iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29165iobyxmoadg, ((zoijcleaow) obj).f29165iobyxmoadg);
        }

        public int hashCode() {
            return this.f29165iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f29165iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f29165iobyxmoadg + ")";
        }
    }
}
