package u60;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f112779iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1930532591;
        }

        public String toString() {
            return "OnCloseClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112780iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112781zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String date, String intervalValue) {
            super(null);
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f112780iobyxmoadg = date;
            this.f112781zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f112780iobyxmoadg, ppxfxbqfkfVar.f112780iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112781zoijcleaow, ppxfxbqfkfVar.f112781zoijcleaow);
        }

        public int hashCode() {
            return (this.f112780iobyxmoadg.hashCode() * 31) + this.f112781zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112780iobyxmoadg;
        }

        public String toString() {
            return "OnIntervalClicked(date=" + this.f112780iobyxmoadg + ", intervalValue=" + this.f112781zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f112781zoijcleaow;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f112782iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 219600718;
        }

        public String toString() {
            return "OnContinueButtonClicked";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
