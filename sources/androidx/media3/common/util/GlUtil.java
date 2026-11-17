package androidx.media3.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class GlUtil {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int[] f9825iobyxmoadg = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int[] f9828zoijcleaow = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f9826ppxfxbqfkf = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f9827wkgbmnqykc = {12445, 13632, 12344, 12344};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f9824eablkybsjg = {12344};

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static boolean btonecajqb() {
        return nufgyqmvbu("EGL_KHR_surfaceless_context");
    }

    public static boolean dxjokdxxww(Context context) {
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 < 24) {
            return false;
        }
        if (i13 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i13 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return nufgyqmvbu("EGL_EXT_protected_content");
        }
        return false;
    }

    public static FloatBuffer eablkybsjg(float[] fArr) {
        return (FloatBuffer) wkgbmnqykc(fArr.length).put(fArr).flip();
    }

    public static void gtknphoqwx(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static int gxszxtbevo() throws GlException {
        int iLqeggnwhkg = lqeggnwhkg();
        iobyxmoadg(36197, iLqeggnwhkg, 9729);
        return iLqeggnwhkg;
    }

    public static void iobyxmoadg(int i13, int i14, int i15) throws GlException {
        GLES20.glBindTexture(i13, i14);
        zoijcleaow();
        GLES20.glTexParameteri(i13, 10240, i15);
        zoijcleaow();
        GLES20.glTexParameteri(i13, 10241, i15);
        zoijcleaow();
        GLES20.glTexParameteri(i13, 10242, 33071);
        zoijcleaow();
        GLES20.glTexParameteri(i13, 10243, 33071);
        zoijcleaow();
    }

    public static int lqeggnwhkg() throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        zoijcleaow();
        return iArr[0];
    }

    private static boolean nufgyqmvbu(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void ppxfxbqfkf(boolean z13, String str) throws GlException {
        if (!z13) {
            throw new GlException(str);
        }
    }

    private static FloatBuffer wkgbmnqykc(int i13) {
        return ByteBuffer.allocateDirect(i13 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void zoijcleaow() throws GlException {
        StringBuilder sb3 = new StringBuilder();
        boolean z13 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z13) {
                sb3.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb3.append("glError: ");
            sb3.append(strGluErrorString);
            z13 = true;
        }
        if (z13) {
            throw new GlException(sb3.toString());
        }
    }
}
