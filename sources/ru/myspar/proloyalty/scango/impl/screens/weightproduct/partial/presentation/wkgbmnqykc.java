package ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.presentation;

import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.imageview.ShapeableImageView;
import go1.oxmwwwfdhm;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.eablkybsjg;
import rp1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.iobyxmoadg f101157iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f101158jyumaefscl;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f101159jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f101160yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f101161zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f101161zdlpuopuiu = jpowsppfyaVar;
            this.f101160yggfygwlhe = j13;
            this.f101159jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f101161zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f101160yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f101159jyumaefscl.ppxfxbqfkf(zoijcleaow.C2437zoijcleaow.f101163iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, tg.iobyxmoadg onCartClicked) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(onCartClicked, "onCartClicked");
        this.f101158jyumaefscl = binding;
        this.f101157iwizpuwonk = onCartClicked;
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) binding.invoke();
        AppCompatImageButton btnDeleteProduct = oxmwwwfdhmVar.f38090ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnDeleteProduct, "btnDeleteProduct");
        btnDeleteProduct.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        oxmwwwfdhmVar.f38092zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: rp1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.presentation.wkgbmnqykc.nufgyqmvbu(this.f83578zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f101157iwizpuwonk.invoke();
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(oxmwwwfdhm binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ShapeableImageView ivProductPic = binding.f38091wkgbmnqykc.f38104ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPic, "ivProductPic");
        eablkybsjg.zoijcleaow(ivProductPic, model.iobyxmoadg().getPictureUrl());
        binding.f38088gxszxtbevo.setText(model.iobyxmoadg().getAmount());
        binding.f38091wkgbmnqykc.f38105wkgbmnqykc.setText(model.iobyxmoadg().getName());
        binding.f38091wkgbmnqykc.f38100eablkybsjg.setText(model.iobyxmoadg().getTotalPrice());
        binding.f38091wkgbmnqykc.f38101gxszxtbevo.setText(model.iobyxmoadg().getPricePerUnit());
        binding.f38091wkgbmnqykc.f38103lqeggnwhkg.setText(model.iobyxmoadg().getAmount());
    }
}
