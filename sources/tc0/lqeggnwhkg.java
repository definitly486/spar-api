package tc0;

import androidx.recyclerview.widget.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f110249ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f110250wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            if ((oldItem instanceof vc0.iobyxmoadg) && (newItem instanceof vc0.iobyxmoadg)) {
                return zdlpuopuiu.eablkybsjg(((vc0.iobyxmoadg) oldItem).btonecajqb(), ((vc0.iobyxmoadg) newItem).btonecajqb());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
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
    public lqeggnwhkg(draadjrbmk onActivateClicked, draadjrbmk onItemClicked) {
        super(f110250wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onActivateClicked, "onActivateClicked");
        zdlpuopuiu.btonecajqb(onItemClicked, "onItemClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(gxszxtbevo.gxszxtbevo(onActivateClicked, onItemClicked));
    }
}
