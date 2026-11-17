package ru.myspar.proloyalty.legacy.presentation.screen.review;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.esjtqupxsv;
import com.google.android.material.button.MaterialButton;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import z41.istkbnxepw;
import z41.xrmfcynszj;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private c31.ppxfxbqfkf f97238iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97239jyumaefscl;

    public static final class iobyxmoadg extends c31.ppxfxbqfkf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super((LinearLayoutManager) rgvfuqvkyqVar);
            zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        @Override // c31.ppxfxbqfkf
        protected void eablkybsjg(int i13) {
            if (i13 != -1) {
                dxjokdxxww.this.ppxfxbqfkf(new lqeggnwhkg.wkgbmnqykc(i13));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
            zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i13);
            dxjokdxxww.this.ppxfxbqfkf(new lqeggnwhkg.eablkybsjg(recyclerView.canScrollVertically(-1)));
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f97241jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f97242yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f97243zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, dxjokdxxww dxjokdxxwwVar) {
            this.f97243zdlpuopuiu = jpowsppfyaVar;
            this.f97242yggfygwlhe = j13;
            this.f97241jyumaefscl = dxjokdxxwwVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f97243zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f97242yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f97241jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f97258iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f97244jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f97245yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f97246zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, dxjokdxxww dxjokdxxwwVar) {
            this.f97246zdlpuopuiu = jpowsppfyaVar;
            this.f97245yggfygwlhe = j13;
            this.f97244jyumaefscl = dxjokdxxwwVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f97246zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f97245yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f97244jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f97258iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f97247iobyxmoadg;

        static {
            int[] iArr = new int[qm1.zoijcleaow.values().length];
            try {
                iArr[qm1.zoijcleaow.ONE_STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qm1.zoijcleaow.TWO_STAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qm1.zoijcleaow.THREE_STAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qm1.zoijcleaow.FOUR_STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qm1.zoijcleaow.FIVE_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qm1.zoijcleaow.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f97247iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97239jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: cb1.yggfygwlhe
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.dxjokdxxww.draadjrbmk(this.f19541zdlpuopuiu);
            }
        });
        istkbnxepw istkbnxepwVar = (istkbnxepw) binding.invoke();
        MaterialButton mbtEditReview = istkbnxepwVar.f128116btonecajqb;
        zdlpuopuiu.dxjokdxxww(mbtEditReview, "mbtEditReview");
        mbtEditReview.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
        MaterialButton btnStubAction = istkbnxepwVar.f128129wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnStubAction, "btnStubAction");
        btnStubAction.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, this));
        RecyclerView rvReviews = istkbnxepwVar.f128120gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(rvReviews, "rvReviews");
        r41.zoijcleaow.ppxfxbqfkf(rvReviews, rgvfuqvkyq(), istkbnxepwVar);
        RecyclerView.wflxmlrfwp itemAnimator = istkbnxepwVar.f128120gtknphoqwx.getItemAnimator();
        zdlpuopuiu.nufgyqmvbu(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((esjtqupxsv) itemAnimator).tzroggbefp(false);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(istkbnxepwVar.f128120gtknphoqwx.getLayoutManager());
        this.f97238iwizpuwonk = iobyxmoadgVar;
        istkbnxepwVar.f128120gtknphoqwx.agtfadlqog(iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(dxjokdxxww dxjokdxxwwVar, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        dxjokdxxwwVar.ppxfxbqfkf(new lqeggnwhkg.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(istkbnxepw istkbnxepwVar, dxjokdxxww dxjokdxxwwVar) {
        RecyclerView.rgvfuqvkyq layoutManager = istkbnxepwVar.f128120gtknphoqwx.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.Q(0);
        }
        c31.ppxfxbqfkf ppxfxbqfkfVar = dxjokdxxwwVar.f97238iwizpuwonk;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.gxszxtbevo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db1.iobyxmoadg draadjrbmk(final dxjokdxxww dxjokdxxwwVar) {
        return new db1.iobyxmoadg(new tg.draadjrbmk() { // from class: cb1.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.dxjokdxxww.wflxmlrfwp(this.f19521zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: cb1.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.dxjokdxxww.agtfadlqog(this.f19525zdlpuopuiu, (String) obj);
            }
        });
    }

    private final void iwizpuwonk(final istkbnxepw istkbnxepwVar) {
        istkbnxepwVar.f128120gtknphoqwx.post(new Runnable() { // from class: cb1.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                ru.myspar.proloyalty.legacy.presentation.screen.review.dxjokdxxww.cqumvgiudr(istkbnxepwVar, this);
            }
        });
    }

    private final void jyumaefscl(istkbnxepw istkbnxepwVar, p91.wkgbmnqykc wkgbmnqykcVar) {
        rgvfuqvkyq().wkgbmnqykc(wkgbmnqykcVar.iobyxmoadg());
        RecyclerView rvReviews = istkbnxepwVar.f128120gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(rvReviews, "rvReviews");
        rvReviews.setVisibility(wkgbmnqykcVar.ppxfxbqfkf() ? 0 : 8);
        TextView textView = istkbnxepwVar.f128128wflxmlrfwp;
        textView.setText(wkgbmnqykcVar.zoijcleaow().zoijcleaow());
        zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(wkgbmnqykcVar.zoijcleaow().ppxfxbqfkf() ? 0 : 8);
        TextView textView2 = istkbnxepwVar.f128117draadjrbmk;
        textView2.setText(wkgbmnqykcVar.zoijcleaow().iobyxmoadg());
        zdlpuopuiu.lqeggnwhkg(textView2);
        textView2.setVisibility(wkgbmnqykcVar.zoijcleaow().ppxfxbqfkf() ? 0 : 8);
    }

    private final void kcexrzcfyt(istkbnxepw istkbnxepwVar, p91.zoijcleaow zoijcleaowVar, ColorStateList colorStateList) {
        Group groupEmptyReviewsStub = istkbnxepwVar.f128123lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(groupEmptyReviewsStub, "groupEmptyReviewsStub");
        groupEmptyReviewsStub.setVisibility(zoijcleaowVar.eablkybsjg() ? 0 : 8);
        istkbnxepwVar.f128125ojitshcjhn.setText(zoijcleaowVar.ppxfxbqfkf());
        istkbnxepwVar.f128115agtfadlqog.setText(zoijcleaowVar.zoijcleaow());
        MaterialButton btnStubAction = istkbnxepwVar.f128129wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnStubAction, "btnStubAction");
        btnStubAction.setVisibility(zoijcleaowVar.wkgbmnqykc() && zoijcleaowVar.eablkybsjg() ? 0 : 8);
        istkbnxepwVar.f128129wkgbmnqykc.setText(zoijcleaowVar.iobyxmoadg());
        istkbnxepwVar.f128129wkgbmnqykc.setBackgroundTintList(colorStateList);
    }

    private final void ojitshcjhn(xrmfcynszj xrmfcynszjVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p91.eablkybsjg eablkybsjgVar = (p91.eablkybsjg) it.next();
            switch (zoijcleaow.f97247iobyxmoadg[eablkybsjgVar.zoijcleaow().ordinal()]) {
                case 1:
                    xrmfcynszjVar.f128475gtknphoqwx.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    xrmfcynszjVar.f128476gxszxtbevo.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 2:
                    xrmfcynszjVar.f128482wflxmlrfwp.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    xrmfcynszjVar.f128479nufgyqmvbu.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 3:
                    xrmfcynszjVar.f128472draadjrbmk.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    xrmfcynszjVar.f128478lqeggnwhkg.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 4:
                    xrmfcynszjVar.f128471btonecajqb.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    xrmfcynszjVar.f128474eablkybsjg.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 5:
                    xrmfcynszjVar.f128473dxjokdxxww.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    xrmfcynszjVar.f128483wkgbmnqykc.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f97260iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final db1.iobyxmoadg rgvfuqvkyq() {
        return (db1.iobyxmoadg) this.f97239jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(dxjokdxxww dxjokdxxwwVar, String itemId) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        dxjokdxxwwVar.ppxfxbqfkf(new lqeggnwhkg.gxszxtbevo(itemId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yggfygwlhe(istkbnxepw istkbnxepwVar, p91.iobyxmoadg iobyxmoadgVar) {
        xrmfcynszj xrmfcynszjVar = istkbnxepwVar.f128124nufgyqmvbu;
        ConstraintLayout root = xrmfcynszjVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(iobyxmoadgVar.wkgbmnqykc() ? 0 : 8);
        xrmfcynszjVar.f128480ojitshcjhn.setText(iobyxmoadgVar.iobyxmoadg());
        xrmfcynszjVar.f128470agtfadlqog.setText(iobyxmoadgVar.ppxfxbqfkf());
        zdlpuopuiu.lqeggnwhkg(xrmfcynszjVar);
        ojitshcjhn(xrmfcynszjVar, iobyxmoadgVar.zoijcleaow());
    }

    private final void zdlpuopuiu(istkbnxepw istkbnxepwVar, cb1.zdlpuopuiu zdlpuopuiuVar, ColorStateList colorStateList) {
        Group addReviewGroup = istkbnxepwVar.f128130zoijcleaow;
        zdlpuopuiu.dxjokdxxww(addReviewGroup, "addReviewGroup");
        addReviewGroup.setVisibility(zdlpuopuiuVar.lqeggnwhkg() ? 0 : 8);
        istkbnxepwVar.f128116btonecajqb.setText(zdlpuopuiuVar.zoijcleaow());
        istkbnxepwVar.f128116btonecajqb.setStrokeColor(colorStateList);
        istkbnxepwVar.f128116btonecajqb.setTextColor(colorStateList);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(istkbnxepw binding, cb1.zdlpuopuiu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ColorsUiModel colorsUiModelPpxfxbqfkf = model.ppxfxbqfkf();
        Context contextWkgbmnqykc = wkgbmnqykc();
        ColorsUiModel.iobyxmoadg iobyxmoadgVar = ColorsUiModel.iobyxmoadg.PRIMARY;
        long jZoijcleaow = bfopjjpdmp.zoijcleaow(colorsUiModelPpxfxbqfkf.xrmfcynszj(contextWkgbmnqykc, iobyxmoadgVar));
        ComposeView cvActionBar = binding.f128121gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(model.gxszxtbevo());
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: cb1.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.dxjokdxxww.oxmwwwfdhm(this.f19531zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(jZoijcleaow), null, 77, null);
        ComposeView clLoading = binding.f128119eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.nufgyqmvbu());
        ColorStateList colorStateListV = model.ppxfxbqfkf().V(wkgbmnqykc(), iobyxmoadgVar);
        yggfygwlhe(binding, model.wkgbmnqykc());
        jyumaefscl(binding, model.eablkybsjg());
        zdlpuopuiu(binding, model, colorStateListV);
        kcexrzcfyt(binding, model.iobyxmoadg(), colorStateListV);
        if (model.dxjokdxxww()) {
            iwizpuwonk(binding);
        }
    }
}
