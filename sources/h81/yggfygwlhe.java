package h81;

import java.util.List;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface yggfygwlhe extends b21.ppxfxbqfkf {

    public static final class dxjokdxxww implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39879yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39880zdlpuopuiu;

        public dxjokdxxww(String title, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39880zdlpuopuiu = title;
            this.f39879yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39880zdlpuopuiu, dxjokdxxwwVar.f39880zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39879yggfygwlhe, dxjokdxxwwVar.f39879yggfygwlhe);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39879yggfygwlhe;
        }

        public int hashCode() {
            return (this.f39880zdlpuopuiu.hashCode() * 31) + this.f39879yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39880zdlpuopuiu;
        }

        public String toString() {
            return "Title(title=" + this.f39880zdlpuopuiu + ", itemId=" + this.f39879yggfygwlhe + ")";
        }

        public /* synthetic */ dxjokdxxww(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_title" : str2);
        }
    }

    public static final class gxszxtbevo implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39884yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39885zdlpuopuiu;

        public gxszxtbevo(String qrCode, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39885zdlpuopuiu = qrCode;
            this.f39884yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39885zdlpuopuiu, gxszxtbevoVar.f39885zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39884yggfygwlhe, gxszxtbevoVar.f39884yggfygwlhe);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39884yggfygwlhe;
        }

        public int hashCode() {
            return (this.f39885zdlpuopuiu.hashCode() * 31) + this.f39884yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39885zdlpuopuiu;
        }

        public String toString() {
            return "Qr(qrCode=" + this.f39885zdlpuopuiu + ", itemId=" + this.f39884yggfygwlhe + ")";
        }

        public /* synthetic */ gxszxtbevo(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_qr" : str2);
        }
    }

    public static final class nufgyqmvbu implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39894yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39895zdlpuopuiu;

        public nufgyqmvbu(String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39895zdlpuopuiu = text;
            this.f39894yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39895zdlpuopuiu, nufgyqmvbuVar.f39895zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39894yggfygwlhe, nufgyqmvbuVar.f39894yggfygwlhe);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39894yggfygwlhe;
        }

        public int hashCode() {
            return (this.f39895zdlpuopuiu.hashCode() * 31) + this.f39894yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39895zdlpuopuiu;
        }

        public String toString() {
            return "Terms(text=" + this.f39895zdlpuopuiu + ", itemId=" + this.f39894yggfygwlhe + ")";
        }

        public /* synthetic */ nufgyqmvbu(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_description" : str2);
        }
    }

    public static final class ppxfxbqfkf implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39896yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39897zdlpuopuiu;

        public ppxfxbqfkf(String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39897zdlpuopuiu = text;
            this.f39896yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39897zdlpuopuiu, ppxfxbqfkfVar.f39897zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39896yggfygwlhe, ppxfxbqfkfVar.f39896yggfygwlhe);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39896yggfygwlhe;
        }

        public int hashCode() {
            return (this.f39897zdlpuopuiu.hashCode() * 31) + this.f39896yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39897zdlpuopuiu;
        }

        public String toString() {
            return "Instruction(text=" + this.f39897zdlpuopuiu + ", itemId=" + this.f39896yggfygwlhe + ")";
        }

        public /* synthetic */ ppxfxbqfkf(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_instruction" : str2);
        }
    }

    public static final class eablkybsjg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f39881jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39882yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39883zdlpuopuiu;

        public eablkybsjg(String image, String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39883zdlpuopuiu = image;
            this.f39882yggfygwlhe = text;
            this.f39881jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39883zdlpuopuiu, eablkybsjgVar.f39883zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39882yggfygwlhe, eablkybsjgVar.f39882yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39881jyumaefscl, eablkybsjgVar.f39881jyumaefscl);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39881jyumaefscl;
        }

        public int hashCode() {
            return (((this.f39883zdlpuopuiu.hashCode() * 31) + this.f39882yggfygwlhe.hashCode()) * 31) + this.f39881jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39883zdlpuopuiu;
        }

        public String toString() {
            return "Puzzle(image=" + this.f39883zdlpuopuiu + ", text=" + this.f39882yggfygwlhe + ", itemId=" + this.f39881jyumaefscl + ")";
        }

        public /* synthetic */ eablkybsjg(String str, String str2, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? "evropolis_dialog_qr" : str3);
        }
    }

    public static final class iobyxmoadg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f39886jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f39887yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39888zdlpuopuiu;

        public iobyxmoadg(String image, String description, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39888zdlpuopuiu = image;
            this.f39887yggfygwlhe = description;
            this.f39886jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39888zdlpuopuiu, iobyxmoadgVar.f39888zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39887yggfygwlhe, iobyxmoadgVar.f39887yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39886jyumaefscl, iobyxmoadgVar.f39886jyumaefscl);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39886jyumaefscl;
        }

        public int hashCode() {
            return (((this.f39888zdlpuopuiu.hashCode() * 31) + this.f39887yggfygwlhe.hashCode()) * 31) + this.f39886jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39887yggfygwlhe;
        }

        public String toString() {
            return "Bonus(image=" + this.f39888zdlpuopuiu + ", description=" + this.f39887yggfygwlhe + ", itemId=" + this.f39886jyumaefscl + ")";
        }

        public final String wkgbmnqykc() {
            return this.f39888zdlpuopuiu;
        }

        public /* synthetic */ iobyxmoadg(String str, String str2, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? "evropolis_dialog_bonus" : str3);
        }
    }

    public static final class lqeggnwhkg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f39889jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ColorsUiModel f39890yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f39891zdlpuopuiu;

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f39892iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f39893zoijcleaow;

            public iobyxmoadg(String id2, String title) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
                this.f39892iobyxmoadg = id2;
                this.f39893zoijcleaow = title;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof iobyxmoadg)) {
                    return false;
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39892iobyxmoadg, iobyxmoadgVar.f39892iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39893zoijcleaow, iobyxmoadgVar.f39893zoijcleaow);
            }

            public int hashCode() {
                return (this.f39892iobyxmoadg.hashCode() * 31) + this.f39893zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f39892iobyxmoadg;
            }

            public String toString() {
                return "Tab(id=" + this.f39892iobyxmoadg + ", title=" + this.f39893zoijcleaow + ")";
            }

            public final String zoijcleaow() {
                return this.f39893zoijcleaow;
            }
        }

        public lqeggnwhkg(List tabItems, ColorsUiModel colorsUiModel, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tabItems, "tabItems");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39891zdlpuopuiu = tabItems;
            this.f39890yggfygwlhe = colorsUiModel;
            this.f39889jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39891zdlpuopuiu, lqeggnwhkgVar.f39891zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39890yggfygwlhe, lqeggnwhkgVar.f39890yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39889jyumaefscl, lqeggnwhkgVar.f39889jyumaefscl);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39889jyumaefscl;
        }

        public int hashCode() {
            return (((this.f39891zdlpuopuiu.hashCode() * 31) + this.f39890yggfygwlhe.hashCode()) * 31) + this.f39889jyumaefscl.hashCode();
        }

        public final ColorsUiModel iobyxmoadg() {
            return this.f39890yggfygwlhe;
        }

        public String toString() {
            return "Tabs(tabItems=" + this.f39891zdlpuopuiu + ", colorsUiModel=" + this.f39890yggfygwlhe + ", itemId=" + this.f39889jyumaefscl + ")";
        }

        public final List wkgbmnqykc() {
            return this.f39891zdlpuopuiu;
        }

        public /* synthetic */ lqeggnwhkg(List list, ColorsUiModel colorsUiModel, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(list, colorsUiModel, (i13 & 4) != 0 ? "evropolis_dialog_tabs" : str);
        }
    }

    public static final class zoijcleaow implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f39902jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ColorsUiModel f39903yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f39904zdlpuopuiu;

        public zoijcleaow(String code, ColorsUiModel colorsUiModel, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(code, "code");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39904zdlpuopuiu = code;
            this.f39903yggfygwlhe = colorsUiModel;
            this.f39902jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39904zdlpuopuiu, zoijcleaowVar.f39904zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39903yggfygwlhe, zoijcleaowVar.f39903yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39902jyumaefscl, zoijcleaowVar.f39902jyumaefscl);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39902jyumaefscl;
        }

        public int hashCode() {
            return (((this.f39904zdlpuopuiu.hashCode() * 31) + this.f39903yggfygwlhe.hashCode()) * 31) + this.f39902jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39904zdlpuopuiu;
        }

        public String toString() {
            return "Coupon(code=" + this.f39904zdlpuopuiu + ", colorsUiModel=" + this.f39903yggfygwlhe + ", itemId=" + this.f39902jyumaefscl + ")";
        }

        public final ColorsUiModel wkgbmnqykc() {
            return this.f39903yggfygwlhe;
        }

        public /* synthetic */ zoijcleaow(String str, ColorsUiModel colorsUiModel, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, colorsUiModel, (i13 & 4) != 0 ? "evropolis_dialog_coupon" : str2);
        }
    }

    public static final class wkgbmnqykc implements yggfygwlhe {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final String f39898iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f39899jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f39900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ProductUiModel f39901zdlpuopuiu;

        public wkgbmnqykc(ProductUiModel product, boolean z13, boolean z14, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f39901zdlpuopuiu = product;
            this.f39900yggfygwlhe = z13;
            this.f39899jyumaefscl = z14;
            this.f39898iwizpuwonk = itemId;
        }

        public final boolean eablkybsjg() {
            return this.f39900yggfygwlhe;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39901zdlpuopuiu, wkgbmnqykcVar.f39901zdlpuopuiu) && this.f39900yggfygwlhe == wkgbmnqykcVar.f39900yggfygwlhe && this.f39899jyumaefscl == wkgbmnqykcVar.f39899jyumaefscl && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f39898iwizpuwonk, wkgbmnqykcVar.f39898iwizpuwonk);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f39898iwizpuwonk;
        }

        public int hashCode() {
            return (((((this.f39901zdlpuopuiu.hashCode() * 31) + Boolean.hashCode(this.f39900yggfygwlhe)) * 31) + Boolean.hashCode(this.f39899jyumaefscl)) * 31) + this.f39898iwizpuwonk.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f39901zdlpuopuiu;
        }

        public String toString() {
            return "Product(product=" + this.f39901zdlpuopuiu + ", isLoading=" + this.f39900yggfygwlhe + ", isButtonClickable=" + this.f39899jyumaefscl + ", itemId=" + this.f39898iwizpuwonk + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f39899jyumaefscl;
        }

        public /* synthetic */ wkgbmnqykc(ProductUiModel productUiModel, boolean z13, boolean z14, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(productUiModel, z13, z14, (i13 & 8) != 0 ? "evropolis_dialog_product" : str);
        }
    }
}
