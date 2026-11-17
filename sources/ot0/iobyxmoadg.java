package ot0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg extends jt0.zoijcleaow {

    /* JADX INFO: renamed from: ot0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1620iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final ColorsUiModel.Hex f74700iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final List f74701jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f74702yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f74703zdlpuopuiu;

        public C1620iobyxmoadg(String id2, String title, List products, ColorsUiModel.Hex hex) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(products, "products");
            this.f74703zdlpuopuiu = id2;
            this.f74702yggfygwlhe = title;
            this.f74701jyumaefscl = products;
            this.f74700iwizpuwonk = hex;
        }

        @Override // ot0.iobyxmoadg
        public ColorsUiModel.Hex eablkybsjg() {
            return this.f74700iwizpuwonk;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1620iobyxmoadg)) {
                return false;
            }
            C1620iobyxmoadg c1620iobyxmoadg = (C1620iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f74703zdlpuopuiu, c1620iobyxmoadg.f74703zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f74702yggfygwlhe, c1620iobyxmoadg.f74702yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f74701jyumaefscl, c1620iobyxmoadg.f74701jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f74700iwizpuwonk, c1620iobyxmoadg.f74700iwizpuwonk);
        }

        public int hashCode() {
            int iHashCode = ((((this.f74703zdlpuopuiu.hashCode() * 31) + this.f74702yggfygwlhe.hashCode()) * 31) + this.f74701jyumaefscl.hashCode()) * 31;
            ColorsUiModel.Hex hex = this.f74700iwizpuwonk;
            return iHashCode + (hex == null ? 0 : hex.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f74703zdlpuopuiu;
        }

        public final String ppxfxbqfkf() {
            return this.f74702yggfygwlhe;
        }

        public String toString() {
            return "Filled(id=" + this.f74703zdlpuopuiu + ", title=" + this.f74702yggfygwlhe + ", products=" + this.f74701jyumaefscl + ", colorsUiModel=" + this.f74700iwizpuwonk + ")";
        }

        public final List zoijcleaow() {
            return this.f74701jyumaefscl;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ColorsUiModel.Hex f74704zdlpuopuiu;

        public zoijcleaow(ColorsUiModel.Hex hex) {
            this.f74704zdlpuopuiu = hex;
        }

        @Override // ot0.iobyxmoadg
        public ColorsUiModel.Hex eablkybsjg() {
            return this.f74704zdlpuopuiu;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f74704zdlpuopuiu, ((zoijcleaow) obj).f74704zdlpuopuiu);
        }

        public int hashCode() {
            ColorsUiModel.Hex hex = this.f74704zdlpuopuiu;
            if (hex == null) {
                return 0;
            }
            return hex.hashCode();
        }

        public String toString() {
            return "Shimmer(colorsUiModel=" + this.f74704zdlpuopuiu + ")";
        }
    }

    ColorsUiModel.Hex eablkybsjg();
}
