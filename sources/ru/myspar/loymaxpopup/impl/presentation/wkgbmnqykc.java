package ru.myspar.loymaxpopup.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90145iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f90146ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f90147wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f90148zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String id2, AnalyticsPage page, String navLink, String str) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f90145iobyxmoadg = id2;
            this.f90148zoijcleaow = page;
            this.f90146ppxfxbqfkf = navLink;
            this.f90147wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f90145iobyxmoadg, iobyxmoadgVar.f90145iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f90148zoijcleaow, iobyxmoadgVar.f90148zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f90146ppxfxbqfkf, iobyxmoadgVar.f90146ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f90147wkgbmnqykc, iobyxmoadgVar.f90147wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f90145iobyxmoadg.hashCode() * 31) + this.f90148zoijcleaow.hashCode()) * 31) + this.f90146ppxfxbqfkf.hashCode()) * 31;
            String str = this.f90147wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f90147wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f90146ppxfxbqfkf;
        }

        public String toString() {
            return "OpenNavLink(id=" + this.f90145iobyxmoadg + ", page=" + this.f90148zoijcleaow + ", navLink=" + this.f90146ppxfxbqfkf + ", action=" + this.f90147wkgbmnqykc + ")";
        }

        public final AnalyticsPage wkgbmnqykc() {
            return this.f90148zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f90145iobyxmoadg;
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
