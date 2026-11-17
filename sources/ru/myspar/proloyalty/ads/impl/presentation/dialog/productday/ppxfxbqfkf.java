package ru.myspar.proloyalty.ads.impl.presentation.dialog.productday;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92174iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f92174iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92174iobyxmoadg, ((iobyxmoadg) obj).f92174iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f92174iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "OnDismiss(productId=" + this.f92174iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2146ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92175iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2146ppxfxbqfkf(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f92175iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2146ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f92175iobyxmoadg, ((C2146ppxfxbqfkf) obj).f92175iobyxmoadg);
        }

        public int hashCode() {
            return this.f92175iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92175iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f92175iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f92176ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f92177iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f92178zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f92177iobyxmoadg = hint;
            this.f92178zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f92177iobyxmoadg, zoijcleaowVar.f92177iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92178zoijcleaow, zoijcleaowVar.f92178zoijcleaow);
        }

        public int hashCode() {
            return (this.f92177iobyxmoadg.hashCode() * 31) + this.f92178zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f92178zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f92177iobyxmoadg + ", analyticsInfo=" + this.f92178zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f92177iobyxmoadg;
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
