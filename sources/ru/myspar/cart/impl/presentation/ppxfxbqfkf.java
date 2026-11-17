package ru.myspar.cart.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f85050iobyxmoadg;

        public eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f85050iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f85050iobyxmoadg, ((eablkybsjg) obj).f85050iobyxmoadg);
        }

        public int hashCode() {
            return this.f85050iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f85050iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f85050iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f85051iobyxmoadg;

        public gxszxtbevo(CharSequence charSequence) {
            this.f85051iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f85051iobyxmoadg, ((gxszxtbevo) obj).f85051iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f85051iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f85051iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f85051iobyxmoadg) + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f85052iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2044825138;
        }

        public String toString() {
            return "ClearPromo";
        }
    }

    public static final class lqeggnwhkg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85053iobyxmoadg;

        public lqeggnwhkg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85053iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f85053iobyxmoadg, ((lqeggnwhkg) obj).f85053iobyxmoadg);
        }

        public int hashCode() {
            return this.f85053iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85053iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningInfoMessage(message=" + this.f85053iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cart.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1935ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85054iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85055zoijcleaow;

        public C1935ppxfxbqfkf(String name, String phone) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f85054iobyxmoadg = name;
            this.f85055zoijcleaow = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1935ppxfxbqfkf)) {
                return false;
            }
            C1935ppxfxbqfkf c1935ppxfxbqfkf = (C1935ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f85054iobyxmoadg, c1935ppxfxbqfkf.f85054iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85055zoijcleaow, c1935ppxfxbqfkf.f85055zoijcleaow);
        }

        public int hashCode() {
            return (this.f85054iobyxmoadg.hashCode() * 31) + this.f85055zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85054iobyxmoadg;
        }

        public String toString() {
            return "ShowContactsScreen(name=" + this.f85054iobyxmoadg + ", phone=" + this.f85055zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85055zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f85056zoijcleaow = AdditionalInfoUiModel.f86102cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AdditionalInfoUiModel f85057iobyxmoadg;

        public wkgbmnqykc(AdditionalInfoUiModel payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f85057iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f85057iobyxmoadg, ((wkgbmnqykc) obj).f85057iobyxmoadg);
        }

        public int hashCode() {
            return this.f85057iobyxmoadg.hashCode();
        }

        public final AdditionalInfoUiModel iobyxmoadg() {
            return this.f85057iobyxmoadg;
        }

        public String toString() {
            return "ShowDeliveryTermsDialog(payload=" + this.f85057iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85058ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85059iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f85060zoijcleaow;

        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f85059iobyxmoadg = hint;
            this.f85060zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f85059iobyxmoadg, zoijcleaowVar.f85059iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85060zoijcleaow, zoijcleaowVar.f85060zoijcleaow);
        }

        public int hashCode() {
            return (this.f85059iobyxmoadg.hashCode() * 31) + this.f85060zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f85060zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f85059iobyxmoadg + ", analyticsInfo=" + this.f85060zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85059iobyxmoadg;
        }
    }
}
