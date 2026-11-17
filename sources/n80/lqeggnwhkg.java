package n80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69368iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f69369ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f69370wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f69371zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String title, String message, boolean z13, String cardNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
            this.f69368iobyxmoadg = title;
            this.f69371zoijcleaow = message;
            this.f69369ppxfxbqfkf = z13;
            this.f69370wkgbmnqykc = cardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f69368iobyxmoadg, iobyxmoadgVar.f69368iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69371zoijcleaow, iobyxmoadgVar.f69371zoijcleaow) && this.f69369ppxfxbqfkf == iobyxmoadgVar.f69369ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f69370wkgbmnqykc, iobyxmoadgVar.f69370wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f69368iobyxmoadg.hashCode() * 31) + this.f69371zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f69369ppxfxbqfkf)) * 31) + this.f69370wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69370wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f69368iobyxmoadg;
        }

        public String toString() {
            return "UpdateDataFetched(title=" + this.f69368iobyxmoadg + ", message=" + this.f69371zoijcleaow + ", isCardSwitchVisible=" + this.f69369ppxfxbqfkf + ", cardNumber=" + this.f69370wkgbmnqykc + ")";
        }

        public final String zoijcleaow() {
            return this.f69371zoijcleaow;
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}
