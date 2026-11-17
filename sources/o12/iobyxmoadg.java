package o12;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f71555ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final C1548iobyxmoadg f71556wkgbmnqykc = new C1548iobyxmoadg();

    /* JADX INFO: renamed from: o12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1548iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        C1548iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(p12.iobyxmoadg oldItem, p12.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return oldItem.getClass() == newItem.getClass() && zdlpuopuiu.eablkybsjg(oldItem.getItemId(), newItem.getItemId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(p12.iobyxmoadg oldItem, p12.iobyxmoadg newItem) {
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
    public iobyxmoadg(draadjrbmk onSelectBankingApp, tg.iobyxmoadg onUrlSbpRecurringClicked, tg.iobyxmoadg onBtnAcceptClicked) {
        super(f71556wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onSelectBankingApp, "onSelectBankingApp");
        zdlpuopuiu.btonecajqb(onUrlSbpRecurringClicked, "onUrlSbpRecurringClicked");
        zdlpuopuiu.btonecajqb(onBtnAcceptClicked, "onBtnAcceptClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(btonecajqb.eablkybsjg(onSelectBankingApp));
        this.f27903iobyxmoadg.ppxfxbqfkf(eablkybsjg.wkgbmnqykc(onUrlSbpRecurringClicked, onBtnAcceptClicked));
    }
}
