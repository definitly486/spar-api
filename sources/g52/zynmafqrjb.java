package g52;

import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zynmafqrjb {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof j62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36361zdlpuopuiu = new zoijcleaow();

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
    public static final b52.vdvldrhtss eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.vdvldrhtss vdvldrhtssVarPpxfxbqfkf = b52.vdvldrhtss.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(vdvldrhtssVarPpxfxbqfkf, "inflate(...)");
        return vdvldrhtssVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.pmvmpeiblj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zynmafqrjb.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((b52.vdvldrhtss) iobyxmoadgVar.ppxfxbqfkf()).f15341zoijcleaow.setText(t1.zoijcleaow.iobyxmoadg(((j62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        Linkify.addLinks(((b52.vdvldrhtss) iobyxmoadgVar.ppxfxbqfkf()).f15341zoijcleaow, 1);
        ((b52.vdvldrhtss) iobyxmoadgVar.ppxfxbqfkf()).f15341zoijcleaow.setMovementMethod(LinkMovementMethod.getInstance());
        ColorsUiModel colorsUiModelIobyxmoadg = ((j62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            ColorsUiModel colorsUiModel = ((j62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? colorsUiModelIobyxmoadg : null;
            if (colorsUiModel != null) {
                ((b52.vdvldrhtss) iobyxmoadgVar.ppxfxbqfkf()).f15341zoijcleaow.setTextColor(colorsUiModel.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY));
                ((b52.vdvldrhtss) iobyxmoadgVar.ppxfxbqfkf()).f15341zoijcleaow.setLinkTextColor(colorsUiModel.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY));
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.esjtqupxsv
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return zynmafqrjb.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zynmafqrjb.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36361zdlpuopuiu);
    }
}
