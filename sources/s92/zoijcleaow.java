package s92;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105847iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f105847iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105847iobyxmoadg, ((iobyxmoadg) obj).f105847iobyxmoadg);
        }

        public int hashCode() {
            return this.f105847iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f105847iobyxmoadg;
        }

        public String toString() {
            return "OnlineUrl(url=" + this.f105847iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: s92.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2589zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f105848iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2589zoijcleaow(List sbpBanks) {
            super(null);
            zdlpuopuiu.btonecajqb(sbpBanks, "sbpBanks");
            this.f105848iobyxmoadg = sbpBanks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2589zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105848iobyxmoadg, ((C2589zoijcleaow) obj).f105848iobyxmoadg);
        }

        public int hashCode() {
            return this.f105848iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f105848iobyxmoadg;
        }

        public String toString() {
            return "SbpBanks(sbpBanks=" + this.f105848iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
