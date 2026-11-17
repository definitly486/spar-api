package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import tg.draadjrbmk;
import ua1.nufgyqmvbu;
import wa1.ppxfxbqfkf;
import z41.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/SponsorLayoutView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lwa1/ppxfxbqfkf;", "sponsors", "Lgg/wwaezpbzkn;", "setData", "(Ljava/util/List;)V", "Lkotlin/Function1;", "zdlpuopuiu", "Ltg/draadjrbmk;", "getOnSponsorClicked", "()Ltg/draadjrbmk;", "setOnSponsorClicked", "(Ltg/draadjrbmk;)V", "onSponsorClicked", "Lz41/j;", "yggfygwlhe", "Lz41/j;", "binding", "Lua1/nufgyqmvbu;", "jyumaefscl", "Lua1/nufgyqmvbu;", "sponsorAdapter", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SponsorLayoutView extends ConstraintLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final nufgyqmvbu sponsorAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private j binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onSponsorClicked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SponsorLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final draadjrbmk getOnSponsorClicked() {
        return this.onSponsorClicked;
    }

    public final void setData(List<ppxfxbqfkf> sponsors) {
        zdlpuopuiu.btonecajqb(sponsors, "sponsors");
        this.sponsorAdapter.wkgbmnqykc(sponsors);
    }

    public final void setOnSponsorClicked(draadjrbmk draadjrbmkVar) {
        this.onSponsorClicked = draadjrbmkVar;
    }

    public /* synthetic */ SponsorLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        j jVarZoijcleaow = j.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(jVarZoijcleaow, "inflate(...)");
        this.binding = jVarZoijcleaow;
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(this.onSponsorClicked);
        this.sponsorAdapter = nufgyqmvbuVar;
        j jVar = this.binding;
        jVar.f128147zoijcleaow.setOnFlingListener(null);
        new c31.dxjokdxxww(0, 1, null).attachToRecyclerView(jVar.f128147zoijcleaow);
        jVar.f128147zoijcleaow.setLayoutManager(new LinearLayoutManager(context, 0, false));
        jVar.f128147zoijcleaow.setAdapter(nufgyqmvbuVar);
    }
}
