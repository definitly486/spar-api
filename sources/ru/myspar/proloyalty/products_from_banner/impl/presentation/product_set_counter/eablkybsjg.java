package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import di1.gxszxtbevo;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p41.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99389jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99390yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99391zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f99391zdlpuopuiu = jpowsppfyaVar;
            this.f99390yggfygwlhe = j13;
            this.f99389jyumaefscl = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99391zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99390yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f99389jyumaefscl.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((vh1.zoijcleaow) binding.invoke()).f116851wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: di1.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.gtknphoqwx(this.f29000zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2376ppxfxbqfkf.f99398iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void btonecajqb(ImageView imageView, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        if (z13) {
            nufgyqmvbu.gxszxtbevo(imageView, b31.ppxfxbqfkf.colorPrimary1);
            imageView.setClickable(true);
            imageView.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, iobyxmoadgVar));
        } else {
            nufgyqmvbu.gxszxtbevo(imageView, b31.ppxfxbqfkf.colorPrimary2);
            imageView.setClickable(false);
            imageView.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f99397iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f99399iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(vh1.zoijcleaow binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f116849vdvldrhtss.setText(model.ppxfxbqfkf());
        binding.f116846oxmwwwfdhm.setText(model.wkgbmnqykc());
        binding.f116845ojitshcjhn.setText(model.eablkybsjg());
        binding.f116848rgvfuqvkyq.setText(model.gxszxtbevo());
        TextView textView = binding.f116834agtfadlqog;
        textView.setText(model.iobyxmoadg());
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(!kcexrzcfyt.zfvoamnweg(model.iobyxmoadg()) ? 0 : 8);
        binding.f116850wflxmlrfwp.setText(model.zoijcleaow());
        ImageView ivBtnDecrement = binding.f116843lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivBtnDecrement, "ivBtnDecrement");
        btonecajqb(ivBtnDecrement, model.lqeggnwhkg(), new tg.iobyxmoadg() { // from class: di1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.wflxmlrfwp(this.f29009zdlpuopuiu);
            }
        });
        ImageView ivBtnIncrement = binding.f116844nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivBtnIncrement, "ivBtnIncrement");
        btonecajqb(ivBtnIncrement, model.nufgyqmvbu(), new tg.iobyxmoadg() { // from class: di1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.agtfadlqog(this.f29010zdlpuopuiu);
            }
        });
    }
}
