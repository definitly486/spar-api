package xa;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq {
    public static String iobyxmoadg(String str) {
        return gtknphoqwx.iobyxmoadg(str);
    }

    private static String ppxfxbqfkf(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e13) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e13);
            return "<" + str + " threw " + e13.getClass().getName() + ">";
        }
    }

    public static String wkgbmnqykc(String str) {
        return gtknphoqwx.ppxfxbqfkf(str);
    }

    public static String zoijcleaow(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i13 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i14 = 0; i14 < objArr.length; i14++) {
                objArr[i14] = ppxfxbqfkf(objArr[i14]);
            }
        }
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i15 = 0;
        while (i13 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i15)) != -1) {
            sb3.append((CharSequence) strValueOf, i15, iIndexOf);
            sb3.append(objArr[i13]);
            i15 = iIndexOf + 2;
            i13++;
        }
        sb3.append((CharSequence) strValueOf, i15, strValueOf.length());
        if (i13 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
