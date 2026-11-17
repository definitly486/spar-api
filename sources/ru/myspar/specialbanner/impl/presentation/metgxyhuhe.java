package ru.myspar.specialbanner.impl.presentation;

import com.yandex.mapkit.geometry.Point;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class metgxyhuhe {

    public static final class agtfadlqog extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f104091iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f104092zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f104091iobyxmoadg = productFirst;
            this.f104092zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104091iobyxmoadg, agtfadlqogVar.f104091iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104092zoijcleaow, agtfadlqogVar.f104092zoijcleaow);
        }

        public int hashCode() {
            return (this.f104091iobyxmoadg.hashCode() * 31) + this.f104092zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f104091iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f104091iobyxmoadg + ", productSecond=" + this.f104092zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f104092zoijcleaow;
        }
    }

    public static final class btonecajqb extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b62.zoijcleaow f104093iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(b62.zoijcleaow button) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(button, "button");
            this.f104093iobyxmoadg = button;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104093iobyxmoadg, ((btonecajqb) obj).f104093iobyxmoadg);
        }

        public int hashCode() {
            return this.f104093iobyxmoadg.hashCode();
        }

        public final b62.zoijcleaow iobyxmoadg() {
            return this.f104093iobyxmoadg;
        }

        public String toString() {
            return "OnButtonClick(button=" + this.f104093iobyxmoadg + ")";
        }
    }

    public static final class cdpycssgdh extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final z52.draadjrbmk f104094iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cdpycssgdh(z52.draadjrbmk imageExt) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageExt, "imageExt");
            this.f104094iobyxmoadg = imageExt;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cdpycssgdh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104094iobyxmoadg, ((cdpycssgdh) obj).f104094iobyxmoadg);
        }

        public int hashCode() {
            return this.f104094iobyxmoadg.hashCode();
        }

        public final z52.draadjrbmk iobyxmoadg() {
            return this.f104094iobyxmoadg;
        }

        public String toString() {
            return "OnImageExtClicked(imageExt=" + this.f104094iobyxmoadg + ")";
        }
    }

    public static final class cllcsxoeiz extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104095iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cllcsxoeiz(String blockId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(blockId, "blockId");
            this.f104095iobyxmoadg = blockId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cllcsxoeiz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104095iobyxmoadg, ((cllcsxoeiz) obj).f104095iobyxmoadg);
        }

        public int hashCode() {
            return this.f104095iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104095iobyxmoadg;
        }

        public String toString() {
            return "OnShowOnMapClick(blockId=" + this.f104095iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104096iobyxmoadg;

        public cqumvgiudr(String str) {
            super(null);
            this.f104096iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104096iobyxmoadg, ((cqumvgiudr) obj).f104096iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f104096iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104096iobyxmoadg;
        }

        public String toString() {
            return "OnFeedbackClicked(shopAddress=" + this.f104096iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f104097iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -321768390;
        }

        public String toString() {
            return "OnCallClicked";
        }
    }

    public static final class dsvhmnatus extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final r62.iobyxmoadg f104098iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsvhmnatus(r62.iobyxmoadg item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f104098iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dsvhmnatus) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104098iobyxmoadg, ((dsvhmnatus) obj).f104098iobyxmoadg);
        }

        public int hashCode() {
            return this.f104098iobyxmoadg.hashCode();
        }

        public final r62.iobyxmoadg iobyxmoadg() {
            return this.f104098iobyxmoadg;
        }

        public String toString() {
            return "OnSquareCardClicked(item=" + this.f104098iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f104099iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1886545831;
        }

        public String toString() {
            return "OnBonusCardClicked";
        }
    }

    public static final class eablkybsjg extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104100iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f104100iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104100iobyxmoadg, ((eablkybsjg) obj).f104100iobyxmoadg);
        }

        public int hashCode() {
            return this.f104100iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104100iobyxmoadg;
        }

        public String toString() {
            return "OnAttachCheckClicked(itemId=" + this.f104100iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104101iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public esjtqupxsv(String uriString) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f104101iobyxmoadg = uriString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104101iobyxmoadg, ((esjtqupxsv) obj).f104101iobyxmoadg);
        }

        public int hashCode() {
            return this.f104101iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104101iobyxmoadg;
        }

        public String toString() {
            return "OnFileSelected(uriString=" + this.f104101iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f104102iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f104102iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104102iobyxmoadg, ((gtknphoqwx) obj).f104102iobyxmoadg);
        }

        public int hashCode() {
            return this.f104102iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f104102iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProduct(params=" + this.f104102iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f104103iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f104103iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104103iobyxmoadg, ((gxszxtbevo) obj).f104103iobyxmoadg);
        }

        public int hashCode() {
            return this.f104103iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f104103iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f104103iobyxmoadg + ")";
        }
    }

    public static final class hcddaimhww extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104104iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final q62.iobyxmoadg f104105zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hcddaimhww(String itemId, q62.iobyxmoadg question) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(question, "question");
            this.f104104iobyxmoadg = itemId;
            this.f104105zoijcleaow = question;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof hcddaimhww)) {
                return false;
            }
            hcddaimhww hcddaimhwwVar = (hcddaimhww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104104iobyxmoadg, hcddaimhwwVar.f104104iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104105zoijcleaow, hcddaimhwwVar.f104105zoijcleaow);
        }

        public int hashCode() {
            return (this.f104104iobyxmoadg.hashCode() * 31) + this.f104105zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104104iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClick(itemId=" + this.f104104iobyxmoadg + ", question=" + this.f104105zoijcleaow + ")";
        }

        public final q62.iobyxmoadg zoijcleaow() {
            return this.f104105zoijcleaow;
        }
    }

    public static final class hkdspvbjdz extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Point f104106iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hkdspvbjdz(Point point) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(point, "point");
            this.f104106iobyxmoadg = point;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hkdspvbjdz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104106iobyxmoadg, ((hkdspvbjdz) obj).f104106iobyxmoadg);
        }

        public int hashCode() {
            return this.f104106iobyxmoadg.hashCode();
        }

        public final Point iobyxmoadg() {
            return this.f104106iobyxmoadg;
        }

        public String toString() {
            return "OnRouteClicked(point=" + this.f104106iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f40.zoijcleaow f104107iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104108zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(f40.zoijcleaow navLink, String str) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f104107iobyxmoadg = navLink;
            this.f104108zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f104107iobyxmoadg == iobyxmoadgVar.f104107iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104108zoijcleaow, iobyxmoadgVar.f104108zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f104107iobyxmoadg.hashCode() * 31;
            String str = this.f104108zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final f40.zoijcleaow iobyxmoadg() {
            return this.f104107iobyxmoadg;
        }

        public String toString() {
            return "LoyaltyProgramInfoClicked(navLink=" + this.f104107iobyxmoadg + ", reference=" + this.f104108zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104108zoijcleaow;
        }
    }

    public static final class iozdgvuglv extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k62.ppxfxbqfkf f104109iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iozdgvuglv(k62.ppxfxbqfkf shop) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            this.f104109iobyxmoadg = shop;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iozdgvuglv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104109iobyxmoadg, ((iozdgvuglv) obj).f104109iobyxmoadg);
        }

        public int hashCode() {
            return this.f104109iobyxmoadg.hashCode();
        }

        public final k62.ppxfxbqfkf iobyxmoadg() {
            return this.f104109iobyxmoadg;
        }

        public String toString() {
            return "OnPinClick(shop=" + this.f104109iobyxmoadg + ")";
        }
    }

    public static final class istkbnxepw extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final g62.iobyxmoadg f104110iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public istkbnxepw(g62.iobyxmoadg header) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(header, "header");
            this.f104110iobyxmoadg = header;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof istkbnxepw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104110iobyxmoadg, ((istkbnxepw) obj).f104110iobyxmoadg);
        }

        public int hashCode() {
            return this.f104110iobyxmoadg.hashCode();
        }

        public String toString() {
            return "OnHeaderMoreClick(header=" + this.f104110iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f104111iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f104112zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwizpuwonk(ProductUiModel product, AnalyticsLocation.ItemFeed location) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            this.f104111iobyxmoadg = product;
            this.f104112zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iwizpuwonk)) {
                return false;
            }
            iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104111iobyxmoadg, iwizpuwonkVar.f104111iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104112zoijcleaow, iwizpuwonkVar.f104112zoijcleaow);
        }

        public int hashCode() {
            return (this.f104111iobyxmoadg.hashCode() * 31) + this.f104112zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f104112zoijcleaow;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f104111iobyxmoadg + ", location=" + this.f104112zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f104111iobyxmoadg;
        }
    }

    public static final class jpowsppfya extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104113iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jpowsppfya(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f104113iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jpowsppfya) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104113iobyxmoadg, ((jpowsppfya) obj).f104113iobyxmoadg);
        }

        public int hashCode() {
            return this.f104113iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104113iobyxmoadg;
        }

        public String toString() {
            return "OnReceiptDateClearClicked(itemId=" + this.f104113iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f104114iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 1121739293;
        }

        public String toString() {
            return "OnEvropolisTimerFinished";
        }
    }

    public static final class kcexrzcfyt extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o90.wkgbmnqykc f104115iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(o90.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f104115iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104115iobyxmoadg, ((kcexrzcfyt) obj).f104115iobyxmoadg);
        }

        public int hashCode() {
            return this.f104115iobyxmoadg.hashCode();
        }

        public final o90.wkgbmnqykc iobyxmoadg() {
            return this.f104115iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerAnimationClicked(item=" + this.f104115iobyxmoadg + ")";
        }
    }

    public static final class kegysxyocb extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104116iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104117zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kegysxyocb(String collectionId, String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f104116iobyxmoadg = collectionId;
            this.f104117zoijcleaow = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kegysxyocb)) {
                return false;
            }
            kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104116iobyxmoadg, kegysxyocbVar.f104116iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104117zoijcleaow, kegysxyocbVar.f104117zoijcleaow);
        }

        public int hashCode() {
            return (this.f104116iobyxmoadg.hashCode() * 31) + this.f104117zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104116iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionItemBtnClicked(collectionId=" + this.f104116iobyxmoadg + ", itemId=" + this.f104117zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104117zoijcleaow;
        }
    }

    public static final class lereixgezr extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104118iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final RegistrationFormView.zoijcleaow f104119zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lereixgezr(String itemId, RegistrationFormView.zoijcleaow change) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
            this.f104118iobyxmoadg = itemId;
            this.f104119zoijcleaow = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lereixgezr)) {
                return false;
            }
            lereixgezr lereixgezrVar = (lereixgezr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104118iobyxmoadg, lereixgezrVar.f104118iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104119zoijcleaow, lereixgezrVar.f104119zoijcleaow);
        }

        public int hashCode() {
            return (this.f104118iobyxmoadg.hashCode() * 31) + this.f104119zoijcleaow.hashCode();
        }

        public final RegistrationFormView.zoijcleaow iobyxmoadg() {
            return this.f104119zoijcleaow;
        }

        public String toString() {
            return "OnFormChanged(itemId=" + this.f104118iobyxmoadg + ", change=" + this.f104119zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104118iobyxmoadg;
        }
    }

    public static final class lmojexxdyd extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f104120iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f104121ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f104122zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lmojexxdyd(ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed location) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            this.f104120iobyxmoadg = product;
            this.f104122zoijcleaow = productCardEvent;
            this.f104121ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lmojexxdyd)) {
                return false;
            }
            lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104120iobyxmoadg, lmojexxdydVar.f104120iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104122zoijcleaow, lmojexxdydVar.f104122zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104121ppxfxbqfkf, lmojexxdydVar.f104121ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f104120iobyxmoadg.hashCode() * 31) + this.f104122zoijcleaow.hashCode()) * 31) + this.f104121ppxfxbqfkf.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f104121ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f104122zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f104120iobyxmoadg + ", productCardEvent=" + this.f104122zoijcleaow + ", location=" + this.f104121ppxfxbqfkf + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f104120iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f104123iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1127484046;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class nufgyqmvbu extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104124iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final z52.zoijcleaow f104125zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String groupId, z52.zoijcleaow banner) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(groupId, "groupId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f104124iobyxmoadg = groupId;
            this.f104125zoijcleaow = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104124iobyxmoadg, nufgyqmvbuVar.f104124iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104125zoijcleaow, nufgyqmvbuVar.f104125zoijcleaow);
        }

        public int hashCode() {
            return (this.f104124iobyxmoadg.hashCode() * 31) + this.f104125zoijcleaow.hashCode();
        }

        public final z52.zoijcleaow iobyxmoadg() {
            return this.f104125zoijcleaow;
        }

        public String toString() {
            return "OnBannerClicked(groupId=" + this.f104124iobyxmoadg + ", banner=" + this.f104125zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104124iobyxmoadg;
        }
    }

    public static final class ojitshcjhn extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qu.iobyxmoadg f104126iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(qu.iobyxmoadg comboSet) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f104126iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104126iobyxmoadg, ((ojitshcjhn) obj).f104126iobyxmoadg);
        }

        public int hashCode() {
            return this.f104126iobyxmoadg.hashCode();
        }

        public final qu.iobyxmoadg iobyxmoadg() {
            return this.f104126iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f104126iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final e62.zoijcleaow f104127iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(e62.zoijcleaow file) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            this.f104127iobyxmoadg = file;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104127iobyxmoadg, ((oxmwwwfdhm) obj).f104127iobyxmoadg);
        }

        public int hashCode() {
            return this.f104127iobyxmoadg.hashCode();
        }

        public final e62.zoijcleaow iobyxmoadg() {
            return this.f104127iobyxmoadg;
        }

        public String toString() {
            return "OnDocumentClick(file=" + this.f104127iobyxmoadg + ")";
        }
    }

    public static final class pkzmftpjix extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o62.iobyxmoadg f104128iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pkzmftpjix(o62.iobyxmoadg product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f104128iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pkzmftpjix) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104128iobyxmoadg, ((pkzmftpjix) obj).f104128iobyxmoadg);
        }

        public int hashCode() {
            return this.f104128iobyxmoadg.hashCode();
        }

        public final o62.iobyxmoadg iobyxmoadg() {
            return this.f104128iobyxmoadg;
        }

        public String toString() {
            return "OnProductsMoreClick(product=" + this.f104128iobyxmoadg + ")";
        }
    }

    public static final class pmvmpeiblj extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f62.iobyxmoadg f104129iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public pmvmpeiblj(f62.iobyxmoadg form) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(form, "form");
            this.f104129iobyxmoadg = form;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104129iobyxmoadg, ((pmvmpeiblj) obj).f104129iobyxmoadg);
        }

        public int hashCode() {
            return this.f104129iobyxmoadg.hashCode();
        }

        public final f62.iobyxmoadg iobyxmoadg() {
            return this.f104129iobyxmoadg;
        }

        public String toString() {
            return "OnFormSendClicked(form=" + this.f104129iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f104130iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -509679950;
        }

        public String toString() {
            return "OnAdultWarningDialogCanceled";
        }
    }

    public static final class rgvfuqvkyq extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final p62.ppxfxbqfkf f104131iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(p62.ppxfxbqfkf product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f104131iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104131iobyxmoadg, ((rgvfuqvkyq) obj).f104131iobyxmoadg);
        }

        public int hashCode() {
            return this.f104131iobyxmoadg.hashCode();
        }

        public final p62.ppxfxbqfkf iobyxmoadg() {
            return this.f104131iobyxmoadg;
        }

        public String toString() {
            return "OnClickedPromoItem(product=" + this.f104131iobyxmoadg + ")";
        }
    }

    public static final class stevsuqkhv extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104132iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104133zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public stevsuqkhv(String collectionId, String specialPromoBannerId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
            this.f104132iobyxmoadg = collectionId;
            this.f104133zoijcleaow = specialPromoBannerId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof stevsuqkhv)) {
                return false;
            }
            stevsuqkhv stevsuqkhvVar = (stevsuqkhv) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104132iobyxmoadg, stevsuqkhvVar.f104132iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104133zoijcleaow, stevsuqkhvVar.f104133zoijcleaow);
        }

        public int hashCode() {
            return (this.f104132iobyxmoadg.hashCode() * 31) + this.f104133zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104132iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionBtnMoreClicked(collectionId=" + this.f104132iobyxmoadg + ", specialPromoBannerId=" + this.f104133zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104133zoijcleaow;
        }
    }

    public static final class tzroggbefp extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104134iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public tzroggbefp(String collectionId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
            this.f104134iobyxmoadg = collectionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof tzroggbefp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104134iobyxmoadg, ((tzroggbefp) obj).f104134iobyxmoadg);
        }

        public int hashCode() {
            return this.f104134iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104134iobyxmoadg;
        }

        public String toString() {
            return "PromoCollectionItemScrollCompleted(collectionId=" + this.f104134iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104135iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(String itemId) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f104135iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104135iobyxmoadg, ((vdvldrhtss) obj).f104135iobyxmoadg);
        }

        public int hashCode() {
            return this.f104135iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104135iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteCheckClicked(itemId=" + this.f104135iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f104136iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final mo.zoijcleaow f104137zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(ComboSetProduct comboSetProduct, mo.zoijcleaow analyticsData) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f104136iobyxmoadg = comboSetProduct;
            this.f104137zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104136iobyxmoadg, wflxmlrfwpVar.f104136iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104137zoijcleaow, wflxmlrfwpVar.f104137zoijcleaow);
        }

        public int hashCode() {
            return (this.f104136iobyxmoadg.hashCode() * 31) + this.f104137zoijcleaow.hashCode();
        }

        public final mo.zoijcleaow iobyxmoadg() {
            return this.f104137zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f104136iobyxmoadg + ", analyticsData=" + this.f104137zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f104136iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f104138iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 99099750;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed";
        }
    }

    public static final class wwaezpbzkn extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f104139iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f104140zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wwaezpbzkn(ProductUiModel product, AnalyticsLocation.ItemFeed analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f104139iobyxmoadg = product;
            this.f104140zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wwaezpbzkn)) {
                return false;
            }
            wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104139iobyxmoadg, wwaezpbzknVar.f104139iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104140zoijcleaow, wwaezpbzknVar.f104140zoijcleaow);
        }

        public int hashCode() {
            return (this.f104139iobyxmoadg.hashCode() * 31) + this.f104140zoijcleaow.hashCode();
        }

        public final AnalyticsLocation.ItemFeed iobyxmoadg() {
            return this.f104140zoijcleaow;
        }

        public String toString() {
            return "OnProductClick(product=" + this.f104139iobyxmoadg + ", analyticsLocation=" + this.f104140zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f104139iobyxmoadg;
        }
    }

    public static final class wypolnanlu extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final t62.iobyxmoadg f104141iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wypolnanlu(t62.iobyxmoadg video) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(video, "video");
            this.f104141iobyxmoadg = video;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wypolnanlu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104141iobyxmoadg, ((wypolnanlu) obj).f104141iobyxmoadg);
        }

        public int hashCode() {
            return this.f104141iobyxmoadg.hashCode();
        }

        public final t62.iobyxmoadg iobyxmoadg() {
            return this.f104141iobyxmoadg;
        }

        public String toString() {
            return "OnVideoClick(video=" + this.f104141iobyxmoadg + ")";
        }
    }

    public static final class yadqdtsiqt extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yadqdtsiqt f104142iobyxmoadg = new yadqdtsiqt();

        private yadqdtsiqt() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yadqdtsiqt);
        }

        public int hashCode() {
            return -1225390470;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class yggfygwlhe extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o90.wkgbmnqykc f104143iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(o90.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f104143iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104143iobyxmoadg, ((yggfygwlhe) obj).f104143iobyxmoadg);
        }

        public int hashCode() {
            return this.f104143iobyxmoadg.hashCode();
        }

        public final o90.wkgbmnqykc iobyxmoadg() {
            return this.f104143iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerScratchAnimationFinished(item=" + this.f104143iobyxmoadg + ")";
        }
    }

    public static final class ylkuphrtab extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f104144iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f104145ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f104146zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ylkuphrtab(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation.ItemFeed analyticsLocation) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsLocation, "analyticsLocation");
            this.f104144iobyxmoadg = hint;
            this.f104146zoijcleaow = analyticElement;
            this.f104145ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ylkuphrtab)) {
                return false;
            }
            ylkuphrtab ylkuphrtabVar = (ylkuphrtab) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104144iobyxmoadg, ylkuphrtabVar.f104144iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104146zoijcleaow, ylkuphrtabVar.f104146zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104145ppxfxbqfkf, ylkuphrtabVar.f104145ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f104144iobyxmoadg.hashCode() * 31) + this.f104146zoijcleaow.hashCode()) * 31) + this.f104145ppxfxbqfkf.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f104146zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f104144iobyxmoadg;
        }

        public String toString() {
            return "OnProductHintClick(hint=" + this.f104144iobyxmoadg + ", analyticElement=" + this.f104146zoijcleaow + ", analyticsLocation=" + this.f104145ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation.ItemFeed zoijcleaow() {
            return this.f104145ppxfxbqfkf;
        }
    }

    public static final class zdlpuopuiu extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o90.wkgbmnqykc f104147iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(o90.wkgbmnqykc item) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
            this.f104147iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104147iobyxmoadg, ((zdlpuopuiu) obj).f104147iobyxmoadg);
        }

        public int hashCode() {
            return this.f104147iobyxmoadg.hashCode();
        }

        public final o90.wkgbmnqykc iobyxmoadg() {
            return this.f104147iobyxmoadg;
        }

        public String toString() {
            return "OnEvropolisStickerButtonClicked(item=" + this.f104147iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f104148iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ProductUiModel product) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f104148iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104148iobyxmoadg, ((zoijcleaow) obj).f104148iobyxmoadg);
        }

        public int hashCode() {
            return this.f104148iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f104148iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f104148iobyxmoadg + ")";
        }
    }

    public static final class zynmafqrjb extends metgxyhuhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zynmafqrjb f104149iobyxmoadg = new zynmafqrjb();

        private zynmafqrjb() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zynmafqrjb);
        }

        public int hashCode() {
            return 1564110744;
        }

        public String toString() {
            return "OnFormViewTermsClicked";
        }
    }

    public /* synthetic */ metgxyhuhe(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private metgxyhuhe() {
    }
}
