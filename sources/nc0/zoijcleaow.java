package nc0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f69661ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C1497zoijcleaow f69660wkgbmnqykc = new C1497zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f69659eablkybsjg = new iobyxmoadg();

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(pc0.zoijcleaow oldItem, pc0.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.wkgbmnqykc(), newItem.wkgbmnqykc());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(pc0.zoijcleaow oldItem, pc0.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    /* JADX INFO: renamed from: nc0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1497zoijcleaow {
        public /* synthetic */ C1497zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1497zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(tg.draadjrbmk clickListener) {
        super(f69659eablkybsjg);
        zdlpuopuiu.btonecajqb(clickListener, "clickListener");
        this.f69661ppxfxbqfkf = clickListener;
        this.f27903iobyxmoadg.ppxfxbqfkf(nufgyqmvbu.gxszxtbevo(new tg.draadjrbmk() { // from class: nc0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.lqeggnwhkg(this.f69654zdlpuopuiu, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(zoijcleaow zoijcleaowVar, int i13) {
        tg.draadjrbmk draadjrbmkVar = zoijcleaowVar.f69661ppxfxbqfkf;
        Object obj = zoijcleaowVar.ppxfxbqfkf().get(i13);
        zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        draadjrbmkVar.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
