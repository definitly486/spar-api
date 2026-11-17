package ru.myspar.specialbanner.impl.presentation.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.iobyxmoadg;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.g0;
import mk.rgvfuqvkyq;
import q62.zoijcleaow;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.specialbanner.impl.presentation.views.QuestionSpecialBannerLayoutView;
import s40.gxszxtbevo;
import s52.ojitshcjhn;
import s52.ppxfxbqfkf;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/views/QuestionSpecialBannerLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/myspar/core/domain/models/ColorsUiModel;", "colorModel", "", "isNeededPainting", "Landroidx/recyclerview/widget/RecyclerView$ojitshcjhn;", "eablkybsjg", "(Lru/myspar/core/domain/models/ColorsUiModel;Z)Landroidx/recyclerview/widget/RecyclerView$ojitshcjhn;", "Lq62/zoijcleaow;", "data", "Lgg/wwaezpbzkn;", "setData", "(Lq62/zoijcleaow;)V", "gxszxtbevo", "Lkotlin/Function1;", "Lq62/iobyxmoadg;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setClickListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "Lm60/g0;", "yggfygwlhe", "Lm60/g0;", "binding", "Ls52/ppxfxbqfkf;", "jyumaefscl", "Lgg/gtknphoqwx;", "getAdapter", "()Ls52/ppxfxbqfkf;", "adapter", "iwizpuwonk", "Landroidx/recyclerview/widget/RecyclerView$ojitshcjhn;", "itemDecoration", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuestionSpecialBannerLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f104213esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private RecyclerView.ojitshcjhn itemDecoration;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx adapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private g0 binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuestionSpecialBannerLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final RecyclerView.ojitshcjhn eablkybsjg(ColorsUiModel colorModel, boolean isNeededPainting) {
        Drawable drawable = iobyxmoadg.getDrawable(getContext(), gxszxtbevo.shape_item_divider);
        if (drawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (colorModel != null && isNeededPainting) {
            Context context = getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            drawable.setTint(colorModel.wypolnanlu(context, ColorsUiModel.iobyxmoadg.ON_PRIMARY));
        }
        return new ojitshcjhn(drawable);
    }

    private final ppxfxbqfkf getAdapter() {
        return (ppxfxbqfkf) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf ppxfxbqfkf(final QuestionSpecialBannerLayoutView questionSpecialBannerLayoutView) {
        return new ppxfxbqfkf(new draadjrbmk() { // from class: b72.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return QuestionSpecialBannerLayoutView.wkgbmnqykc(this.f15448zdlpuopuiu, (q62.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(QuestionSpecialBannerLayoutView questionSpecialBannerLayoutView, q62.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = questionSpecialBannerLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void gxszxtbevo(zoijcleaow data) {
        zdlpuopuiu.btonecajqb(data, "data");
        getAdapter().wkgbmnqykc(rgvfuqvkyq.yggfygwlhe(data.wkgbmnqykc()));
    }

    public final void setClickListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listener = listener;
    }

    public final void setData(zoijcleaow data) {
        zdlpuopuiu.btonecajqb(data, "data");
        RecyclerView rvQuestions = this.binding.f65516zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvQuestions, "rvQuestions");
        rvQuestions.setVisibility(!data.wkgbmnqykc().isEmpty() ? 0 : 8);
        RecyclerView.ojitshcjhn ojitshcjhnVar = this.itemDecoration;
        if (ojitshcjhnVar != null) {
            this.binding.f65516zoijcleaow.o(ojitshcjhnVar);
        }
        RecyclerView.ojitshcjhn ojitshcjhnVarEablkybsjg = eablkybsjg(data.ppxfxbqfkf(), data.eablkybsjg());
        this.itemDecoration = ojitshcjhnVarEablkybsjg;
        this.binding.f65516zoijcleaow.btonecajqb(ojitshcjhnVarEablkybsjg);
        getAdapter().wkgbmnqykc(rgvfuqvkyq.yggfygwlhe(data.wkgbmnqykc()));
    }

    public /* synthetic */ QuestionSpecialBannerLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionSpecialBannerLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        g0 g0VarZoijcleaow = g0.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(g0VarZoijcleaow, "inflate(...)");
        this.binding = g0VarZoijcleaow;
        this.adapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: b72.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return QuestionSpecialBannerLayoutView.ppxfxbqfkf(this.f15462zdlpuopuiu);
            }
        });
        g0 g0Var = this.binding;
        g0Var.f65516zoijcleaow.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView.wflxmlrfwp itemAnimator = g0Var.f65516zoijcleaow.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.cqumvgiudr(0L);
        }
        g0Var.f65516zoijcleaow.setAdapter(getAdapter());
    }
}
