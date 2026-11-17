package bo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f16845iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f16845iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16845iobyxmoadg, ((iobyxmoadg) obj).f16845iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f16845iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f16845iobyxmoadg;
        }

        public String toString() {
            return "OnDismiss(productId=" + this.f16845iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f16846iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f16846iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16846iobyxmoadg, ((ppxfxbqfkf) obj).f16846iobyxmoadg);
        }

        public int hashCode() {
            return this.f16846iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f16846iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f16846iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f16847ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f16848iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f16849zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f16848iobyxmoadg = hint;
            this.f16849zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f16848iobyxmoadg, zoijcleaowVar.f16848iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16849zoijcleaow, zoijcleaowVar.f16849zoijcleaow);
        }

        public int hashCode() {
            return (this.f16848iobyxmoadg.hashCode() * 31) + this.f16849zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f16849zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f16848iobyxmoadg + ", analyticsInfo=" + this.f16849zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f16848iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
