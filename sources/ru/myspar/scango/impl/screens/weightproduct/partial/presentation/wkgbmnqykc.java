package ru.myspar.scango.impl.screens.weightproduct.partial.presentation;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.imageview.ShapeableImageView;
import k22.oxmwwwfdhm;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import v32.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.iobyxmoadg f103814iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f103815jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f103816jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103818zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f103818zdlpuopuiu = jpowsppfyaVar;
            this.f103817yggfygwlhe = j13;
            this.f103816jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103818zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103817yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f103816jyumaefscl.ppxfxbqfkf(zoijcleaow.C2516zoijcleaow.f103820iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, tg.iobyxmoadg onCartClicked) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(onCartClicked, "onCartClicked");
        this.f103815jyumaefscl = binding;
        this.f103814iwizpuwonk = onCartClicked;
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) binding.invoke();
        AppCompatImageButton btnDeleteProduct = oxmwwwfdhmVar.f53623ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnDeleteProduct, "btnDeleteProduct");
        btnDeleteProduct.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        oxmwwwfdhmVar.f53625zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: v32.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.weightproduct.partial.presentation.wkgbmnqykc.nufgyqmvbu(this.f115938zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f103814iwizpuwonk.invoke();
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(oxmwwwfdhm binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ShapeableImageView ivProductPic = binding.f53624wkgbmnqykc.f53637ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPic, "ivProductPic");
        c60.wkgbmnqykc.zoijcleaow(ivProductPic, model.iobyxmoadg().getPictureUrl());
        binding.f53621gxszxtbevo.setText(model.iobyxmoadg().getAmount());
        binding.f53624wkgbmnqykc.f53638wkgbmnqykc.setText(model.iobyxmoadg().getName());
        binding.f53624wkgbmnqykc.f53633eablkybsjg.setText(model.iobyxmoadg().getTotalPrice());
        binding.f53624wkgbmnqykc.f53634gxszxtbevo.setText(model.iobyxmoadg().getPricePerUnit());
        binding.f53624wkgbmnqykc.f53636lqeggnwhkg.setText(model.iobyxmoadg().getAmount());
    }
}
