package ru.myspar.ads.impl.presentation.dialog.productday;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84156iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.ads.impl.presentation.dialog.productday.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1903zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f84157iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1903zoijcleaow(HintUiModel hint) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            this.f84157iobyxmoadg = hint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1903zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84157iobyxmoadg, ((C1903zoijcleaow) obj).f84157iobyxmoadg);
        }

        public int hashCode() {
            return this.f84157iobyxmoadg.hashCode();
        }

        public final HintUiModel iobyxmoadg() {
            return this.f84157iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f84157iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
