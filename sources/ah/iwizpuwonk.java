package ah;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class iwizpuwonk implements WildcardType, Type {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Type f1884yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Type f1885zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f1883jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final iwizpuwonk f1882iwizpuwonk = new iwizpuwonk(null, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iwizpuwonk iobyxmoadg() {
            return iwizpuwonk.f1882iwizpuwonk;
        }

        private iobyxmoadg() {
        }
    }

    public iwizpuwonk(Type type, Type type2) {
        this.f1885zdlpuopuiu = type;
        this.f1884yggfygwlhe = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f1884yggfygwlhe;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f1884yggfygwlhe != null) {
            return "? super " + jyumaefscl.nufgyqmvbu(this.f1884yggfygwlhe);
        }
        Type type = this.f1885zdlpuopuiu;
        if (type == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(type, Object.class)) {
            return "?";
        }
        return "? extends " + jyumaefscl.nufgyqmvbu(this.f1885zdlpuopuiu);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f1885zdlpuopuiu;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
