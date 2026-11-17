package ru.myspar.proloyalty.legacy.presentation.view.promotion;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import i1.nufgyqmvbu;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import p41.eablkybsjg;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.legacy.presentation.view.promotion.PromoView;
import tg.iobyxmoadg;
import vk0.lqeggnwhkg;
import z41.eslsurpljm;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/promotion/PromoView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwa1/iobyxmoadg;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "setProduct", "(Lwa1/iobyxmoadg;)V", "Lkotlin/Function0;", "block", "setOnRewardClickListener", "(Ltg/iobyxmoadg;)V", "Lz41/eslsurpljm;", "zdlpuopuiu", "Lz41/eslsurpljm;", "binding", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoView extends CardView {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private eslsurpljm binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(iobyxmoadg iobyxmoadgVar, View view) {
        iobyxmoadgVar.invoke();
    }

    public final void setOnRewardClickListener(final iobyxmoadg block) {
        zdlpuopuiu.btonecajqb(block, "block");
        this.binding.f127975zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: hc1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoView.zoijcleaow(block, view);
            }
        });
    }

    public final void setProduct(wa1.iobyxmoadg model) {
        zdlpuopuiu.btonecajqb(model, "model");
        eslsurpljm eslsurpljmVar = this.binding;
        String string = getContext().getString(lqeggnwhkg.proloyalty_format_forward_slash, model.vdvldrhtss());
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        Price priceWflxmlrfwp = model.wflxmlrfwp();
        Typeface typefaceCreate = Typeface.create(nufgyqmvbu.dxjokdxxww(getContext(), b31.lqeggnwhkg.cera_round_bold), 0);
        zdlpuopuiu.dxjokdxxww(typefaceCreate, "create(...)");
        CharSequence charSequencePpxfxbqfkf = priceWflxmlrfwp.ppxfxbqfkf(string, typefaceCreate);
        AppCompatImageView ivPromo = eslsurpljmVar.f127968eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivPromo, "ivPromo");
        eablkybsjg.zoijcleaow(ivPromo, model.gxszxtbevo());
        eslsurpljmVar.f127969gxszxtbevo.setText(model.lqeggnwhkg());
        Group groupPrice = eslsurpljmVar.f127974wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(groupPrice, "groupPrice");
        groupPrice.setVisibility(model.draadjrbmk() ? 0 : 8);
        MaterialTextView materialTextView = eslsurpljmVar.f127971lqeggnwhkg;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        MaterialTextView tvOldPrice = eslsurpljmVar.f127971lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(model.dxjokdxxww().length() == 0 ? 4 : 0);
        eslsurpljmVar.f127971lqeggnwhkg.setText(model.dxjokdxxww());
        eslsurpljmVar.f127972nufgyqmvbu.setText(charSequencePpxfxbqfkf);
        MaterialButton btnReward = eslsurpljmVar.f127975zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnReward, "btnReward");
        p41.nufgyqmvbu.eablkybsjg(btnReward, model.iobyxmoadg(), model.iobyxmoadg());
        eslsurpljmVar.f127975zoijcleaow.setEnabled(model.zoijcleaow());
        eslsurpljmVar.f127975zoijcleaow.setText(model.ppxfxbqfkf());
        eslsurpljmVar.f127967dxjokdxxww.setText(model.ojitshcjhn());
        MaterialTextView tvRewardText = eslsurpljmVar.f127967dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(tvRewardText, "tvRewardText");
        tvRewardText.setVisibility(model.rgvfuqvkyq() ? 0 : 4);
    }

    public /* synthetic */ PromoView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        eslsurpljm eslsurpljmVarZoijcleaow = eslsurpljm.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(eslsurpljmVarZoijcleaow, "inflate(...)");
        this.binding = eslsurpljmVarZoijcleaow;
        setRadius(context.getResources().getDimension(b31.eablkybsjg.content_margin_16));
    }
}
