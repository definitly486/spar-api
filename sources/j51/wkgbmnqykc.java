package j51;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f50784iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1981470356;
        }

        public String toString() {
            return "OnCloseClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50785iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f50786zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String date, String intervalValue) {
            super(null);
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f50785iobyxmoadg = date;
            this.f50786zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f50785iobyxmoadg, ppxfxbqfkfVar.f50785iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50786zoijcleaow, ppxfxbqfkfVar.f50786zoijcleaow);
        }

        public int hashCode() {
            return (this.f50785iobyxmoadg.hashCode() * 31) + this.f50786zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f50785iobyxmoadg;
        }

        public String toString() {
            return "OnIntervalClicked(date=" + this.f50785iobyxmoadg + ", intervalValue=" + this.f50786zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f50786zoijcleaow;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f50787iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 503562609;
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
