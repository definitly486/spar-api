package cr1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rgvfuqvkyq {

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
            return Boolean.valueOf(obj instanceof zr1.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f25556zdlpuopuiu = new zoijcleaow();

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
    public static final uq1.gtknphoqwx eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = uq1.gtknphoqwx.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarPpxfxbqfkf, "inflate(...)");
        return gtknphoqwxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: cr1.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((uq1.gtknphoqwx) iobyxmoadgVar.ppxfxbqfkf()).f114165zoijcleaow.setText(t1.zoijcleaow.iobyxmoadg(((zr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        ColorsUiModel colorsUiModelIobyxmoadg = ((zr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            ColorsUiModel colorsUiModel = ((zr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? colorsUiModelIobyxmoadg : null;
            if (colorsUiModel != null) {
                ((uq1.gtknphoqwx) iobyxmoadgVar.ppxfxbqfkf()).f114165zoijcleaow.setTextColor(Integer.valueOf(colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY)).intValue());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: cr1.wflxmlrfwp
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return rgvfuqvkyq.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: cr1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f25556zdlpuopuiu);
    }
}
