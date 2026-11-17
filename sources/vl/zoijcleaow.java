package vl;

import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static void btonecajqb(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }

    public static void draadjrbmk(Object obj, String str) {
        if (obj == null) {
            throw new ValidationException(String.format("The parameter '%s' must not be null.", str));
        }
    }

    public static void dxjokdxxww(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(String.format("The '%s' parameter must not be empty.", str2));
        }
    }

    public static void eablkybsjg(Object[] objArr) {
        gxszxtbevo(objArr, "Array must not contain any null objects");
    }

    public static void gtknphoqwx(Object obj, String str) {
        if (obj == null) {
            throw new ValidationException(str);
        }
    }

    public static void gxszxtbevo(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new ValidationException(str);
            }
        }
    }

    public static void iobyxmoadg(String str) {
        throw new ValidationException(str);
    }

    public static void lqeggnwhkg(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void nufgyqmvbu(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ValidationException(str2);
        }
    }

    public static void ppxfxbqfkf(boolean z13) {
        if (!z13) {
            throw new ValidationException("Must be true");
        }
    }

    public static void wflxmlrfwp(String str) {
        throw new IllegalStateException(str);
    }

    public static void wkgbmnqykc(boolean z13, String str) {
        if (!z13) {
            throw new ValidationException(str);
        }
    }

    public static void zoijcleaow(boolean z13) {
        if (z13) {
            throw new ValidationException("Must be false");
        }
    }
}
