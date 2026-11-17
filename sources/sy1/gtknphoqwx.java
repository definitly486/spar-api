package sy1;

import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f108754ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f108755wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(mx1.iobyxmoadg oldItem, mx1.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.iobyxmoadg(), newItem.iobyxmoadg());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(mx1.iobyxmoadg oldItem, mx1.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.eablkybsjg() != newItem.eablkybsjg()) {
                arrayList.add(btonecajqb.zoijcleaow.f108744iobyxmoadg);
            }
            if (oldItem.zoijcleaow() != newItem.zoijcleaow()) {
                arrayList.add(btonecajqb.iobyxmoadg.f108743iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(mx1.iobyxmoadg oldItem, mx1.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
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
    public gtknphoqwx(vdvldrhtss onAddToCartClicked, rgvfuqvkyq onSetRatingClicked, draadjrbmk draadjrbmkVar) {
        super(f108755wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onAddToCartClicked, "onAddToCartClicked");
        zdlpuopuiu.btonecajqb(onSetRatingClicked, "onSetRatingClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(dxjokdxxww.eablkybsjg(onAddToCartClicked, onSetRatingClicked, draadjrbmkVar)).ppxfxbqfkf(wkgbmnqykc.wkgbmnqykc(onAddToCartClicked));
    }
}
