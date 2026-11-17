package fn1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f34480ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final C0761iobyxmoadg f34481wkgbmnqykc = new C0761iobyxmoadg();

    /* JADX INFO: renamed from: fn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0761iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        C0761iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(gn1.iobyxmoadg oldItem, gn1.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return oldItem.getClass() == newItem.getClass() && zdlpuopuiu.eablkybsjg(oldItem.getItemId(), newItem.getItemId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(gn1.iobyxmoadg oldItem, gn1.iobyxmoadg newItem) {
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
    public iobyxmoadg(tg.draadjrbmk onSelectBankingApp, tg.iobyxmoadg onUrlSbpRecurringClicked, tg.iobyxmoadg onBtnAcceptClicked) {
        super(f34481wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onSelectBankingApp, "onSelectBankingApp");
        zdlpuopuiu.btonecajqb(onUrlSbpRecurringClicked, "onUrlSbpRecurringClicked");
        zdlpuopuiu.btonecajqb(onBtnAcceptClicked, "onBtnAcceptClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(draadjrbmk.eablkybsjg(onSelectBankingApp));
        this.f27903iobyxmoadg.ppxfxbqfkf(eablkybsjg.wkgbmnqykc(onUrlSbpRecurringClicked, onBtnAcceptClicked));
    }
}
