package mm1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final om1.zoijcleaow f67510iobyxmoadg;

        public iobyxmoadg(om1.zoijcleaow buttonType) {
            zdlpuopuiu.btonecajqb(buttonType, "buttonType");
            this.f67510iobyxmoadg = buttonType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f67510iobyxmoadg == ((iobyxmoadg) obj).f67510iobyxmoadg;
        }

        public int hashCode() {
            return this.f67510iobyxmoadg.hashCode();
        }

        public final om1.zoijcleaow iobyxmoadg() {
            return this.f67510iobyxmoadg;
        }

        public String toString() {
            return "OnButtonClick(buttonType=" + this.f67510iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f67511iobyxmoadg;

        public /* synthetic */ ppxfxbqfkf(int i13, gtknphoqwx gtknphoqwxVar) {
            this(i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f67511iobyxmoadg == ((ppxfxbqfkf) obj).f67511iobyxmoadg;
        }

        public int hashCode() {
            return pmvmpeiblj.wkgbmnqykc(this.f67511iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f67511iobyxmoadg;
        }

        public String toString() {
            return "OnChangeRating(value=" + pmvmpeiblj.eablkybsjg(this.f67511iobyxmoadg) + ")";
        }

        private ppxfxbqfkf(int i13) {
            this.f67511iobyxmoadg = i13;
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f67512iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1379075328;
        }

        public String toString() {
            return "OnDismissSnackBar";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f67513iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f67513iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67513iobyxmoadg, ((zoijcleaow) obj).f67513iobyxmoadg);
        }

        public int hashCode() {
            return this.f67513iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f67513iobyxmoadg;
        }

        public String toString() {
            return "OnChangeComment(value=" + this.f67513iobyxmoadg + ")";
        }
    }
}
