package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f8499iobyxmoadg = versionedParcel.rgvfuqvkyq(iconCompat.f8499iobyxmoadg, 1);
        iconCompat.f8502ppxfxbqfkf = versionedParcel.btonecajqb(iconCompat.f8502ppxfxbqfkf, 2);
        iconCompat.f8503wkgbmnqykc = versionedParcel.oxmwwwfdhm(iconCompat.f8503wkgbmnqykc, 3);
        iconCompat.f8497eablkybsjg = versionedParcel.rgvfuqvkyq(iconCompat.f8497eablkybsjg, 4);
        iconCompat.f8498gxszxtbevo = versionedParcel.rgvfuqvkyq(iconCompat.f8498gxszxtbevo, 5);
        iconCompat.f8500lqeggnwhkg = (ColorStateList) versionedParcel.oxmwwwfdhm(iconCompat.f8500lqeggnwhkg, 6);
        iconCompat.f8496dxjokdxxww = versionedParcel.zdlpuopuiu(iconCompat.f8496dxjokdxxww, 7);
        iconCompat.f8495btonecajqb = versionedParcel.zdlpuopuiu(iconCompat.f8495btonecajqb, 8);
        iconCompat.ojitshcjhn();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.cqumvgiudr(true, true);
        iconCompat.rgvfuqvkyq(versionedParcel.gxszxtbevo());
        int i13 = iconCompat.f8499iobyxmoadg;
        if (-1 != i13) {
            versionedParcel.iozdgvuglv(i13, 1);
        }
        byte[] bArr = iconCompat.f8502ppxfxbqfkf;
        if (bArr != null) {
            versionedParcel.zynmafqrjb(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f8503wkgbmnqykc;
        if (parcelable != null) {
            versionedParcel.wwaezpbzkn(parcelable, 3);
        }
        int i14 = iconCompat.f8497eablkybsjg;
        if (i14 != 0) {
            versionedParcel.iozdgvuglv(i14, 4);
        }
        int i15 = iconCompat.f8498gxszxtbevo;
        if (i15 != 0) {
            versionedParcel.iozdgvuglv(i15, 5);
        }
        ColorStateList colorStateList = iconCompat.f8500lqeggnwhkg;
        if (colorStateList != null) {
            versionedParcel.wwaezpbzkn(colorStateList, 6);
        }
        String str = iconCompat.f8496dxjokdxxww;
        if (str != null) {
            versionedParcel.pkzmftpjix(str, 7);
        }
        String str2 = iconCompat.f8495btonecajqb;
        if (str2 != null) {
            versionedParcel.pkzmftpjix(str2, 8);
        }
    }
}
