package nj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f70194iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pj0.iobyxmoadg f70195iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(pj0.iobyxmoadg partner) {
            super(null);
            zdlpuopuiu.btonecajqb(partner, "partner");
            this.f70195iobyxmoadg = partner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70195iobyxmoadg, ((zoijcleaow) obj).f70195iobyxmoadg);
        }

        public int hashCode() {
            return this.f70195iobyxmoadg.hashCode();
        }

        public final pj0.iobyxmoadg iobyxmoadg() {
            return this.f70195iobyxmoadg;
        }

        public String toString() {
            return "OpenPartner(partner=" + this.f70195iobyxmoadg + ")";
        }
    }

    public /* synthetic */ lqeggnwhkg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}
