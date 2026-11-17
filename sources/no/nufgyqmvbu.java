package no;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends mo.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f70449ppxfxbqfkf;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsLocation.Search f70450iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f70451zoijcleaow;

        public iobyxmoadg(AnalyticsLocation.Search search, AnalyticElement element) {
            zdlpuopuiu.btonecajqb(element, "element");
            this.f70450iobyxmoadg = search;
            this.f70451zoijcleaow = element;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f70450iobyxmoadg, iobyxmoadgVar.f70450iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70451zoijcleaow, iobyxmoadgVar.f70451zoijcleaow);
        }

        public int hashCode() {
            AnalyticsLocation.Search search = this.f70450iobyxmoadg;
            return ((search == null ? 0 : search.hashCode()) * 31) + this.f70451zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f70451zoijcleaow;
        }

        public String toString() {
            return "SearchAnalyticParams(location=" + this.f70450iobyxmoadg + ", element=" + this.f70451zoijcleaow + ")";
        }

        public final AnalyticsLocation.Search zoijcleaow() {
            return this.f70450iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(iobyxmoadg analyticParams) {
        super("Поиск");
        zdlpuopuiu.btonecajqb(analyticParams, "analyticParams");
        this.f70449ppxfxbqfkf = analyticParams;
    }

    @Override // mo.iobyxmoadg
    public Map zoijcleaow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.myspar.analytics.api.model.iobyxmoadg.wkgbmnqykc(linkedHashMap, AnalyticsPage.Search.f84345iwizpuwonk);
        ru.myspar.analytics.api.model.iobyxmoadg.ppxfxbqfkf(linkedHashMap, this.f70449ppxfxbqfkf.zoijcleaow());
        ru.myspar.analytics.api.model.iobyxmoadg.iobyxmoadg(linkedHashMap, this.f70449ppxfxbqfkf.iobyxmoadg());
        return linkedHashMap;
    }
}
