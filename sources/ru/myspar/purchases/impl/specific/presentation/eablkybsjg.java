package ru.myspar.purchases.impl.specific.presentation;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.pmvmpeiblj;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.models.measure_type.MeasureType;
import ry1.dxjokdxxww;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f102592iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f102593jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f102593jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ry1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.oxmwwwfdhm(this.f105057zdlpuopuiu);
            }
        });
        this.f102592iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ry1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.vdvldrhtss(this.f105047zdlpuopuiu);
            }
        });
        sx1.eablkybsjg eablkybsjgVar = (sx1.eablkybsjg) binding.invoke();
        eablkybsjgVar.f108647zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ry1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.purchases.impl.specific.presentation.eablkybsjg.rgvfuqvkyq(this.f105063zdlpuopuiu, view);
            }
        });
        eablkybsjgVar.f108641nufgyqmvbu.btonecajqb(agtfadlqog());
        eablkybsjgVar.f108641nufgyqmvbu.setAdapter(ojitshcjhn());
    }

    private final t40.zoijcleaow agtfadlqog() {
        return (t40.zoijcleaow) this.f102592iwizpuwonk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2481ppxfxbqfkf.f102604iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(eablkybsjg eablkybsjgVar, mx1.iobyxmoadg model, double d13, MeasureType measureType) {
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(new qy1.iobyxmoadg.zoijcleaow(model.iobyxmoadg(), d13, measureType, model.gxszxtbevo(), model.wkgbmnqykc())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final sy1.gtknphoqwx ojitshcjhn() {
        return (sy1.gtknphoqwx) this.f102593jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sy1.gtknphoqwx oxmwwwfdhm(final eablkybsjg eablkybsjgVar) {
        return new sy1.gtknphoqwx(new vdvldrhtss() { // from class: ry1.agtfadlqog
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.kcexrzcfyt(this.f105045zdlpuopuiu, (mx1.iobyxmoadg) obj, ((Double) obj2).doubleValue(), (MeasureType) obj3);
            }
        }, new rgvfuqvkyq() { // from class: ry1.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.zdlpuopuiu(this.f105059zdlpuopuiu, (mx1.iobyxmoadg) obj, ((Integer) obj2).intValue());
            }
        }, new tg.draadjrbmk() { // from class: ry1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.yggfygwlhe(this.f105062zdlpuopuiu, (mx1.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f102600iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t40.zoijcleaow vdvldrhtss(eablkybsjg eablkybsjgVar) {
        return t40.zoijcleaow.f109665lqeggnwhkg.iobyxmoadg(eablkybsjgVar.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(eablkybsjg eablkybsjgVar, mx1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.eablkybsjg(it.iobyxmoadg(), new AnalyticElement.ProductItemElement(it.iobyxmoadg(), it.ppxfxbqfkf())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(eablkybsjg eablkybsjgVar, mx1.iobyxmoadg model, int i13) {
        zdlpuopuiu.btonecajqb(model, "model");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(model.iobyxmoadg(), pmvmpeiblj.zoijcleaow(i13), null));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(sx1.eablkybsjg binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f108643ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.lqeggnwhkg());
        ComposeView cvActionBar = binding.f108646wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(model.gxszxtbevo());
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ry1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.purchases.impl.specific.presentation.eablkybsjg.iwizpuwonk(this.f105046zdlpuopuiu);
            }
        }, null, null, 109, null);
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        if (listPpxfxbqfkf != null) {
            ojitshcjhn().wkgbmnqykc(listPpxfxbqfkf);
        }
        LinearLayout llDeliveryTypeContainer = binding.f108638gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(llDeliveryTypeContainer, "llDeliveryTypeContainer");
        llDeliveryTypeContainer.setVisibility(model.iobyxmoadg() != null ? 0 : 8);
        uy1.iobyxmoadg iobyxmoadgVarIobyxmoadg = model.iobyxmoadg();
        if (iobyxmoadgVarIobyxmoadg != null) {
            String strZoijcleaow = iobyxmoadgVarIobyxmoadg.zoijcleaow();
            if (strZoijcleaow != null) {
                binding.f108645wflxmlrfwp.setText(strZoijcleaow);
            }
            MaterialTextView tvOrderDate = binding.f108645wflxmlrfwp;
            zdlpuopuiu.dxjokdxxww(tvOrderDate, "tvOrderDate");
            tvOrderDate.setVisibility(iobyxmoadgVarIobyxmoadg.zoijcleaow() != null ? 0 : 8);
            MaterialTextView tvOrderDateHeader = binding.f108632agtfadlqog;
            zdlpuopuiu.dxjokdxxww(tvOrderDateHeader, "tvOrderDateHeader");
            tvOrderDateHeader.setVisibility(iobyxmoadgVarIobyxmoadg.zoijcleaow() != null ? 0 : 8);
            String strIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg();
            if (strIobyxmoadg != null) {
                binding.f108633btonecajqb.setText(strIobyxmoadg);
            }
            MaterialTextView tvAddress = binding.f108633btonecajqb;
            zdlpuopuiu.dxjokdxxww(tvAddress, "tvAddress");
            tvAddress.setVisibility(iobyxmoadgVarIobyxmoadg.iobyxmoadg() != null ? 0 : 8);
            MaterialTextView tvAddressHeader = binding.f108637gtknphoqwx;
            zdlpuopuiu.dxjokdxxww(tvAddressHeader, "tvAddressHeader");
            tvAddressHeader.setVisibility(iobyxmoadgVarIobyxmoadg.iobyxmoadg() != null ? 0 : 8);
        }
        LinearLayout priceContainer = binding.f108640lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(priceContainer, "priceContainer");
        priceContainer.setVisibility(model.zoijcleaow() != null ? 0 : 8);
        Price priceZoijcleaow = model.zoijcleaow();
        if (priceZoijcleaow != null) {
            binding.f108642ojitshcjhn.setText(priceZoijcleaow.getPrice());
            binding.f108644rgvfuqvkyq.setText(priceZoijcleaow.getPriceFractional());
        }
        FrameLayout flRepeatPurchaseContainer = binding.f108636eablkybsjg;
        zdlpuopuiu.dxjokdxxww(flRepeatPurchaseContainer, "flRepeatPurchaseContainer");
        flRepeatPurchaseContainer.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        binding.f108647zoijcleaow.setText(model.eablkybsjg());
    }
}
