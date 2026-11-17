package ka1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f54369iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54370iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String filterId) {
            super(null);
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f54370iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54370iobyxmoadg, ((ppxfxbqfkf) obj).f54370iobyxmoadg);
        }

        public int hashCode() {
            return this.f54370iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f54370iobyxmoadg;
        }

        public String toString() {
            return "OnFilterClick(filterId=" + this.f54370iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f54371iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ nufgyqmvbu(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private nufgyqmvbu() {
    }
}
