package xm0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends wm0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f122888ppxfxbqfkf;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsLocation.Search f122889iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f122890zoijcleaow;

        public iobyxmoadg(AnalyticsLocation.Search search, AnalyticElement element) {
            zdlpuopuiu.btonecajqb(element, "element");
            this.f122889iobyxmoadg = search;
            this.f122890zoijcleaow = element;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f122889iobyxmoadg, iobyxmoadgVar.f122889iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122890zoijcleaow, iobyxmoadgVar.f122890zoijcleaow);
        }

        public int hashCode() {
            AnalyticsLocation.Search search = this.f122889iobyxmoadg;
            return ((search == null ? 0 : search.hashCode()) * 31) + this.f122890zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f122890zoijcleaow;
        }

        public String toString() {
            return "SearchAnalyticParams(location=" + this.f122889iobyxmoadg + ", element=" + this.f122890zoijcleaow + ")";
        }

        public final AnalyticsLocation.Search zoijcleaow() {
            return this.f122889iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(iobyxmoadg analyticParams) {
        super("Поиск");
        zdlpuopuiu.btonecajqb(analyticParams, "analyticParams");
        this.f122888ppxfxbqfkf = analyticParams;
    }

    @Override // wm0.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, AnalyticsPage.Search.f92373iwizpuwonk);
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, this.f122888ppxfxbqfkf.zoijcleaow());
        ru.myspar.proloyalty.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, this.f122888ppxfxbqfkf.iobyxmoadg());
        return linkedHashMap;
    }
}
