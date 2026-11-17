package ru.myspar.evropolis.impl.gift.presentation;

import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import da0.lqeggnwhkg;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import s40.eablkybsjg;
import t40.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f88337jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f88338jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88339yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88340zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f88340zdlpuopuiu = jpowsppfyaVar;
            this.f88339yggfygwlhe = j13;
            this.f88338jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88340zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88339yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f88338jyumaefscl.ppxfxbqfkf(ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.C2026zoijcleaow.f88349iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f88341jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f88342yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f88343zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f88343zdlpuopuiu = jpowsppfyaVar;
            this.f88342yggfygwlhe = j13;
            this.f88341jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f88343zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f88342yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f88341jyumaefscl.ppxfxbqfkf(ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.eablkybsjg.f88344iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, final ee0.ppxfxbqfkf imageUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f88337jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ca0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc.draadjrbmk(imageUtils, this);
            }
        });
        RecyclerView recyclerView = ((y90.iobyxmoadg) binding.invoke()).f124204eablkybsjg;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, gtknphoqwx(), (a6.iobyxmoadg) binding.invoke());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.btonecajqb(new nufgyqmvbu(0, 0, 0, recyclerView.getContext().getResources().getDimensionPixelOffset(eablkybsjg.content_margin_16), 0, 0, false, false, 247, null));
        recyclerView.setItemAnimator(null);
        MaterialButton buttonPrimary = ((y90.iobyxmoadg) binding.invoke()).f124208zoijcleaow;
        zdlpuopuiu.dxjokdxxww(buttonPrimary, "buttonPrimary");
        buttonPrimary.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        MaterialButton buttonSecondary = ((y90.iobyxmoadg) binding.invoke()).f124206ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(buttonSecondary, "buttonSecondary");
        buttonSecondary.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.wkgbmnqykc.f88348iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg draadjrbmk(ee0.ppxfxbqfkf ppxfxbqfkfVar, final wkgbmnqykc wkgbmnqykcVar) {
        return new lqeggnwhkg(ppxfxbqfkfVar, new tg.draadjrbmk() { // from class: ca0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc.wflxmlrfwp(this.f19383zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ca0.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc.agtfadlqog(this.f19366zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: ca0.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc.ojitshcjhn(this.f19380zdlpuopuiu, (String) obj);
            }
        });
    }

    private final lqeggnwhkg gtknphoqwx() {
        return (lqeggnwhkg) this.f88337jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, String tabId) {
        zdlpuopuiu.btonecajqb(tabId, "tabId");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.gxszxtbevo(tabId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, ProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(y90.iobyxmoadg binding, ca0.gtknphoqwx model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        gtknphoqwx().wkgbmnqykc(model.zoijcleaow());
        ColorStateList colorStateListOkpsazkaxt = model.iobyxmoadg().okpsazkaxt(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        MaterialButton materialButton = binding.f124208zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(materialButton);
        materialButton.setVisibility(model.ppxfxbqfkf() != null ? 0 : 8);
        if (materialButton.getVisibility() == 0) {
            String strPpxfxbqfkf = model.ppxfxbqfkf();
            if (strPpxfxbqfkf != null) {
                materialButton.setText(strPpxfxbqfkf);
            }
            materialButton.setBackgroundTintList(colorStateListOkpsazkaxt);
        }
        MaterialButton materialButton2 = binding.f124206ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(materialButton2);
        materialButton2.setVisibility(model.wkgbmnqykc() != null ? 0 : 8);
        if (materialButton2.getVisibility() == 0) {
            String strWkgbmnqykc = model.wkgbmnqykc();
            if (strWkgbmnqykc != null) {
                materialButton2.setText(strWkgbmnqykc);
            }
            materialButton2.setStrokeColor(colorStateListOkpsazkaxt);
            materialButton2.setTextColor(colorStateListOkpsazkaxt);
        }
    }
}
