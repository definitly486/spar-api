package hr1;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import uq1.wflxmlrfwp;

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
            return Boolean.valueOf(obj instanceof bs1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f40986zdlpuopuiu = new zoijcleaow();

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
        ((wflxmlrfwp) adapterDelegateViewBinding.ppxfxbqfkf()).f114204ppxfxbqfkf.setMovementMethod(LinkMovementMethod.getInstance());
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: hr1.ppxfxbqfkf
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
        ShapeableImageView ivIcon = wflxmlrfwpVar.f114206zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.ppxfxbqfkf(ivIcon, ((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), b31.gxszxtbevo.placeholder);
        MaterialTextView tvTitle = wflxmlrfwpVar.f114205wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().length() > 0 ? 0 : 8);
        wflxmlrfwpVar.f114205wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(), 0, null, null));
        wflxmlrfwpVar.f114204ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        MaterialTextView tvDescription = wflxmlrfwpVar.f114204ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility(((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().length() > 0 ? 0 : 8);
        ColorsUiModel colorsUiModelIobyxmoadg = ((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            ColorsUiModel colorsUiModel = ((bs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu() ? colorsUiModelIobyxmoadg : null;
            if (colorsUiModel != null) {
                int iXrmfcynszj = colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
                wflxmlrfwpVar.f114205wkgbmnqykc.setTextColor(iXrmfcynszj);
                wflxmlrfwpVar.f114204ppxfxbqfkf.setTextColor(iXrmfcynszj);
                wflxmlrfwpVar.f114204ppxfxbqfkf.setLinkTextColor(colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: hr1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: hr1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f40986zdlpuopuiu);
    }
}
