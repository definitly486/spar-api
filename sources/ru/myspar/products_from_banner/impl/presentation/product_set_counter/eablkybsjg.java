package ru.myspar.products_from_banner.impl.presentation.product_set_counter;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c60.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import nk0.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f91694jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f91695yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f91696zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f91696zdlpuopuiu = jpowsppfyaVar;
            this.f91695yggfygwlhe = j13;
            this.f91694jyumaefscl = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f91696zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f91695yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f91694jyumaefscl.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((fk0.zoijcleaow) binding.invoke()).f34294wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: nk0.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.gtknphoqwx(this.f70259zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2129ppxfxbqfkf.f91703iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void btonecajqb(ImageView imageView, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        if (z13) {
            lqeggnwhkg.gxszxtbevo(imageView, s40.ppxfxbqfkf.colorPrimary1);
            imageView.setClickable(true);
            imageView.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, iobyxmoadgVar));
        } else {
            lqeggnwhkg.gxszxtbevo(imageView, s40.ppxfxbqfkf.colorPrimary2);
            imageView.setClickable(false);
            imageView.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f91702iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f91704iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(fk0.zoijcleaow binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f34292vdvldrhtss.setText(model.ppxfxbqfkf());
        binding.f34289oxmwwwfdhm.setText(model.wkgbmnqykc());
        binding.f34288ojitshcjhn.setText(model.eablkybsjg());
        binding.f34291rgvfuqvkyq.setText(model.gxszxtbevo());
        TextView textView = binding.f34277agtfadlqog;
        textView.setText(model.iobyxmoadg());
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(!kcexrzcfyt.zfvoamnweg(model.iobyxmoadg()) ? 0 : 8);
        binding.f34293wflxmlrfwp.setText(model.zoijcleaow());
        ImageView ivBtnDecrement = binding.f34286lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivBtnDecrement, "ivBtnDecrement");
        btonecajqb(ivBtnDecrement, model.lqeggnwhkg(), new tg.iobyxmoadg() { // from class: nk0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.wflxmlrfwp(this.f70268zdlpuopuiu);
            }
        });
        ImageView ivBtnIncrement = binding.f34287nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivBtnIncrement, "ivBtnIncrement");
        btonecajqb(ivBtnIncrement, model.nufgyqmvbu(), new tg.iobyxmoadg() { // from class: nk0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.products_from_banner.impl.presentation.product_set_counter.eablkybsjg.agtfadlqog(this.f70269zdlpuopuiu);
            }
        });
    }
}
