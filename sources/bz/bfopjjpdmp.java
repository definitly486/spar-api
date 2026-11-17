package bz;

import android.os.Build;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class bfopjjpdmp extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Set f17387eablkybsjg;

    bfopjjpdmp(Set set) {
        super(kc2.lqeggnwhkg.BuildData);
        this.f17387eablkybsjg = set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.BOARD)) {
            iobyxmoadgVar.put("BOARD", Build.BOARD);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.BOOTLOADER)) {
            iobyxmoadgVar.put("BOOTLOADER", Build.BOOTLOADER);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.BRAND)) {
            iobyxmoadgVar.put("BRAND", Build.BRAND);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.DEVICE)) {
            iobyxmoadgVar.put("DEVICE", Build.DEVICE);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.DISPLAY)) {
            iobyxmoadgVar.put("DISPLAY", Build.DISPLAY);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.FINGERPRINT)) {
            iobyxmoadgVar.put("FINGERPRINT", Build.FINGERPRINT);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.HARDWARE)) {
            iobyxmoadgVar.put("HARDWARE", Build.HARDWARE);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.ID)) {
            iobyxmoadgVar.put("ID", Build.ID);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.MANUFACTURER)) {
            iobyxmoadgVar.put("MANUFACTURER", Build.MANUFACTURER);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.PRODUCT)) {
            iobyxmoadgVar.put("PRODUCT", Build.PRODUCT);
        }
        if (this.f17387eablkybsjg.contains(kc2.lqeggnwhkg.RADIO)) {
            iobyxmoadgVar.put("RADIO", Build.RADIO);
        }
        return iobyxmoadgVar;
    }
}
