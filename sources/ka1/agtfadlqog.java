package ka1;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.legacy.presentation.screen.filtersall.models.FilterValueUiModel;
import z41.iwizpuwonk;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f54357iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ColorsUiModel f54358jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f54357iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ka1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.wflxmlrfwp(this.f54366zdlpuopuiu);
            }
        });
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) binding.invoke();
        iwizpuwonkVar.f128134wkgbmnqykc.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        iwizpuwonkVar.f128134wkgbmnqykc.setAdapter(ojitshcjhn());
        iwizpuwonkVar.f128135zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ka1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.rgvfuqvkyq(this.f54360zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(agtfadlqog agtfadlqogVar, FilterValueUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqogVar.ppxfxbqfkf(new nufgyqmvbu.ppxfxbqfkf(it.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(agtfadlqog agtfadlqogVar) {
        agtfadlqogVar.ppxfxbqfkf(nufgyqmvbu.zoijcleaow.f54371iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void gtknphoqwx(iwizpuwonk iwizpuwonkVar, ColorsUiModel colorsUiModel, String str) {
        long jZoijcleaow = bfopjjpdmp.zoijcleaow(colorsUiModel.xrmfcynszj(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY));
        ComposeView cvActionBar = iwizpuwonkVar.f128133ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, str, null, false, new tg.iobyxmoadg() { // from class: ka1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.draadjrbmk(this.f54359zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(jZoijcleaow), null, 77, null);
    }

    private final la1.gxszxtbevo ojitshcjhn() {
        return (la1.gxszxtbevo) this.f54357iwizpuwonk.getValue();
    }

    private final void oxmwwwfdhm(iwizpuwonk iwizpuwonkVar, ColorsUiModel colorsUiModel) {
        int iXrmfcynszj = colorsUiModel.xrmfcynszj(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
        ColorStateList colorStateListV = colorsUiModel.V(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        iwizpuwonkVar.f128135zoijcleaow.setTextColor(iXrmfcynszj);
        iwizpuwonkVar.f128135zoijcleaow.setBackgroundTintList(colorStateListV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(agtfadlqog agtfadlqogVar, View view) {
        agtfadlqogVar.ppxfxbqfkf(nufgyqmvbu.iobyxmoadg.f54369iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final la1.gxszxtbevo wflxmlrfwp(final agtfadlqog agtfadlqogVar) {
        return new la1.gxszxtbevo(new tg.draadjrbmk() { // from class: ka1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.agtfadlqog(this.f54375zdlpuopuiu, (FilterValueUiModel) obj);
            }
        });
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(iwizpuwonk binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        if (!zdlpuopuiu.eablkybsjg(this.f54358jyumaefscl, model.iobyxmoadg())) {
            oxmwwwfdhm(binding, model.iobyxmoadg());
            gtknphoqwx(binding, model.iobyxmoadg(), model.ppxfxbqfkf());
            this.f54358jyumaefscl = model.iobyxmoadg();
        }
        binding.f128135zoijcleaow.setEnabled(model.wkgbmnqykc());
        ojitshcjhn().wkgbmnqykc(model.zoijcleaow());
    }
}
