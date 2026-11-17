package ac1;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;
import ow0.nufgyqmvbu;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f1546iobyxmoadg = new zoijcleaow();

    private zoijcleaow() {
    }

    public static /* synthetic */ nufgyqmvbu wkgbmnqykc(zoijcleaow zoijcleaowVar, Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = null;
        }
        if ((i13 & 4) != 0) {
            iobyxmoadgVar2 = null;
        }
        return zoijcleaowVar.ppxfxbqfkf(context, iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static /* synthetic */ nufgyqmvbu zoijcleaow(zoijcleaow zoijcleaowVar, Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, ow0.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj) {
        tg.iobyxmoadg iobyxmoadgVar4 = (i13 & 2) != 0 ? null : iobyxmoadgVar;
        tg.iobyxmoadg iobyxmoadgVar5 = (i13 & 4) != 0 ? null : iobyxmoadgVar2;
        tg.iobyxmoadg iobyxmoadgVar6 = (i13 & 8) != 0 ? null : iobyxmoadgVar3;
        if ((i13 & 16) != 0) {
            ppxfxbqfkfVar = ow0.ppxfxbqfkf.HORIZONTAL;
        }
        return zoijcleaowVar.iobyxmoadg(context, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, ppxfxbqfkfVar);
    }

    public final int eablkybsjg(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return (int) (i13 * context.getResources().getDisplayMetrics().density);
    }

    public final nufgyqmvbu iobyxmoadg(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, ow0.ppxfxbqfkf buttonsAlignmentType) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(buttonsAlignmentType, "buttonsAlignmentType");
        return new nufgyqmvbu.iobyxmoadg(context, null, iobyxmoadgVar3, 2, null).agtfadlqog(lqeggnwhkg.proloyalty_age_maturity_title).lqeggnwhkg(lqeggnwhkg.proloyalty_age_maturity).wkgbmnqykc(true).draadjrbmk(lqeggnwhkg.proloyalty_action_yes, iobyxmoadgVar).btonecajqb(lqeggnwhkg.proloyalty_action_no, iobyxmoadgVar2).ppxfxbqfkf(buttonsAlignmentType).zoijcleaow();
    }

    public final nufgyqmvbu ppxfxbqfkf(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new nufgyqmvbu.iobyxmoadg(context, null, null, 6, null).agtfadlqog(lqeggnwhkg.proloyalty_restaurant_clear_shop_cart).draadjrbmk(lqeggnwhkg.proloyalty_action_yes, iobyxmoadgVar).btonecajqb(lqeggnwhkg.proloyalty_action_no, iobyxmoadgVar2).zoijcleaow();
    }
}
