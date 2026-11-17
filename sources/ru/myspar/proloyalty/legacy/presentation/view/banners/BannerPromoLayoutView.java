package ru.myspar.proloyalty.legacy.presentation.view.banners;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.wkgbmnqykc;
import androidx.recyclerview.widget.RecyclerView;
import as0.zoijcleaow;
import bfopjjpdmp.lqeggnwhkg;
import c9.iobyxmoadg;
import cc1.eablkybsjg;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import e31.iwizpuwonk;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.legacy.presentation.view.banners.BannerPromoLayoutView;
import tg.draadjrbmk;
import v81.gxszxtbevo;
import w0.nufgyqmvbu;
import z41.dvvnrvtcbc;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u001c¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R$\u00104\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0017¨\u00065"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/banners/BannerPromoLayoutView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcc1/eablkybsjg;", "banner", "Landroidx/compose/ui/platform/ComposeView;", "gxszxtbevo", "(Lcc1/eablkybsjg;)Landroidx/compose/ui/platform/ComposeView;", "", "banners", "Lgg/wwaezpbzkn;", "setBannersListData", "(Ljava/util/List;)V", "", "enabled", "setInfiniteScrollEnabled", "(Z)V", "Lcc1/iobyxmoadg;", "data", "setData", "(Lcc1/iobyxmoadg;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "Lz41/dvvnrvtcbc;", "yggfygwlhe", "Lz41/dvvnrvtcbc;", "binding", "Lv81/gxszxtbevo;", "jyumaefscl", "Lv81/gxszxtbevo;", "bannersAdapter", "iwizpuwonk", "Z", "isInfiniteScrollEnabled", "cqumvgiudr", "I", "FIRST_INDEX", "value", "eablkybsjg", "()Z", "setHeaderVisible", "isHeaderVisible", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerPromoLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final int FIRST_INDEX;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private boolean isInfiniteScrollEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final gxszxtbevo bannersAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private dvvnrvtcbc binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerPromoLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final ComposeView gxszxtbevo(eablkybsjg banner) {
        final dvvnrvtcbc dvvnrvtcbcVar = this.binding;
        dvvnrvtcbcVar.f127919eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: cc1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerPromoLayoutView.lqeggnwhkg(this.f19643zdlpuopuiu, view);
            }
        });
        MaterialCardView singleBannerRoot = dvvnrvtcbcVar.f127919eablkybsjg;
        zdlpuopuiu.dxjokdxxww(singleBannerRoot, "singleBannerRoot");
        singleBannerRoot.setVisibility(0);
        ShapeableImageView singleBanner = dvvnrvtcbcVar.f127923wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(singleBanner, "singleBanner");
        String strWkgbmnqykc = banner.wkgbmnqykc();
        int i13 = b31.gxszxtbevo.placeholder;
        iobyxmoadg iobyxmoadgVarDraadjrbmk = new c9.gxszxtbevo().draadjrbmk();
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarDraadjrbmk, "fitCenter(...)");
        p41.eablkybsjg.wkgbmnqykc(singleBanner, strWkgbmnqykc, i13, (c9.gxszxtbevo) iobyxmoadgVarDraadjrbmk, new tg.iobyxmoadg() { // from class: cc1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return BannerPromoLayoutView.nufgyqmvbu(dvvnrvtcbcVar);
            }
        });
        RecyclerView rvBanners = dvvnrvtcbcVar.f127922ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners, "rvBanners");
        rvBanners.setVisibility(8);
        ComposeView composeView = dvvnrvtcbcVar.f127924zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(banner.iobyxmoadg().length() > 0 ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            zoijcleaow.iobyxmoadg(composeView, e.eablkybsjg.iobyxmoadg(wkgbmnqykc.f7471iobyxmoadg, lqeggnwhkg.eablkybsjg(0.0f, 0.0f, nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null)), iwizpuwonk.BottomRight, banner.iobyxmoadg(), b41.iobyxmoadg.Auto);
        }
        zdlpuopuiu.dxjokdxxww(composeView, "with(...)");
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(BannerPromoLayoutView bannerPromoLayoutView, View view) {
        draadjrbmk draadjrbmkVar = bannerPromoLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Integer.valueOf(bannerPromoLayoutView.FIRST_INDEX));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(dvvnrvtcbc dvvnrvtcbcVar) {
        ShapeableImageView shapeableImageView = dvvnrvtcbcVar.f127923wkgbmnqykc;
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        layoutParams.height = -2;
        shapeableImageView.setLayoutParams(layoutParams);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void setBannersListData(List<eablkybsjg> banners) {
        dvvnrvtcbc dvvnrvtcbcVar = this.binding;
        this.bannersAdapter.wkgbmnqykc(banners);
        boolean z13 = this.isInfiniteScrollEnabled && banners.size() >= 3;
        RecyclerView rvBanners = dvvnrvtcbcVar.f127922ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners, "rvBanners");
        r41.zoijcleaow.zoijcleaow(rvBanners, z13);
        RecyclerView rvBanners2 = dvvnrvtcbcVar.f127922ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvBanners2, "rvBanners");
        rvBanners2.setVisibility(0);
        MaterialCardView singleBannerRoot = dvvnrvtcbcVar.f127919eablkybsjg;
        zdlpuopuiu.dxjokdxxww(singleBannerRoot, "singleBannerRoot");
        singleBannerRoot.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(BannerPromoLayoutView bannerPromoLayoutView, int i13) {
        draadjrbmk draadjrbmkVar = bannerPromoLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Integer.valueOf(i13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean eablkybsjg() {
        MaterialTextView tvBannersCaption = this.binding.f127920gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvBannersCaption, "tvBannersCaption");
        return tvBannersCaption.getVisibility() == 0;
    }

    public final void setData(cc1.iobyxmoadg data) {
        zdlpuopuiu.btonecajqb(data, "data");
        if (data.iobyxmoadg().size() == 1) {
            gxszxtbevo((eablkybsjg) jyumaefscl.yzdjzghtvl(data.iobyxmoadg()));
        } else {
            setBannersListData(data.iobyxmoadg());
        }
        MaterialTextView materialTextView = this.binding.f127920gxszxtbevo;
        materialTextView.setText(data.zoijcleaow());
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(eablkybsjg() && !kcexrzcfyt.zfvoamnweg(data.zoijcleaow()) ? 0 : 8);
    }

    public final void setHeaderVisible(boolean z13) {
        MaterialTextView tvBannersCaption = this.binding.f127920gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvBannersCaption, "tvBannersCaption");
        tvBannersCaption.setVisibility(z13 ? 0 : 8);
    }

    public final void setInfiniteScrollEnabled(boolean enabled) {
        this.isInfiniteScrollEnabled = enabled;
    }

    public final void setListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listener = listener;
    }

    public /* synthetic */ BannerPromoLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerPromoLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        dvvnrvtcbc dvvnrvtcbcVarZoijcleaow = dvvnrvtcbc.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(dvvnrvtcbcVarZoijcleaow, "inflate(...)");
        this.binding = dvvnrvtcbcVarZoijcleaow;
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(new draadjrbmk() { // from class: cc1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return BannerPromoLayoutView.wkgbmnqykc(this.f19642zdlpuopuiu, ((Integer) obj).intValue());
            }
        });
        this.bannersAdapter = gxszxtbevoVar;
        this.isInfiniteScrollEnabled = true;
        setOrientation(1);
        RecyclerView recyclerView = this.binding.f127922ppxfxbqfkf;
        recyclerView.setOnFlingListener(null);
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, gxszxtbevoVar, this.binding);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new c31.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
    }
}
