package ah;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zdlpuopuiu implements ParameterizedType, Type {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Type[] f1905jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Type f1906yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f1907zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f1908zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1, jyumaefscl.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return jyumaefscl.nufgyqmvbu(p13);
        }
    }

    public zdlpuopuiu(Class rawType, Type type, List typeArguments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rawType, "rawType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeArguments, "typeArguments");
        this.f1907zdlpuopuiu = rawType;
        this.f1906yggfygwlhe = type;
        this.f1905jyumaefscl = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f1907zdlpuopuiu, parameterizedType.getRawType()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f1906yggfygwlhe, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f1905jyumaefscl;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f1906yggfygwlhe;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f1907zdlpuopuiu;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        Type type = this.f1906yggfygwlhe;
        if (type != null) {
            sb3.append(jyumaefscl.nufgyqmvbu(type));
            sb3.append("$");
            sb3.append(this.f1907zdlpuopuiu.getSimpleName());
        } else {
            sb3.append(jyumaefscl.nufgyqmvbu(this.f1907zdlpuopuiu));
        }
        Type[] typeArr = this.f1905jyumaefscl;
        if (!(typeArr.length == 0)) {
            hg.kcexrzcfyt.iwxlajgraz(typeArr, sb3, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : iobyxmoadg.f1908zdlpuopuiu);
        }
        return sb3.toString();
    }

    public int hashCode() {
        int iHashCode = this.f1907zdlpuopuiu.hashCode();
        Type type = this.f1906yggfygwlhe;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
