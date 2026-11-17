package no;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends mo.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f70456ppxfxbqfkf;

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final C1522zoijcleaow f70457wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(C1522zoijcleaow analyticFavoriteParams) {
            super("Добавление товара в избранное", null);
            zdlpuopuiu.btonecajqb(analyticFavoriteParams, "analyticFavoriteParams");
            this.f70457wkgbmnqykc = analyticFavoriteParams;
        }

        @Override // no.zoijcleaow
        public C1522zoijcleaow ppxfxbqfkf() {
            return this.f70457wkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final C1522zoijcleaow f70458wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(C1522zoijcleaow analyticFavoriteParams) {
            super("Удаление товара из Избранного", null);
            zdlpuopuiu.btonecajqb(analyticFavoriteParams, "analyticFavoriteParams");
            this.f70458wkgbmnqykc = analyticFavoriteParams;
        }

        @Override // no.zoijcleaow
        public C1522zoijcleaow ppxfxbqfkf() {
            return this.f70458wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: no.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1522zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsPage f70459iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f70460ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation f70461zoijcleaow;

        public C1522zoijcleaow(AnalyticsPage page, AnalyticsLocation analyticsLocation, AnalyticElement.ProductItemElement element) {
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(element, "element");
            this.f70459iobyxmoadg = page;
            this.f70461zoijcleaow = analyticsLocation;
            this.f70460ppxfxbqfkf = element;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1522zoijcleaow)) {
                return false;
            }
            C1522zoijcleaow c1522zoijcleaow = (C1522zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f70459iobyxmoadg, c1522zoijcleaow.f70459iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70461zoijcleaow, c1522zoijcleaow.f70461zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70460ppxfxbqfkf, c1522zoijcleaow.f70460ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f70459iobyxmoadg.hashCode() * 31;
            AnalyticsLocation analyticsLocation = this.f70461zoijcleaow;
            return ((iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31) + this.f70460ppxfxbqfkf.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f70460ppxfxbqfkf;
        }

        public final AnalyticsPage ppxfxbqfkf() {
            return this.f70459iobyxmoadg;
        }

        public String toString() {
            return "AnalyticFavoriteParams(page=" + this.f70459iobyxmoadg + ", location=" + this.f70461zoijcleaow + ", element=" + this.f70460ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f70461zoijcleaow;
        }
    }

    public /* synthetic */ zoijcleaow(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public abstract C1522zoijcleaow ppxfxbqfkf();

    @Override // mo.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, ppxfxbqfkf().ppxfxbqfkf());
        ru.myspar.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, ppxfxbqfkf().zoijcleaow());
        ru.myspar.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, ppxfxbqfkf().iobyxmoadg());
        return linkedHashMap;
    }

    private zoijcleaow(String str) {
        super(str);
        this.f70456ppxfxbqfkf = str;
    }
}
