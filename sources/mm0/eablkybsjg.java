package mm0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67477iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f67477iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67477iobyxmoadg, ((iobyxmoadg) obj).f67477iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f67477iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67477iobyxmoadg;
        }

        public String toString() {
            return "OnDismiss(productId=" + this.f67477iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f67478iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f67478iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f67478iobyxmoadg, ((ppxfxbqfkf) obj).f67478iobyxmoadg);
        }

        public int hashCode() {
            return this.f67478iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f67478iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f67478iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f67479ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f67480iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f67481zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f67480iobyxmoadg = hint;
            this.f67481zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f67480iobyxmoadg, zoijcleaowVar.f67480iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67481zoijcleaow, zoijcleaowVar.f67481zoijcleaow);
        }

        public int hashCode() {
            return (this.f67480iobyxmoadg.hashCode() * 31) + this.f67481zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f67481zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f67480iobyxmoadg + ", analyticsInfo=" + this.f67481zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f67480iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
