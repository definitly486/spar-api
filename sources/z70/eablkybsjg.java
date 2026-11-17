package z70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f129248iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129249iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f129249iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f129249iobyxmoadg, ((ppxfxbqfkf) obj).f129249iobyxmoadg);
        }

        public int hashCode() {
            return this.f129249iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129249iobyxmoadg;
        }

        public String toString() {
            return "RedirectToOrder(orderId=" + this.f129249iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f129250iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f129251iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f129251iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129251iobyxmoadg, ((zoijcleaow) obj).f129251iobyxmoadg);
        }

        public int hashCode() {
            return this.f129251iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f129251iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f129251iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
