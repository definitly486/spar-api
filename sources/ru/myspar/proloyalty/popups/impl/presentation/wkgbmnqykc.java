package ru.myspar.proloyalty.popups.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99274iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f99275ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f99276wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f99277zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String id2, AnalyticsPage page, String navLink, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f99274iobyxmoadg = id2;
            this.f99277zoijcleaow = page;
            this.f99275ppxfxbqfkf = navLink;
            this.f99276wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f99274iobyxmoadg, iobyxmoadgVar.f99274iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99277zoijcleaow, iobyxmoadgVar.f99277zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99275ppxfxbqfkf, iobyxmoadgVar.f99275ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99276wkgbmnqykc, iobyxmoadgVar.f99276wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f99274iobyxmoadg.hashCode() * 31) + this.f99277zoijcleaow.hashCode()) * 31) + this.f99275ppxfxbqfkf.hashCode()) * 31;
            String str = this.f99276wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f99276wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f99275ppxfxbqfkf;
        }

        public String toString() {
            return "OpenNavLink(id=" + this.f99274iobyxmoadg + ", page=" + this.f99277zoijcleaow + ", navLink=" + this.f99275ppxfxbqfkf + ", action=" + this.f99276wkgbmnqykc + ")";
        }

        public final AnalyticsPage wkgbmnqykc() {
            return this.f99277zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f99274iobyxmoadg;
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
