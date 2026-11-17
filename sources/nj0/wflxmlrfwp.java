package nj0;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gg.gtknphoqwx f70200jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f70200jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: nj0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wflxmlrfwp.btonecajqb(this.f70189zdlpuopuiu);
            }
        });
        lj0.iobyxmoadg iobyxmoadgVar = (lj0.iobyxmoadg) binding.invoke();
        ComposeView cvActionBar = iobyxmoadgVar.f62695zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(kj0.eablkybsjg.partners);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: nj0.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wflxmlrfwp.wflxmlrfwp(this.f70192zdlpuopuiu);
            }
        }, null, null, 109, null);
        iobyxmoadgVar.f62694ppxfxbqfkf.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvPartners = iobyxmoadgVar.f62694ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvPartners, "rvPartners");
        e60.zoijcleaow.ppxfxbqfkf(rvPartners, draadjrbmk(), iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oj0.zoijcleaow btonecajqb(final wflxmlrfwp wflxmlrfwpVar) {
        return new oj0.zoijcleaow(new tg.draadjrbmk() { // from class: nj0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.gtknphoqwx(this.f70190zdlpuopuiu, (pj0.iobyxmoadg) obj);
            }
        });
    }

    private final oj0.zoijcleaow draadjrbmk() {
        return (oj0.zoijcleaow) this.f70200jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wflxmlrfwp wflxmlrfwpVar, pj0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wflxmlrfwpVar.ppxfxbqfkf(new lqeggnwhkg.zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwpVar.ppxfxbqfkf(lqeggnwhkg.iobyxmoadg.f70194iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lj0.iobyxmoadg binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk().wkgbmnqykc(rgvfuqvkyq.yggfygwlhe(model.iobyxmoadg()));
    }
}
