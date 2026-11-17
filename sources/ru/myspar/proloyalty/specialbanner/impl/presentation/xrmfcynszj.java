package ru.myspar.proloyalty.specialbanner.impl.presentation;

import com.yandex.mapkit.geometry.Point;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xrmfcynszj {

    public static final class agtfadlqog extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kt0.iobyxmoadg f101555iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(kt0.iobyxmoadg comboSet) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f101555iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101555iobyxmoadg, ((agtfadlqog) obj).f101555iobyxmoadg);
        }

        public int hashCode() {
            return this.f101555iobyxmoadg.hashCode();
        }

        public final kt0.iobyxmoadg iobyxmoadg() {
            return this.f101555iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f101555iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f101556iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f101556iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101556iobyxmoadg, ((btonecajqb) obj).f101556iobyxmoadg);
        }

        public int hashCode() {
            return this.f101556iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f101556iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProduct(params=" + this.f101556iobyxmoadg + ")";
        }
    }

    public static final class cdpycssgdh extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cdpycssgdh f101557iobyxmoadg = new cdpycssgdh();

        private cdpycssgdh() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cdpycssgdh);
        }

        public int hashCode() {
            return 550002551;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class cllcsxoeiz extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ks1.iobyxmoadg f101558iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cllcsxoeiz(ks1.iobyxmoadg item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f101558iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cllcsxoeiz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101558iobyxmoadg, ((cllcsxoeiz) obj).f101558iobyxmoadg);
        }

        public int hashCode() {
            return this.f101558iobyxmoadg.hashCode();
        }

        public final ks1.iobyxmoadg iobyxmoadg() {
            return this.f101558iobyxmoadg;
        }

        public String toString() {
            return "OnSquareCardClicked(item=" + this.f101558iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101559iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cqumvgiudr(String uriString) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f101559iobyxmoadg = uriString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101559iobyxmoadg, ((cqumvgiudr) obj).f101559iobyxmoadg);
        }

        public int hashCode() {
            return this.f101559iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101559iobyxmoadg;
        }

        public String toString() {
            return "OnFileSelected(uriString=" + this.f101559iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f101560iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wm0.zoijcleaow f101561zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(ComboSetProduct comboSetProduct, wm0.zoijcleaow analyticsData) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f101560iobyxmoadg = comboSetProduct;
            this.f101561zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101560iobyxmoadg, draadjrbmkVar.f101560iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101561zoijcleaow, draadjrbmkVar.f101561zoijcleaow);
        }

        public int hashCode() {
            return (this.f101560iobyxmoadg.hashCode() * 31) + this.f101561zoijcleaow.hashCode();
        }

        public final wm0.zoijcleaow iobyxmoadg() {
            return this.f101561zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f101560iobyxmoadg + ", analyticsData=" + this.f101561zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f101560iobyxmoadg;
        }
    }

    public static final class dsvhmnatus extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ms1.iobyxmoadg f101562iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsvhmnatus(ms1.iobyxmoadg video) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(video, "video");
            this.f101562iobyxmoadg = video;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dsvhmnatus) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101562iobyxmoadg, ((dsvhmnatus) obj).f101562iobyxmoadg);
        }

        public int hashCode() {
            return this.f101562iobyxmoadg.hashCode();
        }

        public final ms1.iobyxmoadg iobyxmoadg() {
            return this.f101562iobyxmoadg;
        }

        public String toString() {
            return "OnVideoClick(video=" + this.f101562iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ur1.zoijcleaow f101563iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(ur1.zoijcleaow button) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(button, "button");
            this.f101563iobyxmoadg = button;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101563iobyxmoadg, ((dxjokdxxww) obj).f101563iobyxmoadg);
        }

        public int hashCode() {
            return this.f101563iobyxmoadg.hashCode();
        }

        public final ur1.zoijcleaow iobyxmoadg() {
            return this.f101563iobyxmoadg;
        }

        public String toString() {
            return "OnButtonClick(button=" + this.f101563iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101564iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f101564iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101564iobyxmoadg, ((eablkybsjg) obj).f101564iobyxmoadg);
        }

        public int hashCode() {
            return this.f101564iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101564iobyxmoadg;
        }

        public String toString() {
            return "OnAttachCheckClicked(itemId=" + this.f101564iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101565iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final RegistrationFormView.zoijcleaow f101566zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public esjtqupxsv(String itemId, RegistrationFormView.zoijcleaow change) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
            this.f101565iobyxmoadg = itemId;
            this.f101566zoijcleaow = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof esjtqupxsv)) {
                return false;
            }
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101565iobyxmoadg, esjtqupxsvVar.f101565iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101566zoijcleaow, esjtqupxsvVar.f101566zoijcleaow);
        }

        public int hashCode() {
            return (this.f101565iobyxmoadg.hashCode() * 31) + this.f101566zoijcleaow.hashCode();
        }

        public final RegistrationFormView.zoijcleaow iobyxmoadg() {
            return this.f101566zoijcleaow;
        }

        public String toString() {
            return "OnFormChanged(itemId=" + this.f101565iobyxmoadg + ", change=" + this.f101566zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101565iobyxmoadg;
        }
    }

    public static final class gtknphoqwx extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f101567iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -710521097;
        }

        public String toString() {
            return "OnCallClicked";
        }
    }

    public static final class gxszxtbevo extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f101568iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -126772369;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class hcddaimhww extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101569iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hcddaimhww(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f101569iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hcddaimhww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101569iobyxmoadg, ((hcddaimhww) obj).f101569iobyxmoadg);
        }

        public int hashCode() {
            return this.f101569iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101569iobyxmoadg;
        }

        public String toString() {
            return "OnReceiptDateClearClicked(itemId=" + this.f101569iobyxmoadg + ")";
        }
    }

    public static final class hkdspvbjdz extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101570iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hkdspvbjdz(String blockId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(blockId, "blockId");
            this.f101570iobyxmoadg = blockId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hkdspvbjdz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101570iobyxmoadg, ((hkdspvbjdz) obj).f101570iobyxmoadg);
        }

        public int hashCode() {
            return this.f101570iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101570iobyxmoadg;
        }

        public String toString() {
            return "OnShowOnMapClick(blockId=" + this.f101570iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k21.ojitshcjhn f101571iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101572zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(k21.ojitshcjhn navLink, String str) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f101571iobyxmoadg = navLink;
            this.f101572zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f101571iobyxmoadg == iobyxmoadgVar.f101571iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101572zoijcleaow, iobyxmoadgVar.f101572zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f101571iobyxmoadg.hashCode() * 31;
            String str = this.f101572zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f101571iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyProgramInfoClicked(navLink=" + this.f101571iobyxmoadg + ", reference=" + this.f101572zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101572zoijcleaow;
        }
    }

    public static final class iozdgvuglv extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f101573iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f101574ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f101575zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iozdgvuglv(ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed location) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            this.f101573iobyxmoadg = product;
            this.f101575zoijcleaow = productCardEvent;
            this.f101574ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iozdgvuglv)) {
                return false;
            }
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101573iobyxmoadg, iozdgvuglvVar.f101573iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101575zoijcleaow, iozdgvuglvVar.f101575zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101574ppxfxbqfkf, iozdgvuglvVar.f101574ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f101573iobyxmoadg.hashCode() * 31) + this.f101575zoijcleaow.hashCode()) * 31) + this.f101574ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f101574ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f101575zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f101573iobyxmoadg + ", productCardEvent=" + this.f101575zoijcleaow + ", location=" + this.f101574ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f101573iobyxmoadg;
        }
    }

    public static final class istkbnxepw extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sr1.draadjrbmk f101576iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public istkbnxepw(sr1.draadjrbmk imageExt) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageExt, "imageExt");
            this.f101576iobyxmoadg = imageExt;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101576iobyxmoadg, ((istkbnxepw) obj).f101576iobyxmoadg);
        }

        public int hashCode() {
            return this.f101576iobyxmoadg.hashCode();
        }

        public final sr1.draadjrbmk iobyxmoadg() {
            return this.f101576iobyxmoadg;
        }

        public String toString() {
            return "OnImageExtClicked(imageExt=" + this.f101576iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101577iobyxmoadg;

        public iwizpuwonk(String str) {
            super(null);
            this.f101577iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101577iobyxmoadg, ((iwizpuwonk) obj).f101577iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f101577iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101577iobyxmoadg;
        }

        public String toString() {
            return "OnFeedbackClicked(shopAddress=" + this.f101577iobyxmoadg + ")";
        }
    }

    public static final class jpowsppfya extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f101578iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jpowsppfya(Point point) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(point, "point");
            this.f101578iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jpowsppfya) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101578iobyxmoadg, ((jpowsppfya) obj).f101578iobyxmoadg);
        }

        public int hashCode() {
            return this.f101578iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f101578iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(point=" + this.f101578iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f101579iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f101580zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(ProductUiModel product, AnalyticsLocation.ItemFeed location) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            this.f101579iobyxmoadg = product;
            this.f101580zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jyumaefscl)) {
                return false;
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101579iobyxmoadg, jyumaefsclVar.f101579iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101580zoijcleaow, jyumaefsclVar.f101580zoijcleaow);
        }

        public int hashCode() {
            return (this.f101579iobyxmoadg.hashCode() * 31) + this.f101580zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f101580zoijcleaow;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f101579iobyxmoadg + ", location=" + this.f101580zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f101579iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final s71.wkgbmnqykc f101581iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(s71.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f101581iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101581iobyxmoadg, ((kcexrzcfyt) obj).f101581iobyxmoadg);
        }

        public int hashCode() {
            return this.f101581iobyxmoadg.hashCode();
        }

        public final s71.wkgbmnqykc iobyxmoadg() {
            return this.f101581iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerButtonClicked(item=" + this.f101581iobyxmoadg + ")";
        }
    }

    public static final class kegysxyocb extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101582iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kegysxyocb(String collectionId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            this.f101582iobyxmoadg = collectionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kegysxyocb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101582iobyxmoadg, ((kegysxyocb) obj).f101582iobyxmoadg);
        }

        public int hashCode() {
            return this.f101582iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101582iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionItemScrollCompleted(collectionId=" + this.f101582iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yr1.iobyxmoadg f101583iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lereixgezr(yr1.iobyxmoadg form) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
            this.f101583iobyxmoadg = form;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101583iobyxmoadg, ((lereixgezr) obj).f101583iobyxmoadg);
        }

        public int hashCode() {
            return this.f101583iobyxmoadg.hashCode();
        }

        public final yr1.iobyxmoadg iobyxmoadg() {
            return this.f101583iobyxmoadg;
        }

        public String toString() {
            return "OnFormSendClicked(form=" + this.f101583iobyxmoadg + ")";
        }
    }

    public static final class lmojexxdyd extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f101584iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f101585zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lmojexxdyd(ProductUiModel product, AnalyticsLocation.ItemFeed analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f101584iobyxmoadg = product;
            this.f101585zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lmojexxdyd)) {
                return false;
            }
            lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101584iobyxmoadg, lmojexxdydVar.f101584iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101585zoijcleaow, lmojexxdydVar.f101585zoijcleaow);
        }

        public int hashCode() {
            return (this.f101584iobyxmoadg.hashCode() * 31) + this.f101585zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f101585zoijcleaow;
        }

        public String toString() {
            return "OnProductClick(product=" + this.f101584iobyxmoadg + ", analyticsLocation=" + this.f101585zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f101584iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101586iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final sr1.zoijcleaow f101587zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String groupId, sr1.zoijcleaow banner) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(groupId, "groupId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f101586iobyxmoadg = groupId;
            this.f101587zoijcleaow = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101586iobyxmoadg, lqeggnwhkgVar.f101586iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101587zoijcleaow, lqeggnwhkgVar.f101587zoijcleaow);
        }

        public int hashCode() {
            return (this.f101586iobyxmoadg.hashCode() * 31) + this.f101587zoijcleaow.hashCode();
        }

        public final sr1.zoijcleaow iobyxmoadg() {
            return this.f101587zoijcleaow;
        }

        public String toString() {
            return "OnBannerClicked(groupId=" + this.f101586iobyxmoadg + ", banner=" + this.f101587zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101586iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f101588iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1935508726;
        }

        public String toString() {
            return "OnBonusCardClicked";
        }
    }

    public static final class ojitshcjhn extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final is1.ppxfxbqfkf f101589iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(is1.ppxfxbqfkf product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f101589iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101589iobyxmoadg, ((ojitshcjhn) obj).f101589iobyxmoadg);
        }

        public int hashCode() {
            return this.f101589iobyxmoadg.hashCode();
        }

        public final is1.ppxfxbqfkf iobyxmoadg() {
            return this.f101589iobyxmoadg;
        }

        public String toString() {
            return "OnClickedPromoItem(product=" + this.f101589iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final s71.wkgbmnqykc f101590iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(s71.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f101590iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101590iobyxmoadg, ((oxmwwwfdhm) obj).f101590iobyxmoadg);
        }

        public int hashCode() {
            return this.f101590iobyxmoadg.hashCode();
        }

        public final s71.wkgbmnqykc iobyxmoadg() {
            return this.f101590iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerAnimationClicked(item=" + this.f101590iobyxmoadg + ")";
        }
    }

    public static final class pkzmftpjix extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101591iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final js1.iobyxmoadg f101592zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pkzmftpjix(String itemId, js1.iobyxmoadg question) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(question, "question");
            this.f101591iobyxmoadg = itemId;
            this.f101592zoijcleaow = question;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof pkzmftpjix)) {
                return false;
            }
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101591iobyxmoadg, pkzmftpjixVar.f101591iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101592zoijcleaow, pkzmftpjixVar.f101592zoijcleaow);
        }

        public int hashCode() {
            return (this.f101591iobyxmoadg.hashCode() * 31) + this.f101592zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101591iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClick(itemId=" + this.f101591iobyxmoadg + ", question=" + this.f101592zoijcleaow + ")";
        }

        public final js1.iobyxmoadg zoijcleaow() {
            return this.f101592zoijcleaow;
        }
    }

    public static final class pmvmpeiblj extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final pmvmpeiblj f101593iobyxmoadg = new pmvmpeiblj();

        private pmvmpeiblj() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof pmvmpeiblj);
        }

        public int hashCode() {
            return -224650885;
        }

        public String toString() {
            return "OnFormViewTermsClicked";
        }
    }

    public static final class ppxfxbqfkf extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f101594iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 260332117;
        }

        public String toString() {
            return "OnAdultWarningDialogCanceled";
        }
    }

    public static final class rgvfuqvkyq extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101595iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f101595iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101595iobyxmoadg, ((rgvfuqvkyq) obj).f101595iobyxmoadg);
        }

        public int hashCode() {
            return this.f101595iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101595iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteCheckClicked(itemId=" + this.f101595iobyxmoadg + ")";
        }
    }

    public static final class stevsuqkhv extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101596iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101597zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public stevsuqkhv(String collectionId, String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f101596iobyxmoadg = collectionId;
            this.f101597zoijcleaow = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof stevsuqkhv)) {
                return false;
            }
            stevsuqkhv stevsuqkhvVar = (stevsuqkhv) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101596iobyxmoadg, stevsuqkhvVar.f101596iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101597zoijcleaow, stevsuqkhvVar.f101597zoijcleaow);
        }

        public int hashCode() {
            return (this.f101596iobyxmoadg.hashCode() * 31) + this.f101597zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101596iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionItemBtnClicked(collectionId=" + this.f101596iobyxmoadg + ", itemId=" + this.f101597zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101597zoijcleaow;
        }
    }

    public static final class vdvldrhtss extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xr1.zoijcleaow f101598iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(xr1.zoijcleaow file) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            this.f101598iobyxmoadg = file;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101598iobyxmoadg, ((vdvldrhtss) obj).f101598iobyxmoadg);
        }

        public int hashCode() {
            return this.f101598iobyxmoadg.hashCode();
        }

        public final xr1.zoijcleaow iobyxmoadg() {
            return this.f101598iobyxmoadg;
        }

        public String toString() {
            return "OnDocumentClick(file=" + this.f101598iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f101599iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f101600zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f101599iobyxmoadg = productFirst;
            this.f101600zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101599iobyxmoadg, wflxmlrfwpVar.f101599iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101600zoijcleaow, wflxmlrfwpVar.f101600zoijcleaow);
        }

        public int hashCode() {
            return (this.f101599iobyxmoadg.hashCode() * 31) + this.f101600zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f101599iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f101599iobyxmoadg + ", productSecond=" + this.f101600zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f101600zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f101601iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1800329949;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed";
        }
    }

    public static final class wwaezpbzkn extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f101602iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f101603ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f101604zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wwaezpbzkn(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation.ItemFeed analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f101602iobyxmoadg = hint;
            this.f101604zoijcleaow = analyticElement;
            this.f101603ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wwaezpbzkn)) {
                return false;
            }
            wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101602iobyxmoadg, wwaezpbzknVar.f101602iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101604zoijcleaow, wwaezpbzknVar.f101604zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101603ppxfxbqfkf, wwaezpbzknVar.f101603ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f101602iobyxmoadg.hashCode() * 31) + this.f101604zoijcleaow.hashCode()) * 31) + this.f101603ppxfxbqfkf.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f101604zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f101602iobyxmoadg;
        }

        public String toString() {
            return "OnProductHintClick(hint=" + this.f101602iobyxmoadg + ", analyticElement=" + this.f101604zoijcleaow + ", analyticsLocation=" + this.f101603ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation.ItemFeed zoijcleaow() {
            return this.f101603ppxfxbqfkf;
        }
    }

    public static final class wypolnanlu extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101605iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101606zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wypolnanlu(String collectionId, String specialPromoBannerId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
            this.f101605iobyxmoadg = collectionId;
            this.f101606zoijcleaow = specialPromoBannerId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wypolnanlu)) {
                return false;
            }
            wypolnanlu wypolnanluVar = (wypolnanlu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101605iobyxmoadg, wypolnanluVar.f101605iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101606zoijcleaow, wypolnanluVar.f101606zoijcleaow);
        }

        public int hashCode() {
            return (this.f101605iobyxmoadg.hashCode() * 31) + this.f101606zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101605iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionBtnMoreClicked(collectionId=" + this.f101605iobyxmoadg + ", specialPromoBannerId=" + this.f101606zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101606zoijcleaow;
        }
    }

    public static final class yadqdtsiqt extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ds1.ppxfxbqfkf f101607iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yadqdtsiqt(ds1.ppxfxbqfkf shop) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            this.f101607iobyxmoadg = shop;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yadqdtsiqt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101607iobyxmoadg, ((yadqdtsiqt) obj).f101607iobyxmoadg);
        }

        public int hashCode() {
            return this.f101607iobyxmoadg.hashCode();
        }

        public final ds1.ppxfxbqfkf iobyxmoadg() {
            return this.f101607iobyxmoadg;
        }

        public String toString() {
            return "OnPinClick(shop=" + this.f101607iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f101608iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 108732224;
        }

        public String toString() {
            return "OnEvropolisTimerFinished";
        }
    }

    public static final class ylkuphrtab extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hs1.iobyxmoadg f101609iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ylkuphrtab(hs1.iobyxmoadg product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f101609iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ylkuphrtab) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101609iobyxmoadg, ((ylkuphrtab) obj).f101609iobyxmoadg);
        }

        public int hashCode() {
            return this.f101609iobyxmoadg.hashCode();
        }

        public final hs1.iobyxmoadg iobyxmoadg() {
            return this.f101609iobyxmoadg;
        }

        public String toString() {
            return "OnProductsMoreClick(product=" + this.f101609iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final s71.wkgbmnqykc f101610iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(s71.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f101610iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101610iobyxmoadg, ((zdlpuopuiu) obj).f101610iobyxmoadg);
        }

        public int hashCode() {
            return this.f101610iobyxmoadg.hashCode();
        }

        public final s71.wkgbmnqykc iobyxmoadg() {
            return this.f101610iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerScratchAnimationFinished(item=" + this.f101610iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f101611iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f101611iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101611iobyxmoadg, ((zoijcleaow) obj).f101611iobyxmoadg);
        }

        public int hashCode() {
            return this.f101611iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f101611iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f101611iobyxmoadg + ")";
        }
    }

    public static final class zynmafqrjb extends xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zr1.iobyxmoadg f101612iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zynmafqrjb(zr1.iobyxmoadg header) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(header, "header");
            this.f101612iobyxmoadg = header;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101612iobyxmoadg, ((zynmafqrjb) obj).f101612iobyxmoadg);
        }

        public int hashCode() {
            return this.f101612iobyxmoadg.hashCode();
        }

        public String toString() {
            return "OnHeaderMoreClick(header=" + this.f101612iobyxmoadg + ")";
        }
    }

    public /* synthetic */ xrmfcynszj(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private xrmfcynszj() {
    }
}
