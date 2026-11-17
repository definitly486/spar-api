package mv1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68023iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f68023iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68023iobyxmoadg, ((iobyxmoadg) obj).f68023iobyxmoadg);
        }

        public int hashCode() {
            return this.f68023iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f68023iobyxmoadg;
        }

        public String toString() {
            return "OnlineUrl(url=" + this.f68023iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: mv1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1455zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f68024iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1455zoijcleaow(List sbpBanks) {
            super(null);
            zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f68024iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1455zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f68024iobyxmoadg, ((C1455zoijcleaow) obj).f68024iobyxmoadg);
        }

        public int hashCode() {
            return this.f68024iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f68024iobyxmoadg;
        }

        public String toString() {
            return "SbpBanks(sbpBanks=" + this.f68024iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
