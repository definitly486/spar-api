package ob2;

import gg.wwaezpbzkn;
import hg.wflxmlrfwp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f72554ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f72553iobyxmoadg = new dxjokdxxww();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wflxmlrfwp f72555zoijcleaow = new wflxmlrfwp();

    private dxjokdxxww() {
    }

    private final void zoijcleaow() {
        tg.iobyxmoadg iobyxmoadgVar;
        synchronized (this) {
            if (f72554ppxfxbqfkf) {
                return;
            }
            f72554ppxfxbqfkf = true;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            while (true) {
                synchronized (this) {
                    iobyxmoadgVar = (tg.iobyxmoadg) f72555zoijcleaow.lereixgezr();
                    if (iobyxmoadgVar == null) {
                        f72554ppxfxbqfkf = false;
                        return;
                    }
                }
                iobyxmoadgVar.invoke();
            }
        }
    }

    @Override // ob2.iobyxmoadg
    public void iobyxmoadg(tg.iobyxmoadg block) {
        zdlpuopuiu.btonecajqb(block, "block");
        synchronized (this) {
            f72555zoijcleaow.addLast(block);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        zoijcleaow();
    }
}
