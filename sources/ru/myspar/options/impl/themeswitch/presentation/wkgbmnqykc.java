package ru.myspar.options.impl.themeswitch.presentation;

import android.widget.RadioGroup;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import vi0.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f90972jyumaefscl;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f90973iobyxmoadg;

        static {
            int[] iArr = new int[x00.iobyxmoadg.values().length];
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f90973iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(final tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f90972jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: vi0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.options.impl.themeswitch.presentation.wkgbmnqykc.gtknphoqwx(binding, this);
            }
        });
    }

    private final RadioGroup.OnCheckedChangeListener btonecajqb() {
        return (RadioGroup.OnCheckedChangeListener) this.f90972jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, RadioGroup radioGroup, int i13) {
        zdlpuopuiu.btonecajqb(radioGroup, "<unused var>");
        ni0.iobyxmoadg iobyxmoadgVar2 = (ni0.iobyxmoadg) iobyxmoadgVar.invoke();
        if (i13 == iobyxmoadgVar2.f70120wkgbmnqykc.getId()) {
            wkgbmnqykcVar.dxjokdxxww(x00.iobyxmoadg.DARK_MODE_OFF);
        } else if (i13 == iobyxmoadgVar2.f70119ppxfxbqfkf.getId()) {
            wkgbmnqykcVar.dxjokdxxww(x00.iobyxmoadg.DARK_MODE_ON);
        } else if (i13 == iobyxmoadgVar2.f70116eablkybsjg.getId()) {
            wkgbmnqykcVar.dxjokdxxww(x00.iobyxmoadg.DARK_MODE_SYSTEM);
        }
    }

    private final void dxjokdxxww(x00.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new zoijcleaow.iobyxmoadg(iobyxmoadgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioGroup.OnCheckedChangeListener gtknphoqwx(final tg.iobyxmoadg iobyxmoadgVar, final wkgbmnqykc wkgbmnqykcVar) {
        return new RadioGroup.OnCheckedChangeListener() { // from class: vi0.nufgyqmvbu
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                ru.myspar.options.impl.themeswitch.presentation.wkgbmnqykc.draadjrbmk(iobyxmoadgVar, wkgbmnqykcVar, radioGroup, i13);
            }
        };
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ni0.iobyxmoadg binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f70117gxszxtbevo.setOnCheckedChangeListener(null);
        int i13 = iobyxmoadg.f90973iobyxmoadg[model.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            binding.f70116eablkybsjg.setChecked(true);
        } else if (i13 == 2) {
            binding.f70119ppxfxbqfkf.setChecked(true);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            binding.f70120wkgbmnqykc.setChecked(true);
        }
        binding.f70117gxszxtbevo.setOnCheckedChangeListener(btonecajqb());
    }
}
