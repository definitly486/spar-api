package no;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg extends mo.iobyxmoadg {

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f70446ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f70447wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String productsSetName, String purchasesListName) {
            super("Добавление набора товаров в список", null);
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            zdlpuopuiu.btonecajqb(purchasesListName, "purchasesListName");
            this.f70446ppxfxbqfkf = productsSetName;
            this.f70447wkgbmnqykc = purchasesListName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f70446ppxfxbqfkf, iobyxmoadgVar.f70446ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f70447wkgbmnqykc, iobyxmoadgVar.f70447wkgbmnqykc);
        }

        public int hashCode() {
            return (this.f70446ppxfxbqfkf.hashCode() * 31) + this.f70447wkgbmnqykc.hashCode();
        }

        public String toString() {
            return "AddToPurchasesList(productsSetName=" + this.f70446ppxfxbqfkf + ", purchasesListName=" + this.f70447wkgbmnqykc + ")";
        }

        @Override // mo.iobyxmoadg
        public Map zoijcleaow() {
            return tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("set_title", this.f70446ppxfxbqfkf), cqumvgiudr.iobyxmoadg("list_name", this.f70447wkgbmnqykc));
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f70448ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productsSetName) {
            super("Открытие набора товаров", null);
            zdlpuopuiu.btonecajqb(productsSetName, "productsSetName");
            this.f70448ppxfxbqfkf = productsSetName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70448ppxfxbqfkf, ((zoijcleaow) obj).f70448ppxfxbqfkf);
        }

        public int hashCode() {
            return this.f70448ppxfxbqfkf.hashCode();
        }

        public String toString() {
            return "OpenProductsSetAnalyticsEvent(productsSetName=" + this.f70448ppxfxbqfkf + ")";
        }

        @Override // mo.iobyxmoadg
        public Map zoijcleaow() {
            return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("set_title", this.f70448ppxfxbqfkf));
        }
    }

    public /* synthetic */ lqeggnwhkg(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    private lqeggnwhkg(String str) {
        super(str);
    }
}
