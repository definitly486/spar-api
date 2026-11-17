package ru.myspar.favorites.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;

/* JADX INFO: loaded from: classes4.dex */
public interface draadjrbmk {

    public static final class eablkybsjg implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f88512iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1018929019;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class gxszxtbevo implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88513iobyxmoadg;

        public gxszxtbevo(String errorMessage) {
            zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
            this.f88513iobyxmoadg = errorMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f88513iobyxmoadg, ((gxszxtbevo) obj).f88513iobyxmoadg);
        }

        public int hashCode() {
            return this.f88513iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88513iobyxmoadg;
        }

        public String toString() {
            return "ShowRequestError(errorMessage=" + this.f88513iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f88514ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f88515iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f88516zoijcleaow;

        public iobyxmoadg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f88515iobyxmoadg = hint;
            this.f88516zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f88515iobyxmoadg, iobyxmoadgVar.f88515iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88516zoijcleaow, iobyxmoadgVar.f88516zoijcleaow);
        }

        public int hashCode() {
            return (this.f88515iobyxmoadg.hashCode() * 31) + this.f88516zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f88516zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f88515iobyxmoadg + ", analyticsInfo=" + this.f88516zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f88515iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg implements draadjrbmk {
    }

    public static final class nufgyqmvbu implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88517iobyxmoadg;

        public nufgyqmvbu(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88517iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f88517iobyxmoadg, ((nufgyqmvbu) obj).f88517iobyxmoadg);
        }

        public int hashCode() {
            return this.f88517iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88517iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f88517iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88518iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88518iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f88518iobyxmoadg, ((ppxfxbqfkf) obj).f88518iobyxmoadg);
        }

        public int hashCode() {
            return this.f88518iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88518iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88518iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88519iobyxmoadg;

        public wkgbmnqykc(String errorText) {
            zdlpuopuiu.btonecajqb(errorText, "errorText");
            this.f88519iobyxmoadg = errorText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88519iobyxmoadg, ((wkgbmnqykc) obj).f88519iobyxmoadg);
        }

        public int hashCode() {
            return this.f88519iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88519iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(errorText=" + this.f88519iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f88520iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88521zoijcleaow;

        public zoijcleaow(ChangeProductParams params, String message) {
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88520iobyxmoadg = params;
            this.f88521zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f88520iobyxmoadg, zoijcleaowVar.f88520iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88521zoijcleaow, zoijcleaowVar.f88521zoijcleaow);
        }

        public int hashCode() {
            return (this.f88520iobyxmoadg.hashCode() * 31) + this.f88521zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88521zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f88520iobyxmoadg + ", message=" + this.f88521zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f88520iobyxmoadg;
        }
    }
}
