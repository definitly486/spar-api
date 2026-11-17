package ru.myspar.favorites.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f88371iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1018818060;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88372iobyxmoadg;

        public draadjrbmk(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88372iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f88372iobyxmoadg, ((draadjrbmk) obj).f88372iobyxmoadg);
        }

        public int hashCode() {
            return this.f88372iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88372iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f88372iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88373iobyxmoadg;

        public dxjokdxxww(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88373iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f88373iobyxmoadg, ((dxjokdxxww) obj).f88373iobyxmoadg);
        }

        public int hashCode() {
            return this.f88373iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88373iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f88373iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2027eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88374iobyxmoadg;

        public C2027eablkybsjg(boolean z13) {
            this.f88374iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2027eablkybsjg) && this.f88374iobyxmoadg == ((C2027eablkybsjg) obj).f88374iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88374iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88374iobyxmoadg;
        }

        public String toString() {
            return "NavigateToStartAddressFlowScreen(hasUserAnyAddress=" + this.f88374iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88375iobyxmoadg;

        public gtknphoqwx(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88375iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f88375iobyxmoadg, ((gtknphoqwx) obj).f88375iobyxmoadg);
        }

        public int hashCode() {
            return this.f88375iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88375iobyxmoadg;
        }

        public String toString() {
            return "ShowRequestError(message=" + this.f88375iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f88376ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f88377iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f88378zoijcleaow;

        public gxszxtbevo(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f88377iobyxmoadg = hint;
            this.f88378zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f88377iobyxmoadg, gxszxtbevoVar.f88377iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88378zoijcleaow, gxszxtbevoVar.f88378zoijcleaow);
        }

        public int hashCode() {
            return (this.f88377iobyxmoadg.hashCode() * 31) + this.f88378zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f88378zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f88377iobyxmoadg + ", analyticsInfo=" + this.f88378zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f88377iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88379iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 107418044;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88380iobyxmoadg;

        public lqeggnwhkg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88380iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f88380iobyxmoadg, ((lqeggnwhkg) obj).f88380iobyxmoadg);
        }

        public int hashCode() {
            return this.f88380iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88380iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f88380iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f88381iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88382zoijcleaow;

        public nufgyqmvbu(ChangeProductParams params, String message) {
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88381iobyxmoadg = params;
            this.f88382zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f88381iobyxmoadg, nufgyqmvbuVar.f88381iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88382zoijcleaow, nufgyqmvbuVar.f88382zoijcleaow);
        }

        public int hashCode() {
            return (this.f88381iobyxmoadg.hashCode() * 31) + this.f88382zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88382zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f88381iobyxmoadg + ", message=" + this.f88382zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f88381iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88383iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 280834100;
        }

        public String toString() {
            return "NavigateToCartTab";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88384iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88385zoijcleaow;

        public wflxmlrfwp(String productId, String productArticle) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f88384iobyxmoadg = productId;
            this.f88385zoijcleaow = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f88384iobyxmoadg, wflxmlrfwpVar.f88384iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88385zoijcleaow, wflxmlrfwpVar.f88385zoijcleaow);
        }

        public int hashCode() {
            return (this.f88384iobyxmoadg.hashCode() * 31) + this.f88385zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88384iobyxmoadg;
        }

        public String toString() {
            return "ToProductScreen(productId=" + this.f88384iobyxmoadg + ", productArticle=" + this.f88385zoijcleaow + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f88386iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -59405187;
        }

        public String toString() {
            return "NavigateToCatalogTab";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88387iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -264637451;
        }

        public String toString() {
            return "NavigateToAuthScreen";
        }
    }
}
