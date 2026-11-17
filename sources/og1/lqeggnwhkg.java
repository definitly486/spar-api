package og1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f72835iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qg1.iobyxmoadg f72836iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(qg1.iobyxmoadg partner) {
            super(null);
            zdlpuopuiu.btonecajqb(partner, "partner");
            this.f72836iobyxmoadg = partner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72836iobyxmoadg, ((zoijcleaow) obj).f72836iobyxmoadg);
        }

        public int hashCode() {
            return this.f72836iobyxmoadg.hashCode();
        }

        public final qg1.iobyxmoadg iobyxmoadg() {
            return this.f72836iobyxmoadg;
        }

        public String toString() {
            return "OpenPartner(partner=" + this.f72836iobyxmoadg + ")";
        }
    }

    public /* synthetic */ lqeggnwhkg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}
