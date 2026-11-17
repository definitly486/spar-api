package xm0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow extends wm0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f122895ppxfxbqfkf;

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final C3095zoijcleaow f122896wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(C3095zoijcleaow analyticFavoriteParams) {
            super("Добавление товара в избранное", null);
            zdlpuopuiu.btonecajqb(analyticFavoriteParams, "analyticFavoriteParams");
            this.f122896wkgbmnqykc = analyticFavoriteParams;
        }

        @Override // xm0.zoijcleaow
        public C3095zoijcleaow ppxfxbqfkf() {
            return this.f122896wkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final C3095zoijcleaow f122897wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(C3095zoijcleaow analyticFavoriteParams) {
            super("Удаление товара из Избранного", null);
            zdlpuopuiu.btonecajqb(analyticFavoriteParams, "analyticFavoriteParams");
            this.f122897wkgbmnqykc = analyticFavoriteParams;
        }

        @Override // xm0.zoijcleaow
        public C3095zoijcleaow ppxfxbqfkf() {
            return this.f122897wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: xm0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C3095zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsPage f122898iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f122899ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation f122900zoijcleaow;

        public C3095zoijcleaow(AnalyticsPage page, AnalyticsLocation analyticsLocation, AnalyticElement.ProductItemElement element) {
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(element, "element");
            this.f122898iobyxmoadg = page;
            this.f122900zoijcleaow = analyticsLocation;
            this.f122899ppxfxbqfkf = element;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3095zoijcleaow)) {
                return false;
            }
            C3095zoijcleaow c3095zoijcleaow = (C3095zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f122898iobyxmoadg, c3095zoijcleaow.f122898iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122900zoijcleaow, c3095zoijcleaow.f122900zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122899ppxfxbqfkf, c3095zoijcleaow.f122899ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f122898iobyxmoadg.hashCode() * 31;
            AnalyticsLocation analyticsLocation = this.f122900zoijcleaow;
            return ((iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31) + this.f122899ppxfxbqfkf.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f122899ppxfxbqfkf;
        }

        public final AnalyticsPage ppxfxbqfkf() {
            return this.f122898iobyxmoadg;
        }

        public String toString() {
            return "AnalyticFavoriteParams(page=" + this.f122898iobyxmoadg + ", location=" + this.f122900zoijcleaow + ", element=" + this.f122899ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f122900zoijcleaow;
        }
    }

    public /* synthetic */ zoijcleaow(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public abstract C3095zoijcleaow ppxfxbqfkf();

    @Override // wm0.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, ppxfxbqfkf().ppxfxbqfkf());
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, ppxfxbqfkf().zoijcleaow());
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, ppxfxbqfkf().iobyxmoadg());
        return linkedHashMap;
    }

    private zoijcleaow(String str) {
        super(str);
        this.f122895ppxfxbqfkf = str;
    }
}
