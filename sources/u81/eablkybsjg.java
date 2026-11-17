package u81;

import androidx.recyclerview.widget.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f113011ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f113012wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(b21.ppxfxbqfkf oldItem, b21.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.getItemId(), newItem.getItemId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public m91.zoijcleaow ppxfxbqfkf(b21.ppxfxbqfkf oldItem, b21.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            m91.nufgyqmvbu nufgyqmvbuVar = (m91.nufgyqmvbu) newItem;
            m91.zoijcleaow zoijcleaowVarLqeggnwhkg = nufgyqmvbuVar.lqeggnwhkg();
            if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar.lqeggnwhkg(), ((m91.nufgyqmvbu) oldItem).lqeggnwhkg())) {
                return null;
            }
            return zoijcleaowVarLqeggnwhkg;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(b21.ppxfxbqfkf oldItem, b21.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(((m91.nufgyqmvbu) oldItem).lqeggnwhkg(), ((m91.nufgyqmvbu) newItem).lqeggnwhkg());
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
        super(f113012wkgbmnqykc, wkgbmnqykc.gxszxtbevo(onFeatureClicked));
        zdlpuopuiu.btonecajqb(onFeatureClicked, "onFeatureClicked");
    }
}
