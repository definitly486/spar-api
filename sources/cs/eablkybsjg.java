package cs;

import es.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final draadjrbmk.ppxfxbqfkf f25564iobyxmoadg;

        public btonecajqb(draadjrbmk.ppxfxbqfkf item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f25564iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f25564iobyxmoadg, ((btonecajqb) obj).f25564iobyxmoadg);
        }

        public int hashCode() {
            return this.f25564iobyxmoadg.hashCode();
        }

        public final draadjrbmk.ppxfxbqfkf iobyxmoadg() {
            return this.f25564iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckDialog(item=" + this.f25564iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f25565iobyxmoadg;

        public dxjokdxxww(String orderEditId) {
            zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
            this.f25565iobyxmoadg = orderEditId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f25565iobyxmoadg, ((dxjokdxxww) obj).f25565iobyxmoadg);
        }

        public int hashCode() {
            return this.f25565iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f25565iobyxmoadg;
        }

        public String toString() {
            return "ReturnToOrderEdit(orderEditId=" + this.f25565iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: cs.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0445eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0445eablkybsjg f25566iobyxmoadg = new C0445eablkybsjg();

        private C0445eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0445eablkybsjg);
        }

        public int hashCode() {
            return 1496118489;
        }

        public String toString() {
            return "OnScanClicked";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryItem f25567iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f25568zoijcleaow;

        public gtknphoqwx(StoryItem story, StoryNavLink endPoint) {
            zdlpuopuiu.btonecajqb(story, "story");
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.f25567iobyxmoadg = story;
            this.f25568zoijcleaow = endPoint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f25567iobyxmoadg, gtknphoqwxVar.f25567iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25568zoijcleaow, gtknphoqwxVar.f25568zoijcleaow);
        }

        public int hashCode() {
            return (this.f25567iobyxmoadg.hashCode() * 31) + this.f25568zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f25568zoijcleaow;
        }

        public String toString() {
            return "ShowStory(story=" + this.f25567iobyxmoadg + ", endPoint=" + this.f25568zoijcleaow + ")";
        }

        public final StoryItem zoijcleaow() {
            return this.f25567iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f25569iobyxmoadg;

        public gxszxtbevo(SubCatalogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f25569iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f25569iobyxmoadg, ((gxszxtbevo) obj).f25569iobyxmoadg);
        }

        public int hashCode() {
            return this.f25569iobyxmoadg.hashCode();
        }

        public final SubCatalogArgs iobyxmoadg() {
            return this.f25569iobyxmoadg;
        }

        public String toString() {
            return "OnSearchClicked(args=" + this.f25569iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f25570iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1273966919;
        }

        public String toString() {
            return "NavigateToCatalogScreen";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f25571iobyxmoadg;

        public lqeggnwhkg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f25571iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f25571iobyxmoadg, ((lqeggnwhkg) obj).f25571iobyxmoadg);
        }

        public int hashCode() {
            return this.f25571iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f25571iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f25571iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f25572iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -2109438581;
        }

        public String toString() {
            return "ProcessFetchError";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogBanner f25573iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f25574ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f25575zoijcleaow;

        public ppxfxbqfkf(CatalogBanner banner, AnalyticsPage page, String onScreenIndex) {
            zdlpuopuiu.btonecajqb(banner, "banner");
            zdlpuopuiu.btonecajqb(page, "page");
            zdlpuopuiu.btonecajqb(onScreenIndex, "onScreenIndex");
            this.f25573iobyxmoadg = banner;
            this.f25575zoijcleaow = page;
            this.f25574ppxfxbqfkf = onScreenIndex;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f25573iobyxmoadg, ppxfxbqfkfVar.f25573iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25575zoijcleaow, ppxfxbqfkfVar.f25575zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f25574ppxfxbqfkf, ppxfxbqfkfVar.f25574ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f25573iobyxmoadg.hashCode() * 31) + this.f25575zoijcleaow.hashCode()) * 31) + this.f25574ppxfxbqfkf.hashCode();
        }

        public final CatalogBanner iobyxmoadg() {
            return this.f25573iobyxmoadg;
        }

        public final AnalyticsPage ppxfxbqfkf() {
            return this.f25575zoijcleaow;
        }

        public String toString() {
            return "OnBannerCatalogClicked(banner=" + this.f25573iobyxmoadg + ", page=" + this.f25575zoijcleaow + ", onScreenIndex=" + this.f25574ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f25574ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubCatalogArgs f25576iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f25577ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final v00.ppxfxbqfkf f25578wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f25579zoijcleaow;

        public wkgbmnqykc(SubCatalogArgs args, String itemId, String str, v00.ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(args, "args");
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f25576iobyxmoadg = args;
            this.f25579zoijcleaow = itemId;
            this.f25577ppxfxbqfkf = str;
            this.f25578wkgbmnqykc = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f25576iobyxmoadg, wkgbmnqykcVar.f25576iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25579zoijcleaow, wkgbmnqykcVar.f25579zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f25577ppxfxbqfkf, wkgbmnqykcVar.f25577ppxfxbqfkf) && this.f25578wkgbmnqykc == wkgbmnqykcVar.f25578wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f25576iobyxmoadg.hashCode() * 31) + this.f25579zoijcleaow.hashCode()) * 31;
            String str = this.f25577ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            v00.ppxfxbqfkf ppxfxbqfkfVar = this.f25578wkgbmnqykc;
            return iHashCode2 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
        }

        public final SubCatalogArgs iobyxmoadg() {
            return this.f25576iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f25577ppxfxbqfkf;
        }

        public String toString() {
            return "OnCatalogItemClicked(args=" + this.f25576iobyxmoadg + ", itemId=" + this.f25579zoijcleaow + ", itemTitle=" + this.f25577ppxfxbqfkf + ", sortType=" + this.f25578wkgbmnqykc + ")";
        }

        public final v00.ppxfxbqfkf wkgbmnqykc() {
            return this.f25578wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f25579zoijcleaow;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f25580iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 2119142191;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }
}
