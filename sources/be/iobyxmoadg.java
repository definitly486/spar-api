package be;

import com.google.gson.internal.zoijcleaow;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg<T> {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f15861iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f15862ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Type f15863zoijcleaow;

    protected iobyxmoadg() {
        Type typeEablkybsjg = eablkybsjg();
        this.f15863zoijcleaow = typeEablkybsjg;
        this.f15861iobyxmoadg = zoijcleaow.gtknphoqwx(typeEablkybsjg);
        this.f15862ppxfxbqfkf = typeEablkybsjg.hashCode();
    }

    private Type eablkybsjg() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == iobyxmoadg.class) {
                return zoijcleaow.zoijcleaow(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == iobyxmoadg.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static iobyxmoadg iobyxmoadg(Class cls) {
        return new iobyxmoadg(cls);
    }

    public static iobyxmoadg zoijcleaow(Type type) {
        return new iobyxmoadg(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iobyxmoadg) && zoijcleaow.gxszxtbevo(this.f15863zoijcleaow, ((iobyxmoadg) obj).f15863zoijcleaow);
    }

    public final int hashCode() {
        return this.f15862ppxfxbqfkf;
    }

    public final Class ppxfxbqfkf() {
        return this.f15861iobyxmoadg;
    }

    public final String toString() {
        return zoijcleaow.zdlpuopuiu(this.f15863zoijcleaow);
    }

    public final Type wkgbmnqykc() {
        return this.f15863zoijcleaow;
    }

    private iobyxmoadg(Type type) {
        Objects.requireNonNull(type);
        Type typeZoijcleaow = zoijcleaow.zoijcleaow(type);
        this.f15863zoijcleaow = typeZoijcleaow;
        this.f15861iobyxmoadg = zoijcleaow.gtknphoqwx(typeZoijcleaow);
        this.f15862ppxfxbqfkf = typeZoijcleaow.hashCode();
    }
}
