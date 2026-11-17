package ru.myspar.proloyalty.cart.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92978iobyxmoadg;

        public eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92978iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92978iobyxmoadg, ((eablkybsjg) obj).f92978iobyxmoadg);
        }

        public int hashCode() {
            return this.f92978iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92978iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f92978iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92979iobyxmoadg;

        public gxszxtbevo(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f92979iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f92979iobyxmoadg, ((gxszxtbevo) obj).f92979iobyxmoadg);
        }

        public int hashCode() {
            return this.f92979iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92979iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f92979iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92980iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -538829713;
        }

        public String toString() {
            return "ClearPromo";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2177ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92981iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f92982zoijcleaow;

        public C2177ppxfxbqfkf(String name, String phone) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f92981iobyxmoadg = name;
            this.f92982zoijcleaow = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2177ppxfxbqfkf)) {
                return false;
            }
            C2177ppxfxbqfkf c2177ppxfxbqfkf = (C2177ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f92981iobyxmoadg, c2177ppxfxbqfkf.f92981iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92982zoijcleaow, c2177ppxfxbqfkf.f92982zoijcleaow);
        }

        public int hashCode() {
            return (this.f92981iobyxmoadg.hashCode() * 31) + this.f92982zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92981iobyxmoadg;
        }

        public String toString() {
            return "ShowContactsScreen(name=" + this.f92981iobyxmoadg + ", phone=" + this.f92982zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f92982zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f92983zoijcleaow = AdditionalInfoUiModel.f93836cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AdditionalInfoUiModel f92984iobyxmoadg;

        public wkgbmnqykc(AdditionalInfoUiModel payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f92984iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f92984iobyxmoadg, ((wkgbmnqykc) obj).f92984iobyxmoadg);
        }

        public int hashCode() {
            return this.f92984iobyxmoadg.hashCode();
        }

        public final AdditionalInfoUiModel iobyxmoadg() {
            return this.f92984iobyxmoadg;
        }

        public String toString() {
            return "ShowDeliveryTermsDialog(payload=" + this.f92984iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f92985ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f92986iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f92987zoijcleaow;

        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f92986iobyxmoadg = hint;
            this.f92987zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f92986iobyxmoadg, zoijcleaowVar.f92986iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92987zoijcleaow, zoijcleaowVar.f92987zoijcleaow);
        }

        public int hashCode() {
            return (this.f92986iobyxmoadg.hashCode() * 31) + this.f92987zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f92987zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f92986iobyxmoadg + ", analyticsInfo=" + this.f92987zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f92986iobyxmoadg;
        }
    }
}
