package ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f96383iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f96384zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f96383iobyxmoadg = productFirst;
            this.f96384zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96383iobyxmoadg, iobyxmoadgVar.f96383iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96384zoijcleaow, iobyxmoadgVar.f96384zoijcleaow);
        }

        public int hashCode() {
            return (this.f96383iobyxmoadg.hashCode() * 31) + this.f96384zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f96383iobyxmoadg;
        }

        public String toString() {
            return "AddComboToBasket(productFirst=" + this.f96383iobyxmoadg + ", productSecond=" + this.f96384zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f96384zoijcleaow;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96385iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
