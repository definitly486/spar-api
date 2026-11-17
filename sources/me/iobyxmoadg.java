package me;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import ge.nufgyqmvbu;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f66865eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f66866gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile Bitmap f66867iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Matrix f66868lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f66869ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f66870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile ByteBuffer f66871zoijcleaow;

    private iobyxmoadg(Bitmap bitmap, int i13) {
        this.f66867iobyxmoadg = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f66869ppxfxbqfkf = bitmap.getWidth();
        this.f66870wkgbmnqykc = bitmap.getHeight();
        gtknphoqwx(i13);
        this.f66865eablkybsjg = i13;
        this.f66866gxszxtbevo = -1;
        this.f66868lqeggnwhkg = null;
    }

    private static void draadjrbmk(int i13, int i14, long j13, int i15, int i16, int i17, int i18) {
        zzmu.zza(zzms.zzb("vision-common"), i13, i14, j13, i15, i16, i17, i18);
    }

    private static int gtknphoqwx(int i13) {
        boolean z13 = true;
        if (i13 != 0 && i13 != 90 && i13 != 180) {
            if (i13 == 270) {
                i13 = 270;
            } else {
                z13 = false;
            }
        }
        Preconditions.checkArgument(z13, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i13;
    }

    public static iobyxmoadg iobyxmoadg(Bitmap bitmap, int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(bitmap, i13);
        draadjrbmk(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i13);
        return iobyxmoadgVar;
    }

    public int btonecajqb() {
        return this.f66869ppxfxbqfkf;
    }

    public int dxjokdxxww() {
        return this.f66865eablkybsjg;
    }

    public int eablkybsjg() {
        return this.f66866gxszxtbevo;
    }

    public int gxszxtbevo() {
        return this.f66870wkgbmnqykc;
    }

    public Image lqeggnwhkg() {
        return null;
    }

    public Image.Plane[] nufgyqmvbu() {
        return null;
    }

    public ByteBuffer ppxfxbqfkf() {
        return this.f66871zoijcleaow;
    }

    public Matrix wkgbmnqykc() {
        return this.f66868lqeggnwhkg;
    }

    public Bitmap zoijcleaow() {
        return this.f66867iobyxmoadg;
    }
}
