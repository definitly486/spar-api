package de0;

import c20.eablkybsjg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    static void agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, AddProductParams addProductParams) {
        ppxfxbqfkfVar.cllcsxoeiz(addProductParams);
    }

    private default void iwizpuwonk(final AddProductParams addProductParams) {
        if (addProductParams.getAvailableOnlyForPickup() && cdpycssgdh() == null) {
            draadjrbmk(new Runnable() { // from class: de0.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    ppxfxbqfkf.jyumaefscl(this.f27899zdlpuopuiu, addProductParams);
                }
            });
            gxszxtbevo();
        } else {
            draadjrbmk(null);
            zdlpuopuiu(addProductParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, AddProductParams addProductParams) {
        ppxfxbqfkfVar.cllcsxoeiz(addProductParams);
    }

    Runnable cdpycssgdh();

    default void cllcsxoeiz(AddProductParams params) {
        zdlpuopuiu.btonecajqb(params, "params");
        if (((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            iwizpuwonk(params);
        } else {
            zoijcleaow();
        }
    }

    default void cqumvgiudr(final AddProductParams params) {
        zdlpuopuiu.btonecajqb(params, "params");
        draadjrbmk(new Runnable() { // from class: de0.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkf.agtfadlqog(this.f27896zdlpuopuiu, params);
            }
        });
        gxszxtbevo();
    }

    void draadjrbmk(Runnable runnable);

    eablkybsjg eablkybsjg();

    void gxszxtbevo();

    void zdlpuopuiu(AddProductParams addProductParams);

    void zoijcleaow();
}
