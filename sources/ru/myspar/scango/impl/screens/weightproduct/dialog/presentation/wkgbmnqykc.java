package ru.myspar.scango.impl.screens.weightproduct.dialog.presentation;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import t32.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f103778jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f103779jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103780yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103781zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f103781zdlpuopuiu = jpowsppfyaVar;
            this.f103780yggfygwlhe = j13;
            this.f103779jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103781zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103780yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f103779jyumaefscl.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f103782iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f103778jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: t32.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.weightproduct.dialog.presentation.wkgbmnqykc.dxjokdxxww(this.f109611zdlpuopuiu);
            }
        });
        AppCompatImageButton btnDeleteProduct = ((k22.wkgbmnqykc) binding.invoke()).f53645zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnDeleteProduct, "btnDeleteProduct");
        btnDeleteProduct.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l22.zoijcleaow dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        return new l22.zoijcleaow(wkgbmnqykcVar.wkgbmnqykc());
    }

    private final void gtknphoqwx(boolean z13) {
        if (z13) {
            nufgyqmvbu().show();
        } else {
            nufgyqmvbu().dismiss();
        }
    }

    private final l22.zoijcleaow nufgyqmvbu() {
        return (l22.zoijcleaow) this.f103778jyumaefscl.getValue();
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(k22.wkgbmnqykc binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        gtknphoqwx(model.gxszxtbevo());
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(wkgbmnqykc()).kcexrzcfyt(model.ppxfxbqfkf()).wizcaqwiak(binding.f53644wkgbmnqykc.f53637ppxfxbqfkf);
        binding.f53641gxszxtbevo.setText(model.iobyxmoadg());
        binding.f53644wkgbmnqykc.f53638wkgbmnqykc.setText(model.zoijcleaow());
        binding.f53644wkgbmnqykc.f53633eablkybsjg.setText(model.eablkybsjg());
        binding.f53644wkgbmnqykc.f53634gxszxtbevo.setText(model.wkgbmnqykc());
        binding.f53644wkgbmnqykc.f53636lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
