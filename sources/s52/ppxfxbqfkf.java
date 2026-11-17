package s52;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f105596ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f105595wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f105594eablkybsjg = new iobyxmoadg();

    public static final class iobyxmoadg extends w30.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(q62.iobyxmoadg oldItem, q62.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.dxjokdxxww() != newItem.dxjokdxxww()) {
                arrayList.add(s52.iobyxmoadg.C2568iobyxmoadg.f105586iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(tg.draadjrbmk clickListener) {
        super(f105594eablkybsjg);
        zdlpuopuiu.btonecajqb(clickListener, "clickListener");
        this.f105596ppxfxbqfkf = clickListener;
        this.f27903iobyxmoadg.ppxfxbqfkf(dxjokdxxww.gxszxtbevo(new tg.draadjrbmk() { // from class: s52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.lqeggnwhkg(this.f105599zdlpuopuiu, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        tg.draadjrbmk draadjrbmkVar = ppxfxbqfkfVar.f105596ppxfxbqfkf;
        Object obj = ppxfxbqfkfVar.ppxfxbqfkf().get(i13);
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        draadjrbmkVar.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
