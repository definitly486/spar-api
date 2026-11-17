package xc0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f122046ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f122047wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(zc0.iobyxmoadg oldItem, zc0.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.eablkybsjg(), newItem.eablkybsjg());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(zc0.iobyxmoadg oldItem, zc0.iobyxmoadg newItem) {
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
    public ppxfxbqfkf(final rgvfuqvkyq onProductClicked, final tg.draadjrbmk onActivateClicked) {
        super(f122047wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onActivateClicked, "onActivateClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(new gxszxtbevo(new tg.draadjrbmk() { // from class: xc0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.nufgyqmvbu(onProductClicked, this, ((Integer) obj).intValue());
            }
        }, new tg.draadjrbmk() { // from class: xc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.dxjokdxxww(onActivateClicked, this, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        Object obj = ppxfxbqfkfVar.ppxfxbqfkf().get(i13 % ppxfxbqfkfVar.ppxfxbqfkf().size());
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        draadjrbmkVar.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        Object obj = ppxfxbqfkfVar.ppxfxbqfkf().get(i13 % ppxfxbqfkfVar.ppxfxbqfkf().size());
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        rgvfuqvkyqVar.invoke(obj, Integer.valueOf(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // df.wkgbmnqykc, androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return ppxfxbqfkf().isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public long getItemId(int i13) {
        if (i13 != -1) {
            return ((zc0.iobyxmoadg) ppxfxbqfkf().get(i13 % ppxfxbqfkf().size())).hashCode();
        }
        return -1L;
    }
}
