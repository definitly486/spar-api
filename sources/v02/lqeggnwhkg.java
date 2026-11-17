package v02;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x02.zoijcleaow f115061iobyxmoadg;

        public iobyxmoadg(x02.zoijcleaow buttonType) {
            zdlpuopuiu.btonecajqb(buttonType, "buttonType");
            this.f115061iobyxmoadg = buttonType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f115061iobyxmoadg == ((iobyxmoadg) obj).f115061iobyxmoadg;
        }

        public int hashCode() {
            return this.f115061iobyxmoadg.hashCode();
        }

        public final x02.zoijcleaow iobyxmoadg() {
            return this.f115061iobyxmoadg;
        }

        public String toString() {
            return "OnButtonClick(buttonType=" + this.f115061iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115062iobyxmoadg;

        public /* synthetic */ ppxfxbqfkf(int i13, gtknphoqwx gtknphoqwxVar) {
            this(i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f115062iobyxmoadg == ((ppxfxbqfkf) obj).f115062iobyxmoadg;
        }

        public int hashCode() {
            return pmvmpeiblj.wkgbmnqykc(this.f115062iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f115062iobyxmoadg;
        }

        public String toString() {
            return "OnChangeRating(value=" + pmvmpeiblj.eablkybsjg(this.f115062iobyxmoadg) + ")";
        }

        private ppxfxbqfkf(int i13) {
            this.f115062iobyxmoadg = i13;
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f115063iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -396317693;
        }

        public String toString() {
            return "OnDismissSnackBar";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f115064iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f115064iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f115064iobyxmoadg, ((zoijcleaow) obj).f115064iobyxmoadg);
        }

        public int hashCode() {
            return this.f115064iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f115064iobyxmoadg;
        }

        public String toString() {
            return "OnChangeComment(value=" + this.f115064iobyxmoadg + ")";
        }
    }
}
