package su;

import androidx.recyclerview.widget.nufgyqmvbu;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.ProductAdapterPayload;
import ru.myspar.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final nufgyqmvbu.gxszxtbevo f108565iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(ProductUiModel oldItem, ProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public List ppxfxbqfkf(ProductUiModel oldItem, ProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.getIsFavorite() != newItem.getIsFavorite()) {
                arrayList.add(ProductAdapterPayload.FavoriteChanged.f86193zdlpuopuiu);
            }
            if (oldItem.getFavoriteEnabledState() != newItem.getFavoriteEnabledState()) {
                arrayList.add(ProductAdapterPayload.FavoriteEnabledStateChanged.f86194zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getMeasureTypeModel().getCurrentMeasure().getValue(), newItem.getMeasureTypeModel().getCurrentMeasure().getValue())) {
                arrayList.add(ProductAdapterPayload.MeasureTypeToggleChanged.f86196zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getCounterModel(), newItem.getCounterModel())) {
                arrayList.add(ProductAdapterPayload.CounterChanged.f86192zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getHints(), newItem.getHints())) {
                arrayList.add(ProductAdapterPayload.HintChanged.f86195zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getIsSelected(), newItem.getIsSelected())) {
                arrayList.add(new ProductAdapterPayload.SelectableChanged(newItem.getIsSelected()));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(ProductUiModel oldItem, ProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final nufgyqmvbu.gxszxtbevo iobyxmoadg() {
        return f108565iobyxmoadg;
    }
}
