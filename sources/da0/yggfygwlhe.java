package da0;

import java.util.List;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface yggfygwlhe extends w30.ppxfxbqfkf {

    public static final class dxjokdxxww implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27291yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27292zdlpuopuiu;

        public dxjokdxxww(String title, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27292zdlpuopuiu = title;
            this.f27291yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27292zdlpuopuiu, dxjokdxxwwVar.f27292zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27291yggfygwlhe, dxjokdxxwwVar.f27291yggfygwlhe);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27291yggfygwlhe;
        }

        public int hashCode() {
            return (this.f27292zdlpuopuiu.hashCode() * 31) + this.f27291yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27292zdlpuopuiu;
        }

        public String toString() {
            return "Title(title=" + this.f27292zdlpuopuiu + ", itemId=" + this.f27291yggfygwlhe + ")";
        }

        public /* synthetic */ dxjokdxxww(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_title" : str2);
        }
    }

    public static final class gxszxtbevo implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27296yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27297zdlpuopuiu;

        public gxszxtbevo(String qrCode, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27297zdlpuopuiu = qrCode;
            this.f27296yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27297zdlpuopuiu, gxszxtbevoVar.f27297zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27296yggfygwlhe, gxszxtbevoVar.f27296yggfygwlhe);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27296yggfygwlhe;
        }

        public int hashCode() {
            return (this.f27297zdlpuopuiu.hashCode() * 31) + this.f27296yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27297zdlpuopuiu;
        }

        public String toString() {
            return "Qr(qrCode=" + this.f27297zdlpuopuiu + ", itemId=" + this.f27296yggfygwlhe + ")";
        }

        public /* synthetic */ gxszxtbevo(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_qr" : str2);
        }
    }

    public static final class nufgyqmvbu implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27306yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27307zdlpuopuiu;

        public nufgyqmvbu(String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27307zdlpuopuiu = text;
            this.f27306yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27307zdlpuopuiu, nufgyqmvbuVar.f27307zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27306yggfygwlhe, nufgyqmvbuVar.f27306yggfygwlhe);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27306yggfygwlhe;
        }

        public int hashCode() {
            return (this.f27307zdlpuopuiu.hashCode() * 31) + this.f27306yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27307zdlpuopuiu;
        }

        public String toString() {
            return "Terms(text=" + this.f27307zdlpuopuiu + ", itemId=" + this.f27306yggfygwlhe + ")";
        }

        public /* synthetic */ nufgyqmvbu(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_description" : str2);
        }
    }

    public static final class ppxfxbqfkf implements yggfygwlhe {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27308yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27309zdlpuopuiu;

        public ppxfxbqfkf(String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27309zdlpuopuiu = text;
            this.f27308yggfygwlhe = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27309zdlpuopuiu, ppxfxbqfkfVar.f27309zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27308yggfygwlhe, ppxfxbqfkfVar.f27308yggfygwlhe);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27308yggfygwlhe;
        }

        public int hashCode() {
            return (this.f27309zdlpuopuiu.hashCode() * 31) + this.f27308yggfygwlhe.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27309zdlpuopuiu;
        }

        public String toString() {
            return "Instruction(text=" + this.f27309zdlpuopuiu + ", itemId=" + this.f27308yggfygwlhe + ")";
        }

        public /* synthetic */ ppxfxbqfkf(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? "evropolis_dialog_instruction" : str2);
        }
    }

    public static final class eablkybsjg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f27293jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27294yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27295zdlpuopuiu;

        public eablkybsjg(String image, String text, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27295zdlpuopuiu = image;
            this.f27294yggfygwlhe = text;
            this.f27293jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27295zdlpuopuiu, eablkybsjgVar.f27295zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27294yggfygwlhe, eablkybsjgVar.f27294yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27293jyumaefscl, eablkybsjgVar.f27293jyumaefscl);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27293jyumaefscl;
        }

        public int hashCode() {
            return (((this.f27295zdlpuopuiu.hashCode() * 31) + this.f27294yggfygwlhe.hashCode()) * 31) + this.f27293jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27295zdlpuopuiu;
        }

        public String toString() {
            return "Puzzle(image=" + this.f27295zdlpuopuiu + ", text=" + this.f27294yggfygwlhe + ", itemId=" + this.f27293jyumaefscl + ")";
        }

        public /* synthetic */ eablkybsjg(String str, String str2, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? "evropolis_dialog_qr" : str3);
        }
    }

    public static final class iobyxmoadg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f27298jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f27299yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27300zdlpuopuiu;

        public iobyxmoadg(String image, String description, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27300zdlpuopuiu = image;
            this.f27299yggfygwlhe = description;
            this.f27298jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27300zdlpuopuiu, iobyxmoadgVar.f27300zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27299yggfygwlhe, iobyxmoadgVar.f27299yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27298jyumaefscl, iobyxmoadgVar.f27298jyumaefscl);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27298jyumaefscl;
        }

        public int hashCode() {
            return (((this.f27300zdlpuopuiu.hashCode() * 31) + this.f27299yggfygwlhe.hashCode()) * 31) + this.f27298jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27299yggfygwlhe;
        }

        public String toString() {
            return "Bonus(image=" + this.f27300zdlpuopuiu + ", description=" + this.f27299yggfygwlhe + ", itemId=" + this.f27298jyumaefscl + ")";
        }

        public final String wkgbmnqykc() {
            return this.f27300zdlpuopuiu;
        }

        public /* synthetic */ iobyxmoadg(String str, String str2, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? "evropolis_dialog_bonus" : str3);
        }
    }

    public static final class lqeggnwhkg implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f27301jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ColorsUiModel f27302yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f27303zdlpuopuiu;

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f27304iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f27305zoijcleaow;

            public iobyxmoadg(String id2, String title) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
                this.f27304iobyxmoadg = id2;
                this.f27305zoijcleaow = title;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof iobyxmoadg)) {
                    return false;
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27304iobyxmoadg, iobyxmoadgVar.f27304iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27305zoijcleaow, iobyxmoadgVar.f27305zoijcleaow);
            }

            public int hashCode() {
                return (this.f27304iobyxmoadg.hashCode() * 31) + this.f27305zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f27304iobyxmoadg;
            }

            public String toString() {
                return "Tab(id=" + this.f27304iobyxmoadg + ", title=" + this.f27305zoijcleaow + ")";
            }

            public final String zoijcleaow() {
                return this.f27305zoijcleaow;
            }
        }

        public lqeggnwhkg(List tabItems, ColorsUiModel colorsUiModel, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tabItems, "tabItems");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27303zdlpuopuiu = tabItems;
            this.f27302yggfygwlhe = colorsUiModel;
            this.f27301jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27303zdlpuopuiu, lqeggnwhkgVar.f27303zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27302yggfygwlhe, lqeggnwhkgVar.f27302yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27301jyumaefscl, lqeggnwhkgVar.f27301jyumaefscl);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27301jyumaefscl;
        }

        public int hashCode() {
            return (((this.f27303zdlpuopuiu.hashCode() * 31) + this.f27302yggfygwlhe.hashCode()) * 31) + this.f27301jyumaefscl.hashCode();
        }

        public final ColorsUiModel iobyxmoadg() {
            return this.f27302yggfygwlhe;
        }

        public String toString() {
            return "Tabs(tabItems=" + this.f27303zdlpuopuiu + ", colorsUiModel=" + this.f27302yggfygwlhe + ", itemId=" + this.f27301jyumaefscl + ")";
        }

        public final List wkgbmnqykc() {
            return this.f27303zdlpuopuiu;
        }

        public /* synthetic */ lqeggnwhkg(List list, ColorsUiModel colorsUiModel, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(list, colorsUiModel, (i13 & 4) != 0 ? "evropolis_dialog_tabs" : str);
        }
    }

    public static final class zoijcleaow implements yggfygwlhe {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f27314jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ColorsUiModel f27315yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f27316zdlpuopuiu;

        public zoijcleaow(String code, ColorsUiModel colorsUiModel, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(code, "code");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27316zdlpuopuiu = code;
            this.f27315yggfygwlhe = colorsUiModel;
            this.f27314jyumaefscl = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27316zdlpuopuiu, zoijcleaowVar.f27316zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27315yggfygwlhe, zoijcleaowVar.f27315yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27314jyumaefscl, zoijcleaowVar.f27314jyumaefscl);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27314jyumaefscl;
        }

        public int hashCode() {
            return (((this.f27316zdlpuopuiu.hashCode() * 31) + this.f27315yggfygwlhe.hashCode()) * 31) + this.f27314jyumaefscl.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f27316zdlpuopuiu;
        }

        public String toString() {
            return "Coupon(code=" + this.f27316zdlpuopuiu + ", colorsUiModel=" + this.f27315yggfygwlhe + ", itemId=" + this.f27314jyumaefscl + ")";
        }

        public final ColorsUiModel wkgbmnqykc() {
            return this.f27315yggfygwlhe;
        }

        public /* synthetic */ zoijcleaow(String str, ColorsUiModel colorsUiModel, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, colorsUiModel, (i13 & 4) != 0 ? "evropolis_dialog_coupon" : str2);
        }
    }

    public static final class wkgbmnqykc implements yggfygwlhe {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final String f27310iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f27311jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f27312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ProductUiModel f27313zdlpuopuiu;

        public wkgbmnqykc(ProductUiModel product, boolean z13, boolean z14, String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f27313zdlpuopuiu = product;
            this.f27312yggfygwlhe = z13;
            this.f27311jyumaefscl = z14;
            this.f27310iwizpuwonk = itemId;
        }

        public final boolean eablkybsjg() {
            return this.f27312yggfygwlhe;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27313zdlpuopuiu, wkgbmnqykcVar.f27313zdlpuopuiu) && this.f27312yggfygwlhe == wkgbmnqykcVar.f27312yggfygwlhe && this.f27311jyumaefscl == wkgbmnqykcVar.f27311jyumaefscl && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f27310iwizpuwonk, wkgbmnqykcVar.f27310iwizpuwonk);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f27310iwizpuwonk;
        }

        public int hashCode() {
            return (((((this.f27313zdlpuopuiu.hashCode() * 31) + Boolean.hashCode(this.f27312yggfygwlhe)) * 31) + Boolean.hashCode(this.f27311jyumaefscl)) * 31) + this.f27310iwizpuwonk.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f27313zdlpuopuiu;
        }

        public String toString() {
            return "Product(product=" + this.f27313zdlpuopuiu + ", isLoading=" + this.f27312yggfygwlhe + ", isButtonClickable=" + this.f27311jyumaefscl + ", itemId=" + this.f27310iwizpuwonk + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f27311jyumaefscl;
        }

        public /* synthetic */ wkgbmnqykc(ProductUiModel productUiModel, boolean z13, boolean z14, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(productUiModel, z13, z14, (i13 & 8) != 0 ? "evropolis_dialog_product" : str);
        }
    }
}
