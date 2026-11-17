package u60;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112754iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112755zoijcleaow;

        public iobyxmoadg(String date, String intervalValue) {
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f112754iobyxmoadg = date;
            this.f112755zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f112754iobyxmoadg, iobyxmoadgVar.f112754iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112755zoijcleaow, iobyxmoadgVar.f112755zoijcleaow);
        }

        public int hashCode() {
            return (this.f112754iobyxmoadg.hashCode() * 31) + this.f112755zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112754iobyxmoadg;
        }

        public String toString() {
            return "ChangeSelectedInterval(date=" + this.f112754iobyxmoadg + ", intervalValue=" + this.f112755zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f112755zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f112756iobyxmoadg;

        public ppxfxbqfkf(List intervals) {
            zdlpuopuiu.btonecajqb(intervals, "intervals");
            this.f112756iobyxmoadg = intervals;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112756iobyxmoadg, ((ppxfxbqfkf) obj).f112756iobyxmoadg);
        }

        public int hashCode() {
            return this.f112756iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112756iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(intervals=" + this.f112756iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112757iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f112757iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f112757iobyxmoadg == ((wkgbmnqykc) obj).f112757iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f112757iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f112757iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f112757iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112758iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f112758iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f112758iobyxmoadg == ((zoijcleaow) obj).f112758iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f112758iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f112758iobyxmoadg;
        }

        public String toString() {
            return "ConfirmProgress(isVisible=" + this.f112758iobyxmoadg + ")";
        }
    }
}
