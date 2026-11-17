package s32;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f105406iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f105406iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f105406iobyxmoadg == ((iobyxmoadg) obj).f105406iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f105406iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f105406iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f105406iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105407iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f105407iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f105407iobyxmoadg, ((ppxfxbqfkf) obj).f105407iobyxmoadg);
        }

        public int hashCode() {
            return this.f105407iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f105407iobyxmoadg;
        }

        public String toString() {
            return "WarningMessageChanged(warningMessage=" + this.f105407iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final double f105408eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final x30.iobyxmoadg f105409gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f105410iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final List f105411lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final double f105412nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f105413ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f105414wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f105415zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(int i13, String article, String name, String str, double d13, x30.iobyxmoadg measureType, List markCodes, double d14) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            zdlpuopuiu.btonecajqb(markCodes, "markCodes");
            this.f105410iobyxmoadg = i13;
            this.f105415zoijcleaow = article;
            this.f105413ppxfxbqfkf = name;
            this.f105414wkgbmnqykc = str;
            this.f105408eablkybsjg = d13;
            this.f105409gxszxtbevo = measureType;
            this.f105411lqeggnwhkg = markCodes;
            this.f105412nufgyqmvbu = d14;
        }

        public final String eablkybsjg() {
            return this.f105413ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f105410iobyxmoadg == zoijcleaowVar.f105410iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f105415zoijcleaow, zoijcleaowVar.f105415zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105413ppxfxbqfkf, zoijcleaowVar.f105413ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f105414wkgbmnqykc, zoijcleaowVar.f105414wkgbmnqykc) && Double.compare(this.f105408eablkybsjg, zoijcleaowVar.f105408eablkybsjg) == 0 && this.f105409gxszxtbevo == zoijcleaowVar.f105409gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f105411lqeggnwhkg, zoijcleaowVar.f105411lqeggnwhkg) && Double.compare(this.f105412nufgyqmvbu, zoijcleaowVar.f105412nufgyqmvbu) == 0;
        }

        public final String gxszxtbevo() {
            return this.f105414wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.f105410iobyxmoadg) * 31) + this.f105415zoijcleaow.hashCode()) * 31) + this.f105413ppxfxbqfkf.hashCode()) * 31;
            String str = this.f105414wkgbmnqykc;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f105408eablkybsjg)) * 31) + this.f105409gxszxtbevo.hashCode()) * 31) + this.f105411lqeggnwhkg.hashCode()) * 31) + Double.hashCode(this.f105412nufgyqmvbu);
        }

        public final String iobyxmoadg() {
            return this.f105415zoijcleaow;
        }

        public final double lqeggnwhkg() {
            return this.f105412nufgyqmvbu;
        }

        public final double nufgyqmvbu() {
            return this.f105408eablkybsjg;
        }

        public final List ppxfxbqfkf() {
            return this.f105411lqeggnwhkg;
        }

        public String toString() {
            return "UiStateUpdated(id=" + this.f105410iobyxmoadg + ", article=" + this.f105415zoijcleaow + ", name=" + this.f105413ppxfxbqfkf + ", pictureUrl=" + this.f105414wkgbmnqykc + ", quantity=" + this.f105408eablkybsjg + ", measureType=" + this.f105409gxszxtbevo + ", markCodes=" + this.f105411lqeggnwhkg + ", price=" + this.f105412nufgyqmvbu + ")";
        }

        public final x30.iobyxmoadg wkgbmnqykc() {
            return this.f105409gxszxtbevo;
        }

        public final int zoijcleaow() {
            return this.f105410iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
