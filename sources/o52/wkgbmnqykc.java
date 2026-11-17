package o52;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import b52.wflxmlrfwp;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof i62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f72150zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wflxmlrfwp eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = wflxmlrfwp.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarPpxfxbqfkf, "inflate(...)");
        return wflxmlrfwpVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((wflxmlrfwp) adapterDelegateViewBinding.ppxfxbqfkf()).f15343ppxfxbqfkf.setMovementMethod(LinkMovementMethod.getInstance());
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: o52.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivIcon = wflxmlrfwpVar.f15345zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.ppxfxbqfkf(ivIcon, ((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), s40.gxszxtbevo.placeholder);
        MaterialTextView tvTitle = wflxmlrfwpVar.f15344wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().length() > 0 ? 0 : 8);
        wflxmlrfwpVar.f15344wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(), 0, null, null));
        wflxmlrfwpVar.f15343ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        MaterialTextView tvDescription = wflxmlrfwpVar.f15343ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility(((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().length() > 0 ? 0 : 8);
        ColorsUiModel colorsUiModelIobyxmoadg = ((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            ColorsUiModel colorsUiModel = ((i62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu() ? colorsUiModelIobyxmoadg : null;
            if (colorsUiModel != null) {
                int iWypolnanlu = colorsUiModel.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
                wflxmlrfwpVar.f15344wkgbmnqykc.setTextColor(iWypolnanlu);
                wflxmlrfwpVar.f15343ppxfxbqfkf.setTextColor(iWypolnanlu);
                wflxmlrfwpVar.f15343ppxfxbqfkf.setLinkTextColor(colorsUiModel.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: o52.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: o52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f72150zdlpuopuiu);
    }
}
