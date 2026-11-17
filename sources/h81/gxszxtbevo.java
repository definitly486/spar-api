package h81;

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
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f39847iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f39848jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f39849yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f39850zdlpuopuiu;

        public eablkybsjg(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f39850zdlpuopuiu = jpowsppfyaVar;
            this.f39849yggfygwlhe = j13;
            this.f39848jyumaefscl = draadjrbmkVar;
            this.f39847iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f39850zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f39849yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f39848jyumaefscl.invoke(this.f39847iwizpuwonk.eablkybsjg());
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
            return Boolean.valueOf(obj instanceof s71.wkgbmnqykc);
        }
    }

    public static final class ppxfxbqfkf implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f39851iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f39852zoijcleaow;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f39851iobyxmoadg = iobyxmoadgVar;
            this.f39852zoijcleaow = draadjrbmkVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
            s71.wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = ((s71.wkgbmnqykc) this.f39851iobyxmoadg.eablkybsjg()).eablkybsjg();
            s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVarEablkybsjg instanceof s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ? (s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVarEablkybsjg : null;
            if (ppxfxbqfkfVar != null) {
                tg.draadjrbmk draadjrbmkVar = this.f39852zoijcleaow;
                ef.iobyxmoadg iobyxmoadgVar = this.f39851iobyxmoadg;
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
        final /* synthetic */ ef.iobyxmoadg f39853iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f39854jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f39855yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f39856zdlpuopuiu;

        public wkgbmnqykc(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f39856zdlpuopuiu = jpowsppfyaVar;
            this.f39855yggfygwlhe = j13;
            this.f39854jyumaefscl = draadjrbmkVar;
            this.f39853iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f39856zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f39855yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f39854jyumaefscl.invoke(this.f39853iwizpuwonk.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39857zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(c81.gtknphoqwx gtknphoqwxVar, ValueAnimator it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        LottieAnimationView lottieAnimationView = gtknphoqwxVar.f19223eablkybsjg;
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(c81.gtknphoqwx gtknphoqwxVar, ValueAnimator it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        LottieAnimationView lottieAnimationView = gtknphoqwxVar.f19223eablkybsjg;
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(c81.gtknphoqwx gtknphoqwxVar, ef.iobyxmoadg iobyxmoadgVar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        gtknphoqwxVar.f19224gtknphoqwx.setText(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).rgvfuqvkyq());
        gtknphoqwxVar.f19228nufgyqmvbu.setText(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).ojitshcjhn());
        ImageView ivIcon = gtknphoqwxVar.f19230wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.ppxfxbqfkf(ivIcon, ((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).btonecajqb(), b31.gxszxtbevo.placeholder);
        Group groupTicket = gtknphoqwxVar.f19229ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupTicket, "groupTicket");
        groupTicket.setVisibility(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).vdvldrhtss() ? 0 : 8);
        gtknphoqwxVar.f19222dxjokdxxww.setText(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).gtknphoqwx());
        gtknphoqwxVar.f19220btonecajqb.setText(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).draadjrbmk());
        gtknphoqwxVar.f19223eablkybsjg.setClickable(!(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg() instanceof s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf));
        Button btnAction = gtknphoqwxVar.f19231zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg() != null ? 0 : 8);
        Button button = gtknphoqwxVar.f19231zoijcleaow;
        s71.iobyxmoadg iobyxmoadgVarLqeggnwhkg = ((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg();
        button.setText(iobyxmoadgVarLqeggnwhkg != null ? iobyxmoadgVarLqeggnwhkg.ppxfxbqfkf() : null);
        ColorsUiModel colorsUiModelNufgyqmvbu = ((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu();
        if (colorsUiModelNufgyqmvbu != null) {
            ColorStateList colorStateListV = colorsUiModelNufgyqmvbu.V(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
            int iXrmfcynszj = colorsUiModelNufgyqmvbu.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
            ColorStateList colorStateListV2 = colorsUiModelNufgyqmvbu.V(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.SECONDARY);
            gtknphoqwxVar.f19231zoijcleaow.setTextColor(iXrmfcynszj);
            gtknphoqwxVar.f19231zoijcleaow.setBackgroundTintList(colorStateListV);
            gtknphoqwxVar.f19220btonecajqb.setTextColor(colorStateListV);
            gtknphoqwxVar.f19221draadjrbmk.setBackgroundTintList(colorStateListV2);
        }
        s71.wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = ((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg();
        if (iobyxmoadgVarEablkybsjg instanceof s71.wkgbmnqykc.iobyxmoadg.C2573iobyxmoadg) {
            valueAnimator.cancel();
            valueAnimator2.cancel();
            gtknphoqwxVar.f19223eablkybsjg.setProgress(0.0f);
        } else if (iobyxmoadgVarEablkybsjg instanceof s71.wkgbmnqykc.iobyxmoadg.zoijcleaow) {
            valueAnimator.start();
        } else {
            if (!(iobyxmoadgVarEablkybsjg instanceof s71.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((s71.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg().iobyxmoadg()) {
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
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h81.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h81.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onAnimationClicked, onButtonClicked, onScratchFinished, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39857zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c81.gtknphoqwx lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        c81.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = c81.gtknphoqwx.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarPpxfxbqfkf, "inflate(...)");
        return gtknphoqwxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final c81.gtknphoqwx gtknphoqwxVar = (c81.gtknphoqwx) adapterDelegateViewBinding.ppxfxbqfkf();
        LottieAnimationView lavTicket = gtknphoqwxVar.f19223eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lavTicket, "lavTicket");
        lavTicket.setOnClickListener(new wkgbmnqykc(new kotlin.jvm.internal.jpowsppfya(), 400L, draadjrbmkVar, adapterDelegateViewBinding));
        Button btnAction = gtknphoqwxVar.f19231zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setOnClickListener(new eablkybsjg(new kotlin.jvm.internal.jpowsppfya(), 400L, draadjrbmkVar2, adapterDelegateViewBinding));
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(adapterDelegateViewBinding, draadjrbmkVar3);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3333f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(750L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h81.ppxfxbqfkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gxszxtbevo.dxjokdxxww(gtknphoqwxVar, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.3333f, 1.0f);
        valueAnimatorOfFloat2.setDuration(MockConstants.TWO_SECONDS_DELAY);
        valueAnimatorOfFloat2.addListener(ppxfxbqfkfVar);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h81.wkgbmnqykc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gxszxtbevo.btonecajqb(gtknphoqwxVar, valueAnimator);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h81.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(gtknphoqwxVar, adapterDelegateViewBinding, valueAnimatorOfFloat, valueAnimatorOfFloat2, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
