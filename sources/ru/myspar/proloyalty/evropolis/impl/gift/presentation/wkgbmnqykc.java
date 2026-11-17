package ru.myspar.proloyalty.evropolis.impl.gift.presentation;

import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b31.eablkybsjg;
import c31.nufgyqmvbu;
import com.google.android.material.button.MaterialButton;
import g81.btonecajqb;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h81.lqeggnwhkg;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f96156jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f96157jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96158yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96159zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f96159zdlpuopuiu = jpowsppfyaVar;
            this.f96158yggfygwlhe = j13;
            this.f96157jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96159zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96158yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f96157jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow.iobyxmoadg.f96164iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f96160jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f96161yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f96162zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f96162zdlpuopuiu = jpowsppfyaVar;
            this.f96161yggfygwlhe = j13;
            this.f96160jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f96162zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f96161yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f96160jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow.wkgbmnqykc.f96166iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, final ac1.ppxfxbqfkf imageUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f96156jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: g81.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc.draadjrbmk(imageUtils, this);
            }
        });
        RecyclerView recyclerView = ((c81.iobyxmoadg) binding.invoke()).f19234eablkybsjg;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, gtknphoqwx(), (a6.iobyxmoadg) binding.invoke());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.btonecajqb(new nufgyqmvbu(0, 0, 0, recyclerView.getContext().getResources().getDimensionPixelOffset(eablkybsjg.content_margin_16), 0, 0, false, false, 247, null));
        recyclerView.setItemAnimator(null);
        MaterialButton buttonPrimary = ((c81.iobyxmoadg) binding.invoke()).f19238zoijcleaow;
        zdlpuopuiu.dxjokdxxww(buttonPrimary, "buttonPrimary");
        buttonPrimary.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        MaterialButton buttonSecondary = ((c81.iobyxmoadg) binding.invoke()).f19236ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(buttonSecondary, "buttonSecondary");
        buttonSecondary.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow.ppxfxbqfkf.f96165iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg draadjrbmk(ac1.ppxfxbqfkf ppxfxbqfkfVar, final wkgbmnqykc wkgbmnqykcVar) {
        return new lqeggnwhkg(ppxfxbqfkfVar, new tg.draadjrbmk() { // from class: g81.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc.wflxmlrfwp(this.f36648zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.iobyxmoadg() { // from class: g81.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc.agtfadlqog(this.f36658zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: g81.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc.ojitshcjhn(this.f36642zdlpuopuiu, (String) obj);
            }
        });
    }

    private final lqeggnwhkg gtknphoqwx() {
        return (lqeggnwhkg) this.f96156jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, String tabId) {
        zdlpuopuiu.btonecajqb(tabId, "tabId");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow.eablkybsjg(tabId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, ProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow.C2270zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(c81.iobyxmoadg binding, btonecajqb model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        gtknphoqwx().wkgbmnqykc(model.zoijcleaow());
        ColorStateList colorStateListV = model.iobyxmoadg().V(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        MaterialButton materialButton = binding.f19238zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(materialButton);
        materialButton.setVisibility(model.ppxfxbqfkf() != null ? 0 : 8);
        if (materialButton.getVisibility() == 0) {
            String strPpxfxbqfkf = model.ppxfxbqfkf();
            if (strPpxfxbqfkf != null) {
                materialButton.setText(strPpxfxbqfkf);
            }
            materialButton.setBackgroundTintList(colorStateListV);
        }
        MaterialButton materialButton2 = binding.f19236ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(materialButton2);
        materialButton2.setVisibility(model.wkgbmnqykc() != null ? 0 : 8);
        if (materialButton2.getVisibility() == 0) {
            String strWkgbmnqykc = model.wkgbmnqykc();
            if (strWkgbmnqykc != null) {
                materialButton2.setText(strWkgbmnqykc);
            }
            materialButton2.setStrokeColor(colorStateListV);
            materialButton2.setTextColor(colorStateListV);
        }
    }
}
