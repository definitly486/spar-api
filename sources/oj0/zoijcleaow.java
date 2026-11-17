package oj0;

import androidx.recyclerview.widget.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1587zoijcleaow f72989ppxfxbqfkf = new C1587zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final nufgyqmvbu.gxszxtbevo f72990wkgbmnqykc = new iobyxmoadg();

    public static final class iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(pj0.iobyxmoadg oldItem, pj0.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.ppxfxbqfkf(), newItem.ppxfxbqfkf());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(pj0.iobyxmoadg oldItem, pj0.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    /* JADX INFO: renamed from: oj0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1587zoijcleaow {
        public /* synthetic */ C1587zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1587zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(final draadjrbmk listener) {
        super(f72990wkgbmnqykc);
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f27903iobyxmoadg.ppxfxbqfkf(lqeggnwhkg.eablkybsjg(new draadjrbmk() { // from class: oj0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.lqeggnwhkg(listener, this, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(draadjrbmk draadjrbmkVar, zoijcleaow zoijcleaowVar, int i13) {
        Object obj = zoijcleaowVar.ppxfxbqfkf().get(i13);
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        draadjrbmkVar.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
