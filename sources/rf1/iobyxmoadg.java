package rf1;

import java.util.ArrayList;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.options.impl.options.presentation.models.UserSubscriptionUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f82568ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final C1848iobyxmoadg f82569wkgbmnqykc = new C1848iobyxmoadg();

    /* JADX INFO: renamed from: rf1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1848iobyxmoadg extends b21.iobyxmoadg {
        C1848iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(UserSubscriptionUiModel oldItem, UserSubscriptionUiModel newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.getIsSettingSelected() != newItem.getIsSettingSelected()) {
                arrayList.add(lqeggnwhkg.iobyxmoadg.f82570iobyxmoadg);
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
    public iobyxmoadg(rgvfuqvkyq onAutoRenewalClicked) {
        super(f82569wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onAutoRenewalClicked, "onAutoRenewalClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(gxszxtbevo.gxszxtbevo(onAutoRenewalClicked));
    }
}
