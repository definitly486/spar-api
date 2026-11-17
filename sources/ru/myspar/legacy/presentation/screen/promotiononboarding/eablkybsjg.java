package ru.myspar.legacy.presentation.screen.promotiononboarding;

import bd0.lqeggnwhkg;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.wwaezpbzkn;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89478jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89478jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: bd0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.promotiononboarding.eablkybsjg.draadjrbmk(this.f15836zdlpuopuiu);
            }
        });
        wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) binding.invoke();
        wwaezpbzknVar.f66080ppxfxbqfkf.setAdapter(gtknphoqwx());
        wwaezpbzknVar.f66080ppxfxbqfkf.setUserInputEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar, int i13) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2050ppxfxbqfkf(i13));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cd0.iobyxmoadg draadjrbmk(final eablkybsjg eablkybsjgVar) {
        return new cd0.iobyxmoadg(new tg.draadjrbmk() { // from class: bd0.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promotiononboarding.eablkybsjg.wflxmlrfwp(this.f15831zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, new tg.draadjrbmk() { // from class: bd0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promotiononboarding.eablkybsjg.agtfadlqog(this.f15830zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, new tg.iobyxmoadg() { // from class: bd0.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.promotiononboarding.eablkybsjg.ojitshcjhn(this.f15832zdlpuopuiu);
            }
        });
    }

    private final cd0.iobyxmoadg gtknphoqwx() {
        return (cd0.iobyxmoadg) this.f89478jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89483iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar, int i13) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(i13));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(wwaezpbzkn binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f66081zoijcleaow.setItemCount(model.zoijcleaow().size());
        gtknphoqwx().wkgbmnqykc(model.zoijcleaow());
        binding.f66081zoijcleaow.setSelectedItem(model.iobyxmoadg());
        binding.f66080ppxfxbqfkf.btonecajqb(model.iobyxmoadg(), true);
    }
}
