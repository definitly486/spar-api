package xp1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Size;
import androidx.camera.core.agtfadlqog;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import wp1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements wp1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f122995eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg.gtknphoqwx f122996gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wp1.wkgbmnqykc f122997iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Size f122998ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f122999wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f123000zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {

        /* JADX INFO: renamed from: xp1.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3105iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ie.iobyxmoadg f123001iobyxmoadg;

            public C3105iobyxmoadg(ie.iobyxmoadg barcodeScanner) {
                zdlpuopuiu.btonecajqb(barcodeScanner, "barcodeScanner");
                this.f123001iobyxmoadg = barcodeScanner;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3105iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123001iobyxmoadg, ((C3105iobyxmoadg) obj).f123001iobyxmoadg);
            }

            public int hashCode() {
                return this.f123001iobyxmoadg.hashCode();
            }

            public final ie.iobyxmoadg iobyxmoadg() {
                return this.f123001iobyxmoadg;
            }

            public String toString() {
                return "Barcode(barcodeScanner=" + this.f123001iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final oe.ppxfxbqfkf f123002iobyxmoadg;

            public zoijcleaow(oe.ppxfxbqfkf textRecognizer) {
                zdlpuopuiu.btonecajqb(textRecognizer, "textRecognizer");
                this.f123002iobyxmoadg = textRecognizer;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f123002iobyxmoadg, ((zoijcleaow) obj).f123002iobyxmoadg);
            }

            public int hashCode() {
                return this.f123002iobyxmoadg.hashCode();
            }

            public final oe.ppxfxbqfkf iobyxmoadg() {
                return this.f123002iobyxmoadg;
            }

            public String toString() {
                return "Card(textRecognizer=" + this.f123002iobyxmoadg + ")";
            }
        }
    }

    public btonecajqb(wp1.wkgbmnqykc type, rgvfuqvkyq scanArea, Size displaySize, tg.draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(scanArea, "scanArea");
        zdlpuopuiu.btonecajqb(displaySize, "displaySize");
        this.f122997iobyxmoadg = type;
        this.f123000zoijcleaow = scanArea;
        this.f122998ppxfxbqfkf = displaySize;
        this.f122999wkgbmnqykc = draadjrbmkVar;
        this.f122996gxszxtbevo = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xp1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return btonecajqb.lereixgezr(this.f123008zdlpuopuiu);
            }
        });
    }

    private static final void agtfadlqog(agtfadlqog agtfadlqogVar, Bitmap bitmap) {
        agtfadlqogVar.close();
        bitmap.recycle();
    }

    private final void cqumvgiudr(List list) {
        tg.draadjrbmk draadjrbmkVar;
        if (!this.f122995eablkybsjg || list.isEmpty()) {
            return;
        }
        this.f122995eablkybsjg = false;
        String strPpxfxbqfkf = ((je.iobyxmoadg) list.get(0)).ppxfxbqfkf();
        if (strPpxfxbqfkf == null || (draadjrbmkVar = this.f122999wkgbmnqykc) == null) {
            return;
        }
        draadjrbmkVar.invoke(strPpxfxbqfkf);
    }

    private final void esjtqupxsv(oe.iobyxmoadg iobyxmoadgVar) {
        Object next;
        if (this.f122995eablkybsjg) {
            List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            zdlpuopuiu.dxjokdxxww(listIobyxmoadg, "getTextBlocks(...)");
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            Iterator it = listIobyxmoadg.iterator();
            while (it.hasNext()) {
                String strPpxfxbqfkf = ((oe.iobyxmoadg.eablkybsjg) it.next()).ppxfxbqfkf();
                zdlpuopuiu.dxjokdxxww(strPpxfxbqfkf, "getText(...)");
                arrayList.add(kcexrzcfyt.hcddaimhww(strPpxfxbqfkf, " ", "", false, 4, null));
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String str = (String) next;
                if (TextUtils.isDigitsOnly(str) && str.length() == 16) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                this.f122995eablkybsjg = false;
                tg.draadjrbmk draadjrbmkVar = this.f122999wkgbmnqykc;
                if (draadjrbmkVar != null) {
                    draadjrbmkVar.invoke(str2);
                }
            }
        }
    }

    private final iobyxmoadg iwizpuwonk() {
        return (iobyxmoadg) this.f122996gxszxtbevo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(agtfadlqog agtfadlqogVar, Bitmap bitmap, Exception it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqog(agtfadlqogVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(btonecajqb btonecajqbVar, oe.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
        btonecajqbVar.esjtqupxsv(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iobyxmoadg lereixgezr(btonecajqb btonecajqbVar) {
        wp1.wkgbmnqykc wkgbmnqykcVar = btonecajqbVar.f122997iobyxmoadg;
        if (!(wkgbmnqykcVar instanceof wp1.wkgbmnqykc.iobyxmoadg)) {
            if (!(wkgbmnqykcVar instanceof wp1.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            oe.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = oe.zoijcleaow.iobyxmoadg(qe.iobyxmoadg.f78660wkgbmnqykc);
            zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarIobyxmoadg, "getClient(...)");
            return new iobyxmoadg.zoijcleaow(ppxfxbqfkfVarIobyxmoadg);
        }
        ie.zoijcleaow.iobyxmoadg iobyxmoadgVar = new ie.zoijcleaow.iobyxmoadg();
        wp1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = (wp1.wkgbmnqykc.iobyxmoadg) btonecajqbVar.f122997iobyxmoadg;
        if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, wp1.wkgbmnqykc.iobyxmoadg.C3025iobyxmoadg.f120436iobyxmoadg)) {
            iobyxmoadgVar.zoijcleaow(64, 32, 1, 2, 4, UserVerificationMethods.USER_VERIFY_NONE, UserVerificationMethods.USER_VERIFY_ALL, 8);
        } else if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, wp1.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.f120437iobyxmoadg)) {
            iobyxmoadgVar.zoijcleaow(UserVerificationMethods.USER_VERIFY_HANDPRINT, new int[0]);
        } else {
            if (!zdlpuopuiu.eablkybsjg(iobyxmoadgVar2, wp1.wkgbmnqykc.iobyxmoadg.zoijcleaow.f120438iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.zoijcleaow(16, new int[0]);
        }
        ie.iobyxmoadg iobyxmoadgVarIobyxmoadg = ie.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "getClient(...)");
        return new iobyxmoadg.C3105iobyxmoadg(iobyxmoadgVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(btonecajqb btonecajqbVar, List list) {
        zdlpuopuiu.lqeggnwhkg(list);
        btonecajqbVar.cqumvgiudr(list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(agtfadlqog agtfadlqogVar, Bitmap bitmap, Exception it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqog(agtfadlqogVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(tg.draadjrbmk draadjrbmkVar, Object obj) {
        draadjrbmkVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(agtfadlqog agtfadlqogVar, Bitmap bitmap, Task it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqog(agtfadlqogVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(agtfadlqog agtfadlqogVar, Bitmap bitmap, Task it) {
        zdlpuopuiu.btonecajqb(it, "it");
        agtfadlqog(agtfadlqogVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(tg.draadjrbmk draadjrbmkVar, Object obj) {
        draadjrbmkVar.invoke(obj);
    }

    @Override // wp1.iobyxmoadg
    public void iobyxmoadg() {
        this.f122995eablkybsjg = true;
    }

    @Override // androidx.camera.core.gxszxtbevo.iobyxmoadg
    public void wkgbmnqykc(final agtfadlqog image) {
        zdlpuopuiu.btonecajqb(image, "image");
        final Bitmap bitmapZoijcleaow = wp1.ppxfxbqfkf.zoijcleaow(image, this.f123000zoijcleaow, this.f122998ppxfxbqfkf);
        if (bitmapZoijcleaow == null) {
            image.close();
            return;
        }
        me.iobyxmoadg iobyxmoadgVarIobyxmoadg = me.iobyxmoadg.iobyxmoadg(bitmapZoijcleaow, 0);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarIobyxmoadg, "fromBitmap(...)");
        iobyxmoadg iobyxmoadgVarIwizpuwonk = iwizpuwonk();
        if (iobyxmoadgVarIwizpuwonk instanceof iobyxmoadg.C3105iobyxmoadg) {
            Task taskEablkybsjg = ((iobyxmoadg.C3105iobyxmoadg) iobyxmoadgVarIwizpuwonk).iobyxmoadg().eablkybsjg(iobyxmoadgVarIobyxmoadg);
            final tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: xp1.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return btonecajqb.ojitshcjhn(this.f123015zdlpuopuiu, (List) obj);
                }
            };
            zdlpuopuiu.lqeggnwhkg(taskEablkybsjg.addOnSuccessListener(new OnSuccessListener() { // from class: xp1.ppxfxbqfkf
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    btonecajqb.rgvfuqvkyq(draadjrbmkVar, obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: xp1.wkgbmnqykc
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    btonecajqb.vdvldrhtss(image, bitmapZoijcleaow, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: xp1.eablkybsjg
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    btonecajqb.oxmwwwfdhm(image, bitmapZoijcleaow, exc);
                }
            }));
        } else {
            if (!(iobyxmoadgVarIwizpuwonk instanceof iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            Task taskEablkybsjg2 = ((iobyxmoadg.zoijcleaow) iobyxmoadgVarIwizpuwonk).iobyxmoadg().eablkybsjg(iobyxmoadgVarIobyxmoadg);
            final tg.draadjrbmk draadjrbmkVar2 = new tg.draadjrbmk() { // from class: xp1.gxszxtbevo
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return btonecajqb.kcexrzcfyt(this.f123007zdlpuopuiu, (oe.iobyxmoadg) obj);
                }
            };
            zdlpuopuiu.lqeggnwhkg(taskEablkybsjg2.addOnSuccessListener(new OnSuccessListener() { // from class: xp1.lqeggnwhkg
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    btonecajqb.zdlpuopuiu(draadjrbmkVar2, obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: xp1.nufgyqmvbu
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    btonecajqb.yggfygwlhe(image, bitmapZoijcleaow, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: xp1.dxjokdxxww
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    btonecajqb.jyumaefscl(image, bitmapZoijcleaow, exc);
                }
            }));
        }
    }

    @Override // wp1.iobyxmoadg
    public void zoijcleaow() {
        this.f122995eablkybsjg = false;
    }
}
