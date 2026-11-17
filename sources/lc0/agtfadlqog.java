package lc0;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.zynmafqrjb;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.legacy.presentation.screen.filtersall.models.FilterValueUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f62049iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ColorsUiModel f62050jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f62049iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: lc0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.wflxmlrfwp(this.f62051zdlpuopuiu);
            }
        });
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) binding.invoke();
        zynmafqrjbVar.f66212wkgbmnqykc.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        zynmafqrjbVar.f66212wkgbmnqykc.setAdapter(ojitshcjhn());
        zynmafqrjbVar.f66213zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: lc0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.rgvfuqvkyq(this.f62058zdlpuopuiu, view);
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
        agtfadlqogVar.ppxfxbqfkf(nufgyqmvbu.zoijcleaow.f62063iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void gtknphoqwx(zynmafqrjb zynmafqrjbVar, ColorsUiModel colorsUiModel, String str) {
        long jZoijcleaow = bfopjjpdmp.zoijcleaow(colorsUiModel.wypolnanlu(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY));
        ComposeView cvActionBar = zynmafqrjbVar.f66211ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, str, null, false, new tg.iobyxmoadg() { // from class: lc0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.draadjrbmk(this.f62052zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(jZoijcleaow), null, 77, null);
    }

    private final mc0.gxszxtbevo ojitshcjhn() {
        return (mc0.gxszxtbevo) this.f62049iwizpuwonk.getValue();
    }

    private final void oxmwwwfdhm(zynmafqrjb zynmafqrjbVar, ColorsUiModel colorsUiModel) {
        int iWypolnanlu = colorsUiModel.wypolnanlu(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY);
        ColorStateList colorStateListOkpsazkaxt = colorsUiModel.okpsazkaxt(wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        zynmafqrjbVar.f66213zoijcleaow.setTextColor(iWypolnanlu);
        zynmafqrjbVar.f66213zoijcleaow.setBackgroundTintList(colorStateListOkpsazkaxt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(agtfadlqog agtfadlqogVar, View view) {
        agtfadlqogVar.ppxfxbqfkf(nufgyqmvbu.iobyxmoadg.f62061iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mc0.gxszxtbevo wflxmlrfwp(final agtfadlqog agtfadlqogVar) {
        return new mc0.gxszxtbevo(new tg.draadjrbmk() { // from class: lc0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.agtfadlqog(this.f62067zdlpuopuiu, (FilterValueUiModel) obj);
            }
        });
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(zynmafqrjb binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        if (!zdlpuopuiu.eablkybsjg(this.f62050jyumaefscl, model.iobyxmoadg())) {
            oxmwwwfdhm(binding, model.iobyxmoadg());
            gtknphoqwx(binding, model.iobyxmoadg(), model.ppxfxbqfkf());
            this.f62050jyumaefscl = model.iobyxmoadg();
        }
        binding.f66213zoijcleaow.setEnabled(model.wkgbmnqykc());
        ojitshcjhn().wkgbmnqykc(model.zoijcleaow());
    }
}
