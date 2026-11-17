package xo1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f122963iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoScanMatrixPayload f122964iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ScanGoScanMatrixPayload payload) {
            super(null);
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f122964iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122964iobyxmoadg, ((zoijcleaow) obj).f122964iobyxmoadg);
        }

        public int hashCode() {
            return this.f122964iobyxmoadg.hashCode();
        }

        public final ScanGoScanMatrixPayload iobyxmoadg() {
            return this.f122964iobyxmoadg;
        }

        public String toString() {
            return "ToScanExciseStickerFragment(payload=" + this.f122964iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
