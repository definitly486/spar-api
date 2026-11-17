package rq0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final uq0.iobyxmoadg.zoijcleaow f83587iobyxmoadg;

        public btonecajqb(uq0.iobyxmoadg.zoijcleaow item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f83587iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f83587iobyxmoadg, ((btonecajqb) obj).f83587iobyxmoadg);
        }

        public int hashCode() {
            return this.f83587iobyxmoadg.hashCode();
        }

        public final uq0.iobyxmoadg.zoijcleaow iobyxmoadg() {
            return this.f83587iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckDialog(item=" + this.f83587iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83588iobyxmoadg;

        public dxjokdxxww(String orderEditId) {
            zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
            this.f83588iobyxmoadg = orderEditId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f83588iobyxmoadg, ((dxjokdxxww) obj).f83588iobyxmoadg);
        }

        public int hashCode() {
            return this.f83588iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83588iobyxmoadg;
        }

        public String toString() {
            return "ReturnToOrderEdit(orderEditId=" + this.f83588iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: rq0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1879eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1879eablkybsjg f83589iobyxmoadg = new C1879eablkybsjg();

        private C1879eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1879eablkybsjg);
        }

        public int hashCode() {
            return -603945732;
        }

        public String toString() {
            return "OnScanClicked";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryItem f83590iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f83591zoijcleaow;

        public gtknphoqwx(StoryItem story, StoryNavLink endPoint) {
            zdlpuopuiu.btonecajqb(story, "story");
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.f83590iobyxmoadg = story;
            this.f83591zoijcleaow = endPoint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f83590iobyxmoadg, gtknphoqwxVar.f83590iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83591zoijcleaow, gtknphoqwxVar.f83591zoijcleaow);
        }

        public int hashCode() {
            return (this.f83590iobyxmoadg.hashCode() * 31) + this.f83591zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f83591zoijcleaow;
        }

        public String toString() {
            return "ShowStory(story=" + this.f83590iobyxmoadg + ", endPoint=" + this.f83591zoijcleaow + ")";
        }

        public final StoryItem zoijcleaow() {
            return this.f83590iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f83592iobyxmoadg;

        public gxszxtbevo(SubCatalogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f83592iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f83592iobyxmoadg, ((gxszxtbevo) obj).f83592iobyxmoadg);
        }

        public int hashCode() {
            return this.f83592iobyxmoadg.hashCode();
        }

        public final SubCatalogArgs iobyxmoadg() {
            return this.f83592iobyxmoadg;
        }

        public String toString() {
            return "OnSearchClicked(args=" + this.f83592iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83593iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 779354198;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83594iobyxmoadg;

        public lqeggnwhkg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83594iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f83594iobyxmoadg, ((lqeggnwhkg) obj).f83594iobyxmoadg);
        }

        public int hashCode() {
            return this.f83594iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83594iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f83594iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f83595iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1388137518;
        }

        public String toString() {
            return "ProcessFetchError";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogBanner f83596iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f83597ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f83598zoijcleaow;

        public ppxfxbqfkf(CatalogBanner banner, AnalyticsPage page, String onScreenIndex) {
            zdlpuopuiu.btonecajqb(banner, "banner");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(onScreenIndex, "onScreenIndex");
            this.f83596iobyxmoadg = banner;
            this.f83598zoijcleaow = page;
            this.f83597ppxfxbqfkf = onScreenIndex;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f83596iobyxmoadg, ppxfxbqfkfVar.f83596iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83598zoijcleaow, ppxfxbqfkfVar.f83598zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83597ppxfxbqfkf, ppxfxbqfkfVar.f83597ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f83596iobyxmoadg.hashCode() * 31) + this.f83598zoijcleaow.hashCode()) * 31) + this.f83597ppxfxbqfkf.hashCode();
        }

        public final CatalogBanner iobyxmoadg() {
            return this.f83596iobyxmoadg;
        }

        public final AnalyticsPage ppxfxbqfkf() {
            return this.f83598zoijcleaow;
        }

        public String toString() {
            return "OnBannerCatalogClicked(banner=" + this.f83596iobyxmoadg + ", page=" + this.f83598zoijcleaow + ", onScreenIndex=" + this.f83597ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f83597ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f83599iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f83600ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f83601wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83602zoijcleaow;

        public wkgbmnqykc(SubCatalogArgs args, String itemId, String str, mz0.ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(args, "args");
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f83599iobyxmoadg = args;
            this.f83602zoijcleaow = itemId;
            this.f83600ppxfxbqfkf = str;
            this.f83601wkgbmnqykc = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f83599iobyxmoadg, wkgbmnqykcVar.f83599iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83602zoijcleaow, wkgbmnqykcVar.f83602zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83600ppxfxbqfkf, wkgbmnqykcVar.f83600ppxfxbqfkf) && this.f83601wkgbmnqykc == wkgbmnqykcVar.f83601wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f83599iobyxmoadg.hashCode() * 31) + this.f83602zoijcleaow.hashCode()) * 31;
            String str = this.f83600ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            mz0.ppxfxbqfkf ppxfxbqfkfVar = this.f83601wkgbmnqykc;
            return iHashCode2 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
        }

        public final SubCatalogArgs iobyxmoadg() {
            return this.f83599iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f83600ppxfxbqfkf;
        }

        public String toString() {
            return "OnCatalogItemClicked(args=" + this.f83599iobyxmoadg + ", itemId=" + this.f83602zoijcleaow + ", itemTitle=" + this.f83600ppxfxbqfkf + ", sortType=" + this.f83601wkgbmnqykc + ")";
        }

        public final mz0.ppxfxbqfkf wkgbmnqykc() {
            return this.f83601wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f83602zoijcleaow;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f83603iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1563217494;
        }

        public String toString() {
            return "NavigateToCatalogScreen";
        }
    }
}
