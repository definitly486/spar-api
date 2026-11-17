package ru.myspar.catalog.impl.subcatalog.presentation;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import ds.btonecajqb;
import es.wflxmlrfwp;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.mbcevpiqjq;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import w0.nufgyqmvbu;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gtknphoqwx f86047cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final SubCatalogArgs f86048iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f86049jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f86050jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f86051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f86052zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f86052zdlpuopuiu = jpowsppfyaVar;
            this.f86051yggfygwlhe = j13;
            this.f86050jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f86052zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f86051yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f86050jyumaefscl.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.nufgyqmvbu.f86061iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f86053yggfygwlhe;

        ppxfxbqfkf(long j13) {
            this.f86053yggfygwlhe = j13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.gxszxtbevo.f86057iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.eablkybsjg.f86056iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ppxfxbqfkf((tbqsvytpvh) obj, (draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void ppxfxbqfkf(tbqsvytpvh drawActionBar, draadjrbmk draadjrbmkVar, int i13) {
            zdlpuopuiu.btonecajqb(drawActionBar, "$this$drawActionBar");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(329957563, i13, -1, "ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogViewImpl.bindActionBar.<anonymous> (SubCatalogViewImpl.kt:94)");
            }
            int i14 = s40.gxszxtbevo.ic_search;
            draadjrbmkVar.sopmlzcsov(570703073);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(wkgbmnqykc.this);
            final wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.subcatalog.presentation.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.eablkybsjg(wkgbmnqykcVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            v40.gtknphoqwx.zoijcleaow(i14, (tg.iobyxmoadg) objYadqdtsiqt, null, false, this.f86053yggfygwlhe, draadjrbmkVar, 0, 12);
            if (!wkgbmnqykc.this.f86048iwizpuwonk.lqeggnwhkg()) {
                int i15 = s40.gxszxtbevo.ic_scan;
                draadjrbmkVar.sopmlzcsov(570712159);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(wkgbmnqykc.this);
                final wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.subcatalog.presentation.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return wkgbmnqykc.ppxfxbqfkf.gxszxtbevo(wkgbmnqykcVar2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                v40.gtknphoqwx.zoijcleaow(i15, (tg.iobyxmoadg) objYadqdtsiqt2, null, false, this.f86053yggfygwlhe, draadjrbmkVar, 0, 12);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements vdvldrhtss {
        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.gxszxtbevo.f86057iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            zoijcleaow((tbqsvytpvh) obj, (draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(tbqsvytpvh drawActionBar, draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            zdlpuopuiu.btonecajqb(drawActionBar, "$this$drawActionBar");
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.ulzqkzuiru(drawActionBar) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(825893951, i14, -1, "ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogViewImpl.bindActionBar.<anonymous> (SubCatalogViewImpl.kt:73)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(570674849);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(wkgbmnqykc.this);
            final wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.subcatalog.presentation.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(tbqsvytpvh.zoijcleaow(drawActionBar, androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar, null, null, false, null, null, (tg.iobyxmoadg) objYadqdtsiqt, 28, null), 1.0f, false, 2, null), nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.gxszxtbevo(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVar, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarRgvfuqvkyq);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.title_search, draadjrbmkVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVar, z.f44181zoijcleaow).iobyxmoadg(), draadjrbmkVar, 0, 0, 65534);
            draadjrbmkVar.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, SubCatalogArgs args) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(args, "args");
        this.f86049jyumaefscl = binding;
        this.f86048iwizpuwonk = args;
        this.f86047cqumvgiudr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ds.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc.wflxmlrfwp(this.f29411zdlpuopuiu);
            }
        });
        mbcevpiqjq mbcevpiqjqVar = (mbcevpiqjq) binding.invoke();
        RecyclerView rvSubCatalog = mbcevpiqjqVar.f65789lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvSubCatalog, "rvSubCatalog");
        e60.zoijcleaow.ppxfxbqfkf(rvSubCatalog, oxmwwwfdhm(), mbcevpiqjqVar);
        RecyclerView rvSubCatalog2 = mbcevpiqjqVar.f65789lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvSubCatalog2, "rvSubCatalog");
        yggfygwlhe(rvSubCatalog2);
        mbcevpiqjqVar.f65790nufgyqmvbu.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: ds.wflxmlrfwp
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc.kcexrzcfyt(this.f29420iobyxmoadg);
            }
        });
        FrameLayout returnToOrderContainer = mbcevpiqjqVar.f65786eablkybsjg;
        zdlpuopuiu.dxjokdxxww(returnToOrderContainer, "returnToOrderContainer");
        returnToOrderContainer.setVisibility(args.lqeggnwhkg() ? 0 : 8);
        MaterialButton mbtReturnToOrder = mbcevpiqjqVar.f65792wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(mbtReturnToOrder, "mbtReturnToOrder");
        mbtReturnToOrder.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar, es.draadjrbmk.ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.wkgbmnqykc(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.lqeggnwhkg.f86060iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, String bannerId) {
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.ppxfxbqfkf(bannerId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final es.iobyxmoadg oxmwwwfdhm() {
        return (es.iobyxmoadg) this.f86047cqumvgiudr.getValue();
    }

    private final void rgvfuqvkyq(mbcevpiqjq mbcevpiqjqVar, ColorsUiModel colorsUiModel) {
        long jZoijcleaow = bfopjjpdmp.zoijcleaow(colorsUiModel.wypolnanlu(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY));
        ComposeView cvActionBar = mbcevpiqjqVar.f65791ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.wkgbmnqykc(cvActionBar, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(825893951, true, new zoijcleaow()), false, new tg.iobyxmoadg() { // from class: ds.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc.vdvldrhtss(this.f29413zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(jZoijcleaow), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(329957563, true, new ppxfxbqfkf(jZoijcleaow)), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.C1976zoijcleaow.f86064iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final es.iobyxmoadg wflxmlrfwp(final wkgbmnqykc wkgbmnqykcVar) {
        return new es.iobyxmoadg(new tg.draadjrbmk() { // from class: ds.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc.agtfadlqog(this.f29405zdlpuopuiu, (es.draadjrbmk.ppxfxbqfkf) obj);
            }
        }, new tg.draadjrbmk() { // from class: ds.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc.ojitshcjhn(this.f29419zdlpuopuiu, (String) obj);
            }
        });
    }

    private final void yggfygwlhe(RecyclerView recyclerView) {
        recyclerView.btonecajqb(new wflxmlrfwp(recyclerView.getContext().getResources().getDimensionPixelOffset(s40.eablkybsjg.content_margin_8), recyclerView.getContext().getResources().getDimensionPixelOffset(s40.eablkybsjg.content_margin_24)));
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(mbcevpiqjq binding, btonecajqb model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        rgvfuqvkyq(binding, model.iobyxmoadg());
        ComposeView clLoading = binding.f65793zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.ppxfxbqfkf());
        binding.f65790nufgyqmvbu.setRefreshing(model.wkgbmnqykc());
        oxmwwwfdhm().wkgbmnqykc(mk.rgvfuqvkyq.yggfygwlhe(model.zoijcleaow()));
    }
}
