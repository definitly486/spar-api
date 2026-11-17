package ru.myspar.legacy.presentation.screen.review;

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
import m60.iyctptxqzt;
import m60.pkzmftpjix;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private t40.ppxfxbqfkf f89559iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89560jyumaefscl;

    public static final class iobyxmoadg extends t40.ppxfxbqfkf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super((LinearLayoutManager) rgvfuqvkyqVar);
            zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        @Override // t40.ppxfxbqfkf
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
        final /* synthetic */ dxjokdxxww f89562jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f89563yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f89564zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, dxjokdxxww dxjokdxxwwVar) {
            this.f89564zdlpuopuiu = jpowsppfyaVar;
            this.f89563yggfygwlhe = j13;
            this.f89562jyumaefscl = dxjokdxxwwVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f89564zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f89563yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f89562jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f89579iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f89565jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f89566yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f89567zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, dxjokdxxww dxjokdxxwwVar) {
            this.f89567zdlpuopuiu = jpowsppfyaVar;
            this.f89566yggfygwlhe = j13;
            this.f89565jyumaefscl = dxjokdxxwwVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f89567zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f89566yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f89565jyumaefscl.ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf.f89579iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f89568iobyxmoadg;

        static {
            int[] iArr = new int[z02.zoijcleaow.values().length];
            try {
                iArr[z02.zoijcleaow.ONE_STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z02.zoijcleaow.TWO_STAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z02.zoijcleaow.THREE_STAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z02.zoijcleaow.FOUR_STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z02.zoijcleaow.FIVE_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z02.zoijcleaow.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f89568iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89560jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fd0.yggfygwlhe
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.review.dxjokdxxww.draadjrbmk(this.f33447zdlpuopuiu);
            }
        });
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) binding.invoke();
        MaterialButton mbtEditReview = pkzmftpjixVar.f65877btonecajqb;
        zdlpuopuiu.dxjokdxxww(mbtEditReview, "mbtEditReview");
        mbtEditReview.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
        MaterialButton btnStubAction = pkzmftpjixVar.f65890wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnStubAction, "btnStubAction");
        btnStubAction.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, this));
        RecyclerView rvReviews = pkzmftpjixVar.f65881gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(rvReviews, "rvReviews");
        e60.zoijcleaow.ppxfxbqfkf(rvReviews, rgvfuqvkyq(), pkzmftpjixVar);
        RecyclerView.wflxmlrfwp itemAnimator = pkzmftpjixVar.f65881gtknphoqwx.getItemAnimator();
        zdlpuopuiu.nufgyqmvbu(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((esjtqupxsv) itemAnimator).tzroggbefp(false);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(pkzmftpjixVar.f65881gtknphoqwx.getLayoutManager());
        this.f89559iwizpuwonk = iobyxmoadgVar;
        pkzmftpjixVar.f65881gtknphoqwx.agtfadlqog(iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(dxjokdxxww dxjokdxxwwVar, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        dxjokdxxwwVar.ppxfxbqfkf(new lqeggnwhkg.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(pkzmftpjix pkzmftpjixVar, dxjokdxxww dxjokdxxwwVar) {
        RecyclerView.rgvfuqvkyq layoutManager = pkzmftpjixVar.f65881gtknphoqwx.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.Q(0);
        }
        t40.ppxfxbqfkf ppxfxbqfkfVar = dxjokdxxwwVar.f89559iwizpuwonk;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.gxszxtbevo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd0.iobyxmoadg draadjrbmk(final dxjokdxxww dxjokdxxwwVar) {
        return new gd0.iobyxmoadg(new tg.draadjrbmk() { // from class: fd0.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.review.dxjokdxxww.wflxmlrfwp(this.f33427zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: fd0.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.review.dxjokdxxww.agtfadlqog(this.f33431zdlpuopuiu, (String) obj);
            }
        });
    }

    private final void iwizpuwonk(final pkzmftpjix pkzmftpjixVar) {
        pkzmftpjixVar.f65881gtknphoqwx.post(new Runnable() { // from class: fd0.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                ru.myspar.legacy.presentation.screen.review.dxjokdxxww.cqumvgiudr(pkzmftpjixVar, this);
            }
        });
    }

    private final void jyumaefscl(pkzmftpjix pkzmftpjixVar, qb0.wkgbmnqykc wkgbmnqykcVar) {
        rgvfuqvkyq().wkgbmnqykc(wkgbmnqykcVar.iobyxmoadg());
        RecyclerView rvReviews = pkzmftpjixVar.f65881gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(rvReviews, "rvReviews");
        rvReviews.setVisibility(wkgbmnqykcVar.ppxfxbqfkf() ? 0 : 8);
        TextView textView = pkzmftpjixVar.f65889wflxmlrfwp;
        textView.setText(wkgbmnqykcVar.zoijcleaow().zoijcleaow());
        zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(wkgbmnqykcVar.zoijcleaow().ppxfxbqfkf() ? 0 : 8);
        TextView textView2 = pkzmftpjixVar.f65878draadjrbmk;
        textView2.setText(wkgbmnqykcVar.zoijcleaow().iobyxmoadg());
        zdlpuopuiu.lqeggnwhkg(textView2);
        textView2.setVisibility(wkgbmnqykcVar.zoijcleaow().ppxfxbqfkf() ? 0 : 8);
    }

    private final void kcexrzcfyt(pkzmftpjix pkzmftpjixVar, qb0.zoijcleaow zoijcleaowVar, ColorStateList colorStateList) {
        Group groupEmptyReviewsStub = pkzmftpjixVar.f65884lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(groupEmptyReviewsStub, "groupEmptyReviewsStub");
        groupEmptyReviewsStub.setVisibility(zoijcleaowVar.eablkybsjg() ? 0 : 8);
        pkzmftpjixVar.f65886ojitshcjhn.setText(zoijcleaowVar.ppxfxbqfkf());
        pkzmftpjixVar.f65876agtfadlqog.setText(zoijcleaowVar.zoijcleaow());
        MaterialButton btnStubAction = pkzmftpjixVar.f65890wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnStubAction, "btnStubAction");
        btnStubAction.setVisibility(zoijcleaowVar.wkgbmnqykc() && zoijcleaowVar.eablkybsjg() ? 0 : 8);
        pkzmftpjixVar.f65890wkgbmnqykc.setText(zoijcleaowVar.iobyxmoadg());
        pkzmftpjixVar.f65890wkgbmnqykc.setBackgroundTintList(colorStateList);
    }

    private final void ojitshcjhn(iyctptxqzt iyctptxqztVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qb0.eablkybsjg eablkybsjgVar = (qb0.eablkybsjg) it.next();
            switch (zoijcleaow.f89568iobyxmoadg[eablkybsjgVar.zoijcleaow().ordinal()]) {
                case 1:
                    iyctptxqztVar.f65634gtknphoqwx.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    iyctptxqztVar.f65635gxszxtbevo.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 2:
                    iyctptxqztVar.f65641wflxmlrfwp.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    iyctptxqztVar.f65638nufgyqmvbu.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 3:
                    iyctptxqztVar.f65631draadjrbmk.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    iyctptxqztVar.f65637lqeggnwhkg.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 4:
                    iyctptxqztVar.f65630btonecajqb.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    iyctptxqztVar.f65633eablkybsjg.setProgress(eablkybsjgVar.iobyxmoadg());
                    break;
                case 5:
                    iyctptxqztVar.f65632dxjokdxxww.setRating(eablkybsjgVar.zoijcleaow().wkgbmnqykc());
                    iyctptxqztVar.f65642wkgbmnqykc.setProgress(eablkybsjgVar.iobyxmoadg());
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
        dxjokdxxwwVar.ppxfxbqfkf(lqeggnwhkg.zoijcleaow.f89581iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final gd0.iobyxmoadg rgvfuqvkyq() {
        return (gd0.iobyxmoadg) this.f89560jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(dxjokdxxww dxjokdxxwwVar, String itemId) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        dxjokdxxwwVar.ppxfxbqfkf(new lqeggnwhkg.gxszxtbevo(itemId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yggfygwlhe(pkzmftpjix pkzmftpjixVar, qb0.iobyxmoadg iobyxmoadgVar) {
        iyctptxqzt iyctptxqztVar = pkzmftpjixVar.f65885nufgyqmvbu;
        ConstraintLayout root = iyctptxqztVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(iobyxmoadgVar.wkgbmnqykc() ? 0 : 8);
        iyctptxqztVar.f65639ojitshcjhn.setText(iobyxmoadgVar.iobyxmoadg());
        iyctptxqztVar.f65629agtfadlqog.setText(iobyxmoadgVar.ppxfxbqfkf());
        zdlpuopuiu.lqeggnwhkg(iyctptxqztVar);
        ojitshcjhn(iyctptxqztVar, iobyxmoadgVar.zoijcleaow());
    }

    private final void zdlpuopuiu(pkzmftpjix pkzmftpjixVar, fd0.zdlpuopuiu zdlpuopuiuVar, ColorStateList colorStateList) {
        Group addReviewGroup = pkzmftpjixVar.f65891zoijcleaow;
        zdlpuopuiu.dxjokdxxww(addReviewGroup, "addReviewGroup");
        addReviewGroup.setVisibility(zdlpuopuiuVar.lqeggnwhkg() ? 0 : 8);
        pkzmftpjixVar.f65877btonecajqb.setText(zdlpuopuiuVar.zoijcleaow());
        pkzmftpjixVar.f65877btonecajqb.setStrokeColor(colorStateList);
        pkzmftpjixVar.f65877btonecajqb.setTextColor(colorStateList);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(pkzmftpjix binding, fd0.zdlpuopuiu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ColorsUiModel colorsUiModelPpxfxbqfkf = model.ppxfxbqfkf();
        Context contextWkgbmnqykc = wkgbmnqykc();
        ColorsUiModel.iobyxmoadg iobyxmoadgVar = ColorsUiModel.iobyxmoadg.PRIMARY;
        long jZoijcleaow = bfopjjpdmp.zoijcleaow(colorsUiModelPpxfxbqfkf.wypolnanlu(contextWkgbmnqykc, iobyxmoadgVar));
        ComposeView cvActionBar = binding.f65882gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(model.gxszxtbevo());
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: fd0.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.review.dxjokdxxww.oxmwwwfdhm(this.f33437zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(jZoijcleaow), null, 77, null);
        ComposeView clLoading = binding.f65880eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.nufgyqmvbu());
        ColorStateList colorStateListOkpsazkaxt = model.ppxfxbqfkf().okpsazkaxt(wkgbmnqykc(), iobyxmoadgVar);
        yggfygwlhe(binding, model.wkgbmnqykc());
        jyumaefscl(binding, model.eablkybsjg());
        zdlpuopuiu(binding, model, colorStateListOkpsazkaxt);
        kcexrzcfyt(binding, model.iobyxmoadg(), colorStateListOkpsazkaxt);
        if (model.dxjokdxxww()) {
            iwizpuwonk(binding);
        }
    }
}
