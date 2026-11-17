package ru.myspar.proloyalty.options.impl.themeswitch.presentation;

import android.widget.RadioGroup;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import vf1.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f98623jyumaefscl;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f98624iobyxmoadg;

        static {
            int[] iArr = new int[oz0.iobyxmoadg.values().length];
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98624iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(final tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f98623jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: vf1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.options.impl.themeswitch.presentation.wkgbmnqykc.gtknphoqwx(binding, this);
            }
        });
    }

    private final RadioGroup.OnCheckedChangeListener btonecajqb() {
        return (RadioGroup.OnCheckedChangeListener) this.f98623jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, RadioGroup radioGroup, int i13) {
        zdlpuopuiu.btonecajqb(radioGroup, "<unused var>");
        nf1.iobyxmoadg iobyxmoadgVar2 = (nf1.iobyxmoadg) iobyxmoadgVar.invoke();
        if (i13 == iobyxmoadgVar2.f70026wkgbmnqykc.getId()) {
            wkgbmnqykcVar.dxjokdxxww(oz0.iobyxmoadg.DARK_MODE_OFF);
        } else if (i13 == iobyxmoadgVar2.f70025ppxfxbqfkf.getId()) {
            wkgbmnqykcVar.dxjokdxxww(oz0.iobyxmoadg.DARK_MODE_ON);
        } else if (i13 == iobyxmoadgVar2.f70022eablkybsjg.getId()) {
            wkgbmnqykcVar.dxjokdxxww(oz0.iobyxmoadg.DARK_MODE_SYSTEM);
        }
    }

    private final void dxjokdxxww(oz0.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new zoijcleaow.iobyxmoadg(iobyxmoadgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioGroup.OnCheckedChangeListener gtknphoqwx(final tg.iobyxmoadg iobyxmoadgVar, final wkgbmnqykc wkgbmnqykcVar) {
        return new RadioGroup.OnCheckedChangeListener() { // from class: vf1.nufgyqmvbu
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                ru.myspar.proloyalty.options.impl.themeswitch.presentation.wkgbmnqykc.draadjrbmk(iobyxmoadgVar, wkgbmnqykcVar, radioGroup, i13);
            }
        };
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(nf1.iobyxmoadg binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f70023gxszxtbevo.setOnCheckedChangeListener(null);
        int i13 = iobyxmoadg.f98624iobyxmoadg[model.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            binding.f70022eablkybsjg.setChecked(true);
        } else if (i13 == 2) {
            binding.f70025ppxfxbqfkf.setChecked(true);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            binding.f70026wkgbmnqykc.setChecked(true);
        }
        binding.f70023gxszxtbevo.setOnCheckedChangeListener(btonecajqb());
    }
}
