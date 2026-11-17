package kk;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class m30 extends ba0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f57582zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(boolean z13, tc0 cardPositionListener) {
        super(f20.f56486zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardPositionListener, "cardPositionListener");
        this.f57582zoijcleaow = z13;
    }

    public static final void wkgbmnqykc(ConstraintLayout this_apply, Animation animation, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this_apply.startAnimation(animation);
    }

    @Override // kk.ba0
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public final void zoijcleaow(m0 m0Var, g6 item) {
        String string;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(m0Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        Context context = m0Var.f57568zoijcleaow.getContext();
        int color = androidx.core.content.iobyxmoadg.getColor(context, R.color.spay_listcards_inactive_text_color);
        final Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.spay_shake);
        CardView spayRicsCvCardItem = m0Var.f57567wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spayRicsCvCardItem, "spayRicsCvCardItem");
        int i13 = item.f56652gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayRicsCvCardItem, "<this>");
        String quantityString = null;
        spayRicsCvCardItem.setCardBackgroundColor(i1.nufgyqmvbu.wkgbmnqykc(spayRicsCvCardItem.getResources(), i13, null));
        AppCompatImageView spayRicsIvStatus = m0Var.f57561eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spayRicsIvStatus, "spayRicsIvStatus");
        int i14 = item.f56651draadjrbmk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayRicsIvStatus, "<this>");
        spayRicsIvStatus.setImageResource(i14);
        AppCompatTextView appCompatTextView = m0Var.f57564lqeggnwhkg;
        vu vuVar = item.f56657vdvldrhtss;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
        appCompatTextView.setText(zv.iobyxmoadg(vuVar, context));
        appCompatTextView.setTextColor(color);
        AppCompatTextView appCompatTextView2 = m0Var.f57562gxszxtbevo;
        if (item.gxszxtbevo() != null) {
            Integer num = item.f56649agtfadlqog;
            if (num != null) {
                quantityString = context.getResources().getQuantityString(num.intValue(), qa0.iobyxmoadg(item.f56656rgvfuqvkyq), Integer.valueOf(qa0.iobyxmoadg(item.f56656rgvfuqvkyq)));
            }
            string = item.f56660zdlpuopuiu ? context.getString(item.f56658wflxmlrfwp, item.f56654ojitshcjhn, quantityString) : context.getString(item.f56658wflxmlrfwp, item.f56655oxmwwwfdhm, item.f56654ojitshcjhn, quantityString);
        } else {
            string = item.f56660zdlpuopuiu ? context.getString(item.f56658wflxmlrfwp, item.f56654ojitshcjhn) : context.getString(item.f56658wflxmlrfwp, item.f56655oxmwwwfdhm, item.f56654ojitshcjhn);
        }
        appCompatTextView2.setText(string);
        appCompatTextView2.setTextColor(color);
        CardLogoCompositeView cardLogoCompositeView = m0Var.f57568zoijcleaow;
        cardLogoCompositeView.a(item.f56653kcexrzcfyt);
        cardLogoCompositeView.setAlpha(0.3f);
        m0Var.f57565nufgyqmvbu.a(qa0.iobyxmoadg(item.f56659yggfygwlhe), this.f57582zoijcleaow);
        final ConstraintLayout constraintLayout = m0Var.f57566ppxfxbqfkf;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: kk.l30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m30.wkgbmnqykc(constraintLayout, animationLoadAnimation, view);
            }
        });
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        g6 g6Var = (g6) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(g6Var, "<this>");
        return Integer.valueOf(g6Var.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof g6;
    }
}
