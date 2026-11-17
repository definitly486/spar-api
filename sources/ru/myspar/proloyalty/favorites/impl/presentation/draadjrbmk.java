package ru.myspar.proloyalty.favorites.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface draadjrbmk {

    public static final class eablkybsjg implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96322iobyxmoadg;

        public eablkybsjg(String errorMessage) {
            zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
            this.f96322iobyxmoadg = errorMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f96322iobyxmoadg, ((eablkybsjg) obj).f96322iobyxmoadg);
        }

        public int hashCode() {
            return this.f96322iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96322iobyxmoadg;
        }

        public String toString() {
            return "ShowRequestError(errorMessage=" + this.f96322iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements draadjrbmk {
    }

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f96323ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f96324iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f96325zoijcleaow;

        public iobyxmoadg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f96324iobyxmoadg = hint;
            this.f96325zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96324iobyxmoadg, iobyxmoadgVar.f96324iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96325zoijcleaow, iobyxmoadgVar.f96325zoijcleaow);
        }

        public int hashCode() {
            return (this.f96324iobyxmoadg.hashCode() * 31) + this.f96325zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f96325zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f96324iobyxmoadg + ", analyticsInfo=" + this.f96325zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f96324iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96326iobyxmoadg;

        public lqeggnwhkg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f96326iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f96326iobyxmoadg, ((lqeggnwhkg) obj).f96326iobyxmoadg);
        }

        public int hashCode() {
            return this.f96326iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96326iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f96326iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {
        public abstract String iobyxmoadg();
    }

    public static final class wkgbmnqykc implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f96327iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -2031936088;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96328iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f96328iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96328iobyxmoadg, ((zoijcleaow) obj).f96328iobyxmoadg);
        }

        public int hashCode() {
            return this.f96328iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96328iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f96328iobyxmoadg + ")";
        }
    }
}
