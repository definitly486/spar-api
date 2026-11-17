package kk;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class uz extends ba0 {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final kb0 f58922ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f58923zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(boolean z13, kb0 cardPositionListener) {
        super(py.f58121zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardPositionListener, "cardPositionListener");
        this.f58923zoijcleaow = z13;
        this.f58922ppxfxbqfkf = cardPositionListener;
    }

    public static final void eablkybsjg(uz this$0, l6 item, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "$item");
        this$0.f58922ppxfxbqfkf.invoke(item);
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        l6 l6Var = (l6) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(l6Var, "<this>");
        return Integer.valueOf(l6Var.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof l6;
    }

    @Override // kk.ba0
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public final void zoijcleaow(m0 m0Var, final l6 item) {
        String string;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(m0Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        Context context = m0Var.f57568zoijcleaow.getContext();
        CardView spayRicsCvCardItem = m0Var.f57567wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spayRicsCvCardItem, "spayRicsCvCardItem");
        int i13 = item.f57398gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayRicsCvCardItem, "<this>");
        String quantityString = null;
        spayRicsCvCardItem.setCardBackgroundColor(i1.nufgyqmvbu.wkgbmnqykc(spayRicsCvCardItem.getResources(), i13, null));
        AppCompatImageView spayRicsIvStatus = m0Var.f57561eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spayRicsIvStatus, "spayRicsIvStatus");
        int i14 = item.f57397draadjrbmk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayRicsIvStatus, "<this>");
        spayRicsIvStatus.setImageResource(i14);
        AppCompatTextView appCompatTextView = m0Var.f57564lqeggnwhkg;
        vu vuVar = item.f57403vdvldrhtss;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
        appCompatTextView.setText(zv.iobyxmoadg(vuVar, context));
        AppCompatTextView appCompatTextView2 = m0Var.f57562gxszxtbevo;
        if (item.gxszxtbevo() != null) {
            Integer num = item.f57395agtfadlqog;
            if (num != null) {
                quantityString = context.getResources().getQuantityString(num.intValue(), qa0.iobyxmoadg(item.f57402rgvfuqvkyq), Integer.valueOf(qa0.iobyxmoadg(item.f57402rgvfuqvkyq)));
            }
            string = item.f57406zdlpuopuiu ? context.getString(item.f57404wflxmlrfwp, item.f57400ojitshcjhn, quantityString) : context.getString(item.f57404wflxmlrfwp, item.f57401oxmwwwfdhm, item.f57400ojitshcjhn, quantityString);
        } else {
            string = item.f57406zdlpuopuiu ? context.getString(item.f57404wflxmlrfwp, item.f57400ojitshcjhn) : context.getString(item.f57404wflxmlrfwp, item.f57401oxmwwwfdhm, item.f57400ojitshcjhn);
        }
        appCompatTextView2.setText(string);
        m0Var.f57568zoijcleaow.a(item.f57399kcexrzcfyt);
        m0Var.f57565nufgyqmvbu.a(qa0.iobyxmoadg(item.f57405yggfygwlhe), this.f58923zoijcleaow);
        ConstraintLayout constraintLayout = m0Var.f57566ppxfxbqfkf;
        constraintLayout.setClickable(true);
        constraintLayout.setFocusable(true);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: kk.tz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uz.eablkybsjg(this.f58732zdlpuopuiu, item, view);
            }
        });
    }
}
