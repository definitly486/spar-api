package ru.myspar.legacy.presentation.screen.promotion;

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
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.iozdgvuglv;
import pm.dxjokdxxww;
import ra.lqeggnwhkg;
import ru.myspar.legacy.presentation.view.PromoIcon;
import ru.myspar.legacy.presentation.view.SponsorLayoutView;
import wc0.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow, e40.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f89430esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f89431lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f89432cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f89433iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89434jyumaefscl;

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
        this.f89434jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: wc0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.rgvfuqvkyq(this.f119319zdlpuopuiu));
            }
        });
        this.f89433iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: wc0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.cdpycssgdh(this.f119320zdlpuopuiu));
            }
        });
        this.f89432cqumvgiudr = new ViewTreeObserver.OnScrollChangedListener() { // from class: wc0.dxjokdxxww
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.istkbnxepw(binding, this);
            }
        };
        iozdgvuglv iozdgvuglvVar = (iozdgvuglv) binding.invoke();
        iozdgvuglvVar.f65594ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: wc0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.zdlpuopuiu(this.f119285zdlpuopuiu, view);
            }
        });
        iozdgvuglvVar.f65583eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: wc0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.yggfygwlhe(this.f119289zdlpuopuiu, view);
            }
        });
        iozdgvuglvVar.f65597wflxmlrfwp.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: wc0.draadjrbmk
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.jyumaefscl(this.f119286iobyxmoadg);
            }
        });
        iozdgvuglvVar.f65580btonecajqb.setOnProductClicked(new tg.draadjrbmk() { // from class: wc0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.iwizpuwonk(this.f119323zdlpuopuiu, (zc0.iobyxmoadg) obj);
            }
        });
        iozdgvuglvVar.f65580btonecajqb.setOnActivateClicked(new tg.draadjrbmk() { // from class: wc0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.cqumvgiudr(this.f119284zdlpuopuiu, (zc0.iobyxmoadg) obj);
            }
        });
        iozdgvuglvVar.f65580btonecajqb.setOnForwardClicked(new tg.iobyxmoadg() { // from class: wc0.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.promotion.eablkybsjg.esjtqupxsv(this.f119321zdlpuopuiu);
            }
        });
        kcexrzcfyt(iozdgvuglvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cdpycssgdh(eablkybsjg eablkybsjgVar) {
        return c60.zoijcleaow.ppxfxbqfkf(eablkybsjgVar.wkgbmnqykc(), s40.ppxfxbqfkf.colorTextIcons1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(eablkybsjg eablkybsjgVar, zc0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f89445iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(tg.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        iozdgvuglv iozdgvuglvVar = (iozdgvuglv) iobyxmoadgVar.invoke();
        float fAgtfadlqog = zg.gtknphoqwx.agtfadlqog(iozdgvuglvVar.f65584gtknphoqwx.getScrollY(), 0, 200) / 200.0f;
        Object objEvaluate = new ArgbEvaluator().evaluate(fAgtfadlqog, 0, Integer.valueOf(eablkybsjgVar.vdvldrhtss()));
        zdlpuopuiu.nufgyqmvbu(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) objEvaluate).intValue();
        Object objEvaluate2 = new ArgbEvaluator().evaluate(fAgtfadlqog, -1, Integer.valueOf(eablkybsjgVar.oxmwwwfdhm()));
        zdlpuopuiu.nufgyqmvbu(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) objEvaluate2).intValue();
        iozdgvuglvVar.f65579agtfadlqog.setBackgroundColor(iIntValue);
        iozdgvuglvVar.f65587iwizpuwonk.setTextColor(iIntValue2);
        iozdgvuglvVar.f65594ppxfxbqfkf.setImageTintList(ColorStateList.valueOf(iIntValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(eablkybsjg eablkybsjgVar, zc0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2049ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f89440iobyxmoadg);
    }

    private final void kcexrzcfyt(iozdgvuglv iozdgvuglvVar) {
        float dimension = wkgbmnqykc().getResources().getDimension(s40.eablkybsjg.content_margin_16);
        float dimension2 = wkgbmnqykc().getResources().getDimension(s40.eablkybsjg.content_margin_2);
        ConstraintLayout constraintLayout = iozdgvuglvVar.f65585gxszxtbevo;
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(ra.gtknphoqwx.iobyxmoadg().ojitshcjhn(dimension).wflxmlrfwp());
        lqeggnwhkgVar.setTint(c60.zoijcleaow.ppxfxbqfkf(wkgbmnqykc(), da.zoijcleaow.colorSurface));
        lqeggnwhkgVar.sopmlzcsov(dimension2);
        lqeggnwhkgVar.okpsazkaxt(2);
        constraintLayout.setBackground(lqeggnwhkgVar);
    }

    private final int oxmwwwfdhm() {
        return ((Number) this.f89433iwizpuwonk.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        return c60.zoijcleaow.ppxfxbqfkf(eablkybsjgVar.wkgbmnqykc(), da.zoijcleaow.colorSurface);
    }

    private final int vdvldrhtss() {
        return ((Number) this.f89434jyumaefscl.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f89445iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89446iobyxmoadg);
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89446iobyxmoadg);
        return true;
    }

    public final void lereixgezr(iozdgvuglv binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f65584gtknphoqwx.getViewTreeObserver().addOnScrollChangedListener(this.f89432cqumvgiudr);
    }

    public final void pmvmpeiblj(iozdgvuglv binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        binding.f65584gtknphoqwx.getViewTreeObserver().removeOnScrollChangedListener(this.f89432cqumvgiudr);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(iozdgvuglv binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65597wflxmlrfwp.setRefreshing(model.yggfygwlhe());
        ScrollView scrollView = binding.f65584gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(scrollView, "scrollView");
        scrollView.setVisibility(0);
        binding.f65587iwizpuwonk.setText(model.oxmwwwfdhm());
        AppCompatImageView ivTitle = binding.f65582dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivTitle, "ivTitle");
        c60.wkgbmnqykc.zoijcleaow(ivTitle, model.gtknphoqwx());
        binding.f65591nufgyqmvbu.setData(new PromoIcon.iobyxmoadg(model.ppxfxbqfkf(), null, model.draadjrbmk(), 2, null));
        PromoIcon iconPromo = binding.f65591nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(iconPromo, "iconPromo");
        iconPromo.setVisibility(model.jyumaefscl() ? 0 : 8);
        binding.f65592ojitshcjhn.setText(model.zoijcleaow());
        binding.f65589kcexrzcfyt.setText(model.eablkybsjg());
        MaterialTextView tvDate = binding.f65593oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(tvDate, "tvDate");
        tvDate.setVisibility(model.btonecajqb() ? 0 : 8);
        binding.f65593oxmwwwfdhm.setText(wkgbmnqykc().getString(dxjokdxxww.date_range, model.vdvldrhtss(), model.gxszxtbevo()));
        MaterialTextView tvConditionsTitle = binding.f65596vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(tvConditionsTitle, "tvConditionsTitle");
        tvConditionsTitle.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        MaterialTextView tvFullDescription = binding.f65600zdlpuopuiu;
        zdlpuopuiu.dxjokdxxww(tvFullDescription, "tvFullDescription");
        tvFullDescription.setVisibility(model.nufgyqmvbu() ? 0 : 8);
        binding.f65600zdlpuopuiu.setText(t1.zoijcleaow.iobyxmoadg(model.lqeggnwhkg(), 0, null, null));
        MaterialTextView tvRules = binding.f65588jyumaefscl;
        zdlpuopuiu.dxjokdxxww(tvRules, "tvRules");
        tvRules.setVisibility(model.dxjokdxxww() ? 0 : 8);
        binding.f65588jyumaefscl.setText(model.agtfadlqog());
        binding.f65580btonecajqb.setData(model.wflxmlrfwp());
        SponsorLayoutView sponsorLayoutView = binding.f65581draadjrbmk;
        zdlpuopuiu.dxjokdxxww(sponsorLayoutView, "sponsorLayoutView");
        sponsorLayoutView.setVisibility(model.ojitshcjhn() ? 0 : 8);
        binding.f65581draadjrbmk.setData(model.rgvfuqvkyq());
        FrameLayout btnContainerReward = binding.f65598wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnContainerReward, "btnContainerReward");
        btnContainerReward.setVisibility(model.zdlpuopuiu() ? 0 : 8);
        MaterialButton btnReward = binding.f65583eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnReward, "btnReward");
        c60.lqeggnwhkg.eablkybsjg(btnReward, model.ppxfxbqfkf(), model.wkgbmnqykc());
        binding.f65583eablkybsjg.setEnabled(model.kcexrzcfyt());
        View divider = binding.f65590lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(divider, "divider");
        divider.setVisibility(model.jyumaefscl() ? 0 : 8);
        if (model.jyumaefscl()) {
            MaterialTextView tvBalanceTitle = binding.f65595rgvfuqvkyq;
            zdlpuopuiu.dxjokdxxww(tvBalanceTitle, "tvBalanceTitle");
            tvBalanceTitle.setVisibility(model.iobyxmoadg() != null ? 0 : 8);
            MaterialTextView tvBalance = binding.f65592ojitshcjhn;
            zdlpuopuiu.dxjokdxxww(tvBalance, "tvBalance");
            tvBalance.setVisibility(model.iobyxmoadg() != null ? 0 : 8);
            MaterialTextView tvNoBalance = binding.f65599yggfygwlhe;
            zdlpuopuiu.dxjokdxxww(tvNoBalance, "tvNoBalance");
            tvNoBalance.setVisibility(model.iobyxmoadg() == null ? 0 : 8);
            binding.f65589kcexrzcfyt.setPadding(0, wkgbmnqykc().getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_16), 0, 0);
            return;
        }
        MaterialTextView tvBalanceTitle2 = binding.f65595rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvBalanceTitle2, "tvBalanceTitle");
        tvBalanceTitle2.setVisibility(model.jyumaefscl() ? 0 : 8);
        MaterialTextView tvNoBalance2 = binding.f65599yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(tvNoBalance2, "tvNoBalance");
        tvNoBalance2.setVisibility(model.jyumaefscl() ? 0 : 8);
        MaterialTextView tvBalance2 = binding.f65592ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvBalance2, "tvBalance");
        tvBalance2.setVisibility(model.jyumaefscl() ? 0 : 8);
        binding.f65589kcexrzcfyt.setPadding(0, 0, 0, 0);
        binding.f65583eablkybsjg.setEnabled(true);
    }
}
