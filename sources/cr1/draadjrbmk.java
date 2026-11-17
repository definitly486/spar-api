package cr1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class draadjrbmk {

    public static final class iobyxmoadg extends jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof zr1.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f25548zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq1.btonecajqb eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.btonecajqb btonecajqbVarPpxfxbqfkf = uq1.btonecajqb.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btonecajqbVarPpxfxbqfkf, "inflate(...)");
        return btonecajqbVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: cr1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((uq1.btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).f114151zoijcleaow.setText(t1.zoijcleaow.iobyxmoadg(((zr1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        ColorsUiModel colorsUiModelIobyxmoadg = ((zr1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            ColorsUiModel colorsUiModel = ((zr1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? colorsUiModelIobyxmoadg : null;
            if (colorsUiModel != null) {
                ((uq1.btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).f114151zoijcleaow.setTextColor(Integer.valueOf(colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY)).intValue());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: cr1.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return draadjrbmk.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: cr1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f25548zdlpuopuiu);
    }
}
