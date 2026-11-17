package ru.myspar.proloyalty.options.impl.themeswitch.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oz0.iobyxmoadg f98625iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(oz0.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f98625iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f98625iobyxmoadg == ((iobyxmoadg) obj).f98625iobyxmoadg;
        }

        public int hashCode() {
            return this.f98625iobyxmoadg.hashCode();
        }

        public final oz0.iobyxmoadg iobyxmoadg() {
            return this.f98625iobyxmoadg;
        }

        public String toString() {
            return "SaveDarkModeState(darkModeState=" + this.f98625iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
