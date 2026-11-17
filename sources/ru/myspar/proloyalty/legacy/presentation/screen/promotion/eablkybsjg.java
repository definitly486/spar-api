package ru.myspar.proloyalty.legacy.presentation.screen.promotion;

import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.nufgyqmvbu;
import ra.lqeggnwhkg;
import ru.myspar.proloyalty.legacy.presentation.view.PromoIcon;
import ru.myspar.proloyalty.legacy.presentation.view.SponsorLayoutView;
import ta1.gxszxtbevo;
import z41.pmvmpeiblj;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow, j21.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f97109esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f97110lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f97111cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f97112iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97113jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(final tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97113jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ta1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.rgvfuqvkyq(this.f110189zdlpuopuiu));
            }
        });
        this.f97112iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ta1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.cdpycssgdh(this.f110190zdlpuopuiu));
            }
        });
        this.f97111cqumvgiudr = new ViewTreeObserver.OnScrollChangedListener() { // from class: ta1.dxjokdxxww
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.istkbnxepw(binding, this);
            }
        };
        pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) binding.invoke();
        pmvmpeibljVar.f128344ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ta1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.zdlpuopuiu(this.f110155zdlpuopuiu, view);
            }
        });
        pmvmpeibljVar.f128333eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: ta1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.yggfygwlhe(this.f110159zdlpuopuiu, view);
            }
        });
        pmvmpeibljVar.f128347wflxmlrfwp.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: ta1.draadjrbmk
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.jyumaefscl(this.f110156iobyxmoadg);
            }
        });
        pmvmpeibljVar.f128330btonecajqb.setOnProductClicked(new tg.draadjrbmk() { // from class: ta1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.iwizpuwonk(this.f110193zdlpuopuiu, (wa1.iobyxmoadg) obj);
            }
        });
        pmvmpeibljVar.f128330btonecajqb.setOnActivateClicked(new tg.draadjrbmk() { // from class: ta1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.cqumvgiudr(this.f110154zdlpuopuiu, (wa1.iobyxmoadg) obj);
            }
        });
        pmvmpeibljVar.f128330btonecajqb.setOnForwardClicked(new tg.iobyxmoadg() { // from class: ta1.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotion.eablkybsjg.esjtqupxsv(this.f110191zdlpuopuiu);
            }
        });
        kcexrzcfyt(pmvmpeibljVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cdpycssgdh(eablkybsjg eablkybsjgVar) {
        return p41.ppxfxbqfkf.ppxfxbqfkf(eablkybsjgVar.wkgbmnqykc(), b31.ppxfxbqfkf.colorTextIcons1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(eablkybsjg eablkybsjgVar, wa1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f97124iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(tg.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) iobyxmoadgVar.invoke();
        float fAgtfadlqog = zg.gtknphoqwx.agtfadlqog(pmvmpeibljVar.f128334gtknphoqwx.getScrollY(), 0, 200) / 200.0f;
        Object objEvaluate = new ArgbEvaluator().evaluate(fAgtfadlqog, 0, Integer.valueOf(eablkybsjgVar.vdvldrhtss()));
        zdlpuopuiu.nufgyqmvbu(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) objEvaluate).intValue();
        Object objEvaluate2 = new ArgbEvaluator().evaluate(fAgtfadlqog, -1, Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
        zdlpuopuiu.nufgyqmvbu(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) objEvaluate2).intValue();
        pmvmpeibljVar.f128329agtfadlqog.setBackgroundColor(iIntValue);
        pmvmpeibljVar.f128337iwizpuwonk.setTextColor(iIntValue2);
        pmvmpeibljVar.f128344ppxfxbqfkf.setImageTintList(ColorStateList.valueOf(iIntValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(eablkybsjg eablkybsjgVar, wa1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2292ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f97119iobyxmoadg);
    }

    private final void kcexrzcfyt(pmvmpeiblj pmvmpeibljVar) {
        float dimension = wkgbmnqykc().getResources().getDimension(b31.eablkybsjg.content_margin_16);
        float dimension2 = wkgbmnqykc().getResources().getDimension(b31.eablkybsjg.content_margin_2);
        ConstraintLayout constraintLayout = pmvmpeibljVar.f128335gxszxtbevo;
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(ra.gtknphoqwx.iobyxmoadg().ojitshcjhn(dimension).wflxmlrfwp());
        lqeggnwhkgVar.setTint(p41.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykc(), da.zoijcleaow.colorSurface));
        lqeggnwhkgVar.sopmlzcsov(dimension2);
        lqeggnwhkgVar.okpsazkaxt(2);
        constraintLayout.setBackground(lqeggnwhkgVar);
    }

    private final int oxmwwwfdhm() {
        return ((Number) this.f97112iwizpuwonk.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        return p41.ppxfxbqfkf.ppxfxbqfkf(eablkybsjgVar.wkgbmnqykc(), da.zoijcleaow.colorSurface);
    }

    private final int vdvldrhtss() {
        return ((Number) this.f97113jyumaefscl.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f97124iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97125iobyxmoadg);
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97125iobyxmoadg);
        return true;
    }

    public final void lereixgezr(pmvmpeiblj binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f128334gtknphoqwx.getViewTreeObserver().addOnScrollChangedListener(this.f97111cqumvgiudr);
    }

    public final void pmvmpeiblj(pmvmpeiblj binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f128334gtknphoqwx.getViewTreeObserver().removeOnScrollChangedListener(this.f97111cqumvgiudr);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(pmvmpeiblj binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128347wflxmlrfwp.setRefreshing(model.yggfygwlhe());
        ScrollView scrollView = binding.f128334gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(scrollView, "scrollView");
        scrollView.setVisibility(0);
        binding.f128337iwizpuwonk.setText(model.oxmwwwfdhm());
        AppCompatImageView ivTitle = binding.f128332dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivTitle, "ivTitle");
        p41.eablkybsjg.zoijcleaow(ivTitle, model.gtknphoqwx());
        binding.f128341nufgyqmvbu.setData(new PromoIcon.iobyxmoadg(model.ppxfxbqfkf(), null, model.draadjrbmk(), 2, null));
        PromoIcon iconPromo = binding.f128341nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(iconPromo, "iconPromo");
        iconPromo.setVisibility(model.jyumaefscl() ? 0 : 8);
        binding.f128342ojitshcjhn.setText(model.zoijcleaow());
        binding.f128339kcexrzcfyt.setText(model.eablkybsjg());
        MaterialTextView tvDate = binding.f128343oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(tvDate, "tvDate");
        tvDate.setVisibility(model.btonecajqb() ? 0 : 8);
        binding.f128343oxmwwwfdhm.setText(wkgbmnqykc().getString(vk0.lqeggnwhkg.proloyalty_date_range, model.vdvldrhtss(), model.gxszxtbevo()));
        MaterialTextView tvConditionsTitle = binding.f128346vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(tvConditionsTitle, "tvConditionsTitle");
        tvConditionsTitle.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        MaterialTextView tvFullDescription = binding.f128350zdlpuopuiu;
        zdlpuopuiu.dxjokdxxww(tvFullDescription, "tvFullDescription");
        tvFullDescription.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        binding.f128350zdlpuopuiu.setText(t1.zoijcleaow.iobyxmoadg(model.lqeggnwhkg(), 0, null, null));
        MaterialTextView tvRules = binding.f128338jyumaefscl;
        zdlpuopuiu.dxjokdxxww(tvRules, "tvRules");
        tvRules.setVisibility(model.dxjokdxxww() ? 0 : 8);
        binding.f128338jyumaefscl.setText(model.agtfadlqog());
        binding.f128330btonecajqb.setData(model.wflxmlrfwp());
        SponsorLayoutView sponsorLayoutView = binding.f128331draadjrbmk;
        zdlpuopuiu.dxjokdxxww(sponsorLayoutView, "sponsorLayoutView");
        sponsorLayoutView.setVisibility(model.ojitshcjhn() ? 0 : 8);
        binding.f128331draadjrbmk.setData(model.rgvfuqvkyq());
        FrameLayout btnContainerReward = binding.f128348wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnContainerReward, "btnContainerReward");
        btnContainerReward.setVisibility(model.zdlpuopuiu() ? 0 : 8);
        MaterialButton btnReward = binding.f128333eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnReward, "btnReward");
        nufgyqmvbu.eablkybsjg(btnReward, model.ppxfxbqfkf(), model.wkgbmnqykc());
        binding.f128333eablkybsjg.setEnabled(model.kcexrzcfyt());
        MaterialDivider divider = binding.f128340lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(divider, "divider");
        divider.setVisibility(model.jyumaefscl() ? 0 : 8);
        if (model.jyumaefscl()) {
            MaterialTextView tvBalanceTitle = binding.f128345rgvfuqvkyq;
            zdlpuopuiu.dxjokdxxww(tvBalanceTitle, "tvBalanceTitle");
            tvBalanceTitle.setVisibility(model.iobyxmoadg() != null ? 0 : 8);
            MaterialTextView tvBalance = binding.f128342ojitshcjhn;
            zdlpuopuiu.dxjokdxxww(tvBalance, "tvBalance");
            tvBalance.setVisibility(model.iobyxmoadg() != null ? 0 : 8);
            MaterialTextView tvNoBalance = binding.f128349yggfygwlhe;
            zdlpuopuiu.dxjokdxxww(tvNoBalance, "tvNoBalance");
            tvNoBalance.setVisibility(model.iobyxmoadg() == null ? 0 : 8);
            binding.f128339kcexrzcfyt.setPadding(0, wkgbmnqykc().getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_16), 0, 0);
            return;
        }
        MaterialTextView tvBalanceTitle2 = binding.f128345rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvBalanceTitle2, "tvBalanceTitle");
        tvBalanceTitle2.setVisibility(model.jyumaefscl() ? 0 : 8);
        MaterialTextView tvNoBalance2 = binding.f128349yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(tvNoBalance2, "tvNoBalance");
        tvNoBalance2.setVisibility(model.jyumaefscl() ? 0 : 8);
        MaterialTextView tvBalance2 = binding.f128342ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvBalance2, "tvBalance");
        tvBalance2.setVisibility(model.jyumaefscl() ? 0 : 8);
        binding.f128339kcexrzcfyt.setPadding(0, 0, 0, 0);
        binding.f128333eablkybsjg.setEnabled(true);
    }
}
