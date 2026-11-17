package hk;

import java.lang.annotation.Annotation;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class istkbnxepw {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40523iobyxmoadg;

        static {
            int[] iArr = new int[gk.iobyxmoadg.values().length];
            try {
                iArr[gk.iobyxmoadg.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gk.iobyxmoadg.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gk.iobyxmoadg.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40523iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(bk.agtfadlqog agtfadlqogVar, bk.agtfadlqog agtfadlqogVar2, String str) {
        if ((agtfadlqogVar instanceof bk.gtknphoqwx) && fk.jpowsppfya.iobyxmoadg(agtfadlqogVar2.iobyxmoadg()).contains(str)) {
            String strNufgyqmvbu = ((bk.gtknphoqwx) agtfadlqogVar).iobyxmoadg().nufgyqmvbu();
            throw new IllegalStateException(("Sealed class '" + agtfadlqogVar2.iobyxmoadg().nufgyqmvbu() + "' cannot be serialized as base class '" + strNufgyqmvbu + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final String ppxfxbqfkf(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        for (Annotation annotation : gxszxtbevoVar.getAnnotations()) {
            if (annotation instanceof gk.gxszxtbevo) {
                return ((gk.gxszxtbevo) annotation).discriminator();
            }
        }
        return json.eablkybsjg().eablkybsjg();
    }

    public static final Void wkgbmnqykc(String str, gk.btonecajqb element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(element.getClass()).jyumaefscl() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final void zoijcleaow(dk.agtfadlqog kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        if (kind instanceof dk.agtfadlqog.zoijcleaow) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof dk.eablkybsjg) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof dk.wkgbmnqykc) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }
}
