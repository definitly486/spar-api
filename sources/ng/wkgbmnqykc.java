package ng;

import java.io.Serializable;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final iobyxmoadg f70048yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f70049zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(Enum[] entries) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        zdlpuopuiu.lqeggnwhkg(componentType);
        this.f70049zdlpuopuiu = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f70049zdlpuopuiu.getEnumConstants();
        zdlpuopuiu.dxjokdxxww(enumConstants, "getEnumConstants(...)");
        return zoijcleaow.iobyxmoadg((Enum[]) enumConstants);
    }
}
