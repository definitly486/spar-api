package y22;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f123651ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f123652wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        public boolean iobyxmoadg(Object oldItem, Object newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        public boolean zoijcleaow(Object oldItem, Object newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return (oldItem instanceof ScanGoProductUiModel) && (newItem instanceof ScanGoProductUiModel) && ((ScanGoProductUiModel) oldItem).getId() == ((ScanGoProductUiModel) newItem).getId();
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public gxszxtbevo(final tg.draadjrbmk draadjrbmkVar) {
        super(f123652wkgbmnqykc);
        this.f27903iobyxmoadg.ppxfxbqfkf(new draadjrbmk(new tg.draadjrbmk() { // from class: y22.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(draadjrbmkVar, this, ((Integer) obj).intValue());
            }
        })).ppxfxbqfkf(vdvldrhtss.wkgbmnqykc()).ppxfxbqfkf(wkgbmnqykc.wkgbmnqykc()).ppxfxbqfkf(btonecajqb.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar, int i13) {
        if (draadjrbmkVar != null) {
            Object obj = gxszxtbevoVar.ppxfxbqfkf().get(i13);
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel");
            draadjrbmkVar.invoke((ScanGoProductUiModel) obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
