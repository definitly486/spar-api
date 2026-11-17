package ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo;

import ab0.eablkybsjg;
import android.view.View;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.views.ComboProductsListTitle;
import tg.draadjrbmk;
import za0.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final eablkybsjg f88593iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final eablkybsjg f88594jyumaefscl;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, wkgbmnqykc.class, "onClickListItemProductsFirst", "onClickListItemProductsFirst(Lru/myspar/core/domain/models/comboset/ComboSetProduct;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ComboSetProduct) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ComboSetProduct p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((wkgbmnqykc) this.receiver).wflxmlrfwp(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, wkgbmnqykc.class, "onClickListItemProductsSecond", "onClickListItemProductsSecond(Lru/myspar/core/domain/models/comboset/ComboSetProduct;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ComboSetProduct) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ComboSetProduct p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((wkgbmnqykc) this.receiver).agtfadlqog(p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        eablkybsjg eablkybsjgVar = new eablkybsjg(new iobyxmoadg(this));
        this.f88594jyumaefscl = eablkybsjgVar;
        eablkybsjg eablkybsjgVar2 = new eablkybsjg(new zoijcleaow(this));
        this.f88593iwizpuwonk = eablkybsjgVar2;
        m60.zoijcleaow zoijcleaowVar = (m60.zoijcleaow) binding.invoke();
        zoijcleaowVar.f66207wkgbmnqykc.setAdapter(eablkybsjgVar);
        zoijcleaowVar.f66202eablkybsjg.setAdapter(eablkybsjgVar2);
        zoijcleaowVar.f66206ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: za0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.gtknphoqwx(this.f129447zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f66208zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: za0.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.draadjrbmk(this.f129442zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog(ComboSetProduct comboSetProduct) {
        ppxfxbqfkf(new ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.wkgbmnqykc(comboSetProduct));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.iobyxmoadg.f88595iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.C2032zoijcleaow.f88598iobyxmoadg);
    }

    private final void rgvfuqvkyq(ComboProductsListTitle comboProductsListTitle, int i13) {
        if (i13 <= 1) {
            comboProductsListTitle.ppxfxbqfkf();
        } else {
            comboProductsListTitle.wkgbmnqykc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wflxmlrfwp(ComboSetProduct comboSetProduct) {
        ppxfxbqfkf(new ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.ppxfxbqfkf(comboSetProduct));
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m60.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComboProductsListTitle titleProductsFirst = binding.f66203gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(titleProductsFirst, "titleProductsFirst");
        rgvfuqvkyq(titleProductsFirst, model.iobyxmoadg().size());
        this.f88594jyumaefscl.wkgbmnqykc(model.iobyxmoadg());
        ComboProductsListTitle titleProductsSecond = binding.f66205lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(titleProductsSecond, "titleProductsSecond");
        rgvfuqvkyq(titleProductsSecond, model.zoijcleaow().size());
        this.f88593iwizpuwonk.wkgbmnqykc(model.zoijcleaow());
    }
}
