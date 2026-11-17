package spay.sdk.view;

import a6.zoijcleaow;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kk.a7;
import kk.af;
import kk.eu;
import kk.uc;
import kk.xd;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lspay/sdk/view/SpayBnplGraphCompositeView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkk/a7;", "a", "Lkk/a7;", "getBinding", "()Lkk/a7;", "binding", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayBnplGraphCompositeView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f107870d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a7 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc f107872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f107873c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final void a(int i13, int i14) {
        if (i13 <= 0 || i13 > 8) {
            return;
        }
        this.f107873c.clear();
        int i15 = 0;
        while (i15 < i13) {
            this.f107873c.add(new xd(i15 == i14));
            i15++;
        }
        this.f107872b.eablkybsjg(this.f107873c);
        this.f107872b.notifyDataSetChanged();
    }

    public final a7 getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ SpayBnplGraphCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_order_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.spay_sclbov_graph;
        RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (recyclerView != null) {
            a7 a7Var = new a7((LinearLayoutCompat) viewInflate, recyclerView);
            zdlpuopuiu.dxjokdxxww(a7Var, "inflate(\n        LayoutI… this,\n        true\n    )");
            this.binding = a7Var;
            uc ucVar = new uc(new af());
            this.f107872b = ucVar;
            this.f107873c = new ArrayList();
            recyclerView.setAdapter(ucVar);
            int i15 = R.dimen.spay_6dp;
            zdlpuopuiu.btonecajqb(context, "<this>");
            recyclerView.btonecajqb(new eu(context.getResources().getDimensionPixelSize(i15)));
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SpayBnplGraphCompositeView, 0, 0);
                zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…GraphCompositeView, 0, 0)");
                a(typedArrayObtainStyledAttributes.getInt(R.styleable.SpayBnplGraphCompositeView_spay_graph_size, 4), 0);
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
