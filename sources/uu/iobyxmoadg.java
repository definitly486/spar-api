package uu;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg extends pu.zoijcleaow {

    /* JADX INFO: renamed from: uu.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2838iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final ColorsUiModel.Hex f114407iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final List f114408jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f114409yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f114410zdlpuopuiu;

        public C2838iobyxmoadg(String id2, String title, List products, ColorsUiModel.Hex hex) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(products, "products");
            this.f114410zdlpuopuiu = id2;
            this.f114409yggfygwlhe = title;
            this.f114408jyumaefscl = products;
            this.f114407iwizpuwonk = hex;
        }

        @Override // uu.iobyxmoadg
        public ColorsUiModel.Hex eablkybsjg() {
            return this.f114407iwizpuwonk;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2838iobyxmoadg)) {
                return false;
            }
            C2838iobyxmoadg c2838iobyxmoadg = (C2838iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f114410zdlpuopuiu, c2838iobyxmoadg.f114410zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f114409yggfygwlhe, c2838iobyxmoadg.f114409yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f114408jyumaefscl, c2838iobyxmoadg.f114408jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f114407iwizpuwonk, c2838iobyxmoadg.f114407iwizpuwonk);
        }

        public int hashCode() {
            int iHashCode = ((((this.f114410zdlpuopuiu.hashCode() * 31) + this.f114409yggfygwlhe.hashCode()) * 31) + this.f114408jyumaefscl.hashCode()) * 31;
            ColorsUiModel.Hex hex = this.f114407iwizpuwonk;
            return iHashCode + (hex == null ? 0 : hex.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f114410zdlpuopuiu;
        }

        public final String ppxfxbqfkf() {
            return this.f114409yggfygwlhe;
        }

        public String toString() {
            return "Filled(id=" + this.f114410zdlpuopuiu + ", title=" + this.f114409yggfygwlhe + ", products=" + this.f114408jyumaefscl + ", colorsUiModel=" + this.f114407iwizpuwonk + ")";
        }

        public final List zoijcleaow() {
            return this.f114408jyumaefscl;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ColorsUiModel.Hex f114411zdlpuopuiu;

        public zoijcleaow(ColorsUiModel.Hex hex) {
            this.f114411zdlpuopuiu = hex;
        }

        @Override // uu.iobyxmoadg
        public ColorsUiModel.Hex eablkybsjg() {
            return this.f114411zdlpuopuiu;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f114411zdlpuopuiu, ((zoijcleaow) obj).f114411zdlpuopuiu);
        }

        public int hashCode() {
            ColorsUiModel.Hex hex = this.f114411zdlpuopuiu;
            if (hex == null) {
                return 0;
            }
            return hex.hashCode();
        }

        public String toString() {
            return "Shimmer(colorsUiModel=" + this.f114411zdlpuopuiu + ")";
        }
    }

    ColorsUiModel.Hex eablkybsjg();
}
