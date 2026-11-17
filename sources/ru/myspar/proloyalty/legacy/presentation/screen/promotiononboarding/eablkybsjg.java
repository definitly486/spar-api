package ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ya1.lqeggnwhkg;
import z41.lereixgezr;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97157jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97157jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ya1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.eablkybsjg.draadjrbmk(this.f124289zdlpuopuiu);
            }
        });
        lereixgezr lereixgezrVar = (lereixgezr) binding.invoke();
        lereixgezrVar.f128230ppxfxbqfkf.setAdapter(gtknphoqwx());
        lereixgezrVar.f128230ppxfxbqfkf.setUserInputEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar, int i13) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2293ppxfxbqfkf(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za1.iobyxmoadg draadjrbmk(final eablkybsjg eablkybsjgVar) {
        return new za1.iobyxmoadg(new tg.draadjrbmk() { // from class: ya1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.eablkybsjg.wflxmlrfwp(this.f124284zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, new tg.draadjrbmk() { // from class: ya1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.eablkybsjg.agtfadlqog(this.f124283zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, new tg.iobyxmoadg() { // from class: ya1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.eablkybsjg.ojitshcjhn(this.f124285zdlpuopuiu);
            }
        });
    }

    private final za1.iobyxmoadg gtknphoqwx() {
        return (za1.iobyxmoadg) this.f97157jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97162iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar, int i13) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lereixgezr binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128231zoijcleaow.setItemCount(model.zoijcleaow().size());
        gtknphoqwx().wkgbmnqykc(model.zoijcleaow());
        binding.f128231zoijcleaow.setSelectedItem(model.iobyxmoadg());
        binding.f128230ppxfxbqfkf.btonecajqb(model.iobyxmoadg(), true);
    }
}
