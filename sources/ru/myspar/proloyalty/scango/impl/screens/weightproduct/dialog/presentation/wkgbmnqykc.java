package ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import pp1.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f101121jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f101122jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f101123yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f101124zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f101124zdlpuopuiu = jpowsppfyaVar;
            this.f101123yggfygwlhe = j13;
            this.f101122jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f101124zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f101123yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f101122jyumaefscl.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f101125iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f101121jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: pp1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation.wkgbmnqykc.dxjokdxxww(this.f77119zdlpuopuiu);
            }
        });
        AppCompatImageButton btnDeleteProduct = ((go1.wkgbmnqykc) binding.invoke()).f38112zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnDeleteProduct, "btnDeleteProduct");
        btnDeleteProduct.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho1.zoijcleaow dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        return new ho1.zoijcleaow(wkgbmnqykcVar.wkgbmnqykc());
    }

    private final void gtknphoqwx(boolean z13) {
        if (z13) {
            nufgyqmvbu().show();
        } else {
            nufgyqmvbu().dismiss();
        }
    }

    private final ho1.zoijcleaow nufgyqmvbu() {
        return (ho1.zoijcleaow) this.f101121jyumaefscl.getValue();
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(go1.wkgbmnqykc binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        gtknphoqwx(model.gxszxtbevo());
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(wkgbmnqykc()).kcexrzcfyt(model.ppxfxbqfkf()).wizcaqwiak(binding.f38111wkgbmnqykc.f38104ppxfxbqfkf);
        binding.f38108gxszxtbevo.setText(model.iobyxmoadg());
        binding.f38111wkgbmnqykc.f38105wkgbmnqykc.setText(model.zoijcleaow());
        binding.f38111wkgbmnqykc.f38100eablkybsjg.setText(model.eablkybsjg());
        binding.f38111wkgbmnqykc.f38101gxszxtbevo.setText(model.wkgbmnqykc());
        binding.f38111wkgbmnqykc.f38103lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
