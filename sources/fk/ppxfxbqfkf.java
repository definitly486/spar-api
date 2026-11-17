package fk;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    public static final Void iobyxmoadg(ah.wkgbmnqykc subClass, ah.wkgbmnqykc baseClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subClass, "subClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        String strJyumaefscl = subClass.jyumaefscl();
        if (strJyumaefscl == null) {
            strJyumaefscl = String.valueOf(subClass);
        }
        zoijcleaow(strJyumaefscl, baseClass);
        throw new KotlinNothingValueException();
    }

    public static final Void zoijcleaow(String str, ah.wkgbmnqykc baseClass) {
        String str2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.jyumaefscl() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.jyumaefscl() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
