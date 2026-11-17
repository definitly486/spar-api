package z70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129265iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f129265iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129265iobyxmoadg, ((iobyxmoadg) obj).f129265iobyxmoadg);
        }

        public int hashCode() {
            return this.f129265iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129265iobyxmoadg;
        }

        public String toString() {
            return "OnArrowClicked(orderId=" + this.f129265iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f129266iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: z70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3283wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f129267iobyxmoadg;

        public C3283wkgbmnqykc(int i13) {
            super(null);
            this.f129267iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3283wkgbmnqykc) && this.f129267iobyxmoadg == ((C3283wkgbmnqykc) obj).f129267iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f129267iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f129267iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f129267iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f129268iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
