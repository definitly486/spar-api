package ru.myspar.legacy.presentation.screen.specificrestaurant;

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
import m60.kegysxyocb;
import ru.myspar.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import yd0.dxjokdxxww;
import yd0.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final wkgbmnqykc f89855cqumvgiudr = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f89856esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f89857iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89858jyumaefscl;

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    /* synthetic */ class C2063eablkybsjg extends vdvldrhtss implements draadjrbmk {
        C2063eablkybsjg(Object obj) {
            super(1, obj, eablkybsjg.class, "onProductClicked", "onProductClicked(Lru/myspar/legacy/presentation/screen/specificrestaurant/models/RestaurantProductUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ae0.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ae0.iobyxmoadg p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).lereixgezr(p13);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements rgvfuqvkyq {
        gxszxtbevo(Object obj) {
            super(2, obj, eablkybsjg.class, "onBuyProductClicked", "onBuyProductClicked(Lru/myspar/legacy/presentation/screen/specificrestaurant/models/RestaurantProductUiModel;D)V", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((ae0.iobyxmoadg) obj, ((Number) obj2).doubleValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ae0.iobyxmoadg p13, double d13) {
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
            outRect.bottom = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_28);
        }
    }

    public static final class ppxfxbqfkf extends GridLayoutManager.ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f89859eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f89860gxszxtbevo;

        ppxfxbqfkf(GridLayoutManager gridLayoutManager, eablkybsjg eablkybsjgVar) {
            this.f89859eablkybsjg = gridLayoutManager;
            this.f89860gxszxtbevo = eablkybsjgVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.ppxfxbqfkf
        public int gxszxtbevo(int i13) {
            return (this.f89859eablkybsjg.q1() == 2 && (this.f89860gxszxtbevo.oxmwwwfdhm().ppxfxbqfkf().get(i13) instanceof pu.iobyxmoadg)) ? 2 : 1;
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private wkgbmnqykc() {
        }
    }

    public static final class zoijcleaow extends t40.ppxfxbqfkf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super((GridLayoutManager) rgvfuqvkyqVar);
            zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVar, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }

        @Override // t40.ppxfxbqfkf
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
        this.f89858jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xd0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.cdpycssgdh(this.f122165zdlpuopuiu);
            }
        });
        this.f89857iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xd0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.pmvmpeiblj(this.f122150zdlpuopuiu);
            }
        });
        final kegysxyocb kegysxyocbVar = (kegysxyocb) binding.invoke();
        kegysxyocbVar.f65706ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: xd0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.zdlpuopuiu(this.f122148zdlpuopuiu, view);
            }
        });
        kegysxyocbVar.f65703lqeggnwhkg.setOnClickListener(new View.OnClickListener() { // from class: xd0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.yggfygwlhe(this.f122151zdlpuopuiu, view);
            }
        });
        kegysxyocbVar.f65710zoijcleaow.wkgbmnqykc(new AppBarLayout.gxszxtbevo() { // from class: xd0.draadjrbmk
            @Override // com.google.android.material.appbar.AppBarLayout.zoijcleaow
            public final void iobyxmoadg(AppBarLayout appBarLayout, int i13) {
                ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.jyumaefscl(kegysxyocbVar, appBarLayout, i13);
            }
        });
        kegysxyocbVar.f65700gtknphoqwx.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: xd0.wflxmlrfwp
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.iwizpuwonk(this.f122167iobyxmoadg);
            }
        });
        kegysxyocbVar.f65696btonecajqb.btonecajqb(new k10.wkgbmnqykc());
        kegysxyocbVar.f65696btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc(), 0, false));
        kegysxyocbVar.f65696btonecajqb.setAdapter(kcexrzcfyt());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(wkgbmnqykc(), 2);
        gridLayoutManager.y1(new ppxfxbqfkf(gridLayoutManager, this));
        kegysxyocbVar.f65698dxjokdxxww.setLayoutManager(gridLayoutManager);
        kegysxyocbVar.f65698dxjokdxxww.setAdapter(oxmwwwfdhm());
        kegysxyocbVar.f65698dxjokdxxww.btonecajqb(new iobyxmoadg());
        RecyclerView recyclerView = kegysxyocbVar.f65698dxjokdxxww;
        recyclerView.agtfadlqog(new zoijcleaow(recyclerView.getLayoutManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww cdpycssgdh(final eablkybsjg eablkybsjgVar) {
        return new dxjokdxxww(new draadjrbmk() { // from class: xd0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.specificrestaurant.eablkybsjg.yadqdtsiqt(this.f122147zdlpuopuiu, (RestaurantSectionUiModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cqumvgiudr(ae0.iobyxmoadg iobyxmoadgVar, double d13) {
        ppxfxbqfkf(new ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), d13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void esjtqupxsv(int i13) {
        ppxfxbqfkf(new ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.wkgbmnqykc(i13));
    }

    private final void istkbnxepw(kegysxyocb kegysxyocbVar, boolean z13) {
        LinearLayout llHeaderContainer = kegysxyocbVar.f65704nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(llHeaderContainer, "llHeaderContainer");
        llHeaderContainer.setVisibility(z13 ? 0 : 8);
        AppCompatImageView ivInfo = kegysxyocbVar.f65703lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivInfo, "ivInfo");
        ivInfo.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.gxszxtbevo.f89870iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(kegysxyocb kegysxyocbVar, AppBarLayout appBarLayout, int i13) {
        kegysxyocbVar.f65704nufgyqmvbu.setAlpha(1 - (Math.abs(i13 * 1.15f) / appBarLayout.getTotalScrollRange()));
    }

    private final dxjokdxxww kcexrzcfyt() {
        return (dxjokdxxww) this.f89858jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lereixgezr(ae0.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.eablkybsjg(iobyxmoadgVar.iobyxmoadg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lqeggnwhkg oxmwwwfdhm() {
        return (lqeggnwhkg) this.f89857iwizpuwonk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg pmvmpeiblj(eablkybsjg eablkybsjgVar) {
        return new lqeggnwhkg(new C2063eablkybsjg(eablkybsjgVar), new gxszxtbevo(eablkybsjgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(eablkybsjg eablkybsjgVar, RestaurantSectionUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.nufgyqmvbu(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.lqeggnwhkg.f89872iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf.iobyxmoadg.f89871iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(kegysxyocb binding, xd0.lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        istkbnxepw(binding, model.btonecajqb());
        ShapeableImageView ivBackgroundImage = binding.f65699eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivBackgroundImage, "ivBackgroundImage");
        c60.wkgbmnqykc.lqeggnwhkg(ivBackgroundImage, model.iobyxmoadg());
        ShapeableImageView ivIcon = binding.f65701gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.lqeggnwhkg(ivIcon, model.wkgbmnqykc());
        binding.f65707rgvfuqvkyq.setText(model.gxszxtbevo());
        binding.f65695agtfadlqog.setText(model.ppxfxbqfkf());
        binding.f65705ojitshcjhn.setText(model.eablkybsjg());
        binding.f65708wflxmlrfwp.setText(model.zoijcleaow());
        kcexrzcfyt().wkgbmnqykc(model.nufgyqmvbu());
        oxmwwwfdhm().wkgbmnqykc(model.lqeggnwhkg());
        binding.f65700gtknphoqwx.setRefreshing(model.dxjokdxxww());
    }
}
