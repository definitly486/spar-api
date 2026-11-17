package ru.myspar.legacy.presentation.view.banners;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c60.wkgbmnqykc;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import e.eablkybsjg;
import e60.zoijcleaow;
import gg.wwaezpbzkn;
import he0.lqeggnwhkg;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.yzdjzghtvl;
import mj.kcexrzcfyt;
import o50.iobyxmoadg;
import ru.myspar.legacy.presentation.view.banners.BannerVideoLayoutView;
import t40.dxjokdxxww;
import tg.draadjrbmk;
import ua0.btonecajqb;
import v40.esjtqupxsv;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R$\u00104\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/myspar/legacy/presentation/view/banners/BannerVideoLayoutView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhe0/lqeggnwhkg;", "banner", "Landroidx/compose/ui/platform/ComposeView;", "gxszxtbevo", "(Lhe0/lqeggnwhkg;)Landroidx/compose/ui/platform/ComposeView;", "", "banners", "", "isInfiniteScrollEnabled", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Ljava/util/List;Z)V", "Lhe0/iobyxmoadg;", "data", "setData", "(Lhe0/iobyxmoadg;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "Lm60/yzdjzghtvl;", "yggfygwlhe", "Lm60/yzdjzghtvl;", "binding", "Lua0/btonecajqb;", "jyumaefscl", "Lua0/btonecajqb;", "bannersAdapter", "iwizpuwonk", "I", "FIRST_INDEX", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "value", "wkgbmnqykc", "()Z", "setHeaderVisible", "(Z)V", "isHeaderVisible", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerVideoLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final int FIRST_INDEX;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final btonecajqb bannersAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private yzdjzghtvl binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerVideoLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void eablkybsjg(List banners, boolean isInfiniteScrollEnabled) {
        yzdjzghtvl yzdjzghtvlVar = this.binding;
        this.bannersAdapter.wkgbmnqykc(banners);
        RecyclerView rvBanners = yzdjzghtvlVar.f66173ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners, "rvBanners");
        zoijcleaow.zoijcleaow(rvBanners, isInfiniteScrollEnabled);
        RecyclerView rvBanners2 = yzdjzghtvlVar.f66173ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners2, "rvBanners");
        rvBanners2.setVisibility(0);
        MaterialCardView singleBannerRoot = yzdjzghtvlVar.f66170eablkybsjg;
        zdlpuopuiu.dxjokdxxww(singleBannerRoot, "singleBannerRoot");
        singleBannerRoot.setVisibility(8);
    }

    private final ComposeView gxszxtbevo(lqeggnwhkg banner) {
        yzdjzghtvl yzdjzghtvlVar = this.binding;
        yzdjzghtvlVar.f66174wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: he0.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerVideoLayoutView.lqeggnwhkg(this.f40102zdlpuopuiu, view);
            }
        });
        MaterialCardView singleBannerRoot = yzdjzghtvlVar.f66170eablkybsjg;
        zdlpuopuiu.dxjokdxxww(singleBannerRoot, "singleBannerRoot");
        singleBannerRoot.setVisibility(0);
        ShapeableImageView singleBanner = yzdjzghtvlVar.f66174wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(singleBanner, "singleBanner");
        wkgbmnqykc.zoijcleaow(singleBanner, banner.eablkybsjg());
        RecyclerView rvBanners = yzdjzghtvlVar.f66173ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners, "rvBanners");
        rvBanners.setVisibility(8);
        ComposeView composeView = yzdjzghtvlVar.f66175zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(banner.iobyxmoadg().length() > 0 ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            gt.zoijcleaow.iobyxmoadg(composeView, eablkybsjg.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, bfopjjpdmp.lqeggnwhkg.eablkybsjg(0.0f, 0.0f, nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null)), esjtqupxsv.BottomRight, banner.iobyxmoadg(), iobyxmoadg.Auto);
        }
        zdlpuopuiu.dxjokdxxww(composeView, "with(...)");
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(BannerVideoLayoutView bannerVideoLayoutView, View view) {
        draadjrbmk draadjrbmkVar = bannerVideoLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Integer.valueOf(bannerVideoLayoutView.FIRST_INDEX));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(BannerVideoLayoutView bannerVideoLayoutView, int i13) {
        draadjrbmk draadjrbmkVar = bannerVideoLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Integer.valueOf(i13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView rvBanners = this.binding.f66173ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners, "rvBanners");
        return rvBanners;
    }

    public final void setData(he0.iobyxmoadg data) {
        zdlpuopuiu.btonecajqb(data, "data");
        if (data.iobyxmoadg().size() == 1) {
            gxszxtbevo((lqeggnwhkg) jyumaefscl.yzdjzghtvl(data.iobyxmoadg()));
        } else {
            eablkybsjg(data.iobyxmoadg(), data.zoijcleaow() && data.iobyxmoadg().size() >= 3);
        }
        MaterialTextView materialTextView = this.binding.f66171gxszxtbevo;
        materialTextView.setText(data.ppxfxbqfkf());
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(wkgbmnqykc() && !kcexrzcfyt.zfvoamnweg(data.ppxfxbqfkf()) ? 0 : 8);
    }

    public final void setHeaderVisible(boolean z13) {
        MaterialTextView tvBannersCaption = this.binding.f66171gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvBannersCaption, "tvBannersCaption");
        tvBannersCaption.setVisibility(z13 ? 0 : 8);
    }

    public final void setListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listener = listener;
    }

    public final boolean wkgbmnqykc() {
        MaterialTextView tvBannersCaption = this.binding.f66171gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvBannersCaption, "tvBannersCaption");
        return tvBannersCaption.getVisibility() == 0;
    }

    public /* synthetic */ BannerVideoLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerVideoLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        yzdjzghtvl yzdjzghtvlVarZoijcleaow = yzdjzghtvl.zoijcleaow(c60.nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(yzdjzghtvlVarZoijcleaow, "inflate(...)");
        this.binding = yzdjzghtvlVarZoijcleaow;
        btonecajqb btonecajqbVar = new btonecajqb(new draadjrbmk() { // from class: he0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return BannerVideoLayoutView.ppxfxbqfkf(this.f40101zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        this.bannersAdapter = btonecajqbVar;
        setOrientation(1);
        RecyclerView recyclerView = this.binding.f66173ppxfxbqfkf;
        recyclerView.setOnFlingListener(null);
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        zoijcleaow.ppxfxbqfkf(recyclerView, btonecajqbVar, this.binding);
        new dxjokdxxww(0, 1, null).attachToRecyclerView(recyclerView);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new t40.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
    }
}
