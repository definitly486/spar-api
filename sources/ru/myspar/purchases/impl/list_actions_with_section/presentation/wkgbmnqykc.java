package ru.myspar.purchases.impl.list_actions_with_section.presentation;

import android.view.View;
import cy1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import nx1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f102360iobyxmoadg;

        static {
            int[] iArr = new int[az1.iobyxmoadg.values().length];
            try {
                iArr[az1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[az1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102360iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        sx1.iobyxmoadg iobyxmoadgVar = (sx1.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f108656ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: cy1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc.dxjokdxxww(this.f26191zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f108658zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: cy1.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc.btonecajqb(this.f26188zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f102361iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2470zoijcleaow.f102362iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(sx1.iobyxmoadg binding, lqeggnwhkg model) {
        int i13;
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        int i14 = iobyxmoadg.f102360iobyxmoadg[model.iobyxmoadg().ordinal()];
        if (i14 == 1) {
            i13 = nufgyqmvbu.move_to_bought;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = nufgyqmvbu.move_to_buy;
        }
        binding.f108656ppxfxbqfkf.setText(i13);
    }
}
