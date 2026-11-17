package da0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.data.common.MockConstants;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f27259iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27260jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27261yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f27262zdlpuopuiu;

        public eablkybsjg(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f27262zdlpuopuiu = jpowsppfyaVar;
            this.f27261yggfygwlhe = j13;
            this.f27260jyumaefscl = draadjrbmkVar;
            this.f27259iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f27262zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27261yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f27260jyumaefscl.invoke(this.f27259iwizpuwonk.eablkybsjg());
        }
    }

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
            return Boolean.valueOf(obj instanceof o90.wkgbmnqykc);
        }
    }

    public static final class ppxfxbqfkf implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f27263iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27264zoijcleaow;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f27263iobyxmoadg = iobyxmoadgVar;
            this.f27264zoijcleaow = draadjrbmkVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
            o90.wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = ((o90.wkgbmnqykc) this.f27263iobyxmoadg.eablkybsjg()).eablkybsjg();
            o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVarEablkybsjg instanceof o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ? (o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVarEablkybsjg : null;
            if (ppxfxbqfkfVar != null) {
                tg.draadjrbmk draadjrbmkVar = this.f27264zoijcleaow;
                ef.iobyxmoadg iobyxmoadgVar = this.f27263iobyxmoadg;
                if (ppxfxbqfkfVar.zoijcleaow()) {
                    return;
                }
                ppxfxbqfkfVar.ppxfxbqfkf(true);
                draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f27265iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27266jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27267yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f27268zdlpuopuiu;

        public wkgbmnqykc(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f27268zdlpuopuiu = jpowsppfyaVar;
            this.f27267yggfygwlhe = j13;
            this.f27266jyumaefscl = draadjrbmkVar;
            this.f27265iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f27268zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27267yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f27266jyumaefscl.invoke(this.f27265iwizpuwonk.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f27269zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(y90.gtknphoqwx gtknphoqwxVar, ValueAnimator it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        LottieAnimationView lottieAnimationView = gtknphoqwxVar.f124193eablkybsjg;
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(y90.gtknphoqwx gtknphoqwxVar, ValueAnimator it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        LottieAnimationView lottieAnimationView = gtknphoqwxVar.f124193eablkybsjg;
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(y90.gtknphoqwx gtknphoqwxVar, ef.iobyxmoadg iobyxmoadgVar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        gtknphoqwxVar.f124194gtknphoqwx.setText(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).rgvfuqvkyq());
        gtknphoqwxVar.f124198nufgyqmvbu.setText(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).ojitshcjhn());
        ImageView ivIcon = gtknphoqwxVar.f124200wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.ppxfxbqfkf(ivIcon, ((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).btonecajqb(), s40.gxszxtbevo.placeholder);
        Group groupTicket = gtknphoqwxVar.f124199ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupTicket, "groupTicket");
        groupTicket.setVisibility(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).vdvldrhtss() ? 0 : 8);
        gtknphoqwxVar.f124192dxjokdxxww.setText(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).gtknphoqwx());
        gtknphoqwxVar.f124190btonecajqb.setText(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).draadjrbmk());
        gtknphoqwxVar.f124193eablkybsjg.setClickable(!(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg() instanceof o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf));
        Button btnAction = gtknphoqwxVar.f124201zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg() != null ? 0 : 8);
        Button button = gtknphoqwxVar.f124201zoijcleaow;
        o90.iobyxmoadg iobyxmoadgVarLqeggnwhkg = ((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg();
        button.setText(iobyxmoadgVarLqeggnwhkg != null ? iobyxmoadgVarLqeggnwhkg.ppxfxbqfkf() : null);
        ColorsUiModel colorsUiModelNufgyqmvbu = ((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu();
        if (colorsUiModelNufgyqmvbu != null) {
            ColorStateList colorStateListOkpsazkaxt = colorsUiModelNufgyqmvbu.okpsazkaxt(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
            int iWypolnanlu = colorsUiModelNufgyqmvbu.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
            ColorStateList colorStateListOkpsazkaxt2 = colorsUiModelNufgyqmvbu.okpsazkaxt(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY);
            gtknphoqwxVar.f124201zoijcleaow.setTextColor(iWypolnanlu);
            gtknphoqwxVar.f124201zoijcleaow.setBackgroundTintList(colorStateListOkpsazkaxt);
            gtknphoqwxVar.f124190btonecajqb.setTextColor(colorStateListOkpsazkaxt);
            gtknphoqwxVar.f124191draadjrbmk.setBackgroundTintList(colorStateListOkpsazkaxt2);
        }
        o90.wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = ((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg();
        if (iobyxmoadgVarEablkybsjg instanceof o90.wkgbmnqykc.iobyxmoadg.C1565iobyxmoadg) {
            valueAnimator.cancel();
            valueAnimator2.cancel();
            gtknphoqwxVar.f124193eablkybsjg.setProgress(0.0f);
        } else if (iobyxmoadgVarEablkybsjg instanceof o90.wkgbmnqykc.iobyxmoadg.zoijcleaow) {
            valueAnimator.start();
        } else {
            if (!(iobyxmoadgVarEablkybsjg instanceof o90.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((o90.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg().iobyxmoadg()) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            valueAnimator2.setFloatValues(((Float) animatedValue).floatValue(), 1.0f);
            valueAnimator.cancel();
            valueAnimator2.start();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk onAnimationClicked, final tg.draadjrbmk onScratchFinished, final tg.draadjrbmk onButtonClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAnimationClicked, "onAnimationClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onScratchFinished, "onScratchFinished");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onButtonClicked, "onButtonClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: da0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: da0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onAnimationClicked, onButtonClicked, onScratchFinished, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f27269zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y90.gtknphoqwx lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        y90.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = y90.gtknphoqwx.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarPpxfxbqfkf, "inflate(...)");
        return gtknphoqwxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final y90.gtknphoqwx gtknphoqwxVar = (y90.gtknphoqwx) adapterDelegateViewBinding.ppxfxbqfkf();
        LottieAnimationView lavTicket = gtknphoqwxVar.f124193eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lavTicket, "lavTicket");
        lavTicket.setOnClickListener(new wkgbmnqykc(new kotlin.jvm.internal.jpowsppfya(), 400L, draadjrbmkVar, adapterDelegateViewBinding));
        Button btnAction = gtknphoqwxVar.f124201zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setOnClickListener(new eablkybsjg(new kotlin.jvm.internal.jpowsppfya(), 400L, draadjrbmkVar2, adapterDelegateViewBinding));
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(adapterDelegateViewBinding, draadjrbmkVar3);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3333f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(750L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: da0.ppxfxbqfkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gxszxtbevo.dxjokdxxww(gtknphoqwxVar, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.3333f, 1.0f);
        valueAnimatorOfFloat2.setDuration(MockConstants.TWO_SECONDS_DELAY);
        valueAnimatorOfFloat2.addListener(ppxfxbqfkfVar);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: da0.wkgbmnqykc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gxszxtbevo.btonecajqb(gtknphoqwxVar, valueAnimator);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: da0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(gtknphoqwxVar, adapterDelegateViewBinding, valueAnimatorOfFloat, valueAnimatorOfFloat2, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
