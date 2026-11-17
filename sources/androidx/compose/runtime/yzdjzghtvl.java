package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class yzdjzghtvl {
    public static final int eablkybsjg(androidx.collection.yadqdtsiqt yadqdtsiqtVar) {
        return yadqdtsiqtVar.wkgbmnqykc();
    }

    public static final int gxszxtbevo(androidx.collection.yadqdtsiqt yadqdtsiqtVar) {
        int iEablkybsjg;
        int i13 = yadqdtsiqtVar.f4401zoijcleaow;
        int iEablkybsjg2 = yadqdtsiqtVar.eablkybsjg(0);
        while (yadqdtsiqtVar.f4401zoijcleaow != 0 && yadqdtsiqtVar.eablkybsjg(0) == iEablkybsjg2) {
            yadqdtsiqtVar.rgvfuqvkyq(0, yadqdtsiqtVar.nufgyqmvbu());
            yadqdtsiqtVar.agtfadlqog(yadqdtsiqtVar.f4401zoijcleaow - 1);
            int i14 = yadqdtsiqtVar.f4401zoijcleaow;
            int i15 = i14 >>> 1;
            int i16 = 0;
            while (i16 < i15) {
                int iEablkybsjg3 = yadqdtsiqtVar.eablkybsjg(i16);
                int i17 = (i16 + 1) * 2;
                int i18 = i17 - 1;
                int iEablkybsjg4 = yadqdtsiqtVar.eablkybsjg(i18);
                if (i17 < i14 && (iEablkybsjg = yadqdtsiqtVar.eablkybsjg(i17)) > iEablkybsjg4) {
                    if (iEablkybsjg <= iEablkybsjg3) {
                        break;
                    }
                    yadqdtsiqtVar.rgvfuqvkyq(i16, iEablkybsjg);
                    yadqdtsiqtVar.rgvfuqvkyq(i17, iEablkybsjg3);
                    i16 = i17;
                } else {
                    if (iEablkybsjg4 <= iEablkybsjg3) {
                        break;
                    }
                    yadqdtsiqtVar.rgvfuqvkyq(i16, iEablkybsjg4);
                    yadqdtsiqtVar.rgvfuqvkyq(i18, iEablkybsjg3);
                    i16 = i18;
                }
            }
        }
        return iEablkybsjg2;
    }

    public static final void iobyxmoadg(androidx.collection.yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (yadqdtsiqtVar.f4401zoijcleaow == 0 || !(yadqdtsiqtVar.eablkybsjg(0) == i13 || yadqdtsiqtVar.eablkybsjg(yadqdtsiqtVar.f4401zoijcleaow - 1) == i13)) {
            int i14 = yadqdtsiqtVar.f4401zoijcleaow;
            yadqdtsiqtVar.btonecajqb(i13);
            while (i14 > 0) {
                int i15 = ((i14 + 1) >>> 1) - 1;
                int iEablkybsjg = yadqdtsiqtVar.eablkybsjg(i15);
                if (i13 <= iEablkybsjg) {
                    break;
                }
                yadqdtsiqtVar.rgvfuqvkyq(i14, iEablkybsjg);
                i14 = i15;
            }
            yadqdtsiqtVar.rgvfuqvkyq(i14, i13);
        }
    }

    public static /* synthetic */ androidx.collection.yadqdtsiqt ppxfxbqfkf(androidx.collection.yadqdtsiqt yadqdtsiqtVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        int i14 = 1;
        if ((i13 & 1) != 0) {
            yadqdtsiqtVar = new androidx.collection.yadqdtsiqt(0, i14, null);
        }
        return zoijcleaow(yadqdtsiqtVar);
    }

    public static final boolean wkgbmnqykc(androidx.collection.yadqdtsiqt yadqdtsiqtVar) {
        return yadqdtsiqtVar.f4401zoijcleaow != 0;
    }

    public static androidx.collection.yadqdtsiqt zoijcleaow(androidx.collection.yadqdtsiqt yadqdtsiqtVar) {
        return yadqdtsiqtVar;
    }
}
