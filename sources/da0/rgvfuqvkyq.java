package da0;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.sopmlzcsov;
import java.util.List;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rgvfuqvkyq {

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
            return Boolean.valueOf(obj instanceof yggfygwlhe.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f27286zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn btonecajqb(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ColorStateList colorStateListOkpsazkaxt = ((yggfygwlhe.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().okpsazkaxt(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        ColorStateList colorStateListOkpsazkaxt2 = ((yggfygwlhe.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().okpsazkaxt(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY);
        y90.ppxfxbqfkf ppxfxbqfkfVar = (y90.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf();
        ppxfxbqfkfVar.getRoot().setBackgroundTintList(colorStateListOkpsazkaxt2);
        ppxfxbqfkfVar.f124215wkgbmnqykc.setBackgroundTintList(colorStateListOkpsazkaxt);
        TextView textView = ppxfxbqfkfVar.f124216zoijcleaow;
        textView.setText(((yggfygwlhe.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        textView.setTextColor(colorStateListOkpsazkaxt);
        LottieAnimationView lvCopyToCheck = ppxfxbqfkfVar.f124214ppxfxbqfkf.f65543zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lvCopyToCheck, "lvCopyToCheck");
        eablkybsjg(lvCopyToCheck, colorStateListOkpsazkaxt.getDefaultColor());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(LottieAnimationView lottieAnimationView, tg.iobyxmoadg iobyxmoadgVar, View view) {
        lottieAnimationView.yggfygwlhe();
        iobyxmoadgVar.invoke();
    }

    private static final void eablkybsjg(LottieAnimationView lottieAnimationView, int i13) {
        sopmlzcsov sopmlzcsovVar = new sopmlzcsov(i13);
        lottieAnimationView.dxjokdxxww(new o7.eablkybsjg("**"), com.airbnb.lottie.dsvhmnatus.f20367hcddaimhww, new w7.ppxfxbqfkf(sopmlzcsovVar));
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.iobyxmoadg promoCodeCopyClickListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCodeCopyClickListener, "promoCodeCopyClickListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: da0.draadjrbmk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return rgvfuqvkyq.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: da0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.nufgyqmvbu(promoCodeCopyClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f27286zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y90.ppxfxbqfkf lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        y90.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = y90.ppxfxbqfkf.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(final tg.iobyxmoadg iobyxmoadgVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final LottieAnimationView lottieAnimationView = ((y90.ppxfxbqfkf) adapterDelegateViewBinding.ppxfxbqfkf()).f124214ppxfxbqfkf.f65543zoijcleaow;
        lottieAnimationView.setOnClickListener(new View.OnClickListener() { // from class: da0.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rgvfuqvkyq.dxjokdxxww(lottieAnimationView, iobyxmoadgVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: da0.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.btonecajqb(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
