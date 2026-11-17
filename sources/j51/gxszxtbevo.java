package j51;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50759iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f50760zoijcleaow;

        public iobyxmoadg(String date, String intervalValue) {
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f50759iobyxmoadg = date;
            this.f50760zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f50759iobyxmoadg, iobyxmoadgVar.f50759iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50760zoijcleaow, iobyxmoadgVar.f50760zoijcleaow);
        }

        public int hashCode() {
            return (this.f50759iobyxmoadg.hashCode() * 31) + this.f50760zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f50759iobyxmoadg;
        }

        public String toString() {
            return "ChangeSelectedInterval(date=" + this.f50759iobyxmoadg + ", intervalValue=" + this.f50760zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f50760zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f50761iobyxmoadg;

        public ppxfxbqfkf(List intervals) {
            zdlpuopuiu.btonecajqb(intervals, "intervals");
            this.f50761iobyxmoadg = intervals;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50761iobyxmoadg, ((ppxfxbqfkf) obj).f50761iobyxmoadg);
        }

        public int hashCode() {
            return this.f50761iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f50761iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(intervals=" + this.f50761iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f50762iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f50762iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f50762iobyxmoadg == ((wkgbmnqykc) obj).f50762iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f50762iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f50762iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f50762iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f50763iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f50763iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f50763iobyxmoadg == ((zoijcleaow) obj).f50763iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f50763iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f50763iobyxmoadg;
        }

        public String toString() {
            return "ConfirmProgress(isVisible=" + this.f50763iobyxmoadg + ")";
        }
    }
}
