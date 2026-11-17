package hf0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40132iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f40133ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f40134wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f40135zoijcleaow;

        public iobyxmoadg(String id2, AnalyticsPage page, String navLink, String str) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f40132iobyxmoadg = id2;
            this.f40135zoijcleaow = page;
            this.f40133ppxfxbqfkf = navLink;
            this.f40134wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f40132iobyxmoadg, iobyxmoadgVar.f40132iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40135zoijcleaow, iobyxmoadgVar.f40135zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40133ppxfxbqfkf, iobyxmoadgVar.f40133ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f40134wkgbmnqykc, iobyxmoadgVar.f40134wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f40132iobyxmoadg.hashCode() * 31) + this.f40135zoijcleaow.hashCode()) * 31) + this.f40133ppxfxbqfkf.hashCode()) * 31;
            String str = this.f40134wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f40134wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f40133ppxfxbqfkf;
        }

        public String toString() {
            return "OpenNavLink(id=" + this.f40132iobyxmoadg + ", page=" + this.f40135zoijcleaow + ", navLink=" + this.f40133ppxfxbqfkf + ", action=" + this.f40134wkgbmnqykc + ")";
        }

        public final AnalyticsPage wkgbmnqykc() {
            return this.f40135zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f40132iobyxmoadg;
        }
    }
}
