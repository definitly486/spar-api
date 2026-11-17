package fc0;

import androidx.recyclerview.widget.nufgyqmvbu;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.ProductAdapterPayload;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final nufgyqmvbu.gxszxtbevo f33410iobyxmoadg = new C0736iobyxmoadg();

    /* JADX INFO: renamed from: fc0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0736iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        C0736iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(CartProductUiModel oldItem, CartProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public List ppxfxbqfkf(CartProductUiModel oldItem, CartProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.getIsFavorite() != newItem.getIsFavorite()) {
                arrayList.add(ProductAdapterPayload.FavoriteChanged.f86193zdlpuopuiu);
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
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(CartProductUiModel oldItem, CartProductUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final nufgyqmvbu.gxszxtbevo iobyxmoadg() {
        return f33410iobyxmoadg;
    }
}
