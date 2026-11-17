package il;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static String iobyxmoadg(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        zoijcleaow(str, sb3);
        return sb3.toString();
    }

    public static String ppxfxbqfkf(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            wkgbmnqykc(obj, stringWriter);
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void wkgbmnqykc(Object obj, Writer writer) {
        if (obj == null) {
            writer.write("null");
            return;
        }
        if (obj instanceof String) {
            writer.write(34);
            writer.write(iobyxmoadg((String) obj));
            writer.write(34);
            return;
        }
        if (obj instanceof Double) {
            Double d13 = (Double) obj;
            if (d13.isInfinite() || d13.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Float) {
            Float f13 = (Float) obj;
            if (f13.isInfinite() || f13.isNaN()) {
                writer.write("null");
                return;
            } else {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Number) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof Boolean) {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof wkgbmnqykc) {
            ((wkgbmnqykc) obj).iobyxmoadg(writer);
            return;
        }
        if (obj instanceof zoijcleaow) {
            writer.write(((zoijcleaow) obj).wkgbmnqykc());
            return;
        }
        if (obj instanceof Map) {
            ppxfxbqfkf.agtfadlqog((Map) obj, writer);
            return;
        }
        if (obj instanceof Collection) {
            iobyxmoadg.agtfadlqog((Collection) obj, writer);
            return;
        }
        if (obj instanceof byte[]) {
            iobyxmoadg.ojitshcjhn((byte[]) obj, writer);
            return;
        }
        if (obj instanceof short[]) {
            iobyxmoadg.cqumvgiudr((short[]) obj, writer);
            return;
        }
        if (obj instanceof int[]) {
            iobyxmoadg.zdlpuopuiu((int[]) obj, writer);
            return;
        }
        if (obj instanceof long[]) {
            iobyxmoadg.yggfygwlhe((long[]) obj, writer);
            return;
        }
        if (obj instanceof float[]) {
            iobyxmoadg.kcexrzcfyt((float[]) obj, writer);
            return;
        }
        if (obj instanceof double[]) {
            iobyxmoadg.vdvldrhtss((double[]) obj, writer);
            return;
        }
        if (obj instanceof boolean[]) {
            iobyxmoadg.lereixgezr((boolean[]) obj, writer);
            return;
        }
        if (obj instanceof char[]) {
            iobyxmoadg.rgvfuqvkyq((char[]) obj, writer);
        } else if (obj instanceof Object[]) {
            iobyxmoadg.jyumaefscl((Object[]) obj, writer);
        } else {
            wkgbmnqykc(obj.toString(), writer);
        }
    }

    static void zoijcleaow(String str, StringBuilder sb3) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\f') {
                sb3.append("\\f");
            } else if (cCharAt == '\r') {
                sb3.append("\\r");
            } else if (cCharAt == '\"') {
                sb3.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb3.append("\\b");
                        break;
                    case '\t':
                        sb3.append("\\t");
                        break;
                    case '\n':
                        sb3.append("\\n");
                        break;
                    default:
                        if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                            sb3.append(cCharAt);
                        } else {
                            String hexString = Integer.toHexString(cCharAt);
                            sb3.append("\\u");
                            for (int i14 = 0; i14 < 4 - hexString.length(); i14++) {
                                sb3.append('0');
                            }
                            sb3.append(hexString.toUpperCase());
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
    }
}
