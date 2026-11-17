package z41;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.screen.promotion.views.PromosView;
import ru.myspar.proloyalty.legacy.presentation.view.PromoIcon;
import ru.myspar.proloyalty.legacy.presentation.view.SponsorLayoutView;

/* JADX INFO: loaded from: classes5.dex */
public final class pmvmpeiblj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final ConstraintLayout f128329agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final PromosView f128330btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final SponsorLayoutView f128331draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f128332dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f128333eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final ScrollView f128334gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ConstraintLayout f128335gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128336iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final MaterialTextView f128337iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final MaterialTextView f128338jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final MaterialTextView f128339kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialDivider f128340lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final PromoIcon f128341nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f128342ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final MaterialTextView f128343oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128344ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final MaterialTextView f128345rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final MaterialTextView f128346vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final SwipeRefreshLayout f128347wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final FrameLayout f128348wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final MaterialTextView f128349yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final MaterialTextView f128350zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f128351zoijcleaow;

    private pmvmpeiblj(ConstraintLayout constraintLayout, Barrier barrier, AppCompatImageView appCompatImageView, FrameLayout frameLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, MaterialDivider materialDivider, PromoIcon promoIcon, AppCompatImageView appCompatImageView2, PromosView promosView, ScrollView scrollView, SponsorLayoutView sponsorLayoutView, SwipeRefreshLayout swipeRefreshLayout, ConstraintLayout constraintLayout3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9) {
        this.f128336iobyxmoadg = constraintLayout;
        this.f128351zoijcleaow = barrier;
        this.f128344ppxfxbqfkf = appCompatImageView;
        this.f128348wkgbmnqykc = frameLayout;
        this.f128333eablkybsjg = materialButton;
        this.f128335gxszxtbevo = constraintLayout2;
        this.f128340lqeggnwhkg = materialDivider;
        this.f128341nufgyqmvbu = promoIcon;
        this.f128332dxjokdxxww = appCompatImageView2;
        this.f128330btonecajqb = promosView;
        this.f128334gtknphoqwx = scrollView;
        this.f128331draadjrbmk = sponsorLayoutView;
        this.f128347wflxmlrfwp = swipeRefreshLayout;
        this.f128329agtfadlqog = constraintLayout3;
        this.f128342ojitshcjhn = materialTextView;
        this.f128345rgvfuqvkyq = materialTextView2;
        this.f128346vdvldrhtss = materialTextView3;
        this.f128343oxmwwwfdhm = materialTextView4;
        this.f128339kcexrzcfyt = materialTextView5;
        this.f128350zdlpuopuiu = materialTextView6;
        this.f128349yggfygwlhe = materialTextView7;
        this.f128338jyumaefscl = materialTextView8;
        this.f128337iwizpuwonk = materialTextView9;
    }

    public static pmvmpeiblj iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.barrier;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = vk0.wkgbmnqykc.btnBack;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = vk0.wkgbmnqykc.btnContainerReward;
                FrameLayout frameLayout = (FrameLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (frameLayout != null) {
                    i13 = vk0.wkgbmnqykc.btnReward;
                    MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialButton != null) {
                        i13 = vk0.wkgbmnqykc.card;
                        ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (constraintLayout != null) {
                            i13 = vk0.wkgbmnqykc.divider;
                            MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialDivider != null) {
                                i13 = vk0.wkgbmnqykc.iconPromo;
                                PromoIcon promoIcon = (PromoIcon) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (promoIcon != null) {
                                    i13 = vk0.wkgbmnqykc.ivTitle;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatImageView2 != null) {
                                        i13 = vk0.wkgbmnqykc.promosView;
                                        PromosView promosView = (PromosView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (promosView != null) {
                                            i13 = vk0.wkgbmnqykc.scrollView;
                                            ScrollView scrollView = (ScrollView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (scrollView != null) {
                                                i13 = vk0.wkgbmnqykc.sponsorLayoutView;
                                                SponsorLayoutView sponsorLayoutView = (SponsorLayoutView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (sponsorLayoutView != null) {
                                                    i13 = vk0.wkgbmnqykc.swipeRefresh;
                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (swipeRefreshLayout != null) {
                                                        i13 = vk0.wkgbmnqykc.toolbar;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (constraintLayout2 != null) {
                                                            i13 = vk0.wkgbmnqykc.tvBalance;
                                                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView != null) {
                                                                i13 = vk0.wkgbmnqykc.tvBalanceTitle;
                                                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                if (materialTextView2 != null) {
                                                                    i13 = vk0.wkgbmnqykc.tvConditionsTitle;
                                                                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                    if (materialTextView3 != null) {
                                                                        i13 = vk0.wkgbmnqykc.tvDate;
                                                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                        if (materialTextView4 != null) {
                                                                            i13 = vk0.wkgbmnqykc.tvDescription;
                                                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                            if (materialTextView5 != null) {
                                                                                i13 = vk0.wkgbmnqykc.tvFullDescription;
                                                                                MaterialTextView materialTextView6 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                if (materialTextView6 != null) {
                                                                                    i13 = vk0.wkgbmnqykc.tvNoBalance;
                                                                                    MaterialTextView materialTextView7 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                    if (materialTextView7 != null) {
                                                                                        i13 = vk0.wkgbmnqykc.tvRules;
                                                                                        MaterialTextView materialTextView8 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                        if (materialTextView8 != null) {
                                                                                            i13 = vk0.wkgbmnqykc.tvTitle;
                                                                                            MaterialTextView materialTextView9 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                            if (materialTextView9 != null) {
                                                                                                return new pmvmpeiblj((ConstraintLayout) view, barrier, appCompatImageView, frameLayout, materialButton, constraintLayout, materialDivider, promoIcon, appCompatImageView2, promosView, scrollView, sponsorLayoutView, swipeRefreshLayout, constraintLayout2, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialTextView9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128336iobyxmoadg;
    }
}
