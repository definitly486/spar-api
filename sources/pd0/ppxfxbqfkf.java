package pd0;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f76429ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f76430wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends w30.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(rb0.zoijcleaow oldItem, rb0.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.btonecajqb() != newItem.btonecajqb()) {
                arrayList.add(pd0.iobyxmoadg.C1690iobyxmoadg.f76426iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(final draadjrbmk listener) {
        super(f76430wkgbmnqykc);
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f27903iobyxmoadg.ppxfxbqfkf(nufgyqmvbu.eablkybsjg(new draadjrbmk() { // from class: pd0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.lqeggnwhkg(listener, this, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(draadjrbmk draadjrbmkVar, ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        draadjrbmkVar.invoke(((rb0.zoijcleaow) ppxfxbqfkfVar.ppxfxbqfkf().get(i13)).getItemId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
