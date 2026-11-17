package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class CameraValidator {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final lereixgezr.rgvfuqvkyq f3709iobyxmoadg = new lereixgezr.rgvfuqvkyq.iobyxmoadg().zoijcleaow(2).iobyxmoadg();

    public static class CameraIdListIncorrectException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f3710zdlpuopuiu;

        public CameraIdListIncorrectException(String str, int i13, Throwable th2) {
            super(str, th2);
            this.f3710zdlpuopuiu = i13;
        }

        public int iobyxmoadg() {
            return this.f3710zdlpuopuiu;
        }
    }

    private static class iobyxmoadg {
        static int iobyxmoadg(Context context) {
            return context.getDeviceId();
        }
    }

    public static void iobyxmoadg(Context context, istkbnxepw.esjtqupxsv esjtqupxsvVar, lereixgezr.rgvfuqvkyq rgvfuqvkyqVar) throws CameraIdListIncorrectException {
        Integer numWkgbmnqykc;
        int i13 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && iobyxmoadg.iobyxmoadg(context) != 0) {
            LinkedHashSet linkedHashSetIobyxmoadg = esjtqupxsvVar.iobyxmoadg();
            if (linkedHashSetIobyxmoadg.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            sopmlzcsov.iobyxmoadg("CameraValidator", "Virtual device with ID: " + iobyxmoadg.iobyxmoadg(context) + " has " + linkedHashSetIobyxmoadg.size() + " cameras. Skipping validation.");
            return;
        }
        if (rgvfuqvkyqVar != null) {
            try {
                numWkgbmnqykc = rgvfuqvkyqVar.wkgbmnqykc();
                if (numWkgbmnqykc == null) {
                    sopmlzcsov.draadjrbmk("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e13) {
                sopmlzcsov.wkgbmnqykc("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e13);
                return;
            }
        } else {
            numWkgbmnqykc = null;
        }
        sopmlzcsov.iobyxmoadg("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numWkgbmnqykc);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (rgvfuqvkyqVar == null || numWkgbmnqykc.intValue() == 1)) {
                lereixgezr.rgvfuqvkyq.f62357wkgbmnqykc.eablkybsjg(esjtqupxsvVar.iobyxmoadg());
                i13 = 1;
            }
        } catch (IllegalArgumentException e14) {
            illegalArgumentException = e14;
            sopmlzcsov.wflxmlrfwp("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (rgvfuqvkyqVar == null || numWkgbmnqykc.intValue() == 0)) {
                lereixgezr.rgvfuqvkyq.f62356ppxfxbqfkf.eablkybsjg(esjtqupxsvVar.iobyxmoadg());
                i13++;
            }
        } catch (IllegalArgumentException e15) {
            illegalArgumentException = e15;
            sopmlzcsov.wflxmlrfwp("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f3709iobyxmoadg.eablkybsjg(esjtqupxsvVar.iobyxmoadg());
            sopmlzcsov.iobyxmoadg("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i13++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        sopmlzcsov.ppxfxbqfkf("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + esjtqupxsvVar.iobyxmoadg());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i13, illegalArgumentException);
    }
}
