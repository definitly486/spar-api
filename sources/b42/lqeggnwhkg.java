package b42;

import a42.rgvfuqvkyq;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.camera.core.agtfadlqog;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a42.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f15197eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gtknphoqwx f15198gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a42.ppxfxbqfkf f15199iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gtknphoqwx f15200lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Size f15201ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f15202wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f15203zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f15204iobyxmoadg;

        static {
            int[] iArr = new int[a42.ppxfxbqfkf.values().length];
            try {
                iArr[a42.ppxfxbqfkf.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a42.ppxfxbqfkf.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a42.ppxfxbqfkf.MATRIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15204iobyxmoadg = iArr;
        }
    }

    public lqeggnwhkg(a42.ppxfxbqfkf ppxfxbqfkfVar, rgvfuqvkyq scanArea, Size displaySize, draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(scanArea, "scanArea");
        zdlpuopuiu.btonecajqb(displaySize, "displaySize");
        this.f15199iobyxmoadg = ppxfxbqfkfVar;
        this.f15203zoijcleaow = scanArea;
        this.f15201ppxfxbqfkf = displaySize;
        this.f15202wkgbmnqykc = draadjrbmkVar;
        this.f15198gxszxtbevo = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: b42.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.vdvldrhtss(this.f15196zdlpuopuiu);
            }
        });
        this.f15200lqeggnwhkg = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: b42.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.kcexrzcfyt(this.f15207zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(agtfadlqog agtfadlqogVar, Bitmap bitmap, Exception it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqogVar.close();
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(draadjrbmk draadjrbmkVar, Object obj) {
        draadjrbmkVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(lqeggnwhkg lqeggnwhkgVar, List list) {
        zdlpuopuiu.lqeggnwhkg(list);
        lqeggnwhkgVar.oxmwwwfdhm(list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie.iobyxmoadg kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar) {
        return ie.ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar.ojitshcjhn());
    }

    private final ie.zoijcleaow ojitshcjhn() {
        return (ie.zoijcleaow) this.f15198gxszxtbevo.getValue();
    }

    private final void oxmwwwfdhm(List list) {
        draadjrbmk draadjrbmkVar;
        if (!this.f15197eablkybsjg || list.isEmpty()) {
            return;
        }
        this.f15197eablkybsjg = false;
        String strPpxfxbqfkf = ((je.iobyxmoadg) list.get(0)).ppxfxbqfkf();
        if (strPpxfxbqfkf == null || (draadjrbmkVar = this.f15202wkgbmnqykc) == null) {
            return;
        }
        draadjrbmkVar.invoke(strPpxfxbqfkf);
    }

    private final ie.iobyxmoadg rgvfuqvkyq() {
        return (ie.iobyxmoadg) this.f15200lqeggnwhkg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie.zoijcleaow vdvldrhtss(lqeggnwhkg lqeggnwhkgVar) {
        ie.zoijcleaow.iobyxmoadg iobyxmoadgVar = new ie.zoijcleaow.iobyxmoadg();
        a42.ppxfxbqfkf ppxfxbqfkfVar = lqeggnwhkgVar.f15199iobyxmoadg;
        int i13 = ppxfxbqfkfVar == null ? -1 : iobyxmoadg.f15204iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == -1) {
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else if (i13 == 1) {
            zdlpuopuiu.dxjokdxxww(iobyxmoadgVar.zoijcleaow(UserVerificationMethods.USER_VERIFY_HANDPRINT, new int[0]), "setBarcodeFormats(...)");
        } else if (i13 == 2) {
            zdlpuopuiu.dxjokdxxww(iobyxmoadgVar.zoijcleaow(64, 32, 1, 2, 4, UserVerificationMethods.USER_VERIFY_NONE, UserVerificationMethods.USER_VERIFY_ALL, 8), "setBarcodeFormats(...)");
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zdlpuopuiu.dxjokdxxww(iobyxmoadgVar.zoijcleaow(16, new int[0]), "setBarcodeFormats(...)");
        }
        return iobyxmoadgVar.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(agtfadlqog agtfadlqogVar, Bitmap bitmap, Task it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqogVar.close();
        bitmap.recycle();
    }

    @Override // a42.iobyxmoadg
    public void iobyxmoadg() {
        this.f15197eablkybsjg = true;
    }

    @Override // androidx.camera.core.gxszxtbevo.iobyxmoadg
    public void wkgbmnqykc(final agtfadlqog image) {
        zdlpuopuiu.btonecajqb(image, "image");
        final Bitmap bitmapZoijcleaow = a42.wkgbmnqykc.zoijcleaow(image, this.f15203zoijcleaow, this.f15201ppxfxbqfkf);
        if (bitmapZoijcleaow != null) {
            me.iobyxmoadg iobyxmoadgVarIobyxmoadg = me.iobyxmoadg.iobyxmoadg(bitmapZoijcleaow, 0);
            zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "fromBitmap(...)");
            Task taskEablkybsjg = rgvfuqvkyq().eablkybsjg(iobyxmoadgVarIobyxmoadg);
            final draadjrbmk draadjrbmkVar = new draadjrbmk() { // from class: b42.ppxfxbqfkf
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return lqeggnwhkg.gtknphoqwx(this.f15205zdlpuopuiu, (List) obj);
                }
            };
            if (taskEablkybsjg.addOnSuccessListener(new OnSuccessListener() { // from class: b42.wkgbmnqykc
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    lqeggnwhkg.draadjrbmk(draadjrbmkVar, obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: b42.eablkybsjg
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    lqeggnwhkg.wflxmlrfwp(image, bitmapZoijcleaow, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: b42.gxszxtbevo
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    lqeggnwhkg.agtfadlqog(image, bitmapZoijcleaow, exc);
                }
            }) != null) {
                return;
            }
        }
        image.close();
        if (bitmapZoijcleaow != null) {
            bitmapZoijcleaow.recycle();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // a42.iobyxmoadg
    public void zoijcleaow() {
        this.f15197eablkybsjg = false;
    }
}
