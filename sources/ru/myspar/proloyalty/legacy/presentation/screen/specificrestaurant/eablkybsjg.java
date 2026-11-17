package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import ub1.dxjokdxxww;
import ub1.lqeggnwhkg;
import z41.jpowsppfya;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final wkgbmnqykc f97485cqumvgiudr = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f97486esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f97487iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97488jyumaefscl;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    /* synthetic */ class C2303eablkybsjg extends vdvldrhtss implements draadjrbmk {
        C2303eablkybsjg(Object obj) {
            super(1, obj, eablkybsjg.class, "onProductClicked", "onProductClicked(Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/models/RestaurantProductUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((wb1.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(wb1.iobyxmoadg p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).lereixgezr(p13);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements rgvfuqvkyq {
        gxszxtbevo(Object obj) {
            super(2, obj, eablkybsjg.class, "onBuyProductClicked", "onBuyProductClicked(Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/models/RestaurantProductUiModel;D)V", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((wb1.iobyxmoadg) obj, ((Number) obj2).doubleValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(wb1.iobyxmoadg p13, double d13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).cqumvgiudr(p13, d13);
        }
    }

    public static final class iobyxmoadg extends RecyclerView.ojitshcjhn {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
            zdlpuopuiu.btonecajqb(outRect, "outRect");
            zdlpuopuiu.btonecajqb(view, "view");
            zdlpuopuiu.btonecajqb(parent, "parent");
            zdlpuopuiu.btonecajqb(state, "state");
            outRect.bottom = parent.getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_28);
        }
    }

    public static final class ppxfxbqfkf extends GridLayoutManager.ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f97489eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f97490gxszxtbevo;

        ppxfxbqfkf(GridLayoutManager gridLayoutManager, eablkybsjg eablkybsjgVar) {
            this.f97489eablkybsjg = gridLayoutManager;
            this.f97490gxszxtbevo = eablkybsjgVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.ppxfxbqfkf
        public int gxszxtbevo(int i13) {
            return (this.f97489eablkybsjg.q1() == 2 && (this.f97490gxszxtbevo.oxmwwwfdhm().ppxfxbqfkf().get(i13) instanceof jt0.iobyxmoadg)) ? 2 : 1;
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private wkgbmnqykc() {
        }
    }

    public static final class zoijcleaow extends c31.ppxfxbqfkf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super((GridLayoutManager) rgvfuqvkyqVar);
            zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVar, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }

        @Override // c31.ppxfxbqfkf
        protected void eablkybsjg(int i13) {
            if (i13 != -1) {
                eablkybsjg.this.esjtqupxsv(i13);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97488jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: tb1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.cdpycssgdh(this.f110220zdlpuopuiu);
            }
        });
        this.f97487iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: tb1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.pmvmpeiblj(this.f110205zdlpuopuiu);
            }
        });
        final jpowsppfya jpowsppfyaVar = (jpowsppfya) binding.invoke();
        jpowsppfyaVar.f128172ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: tb1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.zdlpuopuiu(this.f110203zdlpuopuiu, view);
            }
        });
        jpowsppfyaVar.f128169lqeggnwhkg.setOnClickListener(new View.OnClickListener() { // from class: tb1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.yggfygwlhe(this.f110206zdlpuopuiu, view);
            }
        });
        jpowsppfyaVar.f128176zoijcleaow.wkgbmnqykc(new AppBarLayout.gxszxtbevo() { // from class: tb1.draadjrbmk
            @Override // com.google.android.material.appbar.AppBarLayout.zoijcleaow
            public final void iobyxmoadg(AppBarLayout appBarLayout, int i13) {
                ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.jyumaefscl(jpowsppfyaVar, appBarLayout, i13);
            }
        });
        jpowsppfyaVar.f128166gtknphoqwx.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: tb1.wflxmlrfwp
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.iwizpuwonk(this.f110222iobyxmoadg);
            }
        });
        jpowsppfyaVar.f128162btonecajqb.btonecajqb(new a01.wkgbmnqykc());
        jpowsppfyaVar.f128162btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc(), 0, false));
        jpowsppfyaVar.f128162btonecajqb.setAdapter(kcexrzcfyt());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(wkgbmnqykc(), 2);
        gridLayoutManager.y1(new ppxfxbqfkf(gridLayoutManager, this));
        jpowsppfyaVar.f128164dxjokdxxww.setLayoutManager(gridLayoutManager);
        jpowsppfyaVar.f128164dxjokdxxww.setAdapter(oxmwwwfdhm());
        jpowsppfyaVar.f128164dxjokdxxww.btonecajqb(new iobyxmoadg());
        RecyclerView recyclerView = jpowsppfyaVar.f128164dxjokdxxww;
        recyclerView.agtfadlqog(new zoijcleaow(recyclerView.getLayoutManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww cdpycssgdh(final eablkybsjg eablkybsjgVar) {
        return new dxjokdxxww(new draadjrbmk() { // from class: tb1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg.yadqdtsiqt(this.f110202zdlpuopuiu, (RestaurantSectionUiModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cqumvgiudr(wb1.iobyxmoadg iobyxmoadgVar, double d13) {
        ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), d13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void esjtqupxsv(int i13) {
        ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.wkgbmnqykc(i13));
    }

    private final void istkbnxepw(jpowsppfya jpowsppfyaVar, boolean z13) {
        LinearLayout llHeaderContainer = jpowsppfyaVar.f128170nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(llHeaderContainer, "llHeaderContainer");
        llHeaderContainer.setVisibility(z13 ? 0 : 8);
        AppCompatImageView ivInfo = jpowsppfyaVar.f128169lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivInfo, "ivInfo");
        ivInfo.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.gxszxtbevo.f97500iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(jpowsppfya jpowsppfyaVar, AppBarLayout appBarLayout, int i13) {
        jpowsppfyaVar.f128170nufgyqmvbu.setAlpha(1 - (Math.abs(i13 * 1.15f) / appBarLayout.getTotalScrollRange()));
    }

    private final dxjokdxxww kcexrzcfyt() {
        return (dxjokdxxww) this.f97488jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lereixgezr(wb1.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.eablkybsjg(iobyxmoadgVar.iobyxmoadg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lqeggnwhkg oxmwwwfdhm() {
        return (lqeggnwhkg) this.f97487iwizpuwonk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg pmvmpeiblj(eablkybsjg eablkybsjgVar) {
        return new lqeggnwhkg(new C2303eablkybsjg(eablkybsjgVar), new gxszxtbevo(eablkybsjgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(eablkybsjg eablkybsjgVar, RestaurantSectionUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.nufgyqmvbu(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.lqeggnwhkg.f97502iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.iobyxmoadg.f97501iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(jpowsppfya binding, tb1.lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        istkbnxepw(binding, model.btonecajqb());
        ShapeableImageView ivBackgroundImage = binding.f128165eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivBackgroundImage, "ivBackgroundImage");
        p41.eablkybsjg.gxszxtbevo(ivBackgroundImage, model.iobyxmoadg());
        ShapeableImageView ivIcon = binding.f128167gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.gxszxtbevo(ivIcon, model.wkgbmnqykc());
        binding.f128173rgvfuqvkyq.setText(model.gxszxtbevo());
        binding.f128161agtfadlqog.setText(model.ppxfxbqfkf());
        binding.f128171ojitshcjhn.setText(model.eablkybsjg());
        binding.f128174wflxmlrfwp.setText(model.zoijcleaow());
        kcexrzcfyt().wkgbmnqykc(model.nufgyqmvbu());
        oxmwwwfdhm().wkgbmnqykc(model.lqeggnwhkg());
        binding.f128166gtknphoqwx.setRefreshing(model.dxjokdxxww());
    }
}
