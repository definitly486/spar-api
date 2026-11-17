package mh1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67196iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f67197ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f67198wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f67199zoijcleaow;

        public iobyxmoadg(String id2, AnalyticsPage page, String navLink, String str) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f67196iobyxmoadg = id2;
            this.f67199zoijcleaow = page;
            this.f67197ppxfxbqfkf = navLink;
            this.f67198wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f67196iobyxmoadg, iobyxmoadgVar.f67196iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67199zoijcleaow, iobyxmoadgVar.f67199zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67197ppxfxbqfkf, iobyxmoadgVar.f67197ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f67198wkgbmnqykc, iobyxmoadgVar.f67198wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f67196iobyxmoadg.hashCode() * 31) + this.f67199zoijcleaow.hashCode()) * 31) + this.f67197ppxfxbqfkf.hashCode()) * 31;
            String str = this.f67198wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f67198wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f67197ppxfxbqfkf;
        }

        public String toString() {
            return "OpenNavLink(id=" + this.f67196iobyxmoadg + ", page=" + this.f67199zoijcleaow + ", navLink=" + this.f67197ppxfxbqfkf + ", action=" + this.f67198wkgbmnqykc + ")";
        }

        public final AnalyticsPage wkgbmnqykc() {
            return this.f67199zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f67196iobyxmoadg;
        }
    }
}
