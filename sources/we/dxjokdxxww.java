package we;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.BuildConfig;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f119425iobyxmoadg = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[][] f119428zoijcleaow = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, KotlinVersion.MAX_COMPONENT_VALUE, 110, 61}, new int[]{175, 138, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{OrderServiceErrorHandlerImpl.SYSTEM_ERROR, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, KotlinVersion.MAX_COMPONENT_VALUE}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, BuildConfig.API_LEVEL, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, OrderServiceErrorHandlerImpl.OPERATION_PARAMETER_INCORRECT, 29, 232, 144, 238, 22, 150, OrderServiceErrorHandlerImpl.ACCESS_DENIED, 117, 62, OrderServiceErrorHandlerImpl.ORDER_LOCKED, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, OrderServiceErrorHandlerImpl.OPERATION_PARAMETER_INCORRECT, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, 39, 118, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION, 188, OrderServiceErrorHandlerImpl.ACCESS_DENIED, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION, 167, 179, 25, 220, 232, 96, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f119426ppxfxbqfkf = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f119427wkgbmnqykc = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    static {
        int i13 = 1;
        for (int i14 = 0; i14 < 255; i14++) {
            f119427wkgbmnqykc[i14] = i13;
            f119426ppxfxbqfkf[i13] = i14;
            i13 <<= 1;
            if (i13 >= 256) {
                i13 ^= 301;
            }
        }
    }

    private static String iobyxmoadg(CharSequence charSequence, int i13) {
        int i14;
        int i15;
        int i16 = 0;
        while (true) {
            int[] iArr = f119425iobyxmoadg;
            if (i16 >= iArr.length) {
                i16 = -1;
                break;
            }
            if (iArr[i16] == i13) {
                break;
            }
            i16++;
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i13)));
        }
        int[] iArr2 = f119428zoijcleaow[i16];
        char[] cArr = new char[i13];
        for (int i17 = 0; i17 < i13; i17++) {
            cArr[i17] = 0;
        }
        for (int i18 = 0; i18 < charSequence.length(); i18++) {
            int i19 = i13 - 1;
            int iCharAt = cArr[i19] ^ charSequence.charAt(i18);
            while (i19 > 0) {
                if (iCharAt == 0 || (i15 = iArr2[i19]) == 0) {
                    cArr[i19] = cArr[i19 - 1];
                } else {
                    char c13 = cArr[i19 - 1];
                    int[] iArr3 = f119427wkgbmnqykc;
                    int[] iArr4 = f119426ppxfxbqfkf;
                    cArr[i19] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i15]) % KotlinVersion.MAX_COMPONENT_VALUE] ^ c13);
                }
                i19--;
            }
            if (iCharAt == 0 || (i14 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f119427wkgbmnqykc;
                int[] iArr6 = f119426ppxfxbqfkf;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i14]) % KotlinVersion.MAX_COMPONENT_VALUE];
            }
        }
        char[] cArr2 = new char[i13];
        for (int i23 = 0; i23 < i13; i23++) {
            cArr2[i23] = cArr[(i13 - i23) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String zoijcleaow(String str, gtknphoqwx gtknphoqwxVar) {
        if (str.length() != gtknphoqwxVar.iobyxmoadg()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb3 = new StringBuilder(gtknphoqwxVar.iobyxmoadg() + gtknphoqwxVar.ppxfxbqfkf());
        sb3.append(str);
        int iGxszxtbevo = gtknphoqwxVar.gxszxtbevo();
        if (iGxszxtbevo == 1) {
            sb3.append(iobyxmoadg(str, gtknphoqwxVar.ppxfxbqfkf()));
        } else {
            sb3.setLength(sb3.capacity());
            int[] iArr = new int[iGxszxtbevo];
            int[] iArr2 = new int[iGxszxtbevo];
            int i13 = 0;
            while (i13 < iGxszxtbevo) {
                int i14 = i13 + 1;
                iArr[i13] = gtknphoqwxVar.zoijcleaow(i14);
                iArr2[i13] = gtknphoqwxVar.wkgbmnqykc(i14);
                i13 = i14;
            }
            for (int i15 = 0; i15 < iGxszxtbevo; i15++) {
                StringBuilder sb4 = new StringBuilder(iArr[i15]);
                for (int i16 = i15; i16 < gtknphoqwxVar.iobyxmoadg(); i16 += iGxszxtbevo) {
                    sb4.append(str.charAt(i16));
                }
                String strIobyxmoadg = iobyxmoadg(sb4.toString(), iArr2[i15]);
                int i17 = 0;
                int i18 = i15;
                while (i18 < iArr2[i15] * iGxszxtbevo) {
                    sb3.setCharAt(gtknphoqwxVar.iobyxmoadg() + i18, strIobyxmoadg.charAt(i17));
                    i18 += iGxszxtbevo;
                    i17++;
                }
            }
        }
        return sb3.toString();
    }
}
