package ru.myspar.legacy.presentation.screen.filters;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.FilterSection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FilterSection f89211iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(FilterSection filterSection) {
            super(null);
            zdlpuopuiu.btonecajqb(filterSection, "filterSection");
            this.f89211iobyxmoadg = filterSection;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f89211iobyxmoadg, ((eablkybsjg) obj).f89211iobyxmoadg);
        }

        public int hashCode() {
            return this.f89211iobyxmoadg.hashCode();
        }

        public final FilterSection iobyxmoadg() {
            return this.f89211iobyxmoadg;
        }

        public String toString() {
            return "ShowAllFilters(filterSection=" + this.f89211iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89212iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.filters.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2044ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2044ppxfxbqfkf f89213iobyxmoadg = new C2044ppxfxbqfkf();

        private C2044ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FilterSection f89214iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(FilterSection filterSection) {
            super(null);
            zdlpuopuiu.btonecajqb(filterSection, "filterSection");
            this.f89214iobyxmoadg = filterSection;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f89214iobyxmoadg, ((wkgbmnqykc) obj).f89214iobyxmoadg);
        }

        public int hashCode() {
            return this.f89214iobyxmoadg.hashCode();
        }

        public final FilterSection iobyxmoadg() {
            return this.f89214iobyxmoadg;
        }

        public String toString() {
            return "OnFilterChanged(filterSection=" + this.f89214iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f89215iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
