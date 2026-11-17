package w61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118879iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f118880ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f118881wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118882zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String title, String message, boolean z13, String cardNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
            this.f118879iobyxmoadg = title;
            this.f118882zoijcleaow = message;
            this.f118880ppxfxbqfkf = z13;
            this.f118881wkgbmnqykc = cardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118879iobyxmoadg, iobyxmoadgVar.f118879iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118882zoijcleaow, iobyxmoadgVar.f118882zoijcleaow) && this.f118880ppxfxbqfkf == iobyxmoadgVar.f118880ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f118881wkgbmnqykc, iobyxmoadgVar.f118881wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f118879iobyxmoadg.hashCode() * 31) + this.f118882zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f118880ppxfxbqfkf)) * 31) + this.f118881wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118881wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f118879iobyxmoadg;
        }

        public String toString() {
            return "UpdateDataFetched(title=" + this.f118879iobyxmoadg + ", message=" + this.f118882zoijcleaow + ", isCardSwitchVisible=" + this.f118880ppxfxbqfkf + ", cardNumber=" + this.f118881wkgbmnqykc + ")";
        }

        public final String zoijcleaow() {
            return this.f118882zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
