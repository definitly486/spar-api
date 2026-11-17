package ab0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lj.btonecajqb;
import lj.wflxmlrfwp;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.models.ComboSetSelectProductUiModel;
import s40.gxszxtbevo;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
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
            return Boolean.valueOf(obj instanceof ComboSetSelectProductUiModel);
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f1285yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f1286zdlpuopuiu;

        public static final class iobyxmoadg implements draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f1287zdlpuopuiu = new iobyxmoadg();

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ComboSetSelectProductUiModel);
            }
        }

        public ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f1286zdlpuopuiu = iobyxmoadgVar;
            this.f1285yggfygwlhe = iobyxmoadgVar2;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List payloads) {
            zdlpuopuiu.btonecajqb(payloads, "payloads");
            btonecajqb btonecajqbVarIstkbnxepw = wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(payloads), iobyxmoadg.f1287zdlpuopuiu);
            zdlpuopuiu.nufgyqmvbu(btonecajqbVarIstkbnxepw, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Object objLmojexxdyd = wflxmlrfwp.lmojexxdyd(btonecajqbVarIstkbnxepw);
            if (objLmojexxdyd == null) {
                wkgbmnqykc.btonecajqb(this.f1286zdlpuopuiu);
            } else {
                wkgbmnqykc.gtknphoqwx(this.f1285yggfygwlhe, (ComboSetSelectProductUiModel) objLmojexxdyd);
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f1288zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar) {
        m60.ppxfxbqfkf ppxfxbqfkfVar = (m60.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf();
        ImageView ivProductImage = ppxfxbqfkfVar.f65911zoijcleaow.f65514zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivProductImage, "ivProductImage");
        c60.wkgbmnqykc.ppxfxbqfkf(ivProductImage, ((ComboSetSelectProductUiModel) iobyxmoadgVar.eablkybsjg()).getProduct().getImageUrl(), gxszxtbevo.placeholder);
        ppxfxbqfkfVar.f65908lqeggnwhkg.setText(((ComboSetSelectProductUiModel) iobyxmoadgVar.eablkybsjg()).getProduct().getName());
        ppxfxbqfkfVar.f65910wkgbmnqykc.setPrice(((ComboSetSelectProductUiModel) iobyxmoadgVar.eablkybsjg()).getProduct().getPrice());
        ppxfxbqfkfVar.f65909ppxfxbqfkf.setImageResource(((ComboSetSelectProductUiModel) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((ComboSetSelectProductUiModel) iobyxmoadgVar.eablkybsjg()).getProduct());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, ComboSetSelectProductUiModel comboSetSelectProductUiModel) {
        ((m60.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).f65909ppxfxbqfkf.setImageResource(comboSetSelectProductUiModel.zoijcleaow());
    }

    public static final df.zoijcleaow gxszxtbevo(final draadjrbmk onSelectProduct) {
        zdlpuopuiu.btonecajqb(onSelectProduct, "onSelectProduct");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ab0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: ab0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(onSelectProduct, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f1288zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.ppxfxbqfkf lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        m60.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = m60.ppxfxbqfkf.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: ab0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.dxjokdxxww(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new ppxfxbqfkf(adapterDelegateViewBinding, adapterDelegateViewBinding));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
