package ru.myspar.options.impl.themeswitch.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x00.iobyxmoadg f90974iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(x00.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f90974iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f90974iobyxmoadg == ((iobyxmoadg) obj).f90974iobyxmoadg;
        }

        public int hashCode() {
            return this.f90974iobyxmoadg.hashCode();
        }

        public final x00.iobyxmoadg iobyxmoadg() {
            return this.f90974iobyxmoadg;
        }

        public String toString() {
            return "SaveDarkModeState(darkModeState=" + this.f90974iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
