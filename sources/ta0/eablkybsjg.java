package ta0;

import androidx.recyclerview.widget.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import nb0.gxszxtbevo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f110145ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f110146wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.getItemId(), newItem.getItemId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb0.zoijcleaow ppxfxbqfkf(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) newItem;
            nb0.zoijcleaow zoijcleaowVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar.lqeggnwhkg(), ((gxszxtbevo) oldItem).lqeggnwhkg())) {
                return null;
            }
            return zoijcleaowVarLqeggnwhkg;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(((gxszxtbevo) oldItem).lqeggnwhkg(), ((gxszxtbevo) newItem).lqeggnwhkg());
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
    public eablkybsjg(rgvfuqvkyq onFeatureClicked) {
        super(f110146wkgbmnqykc, wkgbmnqykc.gxszxtbevo(onFeatureClicked));
        zdlpuopuiu.btonecajqb(onFeatureClicked, "onFeatureClicked");
    }
}
