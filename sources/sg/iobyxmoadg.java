package sg;

import ah.wkgbmnqykc;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final wkgbmnqykc eablkybsjg(Class cls) {
        zdlpuopuiu.btonecajqb(cls, "<this>");
        return cllcsxoeiz.zoijcleaow(cls);
    }

    public static final wkgbmnqykc iobyxmoadg(Annotation annotation) {
        zdlpuopuiu.btonecajqb(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        zdlpuopuiu.dxjokdxxww(clsAnnotationType, "annotationType(...)");
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(clsAnnotationType);
        zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarEablkybsjg, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return wkgbmnqykcVarEablkybsjg;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        Class clsZoijcleaow = ((nufgyqmvbu) wkgbmnqykcVar).zoijcleaow();
        if (!clsZoijcleaow.isPrimitive()) {
            zdlpuopuiu.nufgyqmvbu(clsZoijcleaow, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsZoijcleaow;
        }
        String name = clsZoijcleaow.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsZoijcleaow = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsZoijcleaow = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsZoijcleaow = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsZoijcleaow = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsZoijcleaow = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsZoijcleaow = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsZoijcleaow = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsZoijcleaow = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsZoijcleaow = Short.class;
                }
                break;
        }
        zdlpuopuiu.nufgyqmvbu(clsZoijcleaow, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsZoijcleaow;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        Class clsZoijcleaow = ((nufgyqmvbu) wkgbmnqykcVar).zoijcleaow();
        if (clsZoijcleaow.isPrimitive()) {
            zdlpuopuiu.nufgyqmvbu(clsZoijcleaow, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsZoijcleaow;
        }
        String name = clsZoijcleaow.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Class zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        Class clsZoijcleaow = ((nufgyqmvbu) wkgbmnqykcVar).zoijcleaow();
        zdlpuopuiu.nufgyqmvbu(clsZoijcleaow, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsZoijcleaow;
    }
}
