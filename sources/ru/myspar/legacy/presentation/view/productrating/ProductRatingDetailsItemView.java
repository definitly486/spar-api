package ru.myspar.legacy.presentation.view.productrating;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import le0.wkgbmnqykc;
import m60.z;
import mj.kcexrzcfyt;
import qb0.ppxfxbqfkf;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.legacy.presentation.view.productrating.ProductRatingDetailsItemView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R$\u00103\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lru/myspar/legacy/presentation/view/productrating/ProductRatingDetailsItemView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "itemId", "Lgg/wwaezpbzkn;", "wflxmlrfwp", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "startHeight", "finishHeight", "btonecajqb", "(Landroid/view/View;IILjava/lang/String;)V", "", "fromDegrees", "toDegrees", "agtfadlqog", "(FF)V", "Lqb0/ppxfxbqfkf;", "data", "Lle0/wkgbmnqykc;", "type", "ojitshcjhn", "(Lqb0/ppxfxbqfkf;Lle0/wkgbmnqykc;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnShowAnswerListener", "(Ltg/draadjrbmk;)V", "setOnAnimatedListener", "Lm60/z;", "zynmafqrjb", "Lm60/z;", "binding", "istkbnxepw", "Ltg/draadjrbmk;", "onShowAnswerListener", "cdpycssgdh", "onAnimatedListener", "value", "yadqdtsiqt", "I", "setCachedHeight", "(I)V", "cachedHeight", "iozdgvuglv", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductRatingDetailsItemView extends MaterialCardView {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f90022lmojexxdyd = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onAnimatedListener;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onShowAnswerListener;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private int cachedHeight;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final z binding;

    public static final class zoijcleaow implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ String f90028zoijcleaow;

        public zoijcleaow(String str) {
            this.f90028zoijcleaow = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            draadjrbmk draadjrbmkVar = ProductRatingDetailsItemView.this.onAnimatedListener;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(this.f90028zoijcleaow);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductRatingDetailsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void agtfadlqog(float fromDegrees, float toDegrees) {
        RotateAnimation rotateAnimation = new RotateAnimation(fromDegrees, toDegrees, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(250L);
        rotateAnimation.setFillAfter(true);
        this.binding.f66185zoijcleaow.startAnimation(rotateAnimation);
    }

    private final void btonecajqb(final View view, int startHeight, final int finishHeight, String itemId) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startHeight, finishHeight);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: le0.ppxfxbqfkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProductRatingDetailsItemView.draadjrbmk(view, finishHeight, valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.start();
        zdlpuopuiu.lqeggnwhkg(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new zoijcleaow(itemId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(View view, int i13, ValueAnimator animation) {
        zdlpuopuiu.btonecajqb(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        view.setAlpha(iIntValue / i13);
        view.getLayoutParams().height = iIntValue;
        view.requestLayout();
    }

    static /* synthetic */ void gtknphoqwx(ProductRatingDetailsItemView productRatingDetailsItemView, View view, int i13, int i14, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = 0;
        }
        productRatingDetailsItemView.btonecajqb(view, i13, i14, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(ProductRatingDetailsItemView productRatingDetailsItemView, z zVar, String str, View view) {
        productRatingDetailsItemView.setCachedHeight(zVar.f66179gxszxtbevo.getMeasuredHeight());
        productRatingDetailsItemView.wflxmlrfwp(str);
    }

    private final void setCachedHeight(int i13) {
        int i14 = this.cachedHeight;
        if (i14 != 0) {
            i13 = i14;
        }
        this.cachedHeight = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(ProductRatingDetailsItemView productRatingDetailsItemView, z zVar, String str, View view) {
        productRatingDetailsItemView.setCachedHeight(zVar.f66179gxszxtbevo.getMeasuredHeight());
        productRatingDetailsItemView.wflxmlrfwp(str);
    }

    private final void wflxmlrfwp(String itemId) {
        draadjrbmk draadjrbmkVar = this.onShowAnswerListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(itemId);
        }
    }

    public final void ojitshcjhn(ppxfxbqfkf data, wkgbmnqykc type) {
        zdlpuopuiu.btonecajqb(data, "data");
        zdlpuopuiu.btonecajqb(type, "type");
        final z zVar = this.binding;
        final String itemId = data.getItemId();
        zVar.f66176btonecajqb.setText(data.draadjrbmk());
        String strNufgyqmvbu = data.nufgyqmvbu();
        if (strNufgyqmvbu != null) {
            zVar.f66177dxjokdxxww.setText(strNufgyqmvbu);
        }
        zVar.f66178eablkybsjg.setRating(data.btonecajqb());
        zVar.f66182nufgyqmvbu.setText(data.lqeggnwhkg());
        zVar.f66182nufgyqmvbu.setMaxLines(type.wkgbmnqykc());
        Group llAnswerBlock = zVar.f66183ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(llAnswerBlock, "llAnswerBlock");
        llAnswerBlock.setVisibility(!kcexrzcfyt.zfvoamnweg(data.iobyxmoadg()) ? 0 : 8);
        TextView tvAnswer = zVar.f66179gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvAnswer, "tvAnswer");
        tvAnswer.setVisibility(!data.wflxmlrfwp() && data.iobyxmoadg().length() > 0 ? 0 : 8);
        TextView tvAnswer2 = zVar.f66179gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvAnswer2, "tvAnswer");
        if (tvAnswer2.getVisibility() == 0 && this.cachedHeight != 0) {
            zVar.f66179gxszxtbevo.getLayoutParams().height = this.cachedHeight;
        }
        zVar.f66179gxszxtbevo.setText(data.iobyxmoadg());
        Integer numWkgbmnqykc = data.wkgbmnqykc();
        if (numWkgbmnqykc != null) {
            zVar.f66181lqeggnwhkg.setText(numWkgbmnqykc.intValue());
        }
        zVar.f66181lqeggnwhkg.setOnClickListener(new View.OnClickListener() { // from class: le0.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductRatingDetailsItemView.rgvfuqvkyq(this.f62197zdlpuopuiu, zVar, itemId, view);
            }
        });
        AppCompatImageView appCompatImageView = zVar.f66185zoijcleaow;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: le0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductRatingDetailsItemView.vdvldrhtss(this.f62207zdlpuopuiu, zVar, itemId, view);
            }
        });
        ColorsUiModel colorsUiModelEablkybsjg = data.eablkybsjg();
        Context context = appCompatImageView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        appCompatImageView.setImageTintList(colorsUiModelEablkybsjg.okpsazkaxt(context, ColorsUiModel.iobyxmoadg.PRIMARY));
        if (data.ojitshcjhn()) {
            if (!data.wflxmlrfwp()) {
                TextView tvAnswer3 = zVar.f66179gxszxtbevo;
                zdlpuopuiu.dxjokdxxww(tvAnswer3, "tvAnswer");
                gtknphoqwx(this, tvAnswer3, 0, this.cachedHeight, itemId, 2, null);
                agtfadlqog(data.dxjokdxxww(), data.gtknphoqwx());
                return;
            }
            TextView tvAnswer4 = zVar.f66179gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvAnswer4, "tvAnswer");
            tvAnswer4.setVisibility(0);
            TextView tvAnswer5 = zVar.f66179gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvAnswer5, "tvAnswer");
            gtknphoqwx(this, tvAnswer5, this.cachedHeight, 0, itemId, 4, null);
            agtfadlqog(data.dxjokdxxww(), data.gtknphoqwx());
        }
    }

    public final void setOnAnimatedListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.onAnimatedListener = listener;
    }

    public final void setOnShowAnswerListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.onShowAnswerListener = listener;
    }

    public /* synthetic */ ProductRatingDetailsItemView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductRatingDetailsItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        z zVarZoijcleaow = z.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(zVarZoijcleaow, "inflate(...)");
        this.binding = zVarZoijcleaow;
        setCardBackgroundColor(c60.zoijcleaow.ppxfxbqfkf(context, da.zoijcleaow.colorSurface));
        setCardElevation(0.0f);
    }
}
