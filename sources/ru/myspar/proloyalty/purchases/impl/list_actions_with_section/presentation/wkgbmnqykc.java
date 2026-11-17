package ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation;

import android.view.View;
import ij1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ti1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f99652iobyxmoadg;

        static {
            int[] iArr = new int[gk1.iobyxmoadg.values().length];
            try {
                iArr[gk1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gk1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99652iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        yi1.iobyxmoadg iobyxmoadgVar = (yi1.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f125427ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ij1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc.dxjokdxxww(this.f44588zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f125429zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ij1.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc.btonecajqb(this.f44585zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f99653iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2388zoijcleaow.f99654iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yi1.iobyxmoadg binding, lqeggnwhkg model) {
        int i13;
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        int i14 = iobyxmoadg.f99652iobyxmoadg[model.iobyxmoadg().ordinal()];
        if (i14 == 1) {
            i13 = nufgyqmvbu.proloyalty_move_to_bought;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = nufgyqmvbu.proloyalty_move_to_buy;
        }
        binding.f125427ppxfxbqfkf.setText(i13);
    }
}
