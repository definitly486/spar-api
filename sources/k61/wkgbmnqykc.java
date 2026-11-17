package k61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f53931iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f53931iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53931iobyxmoadg, ((iobyxmoadg) obj).f53931iobyxmoadg);
        }

        public int hashCode() {
            return this.f53931iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f53931iobyxmoadg;
        }

        public String toString() {
            return "OnArrowClicked(orderId=" + this.f53931iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f53932iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: k61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1159wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f53933iobyxmoadg;

        public C1159wkgbmnqykc(int i13) {
            super(null);
            this.f53933iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1159wkgbmnqykc) && this.f53933iobyxmoadg == ((C1159wkgbmnqykc) obj).f53933iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f53933iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f53933iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f53933iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f53934iobyxmoadg = new zoijcleaow();

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
