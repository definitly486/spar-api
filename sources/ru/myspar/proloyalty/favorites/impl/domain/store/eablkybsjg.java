package ru.myspar.proloyalty.favorites.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96189iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f96190zoijcleaow;

        public btonecajqb(String productId, String productArticle) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f96189iobyxmoadg = productId;
            this.f96190zoijcleaow = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f96189iobyxmoadg, btonecajqbVar.f96189iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96190zoijcleaow, btonecajqbVar.f96190zoijcleaow);
        }

        public int hashCode() {
            return (this.f96189iobyxmoadg.hashCode() * 31) + this.f96190zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96189iobyxmoadg;
        }

        public String toString() {
            return "ToProductScreen(productId=" + this.f96189iobyxmoadg + ", productArticle=" + this.f96190zoijcleaow + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96191iobyxmoadg;

        public dxjokdxxww(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f96191iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f96191iobyxmoadg, ((dxjokdxxww) obj).f96191iobyxmoadg);
        }

        public int hashCode() {
            return this.f96191iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96191iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f96191iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.favorites.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2271eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f96192ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f96193iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f96194zoijcleaow;

        public C2271eablkybsjg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f96193iobyxmoadg = hint;
            this.f96194zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2271eablkybsjg)) {
                return false;
            }
            C2271eablkybsjg c2271eablkybsjg = (C2271eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96193iobyxmoadg, c2271eablkybsjg.f96193iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96194zoijcleaow, c2271eablkybsjg.f96194zoijcleaow);
        }

        public int hashCode() {
            return (this.f96193iobyxmoadg.hashCode() * 31) + this.f96194zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f96194zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f96193iobyxmoadg + ", analyticsInfo=" + this.f96194zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f96193iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96195iobyxmoadg;

        public gxszxtbevo(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f96195iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f96195iobyxmoadg, ((gxszxtbevo) obj).f96195iobyxmoadg);
        }

        public int hashCode() {
            return this.f96195iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96195iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f96195iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96196iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -423999879;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f96197iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -635853711;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96198iobyxmoadg;

        public nufgyqmvbu(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f96198iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f96198iobyxmoadg, ((nufgyqmvbu) obj).f96198iobyxmoadg);
        }

        public int hashCode() {
            return this.f96198iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96198iobyxmoadg;
        }

        public String toString() {
            return "ShowRequestError(message=" + this.f96198iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96199iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1560041111;
        }

        public String toString() {
            return "NavigateToCartTab";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f96200iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -448157894;
        }

        public String toString() {
            return "NavigateToCatalogTab";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96201iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 872028551;
        }

        public String toString() {
            return "NavigateToAuthorizationScreen";
        }
    }
}
