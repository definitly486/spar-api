package ru.myspar.proloyalty.ads.impl.presentation.dialog.productday;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92181iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2147zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f92182iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2147zoijcleaow(HintUiModel hint) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            this.f92182iobyxmoadg = hint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2147zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92182iobyxmoadg, ((C2147zoijcleaow) obj).f92182iobyxmoadg);
        }

        public int hashCode() {
            return this.f92182iobyxmoadg.hashCode();
        }

        public final HintUiModel iobyxmoadg() {
            return this.f92182iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f92182iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
