package g02;

import gg.vdvldrhtss;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    public static final class eablkybsjg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vdvldrhtss f35788iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(vdvldrhtss reasonChange) {
            super(null);
            zdlpuopuiu.btonecajqb(reasonChange, "reasonChange");
            this.f35788iobyxmoadg = reasonChange;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f35788iobyxmoadg, ((eablkybsjg) obj).f35788iobyxmoadg);
        }

        public int hashCode() {
            return this.f35788iobyxmoadg.hashCode();
        }

        public final vdvldrhtss iobyxmoadg() {
            return this.f35788iobyxmoadg;
        }

        public String toString() {
            return "OnReasonChanged(reasonChange=" + this.f35788iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: g02.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0807iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0807iobyxmoadg f35789iobyxmoadg = new C0807iobyxmoadg();

        private C0807iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0807iobyxmoadg);
        }

        public int hashCode() {
            return -364094030;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f35790iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1579426919;
        }

        public String toString() {
            return "OnRateClicked";
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f35791iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f35791iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f35791iobyxmoadg == ((wkgbmnqykc) obj).f35791iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f35791iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f35791iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChanged(rating=" + this.f35791iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35792iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f35792iobyxmoadg = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f35792iobyxmoadg, ((zoijcleaow) obj).f35792iobyxmoadg);
        }

        public int hashCode() {
            return this.f35792iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35792iobyxmoadg;
        }

        public String toString() {
            return "OnCommentChanged(comment=" + this.f35792iobyxmoadg + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private iobyxmoadg() {
    }
}
