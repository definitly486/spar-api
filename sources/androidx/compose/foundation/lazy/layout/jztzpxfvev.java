package androidx.compose.foundation.lazy.layout;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class jztzpxfvev {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f5032iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(2500);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f5034zoijcleaow = w0.nufgyqmvbu.lqeggnwhkg(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f5033ppxfxbqfkf = w0.nufgyqmvbu.lqeggnwhkg(50);

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        float f5035cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f5036cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f5037esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        int f5038iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        float f5039istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f5040iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f5041jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f5042lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f5043pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        /* synthetic */ Object f5044yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f5045yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5046zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        float f5047zynmafqrjb;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f5044yadqdtsiqt = obj;
            this.f5038iozdgvuglv |= Integer.MIN_VALUE;
            return jztzpxfvev.ppxfxbqfkf(null, 0, 0, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(jhduphickx jhduphickxVar, int i13, float f13, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, boolean z13, float f14, kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, int i14, int i15, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, vipkmwdibw.btonecajqb btonecajqbVar) {
        if (!lqeggnwhkg(jhduphickxVar, i13)) {
            float fDxjokdxxww = (f13 > 0.0f ? zg.gtknphoqwx.dxjokdxxww(((Number) btonecajqbVar.eablkybsjg()).floatValue(), f13) : zg.gtknphoqwx.eablkybsjg(((Number) btonecajqbVar.eablkybsjg()).floatValue(), f13)) - pkzmftpjixVar.f60030zdlpuopuiu;
            float fWkgbmnqykc = jhduphickxVar.wkgbmnqykc(fDxjokdxxww);
            if (!lqeggnwhkg(jhduphickxVar, i13) && !wkgbmnqykc(z13, jhduphickxVar, i13, i15)) {
                if (fDxjokdxxww != fWkgbmnqykc) {
                    btonecajqbVar.iobyxmoadg();
                    ylkuphrtabVar.f60038zdlpuopuiu = false;
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                pkzmftpjixVar.f60030zdlpuopuiu += fDxjokdxxww;
                if (z13) {
                    if (((Number) btonecajqbVar.eablkybsjg()).floatValue() > f14) {
                        btonecajqbVar.iobyxmoadg();
                    }
                } else if (((Number) btonecajqbVar.eablkybsjg()).floatValue() < (-f14)) {
                    btonecajqbVar.iobyxmoadg();
                }
                if (z13) {
                    if (hcddaimhwwVar.f60014zdlpuopuiu >= 2 && i13 - jhduphickxVar.zoijcleaow() > i14) {
                        jhduphickxVar.ppxfxbqfkf(i13 - i14, 0);
                    }
                } else if (hcddaimhwwVar.f60014zdlpuopuiu >= 2 && jhduphickxVar.nufgyqmvbu() - i13 > i14) {
                    jhduphickxVar.ppxfxbqfkf(i14 + i13, 0);
                }
            }
        }
        if (!wkgbmnqykc(z13, jhduphickxVar, i13, i15)) {
            if (lqeggnwhkg(jhduphickxVar, i13)) {
                throw new nufgyqmvbu(jhduphickx.eablkybsjg(jhduphickxVar, i13, 0, 2, null), (vipkmwdibw.wflxmlrfwp) hkdspvbjdzVar.f60015zdlpuopuiu);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        jhduphickxVar.ppxfxbqfkf(i13, i15);
        ylkuphrtabVar.f60038zdlpuopuiu = false;
        btonecajqbVar.iobyxmoadg();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(float f13, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, jhduphickx jhduphickxVar, vipkmwdibw.btonecajqb btonecajqbVar) {
        float fEablkybsjg = 0.0f;
        if (f13 > 0.0f) {
            fEablkybsjg = zg.gtknphoqwx.dxjokdxxww(((Number) btonecajqbVar.eablkybsjg()).floatValue(), f13);
        } else if (f13 < 0.0f) {
            fEablkybsjg = zg.gtknphoqwx.eablkybsjg(((Number) btonecajqbVar.eablkybsjg()).floatValue(), f13);
        }
        float f14 = fEablkybsjg - pkzmftpjixVar.f60030zdlpuopuiu;
        if (f14 != jhduphickxVar.wkgbmnqykc(f14) || fEablkybsjg != ((Number) btonecajqbVar.eablkybsjg()).floatValue()) {
            btonecajqbVar.iobyxmoadg();
        }
        pkzmftpjixVar.f60030zdlpuopuiu += f14;
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final boolean lqeggnwhkg(jhduphickx jhduphickxVar, int i13) {
        return i13 <= jhduphickxVar.zoijcleaow() && jhduphickxVar.nufgyqmvbu() <= i13;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ef A[Catch: nufgyqmvbu -> 0x01cf, TryCatch #5 {nufgyqmvbu -> 0x01cf, blocks: (B:34:0x00eb, B:36:0x00ef, B:38:0x00f5, B:51:0x0128, B:55:0x016a, B:59:0x0173), top: B:102:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01bc -> B:96:0x01be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object ppxfxbqfkf(androidx.compose.foundation.lazy.layout.jhduphickx r42, int r43, int r44, int r45, w0.wkgbmnqykc r46, lg.gxszxtbevo r47) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.jztzpxfvev.ppxfxbqfkf(androidx.compose.foundation.lazy.layout.jhduphickx, int, int, int, w0.wkgbmnqykc, lg.gxszxtbevo):java.lang.Object");
    }

    private static final boolean wkgbmnqykc(boolean z13, jhduphickx jhduphickxVar, int i13, int i14) {
        if (z13) {
            if (jhduphickxVar.nufgyqmvbu() <= i13 && (jhduphickxVar.nufgyqmvbu() != i13 || jhduphickxVar.lqeggnwhkg() <= i14)) {
                return false;
            }
        } else if (jhduphickxVar.nufgyqmvbu() >= i13 && (jhduphickxVar.nufgyqmvbu() != i13 || jhduphickxVar.lqeggnwhkg() >= i14)) {
            return false;
        }
        return true;
    }
}
