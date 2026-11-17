package hk;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm {
    public static /* synthetic */ CharSequence btonecajqb(CharSequence charSequence, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = -1;
        }
        return dxjokdxxww(charSequence, i13);
    }

    private static final String draadjrbmk(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) btonecajqb(str2, 0, 1, null));
    }

    public static final CharSequence dxjokdxxww(CharSequence charSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i13 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i14 = i13 - 30;
        int i15 = i13 + 30;
        return (i14 <= 0 ? "" : ".....") + charSequence.subSequence(zg.gtknphoqwx.gxszxtbevo(i14, 0), zg.gtknphoqwx.btonecajqb(i15, charSequence.length())).toString() + (i15 >= charSequence.length() ? "" : ".....");
    }

    public static final JsonDecodingException eablkybsjg(int i13, String message, CharSequence input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        return wkgbmnqykc(i13, message + "\nJSON input: " + ((Object) dxjokdxxww(input, i13)));
    }

    public static final Void gtknphoqwx(iobyxmoadg iobyxmoadgVar, Number result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final JsonDecodingException gxszxtbevo(String key, String input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        return wkgbmnqykc(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) btonecajqb(input, 0, 1, null)));
    }

    public static final JsonDecodingException iobyxmoadg(Number value, String key, String output) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
        return wkgbmnqykc(-1, draadjrbmk(value, key, output));
    }

    public static final Void lqeggnwhkg(iobyxmoadg iobyxmoadgVar, String entity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entity, "entity");
        iobyxmoadgVar.iwizpuwonk("Trailing comma before the end of JSON " + entity, iobyxmoadgVar.f40509iobyxmoadg - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void nufgyqmvbu(iobyxmoadg iobyxmoadgVar, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "object";
        }
        return lqeggnwhkg(iobyxmoadgVar, str);
    }

    public static final JsonEncodingException ppxfxbqfkf(dk.gxszxtbevo keyDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.nufgyqmvbu() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException wkgbmnqykc(int i13, String message) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        if (i13 >= 0) {
            message = "Unexpected JSON token at offset " + i13 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonEncodingException zoijcleaow(Number value, String output) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) btonecajqb(output, 0, 1, null)));
    }
}
