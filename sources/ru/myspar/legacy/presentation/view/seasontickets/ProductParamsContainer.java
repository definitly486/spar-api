package ru.myspar.legacy.presentation.view.seasontickets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c60.nufgyqmvbu;
import com.google.android.material.textview.MaterialTextView;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.fiwbwshyhd;
import pm.dxjokdxxww;
import ru.myspar.legacy.presentation.view.seasontickets.ProductParamsContainer;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/myspar/legacy/presentation/view/seasontickets/ProductParamsContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "Lgg/wwaezpbzkn;", "setItem", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "viewGroup", "", "ppxfxbqfkf", "(Landroid/view/ViewGroup;)Ljava/util/List;", "eablkybsjg", "()V", "getCorrectViews", "()Ljava/util/List;", "", "wkgbmnqykc", "(Landroid/view/View;)Ljava/lang/String;", "onFinishInflate", "", "zdlpuopuiu", "Z", "isExpanded", "yggfygwlhe", "isControlEnabled", "Lm60/fiwbwshyhd;", "jyumaefscl", "Lm60/fiwbwshyhd;", "binding", "iwizpuwonk", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductParamsContainer extends LinearLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final fiwbwshyhd binding;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private boolean isControlEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private boolean isExpanded;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f90053cqumvgiudr = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductParamsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void eablkybsjg() {
        this.binding.f65505ppxfxbqfkf.setText(nufgyqmvbu.wkgbmnqykc(this, this.isExpanded ? dxjokdxxww.collapse_product_params : dxjokdxxww.expand_product_params));
        MaterialTextView tvControl = this.binding.f65505ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvControl, "tvControl");
        int i13 = 0;
        tvControl.setVisibility(this.isControlEnabled ? 0 : 8);
        if (this.isControlEnabled) {
            if (this.isExpanded) {
                Iterator<T> it = getCorrectViews().iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(0);
                }
                return;
            }
            for (Object obj : getCorrectViews()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                View view = (View) obj;
                if (i14 > 2) {
                    view.setVisibility(8);
                }
                i13 = i14;
            }
        }
    }

    private final List<View> getCorrectViews() {
        LinearLayout llContent = this.binding.f65506zoijcleaow;
        zdlpuopuiu.dxjokdxxww(llContent, "llContent");
        List listPpxfxbqfkf = ppxfxbqfkf(llContent);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPpxfxbqfkf) {
            View view = (View) obj;
            String strWkgbmnqykc = wkgbmnqykc(view);
            if ((strWkgbmnqykc != null && strWkgbmnqykc.length() != 0 && view.getVisibility() == 0) || strWkgbmnqykc == null || strWkgbmnqykc.length() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List ppxfxbqfkf(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            zdlpuopuiu.dxjokdxxww(childAt, "getChildAt(...)");
            arrayList.add(childAt);
        }
        return arrayList;
    }

    private final void setItem(View view) {
        this.binding.f65506zoijcleaow.addView(view);
    }

    private final String wkgbmnqykc(View view) {
        try {
            return view.getResources().getResourceEntryName(view.getId());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(ProductParamsContainer productParamsContainer, View view) {
        productParamsContainer.isExpanded = !productParamsContainer.isExpanded;
        productParamsContainer.eablkybsjg();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        while (getChildAt(1) != null) {
            View childAt = getChildAt(1);
            removeView(childAt);
            this.binding.f65506zoijcleaow.addView(childAt);
        }
        super.onFinishInflate();
    }

    public /* synthetic */ ProductParamsContainer(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductParamsContainer(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        fiwbwshyhd fiwbwshyhdVarPpxfxbqfkf = fiwbwshyhd.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(fiwbwshyhdVarPpxfxbqfkf, "inflate(...)");
        this.binding = fiwbwshyhdVarPpxfxbqfkf;
        fiwbwshyhdVarPpxfxbqfkf.f65505ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: oe0.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductParamsContainer.zoijcleaow(this.f72711zdlpuopuiu, view);
            }
        });
    }
}
