package lc0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f62061iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f62062iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String filterId) {
            super(null);
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f62062iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f62062iobyxmoadg, ((ppxfxbqfkf) obj).f62062iobyxmoadg);
        }

        public int hashCode() {
            return this.f62062iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f62062iobyxmoadg;
        }

        public String toString() {
            return "OnFilterClick(filterId=" + this.f62062iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f62063iobyxmoadg = new zoijcleaow();

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
