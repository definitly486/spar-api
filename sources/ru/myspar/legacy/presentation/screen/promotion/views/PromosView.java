package ru.myspar.legacy.presentation.screen.promotion.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c60.nufgyqmvbu;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.x;
import ru.myspar.legacy.presentation.screen.promotion.views.PromosView;
import ru.myspar.legacy.presentation.view.promotion.AlphaLayoutManager;
import s40.eablkybsjg;
import s40.gxszxtbevo;
import t40.dxjokdxxww;
import tg.draadjrbmk;
import tg.iobyxmoadg;
import tg.rgvfuqvkyq;
import xc0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/myspar/legacy/presentation/screen/promotion/views/PromosView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzc0/zoijcleaow;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "setData", "(Lzc0/zoijcleaow;)V", "Lkotlin/Function1;", "Lzc0/iobyxmoadg;", "zdlpuopuiu", "Ltg/draadjrbmk;", "getOnProductClicked", "()Ltg/draadjrbmk;", "setOnProductClicked", "(Ltg/draadjrbmk;)V", "onProductClicked", "yggfygwlhe", "getOnActivateClicked", "setOnActivateClicked", "onActivateClicked", "Lkotlin/Function0;", "jyumaefscl", "Ltg/iobyxmoadg;", "getOnForwardClicked", "()Ltg/iobyxmoadg;", "setOnForwardClicked", "(Ltg/iobyxmoadg;)V", "onForwardClicked", "Lm60/x;", "iwizpuwonk", "Lm60/x;", "binding", "Lxc0/ppxfxbqfkf;", "cqumvgiudr", "Lxc0/ppxfxbqfkf;", "adapter", "esjtqupxsv", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromosView extends ConstraintLayout {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f89448lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf adapter;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private x binding;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg onForwardClicked;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onActivateClicked;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onProductClicked;

    public static final class zoijcleaow implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ x f89455zoijcleaow;

        public zoijcleaow(x xVar) {
            this.f89455zoijcleaow = xVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            view.removeOnLayoutChangeListener(this);
            int measuredWidth = (int) ((this.f89455zoijcleaow.f66102zoijcleaow.getMeasuredWidth() / 2.0f) - ((PromosView.this.getResources().getDimensionPixelSize(eablkybsjg.promo_page_width) + (PromosView.this.getResources().getDimensionPixelSize(eablkybsjg.promo_page_margin) * 2.0f)) / 2.0f));
            this.f89455zoijcleaow.f66102zoijcleaow.setPadding(measuredWidth, 0, measuredWidth, 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromosView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(x xVar, zc0.zoijcleaow zoijcleaowVar, List list) {
        int size;
        RecyclerView.rgvfuqvkyq layoutManager = xVar.f66102zoijcleaow.getLayoutManager();
        if (layoutManager != null) {
            Integer numEablkybsjg = zoijcleaowVar.eablkybsjg();
            if (numEablkybsjg != null) {
                size = numEablkybsjg.intValue();
            } else {
                size = (list.size() / 2) + (((Integer.MAX_VALUE / list.size()) / 2) * list.size());
            }
            layoutManager.Q(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(PromosView promosView, View view) {
        iobyxmoadg iobyxmoadgVar = promosView.onForwardClicked;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(PromosView promosView, zc0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = promosView.onActivateClicked;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(PromosView promosView, zc0.iobyxmoadg promotion, int i13) {
        zdlpuopuiu.btonecajqb(promotion, "promotion");
        draadjrbmk draadjrbmkVar = promosView.onProductClicked;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(promotion);
        }
        promosView.binding.f66102zoijcleaow.J(i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final draadjrbmk getOnActivateClicked() {
        return this.onActivateClicked;
    }

    public final iobyxmoadg getOnForwardClicked() {
        return this.onForwardClicked;
    }

    public final draadjrbmk getOnProductClicked() {
        return this.onProductClicked;
    }

    public final void setData(final zc0.zoijcleaow model) {
        zdlpuopuiu.btonecajqb(model, "model");
        final x xVar = this.binding;
        final List listWkgbmnqykc = model.wkgbmnqykc();
        xVar.f66098eablkybsjg.setText(model.ppxfxbqfkf());
        xVar.f66101wkgbmnqykc.setText(model.iobyxmoadg());
        MaterialTextView tvDescription = xVar.f66101wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility(model.zoijcleaow() ? 0 : 8);
        xVar.f66100ppxfxbqfkf.setText(String.valueOf(listWkgbmnqykc.size()));
        xVar.f66100ppxfxbqfkf.setEnabled(model.gxszxtbevo());
        this.adapter.wkgbmnqykc(listWkgbmnqykc);
        if (listWkgbmnqykc.isEmpty()) {
            return;
        }
        xVar.getRoot().post(new Runnable() { // from class: ad0.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                PromosView.iwizpuwonk(xVar, model, listWkgbmnqykc);
            }
        });
    }

    public final void setOnActivateClicked(draadjrbmk draadjrbmkVar) {
        this.onActivateClicked = draadjrbmkVar;
    }

    public final void setOnForwardClicked(iobyxmoadg iobyxmoadgVar) {
        this.onForwardClicked = iobyxmoadgVar;
    }

    public final void setOnProductClicked(draadjrbmk draadjrbmkVar) {
        this.onProductClicked = draadjrbmkVar;
    }

    public /* synthetic */ PromosView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromosView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        x xVarZoijcleaow = x.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(xVarZoijcleaow, "inflate(...)");
        this.binding = xVarZoijcleaow;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(new rgvfuqvkyq() { // from class: ad0.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return PromosView.zdlpuopuiu(this.f1555zdlpuopuiu, (zc0.iobyxmoadg) obj, ((Integer) obj2).intValue());
            }
        }, new draadjrbmk() { // from class: ad0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PromosView.yggfygwlhe(this.f1553zdlpuopuiu, (zc0.iobyxmoadg) obj);
            }
        });
        ppxfxbqfkfVar.setHasStableIds(true);
        this.adapter = ppxfxbqfkfVar;
        setClipToPadding(false);
        setClipChildren(false);
        x xVar = this.binding;
        int dimensionPixelSize = getResources().getDimensionPixelSize(eablkybsjg.content_margin_12);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eablkybsjg.content_margin_6);
        MaterialTextView tvCounter = xVar.f66100ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvCounter, "tvCounter");
        lb0.ppxfxbqfkf.iobyxmoadg(tvCounter, gxszxtbevo.ic_arrow_right_forward, Integer.valueOf(dimensionPixelSize), Integer.valueOf(c60.zoijcleaow.ppxfxbqfkf(context, s40.ppxfxbqfkf.colorTextIcons2)), dimensionPixelSize2);
        xVar.f66102zoijcleaow.setLayoutManager(new AlphaLayoutManager(context, 0, false, 4, null));
        RecyclerView recycler = xVar.f66102zoijcleaow;
        zdlpuopuiu.dxjokdxxww(recycler, "recycler");
        e60.zoijcleaow.ppxfxbqfkf(recycler, ppxfxbqfkfVar, xVar);
        new dxjokdxxww(0, 1, null).attachToRecyclerView(xVar.f66102zoijcleaow);
        xVar.f66100ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ad0.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromosView.jyumaefscl(this.f1554zdlpuopuiu, view);
            }
        });
        RecyclerView recycler2 = xVar.f66102zoijcleaow;
        zdlpuopuiu.dxjokdxxww(recycler2, "recycler");
        if (recycler2.isLaidOut() && !recycler2.isLayoutRequested()) {
            int measuredWidth = (int) ((xVar.f66102zoijcleaow.getMeasuredWidth() / 2.0f) - ((getResources().getDimensionPixelSize(eablkybsjg.promo_page_width) + (getResources().getDimensionPixelSize(eablkybsjg.promo_page_margin) * 2.0f)) / 2.0f));
            xVar.f66102zoijcleaow.setPadding(measuredWidth, 0, measuredWidth, 0);
            return;
        }
        recycler2.addOnLayoutChangeListener(new zoijcleaow(xVar));
    }
}
