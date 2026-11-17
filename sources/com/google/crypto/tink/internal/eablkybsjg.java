package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import nb.esjtqupxsv;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends bb.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f23831iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f23832iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f23833zoijcleaow;

        static {
            int[] iArr = new int[esjtqupxsv.ppxfxbqfkf.values().length];
            f23833zoijcleaow = iArr;
            try {
                iArr[esjtqupxsv.ppxfxbqfkf.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23833zoijcleaow[esjtqupxsv.ppxfxbqfkf.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ylkuphrtab.values().length];
            f23832iobyxmoadg = iArr2;
            try {
                iArr2[ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23832iobyxmoadg[ylkuphrtab.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23832iobyxmoadg[ylkuphrtab.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23832iobyxmoadg[ylkuphrtab.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public eablkybsjg(ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        iobyxmoadg(ojitshcjhnVar, esjtqupxsvVar);
        this.f23831iobyxmoadg = ojitshcjhnVar;
    }

    private static void iobyxmoadg(ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f23833zoijcleaow[ojitshcjhnVar.wkgbmnqykc().ordinal()];
        if (i13 == 1 || i13 == 2) {
            bb.esjtqupxsv.zoijcleaow(esjtqupxsvVar);
        }
    }
}
