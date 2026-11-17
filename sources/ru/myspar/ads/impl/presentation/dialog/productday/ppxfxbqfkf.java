package ru.myspar.ads.impl.presentation.dialog.productday;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84149iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f84149iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84149iobyxmoadg, ((iobyxmoadg) obj).f84149iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f84149iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "OnDismiss(productId=" + this.f84149iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.ads.impl.presentation.dialog.productday.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1902ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84150iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1902ppxfxbqfkf(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f84150iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1902ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f84150iobyxmoadg, ((C1902ppxfxbqfkf) obj).f84150iobyxmoadg);
        }

        public int hashCode() {
            return this.f84150iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84150iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f84150iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f84151ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f84152iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f84153zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f84152iobyxmoadg = hint;
            this.f84153zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f84152iobyxmoadg, zoijcleaowVar.f84152iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84153zoijcleaow, zoijcleaowVar.f84153zoijcleaow);
        }

        public int hashCode() {
            return (this.f84152iobyxmoadg.hashCode() * 31) + this.f84153zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f84153zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f84152iobyxmoadg + ", analyticsInfo=" + this.f84153zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f84152iobyxmoadg;
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
