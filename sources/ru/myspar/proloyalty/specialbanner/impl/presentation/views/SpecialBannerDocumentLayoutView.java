package ru.myspar.proloyalty.specialbanner.impl.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b31.eablkybsjg;
import c31.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fr1.iobyxmoadg;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.SpecialBannerDocumentLayoutView;
import tg.draadjrbmk;
import xr1.zoijcleaow;
import z41.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/views/SpecialBannerDocumentLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lxr1/zoijcleaow;", "documents", "Lgg/wwaezpbzkn;", "setData", "(Ljava/util/List;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "Lz41/e;", "yggfygwlhe", "Lz41/e;", "binding", "Lfr1/iobyxmoadg;", "jyumaefscl", "Lfr1/iobyxmoadg;", "documentsAdapter", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecialBannerDocumentLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final iobyxmoadg documentsAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final e binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecialBannerDocumentLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(SpecialBannerDocumentLayoutView specialBannerDocumentLayoutView, zoijcleaow it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = specialBannerDocumentLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void setData(List<zoijcleaow> documents) {
        zdlpuopuiu.btonecajqb(documents, "documents");
        this.documentsAdapter.wkgbmnqykc(documents);
    }

    public final void setListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listener = listener;
    }

    public /* synthetic */ SpecialBannerDocumentLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialBannerDocumentLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        e eVarZoijcleaow = e.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(eVarZoijcleaow, "inflate(...)");
        this.binding = eVarZoijcleaow;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(new draadjrbmk() { // from class: vs1.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerDocumentLayoutView.zoijcleaow(this.f118000zdlpuopuiu, (xr1.zoijcleaow) obj);
            }
        });
        this.documentsAdapter = iobyxmoadgVar;
        RecyclerView recyclerView = eVarZoijcleaow.f127943zoijcleaow;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(iobyxmoadgVar);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new nufgyqmvbu(0, dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, false, false, 197, null));
    }
}
