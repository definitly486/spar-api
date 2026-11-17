package ru.myspar.proloyalty.myspar.impl.presentation;

import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.story.api.model.StoryPayload;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kcexrzcfyt {

    public static final class btonecajqb extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98147iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f98147iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98147iobyxmoadg, ((btonecajqb) obj).f98147iobyxmoadg);
        }

        public int hashCode() {
            return this.f98147iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98147iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f98147iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryPayload f98148iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(StoryPayload args) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f98148iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98148iobyxmoadg, ((dxjokdxxww) obj).f98148iobyxmoadg);
        }

        public int hashCode() {
            return this.f98148iobyxmoadg.hashCode();
        }

        public final StoryPayload iobyxmoadg() {
            return this.f98148iobyxmoadg;
        }

        public String toString() {
            return "ShowStoryDialog(args=" + this.f98148iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends kcexrzcfyt {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f98149ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f98150iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f98151zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f98150iobyxmoadg = hint;
            this.f98151zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98150iobyxmoadg, eablkybsjgVar.f98150iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98151zoijcleaow, eablkybsjgVar.f98151zoijcleaow);
        }

        public int hashCode() {
            return (this.f98150iobyxmoadg.hashCode() * 31) + this.f98151zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f98151zoijcleaow;
        }

        public String toString() {
            return "ShowHintDialog(hint=" + this.f98150iobyxmoadg + ", analyticsInfo=" + this.f98151zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f98150iobyxmoadg;
        }
    }

    public static final class gxszxtbevo extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98152iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ChangeProductParams f98153zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(boolean z13, ChangeProductParams params) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f98152iobyxmoadg = z13;
            this.f98153zoijcleaow = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return this.f98152iobyxmoadg == gxszxtbevoVar.f98152iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98153zoijcleaow, gxszxtbevoVar.f98153zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f98152iobyxmoadg) * 31) + this.f98153zoijcleaow.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f98153zoijcleaow;
        }

        public String toString() {
            return "ShowIqosAgreementDialog(isAddProduct=" + this.f98152iobyxmoadg + ", params=" + this.f98153zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f98152iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98154iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f98155iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98156iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            super(null);
            this.f98156iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f98156iobyxmoadg == ((nufgyqmvbu) obj).f98156iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98156iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98156iobyxmoadg;
        }

        public String toString() {
            return "ShowQrDialog(isAuto=" + this.f98156iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f98157iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends kcexrzcfyt {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f98158zoijcleaow = BuildYourComboDialogArgs.f95481iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f98159iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(BuildYourComboDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f98159iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98159iobyxmoadg, ((wkgbmnqykc) obj).f98159iobyxmoadg);
        }

        public int hashCode() {
            return this.f98159iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f98159iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f98159iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yggfygwlhe.iobyxmoadg f98160iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(yggfygwlhe.iobyxmoadg source) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            this.f98160iobyxmoadg = source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98160iobyxmoadg, ((zoijcleaow) obj).f98160iobyxmoadg);
        }

        public int hashCode() {
            return this.f98160iobyxmoadg.hashCode();
        }

        public final yggfygwlhe.iobyxmoadg iobyxmoadg() {
            return this.f98160iobyxmoadg;
        }

        public String toString() {
            return "ShowAdultWarningDialog(source=" + this.f98160iobyxmoadg + ")";
        }
    }

    public /* synthetic */ kcexrzcfyt(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private kcexrzcfyt() {
    }
}
