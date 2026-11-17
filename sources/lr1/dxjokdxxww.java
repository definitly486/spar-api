package lr1;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import uq1.iwizpuwonk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {

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
            return Boolean.valueOf(obj instanceof js1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f63928zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn agtfadlqog(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            dxjokdxxww(iobyxmoadgVar, (js1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        } else {
            gtknphoqwx(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, js1.iobyxmoadg iobyxmoadgVar2) {
        MaterialTextView tvAnswer = ((iwizpuwonk) iobyxmoadgVar.ppxfxbqfkf()).f114174ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvAnswer, "tvAnswer");
        tvAnswer.setVisibility(iobyxmoadgVar2.dxjokdxxww() ? 0 : 8);
        ((iwizpuwonk) iobyxmoadgVar.ppxfxbqfkf()).f114176zoijcleaow.setRotation(iobyxmoadgVar2.dxjokdxxww() ? 180.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
        }
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, js1.iobyxmoadg iobyxmoadgVar2) {
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) iobyxmoadgVar.ppxfxbqfkf();
        iwizpuwonkVar.f114175wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(iobyxmoadgVar2.nufgyqmvbu(), 0, null, null));
        iwizpuwonkVar.f114174ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(iobyxmoadgVar2.eablkybsjg(), 0, null, null));
        btonecajqb(iobyxmoadgVar, iobyxmoadgVar2);
        ColorsUiModel colorsUiModelLqeggnwhkg = iobyxmoadgVar2.lqeggnwhkg();
        if (colorsUiModelLqeggnwhkg != null) {
            ColorsUiModel colorsUiModel = iobyxmoadgVar2.btonecajqb() ? colorsUiModelLqeggnwhkg : null;
            if (colorsUiModel != null) {
                int iIntValue = Integer.valueOf(colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY)).intValue();
                iwizpuwonkVar.f114175wkgbmnqykc.setTextColor(iIntValue);
                iwizpuwonkVar.f114174ppxfxbqfkf.setTextColor(iIntValue);
                iwizpuwonkVar.f114176zoijcleaow.setImageTintList(ColorStateList.valueOf(iIntValue));
            }
        }
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof lr1.iobyxmoadg.C1315iobyxmoadg) {
                    btonecajqb(iobyxmoadgVar, (js1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk questionClickListener) {
        zdlpuopuiu.btonecajqb(questionClickListener, "questionClickListener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: lr1.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: lr1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.nufgyqmvbu(questionClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f63928zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iwizpuwonk lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        iwizpuwonk iwizpuwonkVarPpxfxbqfkf = iwizpuwonk.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(iwizpuwonkVarPpxfxbqfkf, "inflate(...)");
        return iwizpuwonkVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((iwizpuwonk) adapterDelegateViewBinding.ppxfxbqfkf()).f114176zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: lr1.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((iwizpuwonk) adapterDelegateViewBinding.ppxfxbqfkf()).f114175wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: lr1.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.wflxmlrfwp(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: lr1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.agtfadlqog(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
        }
    }
}
