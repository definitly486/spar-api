package gj0;

import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final RecyclerView.jyumaefscl f37683ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C0851zoijcleaow f37682wkgbmnqykc = new C0851zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f37680eablkybsjg = 8;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f37681gxszxtbevo = new iobyxmoadg();

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(ru.ppxfxbqfkf oldItem, ru.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.iobyxmoadg().iobyxmoadg(), newItem.iobyxmoadg().iobyxmoadg());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(ru.ppxfxbqfkf oldItem, ru.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            ru.iobyxmoadg iobyxmoadgVarIobyxmoadg = oldItem.iobyxmoadg();
            ru.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = newItem.iobyxmoadg();
            if (!zdlpuopuiu.eablkybsjg(oldItem.zoijcleaow(), newItem.zoijcleaow()) || iobyxmoadgVarIobyxmoadg.lereixgezr() != iobyxmoadgVarIobyxmoadg2.lereixgezr()) {
                arrayList.add(gtknphoqwx.f37659iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(ru.ppxfxbqfkf oldItem, ru.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    /* JADX INFO: renamed from: gj0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0851zoijcleaow {
        public /* synthetic */ C0851zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0851zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(rgvfuqvkyq onProductClickedByArticle, final rgvfuqvkyq onHintClicked, rgvfuqvkyq onReplaceClicked, tg.draadjrbmk onRemoveClicked) {
        super(f37681gxszxtbevo);
        zdlpuopuiu.btonecajqb(onProductClickedByArticle, "onProductClickedByArticle");
        zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        zdlpuopuiu.btonecajqb(onReplaceClicked, "onReplaceClicked");
        zdlpuopuiu.btonecajqb(onRemoveClicked, "onRemoveClicked");
        RecyclerView.jyumaefscl jyumaefsclVar = new RecyclerView.jyumaefscl();
        this.f37683ppxfxbqfkf = jyumaefsclVar;
        this.f27903iobyxmoadg.ppxfxbqfkf(lqeggnwhkg.eablkybsjg(onProductClickedByArticle, new rgvfuqvkyq() { // from class: gj0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return zoijcleaow.lqeggnwhkg(onHintClicked, (HintUiModel) obj, (ru.iobyxmoadg) obj2);
            }
        }, onReplaceClicked, onRemoveClicked, jyumaefsclVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar, HintUiModel hint, ru.iobyxmoadg product) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(product, "product");
        rgvfuqvkyqVar.invoke(hint, product);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
