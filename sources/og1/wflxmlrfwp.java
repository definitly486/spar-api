package og1;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gg.gtknphoqwx f72841jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f72841jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: og1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wflxmlrfwp.btonecajqb(this.f72830zdlpuopuiu);
            }
        });
        mg1.iobyxmoadg iobyxmoadgVar = (mg1.iobyxmoadg) binding.invoke();
        ComposeView cvActionBar = iobyxmoadgVar.f66943zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lg1.eablkybsjg.proloyalty_partners);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: og1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wflxmlrfwp.wflxmlrfwp(this.f72833zdlpuopuiu);
            }
        }, null, null, 109, null);
        iobyxmoadgVar.f66942ppxfxbqfkf.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvPartners = iobyxmoadgVar.f66942ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvPartners, "rvPartners");
        r41.zoijcleaow.ppxfxbqfkf(rvPartners, draadjrbmk(), iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pg1.zoijcleaow btonecajqb(final wflxmlrfwp wflxmlrfwpVar) {
        return new pg1.zoijcleaow(new tg.draadjrbmk() { // from class: og1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.gtknphoqwx(this.f72831zdlpuopuiu, (qg1.iobyxmoadg) obj);
            }
        });
    }

    private final pg1.zoijcleaow draadjrbmk() {
        return (pg1.zoijcleaow) this.f72841jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wflxmlrfwp wflxmlrfwpVar, qg1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wflxmlrfwpVar.ppxfxbqfkf(new lqeggnwhkg.zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwpVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f72835iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(mg1.iobyxmoadg binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk().wkgbmnqykc(rgvfuqvkyq.yggfygwlhe(model.iobyxmoadg()));
    }
}
