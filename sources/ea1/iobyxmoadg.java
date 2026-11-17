package ea1;

import androidx.recyclerview.widget.nufgyqmvbu;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.ProductAdapterPayload;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final nufgyqmvbu.gxszxtbevo f31034iobyxmoadg = new C0654iobyxmoadg();

    /* JADX INFO: renamed from: ea1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0654iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        C0654iobyxmoadg() {
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
                arrayList.add(ProductAdapterPayload.FavoriteChanged.f93927zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getMeasureTypeModel().getCurrentMeasure().getValue(), newItem.getMeasureTypeModel().getCurrentMeasure().getValue())) {
                arrayList.add(ProductAdapterPayload.MeasureTypeToggleChanged.f93930zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getCounterModel(), newItem.getCounterModel())) {
                arrayList.add(ProductAdapterPayload.CounterChanged.f93926zdlpuopuiu);
            }
            if (!zdlpuopuiu.eablkybsjg(oldItem.getHints(), newItem.getHints())) {
                arrayList.add(ProductAdapterPayload.HintChanged.f93929zdlpuopuiu);
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
        return f31034iobyxmoadg;
    }
}
