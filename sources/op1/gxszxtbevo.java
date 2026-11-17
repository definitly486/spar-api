package op1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f73383iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f73383iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f73383iobyxmoadg == ((iobyxmoadg) obj).f73383iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73383iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f73383iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f73383iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f73384iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f73384iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f73384iobyxmoadg, ((ppxfxbqfkf) obj).f73384iobyxmoadg);
        }

        public int hashCode() {
            return this.f73384iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f73384iobyxmoadg;
        }

        public String toString() {
            return "WarningMessageChanged(warningMessage=" + this.f73384iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final double f73385eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final c21.iobyxmoadg f73386gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f73387iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final List f73388lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final double f73389nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f73390ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f73391wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f73392zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(int i13, String article, String name, String str, double d13, c21.iobyxmoadg measureType, List markCodes, double d14) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            zdlpuopuiu.btonecajqb(markCodes, "markCodes");
            this.f73387iobyxmoadg = i13;
            this.f73392zoijcleaow = article;
            this.f73390ppxfxbqfkf = name;
            this.f73391wkgbmnqykc = str;
            this.f73385eablkybsjg = d13;
            this.f73386gxszxtbevo = measureType;
            this.f73388lqeggnwhkg = markCodes;
            this.f73389nufgyqmvbu = d14;
        }

        public final String eablkybsjg() {
            return this.f73390ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f73387iobyxmoadg == zoijcleaowVar.f73387iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f73392zoijcleaow, zoijcleaowVar.f73392zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f73390ppxfxbqfkf, zoijcleaowVar.f73390ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f73391wkgbmnqykc, zoijcleaowVar.f73391wkgbmnqykc) && Double.compare(this.f73385eablkybsjg, zoijcleaowVar.f73385eablkybsjg) == 0 && this.f73386gxszxtbevo == zoijcleaowVar.f73386gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f73388lqeggnwhkg, zoijcleaowVar.f73388lqeggnwhkg) && Double.compare(this.f73389nufgyqmvbu, zoijcleaowVar.f73389nufgyqmvbu) == 0;
        }

        public final String gxszxtbevo() {
            return this.f73391wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.f73387iobyxmoadg) * 31) + this.f73392zoijcleaow.hashCode()) * 31) + this.f73390ppxfxbqfkf.hashCode()) * 31;
            String str = this.f73391wkgbmnqykc;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f73385eablkybsjg)) * 31) + this.f73386gxszxtbevo.hashCode()) * 31) + this.f73388lqeggnwhkg.hashCode()) * 31) + Double.hashCode(this.f73389nufgyqmvbu);
        }

        public final String iobyxmoadg() {
            return this.f73392zoijcleaow;
        }

        public final double lqeggnwhkg() {
            return this.f73389nufgyqmvbu;
        }

        public final double nufgyqmvbu() {
            return this.f73385eablkybsjg;
        }

        public final List ppxfxbqfkf() {
            return this.f73388lqeggnwhkg;
        }

        public String toString() {
            return "UiStateUpdated(id=" + this.f73387iobyxmoadg + ", article=" + this.f73392zoijcleaow + ", name=" + this.f73390ppxfxbqfkf + ", pictureUrl=" + this.f73391wkgbmnqykc + ", quantity=" + this.f73385eablkybsjg + ", measureType=" + this.f73386gxszxtbevo + ", markCodes=" + this.f73388lqeggnwhkg + ", price=" + this.f73389nufgyqmvbu + ")";
        }

        public final c21.iobyxmoadg wkgbmnqykc() {
            return this.f73386gxszxtbevo;
        }

        public final int zoijcleaow() {
            return this.f73387iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
