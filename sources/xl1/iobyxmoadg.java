package xl1;

import gg.vdvldrhtss;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    public static final class eablkybsjg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f122867iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(vdvldrhtss reasonChange) {
            super(null);
            zdlpuopuiu.btonecajqb(reasonChange, "reasonChange");
            this.f122867iobyxmoadg = reasonChange;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f122867iobyxmoadg, ((eablkybsjg) obj).f122867iobyxmoadg);
        }

        public int hashCode() {
            return this.f122867iobyxmoadg.hashCode();
        }

        public final vdvldrhtss iobyxmoadg() {
            return this.f122867iobyxmoadg;
        }

        public String toString() {
            return "OnReasonChanged(reasonChange=" + this.f122867iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: xl1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3092iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3092iobyxmoadg f122868iobyxmoadg = new C3092iobyxmoadg();

        private C3092iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3092iobyxmoadg);
        }

        public int hashCode() {
            return 636617647;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f122869iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -578715242;
        }

        public String toString() {
            return "OnRateClicked";
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f122870iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f122870iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f122870iobyxmoadg == ((wkgbmnqykc) obj).f122870iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f122870iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f122870iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChanged(rating=" + this.f122870iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122871iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f122871iobyxmoadg = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122871iobyxmoadg, ((zoijcleaow) obj).f122871iobyxmoadg);
        }

        public int hashCode() {
            return this.f122871iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f122871iobyxmoadg;
        }

        public String toString() {
            return "OnCommentChanged(comment=" + this.f122871iobyxmoadg + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private iobyxmoadg() {
    }
}
