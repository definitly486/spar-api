package xm0;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg extends wm0.iobyxmoadg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f122885ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f122886wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String productsSetName, String purchasesListName) {
            super("Добавление набора товаров в список", null);
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            zdlpuopuiu.btonecajqb(purchasesListName, "purchasesListName");
            this.f122885ppxfxbqfkf = productsSetName;
            this.f122886wkgbmnqykc = purchasesListName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f122885ppxfxbqfkf, iobyxmoadgVar.f122885ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f122886wkgbmnqykc, iobyxmoadgVar.f122886wkgbmnqykc);
        }

        public int hashCode() {
            return (this.f122885ppxfxbqfkf.hashCode() * 31) + this.f122886wkgbmnqykc.hashCode();
        }

        public String toString() {
            return "AddToPurchasesList(productsSetName=" + this.f122885ppxfxbqfkf + ", purchasesListName=" + this.f122886wkgbmnqykc + ")";
        }

        @Override // wm0.iobyxmoadg
        public Map zoijcleaow() {
            return tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("set_title", this.f122885ppxfxbqfkf), cqumvgiudr.iobyxmoadg("list_name", this.f122886wkgbmnqykc));
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f122887ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productsSetName) {
            super("Открытие набора товаров", null);
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            this.f122887ppxfxbqfkf = productsSetName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122887ppxfxbqfkf, ((zoijcleaow) obj).f122887ppxfxbqfkf);
        }

        public int hashCode() {
            return this.f122887ppxfxbqfkf.hashCode();
        }

        public String toString() {
            return "OpenProductsSetAnalyticsEvent(productsSetName=" + this.f122887ppxfxbqfkf + ")";
        }

        @Override // wm0.iobyxmoadg
        public Map zoijcleaow() {
            return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("set_title", this.f122887ppxfxbqfkf));
        }
    }

    public /* synthetic */ lqeggnwhkg(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    private lqeggnwhkg(String str) {
        super(str);
    }
}
